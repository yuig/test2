package c61;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class k implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26583a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26584b;

    /* renamed from: c, reason: collision with root package name */
    public final o82.a0 f26585c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26586d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26587e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f26588f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f26589g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26590h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f26591i;

    /* renamed from: j, reason: collision with root package name */
    public final zy.a0 f26592j;

    /* renamed from: k, reason: collision with root package name */
    public final zy.b f26593k;

    public k(boolean z13, boolean z14, o82.a0 multiSectionDisplayState, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z23, zy.a0 pinalyticsDisplayState, zy.b impressionDisplayState) {
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        Intrinsics.checkNotNullParameter(impressionDisplayState, "impressionDisplayState");
        this.f26583a = z13;
        this.f26584b = z14;
        this.f26585c = multiSectionDisplayState;
        this.f26586d = z15;
        this.f26587e = z16;
        this.f26588f = z17;
        this.f26589g = z18;
        this.f26590h = z19;
        this.f26591i = z23;
        this.f26592j = pinalyticsDisplayState;
        this.f26593k = impressionDisplayState;
    }

    public static k e(k kVar, boolean z13, o82.a0 a0Var, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, zy.a0 a0Var2, int i13) {
        boolean z19 = kVar.f26583a;
        boolean z23 = (i13 & 2) != 0 ? kVar.f26584b : z13;
        o82.a0 multiSectionDisplayState = (i13 & 4) != 0 ? kVar.f26585c : a0Var;
        boolean z24 = (i13 & 8) != 0 ? kVar.f26586d : z14;
        boolean z25 = (i13 & 16) != 0 ? kVar.f26587e : z15;
        boolean z26 = (i13 & 32) != 0 ? kVar.f26588f : z16;
        boolean z27 = kVar.f26589g;
        boolean z28 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? kVar.f26590h : z17;
        boolean z29 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? kVar.f26591i : z18;
        zy.a0 pinalyticsDisplayState = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? kVar.f26592j : a0Var2;
        zy.b impressionDisplayState = kVar.f26593k;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        Intrinsics.checkNotNullParameter(impressionDisplayState, "impressionDisplayState");
        return new k(z19, z23, multiSectionDisplayState, z24, z25, z26, z27, z28, z29, pinalyticsDisplayState, impressionDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f26583a == kVar.f26583a && this.f26584b == kVar.f26584b && Intrinsics.d(this.f26585c, kVar.f26585c) && this.f26586d == kVar.f26586d && this.f26587e == kVar.f26587e && this.f26588f == kVar.f26588f && this.f26589g == kVar.f26589g && this.f26590h == kVar.f26590h && this.f26591i == kVar.f26591i && Intrinsics.d(this.f26592j, kVar.f26592j) && Intrinsics.d(this.f26593k, kVar.f26593k);
    }

    public final int hashCode() {
        int hashCode = (this.f26592j.hashCode() + ep.b.e(this.f26591i, ep.b.e(this.f26590h, ep.b.e(this.f26589g, ep.b.e(this.f26588f, ep.b.e(this.f26587e, ep.b.e(this.f26586d, ep.b.c(this.f26585c.f93524a, ep.b.e(this.f26584b, Boolean.hashCode(this.f26583a) * 31, 31), 31), 31), 31), 31), 31), 31), 31)) * 31;
        this.f26593k.getClass();
        return hashCode + 172602875;
    }

    public final String toString() {
        return "SearchLandingDisplayState(searchBarTransparent=" + this.f26583a + ", updateToolbarForImmersiveHeader=" + this.f26584b + ", multiSectionDisplayState=" + this.f26585c + ", updateSearchBar=" + this.f26586d + ", isTransparent=" + this.f26587e + ", shouldAnimate=" + this.f26588f + ", showExperience=" + this.f26589g + ", resetSpotlightImpressionManager=" + this.f26590h + ", beginLoadingExperiences=" + this.f26591i + ", pinalyticsDisplayState=" + this.f26592j + ", impressionDisplayState=" + this.f26593k + ")";
    }
}
