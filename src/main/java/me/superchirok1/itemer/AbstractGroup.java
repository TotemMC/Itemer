package me.superchirok1.itemer;

import org.jetbrains.annotations.NotNull;

public abstract class AbstractGroup<T, C> {

    protected final C storage;

    protected AbstractGroup(C box) {
        this.storage = box;
    }

    public abstract @NotNull AbstractGroup<T, C> remove(@NotNull T item);
    public abstract @NotNull AbstractGroup<T, C> clear();

}
