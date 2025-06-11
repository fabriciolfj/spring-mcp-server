package com.example.mcp_server;

import java.util.List;

public record EntityLive(
        String id,
        String name,
        List<EntityLiveItem> liveData) {}