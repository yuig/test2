package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class r2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ r2[] $VALUES;

    @NotNull
    public static final p2 Companion;
    public static final r2 NONE = new r2("NONE", 0);
    public static final r2 LEFT = new r2("LEFT", 1);
    public static final r2 CENTER = new r2("CENTER", 2);

    private static final /* synthetic */ r2[] $values() {
        return new r2[]{NONE, LEFT, CENTER};
    }

    static {
        r2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new p2();
    }

    private r2(String str, int i13) {
    }

    public static final r2 findByValue(int i13) {
        Companion.getClass();
        return p2.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static r2 valueOf(String str) {
        return (r2) Enum.valueOf(r2.class, str);
    }

    public static r2[] values() {
        return (r2[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = q2.f140830a[ordinal()];
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
