package com.leikooo.deepseeklangchain.config;

import com.leikooo.deepseeklangchain.assistant.WeatherAssistant;
import com.leikooo.deepseeklangchain.tool.LocationTools;
import com.leikooo.deepseeklangchain.tool.WeatherTools;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiServiceConfig {

    @Bean
    WeatherAssistant weatherAssistant(
            ChatModel chatModel,
            LocationTools locationTools,
            WeatherTools weatherTools) {
        return AiServices.builder(WeatherAssistant.class)
                .chatModel(chatModel)
                .tools(locationTools, weatherTools)
                .build();
    }
}
