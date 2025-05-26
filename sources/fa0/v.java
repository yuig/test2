package fa0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class v {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    private final int labelResId;
    public static final v ViewProfile = new v("ViewProfile", 0, ea0.k.remix_collage_option_view_profile);
    public static final v ReportProfile = new v("ReportProfile", 1, ea0.k.remix_collage_option_report_profile);
    public static final v ReportPin = new v("ReportPin", 2, ea0.k.remix_collage_option_report_collage);
    public static final v Save = new v("Save", 3, ea0.k.remix_collage_option_save_collage);

    private static final /* synthetic */ v[] $values() {
        return new v[]{ViewProfile, ReportProfile, ReportPin, Save};
    }

    static {
        v[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private v(String str, int i13, int i14) {
        this.labelResId = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }

    public final int getLabelResId() {
        return this.labelResId;
    }
}
