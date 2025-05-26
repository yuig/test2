package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class s0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ s0[] $VALUES;

    @NotNull
    public static final q0 Companion;
    public static final s0 NONE = new s0("NONE", 0);
    public static final s0 PIN = new s0("PIN", 1);
    public static final s0 CLOSEUP_MODULE = new s0("CLOSEUP_MODULE", 2);

    private static final /* synthetic */ s0[] $values() {
        return new s0[]{NONE, PIN, CLOSEUP_MODULE};
    }

    static {
        s0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new q0();
    }

    private s0(String str, int i13) {
    }

    public static final s0 findByValue(int i13) {
        Companion.getClass();
        return q0.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = r0.f140831a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        if (i13 == 3) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
