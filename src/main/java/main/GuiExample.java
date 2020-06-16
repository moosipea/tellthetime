package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;

public class GuiExample extends Gui {
	
	//String text = "HH:mm:ss";
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();
	String text = dtf.format(now).toString();
	
	public GuiExample(Minecraft mc) {
		//this code is very messy, if you're trying to understand this you're better off searching in someone elses project
		ScaledResolution scaled = new ScaledResolution(mc);
		//int width = scaled.getScaledWidth();
		int height = scaled.getScaledHeight();
		
		if (DtimeCommand.isGuiToggled == true) {
			drawCenteredString(mc.fontRendererObj, text, 23, (0 + height / 100), Integer.parseInt("FFFFFF", 16));
		} else {
			drawCenteredString(mc.fontRendererObj, "", 23, (0 + height / 100), Integer.parseInt("FFFFFF", 16));
		}
		
		
		
	}
}
