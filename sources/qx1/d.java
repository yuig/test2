package qx1;

import h32.u0;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    private final u0 elementType;
    public static final d HOME_ANALYTICS = new d("HOME_ANALYTICS", 0, u0.ANALYTICS_OVERVIEW_TAB);
    public static final d AUDIENCE = new d("AUDIENCE", 1, u0.ANALYTICS_AUDIENCE_INSIGHTS_TAB);

    private static final /* synthetic */ d[] $values() {
        return new d[]{HOME_ANALYTICS, AUDIENCE};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13, u0 u0Var) {
        this.elementType = u0Var;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @NotNull
    public final u0 getElementType() {
        return this.elementType;
    }
}
