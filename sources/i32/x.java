package i32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class x {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;

    @NotNull
    public static final v Companion;
    public static final x IMAGE = new x("IMAGE", 0);
    public static final x VIDEO = new x("VIDEO", 1);

    private static final /* synthetic */ x[] $values() {
        return new x[]{IMAGE, VIDEO};
    }

    static {
        x[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new v();
    }

    private x(String str, int i13) {
    }

    public static final x findByValue(int i13) {
        Companion.getClass();
        if (i13 == 1) {
            return IMAGE;
        }
        if (i13 != 2) {
            return null;
        }
        return VIDEO;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = w.f71496a[ordinal()];
        int i14 = 1;
        if (i13 != 1) {
            i14 = 2;
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i14;
    }
}
