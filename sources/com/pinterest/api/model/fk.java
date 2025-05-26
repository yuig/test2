package com.pinterest.api.model;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class fk {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ fk[] $VALUES;
    public static final fk Instant = new fk("Instant", 0);
    public static final fk FadeIn = new fk("FadeIn", 1);
    public static final fk SlideInLeft = new fk("SlideInLeft", 2);
    public static final fk SlideInRight = new fk("SlideInRight", 3);
    public static final fk SlideInUp = new fk("SlideInUp", 4);
    public static final fk SlideInDown = new fk("SlideInDown", 5);
    public static final fk ScaleInUp = new fk("ScaleInUp", 6);
    public static final fk ScaleInDown = new fk("ScaleInDown", 7);
    public static final fk Spread = new fk("Spread", 8);
    public static final fk Expand = new fk("Expand", 9);

    private static final /* synthetic */ fk[] $values() {
        return new fk[]{Instant, FadeIn, SlideInLeft, SlideInRight, SlideInUp, SlideInDown, ScaleInUp, ScaleInDown, Spread, Expand};
    }

    static {
        fk[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private fk(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static fk valueOf(String str) {
        return (fk) Enum.valueOf(fk.class, str);
    }

    public static fk[] values() {
        return (fk[]) $VALUES.clone();
    }
}
