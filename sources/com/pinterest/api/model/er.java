package com.pinterest.api.model;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class er {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ er[] $VALUES;
    public static final er NONE = new er("NONE", 0);
    public static final er HIGHLIGHT = new er("HIGHLIGHT", 1);
    public static final er TRANSPARENT = new er("TRANSPARENT", 2);
    public static final er INVERTED = new er("INVERTED", 3);
    public static final er INVERTED_TRANSPARENT = new er("INVERTED_TRANSPARENT", 4);

    private static final /* synthetic */ er[] $values() {
        return new er[]{NONE, HIGHLIGHT, TRANSPARENT, INVERTED, INVERTED_TRANSPARENT};
    }

    static {
        er[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private er(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static er valueOf(String str) {
        return (er) Enum.valueOf(er.class, str);
    }

    public static er[] values() {
        return (er[]) $VALUES.clone();
    }
}
