package ww;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;

    @NotNull
    public static final j Companion;
    private final int value;
    public static final k STATE_INITIAL = new k("STATE_INITIAL", 0, 0);
    public static final k STATE_IDLE = new k("STATE_IDLE", 1, 1);
    public static final k STATE_BUFFERING = new k("STATE_BUFFERING", 2, 2);
    public static final k STATE_READY = new k("STATE_READY", 3, 3);
    public static final k STATE_ENDED = new k("STATE_ENDED", 4, 4);

    private static final /* synthetic */ k[] $values() {
        return new k[]{STATE_INITIAL, STATE_IDLE, STATE_BUFFERING, STATE_READY, STATE_ENDED};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new j();
    }

    private k(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
