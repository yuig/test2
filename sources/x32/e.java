package x32;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    public static final c Companion;
    public static final e NONE = new e("NONE", 0);
    public static final e RATING = new e("RATING", 1);
    public static final e PRICE = new e("PRICE", 2);
    public static final e BADGE = new e("BADGE", 3);
    public static final e DELIVERY = new e("DELIVERY", 4);

    private static final /* synthetic */ e[] $values() {
        return new e[]{NONE, RATING, PRICE, BADGE, DELIVERY};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new c();
    }

    private e(String str, int i13) {
    }

    public static final e findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return NONE;
        }
        if (i13 == 1) {
            return RATING;
        }
        if (i13 == 2) {
            return PRICE;
        }
        if (i13 == 3) {
            return BADGE;
        }
        if (i13 != 4) {
            return null;
        }
        return DELIVERY;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = d.f131656a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        int i14 = 2;
        if (i13 == 2) {
            return 1;
        }
        if (i13 != 3) {
            i14 = 4;
            if (i13 == 4) {
                return 3;
            }
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i14;
    }
}
