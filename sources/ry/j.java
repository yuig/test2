package ry;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    private final int value;
    public static final j STATE_INIT = new j("STATE_INIT", 0, -1);
    public static final j STATE_LOADING_STARTED = new j("STATE_LOADING_STARTED", 1, 0);
    public static final j STATE_LOADING_INDICATOR_SHOWING = new j("STATE_LOADING_INDICATOR_SHOWING", 2, 1);

    private static final /* synthetic */ j[] $values() {
        return new j[]{STATE_INIT, STATE_LOADING_STARTED, STATE_LOADING_INDICATOR_SHOWING};
    }

    static {
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private j(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
