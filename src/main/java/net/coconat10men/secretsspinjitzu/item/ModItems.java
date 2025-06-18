package net.coconat10men.secretsspinjitzu.item;

import net.coconat10men.secretsspinjitzu.SecretsSpinjitzu;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SecretsSpinjitzu.MOD_ID);

    public static final DeferredItem<Item> SCROLLOFSPINJITZU = ITEMS.register("scroll_of_spinjitzu",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SCROLLOFAIRJITZU = ITEMS.register("scroll_of_airjitzu",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
