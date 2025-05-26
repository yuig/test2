package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i1[] $VALUES;

    @NotNull
    public static final g1 Companion;
    public static final i1 REMOVED = new i1("REMOVED", 0);

    private static final /* synthetic */ i1[] $values() {
        return new i1[]{REMOVED};
    }

    static {
        i1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new g1();
    }

    private i1(String str, int i13) {
    }

    public static final i1 findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return REMOVED;
        }
        return null;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i1 valueOf(String str) {
        return (i1) Enum.valueOf(i1.class, str);
    }

    public static i1[] values() {
        return (i1[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        if (h1.f67048a[ordinal()] == 1) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
