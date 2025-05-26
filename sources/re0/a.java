package re0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final int value;
    public static final a NONE = new a("NONE", 0, -1);
    public static final a XSMALL = new a("XSMALL", 1, 0);
    public static final a XSMALL_USE_LAYOUT_PARAMS = new a("XSMALL_USE_LAYOUT_PARAMS", 2, 1);
    public static final a SMALL = new a("SMALL", 3, 2);
    public static final a SMALL_USE_LAYOUT_PARAMS = new a("SMALL_USE_LAYOUT_PARAMS", 4, 3);
    public static final a MEDIUM = new a("MEDIUM", 5, 4);
    public static final a MEDIUM_USE_LAYOUT_PARAMS = new a("MEDIUM_USE_LAYOUT_PARAMS", 6, 5);
    public static final a LARGE = new a("LARGE", 7, 6);
    public static final a LARGE_USE_LAYOUT_PARAMS = new a("LARGE_USE_LAYOUT_PARAMS", 8, 7);
    public static final a XLARGE = new a("XLARGE", 9, 8);
    public static final a XLARGE_USE_LAYOUT_PARAMS = new a("XLARGE_USE_LAYOUT_PARAMS", 10, 9);
    public static final a XXLARGE = new a("XXLARGE", 11, 10);
    public static final a XXLARGE_USE_LAYOUT_PARAMS = new a("XXLARGE_USE_LAYOUT_PARAMS", 12, 11);
    public static final a XXXLARGE = new a("XXXLARGE", 13, 12);
    public static final a XXXLARGE_USE_LAYOUT_PARAMS = new a("XXXLARGE_USE_LAYOUT_PARAMS", 14, 13);
    public static final a PROPORTIONAL_USE_LAYOUT_PARAMS = new a("PROPORTIONAL_USE_LAYOUT_PARAMS", 15, 14);
    public static final a LEGO_GRID_ATTRIBUTION = new a("LEGO_GRID_ATTRIBUTION", 16, 15);
    public static final a LEGO_MEDIUM = new a("LEGO_MEDIUM", 17, 16);
    public static final a LEGO_DEFAULT = new a("LEGO_DEFAULT", 18, 17);

    private static final /* synthetic */ a[] $values() {
        return new a[]{NONE, XSMALL, XSMALL_USE_LAYOUT_PARAMS, SMALL, SMALL_USE_LAYOUT_PARAMS, MEDIUM, MEDIUM_USE_LAYOUT_PARAMS, LARGE, LARGE_USE_LAYOUT_PARAMS, XLARGE, XLARGE_USE_LAYOUT_PARAMS, XXLARGE, XXLARGE_USE_LAYOUT_PARAMS, XXXLARGE, XXXLARGE_USE_LAYOUT_PARAMS, PROPORTIONAL_USE_LAYOUT_PARAMS, LEGO_GRID_ATTRIBUTION, LEGO_MEDIUM, LEGO_DEFAULT};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, int i14) {
        this.value = i14;
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

    public final int getValue() {
        return this.value;
    }
}
