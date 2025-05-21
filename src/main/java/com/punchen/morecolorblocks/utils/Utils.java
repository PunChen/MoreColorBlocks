package dev.skydynamic.litematicaboxitempicker.utils;

import dev.skydynamic.litematicaboxitempicker.registries.ItemStackRegistry;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.collection.DefaultedList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;

public class Utils {
    public static final Logger LOGGER = LoggerFactory.getLogger(Reference.MOD_ID);

    public static final ItemStackRegistry REGISTRY = new ItemStackRegistry();
    public static DefaultedList<ItemStack> getStoredItemsWithoutOrder(ItemStack stackIn)
    {
        ContainerComponent container = stackIn.getComponents().get(DataComponentTypes.CONTAINER);
        if (container != null)
        {
            Iterator<ItemStack> iter = container.stream().iterator();
            DefaultedList<ItemStack> items = DefaultedList.ofSize((int) container.stream().count());
            while (iter.hasNext())
            {
                ItemStack stack = iter.next();
                if (stack.isEmpty()) {
                    stack = new ItemStack(Items.AIR);
                }
                items.add(stack);
            }
            return items;
        }
        return DefaultedList.of();
    }
}
