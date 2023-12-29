package net.wrigglysplash.advancedadventuring.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.wrigglysplash.advancedadventuring.AdvancedAdventuring;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AdvancedAdventuring.MODID);

    public static final RegistryObject<CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register("advancedadventuring_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CACTUS_HELMET.get()))
                    .title(Component.translatable("creativetab.advancedadventuring_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        // Materials
                        pOutput.accept(ModItems.CACTUS_PLATE.get());

                        // Armor
                        pOutput.accept(ModItems.CACTUS_HELMET.get());
                        pOutput.accept(ModItems.CACTUS_CHESTPLATE.get());
                        pOutput.accept(ModItems.CACTUS_LEGGINGS.get());
                        pOutput.accept(ModItems.CACTUS_BOOTS.get());

                        // Tools


                        // Misc


                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
