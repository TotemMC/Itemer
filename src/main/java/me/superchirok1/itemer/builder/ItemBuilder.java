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

    /**
     * Creates a builder from Material.
     * @param material item material
     */
    public ItemBuilder(@NotNull Material material) {
        super(new ItemStack(material));
    }

    /**
     * Creates a builder from Material with specific amount.
     * @param material item material
     * @param amount item amount
     */
    public ItemBuilder(@NotNull Material material, int amount) {
        super(new ItemStack(material, amount));
    }

    /**
     * Creates a builder from Material name.
     *
     * @param material material name (e.g. "DIAMOND_SWORD")
     * @throws IllegalArgumentException if material name is invalid
     */
    public ItemBuilder(@NotNull String material) {
        this(Material.valueOf(material.toUpperCase()));
    }

    /**
     * Creates a builder from Material name with specific amount.
     *
     * @param material material name
     * @param amount item amount
     * @throws IllegalArgumentException if material name is invalid
     */
    public ItemBuilder(@NotNull String material, int amount) {
        this(Material.valueOf(material.toUpperCase()), amount);
    }
}