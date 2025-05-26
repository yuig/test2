package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a3 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a3[] $VALUES;

    @NotNull
    public static final y2 Companion;
    public static final a3 SINGLE_PREVIEW = new a3("SINGLE_PREVIEW", 0);
    public static final a3 DOUBLE_PREVIEW = new a3("DOUBLE_PREVIEW", 1);
    public static final a3 TRIPLE_PREVIEW = new a3("TRIPLE_PREVIEW", 2);
    public static final a3 LIST = new a3("LIST", 3);
    public static final a3 AVATAR = new a3("AVATAR", 4);
    public static final a3 DEFAULT = new a3("DEFAULT", 5);

    private static final /* synthetic */ a3[] $values() {
        return new a3[]{SINGLE_PREVIEW, DOUBLE_PREVIEW, TRIPLE_PREVIEW, LIST, AVATAR, DEFAULT};
    }

    static {
        a3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new y2();
    }

    private a3(String str, int i13) {
    }

    public static final a3 findByValue(int i13) {
        Companion.getClass();
        return y2.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a3 valueOf(String str) {
        return (a3) Enum.valueOf(a3.class, str);
    }

    public static a3[] values() {
        return (a3[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (z2.f140842a[ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
