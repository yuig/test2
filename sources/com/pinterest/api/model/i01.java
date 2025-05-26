package com.pinterest.api.model;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i01 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i01[] $VALUES;
    public static final i01 NO_METADATA = new i01("NO_METADATA", 0);
    public static final i01 BAD_MEDIA = new i01("BAD_MEDIA", 1);
    public static final i01 FAILED_TO_LOAD_THUMBNAIL = new i01("FAILED_TO_LOAD_THUMBNAIL", 2);

    private static final /* synthetic */ i01[] $values() {
        return new i01[]{NO_METADATA, BAD_MEDIA, FAILED_TO_LOAD_THUMBNAIL};
    }

    static {
        i01[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private i01(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i01 valueOf(String str) {
        return (i01) Enum.valueOf(i01.class, str);
    }

    public static i01[] values() {
        return (i01[]) $VALUES.clone();
    }
}
