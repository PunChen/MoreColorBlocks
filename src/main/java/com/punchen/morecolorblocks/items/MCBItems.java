package com.punchen.morecolorblocks.items;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class MCBItems {
 
    private MCBItems() {}
 
    // 新物品的实例
    public static final Item CUSTOM_ITEM = register("custom_item", new Item(new Item.Settings()));
 
    public static <T extends Item> T register(String path, T item) {
        // 对于 1.21 之前的版本，请将 ''Identifier.of'' 替换为 ''new Identifier''
        return Registry.register(Registries.ITEM, Identifier.of("tutorial", path), item);
    }
 
    public static void initialize() {
    }
}