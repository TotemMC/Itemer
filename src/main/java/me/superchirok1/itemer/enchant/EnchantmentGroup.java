package me.superchirok1.itemer.enchant;

import org.bukkit.enchantments.Enchantment;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * A class that modifies an item with enchantments
 * @author SuperCHIROK1
 */
public class EnchantmentGroup {

    private final Map<Enchantment, Integer> enchantments = new HashMap<>();

    public static EnchantmentGroup create() {
        return new EnchantmentGroup();
    }

    /**
     * Adds an enchantment with a specific level to the group.
     *
     * @param enchantment the enchantment to add
     * @param level       the level of the enchantment
     */
    public @NotNull EnchantmentGroup addEnchantment(Enchantment enchantment, int level) {
        enchantments.put(enchantment, level);
        return this;
    }

    /**
     * Adds an enchantment with the default level (1) to the group.
     *
     * @param enchantment the enchantment to add
     */
    public @NotNull EnchantmentGroup addEnchantment(Enchantment enchantment) {
        return addEnchantment(enchantment, 1);
    }

    /**
     * Adds an enchantment with a specific level to the group.
     *
     * @param enchantment the enchantment to add
     * @param level       the level of the enchantment
     */
    public @NotNull EnchantmentGroup add(Enchantment enchantment, int level) {
        return addEnchantment(enchantment, level);
    }

    /**
     * Adds an enchantment with the default level (1) to the group.
     *
     * @param enchantment the enchantment to add
     */
    public @NotNull EnchantmentGroup add(Enchantment enchantment) {
        return addEnchantment(enchantment);
    }

    /**
     * Removes an enchantment from the group.
     *
     * @param enchantment the enchantment to remove
     */
    public @NotNull EnchantmentGroup removeEnchantment(Enchantment enchantment) {
        enchantments.remove(enchantment);
        return this;
    }

    /**
     * Removes an enchantment from the group.
     *
     * @param enchantment the enchantment to remove
     */
    public @NotNull EnchantmentGroup remove(Enchantment enchantment) {
        return removeEnchantment(enchantment);
    }

    /**
     * Gets the level of a specific enchantment.
     *
     * @param enchantment the enchantment to check
     * @return the level of the enchantment, or 0 if not present
     */
    public int getLevel(@NotNull Enchantment enchantment) {
        return enchantments.getOrDefault(enchantment, 0);
    }

    /**
     * Returns map containing all enchantments
     * @return a map containing all enchantments and their levels
     */
    public @NotNull Map<Enchantment, Integer> getEnchantmentsMap() {
        return Map.copyOf(enchantments);
    }

}
