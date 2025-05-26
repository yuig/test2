package mi0;

import bb2.e;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ep.b;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f87197a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f87198b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f87199c;

    /* renamed from: d, reason: collision with root package name */
    public final String f87200d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f87201e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f87202f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f87203g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f87204h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f87205i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f87206j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f87207k;

    /* renamed from: l, reason: collision with root package name */
    public final e f87208l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f87209m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f87210n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f87211o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f87212p;

    public a(int i13, boolean z13, String str, Boolean bool, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, e eVar, boolean z19, boolean z23, boolean z24, int i14) {
        int i15 = (i14 & 1) != 0 ? 2 : i13;
        boolean z25 = (i14 & 2) != 0 ? true : z13;
        boolean z26 = (i14 & 4) != 0;
        boolean z27 = (i14 & 16) != 0;
        Boolean bool2 = (i14 & 32) != 0 ? null : bool;
        boolean z28 = (i14 & 64) != 0 ? false : z14;
        boolean z29 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? z15 : true;
        boolean z33 = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : z16;
        boolean z34 = (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : z17;
        boolean z35 = (i14 & 1024) != 0 ? false : z18;
        e eVar2 = (i14 & 2048) == 0 ? eVar : null;
        boolean z36 = (i14 & 8192) != 0 ? false : z19;
        boolean z37 = (i14 & 16384) != 0 ? false : z23;
        boolean z38 = (i14 & 32768) != 0 ? false : z24;
        this.f87197a = i15;
        this.f87198b = z25;
        this.f87199c = z26;
        this.f87200d = str;
        this.f87201e = z27;
        this.f87202f = bool2;
        this.f87203g = z28;
        this.f87204h = z29;
        this.f87205i = z33;
        this.f87206j = z34;
        this.f87207k = z35;
        this.f87208l = eVar2;
        this.f87209m = false;
        this.f87210n = z36;
        this.f87211o = z37;
        this.f87212p = z38;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f87197a == aVar.f87197a && this.f87198b == aVar.f87198b && this.f87199c == aVar.f87199c && Intrinsics.d(this.f87200d, aVar.f87200d) && this.f87201e == aVar.f87201e && Intrinsics.d(this.f87202f, aVar.f87202f) && this.f87203g == aVar.f87203g && this.f87204h == aVar.f87204h && this.f87205i == aVar.f87205i && this.f87206j == aVar.f87206j && this.f87207k == aVar.f87207k && Intrinsics.d(this.f87208l, aVar.f87208l) && this.f87209m == aVar.f87209m && this.f87210n == aVar.f87210n && this.f87211o == aVar.f87211o && this.f87212p == aVar.f87212p;
    }

    public final int hashCode() {
        int e13 = b.e(this.f87199c, b.e(this.f87198b, Integer.hashCode(this.f87197a) * 31, 31), 31);
        String str = this.f87200d;
        int e14 = b.e(this.f87201e, (e13 + (str == null ? 0 : str.hashCode())) * 31, 31);
        Boolean bool = this.f87202f;
        int e15 = b.e(this.f87207k, b.e(this.f87206j, b.e(this.f87205i, b.e(this.f87204h, b.e(this.f87203g, (e14 + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31), 31), 31), 31);
        e eVar = this.f87208l;
        return Boolean.hashCode(this.f87212p) + b.e(this.f87211o, b.e(this.f87210n, b.e(this.f87209m, (e15 + (eVar != null ? eVar.hashCode() : 0)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AdsCarouselViewOverrideConfig(maxTitleLines=");
        sb3.append(this.f87197a);
        sb3.append(", shouldRenderMerchantDomain=");
        sb3.append(this.f87198b);
        sb3.append(", shouldRenderShippingInfo=");
        sb3.append(this.f87199c);
        sb3.append(", storyType=");
        sb3.append(this.f87200d);
        sb3.append(", shouldForceHidePromotedAttribution=");
        sb3.append(this.f87201e);
        sb3.append(", isMultipleAdvertiser=");
        sb3.append(this.f87202f);
        sb3.append(", shouldRenderBlackColorPrice=");
        sb3.append(this.f87203g);
        sb3.append(", shouldShowAttributionBadge=");
        sb3.append(this.f87204h);
        sb3.append(", shouldForceHideRatingAndCount=");
        sb3.append(this.f87205i);
        sb3.append(", isDealAOMInHF=");
        sb3.append(this.f87206j);
        sb3.append(", isBrandedStandardModuleInHF=");
        sb3.append(this.f87207k);
        sb3.append(", fixedHeightImageSpec=");
        sb3.append(this.f87208l);
        sb3.append(", shouldForceSponsorshipLabel=");
        sb3.append(this.f87209m);
        sb3.append(", shouldForceHideHideOverflow=");
        sb3.append(this.f87210n);
        sb3.append(", shouldOnlyRenderImage=");
        sb3.append(this.f87211o);
        sb3.append(", shouldRenderInDenseGrid=");
        return a.a.r(sb3, this.f87212p, ")");
    }
}
