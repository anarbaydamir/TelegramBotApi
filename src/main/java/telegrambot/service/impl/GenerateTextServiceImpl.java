package telegrambot.service.impl;

import telegrambot.service.inter.GenerateTextServiceInter;

import java.util.Random;

public class GenerateTextServiceImpl implements GenerateTextServiceInter {
    public String generateSadLink(){
        Random random = new Random();
        int randomValue = random.nextInt(10);

        switch (randomValue){
            case 1:
                return "https://www.youtube.com/watch?v=EgBJmlPo8Xw";
            case 2:
                return "https://www.youtube.com/watch?v=viimfQi_pUw";
            case 3:
                return "https://www.youtube.com/watch?v=HZgiAgYXneE";
            case 4:
                return "https://www.youtube.com/watch?v=yaJx0Gj_LCY";
            case 5:
                return "https://www.youtube.com/watch?v=Kr0vuvEyrtE";
            case 6:
                return "https://www.youtube.com/watch?v=Fvj6PE3gN4o";
            case 7:
                return "https://www.youtube.com/watch?v=GB_S2qFh5lU";
            case 8:
                return "https://www.youtube.com/watch?v=b6WNdcZpDhQ";
            case 9:
                return "https://www.youtube.com/watch?v=V1Pl8CzNzCw";
            case 10:
                return "https://www.youtube.com/watch?v=skHbZBsS7hM";
            default:
                return "https://www.youtube.com/watch?v=EgBJmlPo8Xw";
        }
    }
    public String generateHappyLink(){
        Random random = new Random();
        int randomValue = random.nextInt(10);

        switch (randomValue){
            case 1:
                return "https://www.youtube.com/watch?v=Ah0Ys50CqO8";
            case 2:
                return "https://www.youtube.com/watch?v=DyDfgMOUjCI";
            case 3:
                return "https://www.youtube.com/watch?v=HUHC9tYz8ik";
            case 4:
                return "https://www.youtube.com/watch?v=dVUmSgzgOqs";
            case 5:
                return "https://www.youtube.com/watch?v=gBRi6aZJGj4";
            case 6:
                return "https://www.youtube.com/watch?v=tGHTOVw6F4Q";
            case 7:
                return "https://www.youtube.com/watch?v=Q2WcdaF8uL8";
            case 8:
                return "https://www.youtube.com/watch?v=qpQSjf-0Lc8";
            case 9:
                return "https://www.youtube.com/watch?v=wnUJv5Ej39I";
            case 10:
                return "https://www.youtube.com/watch?v=-PZsSWwc9xA";
            default:
                return "https://www.youtube.com/watch?v=wnUJv5Ej39I";
        }
    }

    public String returnVideoLink(String type){
        switch (type) {
            case "/start":
                return "Hellooooo, If you want to know about me more just write /about";
            case "/about":
                return "Hello dear user, I am serving you to recommend Billie Eilish musics according to your mood \n " +
                        "You can control me by sending these commands: \n \n " +
                        "/sad - If you are sad just let me know by writing this command \n " +
                        "/happy - If you are happy just let me know by writing this command \n " +
                        "/favorite - If you want to know my favorite Billie music :) let me know by writing this command ";
            case "/sad":
                return "This music suits your situation \n " + generateSadLink();
            case "/happy":
                return "This music suits your situation \n " + generateHappyLink();
            case "/favorite":
                return "Best for me \n " + "https://www.youtube.com/watch?v=LZyybvVx-js";
            default:
                return "https://www.youtube.com/watch?v=-PZsSWwc9xA";
        }
    }
}
