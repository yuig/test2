package r72;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class h1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h1[] $VALUES;
    public static final h1 LINEAR = new h1("LINEAR", 0);
    public static final h1 SMOOTH = new h1("SMOOTH", 1);
    public static final h1 SPRING = new h1("SPRING", 2);
    public static final h1 BOUNCE = new h1("BOUNCE", 3);

    private static final /* synthetic */ h1[] $values() {
        return new h1[]{LINEAR, SMOOTH, SPRING, BOUNCE};
    }

    static {
        h1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private h1(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static h1 valueOf(String str) {
        return (h1) Enum.valueOf(h1.class, str);
    }

    public static h1[] values() {
        return (h1[]) $VALUES.clone();
    }
}
