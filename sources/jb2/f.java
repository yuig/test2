package jb2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f BODY_M = new f("BODY_M", 0, vn1.g.BODY_300);
    public static final f UI_S = new f("UI_S", 1, vn1.g.UI_200);

    @NotNull
    private final vn1.g value;

    private static final /* synthetic */ f[] $values() {
        return new f[]{BODY_M, UI_S};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private f(String str, int i13, vn1.g gVar) {
        this.value = gVar;
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
    public final vn1.g getValue() {
        return this.value;
    }
}
