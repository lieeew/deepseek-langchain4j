package com.leikooo.deepseeklangchain.assistant;

import dev.langchain4j.service.SystemMessage;

public interface WeatherAssistant {

    @SystemMessage("""
            你是天气助手。用户问「这里」「我这儿」的天气时，必须先调用 getCurrentLocation 获取位置，
            再调用 getWeather 查询该地天气，最后用自然语言汇总回答。不要编造未通过工具获得的数据。
            """)
    String chat(String userMessage);
}
