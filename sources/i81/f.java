package i81;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f FLASHLIGHT_ORGANIC = new f("FLASHLIGHT_ORGANIC", 0);
    public static final f P2Z_ORGANIC = new f("P2Z_ORGANIC", 1);
    public static final f FLASHLIGHT_UNIFIED_FEED = new f("FLASHLIGHT_UNIFIED_FEED", 2);
    public static final f P2Z_UNIFIED_FEED = new f("P2Z_UNIFIED_FEED", 3);

    private static final /* synthetic */ f[] $values() {
        return new f[]{FLASHLIGHT_ORGANIC, P2Z_ORGANIC, FLASHLIGHT_UNIFIED_FEED, P2Z_UNIFIED_FEED};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private f(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
