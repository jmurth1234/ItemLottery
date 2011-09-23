/*
 * Lottery - by rymate
 * http://
 *
 * powered by Kickstarter
 */

package net.rymate.lottery;


import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;


public class Lottery extends JavaPlugin {
    private Logger log;
    private PluginDescriptionFile description;

    private String prefix;


    @Override
    public void onEnable() {
        log = Logger.getLogger("Minecraft");
        description = getDescription();
        prefix = "[" + description.getName() + "] ";

        log("loading " + description.getFullName());


        getCommand("/lottery").setExecutor(new LotteryCommand(this));
        getCommand("/reloadlottery").setExecutor(new LotteryReloadCommand(this));


    }

    @Override
    public void onDisable() {
        log("disabled " + description.getFullName());

    }

    public void log(String message) {
        log.info(prefix + message);
    }


}
