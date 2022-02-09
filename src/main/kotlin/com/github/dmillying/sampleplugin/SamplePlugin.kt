package com.github.dmillying.sampleplugin

import com.github.dmillying.sampleplugin.command.SampleCommand
import org.bukkit.plugin.java.JavaPlugin

class SamplePlugin: JavaPlugin() {
    companion object {
        lateinit var plugin: SamplePlugin
    }

    override fun onEnable() {
        logger.info("hello, world!")
        plugin = this

        SampleCommand.command()
    }
}