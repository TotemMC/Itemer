package me.superchirok1.itemer;

import me.superchirok1.itemer.enchant.EnchantmentGroup;
import me.superchirok1.itemer.flag.FlagGroup;
import net.kyori.adventure.text.Component;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Consumer;

public interface BuildableItem {

    /**
     * Sets the display name of the item using Adventure Component.
     *
     * @param component the display name component
     */
    @NotNull BuildableItem name(Component component);

    /**
     * Sets the display name of the item using a simple String.
     *
     * @param string the display name string
     */
    @NotNull BuildableItem name(String string);

    /**
     * Sets the amount of items in the stack.
     *
     * @param amount the amount of items
     */
    @NotNull BuildableItem amount(int amount);

    /**
     * Sets the lore of the item using Adventure Components.
     *
     * @param components the components to use as lore
     */
    @NotNull BuildableItem lore(@NotNull Component... components);

    /**
     * Sets the lore of the item using Strings.
     *
     * @param lines the lines of text to use as lore
     */
    @NotNull BuildableItem lore(@NotNull String... lines);

    /**
     * Sets the lore of the item using Adventure Components.
     *
     * @param components the components to use as lore
     */
    @NotNull BuildableItem lore(@NotNull List<Component> components);

    /**
     * Adds enchantments to the item.
     *
     * @param groups the enchantments group
     */
    @NotNull BuildableItem enchants(EnchantmentGroup... groups);

    /**
     * Adds item flags to the item.
     *
     * @param flags the flags to add
     */
    @NotNull BuildableItem flags(ItemFlag... flags);

    /**
     * Adds item flags to the item.
     *
     * @param flags the flag group to add
     */
    @NotNull BuildableItem flags(FlagGroup... flags);

    /**
     * Adds item flags to the item.
     *
     * @param flags the flags to add
     */
    @NotNull BuildableItem flags(String... flags);

    /**
     * Sets the custom model data of the item.
     *
     * @param value the custom model data value
     */
    @NotNull BuildableItem customModelData(int value);

    /**
     * Sets whether the item should be unbreakable.
     *
     * @param unbreakable true if the item should be unbreakable
     */
    @NotNull BuildableItem unbreakable(boolean unbreakable);

    /**
     * Provides direct access to the ItemMeta for manual modifications.
     * Use this for features not yet covered by the builder API.
     *
     * @param consumer a function to apply to the ItemMeta
     */
    @NotNull BuildableItem modifyMeta(@NotNull Consumer<ItemMeta> consumer);

    /**
     * Constructs the final {@link ItemStack}.
     *
     * @return the constructed ItemStack
     */
    @NotNull ItemStack build();

    /**
     * An alias for {@link #build()}.
     *
     * @return the constructed ItemStack
     */
    @NotNull default ItemStack getItemStack() { return build(); }

    /**
     * An alias for {@link #build()}.
     *
     * @return the constructed ItemStack
     */
    @NotNull default ItemStack toItem() { return build(); }

}
