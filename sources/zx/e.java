package zx;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    private final int description;

    @NotNull
    private final String requestParamName;
    public static final e ALL = new e("ALL", 0, "all", gy1.a.analytics_filter_allpins);
    public static final e IMAGE = new e("IMAGE", 1, "standard", gy1.a.analytics_filter_image_pins);
    public static final e VIDEO = new e("VIDEO", 2, "video", gy1.a.analytics_filter_video_pins);
    public static final e PRODUCT = new e("PRODUCT", 3, "product", gy1.a.analytics_filter_product_pins);

    private static final /* synthetic */ e[] $values() {
        return new e[]{ALL, IMAGE, VIDEO, PRODUCT};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private e(String str, int i13, String str2, int i14) {
        this.requestParamName = str2;
        this.description = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final int getDescription() {
        return this.description;
    }

    @NotNull
    public final String getRequestParamName() {
        return this.requestParamName;
    }
}
