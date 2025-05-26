package bk1;

import a.cb;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import ni1.x2;

/* loaded from: classes2.dex */
public final class a2 implements l82.i0 {
    public final String A;
    public final Boolean B;
    public final h32.u0 C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final String f23154J;
    public final qa2.a K;
    public final String L;
    public final boolean M;
    public final boolean N;
    public final f30 O;
    public final boolean P;
    public final String Q;
    public final boolean R;
    public final x32.e S;
    public final String T;
    public final boolean U;
    public final boolean V;
    public final boolean W;
    public final boolean X;
    public final Map Y;

    /* renamed from: a, reason: collision with root package name */
    public final f30 f23155a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23156b;

    /* renamed from: c, reason: collision with root package name */
    public final zy.l0 f23157c;

    /* renamed from: d, reason: collision with root package name */
    public final x2 f23158d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23159e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23160f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f23161g;

    /* renamed from: h, reason: collision with root package name */
    public final String f23162h;

    /* renamed from: i, reason: collision with root package name */
    public final h32.u0 f23163i;

    /* renamed from: j, reason: collision with root package name */
    public final int f23164j;

    /* renamed from: k, reason: collision with root package name */
    public final int f23165k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f23166l;

    /* renamed from: m, reason: collision with root package name */
    public final d2 f23167m;

    /* renamed from: n, reason: collision with root package name */
    public final b f23168n;

    /* renamed from: o, reason: collision with root package name */
    public final Long f23169o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f23170p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f23171q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f23172r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f23173s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f23174t;

    /* renamed from: u, reason: collision with root package name */
    public final int f23175u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f23176v;

    /* renamed from: w, reason: collision with root package name */
    public final nx.q f23177w;

    /* renamed from: x, reason: collision with root package name */
    public final int f23178x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f23179y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f23180z;

    public a2(f30 pinModel, int i13, zy.l0 pinalyticsVMState, x2 experimentConfigs, String str, boolean z13, boolean z14, String str2, h32.u0 u0Var, int i14, int i15, boolean z15, d2 deferredClickthroughValues, b attemptedDeepLinkSource, Long l13, HashMap viewAuxData, boolean z16, boolean z17, Integer num, Integer num2, int i16, boolean z18, nx.q commerceData, int i17, boolean z19, boolean z23, String str3, Boolean bool, h32.u0 u0Var2, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, String str4, qa2.a attributionReason, String closeupTrafficSource, boolean z33, boolean z34, f30 f30Var, boolean z35, String str5, boolean z36, x32.e eVar, String str6, boolean z37, boolean z38, boolean z39, boolean z43, Map experimentsGroupInfo) {
        Intrinsics.checkNotNullParameter(pinModel, "pinModel");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(experimentConfigs, "experimentConfigs");
        Intrinsics.checkNotNullParameter(deferredClickthroughValues, "deferredClickthroughValues");
        Intrinsics.checkNotNullParameter(attemptedDeepLinkSource, "attemptedDeepLinkSource");
        Intrinsics.checkNotNullParameter(viewAuxData, "viewAuxData");
        Intrinsics.checkNotNullParameter(commerceData, "commerceData");
        Intrinsics.checkNotNullParameter(attributionReason, "attributionReason");
        Intrinsics.checkNotNullParameter(closeupTrafficSource, "closeupTrafficSource");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        this.f23155a = pinModel;
        this.f23156b = i13;
        this.f23157c = pinalyticsVMState;
        this.f23158d = experimentConfigs;
        this.f23159e = str;
        this.f23160f = z13;
        this.f23161g = z14;
        this.f23162h = str2;
        this.f23163i = u0Var;
        this.f23164j = i14;
        this.f23165k = i15;
        this.f23166l = z15;
        this.f23167m = deferredClickthroughValues;
        this.f23168n = attemptedDeepLinkSource;
        this.f23169o = l13;
        this.f23170p = viewAuxData;
        this.f23171q = z16;
        this.f23172r = z17;
        this.f23173s = num;
        this.f23174t = num2;
        this.f23175u = i16;
        this.f23176v = z18;
        this.f23177w = commerceData;
        this.f23178x = i17;
        this.f23179y = z19;
        this.f23180z = z23;
        this.A = str3;
        this.B = bool;
        this.C = u0Var2;
        this.D = z24;
        this.E = z25;
        this.F = z26;
        this.G = z27;
        this.H = z28;
        this.I = z29;
        this.f23154J = str4;
        this.K = attributionReason;
        this.L = closeupTrafficSource;
        this.M = z33;
        this.N = z34;
        this.O = f30Var;
        this.P = z35;
        this.Q = str5;
        this.R = z36;
        this.S = eVar;
        this.T = str6;
        this.U = z37;
        this.V = z38;
        this.W = z39;
        this.X = z43;
        this.Y = experimentsGroupInfo;
    }

    public static a2 b(a2 a2Var, zy.l0 l0Var, boolean z13, boolean z14, String str, h32.u0 u0Var, int i13, boolean z15, b2 b2Var, b bVar, Long l13, boolean z16, boolean z17, Integer num, Integer num2, int i14, boolean z18, boolean z19, boolean z23, String str2, Boolean bool, h32.u0 u0Var2, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, String str3, qa2.a aVar, String str4, boolean z33, boolean z34, f30 f30Var, boolean z35, boolean z36, x32.e eVar, String str5, boolean z37, boolean z38, boolean z39, boolean z43, int i15, int i16) {
        int i17;
        boolean z44;
        String str6;
        boolean z45;
        f30 pinModel = a2Var.f23155a;
        int i18 = a2Var.f23156b;
        zy.l0 pinalyticsVMState = (i15 & 4) != 0 ? a2Var.f23157c : l0Var;
        x2 experimentConfigs = a2Var.f23158d;
        String str7 = a2Var.f23159e;
        boolean z46 = (i15 & 32) != 0 ? a2Var.f23160f : z13;
        boolean z47 = (i15 & 64) != 0 ? a2Var.f23161g : z14;
        String str8 = (i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? a2Var.f23162h : str;
        h32.u0 u0Var3 = (i15 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? a2Var.f23163i : u0Var;
        int i19 = (i15 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? a2Var.f23164j : i13;
        int i23 = a2Var.f23165k;
        boolean z48 = (i15 & 2048) != 0 ? a2Var.f23166l : z15;
        d2 deferredClickthroughValues = (i15 & 4096) != 0 ? a2Var.f23167m : b2Var;
        boolean z49 = z48;
        b attemptedDeepLinkSource = (i15 & 8192) != 0 ? a2Var.f23168n : bVar;
        Long l14 = (i15 & 16384) != 0 ? a2Var.f23169o : l13;
        HashMap viewAuxData = a2Var.f23170p;
        int i24 = i19;
        boolean z53 = (i15 & 65536) != 0 ? a2Var.f23171q : z16;
        boolean z54 = (i15 & 131072) != 0 ? a2Var.f23172r : z17;
        Integer num3 = (262144 & i15) != 0 ? a2Var.f23173s : num;
        Integer num4 = (524288 & i15) != 0 ? a2Var.f23174t : num2;
        int i25 = (1048576 & i15) != 0 ? a2Var.f23175u : i14;
        boolean z55 = (2097152 & i15) != 0 ? a2Var.f23176v : z18;
        nx.q commerceData = a2Var.f23177w;
        h32.u0 u0Var4 = u0Var3;
        int i26 = a2Var.f23178x;
        if ((i15 & 16777216) != 0) {
            i17 = i26;
            z44 = a2Var.f23179y;
        } else {
            i17 = i26;
            z44 = z19;
        }
        boolean z56 = (33554432 & i15) != 0 ? a2Var.f23180z : z23;
        String str9 = (67108864 & i15) != 0 ? a2Var.A : str2;
        Boolean bool2 = (134217728 & i15) != 0 ? a2Var.B : bool;
        h32.u0 u0Var5 = (268435456 & i15) != 0 ? a2Var.C : u0Var2;
        boolean z57 = (536870912 & i15) != 0 ? a2Var.D : z24;
        boolean z58 = (1073741824 & i15) != 0 ? a2Var.E : z25;
        boolean z59 = (i15 & Integer.MIN_VALUE) != 0 ? a2Var.F : z26;
        boolean z63 = (i16 & 1) != 0 ? a2Var.G : z27;
        boolean z64 = (i16 & 2) != 0 ? a2Var.H : z28;
        boolean z65 = (i16 & 4) != 0 ? a2Var.I : z29;
        String str10 = (i16 & 8) != 0 ? a2Var.f23154J : str3;
        qa2.a attributionReason = (i16 & 16) != 0 ? a2Var.K : aVar;
        String closeupTrafficSource = (i16 & 32) != 0 ? a2Var.L : str4;
        if ((i16 & 64) != 0) {
            str6 = str8;
            z45 = a2Var.M;
        } else {
            str6 = str8;
            z45 = z33;
        }
        boolean z66 = (i16 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? a2Var.N : z34;
        f30 f30Var2 = (i16 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? a2Var.O : f30Var;
        boolean z67 = (i16 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? a2Var.P : z35;
        String str11 = a2Var.Q;
        boolean z68 = (i16 & 2048) != 0 ? a2Var.R : z36;
        x32.e eVar2 = (i16 & 4096) != 0 ? a2Var.S : eVar;
        String str12 = (i16 & 8192) != 0 ? a2Var.T : str5;
        boolean z69 = (i16 & 16384) != 0 ? a2Var.U : z37;
        boolean z73 = (32768 & i16) != 0 ? a2Var.V : z38;
        boolean z74 = (i16 & 65536) != 0 ? a2Var.W : z39;
        boolean z75 = (i16 & 131072) != 0 ? a2Var.X : z43;
        Map experimentsGroupInfo = a2Var.Y;
        a2Var.getClass();
        Intrinsics.checkNotNullParameter(pinModel, "pinModel");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(experimentConfigs, "experimentConfigs");
        Intrinsics.checkNotNullParameter(deferredClickthroughValues, "deferredClickthroughValues");
        Intrinsics.checkNotNullParameter(attemptedDeepLinkSource, "attemptedDeepLinkSource");
        Intrinsics.checkNotNullParameter(viewAuxData, "viewAuxData");
        Intrinsics.checkNotNullParameter(commerceData, "commerceData");
        Intrinsics.checkNotNullParameter(attributionReason, "attributionReason");
        Intrinsics.checkNotNullParameter(closeupTrafficSource, "closeupTrafficSource");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        return new a2(pinModel, i18, pinalyticsVMState, experimentConfigs, str7, z46, z47, str6, u0Var4, i24, i23, z49, deferredClickthroughValues, attemptedDeepLinkSource, l14, viewAuxData, z53, z54, num3, num4, i25, z55, commerceData, i17, z44, z56, str9, bool2, u0Var5, z57, z58, z59, z63, z64, z65, str10, attributionReason, closeupTrafficSource, z45, z66, f30Var2, z67, str11, z68, eVar2, str12, z69, z73, z74, z75, experimentsGroupInfo);
    }

    public final b d() {
        return this.f23168n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return Intrinsics.d(this.f23155a, a2Var.f23155a) && this.f23156b == a2Var.f23156b && Intrinsics.d(this.f23157c, a2Var.f23157c) && Intrinsics.d(this.f23158d, a2Var.f23158d) && Intrinsics.d(this.f23159e, a2Var.f23159e) && this.f23160f == a2Var.f23160f && this.f23161g == a2Var.f23161g && Intrinsics.d(this.f23162h, a2Var.f23162h) && this.f23163i == a2Var.f23163i && this.f23164j == a2Var.f23164j && this.f23165k == a2Var.f23165k && this.f23166l == a2Var.f23166l && Intrinsics.d(this.f23167m, a2Var.f23167m) && this.f23168n == a2Var.f23168n && Intrinsics.d(this.f23169o, a2Var.f23169o) && Intrinsics.d(this.f23170p, a2Var.f23170p) && this.f23171q == a2Var.f23171q && this.f23172r == a2Var.f23172r && Intrinsics.d(this.f23173s, a2Var.f23173s) && Intrinsics.d(this.f23174t, a2Var.f23174t) && this.f23175u == a2Var.f23175u && this.f23176v == a2Var.f23176v && Intrinsics.d(this.f23177w, a2Var.f23177w) && this.f23178x == a2Var.f23178x && this.f23179y == a2Var.f23179y && this.f23180z == a2Var.f23180z && Intrinsics.d(this.A, a2Var.A) && Intrinsics.d(this.B, a2Var.B) && this.C == a2Var.C && this.D == a2Var.D && this.E == a2Var.E && this.F == a2Var.F && this.G == a2Var.G && this.H == a2Var.H && this.I == a2Var.I && Intrinsics.d(this.f23154J, a2Var.f23154J) && this.K == a2Var.K && Intrinsics.d(this.L, a2Var.L) && this.M == a2Var.M && this.N == a2Var.N && Intrinsics.d(this.O, a2Var.O) && this.P == a2Var.P && Intrinsics.d(this.Q, a2Var.Q) && this.R == a2Var.R && this.S == a2Var.S && Intrinsics.d(this.T, a2Var.T) && this.U == a2Var.U && this.V == a2Var.V && this.W == a2Var.W && this.X == a2Var.X && Intrinsics.d(this.Y, a2Var.Y);
    }

    public final Long f() {
        return this.f23169o;
    }

    public final zy.l0 h() {
        return this.f23157c;
    }

    public final int hashCode() {
        int hashCode = (this.f23158d.hashCode() + jq.b.a(this.f23157c, ep.b.b(this.f23156b, this.f23155a.hashCode() * 31, 31), 31)) * 31;
        String str = this.f23159e;
        int e13 = ep.b.e(this.f23161g, ep.b.e(this.f23160f, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.f23162h;
        int hashCode2 = (e13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        h32.u0 u0Var = this.f23163i;
        int hashCode3 = (this.f23168n.hashCode() + ((this.f23167m.hashCode() + ep.b.e(this.f23166l, ep.b.b(this.f23165k, ep.b.b(this.f23164j, (hashCode2 + (u0Var == null ? 0 : u0Var.hashCode())) * 31, 31), 31), 31)) * 31)) * 31;
        Long l13 = this.f23169o;
        int e14 = ep.b.e(this.f23172r, ep.b.e(this.f23171q, a.c.d(this.f23170p, (hashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31, 31), 31), 31);
        Integer num = this.f23173s;
        int hashCode4 = (e14 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f23174t;
        int e15 = ep.b.e(this.f23180z, ep.b.e(this.f23179y, ep.b.b(this.f23178x, a.c.e(this.f23177w.f92450a, ep.b.e(this.f23176v, ep.b.b(this.f23175u, (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
        String str3 = this.A;
        int hashCode5 = (e15 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.B;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        h32.u0 u0Var2 = this.C;
        int e16 = ep.b.e(this.I, ep.b.e(this.H, ep.b.e(this.G, ep.b.e(this.F, ep.b.e(this.E, ep.b.e(this.D, (hashCode6 + (u0Var2 == null ? 0 : u0Var2.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
        String str4 = this.f23154J;
        int e17 = ep.b.e(this.N, ep.b.e(this.M, cb.d(this.L, (this.K.hashCode() + ((e16 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31, 31), 31), 31);
        f30 f30Var = this.O;
        int e18 = ep.b.e(this.P, (e17 + (f30Var == null ? 0 : f30Var.hashCode())) * 31, 31);
        String str5 = this.Q;
        int e19 = ep.b.e(this.R, (e18 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        x32.e eVar = this.S;
        int hashCode7 = (e19 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str6 = this.T;
        return this.Y.hashCode() + ep.b.e(this.X, ep.b.e(this.W, ep.b.e(this.V, ep.b.e(this.U, (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    public final String i() {
        return this.L;
    }

    public final int m() {
        return this.f23164j;
    }

    public final int o() {
        return this.f23156b;
    }

    public final boolean p() {
        return this.V;
    }

    public final boolean r() {
        return this.M;
    }

    public final String toString() {
        return "ClickThroughVMState(pinModel=" + this.f23155a + ", position=" + this.f23156b + ", pinalyticsVMState=" + this.f23157c + ", experimentConfigs=" + this.f23158d + ", trackingParams=" + this.f23159e + ", logComponentForPinClick=" + this.f23160f + ", isProductTag=" + this.f23161g + ", parentPinId=" + this.f23162h + ", clickElement=" + this.f23163i + ", lastIndexForPin=" + this.f23164j + ", lastSlideshowIndexFromGrid=" + this.f23165k + ", isContainedByShoppingSlideshowPinCellView=" + this.f23166l + ", deferredClickthroughValues=" + this.f23167m + ", attemptedDeepLinkSource=" + this.f23168n + ", chromeClickthroughStartTimeNs=" + this.f23169o + ", viewAuxData=" + this.f23170p + ", hasPinChips=" + this.f23171q + ", usePinIdForTapAuxData=" + this.f23172r + ", collectionPosition=" + this.f23173s + ", indexWithinAOM=" + this.f23174t + ", columnIndexForLogging=" + this.f23175u + ", shouldRegisterAttributionSourceEvents=" + this.f23176v + ", commerceData=" + this.f23177w + ", gridCount=" + this.f23178x + ", isInAdsOnlyModule=" + this.f23179y + ", isInStlModule=" + this.f23180z + ", storyType=" + this.A + ", isMultipleAdvertiser=" + this.B + ", shoppingConfigElementType=" + this.C + ", isEligibleForPriceAndRatingsInSearch=" + this.D + ", isEligibleForPriceAndRatingsInRP=" + this.E + ", isDealAOMInHF=" + this.F + ", shouldRenderPrice=" + this.G + ", shouldRenderRatingAndCount=" + this.H + ", isProductPageForPriceAndRatingsExperiment=" + this.I + ", userIdForAttribution=" + this.f23154J + ", attributionReason=" + this.K + ", closeupTrafficSource=" + this.L + ", isHideSupported=" + this.M + ", isDLCollection=" + this.N + ", firstChipPin=" + this.O + ", isParentPinPromoted=" + this.P + ", clickThroughUrl=" + this.Q + ", isAmazonAccountLinked=" + this.R + ", shoppingPinDecorationType=" + this.S + ", amazonDecorationText=" + this.T + ", isTargetAccountLinked=" + this.U + ", shouldScrollToTopOnPostNavigationEvent=" + this.V + ", shouldLogPrice=" + this.W + ", shouldLogRating=" + this.X + ", experimentsGroupInfo=" + this.Y + ")";
    }

    public a2(f30 f30Var, int i13, zy.l0 l0Var, x2 x2Var, String str, int i14, int i15, d2 d2Var, HashMap hashMap, boolean z13, boolean z14, nx.q qVar, int i16, boolean z15, boolean z16, String str2, Boolean bool, String str3, boolean z17, boolean z18, Map map) {
        this(f30Var, i13, l0Var, x2Var, str, false, false, null, null, i14, i15, false, d2Var, b.NO_DEEPLINK_REQUESTED, null, hashMap, false, z13, null, null, -1, z14, qVar, i16, z15, z16, str2, bool, null, false, false, false, false, false, false, null, qa2.a.UNDEFINED, "unknown", true, false, null, false, str3, false, x32.e.NONE, null, false, false, z17, z18, map);
    }
}
