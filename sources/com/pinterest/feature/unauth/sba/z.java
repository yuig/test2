package com.pinterest.feature.unauth.sba;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class z {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    private final int type;
    public static final z SEARCH = new z("SEARCH", 0, 0);
    public static final z CURATED = new z("CURATED", 1, 1);
    public static final z HYBRID = new z("HYBRID", 2, 2);
    public static final z ARTICLE_SECTIONS = new z("ARTICLE_SECTIONS", 3, 3);
    public static final z VIDEO = new z("VIDEO", 4, 4);
    public static final z PIN = new z("PIN", 5, 5);
    public static final z STORY = new z("STORY", 6, 6);
    public static final z USER = new z("USER", 7, 7);
    public static final z CALL_TO_CREATE_FEED = new z("CALL_TO_CREATE_FEED", 8, 8);
    public static final z BOARD_SECTIONS = new z("BOARD_SECTIONS", 9, 9);

    private static final /* synthetic */ z[] $values() {
        return new z[]{SEARCH, CURATED, HYBRID, ARTICLE_SECTIONS, VIDEO, PIN, STORY, USER, CALL_TO_CREATE_FEED, BOARD_SECTIONS};
    }

    static {
        z[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private z(String str, int i13, int i14) {
        this.type = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
