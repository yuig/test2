package ot1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class t {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;

    @NotNull
    public static final s Companion;
    public static final t Component = new t("Component", 0);
    public static final t Pal = new t("Pal", 1);
    public static final t Ntsc = new t("Ntsc", 2);
    public static final t Secam = new t("Secam", 3);
    public static final t Mac = new t("Mac", 4);
    public static final t Unspecified = new t("Unspecified", 5);

    private static final /* synthetic */ t[] $values() {
        return new t[]{Component, Pal, Ntsc, Secam, Mac, Unspecified};
    }

    static {
        t[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new s();
    }

    private t(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
