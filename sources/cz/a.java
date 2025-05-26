package cz;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a EMPTY = new a("EMPTY", 0, 1);
    public static final a NOTEMPTY = new a("NOTEMPTY", 1, 2);
    public static final a EQUALS = new a("EQUALS", 2, 3);
    public static final a DOESNOTEQUAL = new a("DOESNOTEQUAL", 3, 4);
    public static final a CONTAINS = new a("CONTAINS", 4, 5);
    public static final a DOESNOTCONTAIN = new a("DOESNOTCONTAIN", 5, 6);
    public static final a ANYOF = new a("ANYOF", 6, 7);
    public static final a ALLOF = new a("ALLOF", 7, 8);
    public static final a COUNT = new a("COUNT", 8, 9);
    public static final a GREATERTHANCOUNT = new a("GREATERTHANCOUNT", 9, 10);
    public static final a LESSTHANCOUNT = new a("LESSTHANCOUNT", 10, 11);
    public static final a UNSUPPORTED = new a("UNSUPPORTED", 11, 12);

    private static final /* synthetic */ a[] $values() {
        return new a[]{EMPTY, NOTEMPTY, EQUALS, DOESNOTEQUAL, CONTAINS, DOESNOTCONTAIN, ANYOF, ALLOF, COUNT, GREATERTHANCOUNT, LESSTHANCOUNT, UNSUPPORTED};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, int i14) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
