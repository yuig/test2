package gp1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f CLOSE = new f("CLOSE", 0, "close");

    @NotNull
    private final String key;

    private static final /* synthetic */ f[] $values() {
        return new f[]{CLOSE};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private f(String str, int i13, String str2) {
        this.key = str2;
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

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
