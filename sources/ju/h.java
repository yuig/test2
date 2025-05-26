package ju;

import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h JANUARY = new h("JANUARY", 0);
    public static final h FEBRUARY = new h("FEBRUARY", 1);
    public static final h MARCH = new h("MARCH", 2);
    public static final h APRIL = new h("APRIL", 3);
    public static final h MAY = new h("MAY", 4);
    public static final h JUNE = new h("JUNE", 5);
    public static final h JULY = new h("JULY", 6);
    public static final h AUGUST = new h("AUGUST", 7);
    public static final h SEPTEMBER = new h("SEPTEMBER", 8);
    public static final h OCTOBER = new h("OCTOBER", 9);
    public static final h NOVEMBER = new h("NOVEMBER", 10);
    public static final h DECEMBER = new h("DECEMBER", 11);

    private static final /* synthetic */ h[] $values() {
        return new h[]{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private h(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final boolean has30DaysInIt() {
        return this == APRIL || this == JUNE || this == SEPTEMBER || this == NOVEMBER;
    }

    public final boolean has31DaysInIt() {
        return this == JANUARY || this == MARCH || this == MAY || this == JULY || this == AUGUST || this == OCTOBER || this == DECEMBER;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        String str = ok.i.UPPER_UNDERSCORE.to(ok.i.UPPER_CAMEL, super.toString());
        Intrinsics.checkNotNullExpressionValue(str, "to(...)");
        return str;
    }
}
