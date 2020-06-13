package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class DtimeCommand extends CommandBase {

	@Override
	public String getCommandName() {
		// TODO Auto-generated method stub
		return "dtime";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return "use it";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) throws CommandException {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(EnumChatFormatting.RED + "yyyy/dd/MM HH:mm:ss");
		LocalDateTime now = LocalDateTime.now(); 
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "The current time is " + dtf.format(now)));
	}	
	
	@Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }
		
}
