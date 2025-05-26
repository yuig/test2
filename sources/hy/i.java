package hy;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i STATE_INIT = new i("STATE_INIT", 0, -1);
    public static final i STATE_LOADING_STARTED = new i("STATE_LOADING_STARTED", 1, 0);
    public static final i STATE_SPINNER_SHOWING = new i("STATE_SPINNER_SHOWING", 2, 1);
    private final int value;

    private static final /* synthetic */ i[] $values() {
        return new i[]{STATE_INIT, STATE_LOADING_STARTED, STATE_SPINNER_SHOWING};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private i(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
