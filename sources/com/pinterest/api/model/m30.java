package com.pinterest.api.model;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m30 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ m30[] $VALUES;
    private final int value;
    public static final m30 VIDEO_PIN = new m30("VIDEO_PIN", 0, 0);
    public static final m30 VIDEO_STORY_PIN = new m30("VIDEO_STORY_PIN", 1, 1);
    public static final m30 OTHER_STORY_PIN = new m30("OTHER_STORY_PIN", 2, 2);
    public static final m30 CAROUSEL_PIN = new m30("CAROUSEL_PIN", 3, 3);
    public static final m30 OTHER_PIN = new m30("OTHER_PIN", 4, 4);

    private static final /* synthetic */ m30[] $values() {
        return new m30[]{VIDEO_PIN, VIDEO_STORY_PIN, OTHER_STORY_PIN, CAROUSEL_PIN, OTHER_PIN};
    }

    static {
        m30[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private m30(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static m30 valueOf(String str) {
        return (m30) Enum.valueOf(m30.class, str);
    }

    public static m30[] values() {
        return (m30[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
