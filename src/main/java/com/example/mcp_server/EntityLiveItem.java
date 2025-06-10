package com.example.mcp_server;

import java.util.List;
import java.util.Map;

public record EntityLiveItem(
        Map<String, Object> queue,
        List<ShowTime> showtimes) {}
