package com.example.mcp_server;

import java.util.List;

public record Destination(
        String id,
        String name,
        List<Entity> parks) {}