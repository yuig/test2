package px;

import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f IMPRESSION;
    public static final f OUTBOUND_CLICK;
    public static final f PIN_CLICK;
    public static final f PRODUCT_TAG_CLICK;
    public static final f PRODUCT_TAG_IMPRESSION;
    public static final f PRODUCT_TAG_OUTBOUND_CLICK;
    public static final f PRODUCT_TAG_SAVE;
    public static final f PROFILE_VISIT;
    public static final f QUARTILE_95_PERCENT_VIEW;
    public static final f SAVE;
    public static final f USER_FOLLOW;
    public static final f VIDEO_10S_VIEW;
    public static final f VIDEO_AVG_WATCH_TIME;
    public static final f VIDEO_MRC_VIEW;
    public static final f VIDEO_V50_WATCH_TIME;
    private final boolean isProductTag;
    private final boolean isVideoMetric;

    private static final /* synthetic */ f[] $values() {
        return new f[]{IMPRESSION, PIN_CLICK, SAVE, OUTBOUND_CLICK, USER_FOLLOW, PROFILE_VISIT, VIDEO_MRC_VIEW, VIDEO_10S_VIEW, QUARTILE_95_PERCENT_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, PRODUCT_TAG_IMPRESSION, PRODUCT_TAG_SAVE, PRODUCT_TAG_CLICK, PRODUCT_TAG_OUTBOUND_CLICK};
    }

    static {
        boolean z13 = false;
        IMPRESSION = new f("IMPRESSION", 0, false, z13, 3, null);
        boolean z14 = false;
        boolean z15 = false;
        int i13 = 3;
        DefaultConstructorMarker defaultConstructorMarker = null;
        PIN_CLICK = new f("PIN_CLICK", 1, z14, z15, i13, defaultConstructorMarker);
        boolean z16 = false;
        int i14 = 3;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        SAVE = new f("SAVE", 2, z13, z16, i14, defaultConstructorMarker2);
        OUTBOUND_CLICK = new f("OUTBOUND_CLICK", 3, z14, z15, i13, defaultConstructorMarker);
        USER_FOLLOW = new f("USER_FOLLOW", 4, z13, z16, i14, defaultConstructorMarker2);
        PROFILE_VISIT = new f("PROFILE_VISIT", 5, z14, z15, i13, defaultConstructorMarker);
        boolean z17 = true;
        int i15 = 2;
        VIDEO_MRC_VIEW = new f("VIDEO_MRC_VIEW", 6, z17, z16, i15, defaultConstructorMarker2);
        boolean z18 = true;
        int i16 = 2;
        VIDEO_10S_VIEW = new f("VIDEO_10S_VIEW", 7, z18, z15, i16, defaultConstructorMarker);
        QUARTILE_95_PERCENT_VIEW = new f("QUARTILE_95_PERCENT_VIEW", 8, z17, z16, i15, defaultConstructorMarker2);
        VIDEO_AVG_WATCH_TIME = new f("VIDEO_AVG_WATCH_TIME", 9, z18, z15, i16, defaultConstructorMarker);
        VIDEO_V50_WATCH_TIME = new f("VIDEO_V50_WATCH_TIME", 10, z17, z16, i15, defaultConstructorMarker2);
        boolean z19 = false;
        boolean z23 = true;
        int i17 = 1;
        PRODUCT_TAG_IMPRESSION = new f("PRODUCT_TAG_IMPRESSION", 11, z19, z23, i17, defaultConstructorMarker);
        boolean z24 = false;
        boolean z25 = true;
        int i18 = 1;
        PRODUCT_TAG_SAVE = new f("PRODUCT_TAG_SAVE", 12, z24, z25, i18, defaultConstructorMarker2);
        PRODUCT_TAG_CLICK = new f("PRODUCT_TAG_CLICK", 13, z19, z23, i17, defaultConstructorMarker);
        PRODUCT_TAG_OUTBOUND_CLICK = new f("PRODUCT_TAG_OUTBOUND_CLICK", 14, z24, z25, i18, defaultConstructorMarker2);
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    public /* synthetic */ f(String str, int i13, boolean z13, boolean z14, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, (i14 & 1) != 0 ? false : z13, (i14 & 2) != 0 ? false : z14);
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

    public final boolean isProductTag() {
        return this.isProductTag;
    }

    public final boolean isVideoMetric() {
        return this.isVideoMetric;
    }

    private f(String str, int i13, boolean z13, boolean z14) {
        this.isVideoMetric = z13;
        this.isProductTag = z14;
    }
}
