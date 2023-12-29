package net.wrigglysplash.advancedadventuring.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wrigglysplash.advancedadventuring.AdvancedAdventuring;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AdvancedAdventuring.MODID);

// Tools

// Materials
    public static final RegistryObject<Item> CACTUS_PLATE = ITEMS.register("cactus_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOAT_FUR = ITEMS.register("goat_fur",
            () -> new Item(new Item.Properties()));

// Armor
    public static final RegistryObject<Item> CACTUS_HELMET = ITEMS.register("cactus_helmet",
            () -> new ArmorItem(ModArmorMaterials.CACTUS, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CACTUS_CHESTPLATE = ITEMS.register("cactus_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CACTUS, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CACTUS_LEGGINGS = ITEMS.register("cactus_leggings",
            () -> new ArmorItem(ModArmorMaterials.CACTUS, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CACTUS_BOOTS = ITEMS.register("cactus_boots",
            () -> new ArmorItem(ModArmorMaterials.CACTUS, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> FUR_HOOD = ITEMS.register("fur_hood",
            () -> new ArmorItem(ModArmorMaterials.FUR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> FUR_COAT = ITEMS.register("fur_coat",
            () -> new ArmorItem(ModArmorMaterials.FUR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> FUR_PANTS = ITEMS.register("fur_pants",
            () -> new ArmorItem(ModArmorMaterials.FUR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> FUR_BOOTS = ITEMS.register("fur_boots",
            () -> new ArmorItem(ModArmorMaterials.FUR, ArmorItem.Type.BOOTS, new Item.Properties()));

// Other

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
