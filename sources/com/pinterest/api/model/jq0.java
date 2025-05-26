package com.pinterest.api.model;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class jq0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ jq0[] $VALUES;
    private final int type;
    public static final jq0 TOP = new jq0("TOP", 0, 0);
    public static final jq0 MIDDLE = new jq0("MIDDLE", 1, 1);
    public static final jq0 BOTTOM = new jq0("BOTTOM", 2, 2);

    private static final /* synthetic */ jq0[] $values() {
        return new jq0[]{TOP, MIDDLE, BOTTOM};
    }

    static {
        jq0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private jq0(String str, int i13, int i14) {
        this.type = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static jq0 valueOf(String str) {
        return (jq0) Enum.valueOf(jq0.class, str);
    }

    public static jq0[] values() {
        return (jq0[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
