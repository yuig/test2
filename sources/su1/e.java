package su1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    private final String source;
    public static final e NETWORK = new e("NETWORK", 0, "network");
    public static final e PUSH = new e("PUSH", 1, "push");
    public static final e LOCAL_CACHE = new e("LOCAL_CACHE", 2, "local_cache");

    private static final /* synthetic */ e[] $values() {
        return new e[]{NETWORK, PUSH, LOCAL_CACHE};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private e(String str, int i13, String str2) {
        this.source = str2;
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
    public final String getSource() {
        return this.source;
    }
}
