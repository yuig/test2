package c2;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public abstract class p3 {

    /* renamed from: a, reason: collision with root package name */
    public static final i2.w3 f25068a = new i2.w3(t0.f25232q);

    /* renamed from: b, reason: collision with root package name */
    public static final i2.u0 f25069b = new i2.u0(i2.y3.f71400a, t0.f25231p);

    /* renamed from: c, reason: collision with root package name */
    public static final q3 f25070c;

    /* renamed from: d, reason: collision with root package name */
    public static final q3 f25071d;

    /* renamed from: e, reason: collision with root package name */
    public static final e2.i f25072e;

    /* renamed from: f, reason: collision with root package name */
    public static final e2.i f25073f;

    /* renamed from: g, reason: collision with root package name */
    public static final e2.i f25074g;

    static {
        long j13 = b3.w.f21390n;
        f25070c = new q3(true, Float.NaN, j13);
        f25071d = new q3(false, Float.NaN, j13);
        f25072e = new e2.i(0.16f, 0.24f, 0.08f, 0.24f);
        f25073f = new e2.i(0.08f, 0.12f, 0.04f, 0.12f);
        f25074g = new e2.i(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static final q3 a(float f13, long j13, boolean z13) {
        return (n4.e.a(f13, Float.NaN) && b3.w.c(j13, b3.w.f21390n)) ? z13 ? f25070c : f25071d : new q3(z13, f13, j13);
    }

    public static q3 b(float f13, int i13) {
        if ((i13 & 2) != 0) {
            f13 = Float.NaN;
        }
        return a(f13, b3.w.f21390n, false);
    }

    public static final k1.k1 c(float f13, long j13, i2.o oVar, int i13, int i14) {
        boolean z13 = true;
        boolean z14 = (i14 & 1) != 0;
        if ((i14 & 2) != 0) {
            f13 = Float.NaN;
        }
        if ((i14 & 4) != 0) {
            j13 = b3.w.f21390n;
        }
        i2.s sVar = (i2.s) oVar;
        if (!((Boolean) sVar.m(f25068a)).booleanValue()) {
            sVar.W(96503175);
            sVar.r(false);
            return a(f13, j13, z14);
        }
        sVar.W(96412190);
        int i15 = (i13 & 896) | (i13 & 14) | (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER);
        j1.o2 o2Var = e2.x.f56917a;
        i2.q1 K1 = bs1.c.K1(new b3.w(j13), sVar);
        boolean z15 = (((i15 & 14) ^ 6) > 4 && sVar.i(z14)) || (i15 & 6) == 4;
        if ((((i15 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) ^ 48) <= 32 || !sVar.e(f13)) && (i15 & 48) != 32) {
            z13 = false;
        }
        boolean z16 = z15 | z13;
        Object J2 = sVar.J();
        if (z16 || J2 == i2.n.f71185a) {
            J2 = new e2.f(z14, f13, K1);
            sVar.g0(J2);
        }
        e2.f fVar = (e2.f) J2;
        sVar.r(false);
        return fVar;
    }
}
