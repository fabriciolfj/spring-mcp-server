package com.example.mcp_server;

public record EntitySchedule(
        String id,
        String name,
        List<EntityScheduleItem> schedule) {}