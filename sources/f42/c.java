package f42;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c UNSET = new c("UNSET", 0);
    public static final c LIPCOLOR = new c("LIPCOLOR", 1);
    public static final c LIPLINER = new c("LIPLINER", 2);
    public static final c BROW = new c("BROW", 3);
    public static final c EYELINER = new c("EYELINER", 4);
    public static final c EYESHADOW = new c("EYESHADOW", 5);

    private static final /* synthetic */ c[] $values() {
        return new c[]{UNSET, LIPCOLOR, LIPLINER, BROW, EYELINER, EYESHADOW};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private c(String str, int i13) {
    }

    public static final c findByValue(int i13) {
        Companion.getClass();
        return a.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (b.f61073a[ordinal()]) {
            case 1:
                return -1;
            case 2:
                return 0;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 4;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
