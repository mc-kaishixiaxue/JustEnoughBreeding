package com.christofmeg.justenoughbreeding;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.HashMap;
import java.util.Map;

public class CommonConstants {

	public static final String MOD_ID = "justenoughbreeding";

	public static Map<String, ForgeConfigSpec.ConfigValue<String>> ingredientConfigs = new HashMap<>();
	public static Map<String, ForgeConfigSpec.ConfigValue<String>> spawnEggConfigs = new HashMap<>();
	public static Map<String, ForgeConfigSpec.ConfigValue<Integer>> ingredientAmountConfigs = new HashMap<>();
	public static Map<String, ForgeConfigSpec.ConfigValue<String>> eggResultConfigs = new HashMap<>();
	public static Map<String, ForgeConfigSpec.ConfigValue<Integer>> eggMinAmountConfigs = new HashMap<>();
	public static Map<String, ForgeConfigSpec.ConfigValue<Integer>> eggMaxAmountConfigs = new HashMap<>();

	public static Map<String, ForgeConfigSpec.ConfigValue<Integer>> breedingCooldown = new HashMap<>();

	public static Map<String, Boolean> animalTamedConfigs = new HashMap<>();
	public static Map<String, Boolean> animalTrustingConfigs = new HashMap<>();

	public static Map<String, ForgeConfigSpec.ConfigValue<String>> tamingIngredientConfigs = new HashMap<>();
	public static Map<String, ForgeConfigSpec.ConfigValue<Integer>> tamingChanceConfigs = new HashMap<>();
	public static Map<String, ForgeConfigSpec.ConfigValue<String>> temperIngredientConfigs = new HashMap<>();
	public static Map<String, ForgeConfigSpec.ConfigValue<String>> temperValueConfigs = new HashMap<>();
	public static Map<String, ForgeConfigSpec.ConfigValue<String>> trustingIngredientConfigs = new HashMap<>();
	public static Map<String, ForgeConfigSpec.ConfigValue<Integer>> trustingChanceConfigs = new HashMap<>();
}