package me.superchirok1.itemer;

import me.superchirok1.itemer.builder.ItemBuilder;
import me.superchirok1.itemer.editor.ItemEditor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public class Item {
    public static ItemBuilder builder(Material material) {
        return new ItemBuilder(material);
    }
    public static ItemEditor editor(ItemStack item) {
        return new ItemEditor(item);
    }
}
