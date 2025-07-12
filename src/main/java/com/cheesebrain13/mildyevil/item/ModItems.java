package com.cheesebrain13.mildyevil.item;

import com.cheesebrain13.mildyevil.MildlyEvil;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MildlyEvil.MOD_ID);

    public static final DeferredItem<Item> EVIL_INGOT = ITEMS.register("evil_ingot", ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
