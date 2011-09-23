package net.rymate.lottery;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by IntelliJ IDEA.
 * User: rymate
 * Date: 9/23/11
 * Time: 9:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class LotteryCommand implements CommandExecutor {
    private Lottery plugin;

    public LotteryCommand(Lottery lottery) {
        this.plugin = lottery;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
