package tg.bot.tgbotwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TgBotWebAppApplication {

    private static final String BOT_TOKEN = "6037406641:AAFd3W4_W-4eWMpXYI8_CcLE3H22bJHBURA";

    public static void main(String[] args) {
        SpringApplication.run(TgBotWebAppApplication.class, args);


        TelegramBotApplication bot = TelegramBotApplication.builder()
                .botToken(BOT_TOKEN)
                .build();

        bot.run();
    }

}
