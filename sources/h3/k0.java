package h3;

import b3.s0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f66718a;

    /* renamed from: b, reason: collision with root package name */
    public final List f66719b;

    /* renamed from: c, reason: collision with root package name */
    public final int f66720c;

    /* renamed from: d, reason: collision with root package name */
    public final b3.s f66721d;

    /* renamed from: e, reason: collision with root package name */
    public final float f66722e;

    /* renamed from: f, reason: collision with root package name */
    public final b3.s f66723f;

    /* renamed from: g, reason: collision with root package name */
    public final float f66724g;

    /* renamed from: h, reason: collision with root package name */
    public final float f66725h;

    /* renamed from: i, reason: collision with root package name */
    public final int f66726i;

    /* renamed from: j, reason: collision with root package name */
    public final int f66727j;

    /* renamed from: k, reason: collision with root package name */
    public final float f66728k;

    /* renamed from: l, reason: collision with root package name */
    public final float f66729l;

    /* renamed from: m, reason: collision with root package name */
    public final float f66730m;

    /* renamed from: n, reason: collision with root package name */
    public final float f66731n;

    public k0(String str, List list, int i13, b3.s sVar, float f13, b3.s sVar2, float f14, float f15, int i14, int i15, float f16, float f17, float f18, float f19) {
        this.f66718a = str;
        this.f66719b = list;
        this.f66720c = i13;
        this.f66721d = sVar;
        this.f66722e = f13;
        this.f66723f = sVar2;
        this.f66724g = f14;
        this.f66725h = f15;
        this.f66726i = i14;
        this.f66727j = i15;
        this.f66728k = f16;
        this.f66729l = f17;
        this.f66730m = f18;
        this.f66731n = f19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            return Intrinsics.d(this.f66718a, k0Var.f66718a) && Intrinsics.d(this.f66721d, k0Var.f66721d) && this.f66722e == k0Var.f66722e && Intrinsics.d(this.f66723f, k0Var.f66723f) && this.f66724g == k0Var.f66724g && this.f66725h == k0Var.f66725h && s0.d(this.f66726i, k0Var.f66726i) && s0.e(this.f66727j, k0Var.f66727j) && this.f66728k == k0Var.f66728k && this.f66729l == k0Var.f66729l && this.f66730m == k0Var.f66730m && this.f66731n == k0Var.f66731n && this.f66720c == k0Var.f66720c && Intrinsics.d(this.f66719b, k0Var.f66719b);
        }
        return false;
    }

    public final int hashCode() {
        int c13 = ep.b.c(this.f66719b, this.f66718a.hashCode() * 31, 31);
        b3.s sVar = this.f66721d;
        int a13 = a.a.a(this.f66722e, (c13 + (sVar != null ? sVar.hashCode() : 0)) * 31, 31);
        b3.s sVar2 = this.f66723f;
        return Integer.hashCode(this.f66720c) + a.a.a(this.f66731n, a.a.a(this.f66730m, a.a.a(this.f66729l, a.a.a(this.f66728k, ep.b.b(this.f66727j, ep.b.b(this.f66726i, a.a.a(this.f66725h, a.a.a(this.f66724g, (a13 + (sVar2 != null ? sVar2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
