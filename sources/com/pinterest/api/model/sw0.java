package com.pinterest.api.model;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class sw0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ sw0[] $VALUES;
    public static final sw0 Alpha = new sw0("Alpha", 0);
    public static final sw0 TranslationX = new sw0("TranslationX", 1);
    public static final sw0 TranslationY = new sw0("TranslationY", 2);
    public static final sw0 ScaleX = new sw0("ScaleX", 3);
    public static final sw0 ScaleY = new sw0("ScaleY", 4);

    private static final /* synthetic */ sw0[] $values() {
        return new sw0[]{Alpha, TranslationX, TranslationY, ScaleX, ScaleY};
    }

    static {
        sw0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private sw0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static sw0 valueOf(String str) {
        return (sw0) Enum.valueOf(sw0.class, str);
    }

    public static sw0[] values() {
        return (sw0[]) $VALUES.clone();
    }
}
