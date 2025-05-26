package an0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @NotNull
    public static final e Companion;

    /* renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f15652id;
    public static final f BASIC = new f("BASIC", 0, "10000");
    public static final f VIDEO = new f("VIDEO", 1, "20000");

    private static final /* synthetic */ f[] $values() {
        return new f[]{BASIC, VIDEO};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new e();
    }

    private f(String str, int i13, String str2) {
        this.f15652id = str2;
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
    public final String getId() {
        return this.f15652id;
    }
}
