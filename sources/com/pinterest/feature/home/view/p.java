package com.pinterest.feature.home.view;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class p {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;

    @NotNull
    public static final o Companion;
    public static final p STORY_PIN = new p("STORY_PIN", 0);
    public static final p VIEW_ALL_BUTTON = new p("VIEW_ALL_BUTTON", 1);

    private static final /* synthetic */ p[] $values() {
        return new p[]{STORY_PIN, VIEW_ALL_BUTTON};
    }

    static {
        p[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new o();
    }

    private p(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
