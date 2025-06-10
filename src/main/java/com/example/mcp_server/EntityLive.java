package com.example.mcp_server;

public record EntityLive(
        String id,
        String name,
        List<EntityLiveItem> liveData) {}