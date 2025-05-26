package com.pinterest.api.model;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class wk {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ wk[] $VALUES;
    public static final wk Instant = new wk("Instant", 0);
    public static final wk FadeOut = new wk("FadeOut", 1);
    public static final wk SlideOutLeft = new wk("SlideOutLeft", 2);
    public static final wk SlideOutRight = new wk("SlideOutRight", 3);
    public static final wk SlideOutUp = new wk("SlideOutUp", 4);
    public static final wk SlideOutDown = new wk("SlideOutDown", 5);
    public static final wk ScaleOutUp = new wk("ScaleOutUp", 6);
    public static final wk ScaleOutDown = new wk("ScaleOutDown", 7);
    public static final wk Shrink = new wk("Shrink", 8);
    public static final wk Collapse = new wk("Collapse", 9);

    private static final /* synthetic */ wk[] $values() {
        return new wk[]{Instant, FadeOut, SlideOutLeft, SlideOutRight, SlideOutUp, SlideOutDown, ScaleOutUp, ScaleOutDown, Shrink, Collapse};
    }

    static {
        wk[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private wk(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static wk valueOf(String str) {
        return (wk) Enum.valueOf(wk.class, str);
    }

    public static wk[] values() {
        return (wk[]) $VALUES.clone();
    }
}
