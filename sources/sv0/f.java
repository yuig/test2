package sv0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    private final int sizeInMB;
    public static final f SMALL = new f("SMALL", 0, 5);
    public static final f MEDIUM = new f("MEDIUM", 1, 10);
    public static final f LARGE = new f("LARGE", 2, 25);
    public static final f EXTRA_LARGE = new f("EXTRA_LARGE", 3, 50);

    private static final /* synthetic */ f[] $values() {
        return new f[]{SMALL, MEDIUM, LARGE, EXTRA_LARGE};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private f(String str, int i13, int i14) {
        this.sizeInMB = i14;
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

    public final int getSizeInMB() {
        return this.sizeInMB;
    }
}
