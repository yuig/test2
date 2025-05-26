package zl2;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class l {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l HIDDEN = new l("HIDDEN", 0);
    public static final l VISIBLE = new l("VISIBLE", 1);
    public static final l DEPRECATED_LIST_METHODS = new l("DEPRECATED_LIST_METHODS", 2);
    public static final l NOT_CONSIDERED = new l("NOT_CONSIDERED", 3);
    public static final l DROP = new l("DROP", 4);

    private static final /* synthetic */ l[] $values() {
        return new l[]{HIDDEN, VISIBLE, DEPRECATED_LIST_METHODS, NOT_CONSIDERED, DROP};
    }

    static {
        l[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private l(String str, int i13) {
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
