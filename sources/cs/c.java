package cs;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final b Companion;
    private final int value;
    public static final c HERO_AND_CHIPS = new c("HERO_AND_CHIPS", 0, 0);
    public static final c TWO_BY_TWO = new c("TWO_BY_TWO", 1, 1);
    public static final c TWO_BY_ONE = new c("TWO_BY_ONE", 2, 2);
    public static final c TWO_BY_THREE = new c("TWO_BY_THREE", 3, 3);

    private static final /* synthetic */ c[] $values() {
        return new c[]{HERO_AND_CHIPS, TWO_BY_TWO, TWO_BY_ONE, TWO_BY_THREE};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new b();
    }

    private c(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
