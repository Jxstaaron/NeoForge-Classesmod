package net.jxstaaron.classaddmod.item;

import net.jxstaaron.classaddmod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.MyceliumBlock;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModToolTiers {
    public  static  final Tier BASIC_TIER = new SimpleTier(
            ModTags.INCORRECT_FOR_BASIC_TOOl,
            5000000,
            5f,
            1.5f,
            20,



            ()-> Ingredient.EMPTY
    );
}
