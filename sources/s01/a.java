package s01;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a STRING = new a("STRING", 0);
    public static final a INT = new a("INT", 1);
    public static final a LONG = new a("LONG", 2);
    public static final a SHORT = new a("SHORT", 3);
    public static final a BOOLEAN = new a("BOOLEAN", 4);
    public static final a DOUBLE = new a("DOUBLE", 5);
    public static final a FLOAT = new a("FLOAT", 6);

    private static final /* synthetic */ a[] $values() {
        return new a[]{STRING, INT, LONG, SHORT, BOOLEAN, DOUBLE, FLOAT};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13) {
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
