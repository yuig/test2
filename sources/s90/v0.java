package s90;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class v0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ v0[] $VALUES;

    @NotNull
    public static final u0 Companion;
    private final int value;
    public static final v0 PinCloseup = new v0("PinCloseup", 0, 0);
    public static final v0 Composer = new v0("Composer", 1, 1);
    public static final v0 Effects = new v0("Effects", 2, 2);

    private static final /* synthetic */ v0[] $values() {
        return new v0[]{PinCloseup, Composer, Effects};
    }

    static {
        v0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new u0();
    }

    private v0(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
