package pe1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class i {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i TRANSPARENT = new i("TRANSPARENT", 0);
    public static final i RESTORED = new i("RESTORED", 1);
    public static final i NONE = new i("NONE", 2);

    private static final /* synthetic */ i[] $values() {
        return new i[]{TRANSPARENT, RESTORED, NONE};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private i(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
