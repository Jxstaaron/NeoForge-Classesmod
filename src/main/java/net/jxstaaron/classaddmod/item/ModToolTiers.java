package net.jxstaaron.classaddmod.item;

import net.jxstaaron.classaddmod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public  static  final Tier BASIC_TIER = new SimpleTier(
            ModTags.INCORRECT_FOR_BASIC_TOOl,
            5000000,
            5f,
            0f,
            20,



            ()-> Ingredient.EMPTY
    );

}
