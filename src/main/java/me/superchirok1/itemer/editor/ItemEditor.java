package me.superchirok1.itemer.editor;

import me.superchirok1.itemer.AbstractItemBuilder;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * A class for editing existing {@link ItemStack} objects using the Itemer ItemBuilder.
 *
 * @author SuperCHIROK1
 */
public class ItemEditor extends AbstractItemBuilder {

    /**
     * Creates an editor for an existing ItemStack.
     * <p>
     * <b>Note:</b> This modifies the original ItemStack. If you want to keep
     * the original item unchanged, use {@code Item.editor(item.clone())}.
     *
     * @param item the ItemStack to edit
     */
    public ItemEditor(@NotNull ItemStack item) {
        super(item);
    }
}