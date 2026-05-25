package com.leikooo.deepseeklangchain;

import com.leikooo.deepseeklangchain.assistant.WeatherAssistant;
import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeepseekLangchainApplication implements CommandLineRunner {

    @Resource
    private WeatherAssistant weatherAssistant;

    public static void main(String[] args) {
        SpringApplication.run(DeepseekLangchainApplication.class, args);
    }

    @Override
    public void run(String... args) {
        String question = "我这儿的天气如何？";
        System.out.println("用户: " + question);
        String answer = weatherAssistant.chat(question);
        System.out.println("助手: " + answer);
    }
}
