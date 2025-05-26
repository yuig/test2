package fm1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final int importantForAccessibility;
    public static final a AUTO = new a("AUTO", 0, 0);
    public static final a YES = new a("YES", 1, 1);
    public static final a NO = new a("NO", 2, 2);
    public static final a NO_HIDE_DESCENDANTS = new a("NO_HIDE_DESCENDANTS", 3, 4);

    private static final /* synthetic */ a[] $values() {
        return new a[]{AUTO, YES, NO, NO_HIDE_DESCENDANTS};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, int i14) {
        this.importantForAccessibility = i14;
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

    public final int getImportantForAccessibility() {
        return this.importantForAccessibility;
    }
}
