package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o3 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ o3[] $VALUES;

    @NotNull
    public static final m3 Companion;
    public static final o3 NONE = new o3("NONE", 0);
    public static final o3 SESSION_START = new o3("SESSION_START", 1);
    public static final o3 SESSION_END = new o3("SESSION_END", 2);

    private static final /* synthetic */ o3[] $values() {
        return new o3[]{NONE, SESSION_START, SESSION_END};
    }

    static {
        o3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new m3();
    }

    private o3(String str, int i13) {
    }

    public static final o3 findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return NONE;
        }
        if (i13 == 1) {
            return SESSION_START;
        }
        if (i13 != 2) {
            return null;
        }
        return SESSION_END;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static o3 valueOf(String str) {
        return (o3) Enum.valueOf(o3.class, str);
    }

    public static o3[] values() {
        return (o3[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = n3.f67167a[ordinal()];
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
