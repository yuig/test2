package com.pinterest.api.model;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class rk0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ rk0[] $VALUES;
    private final int category;
    public static final rk0 COOK_TIME = new rk0("COOK_TIME", 0, 0);
    public static final rk0 SERVING_SIZE = new rk0("SERVING_SIZE", 1, 1);
    public static final rk0 DIFFICULTY = new rk0("DIFFICULTY", 2, 2);

    private static final /* synthetic */ rk0[] $values() {
        return new rk0[]{COOK_TIME, SERVING_SIZE, DIFFICULTY};
    }

    static {
        rk0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private rk0(String str, int i13, int i14) {
        this.category = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static rk0 valueOf(String str) {
        return (rk0) Enum.valueOf(rk0.class, str);
    }

    public static rk0[] values() {
        return (rk0[]) $VALUES.clone();
    }

    public final int getCategory() {
        return this.category;
    }
}
