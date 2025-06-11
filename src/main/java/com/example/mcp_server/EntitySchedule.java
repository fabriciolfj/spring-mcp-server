package com.example.mcp_server;

import java.util.List;

public record EntitySchedule(
        String id,
        String name,
        List<EntityScheduleItem> schedule) {}