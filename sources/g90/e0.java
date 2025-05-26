package g90;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 RIGHT = new e0("RIGHT", 0);
    public static final e0 LEFT = new e0("LEFT", 1);

    private static final /* synthetic */ e0[] $values() {
        return new e0[]{RIGHT, LEFT};
    }

    static {
        e0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private e0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }
}
