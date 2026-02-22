package io.totemmc.itemer.flag;

import io.totemmc.itemer.AbstractGroup;
import org.bukkit.inventory.ItemFlag;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

/**
 * A class that modifies an item with flags.
 * @author SuperCHIROK1
 */
public class FlagGroup extends AbstractGroup<ItemFlag, Set<ItemFlag>> {

    public FlagGroup() {
        super(new HashSet<>());
    }

    public static @NotNull FlagGroup create() {
        return new FlagGroup();
    }

    /**
     * Adds a {@link ItemFlag} to the group.
     *
     * @param item the item flag to add
     */
    public @NotNull FlagGroup add(@NotNull ItemFlag item) {
        storage.add(item);
        return this;
    }

    /**
     * Adds a {@link ItemFlag} to the group.
     *
     * @param item the item flag to add
     */
    public @NotNull FlagGroup addFlag(@NotNull ItemFlag item) {
        return add(item);
    }

    /**
     * Removes a {@link ItemFlag} from the group.
     *
     * @param item the item flag to remove
     */
    @Override
    public @NotNull FlagGroup remove(@NotNull ItemFlag item) {
        storage.remove(item);
        return this;
    }

    /**
     * Removes a {@link ItemFlag} from the group.
     *
     * @param item the item flag to remove
     */

    public @NotNull FlagGroup removeFlag(@NotNull ItemFlag item) {
        return remove(item);
    }

    /**
     * Removes all flags from the group (clear group).
     */
    @Override
    public @NotNull FlagGroup clear() {
        storage.clear();
        return this;
    }

}
