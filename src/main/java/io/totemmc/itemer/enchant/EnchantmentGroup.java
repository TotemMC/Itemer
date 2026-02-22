package io.totemmc.itemer.enchant;

import io.totemmc.itemer.AbstractGroup;
import org.bukkit.enchantments.Enchantment;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * A class that modifies an item with enchantments
 * @author SuperCHIROK1
 */
public class EnchantmentGroup extends AbstractGroup<Enchantment, Map<Enchantment, Integer>> {

    public EnchantmentGroup() {
        super(new HashMap<>());
    }

    public static @NotNull EnchantmentGroup create() {
        return new EnchantmentGroup();
    }

    /**
     * Adds an enchantment with a specific level to the group.
     *
     * @param item the enchantment to add
     * @param level       the level of the enchantment
     */
    public @NotNull EnchantmentGroup add(@NotNull Enchantment item, @NotNull int level) {
        storage.put(item, level);
        return this;
    }

    /**
     * Adds an enchantment with the default level (1) to the group.
     *
     * @param item the enchantment to add
     */
    public @NotNull EnchantmentGroup add(@NotNull Enchantment item) {
        return add(item, 1);
    }

    /**
     * Adds an enchantment with a specific level to the group.
     *
     * @param item the enchantment to add
     * @param level       the level of the enchantment
     */
    public @NotNull EnchantmentGroup addEnchantment(@NotNull Enchantment item, int level) {
        return add(item, level);
    }

    /**
     * Adds an enchantment with the default level (1) to the group.
     *
     * @param item the enchantment to add
     */
    public @NotNull EnchantmentGroup addEnchantment(@NotNull Enchantment item) {
        return add(item, 1);
    }

    /**
     * Removes an enchantment from the group.
     *
     * @param item the enchantment to remove
     */
    @Override
    public @NotNull EnchantmentGroup remove(@NotNull Enchantment item) {
        storage.remove(item);
        return this;
    }

    /**
     * Removes an enchantment from the group.
     *
     * @param item the enchantment to remove
     */
    public @NotNull EnchantmentGroup removeEnchantment(@NotNull Enchantment item) {
        storage.remove(item);
        return this;
    }

    /**
     * Removes all enchantments from the group (clear group).
     */
    @Override
    public @NotNull EnchantmentGroup clear() {
        storage.clear();
        return this;
    }

}
