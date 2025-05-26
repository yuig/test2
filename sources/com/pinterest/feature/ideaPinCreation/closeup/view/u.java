package com.pinterest.feature.ideaPinCreation.closeup.view;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class u {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u PRODUCT_TITLE = new u("PRODUCT_TITLE", 0);
    public static final u PRODUCT_THUMBNAIL = new u("PRODUCT_THUMBNAIL", 1);
    public static final u BOARD_ONE_LINE = new u("BOARD_ONE_LINE", 2);
    public static final u BOARD_DEFAULT = new u("BOARD_DEFAULT", 3);

    private static final /* synthetic */ u[] $values() {
        return new u[]{PRODUCT_TITLE, PRODUCT_THUMBNAIL, BOARD_ONE_LINE, BOARD_DEFAULT};
    }

    static {
        u[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private u(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
