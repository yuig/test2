package nt;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f2[] $VALUES;

    @NotNull
    private final yl1.g colorPalette;
    private final boolean isEnabled;
    public static final f2 EnabledState = new f2("EnabledState", 0, true, yl1.i.a());
    public static final f2 DisabledState = new f2("DisabledState", 1, false, yl1.i.b());

    private static final /* synthetic */ f2[] $values() {
        return new f2[]{EnabledState, DisabledState};
    }

    static {
        f2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private f2(String str, int i13, boolean z13, yl1.g gVar) {
        this.isEnabled = z13;
        this.colorPalette = gVar;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f2 valueOf(String str) {
        return (f2) Enum.valueOf(f2.class, str);
    }

    public static f2[] values() {
        return (f2[]) $VALUES.clone();
    }

    @NotNull
    public final yl1.g getColorPalette() {
        return this.colorPalette;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }
}
