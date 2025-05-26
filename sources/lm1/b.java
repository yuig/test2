package lm1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final int value;
    public static final b NONE = new b("NONE", 0, -1);
    public static final b NORMAL = new b("NORMAL", 1, 0);
    public static final b BOLD = new b("BOLD", 2, 1);
    public static final b NORMAL_ITALIC = new b("NORMAL_ITALIC", 3, 2);
    public static final b BOLD_ITALIC = new b("BOLD_ITALIC", 4, 3);

    private static final /* synthetic */ b[] $values() {
        return new b[]{NONE, NORMAL, BOLD, NORMAL_ITALIC, BOLD_ITALIC};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
