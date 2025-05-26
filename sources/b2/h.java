package b2;

import kotlin.jvm.internal.Intrinsics;
import w1.g1;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final b4.g f21153a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21154b;

    /* renamed from: c, reason: collision with root package name */
    public final b4.m0 f21155c;

    /* renamed from: d, reason: collision with root package name */
    public final h4.y f21156d;

    /* renamed from: e, reason: collision with root package name */
    public final z0 f21157e;

    /* renamed from: f, reason: collision with root package name */
    public long f21158f;

    /* renamed from: g, reason: collision with root package name */
    public final b4.g f21159g;

    public h(b4.g gVar, long j13, b4.m0 m0Var, h4.y yVar, z0 z0Var) {
        this.f21153a = gVar;
        this.f21154b = j13;
        this.f21155c = m0Var;
        this.f21156d = yVar;
        this.f21157e = z0Var;
        this.f21158f = j13;
        this.f21159g = gVar;
    }

    public final Integer a() {
        b4.m0 m0Var = this.f21155c;
        if (m0Var == null) {
            return null;
        }
        int d2 = b4.p0.d(this.f21158f);
        h4.y yVar = this.f21156d;
        return Integer.valueOf(yVar.a(m0Var.e(m0Var.f(yVar.b(d2)), true)));
    }

    public final Integer b() {
        b4.m0 m0Var = this.f21155c;
        if (m0Var == null) {
            return null;
        }
        int e13 = b4.p0.e(this.f21158f);
        h4.y yVar = this.f21156d;
        return Integer.valueOf(yVar.a(m0Var.i(m0Var.f(yVar.b(e13)))));
    }

    public final Integer c() {
        int length;
        b4.m0 m0Var = this.f21155c;
        if (m0Var == null) {
            return null;
        }
        int m13 = m();
        while (true) {
            b4.g gVar = this.f21153a;
            if (m13 < gVar.f21571a.length()) {
                int length2 = this.f21159g.f21571a.length() - 1;
                if (m13 <= length2) {
                    length2 = m13;
                }
                long l13 = m0Var.l(length2);
                int i13 = b4.p0.f21640c;
                int i14 = (int) (l13 & 4294967295L);
                if (i14 > m13) {
                    length = this.f21156d.a(i14);
                    break;
                }
                m13++;
            } else {
                length = gVar.f21571a.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer d() {
        int i13;
        b4.m0 m0Var = this.f21155c;
        if (m0Var == null) {
            return null;
        }
        int m13 = m();
        while (true) {
            if (m13 <= 0) {
                i13 = 0;
                break;
            }
            int length = this.f21159g.f21571a.length() - 1;
            if (m13 <= length) {
                length = m13;
            }
            long l13 = m0Var.l(length);
            int i14 = b4.p0.f21640c;
            int i15 = (int) (l13 >> 32);
            if (i15 < m13) {
                i13 = this.f21156d.a(i15);
                break;
            }
            m13--;
        }
        return Integer.valueOf(i13);
    }

    public final boolean e() {
        b4.m0 m0Var = this.f21155c;
        return (m0Var != null ? m0Var.j(m()) : null) != m4.h.Rtl;
    }

    public final int f(b4.m0 m0Var, int i13) {
        int m13 = m();
        z0 z0Var = this.f21157e;
        if (z0Var.f21274a == null) {
            z0Var.f21274a = Float.valueOf(m0Var.c(m13).f484a);
        }
        int f13 = m0Var.f(m13) + i13;
        if (f13 < 0) {
            return 0;
        }
        b4.o oVar = m0Var.f21616b;
        if (f13 >= oVar.f21630f) {
            return this.f21159g.f21571a.length();
        }
        float b13 = oVar.b(f13) - 1;
        Float f14 = z0Var.f21274a;
        Intrinsics.f(f14);
        float floatValue = f14.floatValue();
        if ((e() && floatValue >= m0Var.h(f13)) || (!e() && floatValue <= m0Var.g(f13))) {
            return m0Var.e(f13, true);
        }
        return this.f21156d.a(oVar.e(com.bumptech.glide.c.d(f14.floatValue(), b13)));
    }

    public final void g() {
        this.f21157e.f21274a = null;
        b4.g gVar = this.f21159g;
        if (gVar.f21571a.length() > 0) {
            int d2 = b4.p0.d(this.f21158f);
            String str = gVar.f21571a;
            int r13 = g1.r(d2, str);
            if (r13 == b4.p0.d(this.f21158f) && r13 != str.length()) {
                r13 = g1.r(r13 + 1, str);
            }
            l(r13, r13);
        }
    }

    public final void h() {
        this.f21157e.f21274a = null;
        b4.g gVar = this.f21159g;
        if (gVar.f21571a.length() > 0) {
            int e13 = b4.p0.e(this.f21158f);
            String str = gVar.f21571a;
            int s13 = g1.s(e13, str);
            if (s13 == b4.p0.e(this.f21158f) && s13 != 0) {
                s13 = g1.s(s13 - 1, str);
            }
            l(s13, s13);
        }
    }

    public final void i() {
        Integer a13;
        this.f21157e.f21274a = null;
        if (this.f21159g.f21571a.length() <= 0 || (a13 = a()) == null) {
            return;
        }
        int intValue = a13.intValue();
        l(intValue, intValue);
    }

    public final void j() {
        Integer b13;
        this.f21157e.f21274a = null;
        if (this.f21159g.f21571a.length() <= 0 || (b13 = b()) == null) {
            return;
        }
        int intValue = b13.intValue();
        l(intValue, intValue);
    }

    public final void k() {
        if (this.f21159g.f21571a.length() > 0) {
            int i13 = b4.p0.f21640c;
            this.f21158f = b7.c.h((int) (this.f21154b >> 32), (int) (this.f21158f & 4294967295L));
        }
    }

    public final void l(int i13, int i14) {
        this.f21158f = b7.c.h(i13, i14);
    }

    public final int m() {
        long j13 = this.f21158f;
        int i13 = b4.p0.f21640c;
        return this.f21156d.b((int) (j13 & 4294967295L));
    }
}
