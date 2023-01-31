package tg.bot.tgbotwebapp;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.WebAppInfo;
import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;
import com.pengrad.telegrambot.request.SendMessage;

public class TelegramBotApplication extends TelegramBot {

    @lombok.Builder
    public TelegramBotApplication(String botToken) {
        super(botToken);
    }

    public void run() {
        this.setUpdatesListener(updates -> {
            updates.forEach(this::process);

            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });

    }

    private void process(Update update) {
        Message message = update.message();
        WebAppInfo webAppInfo = new WebAppInfo("");

        InlineKeyboardMarkup inlineKeyboard = new InlineKeyboardMarkup()
                .addRow(new InlineKeyboardButton("WebApp").webApp(webAppInfo));

        SendMessage sendMessage = new SendMessage(message.chat().id(), "Тест webApp")
                .replyMarkup(inlineKeyboard);

        this.execute(sendMessage);
    }
}
