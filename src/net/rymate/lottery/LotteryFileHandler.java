package net.rymate.lottery;

import org.bukkit.util.config.Configuration;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: rymate
 * Date: 9/23/11
 * Time: 9:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class LotteryFileHandler {

    private Lottery plugin;
    private final Configuration c;
    private final File lotteryFile;

    public LotteryFileHandler(Lottery lottery) {
        this.plugin = lottery;
        this.lotteryFile = new File("plugins/BlockLottery/lottery.yml");
        this.c = new Configuration(lotteryFile);
    }

    public void loadConfig() {
        if (!lotteryFile.exists()) {
            plugin.log("Config wasn't found! Generating sample!");
            c.setProperty("lottery.sample.chance", "50");
            c.setProperty("lottery.sample.cost", "4:256, 1:256");
            c.setProperty("lottery.sample.prizes", "15:32, 1:10, 64:10");
        } else {
            //initiate standard loading
        }
        //stuff will go here :D
    }
}
