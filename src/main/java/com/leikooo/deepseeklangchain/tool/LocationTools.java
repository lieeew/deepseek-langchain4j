package com.leikooo.deepseeklangchain.tool;

import dev.langchain4j.agent.tool.Tool;
import org.springframework.stereotype.Component;

@Component
public class LocationTools {

    @Tool("获取用户当前所在的城市或地区，用于回答「这里」「我这儿」等位置相关问题")
    public String getCurrentLocation() {
        System.out.println("[工具调用] getCurrentLocation");
        return "杭州";
    }
}
