package me.superchirok1.itemer;

import me.superchirok1.itemer.enchant.EnchantmentGroup;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public abstract class AbstractItemBuilder implements BuildableItem {

    protected final ItemStack item;
    protected final ItemMeta meta;

    protected AbstractItemBuilder(@NotNull ItemStack item) {
        this.item = item;
        this.meta = item.getItemMeta();
    }

    @Override
    public @NotNull BuildableItem name(Component component) {
        meta.displayName(component);
        return this;
    }

    @Override
    public @NotNull BuildableItem name(String string) {
        meta.displayName(Component.text(string));
        return this;
    }

    @Override
    public @NotNull BuildableItem amount(int amount) {
        item.setAmount(amount);
        return this;
    }

    @Override
    public @NotNull BuildableItem lore(@NotNull Component... components) {
        meta.lore(Arrays.asList(components));
        return this;
    }

    @Override
    public @NotNull BuildableItem lore(@NotNull String... lines) {
        List<TextComponent> components = Arrays.stream(lines)
                .map(Component::text)
                .toList();

        meta.lore(components);
        return this;
    }

    @Override
    public @NotNull BuildableItem enchants(EnchantmentGroup... groups) {
        for (EnchantmentGroup group : groups) {
            if (group == null) continue;
            group.getEnchantmentsMap().forEach((enchantment, level) ->
                    meta.addEnchant(enchantment, level, true)
            );
        }

        return this;
    }


    @Override
    public @NotNull BuildableItem flags(ItemFlag... flags) {
        for (ItemFlag flag : flags) {
            meta.addItemFlags(flag);
        }
        return this;
    }

    @Override
    public @NotNull BuildableItem customModelData(int value) {
        meta.setCustomModelData(value);
        return this;
    }

    @Override
    public @NotNull BuildableItem unbreakable(boolean unbreakable) {
        meta.setUnbreakable(unbreakable);
        return this;
    }

    @Override
    public @NotNull BuildableItem modifyMeta(@NotNull java.util.function.Consumer<ItemMeta> consumer) {
        consumer.accept(meta);
        return this;
    }

    @Override
    public @NotNull ItemStack build() {
        item.setItemMeta(meta);
        return item;
    }

}
