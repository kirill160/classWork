package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class BotByKirill extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return  "simple";
    }

    @Override
    public String getBotToken() {
        return "5663600364:AAGlpkMKeCM7-4h07PbWaVQn3bTxqQTYoWU";
    }

    @Override
    public void onUpdateReceived(Update update) {


    }
}
