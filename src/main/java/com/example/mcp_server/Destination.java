package com.example.mcp_server;

public record Destination(
        String id,
        String name,
        List<Entity> parks) {}