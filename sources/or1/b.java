package or1;

import com.pinterest.api.model.wy0;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;

    @NotNull
    private final String logValue;
    public static final b PERSONAL = new b("PERSONAL", 0, "personal");
    public static final b LINKED_BUSINESS = new b("LINKED_BUSINESS", 1, "linked_business");
    public static final b PARTNER = new b("PARTNER", 2, "partner");
    public static final b NO_ACCOUNT = new b("NO_ACCOUNT", 3, "unrecognized");

    private static final /* synthetic */ b[] $values() {
        return new b[]{PERSONAL, LINKED_BUSINESS, PARTNER, NO_ACCOUNT};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private b(String str, int i13, String str2) {
        this.logValue = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public static final b typeForUser(wy0 wy0Var) {
        Companion.getClass();
        return a.a(wy0Var);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @NotNull
    public final String getLogValue() {
        return this.logValue;
    }
}
