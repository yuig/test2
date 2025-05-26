package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c2[] $VALUES;

    @NotNull
    public static final a2 Companion;
    public static final c2 NONE = new c2("NONE", 0);
    public static final c2 IMAGE_ONLY = new c2("IMAGE_ONLY", 1);
    public static final c2 SHOPPING_GRID = new c2("SHOPPING_GRID", 2);
    public static final c2 PIN_GRID = new c2("PIN_GRID", 3);
    public static final c2 AD_PIN = new c2("AD_PIN", 4);
    public static final c2 COMMENT_PIN = new c2("COMMENT_PIN", 5);

    private static final /* synthetic */ c2[] $values() {
        return new c2[]{NONE, IMAGE_ONLY, SHOPPING_GRID, PIN_GRID, AD_PIN, COMMENT_PIN};
    }

    static {
        c2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new a2();
    }

    private c2(String str, int i13) {
    }

    public static final c2 findByValue(int i13) {
        Companion.getClass();
        return a2.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c2 valueOf(String str) {
        return (c2) Enum.valueOf(c2.class, str);
    }

    public static c2[] values() {
        return (c2[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (b2.f140809a[ordinal()]) {
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
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
