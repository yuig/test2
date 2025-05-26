package qm2;

import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f FORCE_FLEXIBILITY = new f("FORCE_FLEXIBILITY", 0);
    public static final f NULLABLE = new f("NULLABLE", 1);
    public static final f NOT_NULL = new f("NOT_NULL", 2);

    private static final /* synthetic */ f[] $values() {
        return new f[]{FORCE_FLEXIBILITY, NULLABLE, NOT_NULL};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private f(String str, int i13) {
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
