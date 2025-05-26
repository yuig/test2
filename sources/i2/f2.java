package i2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f2 implements e2 {

    /* renamed from: a, reason: collision with root package name */
    public int f71110a;

    /* renamed from: b, reason: collision with root package name */
    public g2 f71111b;

    /* renamed from: c, reason: collision with root package name */
    public d f71112c;

    /* renamed from: d, reason: collision with root package name */
    public Function2 f71113d;

    /* renamed from: e, reason: collision with root package name */
    public int f71114e;

    /* renamed from: f, reason: collision with root package name */
    public g1.z f71115f;

    /* renamed from: g, reason: collision with root package name */
    public g1.c0 f71116g;

    public f2(z zVar) {
        this.f71111b = zVar;
    }

    public static boolean a(p0 p0Var, g1.c0 c0Var) {
        Intrinsics.g(p0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        j3 j3Var = ((o0) p0Var).f71204c;
        if (j3Var == null) {
            j3Var = y3.f71400a;
        }
        return !j3Var.a(r0.j().f71170f, c0Var.g(p0Var));
    }

    public final boolean b() {
        d dVar;
        return (this.f71111b == null || (dVar = this.f71112c) == null || !dVar.a()) ? false : true;
    }

    public final b1 c(Object obj) {
        b1 a13;
        g2 g2Var = this.f71111b;
        return (g2Var == null || (a13 = g2Var.a(this, obj)) == null) ? b1.IGNORED : a13;
    }

    public final void d() {
        g2 g2Var = this.f71111b;
        if (g2Var != null) {
            g2Var.b();
        }
        this.f71111b = null;
        this.f71115f = null;
        this.f71116g = null;
    }

    public final void e() {
        g1.z zVar;
        g2 g2Var = this.f71111b;
        if (g2Var == null || (zVar = this.f71115f) == null) {
            return;
        }
        f(true);
        try {
            Object[] objArr = zVar.f63354b;
            int[] iArr = zVar.f63355c;
            long[] jArr = zVar.f63353a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j13 = jArr[i13];
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((255 & j13) < 128) {
                                int i16 = (i13 << 3) + i15;
                                Object obj = objArr[i16];
                                int i17 = iArr[i16];
                                g2Var.c(obj);
                            }
                            j13 >>= 8;
                        }
                        if (i14 != 8) {
                            break;
                        }
                    }
                    if (i13 == length) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        } finally {
            f(false);
        }
    }

    public final void f(boolean z13) {
        if (z13) {
            this.f71110a |= 32;
        } else {
            this.f71110a &= -33;
        }
    }
}
