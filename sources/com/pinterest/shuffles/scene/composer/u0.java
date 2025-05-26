package com.pinterest.shuffles.scene.composer;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class u0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ u0[] $VALUES;
    public static final u0 CENTER = new u0("CENTER", 0);
    public static final u0 CENTER_INSIDE = new u0("CENTER_INSIDE", 1);
    public static final u0 CENTER_INSIDE_NO_UPSCALE = new u0("CENTER_INSIDE_NO_UPSCALE", 2);

    private static final /* synthetic */ u0[] $values() {
        return new u0[]{CENTER, CENTER_INSIDE, CENTER_INSIDE_NO_UPSCALE};
    }

    static {
        u0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private u0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) $VALUES.clone();
    }
}
