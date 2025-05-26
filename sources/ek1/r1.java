package ek1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import ni1.x2;

/* loaded from: classes2.dex */
public final class r1 implements l82.i0 {
    public final boolean A;
    public final String B;
    public final Boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final String H;
    public final String I;

    /* renamed from: J, reason: collision with root package name */
    public final sr f59337J;
    public final h32.g0 K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final x32.e T;
    public final String U;
    public final boolean V;
    public final Integer W;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final f30 f59338a;

    /* renamed from: a0, reason: collision with root package name */
    public final Map f59339a0;

    /* renamed from: b, reason: collision with root package name */
    public final int f59340b;

    /* renamed from: c, reason: collision with root package name */
    public final zy.l0 f59341c;

    /* renamed from: d, reason: collision with root package name */
    public final x2 f59342d;

    /* renamed from: e, reason: collision with root package name */
    public final az.c f59343e;

    /* renamed from: f, reason: collision with root package name */
    public final float f59344f;

    /* renamed from: g, reason: collision with root package name */
    public final int f59345g;

    /* renamed from: h, reason: collision with root package name */
    public final g f59346h;

    /* renamed from: i, reason: collision with root package name */
    public final v1 f59347i;

    /* renamed from: j, reason: collision with root package name */
    public final l f59348j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f59349k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f59350l;

    /* renamed from: m, reason: collision with root package name */
    public final yi1.r f59351m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f59352n;

    /* renamed from: o, reason: collision with root package name */
    public final long f59353o;

    /* renamed from: p, reason: collision with root package name */
    public final int f59354p;

    /* renamed from: q, reason: collision with root package name */
    public final int f59355q;

    /* renamed from: r, reason: collision with root package name */
    public final yi1.a f59356r;

    /* renamed from: s, reason: collision with root package name */
    public final d2 f59357s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f59358t;

    /* renamed from: u, reason: collision with root package name */
    public final int f59359u;

    /* renamed from: v, reason: collision with root package name */
    public final int f59360v;

    /* renamed from: w, reason: collision with root package name */
    public final nx.q f59361w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f59362x;

    /* renamed from: y, reason: collision with root package name */
    public final String f59363y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f59364z;

    public r1(f30 pinModel, int i13, zy.l0 pinalyticsVMState, x2 experimentConfigs, az.c impressionVmState, float f13, int i14, g cxcSlideShowStatus, v1 pinChipStatus, l mediaVisibility, boolean z13, boolean z14, yi1.r pinImageLoggingData, HashMap viewAuxData, long j13, int i15, int i16, yi1.a bitmapStatus, d2 visibilityStatus, boolean z15, int i17, int i18, nx.q commerceData, boolean z16, String str, boolean z17, boolean z18, String str2, Boolean bool, boolean z19, boolean z23, boolean z24, boolean z25, String str3, String str4, sr srVar, lf.a aVar, h32.g0 g0Var, boolean z26, boolean z27, boolean z28, boolean z29, boolean z33, boolean z34, boolean z35, boolean z36, x32.e eVar, String str5, boolean z37, Integer num, boolean z38, boolean z39, boolean z43, Map experimentsGroupInfo) {
        Intrinsics.checkNotNullParameter(pinModel, "pinModel");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(experimentConfigs, "experimentConfigs");
        Intrinsics.checkNotNullParameter(impressionVmState, "impressionVmState");
        Intrinsics.checkNotNullParameter(cxcSlideShowStatus, "cxcSlideShowStatus");
        Intrinsics.checkNotNullParameter(pinChipStatus, "pinChipStatus");
        Intrinsics.checkNotNullParameter(mediaVisibility, "mediaVisibility");
        Intrinsics.checkNotNullParameter(pinImageLoggingData, "pinImageLoggingData");
        Intrinsics.checkNotNullParameter(viewAuxData, "viewAuxData");
        Intrinsics.checkNotNullParameter(bitmapStatus, "bitmapStatus");
        Intrinsics.checkNotNullParameter(visibilityStatus, "visibilityStatus");
        Intrinsics.checkNotNullParameter(commerceData, "commerceData");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        this.f59338a = pinModel;
        this.f59340b = i13;
        this.f59341c = pinalyticsVMState;
        this.f59342d = experimentConfigs;
        this.f59343e = impressionVmState;
        this.f59344f = f13;
        this.f59345g = i14;
        this.f59346h = cxcSlideShowStatus;
        this.f59347i = pinChipStatus;
        this.f59348j = mediaVisibility;
        this.f59349k = z13;
        this.f59350l = z14;
        this.f59351m = pinImageLoggingData;
        this.f59352n = viewAuxData;
        this.f59353o = j13;
        this.f59354p = i15;
        this.f59355q = i16;
        this.f59356r = bitmapStatus;
        this.f59357s = visibilityStatus;
        this.f59358t = z15;
        this.f59359u = i17;
        this.f59360v = i18;
        this.f59361w = commerceData;
        this.f59362x = z16;
        this.f59363y = str;
        this.f59364z = z17;
        this.A = z18;
        this.B = str2;
        this.C = bool;
        this.D = z19;
        this.E = z23;
        this.F = z24;
        this.G = z25;
        this.H = str3;
        this.I = str4;
        this.f59337J = srVar;
        this.K = g0Var;
        this.L = z26;
        this.M = z27;
        this.N = z28;
        this.O = z29;
        this.P = z33;
        this.Q = z34;
        this.R = z35;
        this.S = z36;
        this.T = eVar;
        this.U = str5;
        this.V = z37;
        this.W = num;
        this.X = z38;
        this.Y = z39;
        this.Z = z43;
        this.f59339a0 = experimentsGroupInfo;
    }

    public static r1 b(r1 r1Var, zy.l0 l0Var, az.c cVar, int i13, g gVar, v1 v1Var, l lVar, boolean z13, boolean z14, yi1.r rVar, int i14, yi1.a aVar, d2 d2Var, boolean z15, boolean z16, String str, boolean z17, boolean z18, String str2, Boolean bool, boolean z19, boolean z23, boolean z24, boolean z25, lf.a aVar2, h32.g0 g0Var, boolean z26, boolean z27, boolean z28, x32.e eVar, String str3, boolean z29, Integer num, boolean z33, boolean z34, boolean z35, int i15, int i16) {
        long j13;
        int i17;
        int i18;
        d2 visibilityStatus;
        int i19;
        boolean z36;
        lf.a aVar3;
        String str4;
        h32.g0 g0Var2;
        f30 pinModel = r1Var.f59338a;
        int i23 = r1Var.f59340b;
        zy.l0 pinalyticsVMState = (i15 & 4) != 0 ? r1Var.f59341c : l0Var;
        x2 experimentConfigs = r1Var.f59342d;
        az.c impressionVmState = (i15 & 16) != 0 ? r1Var.f59343e : cVar;
        float f13 = r1Var.f59344f;
        int i24 = (i15 & 64) != 0 ? r1Var.f59345g : i13;
        g cxcSlideShowStatus = (i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? r1Var.f59346h : gVar;
        v1 pinChipStatus = (i15 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? r1Var.f59347i : v1Var;
        l mediaVisibility = (i15 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? r1Var.f59348j : lVar;
        boolean z37 = (i15 & 1024) != 0 ? r1Var.f59349k : z13;
        boolean z38 = (i15 & 2048) != 0 ? r1Var.f59350l : z14;
        yi1.r pinImageLoggingData = (i15 & 4096) != 0 ? r1Var.f59351m : rVar;
        boolean z39 = z38;
        HashMap viewAuxData = r1Var.f59352n;
        int i25 = i24;
        long j14 = r1Var.f59353o;
        if ((i15 & 32768) != 0) {
            j13 = j14;
            i17 = r1Var.f59354p;
        } else {
            j13 = j14;
            i17 = i14;
        }
        int i26 = r1Var.f59355q;
        yi1.a bitmapStatus = (i15 & 131072) != 0 ? r1Var.f59356r : aVar;
        if ((i15 & 262144) != 0) {
            i18 = i26;
            visibilityStatus = r1Var.f59357s;
        } else {
            i18 = i26;
            visibilityStatus = d2Var;
        }
        boolean z43 = z37;
        boolean z44 = (i15 & 524288) != 0 ? r1Var.f59358t : z15;
        int i27 = r1Var.f59359u;
        int i28 = r1Var.f59360v;
        nx.q commerceData = r1Var.f59361w;
        if ((i15 & 8388608) != 0) {
            i19 = i23;
            z36 = r1Var.f59362x;
        } else {
            i19 = i23;
            z36 = z16;
        }
        String str5 = (16777216 & i15) != 0 ? r1Var.f59363y : str;
        boolean z45 = (33554432 & i15) != 0 ? r1Var.f59364z : z17;
        boolean z46 = (67108864 & i15) != 0 ? r1Var.A : z18;
        String str6 = (134217728 & i15) != 0 ? r1Var.B : str2;
        Boolean bool2 = (268435456 & i15) != 0 ? r1Var.C : bool;
        boolean z47 = (536870912 & i15) != 0 ? r1Var.D : z19;
        boolean z48 = (1073741824 & i15) != 0 ? r1Var.E : z23;
        boolean z49 = (i15 & Integer.MIN_VALUE) != 0 ? r1Var.F : z24;
        boolean z53 = (i16 & 1) != 0 ? r1Var.G : z25;
        String str7 = r1Var.H;
        String str8 = r1Var.I;
        sr srVar = r1Var.f59337J;
        if ((i16 & 16) != 0) {
            aVar3 = null;
            r1Var.getClass();
        } else {
            aVar3 = aVar2;
        }
        if ((i16 & 32) != 0) {
            str4 = str8;
            g0Var2 = r1Var.K;
        } else {
            str4 = str8;
            g0Var2 = g0Var;
        }
        boolean z54 = r1Var.L;
        boolean z55 = r1Var.M;
        boolean z56 = r1Var.N;
        boolean z57 = r1Var.O;
        boolean z58 = (i16 & 1024) != 0 ? r1Var.P : z26;
        boolean z59 = r1Var.Q;
        boolean z63 = (i16 & 4096) != 0 ? r1Var.R : z27;
        boolean z64 = (i16 & 8192) != 0 ? r1Var.S : z28;
        x32.e eVar2 = (i16 & 16384) != 0 ? r1Var.T : eVar;
        String str9 = (i16 & 32768) != 0 ? r1Var.U : str3;
        boolean z65 = (65536 & i16) != 0 ? r1Var.V : z29;
        Integer num2 = (131072 & i16) != 0 ? r1Var.W : num;
        boolean z66 = (i16 & 262144) != 0 ? r1Var.X : z33;
        boolean z67 = (i16 & 524288) != 0 ? r1Var.Y : z34;
        boolean z68 = (1048576 & i16) != 0 ? r1Var.Z : z35;
        Map experimentsGroupInfo = r1Var.f59339a0;
        r1Var.getClass();
        Intrinsics.checkNotNullParameter(pinModel, "pinModel");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(experimentConfigs, "experimentConfigs");
        Intrinsics.checkNotNullParameter(impressionVmState, "impressionVmState");
        Intrinsics.checkNotNullParameter(cxcSlideShowStatus, "cxcSlideShowStatus");
        Intrinsics.checkNotNullParameter(pinChipStatus, "pinChipStatus");
        Intrinsics.checkNotNullParameter(mediaVisibility, "mediaVisibility");
        Intrinsics.checkNotNullParameter(pinImageLoggingData, "pinImageLoggingData");
        Intrinsics.checkNotNullParameter(viewAuxData, "viewAuxData");
        Intrinsics.checkNotNullParameter(bitmapStatus, "bitmapStatus");
        Intrinsics.checkNotNullParameter(visibilityStatus, "visibilityStatus");
        Intrinsics.checkNotNullParameter(commerceData, "commerceData");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        return new r1(pinModel, i19, pinalyticsVMState, experimentConfigs, impressionVmState, f13, i25, cxcSlideShowStatus, pinChipStatus, mediaVisibility, z43, z39, pinImageLoggingData, viewAuxData, j13, i17, i18, bitmapStatus, visibilityStatus, z44, i27, i28, commerceData, z36, str5, z45, z46, str6, bool2, z47, z48, z49, z53, str7, str4, srVar, aVar3, g0Var2, z54, z55, z56, z57, z58, z59, z63, z64, eVar2, str9, z65, num2, z66, z67, z68, experimentsGroupInfo);
    }

    public final l d() {
        return this.f59348j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        if (!Intrinsics.d(this.f59338a, r1Var.f59338a) || this.f59340b != r1Var.f59340b || !Intrinsics.d(this.f59341c, r1Var.f59341c) || !Intrinsics.d(this.f59342d, r1Var.f59342d) || !Intrinsics.d(this.f59343e, r1Var.f59343e) || Float.compare(this.f59344f, r1Var.f59344f) != 0 || this.f59345g != r1Var.f59345g || !Intrinsics.d(this.f59346h, r1Var.f59346h) || !Intrinsics.d(this.f59347i, r1Var.f59347i) || this.f59348j != r1Var.f59348j || this.f59349k != r1Var.f59349k || this.f59350l != r1Var.f59350l || !Intrinsics.d(this.f59351m, r1Var.f59351m) || !Intrinsics.d(this.f59352n, r1Var.f59352n) || this.f59353o != r1Var.f59353o || this.f59354p != r1Var.f59354p || this.f59355q != r1Var.f59355q || this.f59356r != r1Var.f59356r || this.f59357s != r1Var.f59357s || this.f59358t != r1Var.f59358t || this.f59359u != r1Var.f59359u || this.f59360v != r1Var.f59360v || !Intrinsics.d(this.f59361w, r1Var.f59361w) || this.f59362x != r1Var.f59362x || !Intrinsics.d(this.f59363y, r1Var.f59363y) || this.f59364z != r1Var.f59364z || this.A != r1Var.A || !Intrinsics.d(this.B, r1Var.B) || !Intrinsics.d(this.C, r1Var.C) || this.D != r1Var.D || this.E != r1Var.E || this.F != r1Var.F || this.G != r1Var.G || !Intrinsics.d(this.H, r1Var.H) || !Intrinsics.d(this.I, r1Var.I) || !Intrinsics.d(this.f59337J, r1Var.f59337J)) {
            return false;
        }
        r1Var.getClass();
        return Intrinsics.d(null, null) && this.K == r1Var.K && this.L == r1Var.L && this.M == r1Var.M && this.N == r1Var.N && this.O == r1Var.O && this.P == r1Var.P && this.Q == r1Var.Q && this.R == r1Var.R && this.S == r1Var.S && this.T == r1Var.T && Intrinsics.d(this.U, r1Var.U) && this.V == r1Var.V && Intrinsics.d(this.W, r1Var.W) && this.X == r1Var.X && this.Y == r1Var.Y && this.Z == r1Var.Z && Intrinsics.d(this.f59339a0, r1Var.f59339a0);
    }

    public final boolean f() {
        return this.f59358t;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f59362x, a.c.e(this.f59361w.f92450a, ep.b.b(this.f59360v, ep.b.b(this.f59359u, ep.b.e(this.f59358t, (this.f59357s.hashCode() + ((this.f59356r.hashCode() + ep.b.b(this.f59355q, ep.b.b(this.f59354p, a.a.c(this.f59353o, a.c.d(this.f59352n, (this.f59351m.hashCode() + ep.b.e(this.f59350l, ep.b.e(this.f59349k, (this.f59348j.hashCode() + ((this.f59347i.hashCode() + ((this.f59346h.hashCode() + ep.b.b(this.f59345g, a.a.a(this.f59344f, (this.f59343e.hashCode() + ((this.f59342d.hashCode() + jq.b.a(this.f59341c, ep.b.b(this.f59340b, this.f59338a.hashCode() * 31, 31), 31)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31, 31), 31)) * 31, 31), 31), 31), 31)) * 31)) * 31, 31), 31), 31), 31), 31);
        String str = this.f59363y;
        int e14 = ep.b.e(this.A, ep.b.e(this.f59364z, (e13 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.B;
        int hashCode = (e14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.C;
        int e15 = ep.b.e(this.G, ep.b.e(this.F, ep.b.e(this.E, ep.b.e(this.D, (hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31), 31), 31);
        String str3 = this.H;
        int hashCode2 = (e15 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.I;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        sr srVar = this.f59337J;
        int hashCode4 = (((hashCode3 + (srVar == null ? 0 : srVar.hashCode())) * 31) + 0) * 31;
        h32.g0 g0Var = this.K;
        int e16 = ep.b.e(this.S, ep.b.e(this.R, ep.b.e(this.Q, ep.b.e(this.P, ep.b.e(this.O, ep.b.e(this.N, ep.b.e(this.M, ep.b.e(this.L, (hashCode4 + (g0Var == null ? 0 : g0Var.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        x32.e eVar = this.T;
        int hashCode5 = (e16 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str5 = this.U;
        int e17 = ep.b.e(this.V, (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        Integer num = this.W;
        return this.f59339a0.hashCode() + ep.b.e(this.Z, ep.b.e(this.Y, ep.b.e(this.X, (e17 + (num != null ? num.hashCode() : 0)) * 31, 31), 31), 31);
    }

    public final boolean i() {
        return this.N;
    }

    public final String toString() {
        return "MediaZoneVMState(pinModel=" + this.f59338a + ", position=" + this.f59340b + ", pinalyticsVMState=" + this.f59341c + ", experimentConfigs=" + this.f59342d + ", impressionVmState=" + this.f59343e + ", screenDensity=" + this.f59344f + ", lastIndexForPin=" + this.f59345g + ", cxcSlideShowStatus=" + this.f59346h + ", pinChipStatus=" + this.f59347i + ", mediaVisibility=" + this.f59348j + ", shouldTrackIdeaAdVideoPlaytime=" + this.f59349k + ", isDLCollectionEnabledAndActivated=" + this.f59350l + ", pinImageLoggingData=" + this.f59351m + ", viewAuxData=" + this.f59352n + ", initialTimeStamp=" + this.f59353o + ", columnIndexForLogging=" + this.f59354p + ", firstPageSize=" + this.f59355q + ", bitmapStatus=" + this.f59356r + ", visibilityStatus=" + this.f59357s + ", useLargestImageUrlFetched=" + this.f59358t + ", lastSlideshowIndexFromGrid=" + this.f59359u + ", gridCount=" + this.f59360v + ", commerceData=" + this.f59361w + ", isProductTag=" + this.f59362x + ", parentPinId=" + this.f59363y + ", isInAdsOnlyModule=" + this.f59364z + ", isInStlModule=" + this.A + ", storyType=" + this.B + ", isMultipleAdvertiser=" + this.C + ", isEligibleForPriceAndRatingsInSearch=" + this.D + ", isProductPageForPriceAndRatingsExperiment=" + this.E + ", isEligibleForPriceAndRatingsInRP=" + this.F + ", shouldRegisterAttributionSourceEvents=" + this.G + ", pinImageMediumUrl=" + this.H + ", pinImageLargeUrl=" + this.I + ", mediumImage=" + this.f59337J + ", ctaOverlayType=" + ((Object) null) + ", shoppingComponentType=" + this.K + ", isTablet=" + this.L + ", isLandscape=" + this.M + ", isVideoAutoplayAllowed=" + this.N + ", showAudioIndicatorOnGrid=" + this.O + ", isAudioIndicatorHidden=" + this.P + ", resizable=" + this.Q + ", isImageOnly=" + this.R + ", isAmazonAccountLinked=" + this.S + ", shoppingPinDecorationType=" + this.T + ", amazonDecorationText=" + this.U + ", isTargetAccountLinked=" + this.V + ", indexWithinAOM=" + this.W + ", parentIsIShoppingSlideshowPinCellView=" + this.X + ", shouldLogPrice=" + this.Y + ", shouldLogRating=" + this.Z + ", experimentsGroupInfo=" + this.f59339a0 + ")";
    }
}
