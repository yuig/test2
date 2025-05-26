package ot1;

import java.util.ArrayList;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f97586a;

    /* renamed from: b, reason: collision with root package name */
    public final long f97587b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f97588c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f97589d;

    /* renamed from: e, reason: collision with root package name */
    public final long f97590e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f97591f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f97592g;

    /* renamed from: h, reason: collision with root package name */
    public final c0 f97593h;

    /* renamed from: i, reason: collision with root package name */
    public final f0 f97594i;

    /* renamed from: j, reason: collision with root package name */
    public final long f97595j;

    /* renamed from: k, reason: collision with root package name */
    public final long f97596k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f97597l;

    /* renamed from: m, reason: collision with root package name */
    public final long f97598m;

    /* renamed from: n, reason: collision with root package name */
    public final long f97599n;

    /* renamed from: o, reason: collision with root package name */
    public final long f97600o;

    /* renamed from: p, reason: collision with root package name */
    public final long f97601p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f97602q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f97603r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f97604s;

    public k0(long j13, long j14, boolean z13, boolean z14, long j15, ArrayList arrayList, ArrayList arrayList2, c0 c0Var, f0 f0Var, long j16, long j17, boolean z15, long j18, long j19, long j23, long j24, boolean z16, boolean z17, boolean z18) {
        this.f97586a = j13;
        this.f97587b = j14;
        this.f97588c = z13;
        this.f97589d = z14;
        this.f97590e = j15;
        this.f97591f = arrayList;
        this.f97592g = arrayList2;
        this.f97593h = c0Var;
        this.f97594i = f0Var;
        this.f97595j = j16;
        this.f97596k = j17;
        this.f97597l = z15;
        this.f97598m = j18;
        this.f97599n = j19;
        this.f97600o = j23;
        this.f97601p = j24;
        this.f97602q = z16;
        this.f97603r = z17;
        this.f97604s = z18;
        if (Long.compareUnsigned(j15, 1L) > 0 && arrayList == null && arrayList2 == null && c0Var == null && f0Var == null) {
            throw new IllegalArgumentException("There is more than one slice, but no slice groups are specified.".toString());
        }
        if (Long.compareUnsigned(j16, 1L) < 0) {
            xk2.d0 d0Var = xk2.e0.f135207b;
            throw new IllegalArgumentException(a.a.k("num_ref_idx_l0_default_active must be at least 1, but is [", c3.s0(j16), "]").toString());
        }
        if (Long.compareUnsigned(j17, 1L) >= 0) {
            return;
        }
        xk2.d0 d0Var2 = xk2.e0.f135207b;
        throw new IllegalArgumentException(a.a.k("num_ref_idx_l1_default_active must be at least 1, but is [", c3.s0(j17), "]").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f97586a == k0Var.f97586a && this.f97587b == k0Var.f97587b && this.f97588c == k0Var.f97588c && this.f97589d == k0Var.f97589d && this.f97590e == k0Var.f97590e && Intrinsics.d(this.f97591f, k0Var.f97591f) && Intrinsics.d(this.f97592g, k0Var.f97592g) && Intrinsics.d(this.f97593h, k0Var.f97593h) && Intrinsics.d(this.f97594i, k0Var.f97594i) && this.f97595j == k0Var.f97595j && this.f97596k == k0Var.f97596k && this.f97597l == k0Var.f97597l && this.f97598m == k0Var.f97598m && this.f97599n == k0Var.f97599n && this.f97600o == k0Var.f97600o && this.f97601p == k0Var.f97601p && this.f97602q == k0Var.f97602q && this.f97603r == k0Var.f97603r && this.f97604s == k0Var.f97604s;
    }

    public final int hashCode() {
        xk2.d0 d0Var = xk2.e0.f135207b;
        int c13 = a.a.c(this.f97590e, ep.b.e(this.f97589d, ep.b.e(this.f97588c, a.a.c(this.f97587b, Long.hashCode(this.f97586a) * 31, 31), 31), 31), 31);
        ArrayList arrayList = this.f97591f;
        int hashCode = (c13 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.f97592g;
        int hashCode2 = (hashCode + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        c0 c0Var = this.f97593h;
        int hashCode3 = (hashCode2 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        f0 f0Var = this.f97594i;
        return Boolean.hashCode(this.f97604s) + ep.b.e(this.f97603r, ep.b.e(this.f97602q, a.a.c(this.f97601p, a.a.c(this.f97600o, a.a.c(this.f97599n, a.a.c(this.f97598m, ep.b.e(this.f97597l, a.a.c(this.f97596k, a.a.c(this.f97595j, (hashCode3 + (f0Var != null ? f0Var.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        xk2.d0 d0Var = xk2.e0.f135207b;
        String s03 = c3.s0(this.f97586a);
        String s04 = c3.s0(this.f97587b);
        String s05 = c3.s0(this.f97590e);
        String s06 = c3.s0(this.f97595j);
        String s07 = c3.s0(this.f97596k);
        String s08 = c3.s0(this.f97598m);
        StringBuilder w13 = a.a.w("Pps(picParameterSetId=", s03, ", seqParameterSetId=", s04, ", isCabacEntropyCoding=");
        w13.append(this.f97588c);
        w13.append(", isBottomFieldPicOrderInFramePresent=");
        w13.append(this.f97589d);
        w13.append(", numSliceGroups=");
        w13.append(s05);
        w13.append(", runLengthSlices=");
        w13.append(this.f97591f);
        w13.append(", indexedSlices=");
        w13.append(this.f97592g);
        w13.append(", directionalSlices=");
        w13.append(this.f97593h);
        w13.append(", heightBasedSlices=");
        w13.append(this.f97594i);
        w13.append(", numRefIdxL0DefaultActive=");
        w13.append(s06);
        w13.append(", numRefIdxL1DefaultActive=");
        w13.append(s07);
        w13.append(", isWeightedPred=");
        w13.append(this.f97597l);
        w13.append(", weightedBipredIdc=");
        w13.append(s08);
        w13.append(", picInitQp=");
        w13.append(this.f97599n);
        w13.append(", picInitQs=");
        w13.append(this.f97600o);
        w13.append(", chromaQpIndexOffset=");
        w13.append(this.f97601p);
        w13.append(", isDeblockingFilterControlPresent=");
        w13.append(this.f97602q);
        w13.append(", isConstrainedIntraPred=");
        w13.append(this.f97603r);
        w13.append(", isRedundantPicCntPresent=");
        return a.a.r(w13, this.f97604s, ")");
    }
}
