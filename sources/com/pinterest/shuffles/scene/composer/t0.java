package com.pinterest.shuffles.scene.composer;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class t0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ t0[] $VALUES;
    public static final t0 TOP = new t0("TOP", 0);
    public static final t0 CENTER = new t0("CENTER", 1);
    public static final t0 BOTTOM = new t0("BOTTOM", 2);
    public static final t0 LEFT = new t0("LEFT", 3);
    public static final t0 RIGHT = new t0("RIGHT", 4);

    private static final /* synthetic */ t0[] $values() {
        return new t0[]{TOP, CENTER, BOTTOM, LEFT, RIGHT};
    }

    static {
        t0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private t0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) $VALUES.clone();
    }
}
