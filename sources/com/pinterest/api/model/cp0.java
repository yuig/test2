package com.pinterest.api.model;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class cp0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ cp0[] $VALUES;

    @NotNull
    public static final bp0 Companion;
    private final int type;
    public static final cp0 COVER = new cp0("COVER", 0, 0);
    public static final cp0 MEDIA = new cp0("MEDIA", 1, 1);
    public static final cp0 AD = new cp0("AD", 2, 2);
    public static final cp0 SPLIT = new cp0("SPLIT", 3, 3);
    public static final cp0 TEXT = new cp0("TEXT", 4, 4);
    public static final cp0 INGREDIENTS = new cp0("INGREDIENTS", 5, 5);
    public static final cp0 SUPPLIES = new cp0("SUPPLIES", 6, 6);
    public static final cp0 FULL_BLEED = new cp0("FULL_BLEED", 7, 7);

    private static final /* synthetic */ cp0[] $values() {
        return new cp0[]{COVER, MEDIA, AD, SPLIT, TEXT, INGREDIENTS, SUPPLIES, FULL_BLEED};
    }

    static {
        cp0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new bp0(null);
    }

    private cp0(String str, int i13, int i14) {
        this.type = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static cp0 valueOf(String str) {
        return (cp0) Enum.valueOf(cp0.class, str);
    }

    public static cp0[] values() {
        return (cp0[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isListType() {
        return this == INGREDIENTS || this == SUPPLIES;
    }
}
