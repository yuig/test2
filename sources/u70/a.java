package u70;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a HOME = new a("HOME", 0);
    public static final a CREATE = new a("CREATE", 1);
    public static final a NOTIFICATIONS = new a("NOTIFICATIONS", 2);
    public static final a PROFILE = new a("PROFILE", 3);
    public static final a SEARCH = new a("SEARCH", 4);

    private static final /* synthetic */ a[] $values() {
        return new a[]{HOME, CREATE, NOTIFICATIONS, PROFILE, SEARCH};
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
