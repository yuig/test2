package gk1;

import com.pinterest.api.model.f30;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import m60.z0;
import ni1.x2;

/* loaded from: classes2.dex */
public final class x0 implements l82.i0 {
    public final boolean A;
    public final boolean B;
    public final int C;
    public final List D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final h32.g0 I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f65292J;
    public final boolean K;
    public final String L;
    public final Map M;

    /* renamed from: a, reason: collision with root package name */
    public final f30 f65293a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65294b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f65295c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65296d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f65297e;

    /* renamed from: f, reason: collision with root package name */
    public final zy.l0 f65298f;

    /* renamed from: g, reason: collision with root package name */
    public final x2 f65299g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f65300h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f65301i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f65302j;

    /* renamed from: k, reason: collision with root package name */
    public final z0 f65303k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f65304l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f65305m;

    /* renamed from: n, reason: collision with root package name */
    public final int f65306n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f65307o;

    /* renamed from: p, reason: collision with root package name */
    public final String f65308p;

    /* renamed from: q, reason: collision with root package name */
    public final Boolean f65309q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f65310r;

    /* renamed from: s, reason: collision with root package name */
    public final String f65311s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f65312t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f65313u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f65314v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f65315w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f65316x;

    /* renamed from: y, reason: collision with root package name */
    public final nx.q f65317y;

    /* renamed from: z, reason: collision with root package name */
    public final int f65318z;

    public x0(f30 pinModel, int i13, boolean z13, boolean z14, boolean z15, zy.l0 pinalyticsVMState, x2 experimentConfigs, boolean z16, boolean z17, boolean z18, z0 debuggingSignalType, boolean z19, boolean z23, int i14, boolean z24, String str, Boolean bool, boolean z25, String str2, boolean z26, boolean z27, HashMap viewAuxData, Integer num, Integer num2, nx.q commerceData, int i15, boolean z28, boolean z29, int i16, List piecesToHide, boolean z33, boolean z34, boolean z35, lf.a aVar, boolean z36, h32.g0 g0Var, boolean z37, boolean z38, String str3, Map experimentsGroupInfo) {
        Intrinsics.checkNotNullParameter(pinModel, "pinModel");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(experimentConfigs, "experimentConfigs");
        Intrinsics.checkNotNullParameter(debuggingSignalType, "debuggingSignalType");
        Intrinsics.checkNotNullParameter(viewAuxData, "viewAuxData");
        Intrinsics.checkNotNullParameter(commerceData, "commerceData");
        Intrinsics.checkNotNullParameter(piecesToHide, "piecesToHide");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        this.f65293a = pinModel;
        this.f65294b = i13;
        this.f65295c = z13;
        this.f65296d = z14;
        this.f65297e = z15;
        this.f65298f = pinalyticsVMState;
        this.f65299g = experimentConfigs;
        this.f65300h = z16;
        this.f65301i = z17;
        this.f65302j = z18;
        this.f65303k = debuggingSignalType;
        this.f65304l = z19;
        this.f65305m = z23;
        this.f65306n = i14;
        this.f65307o = z24;
        this.f65308p = str;
        this.f65309q = bool;
        this.f65310r = z25;
        this.f65311s = str2;
        this.f65312t = z26;
        this.f65313u = z27;
        this.f65314v = viewAuxData;
        this.f65315w = num;
        this.f65316x = num2;
        this.f65317y = commerceData;
        this.f65318z = i15;
        this.A = z28;
        this.B = z29;
        this.C = i16;
        this.D = piecesToHide;
        this.E = z33;
        this.F = z34;
        this.G = z35;
        this.H = z36;
        this.I = g0Var;
        this.f65292J = z37;
        this.K = z38;
        this.L = str3;
        this.M = experimentsGroupInfo;
    }

    public static x0 b(x0 x0Var, boolean z13, boolean z14, boolean z15, zy.l0 l0Var, int i13, boolean z16, String str, Boolean bool, boolean z17, String str2, boolean z18, List list, boolean z19, boolean z23, boolean z24, lf.a aVar, h32.g0 g0Var, boolean z25, boolean z26, String str3, int i14, int i15) {
        int i16;
        List piecesToHide;
        boolean z27;
        boolean z28;
        lf.a aVar2;
        f30 pinModel = x0Var.f65293a;
        int i17 = x0Var.f65294b;
        boolean z29 = (i14 & 4) != 0 ? x0Var.f65295c : z13;
        boolean z33 = (i14 & 8) != 0 ? x0Var.f65296d : z14;
        boolean z34 = (i14 & 16) != 0 ? x0Var.f65297e : z15;
        zy.l0 pinalyticsVMState = (i14 & 32) != 0 ? x0Var.f65298f : l0Var;
        x2 experimentConfigs = x0Var.f65299g;
        boolean z35 = x0Var.f65300h;
        boolean z36 = x0Var.f65301i;
        boolean z37 = x0Var.f65302j;
        z0 debuggingSignalType = x0Var.f65303k;
        boolean z38 = x0Var.f65304l;
        boolean z39 = x0Var.f65305m;
        int i18 = (i14 & 8192) != 0 ? x0Var.f65306n : i13;
        boolean z43 = (i14 & 16384) != 0 ? x0Var.f65307o : z16;
        String str4 = (i14 & 32768) != 0 ? x0Var.f65308p : str;
        Boolean bool2 = (65536 & i14) != 0 ? x0Var.f65309q : bool;
        boolean z44 = (131072 & i14) != 0 ? x0Var.f65310r : z17;
        String str5 = (262144 & i14) != 0 ? x0Var.f65311s : str2;
        boolean z45 = (524288 & i14) != 0 ? x0Var.f65312t : z18;
        boolean z46 = x0Var.f65313u;
        HashMap viewAuxData = x0Var.f65314v;
        Integer num = x0Var.f65315w;
        Integer num2 = x0Var.f65316x;
        nx.q commerceData = x0Var.f65317y;
        int i19 = x0Var.f65318z;
        boolean z47 = x0Var.A;
        boolean z48 = x0Var.B;
        int i23 = x0Var.C;
        if ((i14 & 536870912) != 0) {
            i16 = i23;
            piecesToHide = x0Var.D;
        } else {
            i16 = i23;
            piecesToHide = list;
        }
        if ((i14 & 1073741824) != 0) {
            z27 = z37;
            z28 = x0Var.E;
        } else {
            z27 = z37;
            z28 = z19;
        }
        boolean z49 = (i14 & Integer.MIN_VALUE) != 0 ? x0Var.F : z23;
        boolean z53 = (i15 & 1) != 0 ? x0Var.G : z24;
        if ((i15 & 2) != 0) {
            x0Var.getClass();
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        boolean z54 = x0Var.H;
        h32.g0 g0Var2 = (i15 & 8) != 0 ? x0Var.I : g0Var;
        boolean z55 = (i15 & 16) != 0 ? x0Var.f65292J : z25;
        boolean z56 = (i15 & 32) != 0 ? x0Var.K : z26;
        String str6 = (i15 & 64) != 0 ? x0Var.L : str3;
        Map experimentsGroupInfo = x0Var.M;
        x0Var.getClass();
        Intrinsics.checkNotNullParameter(pinModel, "pinModel");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(experimentConfigs, "experimentConfigs");
        Intrinsics.checkNotNullParameter(debuggingSignalType, "debuggingSignalType");
        Intrinsics.checkNotNullParameter(viewAuxData, "viewAuxData");
        Intrinsics.checkNotNullParameter(commerceData, "commerceData");
        Intrinsics.checkNotNullParameter(piecesToHide, "piecesToHide");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        return new x0(pinModel, i17, z29, z33, z34, pinalyticsVMState, experimentConfigs, z35, z36, z27, debuggingSignalType, z38, z39, i18, z43, str4, bool2, z44, str5, z45, z46, viewAuxData, num, num2, commerceData, i19, z47, z48, i16, piecesToHide, z28, z49, z53, aVar2, z54, g0Var2, z55, z56, str6, experimentsGroupInfo);
    }

    public final String d() {
        return this.f65311s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (!Intrinsics.d(this.f65293a, x0Var.f65293a) || this.f65294b != x0Var.f65294b || this.f65295c != x0Var.f65295c || this.f65296d != x0Var.f65296d || this.f65297e != x0Var.f65297e || !Intrinsics.d(this.f65298f, x0Var.f65298f) || !Intrinsics.d(this.f65299g, x0Var.f65299g) || this.f65300h != x0Var.f65300h || this.f65301i != x0Var.f65301i || this.f65302j != x0Var.f65302j || this.f65303k != x0Var.f65303k || this.f65304l != x0Var.f65304l || this.f65305m != x0Var.f65305m || this.f65306n != x0Var.f65306n || this.f65307o != x0Var.f65307o || !Intrinsics.d(this.f65308p, x0Var.f65308p) || !Intrinsics.d(this.f65309q, x0Var.f65309q) || this.f65310r != x0Var.f65310r || !Intrinsics.d(this.f65311s, x0Var.f65311s) || this.f65312t != x0Var.f65312t || this.f65313u != x0Var.f65313u || !Intrinsics.d(this.f65314v, x0Var.f65314v) || !Intrinsics.d(this.f65315w, x0Var.f65315w) || !Intrinsics.d(this.f65316x, x0Var.f65316x) || !Intrinsics.d(this.f65317y, x0Var.f65317y) || this.f65318z != x0Var.f65318z || this.A != x0Var.A || this.B != x0Var.B || this.C != x0Var.C || !Intrinsics.d(this.D, x0Var.D) || this.E != x0Var.E || this.F != x0Var.F || this.G != x0Var.G) {
            return false;
        }
        x0Var.getClass();
        return Intrinsics.d(null, null) && this.H == x0Var.H && this.I == x0Var.I && this.f65292J == x0Var.f65292J && this.K == x0Var.K && Intrinsics.d(this.L, x0Var.L) && Intrinsics.d(this.M, x0Var.M);
    }

    public final boolean f() {
        return this.K;
    }

    public final zy.l0 h() {
        return this.f65298f;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f65307o, ep.b.b(this.f65306n, ep.b.e(this.f65305m, ep.b.e(this.f65304l, (this.f65303k.hashCode() + ep.b.e(this.f65302j, ep.b.e(this.f65301i, ep.b.e(this.f65300h, (this.f65299g.hashCode() + jq.b.a(this.f65298f, ep.b.e(this.f65297e, ep.b.e(this.f65296d, ep.b.e(this.f65295c, ep.b.b(this.f65294b, this.f65293a.hashCode() * 31, 31), 31), 31), 31), 31)) * 31, 31), 31), 31)) * 31, 31), 31), 31), 31);
        String str = this.f65308p;
        int hashCode = (e13 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f65309q;
        int e14 = ep.b.e(this.f65310r, (hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        String str2 = this.f65311s;
        int d2 = a.c.d(this.f65314v, ep.b.e(this.f65313u, ep.b.e(this.f65312t, (e14 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31);
        Integer num = this.f65315w;
        int hashCode2 = (d2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f65316x;
        int e15 = ep.b.e(this.H, (ep.b.e(this.G, ep.b.e(this.F, ep.b.e(this.E, ep.b.c(this.D, ep.b.b(this.C, ep.b.e(this.B, ep.b.e(this.A, ep.b.b(this.f65318z, a.c.e(this.f65317y.f92450a, (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31) + 0) * 31, 31);
        h32.g0 g0Var = this.I;
        int e16 = ep.b.e(this.K, ep.b.e(this.f65292J, (e15 + (g0Var == null ? 0 : g0Var.hashCode())) * 31, 31), 31);
        String str3 = this.L;
        return this.M.hashCode() + ((e16 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final boolean i() {
        return this.F;
    }

    public final boolean m() {
        return this.f65312t;
    }

    public final String toString() {
        return "OverlayZoneVMState(pinModel=" + this.f65293a + ", position=" + this.f65294b + ", isInAdsOnlyModule=" + this.f65295c + ", isInStlModule=" + this.f65296d + ", shouldRenderStoryPinIndicatorText=" + this.f65297e + ", pinalyticsVMState=" + this.f65298f + ", experimentConfigs=" + this.f65299g + ", isUserCountryUS=" + this.f65300h + ", isTablet=" + this.f65301i + ", isLandscape=" + this.f65302j + ", debuggingSignalType=" + this.f65303k + ", isAutoplayAllowed=" + this.f65304l + ", isRTL=" + this.f65305m + ", lastIndexForPin=" + this.f65306n + ", usePinIdForTapAuxData=" + this.f65307o + ", storyType=" + this.f65308p + ", isMultipleAdvertiser=" + this.f65309q + ", logComponentForPinClick=" + this.f65310r + ", parentPinId=" + this.f65311s + ", isProductTag=" + this.f65312t + ", shouldRegisterAttributionSourceEvents=" + this.f65313u + ", viewAuxData=" + this.f65314v + ", collectionPosition=" + this.f65315w + ", indexWithinAOM=" + this.f65316x + ", commerceData=" + this.f65317y + ", gridCount=" + this.f65318z + ", hasPinChips=" + this.A + ", isDLCollection=" + this.B + ", columnIndexForLogging=" + this.C + ", piecesToHide=" + this.D + ", showAudioIndicatorOnGrid=" + this.E + ", isCurrentlyMuted=" + this.F + ", hasVideoViewStateBeenSet=" + this.G + ", ctaOverlayType=" + ((Object) null) + ", isVRTheme=" + this.H + ", shoppingComponentType=" + this.I + ", isImageOnly=" + this.f65292J + ", isButtonOverlayVisible=" + this.K + ", emitButtonOverlayImpressionPinId=" + this.L + ", experimentsGroupInfo=" + this.M + ")";
    }

    public x0(f30 f30Var, int i13, boolean z13, boolean z14, zy.l0 l0Var, x2 x2Var, boolean z15, boolean z16, boolean z17, z0 z0Var, boolean z18, boolean z19, boolean z23, String str, Boolean bool, boolean z24, String str2, boolean z25, HashMap hashMap, nx.q qVar, int i14, boolean z26, boolean z27, Map map) {
        this(f30Var, i13, z13, z14, true, l0Var, x2Var, z15, z16, z17, z0Var, z18, z19, 0, z23, str, bool, z24, str2, z25, true, hashMap, null, null, qVar, i14, false, false, -1, kotlin.collections.q0.f80391a, false, true, false, null, z26, null, false, z27, null, map);
    }
}
