package com.example.mcp_server;

public record EntityScheduleItem(
        String date,
        String type,
        String description,
        String openingTime,
        String closingTime) {}