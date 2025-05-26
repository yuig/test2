package com.pinterest.boardAutoCollages;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final b DownloadImage = new b("DownloadImage", 0, q0.board_auto_collages_sheet_item_download_image);
    private final int titleResId;

    private static final /* synthetic */ b[] $values() {
        return new b[]{DownloadImage};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new a();
    }

    private b(String str, int i13, int i14) {
        this.titleResId = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int getTitleResId() {
        return this.titleResId;
    }
}
