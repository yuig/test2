package ew;

import h32.a4;
import h32.d4;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class n {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;

    @NotNull
    private final a4 viewParam;

    @NotNull
    private final d4 viewType;
    public static final n HOME = new n("HOME", 0, d4.FEED, a4.FEED_HOME);
    public static final n SEARCH = new n("SEARCH", 1, d4.SEARCH, a4.SEARCH_PINS);
    public static final n RELATED = new n("RELATED", 2, d4.PIN, a4.PIN_OTHER);

    private static final /* synthetic */ n[] $values() {
        return new n[]{HOME, SEARCH, RELATED};
    }

    static {
        n[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private n(String str, int i13, d4 d4Var, a4 a4Var) {
        this.viewType = d4Var;
        this.viewParam = a4Var;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    @NotNull
    public final a4 getViewParam() {
        return this.viewParam;
    }

    @NotNull
    public final d4 getViewType() {
        return this.viewType;
    }
}
