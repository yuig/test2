package hf2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class q {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;

    @NotNull
    public static final p Companion;
    private final int value;
    public static final q AtMostOnce = new q("AtMostOnce", 0, 0);
    public static final q AtLeastOnce = new q("AtLeastOnce", 1, 1);
    public static final q ExactlyOnce = new q("ExactlyOnce", 2, 2);

    private static final /* synthetic */ q[] $values() {
        return new q[]{AtMostOnce, AtLeastOnce, ExactlyOnce};
    }

    static {
        q[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new p();
    }

    private q(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public static final q valueOf(int i13) {
        Companion.getClass();
        return (q) getEntries().get(i13);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }
}
