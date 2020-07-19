package telegrambot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import telegrambot.service.impl.GenerateTextServiceImpl;
import telegrambot.service.inter.GenerateTextServiceInter;

public class TelegramBot extends TelegramLongPollingBot {

    GenerateTextServiceInter generateTextServiceInter = new GenerateTextServiceImpl();

    public void sendMessage(Message message){
        SendMessage sendMessage = new SendMessage() // Create a SendMessage object with mandatory fields
                .enableMarkdown(true)
                .setReplyToMessageId(message.getMessageId())
                .setChatId(message.getChatId())
                .setText(generateTextServiceInter.returnVideoLink(message.getText()));
        try {
            execute(sendMessage); // Call method to send the message
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void onUpdateReceived(Update update) {
        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText() && update.getMessage().getText().startsWith("/")) {
            sendMessage(update.getMessage());
        }
    }

    public String getBotUsername() {
        return "BillieEilishMusicBot";
    }

    public String getBotToken() {
        return "1382268465:AAHJCIDM2aDYO5K2R3NhDLcg3UZn6T-qklM";
    }
}
