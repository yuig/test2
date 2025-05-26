package ot1;

import a.cb;
import android.graphics.Rect;
import java.util.ArrayList;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z0 {
    public final long A;
    public final long B;
    public final boolean C;
    public final Boolean D;
    public final boolean E;
    public final Rect F;
    public final d1 G;
    public final long H;

    /* renamed from: a, reason: collision with root package name */
    public final long f97654a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f97655b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f97656c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f97657d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f97658e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f97659f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f97660g;

    /* renamed from: h, reason: collision with root package name */
    public final long f97661h;

    /* renamed from: i, reason: collision with root package name */
    public final long f97662i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.e0 f97663j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f97664k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.e0 f97665l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.e0 f97666m;

    /* renamed from: n, reason: collision with root package name */
    public final Boolean f97667n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f97668o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f97669p;

    /* renamed from: q, reason: collision with root package name */
    public final long f97670q;

    /* renamed from: r, reason: collision with root package name */
    public final long f97671r;

    /* renamed from: s, reason: collision with root package name */
    public final xk2.e0 f97672s;

    /* renamed from: t, reason: collision with root package name */
    public final Boolean f97673t;

    /* renamed from: u, reason: collision with root package name */
    public final Long f97674u;

    /* renamed from: v, reason: collision with root package name */
    public final Long f97675v;

    /* renamed from: w, reason: collision with root package name */
    public final xk2.e0 f97676w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f97677x;

    /* renamed from: y, reason: collision with root package name */
    public final long f97678y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f97679z;

    public z0(long j13, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, long j14, long j15, xk2.e0 e0Var, Boolean bool, xk2.e0 e0Var2, xk2.e0 e0Var3, Boolean bool2, ArrayList arrayList, ArrayList arrayList2, long j16, long j17, xk2.e0 e0Var4, Boolean bool3, Long l13, Long l14, xk2.e0 e0Var5, ArrayList arrayList3, long j18, boolean z19, long j19, long j23, boolean z23, Boolean bool4, boolean z24, Rect rect, d1 d1Var) {
        this.f97654a = j13;
        this.f97655b = z13;
        this.f97656c = z14;
        this.f97657d = z15;
        this.f97658e = z16;
        this.f97659f = z17;
        this.f97660g = z18;
        this.f97661h = j14;
        this.f97662i = j15;
        this.f97663j = e0Var;
        this.f97664k = bool;
        this.f97665l = e0Var2;
        this.f97666m = e0Var3;
        this.f97667n = bool2;
        this.f97668o = arrayList;
        this.f97669p = arrayList2;
        this.f97670q = j16;
        this.f97671r = j17;
        this.f97672s = e0Var4;
        this.f97673t = bool3;
        this.f97674u = l13;
        this.f97675v = l14;
        this.f97676w = e0Var5;
        this.f97677x = arrayList3;
        this.f97678y = j18;
        this.f97679z = z19;
        this.A = j19;
        this.B = j23;
        this.C = z23;
        this.D = bool4;
        this.E = z24;
        this.F = rect;
        this.G = d1Var;
        if (j17 == 0) {
            if (e0Var4 == null) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (bool3 != null) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (j17 == 1) {
            if (e0Var4 != null) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (bool3 == null) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        xk2.d0 d0Var = xk2.e0.f135207b;
        this.H = j19 * j23;
        if (!Intrinsics.d(bool, Boolean.TRUE) || e0Var == null || e0Var.f135208a == 3) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f97654a == z0Var.f97654a && this.f97655b == z0Var.f97655b && this.f97656c == z0Var.f97656c && this.f97657d == z0Var.f97657d && this.f97658e == z0Var.f97658e && this.f97659f == z0Var.f97659f && this.f97660g == z0Var.f97660g && this.f97661h == z0Var.f97661h && this.f97662i == z0Var.f97662i && Intrinsics.d(this.f97663j, z0Var.f97663j) && Intrinsics.d(this.f97664k, z0Var.f97664k) && Intrinsics.d(this.f97665l, z0Var.f97665l) && Intrinsics.d(this.f97666m, z0Var.f97666m) && Intrinsics.d(this.f97667n, z0Var.f97667n) && Intrinsics.d(this.f97668o, z0Var.f97668o) && Intrinsics.d(this.f97669p, z0Var.f97669p) && this.f97670q == z0Var.f97670q && this.f97671r == z0Var.f97671r && Intrinsics.d(this.f97672s, z0Var.f97672s) && Intrinsics.d(this.f97673t, z0Var.f97673t) && Intrinsics.d(this.f97674u, z0Var.f97674u) && Intrinsics.d(this.f97675v, z0Var.f97675v) && Intrinsics.d(this.f97676w, z0Var.f97676w) && Intrinsics.d(this.f97677x, z0Var.f97677x) && this.f97678y == z0Var.f97678y && this.f97679z == z0Var.f97679z && this.A == z0Var.A && this.B == z0Var.B && this.C == z0Var.C && Intrinsics.d(this.D, z0Var.D) && this.E == z0Var.E && Intrinsics.d(this.F, z0Var.F) && Intrinsics.d(this.G, z0Var.G);
    }

    public final int hashCode() {
        xk2.d0 d0Var = xk2.e0.f135207b;
        int c13 = a.a.c(this.f97662i, a.a.c(this.f97661h, ep.b.e(this.f97660g, ep.b.e(this.f97659f, ep.b.e(this.f97658e, ep.b.e(this.f97657d, ep.b.e(this.f97656c, ep.b.e(this.f97655b, Long.hashCode(this.f97654a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        xk2.e0 e0Var = this.f97663j;
        int hashCode = (c13 + (e0Var == null ? 0 : Long.hashCode(e0Var.f135208a))) * 31;
        Boolean bool = this.f97664k;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        xk2.e0 e0Var2 = this.f97665l;
        int hashCode3 = (hashCode2 + (e0Var2 == null ? 0 : Long.hashCode(e0Var2.f135208a))) * 31;
        xk2.e0 e0Var3 = this.f97666m;
        int hashCode4 = (hashCode3 + (e0Var3 == null ? 0 : Long.hashCode(e0Var3.f135208a))) * 31;
        Boolean bool2 = this.f97667n;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ArrayList arrayList = this.f97668o;
        int hashCode6 = (hashCode5 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.f97669p;
        int c14 = a.a.c(this.f97671r, a.a.c(this.f97670q, (hashCode6 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31, 31), 31);
        xk2.e0 e0Var4 = this.f97672s;
        int hashCode7 = (c14 + (e0Var4 == null ? 0 : Long.hashCode(e0Var4.f135208a))) * 31;
        Boolean bool3 = this.f97673t;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l13 = this.f97674u;
        int hashCode9 = (hashCode8 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f97675v;
        int hashCode10 = (hashCode9 + (l14 == null ? 0 : l14.hashCode())) * 31;
        xk2.e0 e0Var5 = this.f97676w;
        int hashCode11 = (hashCode10 + (e0Var5 == null ? 0 : Long.hashCode(e0Var5.f135208a))) * 31;
        ArrayList arrayList3 = this.f97677x;
        int e13 = ep.b.e(this.C, a.a.c(this.B, a.a.c(this.A, ep.b.e(this.f97679z, a.a.c(this.f97678y, (hashCode11 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31, 31), 31), 31), 31), 31);
        Boolean bool4 = this.D;
        int e14 = ep.b.e(this.E, (e13 + (bool4 == null ? 0 : bool4.hashCode())) * 31, 31);
        Rect rect = this.F;
        int hashCode12 = (e14 + (rect == null ? 0 : rect.hashCode())) * 31;
        d1 d1Var = this.G;
        return hashCode12 + (d1Var != null ? d1Var.hashCode() : 0);
    }

    public final String toString() {
        xk2.d0 d0Var = xk2.e0.f135207b;
        String s03 = c3.s0(this.f97654a);
        String s04 = c3.s0(this.f97661h);
        String s05 = c3.s0(this.f97662i);
        String s06 = c3.s0(this.f97670q);
        String s07 = c3.s0(this.f97671r);
        String s08 = c3.s0(this.f97678y);
        String s09 = c3.s0(this.A);
        String s010 = c3.s0(this.B);
        StringBuilder o13 = cb.o("Sps(profile=", s03, ", constraintSet0=");
        o13.append(this.f97655b);
        o13.append(", constraintSet1=");
        o13.append(this.f97656c);
        o13.append(", constraintSet2=");
        o13.append(this.f97657d);
        o13.append(", constraintSet3=");
        o13.append(this.f97658e);
        o13.append(", constraintSet4=");
        o13.append(this.f97659f);
        o13.append(", constraintSet5=");
        o13.append(this.f97660g);
        o13.append(", level=");
        o13.append(s04);
        o13.append(", seqParameterSetId=");
        o13.append(s05);
        o13.append(", chromaFormatIdc=");
        o13.append(this.f97663j);
        o13.append(", separateColorPlane=");
        o13.append(this.f97664k);
        o13.append(", bitDepthLuma=");
        o13.append(this.f97665l);
        o13.append(", bitDepthChroma=");
        o13.append(this.f97666m);
        o13.append(", qpPrimeYZeroTransformBypass=");
        o13.append(this.f97667n);
        o13.append(", scalingMatrix4x4=");
        o13.append(this.f97668o);
        o13.append(", scalingMatrix8x8=");
        o13.append(this.f97669p);
        o13.append(", lgMaxFrameNum=");
        o13.append(s06);
        o13.append(", picOrderCntType=");
        o13.append(s07);
        o13.append(", lgMaxPicOrderCnt=");
        o13.append(this.f97672s);
        o13.append(", isDeltaPicOrderAlwaysZero=");
        o13.append(this.f97673t);
        o13.append(", offsetForNonRefPic=");
        o13.append(this.f97674u);
        o13.append(", offsetForTopToBottomField=");
        o13.append(this.f97675v);
        o13.append(", numRefFramesInPicOrderCntCycle=");
        o13.append(this.f97676w);
        o13.append(", offsetForRefFrame=");
        o13.append(this.f97677x);
        o13.append(", maxNumRefFrames=");
        o13.append(s08);
        o13.append(", gapsInFrameNumValueAllowed=");
        o13.append(this.f97679z);
        o13.append(", picWidthInMbs=");
        o13.append(s09);
        o13.append(", picHeightInMapUnits=");
        o13.append(s010);
        o13.append(", frameMbsOnly=");
        o13.append(this.C);
        o13.append(", mbAdaptiveFrameField=");
        o13.append(this.D);
        o13.append(", direct8x8Inference=");
        o13.append(this.E);
        o13.append(", frameCrop=");
        o13.append(this.F);
        o13.append(", vuiParameters=");
        o13.append(this.G);
        o13.append(")");
        return o13.toString();
    }
}
