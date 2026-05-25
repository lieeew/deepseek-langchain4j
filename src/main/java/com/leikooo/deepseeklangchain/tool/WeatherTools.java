package com.leikooo.deepseeklangchain.tool;

import dev.langchain4j.agent.tool.Tool;
import org.springframework.stereotype.Component;

@Component
public class WeatherTools {

    @Tool("根据城市名称查询该地的天气情况，需传入具体城市名")
    public String getWeather(String city) {
        System.out.println("[工具调用] getWeather, city=" + city);
        return switch (city) {
            case "杭州" -> "晴，气温 18~26℃，微风";
            case "北京" -> "多云，气温 12~22℃，北风 3 级";
            case "上海" -> "阴转小雨，气温 15~20℃，东南风 2 级";
            default -> city + "：晴，气温 20~28℃，适宜出行";
        };
    }
}
