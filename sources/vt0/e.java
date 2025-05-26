package vt0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e LANDSCAPE = new e("LANDSCAPE", 0, "landscape");
    public static final e PORTRAIT = new e("PORTRAIT", 1, "portrait");

    @NotNull
    private final String text;

    private static final /* synthetic */ e[] $values() {
        return new e[]{LANDSCAPE, PORTRAIT};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private e(String str, int i13, String str2) {
        this.text = str2;
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

    @NotNull
    public final String getText() {
        return this.text;
    }
}
