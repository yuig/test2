package or1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @NotNull
    private final String logValue;
    public static final g PLATFORM_LOGOUT_ERROR = new g("PLATFORM_LOGOUT_ERROR", 0, "platform_logout_error");
    public static final g USER_LOGOUT_ERROR = new g("USER_LOGOUT_ERROR", 1, "user_logout_error");
    public static final g THIRD_PARTY_LOGOUT_ERROR = new g("THIRD_PARTY_LOGOUT_ERROR", 2, "third_party_logout_error");

    private static final /* synthetic */ g[] $values() {
        return new g[]{PLATFORM_LOGOUT_ERROR, USER_LOGOUT_ERROR, THIRD_PARTY_LOGOUT_ERROR};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private g(String str, int i13, String str2) {
        this.logValue = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    @NotNull
    public final String getLogValue() {
        return this.logValue;
    }
}
