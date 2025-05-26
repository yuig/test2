package h32;

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
    public static final x OTHER = new x("OTHER", 0);
    public static final x CHROME = new x("CHROME", 1);
    public static final x SAFARI = new x("SAFARI", 2);
    public static final x IE = new x("IE", 3);
    public static final x FIREFOX = new x("FIREFOX", 4);
    public static final x OPERA = new x("OPERA", 5);
    public static final x OPERA_BLINK = new x("OPERA_BLINK", 6);
    public static final x EDGE = new x("EDGE", 7);

    private static final /* synthetic */ x[] $values() {
        return new x[]{OTHER, CHROME, SAFARI, IE, FIREFOX, OPERA, OPERA_BLINK, EDGE};
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
        switch (i13) {
            case 0:
                return OTHER;
            case 1:
                return CHROME;
            case 2:
                return SAFARI;
            case 3:
                return IE;
            case 4:
                return FIREFOX;
            case 5:
                return OPERA;
            case 6:
                return OPERA_BLINK;
            case 7:
                return EDGE;
            default:
                return null;
        }
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
        switch (w.f67321a[ordinal()]) {
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
            case 8:
                return 7;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
