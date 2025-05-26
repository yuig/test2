package ls0;

import com.pinterest.api.model.ym;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final String D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final ym H;

    /* renamed from: a, reason: collision with root package name */
    public final g f84626a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84627b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84628c;

    /* renamed from: d, reason: collision with root package name */
    public final String f84629d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84630e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84631f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84632g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84633h;

    /* renamed from: i, reason: collision with root package name */
    public final String f84634i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f84635j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f84636k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f84637l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f84638m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f84639n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f84640o;

    /* renamed from: p, reason: collision with root package name */
    public final String f84641p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f84642q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f84643r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f84644s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f84645t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f84646u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f84647v;

    /* renamed from: w, reason: collision with root package name */
    public final String f84648w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f84649x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f84650y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f84651z;

    public f(g reason, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, String str9, boolean z19, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, String str10, boolean z28, boolean z29, boolean z33, boolean z34, boolean z35, boolean z36, String str11, boolean z37, boolean z38, boolean z39, ym ymVar) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f84626a = reason;
        this.f84627b = str;
        this.f84628c = str2;
        this.f84629d = str3;
        this.f84630e = str4;
        this.f84631f = str5;
        this.f84632g = str6;
        this.f84633h = str7;
        this.f84634i = str8;
        this.f84635j = z13;
        this.f84636k = z14;
        this.f84637l = z15;
        this.f84638m = z16;
        this.f84639n = z17;
        this.f84640o = z18;
        this.f84641p = str9;
        this.f84642q = z19;
        this.f84643r = z23;
        this.f84644s = z24;
        this.f84645t = z25;
        this.f84646u = z26;
        this.f84647v = z27;
        this.f84648w = str10;
        this.f84649x = z28;
        this.f84650y = z29;
        this.f84651z = z33;
        this.A = z34;
        this.B = z35;
        this.C = z36;
        this.D = str11;
        this.E = z37;
        this.F = z38;
        this.G = z39;
        this.H = ymVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f84626a == fVar.f84626a && Intrinsics.d(this.f84627b, fVar.f84627b) && Intrinsics.d(this.f84628c, fVar.f84628c) && Intrinsics.d(this.f84629d, fVar.f84629d) && Intrinsics.d(this.f84630e, fVar.f84630e) && Intrinsics.d(this.f84631f, fVar.f84631f) && Intrinsics.d(this.f84632g, fVar.f84632g) && Intrinsics.d(this.f84633h, fVar.f84633h) && Intrinsics.d(this.f84634i, fVar.f84634i) && this.f84635j == fVar.f84635j && this.f84636k == fVar.f84636k && this.f84637l == fVar.f84637l && this.f84638m == fVar.f84638m && this.f84639n == fVar.f84639n && this.f84640o == fVar.f84640o && Intrinsics.d(this.f84641p, fVar.f84641p) && this.f84642q == fVar.f84642q && this.f84643r == fVar.f84643r && this.f84644s == fVar.f84644s && this.f84645t == fVar.f84645t && this.f84646u == fVar.f84646u && this.f84647v == fVar.f84647v && Intrinsics.d(this.f84648w, fVar.f84648w) && this.f84649x == fVar.f84649x && this.f84650y == fVar.f84650y && this.f84651z == fVar.f84651z && this.A == fVar.A && this.B == fVar.B && this.C == fVar.C && Intrinsics.d(this.D, fVar.D) && this.E == fVar.E && this.F == fVar.F && this.G == fVar.G && Intrinsics.d(this.H, fVar.H);
    }

    public final int hashCode() {
        int hashCode = this.f84626a.hashCode() * 31;
        String str = this.f84627b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f84628c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f84629d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f84630e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f84631f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f84632g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f84633h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f84634i;
        int e13 = ep.b.e(this.f84640o, ep.b.e(this.f84639n, ep.b.e(this.f84638m, ep.b.e(this.f84637l, ep.b.e(this.f84636k, ep.b.e(this.f84635j, (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
        String str9 = this.f84641p;
        int e14 = ep.b.e(this.f84647v, ep.b.e(this.f84646u, ep.b.e(this.f84645t, ep.b.e(this.f84644s, ep.b.e(this.f84643r, ep.b.e(this.f84642q, (e13 + (str9 == null ? 0 : str9.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
        String str10 = this.f84648w;
        int e15 = ep.b.e(this.C, ep.b.e(this.B, ep.b.e(this.A, ep.b.e(this.f84651z, ep.b.e(this.f84650y, ep.b.e(this.f84649x, (e14 + (str10 == null ? 0 : str10.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
        String str11 = this.D;
        int e16 = ep.b.e(this.G, ep.b.e(this.F, ep.b.e(this.E, (e15 + (str11 == null ? 0 : str11.hashCode())) * 31, 31), 31), 31);
        ym ymVar = this.H;
        return e16 + (ymVar != null ? ymVar.hashCode() : 0);
    }

    public final String toString() {
        return "GridActionsViewParams(reason=" + this.f84626a + ", user=" + this.f84627b + ", userUid=" + this.f84628c + ", board=" + this.f84629d + ", boardUid=" + this.f84630e + ", topic=" + this.f84631f + ", topicUid=" + this.f84632g + ", partner=" + this.f84633h + ", partnerUid=" + this.f84634i + ", isMyPin=" + this.f84635j + ", isCurrentUserAllowedToEditPin=" + this.f84636k + ", isVideo=" + this.f84637l + ", isStoryPin=" + this.f84638m + ", isStaticImageIdeaPin=" + this.f84639n + ", isRemovablePin=" + this.f84640o + ", darkProfileLink=" + this.f84641p + ", isCommentSwitchAllowed=" + this.f84642q + ", isCommentAllowed=" + this.f84643r + ", isDidItSwitchAllowed=" + this.f84644s + ", isDidItAllowed=" + this.f84645t + ", isAdsShoppingPin=" + this.f84646u + ", isPromoted=" + this.f84647v + ", promotedPartnershipAttributionName=" + this.f84648w + ", wasPinCreatedWithShufflesApp=" + this.f84649x + ", isThirdPartyGma=" + this.f84650y + ", isPremierePin=" + this.f84651z + ", canAddToCollage=" + this.A + ", isRemixableCollage=" + this.B + ", isThirdPartyAd=" + this.C + ", promotedPartnershipAdvertiserName=" + this.D + ", isWeightLossAd=" + this.E + ", isCriteoAd=" + this.F + ", showGenAIDisclaimer=" + this.G + ", genAiTopic=" + this.H + ")";
    }
}
