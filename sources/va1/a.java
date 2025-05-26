package va1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FOUR_DIGITS = new a("FOUR_DIGITS", 0);
    public static final a CONFIRM_FOUR_DIGITS = new a("CONFIRM_FOUR_DIGITS", 1);
    public static final a EMAIL = new a("EMAIL", 2);
    public static final a CONFIRM_EMAIL = new a("CONFIRM_EMAIL", 3);
    public static final a DEFAULT = new a("DEFAULT", 4);

    private static final /* synthetic */ a[] $values() {
        return new a[]{FOUR_DIGITS, CONFIRM_FOUR_DIGITS, EMAIL, CONFIRM_EMAIL, DEFAULT};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
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
