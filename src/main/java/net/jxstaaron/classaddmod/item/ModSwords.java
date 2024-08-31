package net.jxstaaron.classaddmod.item;

import net.jxstaaron.classaddmod.ClassAddMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


import static net.jxstaaron.classaddmod.item.ModToolTiers.BASIC_TIER;

public class ModSwords {

    public static final DeferredRegister.Items WEAPONITEMS = DeferredRegister.createItems(ClassAddMod.MOD_ID);


    public static final Supplier<SwordItem> SHORT_DAGGER = WEAPONITEMS.register("short_dagger",
            () -> new SwordItem(BASIC_TIER, new Item.Properties().attributes(
                    SwordItem.createAttributes(
                            BASIC_TIER,
                            10,
                            10f
                    )
            )
            ));

    public static void register(IEventBus eventBus) {
        WEAPONITEMS.register(eventBus);
    }
}
