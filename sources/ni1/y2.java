package ni1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y2 implements l82.i0 {
    public final String A;
    public final nx.q B;
    public final int C;
    public final sr D;
    public final boolean E;
    public final boolean F;
    public final int G;
    public final int H;
    public final String I;

    /* renamed from: J, reason: collision with root package name */
    public final bk1.d2 f90900J;
    public final String K;
    public final boolean L;
    public final boolean M;
    public final String N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final Map T;
    public final boolean U;
    public final dk1.h V;
    public final ek1.r1 W;
    public final gk1.x0 X;
    public final hk1.v Y;
    public final fk1.w Z;

    /* renamed from: a, reason: collision with root package name */
    public final f30 f90901a;

    /* renamed from: a0, reason: collision with root package name */
    public final ck1.d f90902a0;

    /* renamed from: b, reason: collision with root package name */
    public final int f90903b;

    /* renamed from: b0, reason: collision with root package name */
    public final bk1.a2 f90904b0;

    /* renamed from: c, reason: collision with root package name */
    public final wa2.m f90905c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.l0 f90906d;

    /* renamed from: e, reason: collision with root package name */
    public final x2 f90907e;

    /* renamed from: f, reason: collision with root package name */
    public final w2 f90908f;

    /* renamed from: g, reason: collision with root package name */
    public final m60.z0 f90909g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f90910h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f90911i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f90912j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f90913k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f90914l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f90915m;

    /* renamed from: n, reason: collision with root package name */
    public final float f90916n;

    /* renamed from: o, reason: collision with root package name */
    public final long f90917o;

    /* renamed from: p, reason: collision with root package name */
    public final int f90918p;

    /* renamed from: q, reason: collision with root package name */
    public final HashMap f90919q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f90920r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f90921s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f90922t;

    /* renamed from: u, reason: collision with root package name */
    public final String f90923u;

    /* renamed from: v, reason: collision with root package name */
    public final Boolean f90924v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f90925w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f90926x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f90927y;

    /* renamed from: z, reason: collision with root package name */
    public final String f90928z;

    public y2(f30 pinModel, int i13, wa2.m pinFeatureConfig, zy.l0 pinalyticsVMState, x2 experimentConfigs, w2 adDebugConfig, m60.z0 debuggingSignalType, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, float f13, long j13, int i14, HashMap viewAuxData, Integer num, boolean z19, boolean z23, String str, Boolean bool, boolean z24, boolean z25, boolean z26, String str2, String str3, nx.q commerceData, int i15, sr srVar, boolean z27, boolean z28, int i16, int i17, String str4, bk1.d2 deferredClickthroughValues, String str5, boolean z29, boolean z33, String str6, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, Map experimentsGroupInfo, boolean z39, dk1.h headerZone, ek1.r1 mediaZone, gk1.x0 overlayZone, hk1.v trailingAccessoryZone, fk1.w metadataZone, ck1.d footerZone, bk1.a2 clickThrough) {
        Intrinsics.checkNotNullParameter(pinModel, "pinModel");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(experimentConfigs, "experimentConfigs");
        Intrinsics.checkNotNullParameter(adDebugConfig, "adDebugConfig");
        Intrinsics.checkNotNullParameter(debuggingSignalType, "debuggingSignalType");
        Intrinsics.checkNotNullParameter(viewAuxData, "viewAuxData");
        Intrinsics.checkNotNullParameter(commerceData, "commerceData");
        Intrinsics.checkNotNullParameter(deferredClickthroughValues, "deferredClickthroughValues");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        Intrinsics.checkNotNullParameter(headerZone, "headerZone");
        Intrinsics.checkNotNullParameter(mediaZone, "mediaZone");
        Intrinsics.checkNotNullParameter(overlayZone, "overlayZone");
        Intrinsics.checkNotNullParameter(trailingAccessoryZone, "trailingAccessoryZone");
        Intrinsics.checkNotNullParameter(metadataZone, "metadataZone");
        Intrinsics.checkNotNullParameter(footerZone, "footerZone");
        Intrinsics.checkNotNullParameter(clickThrough, "clickThrough");
        this.f90901a = pinModel;
        this.f90903b = i13;
        this.f90905c = pinFeatureConfig;
        this.f90906d = pinalyticsVMState;
        this.f90907e = experimentConfigs;
        this.f90908f = adDebugConfig;
        this.f90909g = debuggingSignalType;
        this.f90910h = z13;
        this.f90911i = z14;
        this.f90912j = z15;
        this.f90913k = z16;
        this.f90914l = z17;
        this.f90915m = z18;
        this.f90916n = f13;
        this.f90917o = j13;
        this.f90918p = i14;
        this.f90919q = viewAuxData;
        this.f90920r = num;
        this.f90921s = z19;
        this.f90922t = z23;
        this.f90923u = str;
        this.f90924v = bool;
        this.f90925w = z24;
        this.f90926x = z25;
        this.f90927y = z26;
        this.f90928z = str2;
        this.A = str3;
        this.B = commerceData;
        this.C = i15;
        this.D = srVar;
        this.E = z27;
        this.F = z28;
        this.G = i16;
        this.H = i17;
        this.I = str4;
        this.f90900J = deferredClickthroughValues;
        this.K = str5;
        this.L = z29;
        this.M = z33;
        this.N = str6;
        this.O = z34;
        this.P = z35;
        this.Q = z36;
        this.R = z37;
        this.S = z38;
        this.T = experimentsGroupInfo;
        this.U = z39;
        this.V = headerZone;
        this.W = mediaZone;
        this.X = overlayZone;
        this.Y = trailingAccessoryZone;
        this.Z = metadataZone;
        this.f90902a0 = footerZone;
        this.f90904b0 = clickThrough;
    }

    public static y2 b(y2 y2Var, wa2.m mVar, zy.l0 l0Var, Integer num, boolean z13, boolean z14, String str, Boolean bool, boolean z15, boolean z16, boolean z17, boolean z18, int i13, boolean z19, boolean z23, dk1.h hVar, ek1.r1 r1Var, gk1.x0 x0Var, hk1.v vVar, fk1.w wVar, ck1.d dVar, bk1.a2 a2Var, int i14, int i15) {
        int i16;
        Integer num2;
        boolean z24;
        boolean z25;
        sr srVar;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        ek1.r1 mediaZone;
        boolean z33;
        gk1.x0 overlayZone;
        int i17;
        hk1.v vVar2;
        hk1.v vVar3;
        fk1.w wVar2;
        fk1.w wVar3;
        ck1.d footerZone;
        f30 pinModel = y2Var.f90901a;
        int i18 = y2Var.f90903b;
        wa2.m pinFeatureConfig = (i14 & 4) != 0 ? y2Var.f90905c : mVar;
        zy.l0 pinalyticsVMState = (i14 & 8) != 0 ? y2Var.f90906d : l0Var;
        x2 experimentConfigs = y2Var.f90907e;
        w2 adDebugConfig = y2Var.f90908f;
        m60.z0 debuggingSignalType = y2Var.f90909g;
        boolean z34 = y2Var.f90910h;
        boolean z35 = y2Var.f90911i;
        boolean z36 = y2Var.f90912j;
        boolean z37 = y2Var.f90913k;
        boolean z38 = y2Var.f90914l;
        boolean z39 = y2Var.f90915m;
        float f13 = y2Var.f90916n;
        long j13 = y2Var.f90917o;
        int i19 = y2Var.f90918p;
        HashMap viewAuxData = y2Var.f90919q;
        if ((i14 & 131072) != 0) {
            i16 = i19;
            num2 = y2Var.f90920r;
        } else {
            i16 = i19;
            num2 = num;
        }
        boolean z43 = (i14 & 262144) != 0 ? y2Var.f90921s : z13;
        boolean z44 = (i14 & 524288) != 0 ? y2Var.f90922t : z14;
        String str2 = (i14 & 1048576) != 0 ? y2Var.f90923u : str;
        Boolean bool2 = (i14 & 2097152) != 0 ? y2Var.f90924v : bool;
        boolean z45 = (i14 & 4194304) != 0 ? y2Var.f90925w : z15;
        boolean z46 = y2Var.f90926x;
        if ((i14 & 16777216) != 0) {
            z24 = z46;
            z25 = y2Var.f90927y;
        } else {
            z24 = z46;
            z25 = z16;
        }
        String str3 = y2Var.f90928z;
        String str4 = y2Var.A;
        nx.q commerceData = y2Var.B;
        int i23 = y2Var.C;
        sr srVar2 = y2Var.D;
        if ((i14 & 1073741824) != 0) {
            srVar = srVar2;
            z26 = y2Var.E;
        } else {
            srVar = srVar2;
            z26 = z17;
        }
        boolean z47 = (i14 & Integer.MIN_VALUE) != 0 ? y2Var.F : z18;
        int i24 = (i15 & 1) != 0 ? y2Var.G : i13;
        int i25 = y2Var.H;
        String str5 = y2Var.I;
        bk1.d2 deferredClickthroughValues = y2Var.f90900J;
        String str6 = y2Var.K;
        boolean z48 = y2Var.L;
        if ((i15 & 64) != 0) {
            z27 = z48;
            z28 = y2Var.M;
        } else {
            z27 = z48;
            z28 = z19;
        }
        String str7 = y2Var.N;
        boolean z49 = y2Var.O;
        boolean z53 = y2Var.P;
        boolean z54 = y2Var.Q;
        boolean z55 = y2Var.R;
        boolean z56 = y2Var.S;
        Map experimentsGroupInfo = y2Var.T;
        boolean z57 = (i15 & 16384) != 0 ? y2Var.U : z23;
        dk1.h headerZone = (32768 & i15) != 0 ? y2Var.V : hVar;
        if ((i15 & 65536) != 0) {
            z29 = z35;
            mediaZone = y2Var.W;
        } else {
            z29 = z35;
            mediaZone = r1Var;
        }
        if ((i15 & 131072) != 0) {
            z33 = z34;
            overlayZone = y2Var.X;
        } else {
            z33 = z34;
            overlayZone = x0Var;
        }
        if ((i15 & 262144) != 0) {
            i17 = i18;
            vVar2 = y2Var.Y;
        } else {
            i17 = i18;
            vVar2 = vVar;
        }
        if ((i15 & 524288) != 0) {
            vVar3 = vVar2;
            wVar2 = y2Var.Z;
        } else {
            vVar3 = vVar2;
            wVar2 = wVar;
        }
        if ((i15 & 1048576) != 0) {
            wVar3 = wVar2;
            footerZone = y2Var.f90902a0;
        } else {
            wVar3 = wVar2;
            footerZone = dVar;
        }
        bk1.a2 clickThrough = (i15 & 2097152) != 0 ? y2Var.f90904b0 : a2Var;
        y2Var.getClass();
        Intrinsics.checkNotNullParameter(pinModel, "pinModel");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(experimentConfigs, "experimentConfigs");
        Intrinsics.checkNotNullParameter(adDebugConfig, "adDebugConfig");
        Intrinsics.checkNotNullParameter(debuggingSignalType, "debuggingSignalType");
        Intrinsics.checkNotNullParameter(viewAuxData, "viewAuxData");
        Intrinsics.checkNotNullParameter(commerceData, "commerceData");
        Intrinsics.checkNotNullParameter(deferredClickthroughValues, "deferredClickthroughValues");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        Intrinsics.checkNotNullParameter(headerZone, "headerZone");
        Intrinsics.checkNotNullParameter(mediaZone, "mediaZone");
        Intrinsics.checkNotNullParameter(overlayZone, "overlayZone");
        gk1.x0 x0Var2 = overlayZone;
        hk1.v trailingAccessoryZone = vVar3;
        Intrinsics.checkNotNullParameter(trailingAccessoryZone, "trailingAccessoryZone");
        fk1.w metadataZone = wVar3;
        Intrinsics.checkNotNullParameter(metadataZone, "metadataZone");
        Intrinsics.checkNotNullParameter(footerZone, "footerZone");
        Intrinsics.checkNotNullParameter(clickThrough, "clickThrough");
        return new y2(pinModel, i17, pinFeatureConfig, pinalyticsVMState, experimentConfigs, adDebugConfig, debuggingSignalType, z33, z29, z36, z37, z38, z39, f13, j13, i16, viewAuxData, num2, z43, z44, str2, bool2, z45, z24, z25, str3, str4, commerceData, i23, srVar, z26, z47, i24, i25, str5, deferredClickthroughValues, str6, z27, z28, str7, z49, z53, z54, z55, z56, experimentsGroupInfo, z57, headerZone, mediaZone, x0Var2, vVar3, metadataZone, footerZone, clickThrough);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return Intrinsics.d(this.f90901a, y2Var.f90901a) && this.f90903b == y2Var.f90903b && Intrinsics.d(this.f90905c, y2Var.f90905c) && Intrinsics.d(this.f90906d, y2Var.f90906d) && Intrinsics.d(this.f90907e, y2Var.f90907e) && Intrinsics.d(this.f90908f, y2Var.f90908f) && this.f90909g == y2Var.f90909g && this.f90910h == y2Var.f90910h && this.f90911i == y2Var.f90911i && this.f90912j == y2Var.f90912j && this.f90913k == y2Var.f90913k && this.f90914l == y2Var.f90914l && this.f90915m == y2Var.f90915m && Float.compare(this.f90916n, y2Var.f90916n) == 0 && this.f90917o == y2Var.f90917o && this.f90918p == y2Var.f90918p && Intrinsics.d(this.f90919q, y2Var.f90919q) && Intrinsics.d(this.f90920r, y2Var.f90920r) && this.f90921s == y2Var.f90921s && this.f90922t == y2Var.f90922t && Intrinsics.d(this.f90923u, y2Var.f90923u) && Intrinsics.d(this.f90924v, y2Var.f90924v) && this.f90925w == y2Var.f90925w && this.f90926x == y2Var.f90926x && this.f90927y == y2Var.f90927y && Intrinsics.d(this.f90928z, y2Var.f90928z) && Intrinsics.d(this.A, y2Var.A) && Intrinsics.d(this.B, y2Var.B) && this.C == y2Var.C && Intrinsics.d(this.D, y2Var.D) && this.E == y2Var.E && this.F == y2Var.F && this.G == y2Var.G && this.H == y2Var.H && Intrinsics.d(this.I, y2Var.I) && Intrinsics.d(this.f90900J, y2Var.f90900J) && Intrinsics.d(this.K, y2Var.K) && this.L == y2Var.L && this.M == y2Var.M && Intrinsics.d(this.N, y2Var.N) && this.O == y2Var.O && this.P == y2Var.P && this.Q == y2Var.Q && this.R == y2Var.R && this.S == y2Var.S && Intrinsics.d(this.T, y2Var.T) && this.U == y2Var.U && Intrinsics.d(this.V, y2Var.V) && Intrinsics.d(this.W, y2Var.W) && Intrinsics.d(this.X, y2Var.X) && Intrinsics.d(this.Y, y2Var.Y) && Intrinsics.d(this.Z, y2Var.Z) && Intrinsics.d(this.f90902a0, y2Var.f90902a0) && Intrinsics.d(this.f90904b0, y2Var.f90904b0);
    }

    public final int hashCode() {
        int d2 = a.c.d(this.f90919q, ep.b.b(this.f90918p, a.a.c(this.f90917o, a.a.a(this.f90916n, ep.b.e(this.f90915m, ep.b.e(this.f90914l, ep.b.e(this.f90913k, ep.b.e(this.f90912j, ep.b.e(this.f90911i, ep.b.e(this.f90910h, (this.f90909g.hashCode() + ((this.f90908f.hashCode() + ((this.f90907e.hashCode() + jq.b.a(this.f90906d, (this.f90905c.hashCode() + ep.b.b(this.f90903b, this.f90901a.hashCode() * 31, 31)) * 31, 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        Integer num = this.f90920r;
        int e13 = ep.b.e(this.f90922t, ep.b.e(this.f90921s, (d2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
        String str = this.f90923u;
        int hashCode = (e13 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f90924v;
        int e14 = ep.b.e(this.f90927y, ep.b.e(this.f90926x, ep.b.e(this.f90925w, (hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31), 31);
        String str2 = this.f90928z;
        int hashCode2 = (e14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A;
        int b13 = ep.b.b(this.C, a.c.e(this.B.f92450a, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        sr srVar = this.D;
        int b14 = ep.b.b(this.H, ep.b.b(this.G, ep.b.e(this.F, ep.b.e(this.E, (b13 + (srVar == null ? 0 : srVar.hashCode())) * 31, 31), 31), 31), 31);
        String str4 = this.I;
        int hashCode3 = (this.f90900J.hashCode() + ((b14 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        String str5 = this.K;
        int e15 = ep.b.e(this.M, ep.b.e(this.L, (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31);
        String str6 = this.N;
        return this.f90904b0.hashCode() + ((this.f90902a0.hashCode() + ((this.Z.hashCode() + ((this.Y.hashCode() + ((this.X.hashCode() + ((this.W.hashCode() + ((this.V.hashCode() + ep.b.e(this.U, a.c.e(this.T, ep.b.e(this.S, ep.b.e(this.R, ep.b.e(this.Q, ep.b.e(this.P, ep.b.e(this.O, (e15 + (str6 != null ? str6.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PinRepVmState(pinModel=" + this.f90901a + ", position=" + this.f90903b + ", pinFeatureConfig=" + this.f90905c + ", pinalyticsVMState=" + this.f90906d + ", experimentConfigs=" + this.f90907e + ", adDebugConfig=" + this.f90908f + ", debuggingSignalType=" + this.f90909g + ", isUserCountryUS=" + this.f90910h + ", isPinnerAccount=" + this.f90911i + ", isTablet=" + this.f90912j + ", isLandscape=" + this.f90913k + ", isAutoplayAllowed=" + this.f90914l + ", isRTL=" + this.f90915m + ", screenDensity=" + this.f90916n + ", initialTimeStamp=" + this.f90917o + ", firstPageSize=" + this.f90918p + ", viewAuxData=" + this.f90919q + ", indexWithinAOM=" + this.f90920r + ", isInAdsOnlyModule=" + this.f90921s + ", isInStlModule=" + this.f90922t + ", storyType=" + this.f90923u + ", isMultipleAdvertiser=" + this.f90924v + ", preventLongPressAndClickthrough=" + this.f90925w + ", supportDragAndDrop=" + this.f90926x + ", shouldRegisterAttributionSourceEvents=" + this.f90927y + ", pinImageMediumUrl=" + this.f90928z + ", pinImageLargeUrl=" + this.A + ", commerceData=" + this.B + ", gridCount=" + this.C + ", mediumImage=" + this.D + ", isMutedOnGrid=" + this.E + ", showAudioIndicatorOnGrid=" + this.F + ", lastIndexForPin=" + this.G + ", lastSlideshowIndexFromGrid=" + this.H + ", trackingParams=" + this.I + ", deferredClickthroughValues=" + this.f90900J + ", clickThroughUrl=" + this.K + ", isVRTheme=" + this.L + ", isDLCollection=" + this.M + ", userUid=" + this.N + ", isButtonOverlayVisible=" + this.O + ", shouldLogPrice=" + this.P + ", shouldLogRating=" + this.Q + ", shouldDisplayPrice=" + this.R + ", shouldDisplayRating=" + this.S + ", experimentsGroupInfo=" + this.T + ", resizable=" + this.U + ", headerZone=" + this.V + ", mediaZone=" + this.W + ", overlayZone=" + this.X + ", trailingAccessoryZone=" + this.Y + ", metadataZone=" + this.Z + ", footerZone=" + this.f90902a0 + ", clickThrough=" + this.f90904b0 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y2(com.pinterest.api.model.f30 r139, int r140, wa2.m r141, zy.l0 r142, ni1.x2 r143, ni1.w2 r144, m60.z0 r145, boolean r146, boolean r147, boolean r148, boolean r149, boolean r150, boolean r151, float r152, long r153, int r155, java.util.HashMap r156, java.lang.String r157, java.lang.String r158, int r159, com.pinterest.api.model.sr r160, int r161, int r162, java.lang.String r163, bk1.c2 r164, java.lang.String r165, boolean r166, java.lang.String r167, boolean r168, java.util.AbstractMap r169, int r170, int r171) {
        /*
            Method dump skipped, instructions count: 1185
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ni1.y2.<init>(com.pinterest.api.model.f30, int, wa2.m, zy.l0, ni1.x2, ni1.w2, m60.z0, boolean, boolean, boolean, boolean, boolean, boolean, float, long, int, java.util.HashMap, java.lang.String, java.lang.String, int, com.pinterest.api.model.sr, int, int, java.lang.String, bk1.c2, java.lang.String, boolean, java.lang.String, boolean, java.util.AbstractMap, int, int):void");
    }
}
