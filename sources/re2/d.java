package re2;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    public static final b Companion;
    public static final d BOOL = new d("BOOL", 0);
    public static final d BYTES = new d("BYTES", 1);
    public static final d I16 = new d("I16", 2);
    public static final d I32 = new d("I32", 3);
    public static final d I64 = new d("I64", 4);
    public static final d DOUBLE = new d("DOUBLE", 5);
    public static final d STRING = new d("STRING", 6);

    private static final /* synthetic */ d[] $values() {
        return new d[]{BOOL, BYTES, I16, I32, I64, DOUBLE, STRING};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new b();
    }

    private d(String str, int i13) {
    }

    public static final d findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 0:
                return BOOL;
            case 1:
                return BYTES;
            case 2:
                return I16;
            case 3:
                return I32;
            case 4:
                return I64;
            case 5:
                return DOUBLE;
            case 6:
                return STRING;
            default:
                return null;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (c.f107693a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
