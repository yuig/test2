package hn1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    private final int backgroundColorRes;
    public static final o NONE = new o("NONE", 0, eo1.a.sema_color_background_transparent);
    public static final o DEFAULT = new o("DEFAULT", 1, eo1.a.sema_color_background_wash_scrims_default);
    public static final o OPAQUE = new o("OPAQUE", 2, eo1.a.sema_color_background_wash_scrims_opaque);

    private static final /* synthetic */ o[] $values() {
        return new o[]{NONE, DEFAULT, OPAQUE};
    }

    static {
        o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private o(String str, int i13, int i14) {
        this.backgroundColorRes = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    public final int getBackgroundColorRes() {
        return this.backgroundColorRes;
    }
}
