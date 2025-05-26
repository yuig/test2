package com.pinterest.api.model;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class aq0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ aq0[] $VALUES;

    @NotNull
    public static final zp0 Companion;
    private final int type;
    public static final aq0 LEFT = new aq0("LEFT", 0, 0);
    public static final aq0 CENTER = new aq0("CENTER", 1, 1);
    public static final aq0 RIGHT = new aq0("RIGHT", 2, 2);

    private static final /* synthetic */ aq0[] $values() {
        return new aq0[]{LEFT, CENTER, RIGHT};
    }

    static {
        aq0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new zp0(null);
    }

    private aq0(String str, int i13, int i14) {
        this.type = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static aq0 valueOf(String str) {
        return (aq0) Enum.valueOf(aq0.class, str);
    }

    public static aq0[] values() {
        return (aq0[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
