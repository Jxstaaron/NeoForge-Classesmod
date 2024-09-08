package net.jxstaaron.classaddmod.item;

import net.jxstaaron.classaddmod.ClassAddMod;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;

import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static net.jxstaaron.classaddmod.item.ModToolTiers.BASIC_TIER;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ClassAddMod.MOD_ID);

    public static final DeferredItem<Item> KYANOSIUM = ITEMS.register("mage_upgrade_stone",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ERYTHRIUM = ITEMS.register("knight_upgrade_stone",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CHLOROSIUM = ITEMS.register("ranger_upgrade_stone",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MELASIUM = ITEMS.register("assassin_upgrade_stone",
                    () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> XANTHOSIUM = ITEMS.register("healer_upgrade_stone",
                    () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NEKROSIUM = ITEMS.register("necromancer_upgrade_stone",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GLAUKOSIUM = ITEMS.register("tank_upgrade_stone",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ZOINOSIUM = ITEMS.register("tamer_upgrade_stone",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
