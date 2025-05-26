package fm1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final int textDirection;
    public static final b INHERIT = new b("INHERIT", 0, 0);
    public static final b FIRST_STRONG = new b("FIRST_STRONG", 1, 1);
    public static final b ANY_RTL = new b("ANY_RTL", 2, 2);
    public static final b LTR = new b("LTR", 3, 3);
    public static final b RTL = new b("RTL", 4, 4);
    public static final b LOCALE = new b("LOCALE", 5, 5);
    public static final b FIRST_STRONG_LTR = new b("FIRST_STRONG_LTR", 6, 6);
    public static final b FIRST_STRONG_RTL = new b("FIRST_STRONG_RTL", 7, 7);

    private static final /* synthetic */ b[] $values() {
        return new b[]{INHERIT, FIRST_STRONG, ANY_RTL, LTR, RTL, LOCALE, FIRST_STRONG_LTR, FIRST_STRONG_RTL};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, int i14) {
        this.textDirection = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int getTextDirection() {
        return this.textDirection;
    }
}
