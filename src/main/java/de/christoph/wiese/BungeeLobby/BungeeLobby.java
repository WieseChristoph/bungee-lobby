package de.christoph.wiese.BungeeLobby;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class BungeeLobby extends Plugin {
    @Override
    public void onEnable() {
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new LobbyCmd(this));
    }

    @Override
    public void onDisable() {
    }
}