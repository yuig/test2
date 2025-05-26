package vn1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e REGULAR = new e("REGULAR", 0);
    public static final e ITALIC = new e("ITALIC", 1);
    public static final e UNDERLINED = new e("UNDERLINED", 2);
    public static final e BOLD = new e("BOLD", 3);

    private static final /* synthetic */ e[] $values() {
        return new e[]{REGULAR, ITALIC, UNDERLINED, BOLD};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
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
