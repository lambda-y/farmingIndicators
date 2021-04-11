package net.runelite.client.plugins.farmingIndicators;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;


//The config.java file (In this case, the farmingIndicatorsConfig.java)
//This file sets up the plugin options for runelite

@ConfigGroup("Farming Indicators")
public interface farmingIndicatorsConfig extends Config
{

	@ConfigItem(
			keyName = "greeting",
			name = "Welcome Greeting",
			description = "The message to show to the user when they login"
	)
	default String greeting()
	{
		return "Hello";
	}

	@ConfigItem(
		keyName = "allotments",
		name = "Show indicators for allotments",
		description = "Shows indicators for allotment patches"
	)
	default boolean allotments() { return true; }

	@ConfigItem(
			keyName = "herbs",
			name = "Show indicators for herbs",
			description = "Shows indicators for herb patches"
	)
	default boolean herbs() { return true; }

	@ConfigItem(
			keyName = "Trees",
			name = "Show indicators for Trees",
			description = "Shows indicators for tree patches"
	)
	default boolean Trees() { return true; }

	@ConfigItem(
			keyName = "Bushes",
			name = "Show indicators for Bushes",
			description = "Shows indicators for Bush patches"
	)
	default boolean Bushes() { return true; }
}
