package f01;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @NotNull
    private final String insightType;
    public static final a STYLE_SUMMARY = new a("STYLE_SUMMARY", 0, "style_summary");
    public static final a RELATED_STYLES = new a("RELATED_STYLES", 1, "related_styles");
    public static final a BRAND = new a("BRAND", 2, "brand");
    public static final a RELATED_PINS = new a("RELATED_PINS", 3, "related_pins");

    private static final /* synthetic */ a[] $values() {
        return new a[]{STYLE_SUMMARY, RELATED_STYLES, BRAND, RELATED_PINS};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, String str2) {
        this.insightType = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @NotNull
    public final String getInsightType() {
        return this.insightType;
    }
}
