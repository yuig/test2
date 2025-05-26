package com.pinterest.api.model;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class go {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ go[] $VALUES;
    public static final go ARROW = new go("ARROW", 0);
    public static final go GLOW = new go("GLOW", 1);
    public static final go DOTTED = new go("DOTTED", 2);
    public static final go MARKER = new go("MARKER", 3);
    public static final go ERASER = new go("ERASER", 4);

    private static final /* synthetic */ go[] $values() {
        return new go[]{ARROW, GLOW, DOTTED, MARKER, ERASER};
    }

    static {
        go[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private go(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static go valueOf(String str) {
        return (go) Enum.valueOf(go.class, str);
    }

    public static go[] values() {
        return (go[]) $VALUES.clone();
    }
}
