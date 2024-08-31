package net.jxstaaron.classaddmod.item;


import net.jxstaaron.classaddmod.ClassAddMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ClassAddMod.MOD_ID);

    public static final Supplier<CreativeModeTab> MAGE_ITEMS_TAB = CREATIVE_MODE_TAB.register("mage_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KYANOSIUM.get()))
                    .title(Component.translatable("creativetab.classaddmod.mage_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.KYANOSIUM);
                    }).build());

    public static final Supplier<CreativeModeTab> KNIGHT_ITEMS_TAB = CREATIVE_MODE_TAB.register("knight_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ERYTHRIUM.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ClassAddMod.MOD_ID, "mage_items_tab"))
                    .title(Component.translatable("creativetab.classaddmod.knight_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ERYTHRIUM);
                        output.accept(ModSwords.SHORT_DAGGER.get());
                    }).build());

    public static final Supplier<CreativeModeTab> ARCHER_ITEMS_TAB = CREATIVE_MODE_TAB.register("archer_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHLOROSIUM.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ClassAddMod.MOD_ID, "knight_items_tab"))
                    .title(Component.translatable("creativetab.classaddmod.archer_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CHLOROSIUM);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
