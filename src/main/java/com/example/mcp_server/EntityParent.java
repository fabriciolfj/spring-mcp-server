package com.example.mcp_server;

import java.util.List;

public record EntityParent(
        String id,
        String name,
        List<Entity> children) {}
