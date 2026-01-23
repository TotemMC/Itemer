package me.superchirok1.itemer.builder;

import me.superchirok1.itemer.AbstractItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * Item constructor class (item builder)
 * @author SuperCHIROK1
 */
public class ItemBuilder extends AbstractItemBuilder {
    public ItemBuilder(@NotNull Material material) {
        super(new ItemStack(material));
    }
}
