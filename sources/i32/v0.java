package i32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class v0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ v0[] $VALUES;

    @NotNull
    public static final t0 Companion;
    public static final v0 STANDARD = new v0("STANDARD", 0);
    public static final v0 BANNER = new v0("BANNER", 1);

    private static final /* synthetic */ v0[] $values() {
        return new v0[]{STANDARD, BANNER};
    }

    static {
        v0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new t0();
    }

    private v0(String str, int i13) {
    }

    public static final v0 findByValue(int i13) {
        Companion.getClass();
        if (i13 == 1) {
            return STANDARD;
        }
        if (i13 != 2) {
            return null;
        }
        return BANNER;
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
        return value();
    }

    public final int value() {
        int i13 = u0.f71494a[ordinal()];
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
