package zf1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    /* renamed from: id, reason: collision with root package name */
    private int f141935id;
    public static final f REGULAR_ITALIC = new f("REGULAR_ITALIC", 0, 16);
    public static final f BOLD_ITALIC = new f("BOLD_ITALIC", 1, 19);

    private static final /* synthetic */ f[] $values() {
        return new f[]{REGULAR_ITALIC, BOLD_ITALIC};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private f(String str, int i13, int i14) {
        this.f141935id = i14;
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

    public final int getId() {
        return this.f141935id;
    }

    public final void setId(int i13) {
        this.f141935id = i13;
    }
}
