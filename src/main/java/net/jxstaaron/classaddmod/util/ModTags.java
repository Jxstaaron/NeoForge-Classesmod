package net.jxstaaron.classaddmod.util;

import net.jxstaaron.classaddmod.ClassAddMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static final TagKey<Block> NEEDS_BASIC_TOOL = TagKey.create(BuiltInRegistries.BLOCK.key(), ResourceLocation.fromNamespaceAndPath(ClassAddMod.MOD_ID, "needs_basic_tool"));
    public static final TagKey<Block> INCORRECT_FOR_BASIC_TOOl = TagKey.create(BuiltInRegistries.BLOCK.key(), ResourceLocation.fromNamespaceAndPath(ClassAddMod.MOD_ID, "incorrect_for_basic_tool"));
}
