package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class t1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ t1[] $VALUES;

    @NotNull
    public static final r1 Companion;
    public static final t1 OTHER = new t1("OTHER", 0);
    public static final t1 ANDROID = new t1("ANDROID", 1);

    private static final /* synthetic */ t1[] $values() {
        return new t1[]{OTHER, ANDROID};
    }

    static {
        t1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new r1();
    }

    private t1(String str, int i13) {
    }

    public static final t1 findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return OTHER;
        }
        if (i13 != 7) {
            return null;
        }
        return ANDROID;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static t1 valueOf(String str) {
        return (t1) Enum.valueOf(t1.class, str);
    }

    public static t1[] values() {
        return (t1[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = s1.f67231a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 7;
        }
        throw new NoWhenBranchMatchedException();
    }
}
