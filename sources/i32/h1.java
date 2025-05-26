package i32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class h1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h1[] $VALUES;

    @NotNull
    public static final f1 Companion;
    public static final h1 SMALL = new h1("SMALL", 0);
    public static final h1 MEDIUM = new h1("MEDIUM", 1);
    public static final h1 LARGE = new h1("LARGE", 2);
    public static final h1 EXTRA_LARGE = new h1("EXTRA_LARGE", 3);

    private static final /* synthetic */ h1[] $values() {
        return new h1[]{SMALL, MEDIUM, LARGE, EXTRA_LARGE};
    }

    static {
        h1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new f1();
    }

    private h1(String str, int i13) {
    }

    public static final h1 findByValue(int i13) {
        Companion.getClass();
        return f1.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static h1 valueOf(String str) {
        return (h1) Enum.valueOf(h1.class, str);
    }

    public static h1[] values() {
        return (h1[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = g1.f71480a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        if (i13 == 3) {
            return 2;
        }
        if (i13 == 4) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }
}
