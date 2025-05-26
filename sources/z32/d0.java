package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d0[] $VALUES;

    @NotNull
    public static final b0 Companion;
    public static final d0 NONE = new d0("NONE", 0);
    public static final d0 SMALL = new d0("SMALL", 1);

    private static final /* synthetic */ d0[] $values() {
        return new d0[]{NONE, SMALL};
    }

    static {
        d0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new b0();
    }

    private d0(String str, int i13) {
    }

    public static final d0 findByValue(int i13) {
        Companion.getClass();
        return b0.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = c0.f140810a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
