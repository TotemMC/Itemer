package me.superchirok1.itemer;

import me.superchirok1.itemer.builder.ItemBuilder;
import me.superchirok1.itemer.editor.ItemEditor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public class Item {
    public static ItemBuilder builder(Material material) {
        return builder(material, 1);
    }
    public static ItemBuilder builder(Material material, int amount) {
        return new ItemBuilder(material, amount);
    }
    public static ItemBuilder builder(String material) {
        return builder(material, 1);
    }
    public static ItemBuilder builder(String material, int amount) {
        return new ItemBuilder(material, amount);
    }

    public static ItemEditor editor(ItemStack item) {
        return new ItemEditor(item);
    }
}
