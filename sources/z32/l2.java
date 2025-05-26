package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ l2[] $VALUES;

    @NotNull
    public static final j2 Companion;
    public static final l2 NONE = new l2("NONE", 0);
    public static final l2 MEDIUM = new l2("MEDIUM", 1);
    public static final l2 SMALL = new l2("SMALL", 2);

    private static final /* synthetic */ l2[] $values() {
        return new l2[]{NONE, MEDIUM, SMALL};
    }

    static {
        l2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new j2();
    }

    private l2(String str, int i13) {
    }

    public static final l2 findByValue(int i13) {
        Companion.getClass();
        return j2.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static l2 valueOf(String str) {
        return (l2) Enum.valueOf(l2.class, str);
    }

    public static l2[] values() {
        return (l2[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = k2.f140822a[ordinal()];
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
