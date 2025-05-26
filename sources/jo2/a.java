package jo2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FIRST = new a("FIRST", 0, "awaitFirst");
    public static final a FIRST_OR_DEFAULT = new a("FIRST_OR_DEFAULT", 1, "awaitFirstOrDefault");
    public static final a LAST = new a("LAST", 2, "awaitLast");
    public static final a SINGLE = new a("SINGLE", 3, "awaitSingle");

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final String f77217s;

    private static final /* synthetic */ a[] $values() {
        return new a[]{FIRST, FIRST_OR_DEFAULT, LAST, SINGLE};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, String str2) {
        this.f77217s = str2;
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

    @NotNull
    public final String getS() {
        return this.f77217s;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.f77217s;
    }
}
