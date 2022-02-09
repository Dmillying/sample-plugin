package com.github.dmillying.sampleplugin.command

import com.github.dmillying.sampleplugin.SamplePlugin
import io.github.monun.kommand.kommand

object SampleCommand {
    val plugin: SamplePlugin = SamplePlugin.plugin

    fun command() {
        plugin.kommand {
            register("sample") {
                executes {
                    player.sendMessage("hello, world")
                }
                then("hello") {
                    executes {
                        player.sendMessage("world!")
                    }
                }
            }
        }
    }
}