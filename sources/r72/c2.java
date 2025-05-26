package r72;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c2 implements e2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c2[] $VALUES;
    public static final c2 Parallax = new c2("Parallax", 0);
    public static final c2 TimeLapse = new c2("TimeLapse", 1);

    private static final /* synthetic */ c2[] $values() {
        return new c2[]{Parallax, TimeLapse};
    }

    static {
        c2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private c2(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c2 valueOf(String str) {
        return (c2) Enum.valueOf(c2.class, str);
    }

    public static c2[] values() {
        return (c2[]) $VALUES.clone();
    }
}
