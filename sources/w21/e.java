package w21;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e PreInitial = new e("PreInitial", 0);
    public static final e Initial = new e("Initial", 1);
    public static final e Expanded = new e("Expanded", 2);
    public static final e Final = new e("Final", 3);
    public static final e Expired = new e("Expired", 4);

    private static final /* synthetic */ e[] $values() {
        return new e[]{PreInitial, Initial, Expanded, Final, Expired};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private e(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
