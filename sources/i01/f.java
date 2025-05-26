package i01;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f Unknown = new f("Unknown", 0);
    public static final f FullscreenCloseup = new f("FullscreenCloseup", 1);
    public static final f Mixed = new f("Mixed", 2);
    public static final f FullscreenRelatedPins = new f("FullscreenRelatedPins", 3);

    private static final /* synthetic */ f[] $values() {
        return new f[]{Unknown, FullscreenCloseup, Mixed, FullscreenRelatedPins};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
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
