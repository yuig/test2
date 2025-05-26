package en1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f0[] $VALUES;
    public static final f0 BODY_M = new f0("BODY_M", 0, vn1.g.BODY_300);
    public static final f0 UI_S = new f0("UI_S", 1, vn1.g.UI_200);

    @NotNull
    private final vn1.g value;

    private static final /* synthetic */ f0[] $values() {
        return new f0[]{BODY_M, UI_S};
    }

    static {
        f0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private f0(String str, int i13, vn1.g gVar) {
        this.value = gVar;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }

    @NotNull
    public final vn1.g getValue() {
        return this.value;
    }
}
