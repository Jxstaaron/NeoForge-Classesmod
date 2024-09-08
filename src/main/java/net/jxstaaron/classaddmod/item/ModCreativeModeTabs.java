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

    public static final Supplier<CreativeModeTab> ASSASSIN_ITEMS_TAB = CREATIVE_MODE_TAB.register("assassin_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MELASIUM.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ClassAddMod.MOD_ID, "archer_items_tab"))
                    .title(Component.translatable("creativetab.classaddmod.assassin_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MELASIUM);
                    }).build());

    public static final Supplier<CreativeModeTab> HEALER_ITEMS_TAB = CREATIVE_MODE_TAB.register("healer_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.XANTHOSIUM.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ClassAddMod.MOD_ID, "assassin_items_tab"))
                    .title(Component.translatable("creativetab.classaddmod.healer_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.XANTHOSIUM);
                    }).build());

    public static final Supplier<CreativeModeTab> NECROMANCER_ITEMS_TAB = CREATIVE_MODE_TAB.register("necromancer_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NEKROSIUM.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ClassAddMod.MOD_ID, "healer_items_tab"))
                    .title(Component.translatable("creativetab.classaddmod.necromancer_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.NEKROSIUM);
                    }).build());

    public static final Supplier<CreativeModeTab> TANK_ITEMS_TAB = CREATIVE_MODE_TAB.register("tank_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GLAUKOSIUM.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ClassAddMod.MOD_ID, "necromancer_items_tab"))
                    .title(Component.translatable("creativetab.classaddmod.tank_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.GLAUKOSIUM);
                        output.accept(ModSwords.TANK_HAMMER.get());
                    }).build());

    public static final Supplier<CreativeModeTab> TAMER_ITEMS_TAB = CREATIVE_MODE_TAB.register("tamer_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ZOINOSIUM.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ClassAddMod.MOD_ID, "tank_items_tab"))
                    .title(Component.translatable("creativetab.classaddmod.tamer_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ZOINOSIUM);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
