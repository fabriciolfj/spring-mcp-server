package com.example.mcp_server;

import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class McpServerConfig {

    @Bean
    public List<ToolCallback> toolCallbacks(final ThemeParkApiTools tpTools) {
        return List.of(ToolCallbacks.from(tpTools));
    }
}
