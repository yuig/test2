package pm2;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class s {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s SOURCE = new s("SOURCE", 0);
    public static final s BINARY = new s("BINARY", 1);

    private static final /* synthetic */ s[] $values() {
        return new s[]{SOURCE, BINARY};
    }

    static {
        s[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private s(String str, int i13) {
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
