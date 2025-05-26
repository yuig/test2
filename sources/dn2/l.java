package dn2;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l COMMON_SUPER_TYPE = new l("COMMON_SUPER_TYPE", 0);
    public static final l INTERSECTION_TYPE = new l("INTERSECTION_TYPE", 1);

    private static final /* synthetic */ l[] $values() {
        return new l[]{COMMON_SUPER_TYPE, INTERSECTION_TYPE};
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
