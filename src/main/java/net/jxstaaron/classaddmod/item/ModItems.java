package net.jxstaaron.classaddmod.item;

import net.jxstaaron.classaddmod.ClassAddMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TieredItem;
import net.neoforged.bus.api.IEventBus;

import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static net.jxstaaron.classaddmod.item.ModToolTiers.BASIC_TIER;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ClassAddMod.MOD_ID);

    public static final DeferredItem<Item> KYANOSIUM = ITEMS.register("kyanosium",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ERYTHRIUM = ITEMS.register("erythrium",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CHLOROSIUM = ITEMS.register("chlorosium",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
