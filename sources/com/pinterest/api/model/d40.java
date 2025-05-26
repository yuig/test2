package com.pinterest.api.model;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d40 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d40[] $VALUES;
    public static final d40 NOT_HIDDEN = new d40("NOT_HIDDEN", 0);
    public static final d40 PARTIAL_HIDDEN = new d40("PARTIAL_HIDDEN", 1);
    public static final d40 COMPLETE_HIDDEN = new d40("COMPLETE_HIDDEN", 2);
    public static final d40 TRANSITION = new d40("TRANSITION", 3);

    private static final /* synthetic */ d40[] $values() {
        return new d40[]{NOT_HIDDEN, PARTIAL_HIDDEN, COMPLETE_HIDDEN, TRANSITION};
    }

    static {
        d40[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private d40(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d40 valueOf(String str) {
        return (d40) Enum.valueOf(d40.class, str);
    }

    public static d40[] values() {
        return (d40[]) $VALUES.clone();
    }
}
