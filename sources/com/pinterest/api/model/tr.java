package com.pinterest.api.model;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class tr {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ tr[] $VALUES;

    @NotNull
    private final String value;
    public static final tr SIZE236x = new tr("SIZE236x", 0, "236x");
    public static final tr SIZE140x140 = new tr("SIZE140x140", 1, "140x140");
    public static final tr SIZE150x150 = new tr("SIZE150x150", 2, "150x150");

    private static final /* synthetic */ tr[] $values() {
        return new tr[]{SIZE236x, SIZE140x140, SIZE150x150};
    }

    static {
        tr[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private tr(String str, int i13, String str2) {
        this.value = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static tr valueOf(String str) {
        return (tr) Enum.valueOf(tr.class, str);
    }

    public static tr[] values() {
        return (tr[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
