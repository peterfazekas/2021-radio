package hu.radio;

import hu.radio.controller.MessageService;
import hu.radio.domain.service.*;

import java.util.Scanner;

public class App {

    private final MessageService messageService;

    private App() {
        DataApi dataApi = new DataApi(new FileReader(), new DataParser());
        messageService = new MessageService(dataApi.getData("veetel.txt"));
    }

    public static void main(String[] args) {
        new App().run();
    }

    private void run() {
        System.out.println("2. feladat:");
        System.out.println("Az első üzenet rögzítője: "
                + messageService.getFirstMessageReceiverId());
        System.out.println("Az utolsó üzenet rögzítője: "
                + messageService.getLastMessageReceiverId());
        System.out.println("3. feladat:");
        System.out.println(messageService.getDayAndReceiverIdByContent("farkas"));
        System.out.println("4. feladat:");
        System.out.println(messageService.getDailyStatistic());
        System.out.println(messageService.getMergedMessages());
    }
}
