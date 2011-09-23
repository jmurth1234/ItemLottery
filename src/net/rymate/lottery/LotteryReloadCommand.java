package net.rymate.lottery;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by IntelliJ IDEA.
 * User: rymate
 * Date: 9/23/11
 * Time: 9:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class LotteryReloadCommand implements CommandExecutor {
    public LotteryReloadCommand(Lottery lottery) {
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
