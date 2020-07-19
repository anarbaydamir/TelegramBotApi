package telegrambot.service.inter;

public interface GenerateTextServiceInter {
    String generateSadLink();
    String generateHappyLink();
    String returnVideoLink(String type);
}
