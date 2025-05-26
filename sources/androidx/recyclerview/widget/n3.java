package androidx.recyclerview.widget;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19526a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19527b;

    public n3(nx.d0 pinalytics, qq2.c pinLevelingPreferences) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinLevelingPreferences, "pinLevelingPreferences");
        this.f19526a = pinalytics;
        this.f19527b = pinLevelingPreferences;
    }

    public final void a(y2 y2Var, f2 f2Var) {
        g1.o0 o0Var = (g1.o0) this.f19526a;
        m3 m3Var = (m3) o0Var.get(y2Var);
        if (m3Var == null) {
            m3Var = m3.a();
            o0Var.put(y2Var, m3Var);
        }
        m3Var.f19515a |= 2;
        m3Var.f19516b = f2Var;
    }

    public final void b(y2 y2Var) {
        Object obj = this.f19526a;
        m3 m3Var = (m3) ((g1.o0) obj).get(y2Var);
        if (m3Var == null) {
            m3Var = m3.a();
            ((g1.o0) obj).put(y2Var, m3Var);
        }
        m3Var.f19515a |= 1;
    }

    public final void c(long j13, y2 y2Var) {
        ((g1.p) this.f19527b).j(j13, y2Var);
    }

    public final void d(y2 y2Var, f2 f2Var) {
        g1.o0 o0Var = (g1.o0) this.f19526a;
        m3 m3Var = (m3) o0Var.get(y2Var);
        if (m3Var == null) {
            m3Var = m3.a();
            o0Var.put(y2Var, m3Var);
        }
        m3Var.f19517c = f2Var;
        m3Var.f19515a |= 8;
    }

    public final void e(y2 y2Var, f2 f2Var) {
        g1.o0 o0Var = (g1.o0) this.f19526a;
        m3 m3Var = (m3) o0Var.get(y2Var);
        if (m3Var == null) {
            m3Var = m3.a();
            o0Var.put(y2Var, m3Var);
        }
        m3Var.f19516b = f2Var;
        m3Var.f19515a |= 4;
    }

    public final PinterestStaggeredGridLayoutManagerImpl f(t0 rvInfo, int i13) {
        Intrinsics.checkNotNullParameter(rvInfo, "rvInfo");
        return new PinterestStaggeredGridLayoutManagerImpl(rvInfo, i13, (nx.d0) this.f19526a, (qq2.c) this.f19527b);
    }

    public final View g(int i13, int i14, int i15, int i16) {
        l3 l3Var = (l3) this.f19526a;
        int b13 = l3Var.b();
        int c13 = l3Var.c();
        int i17 = i14 > i13 ? 1 : -1;
        View view = null;
        while (i13 != i14) {
            View d2 = l3Var.d(i13);
            int a13 = l3Var.a(d2);
            int e13 = l3Var.e(d2);
            a7.e eVar = (a7.e) this.f19527b;
            eVar.f978b = b13;
            eVar.f979c = c13;
            eVar.f980d = a13;
            eVar.f981e = e13;
            if (i15 != 0) {
                eVar.f977a = i15;
                if (eVar.a()) {
                    return d2;
                }
            }
            if (i16 != 0) {
                eVar.f977a = i16;
                if (eVar.a()) {
                    view = d2;
                }
            }
            i13 += i17;
        }
        return view;
    }

    public final boolean h(y2 y2Var) {
        m3 m3Var = (m3) ((g1.o0) this.f19526a).get(y2Var);
        return (m3Var == null || (m3Var.f19515a & 1) == 0) ? false : true;
    }

    public final boolean i(View view) {
        a7.e eVar = (a7.e) this.f19527b;
        l3 l3Var = (l3) this.f19526a;
        int b13 = l3Var.b();
        int c13 = l3Var.c();
        int a13 = l3Var.a(view);
        int e13 = l3Var.e(view);
        eVar.f978b = b13;
        eVar.f979c = c13;
        eVar.f980d = a13;
        eVar.f981e = e13;
        eVar.f977a = 24579;
        return eVar.a();
    }

    public final f2 j(y2 y2Var, int i13) {
        m3 m3Var;
        f2 f2Var;
        g1.o0 o0Var = (g1.o0) this.f19526a;
        int d2 = o0Var.d(y2Var);
        if (d2 >= 0 && (m3Var = (m3) o0Var.j(d2)) != null) {
            int i14 = m3Var.f19515a;
            if ((i14 & i13) != 0) {
                int i15 = i14 & (~i13);
                m3Var.f19515a = i15;
                if (i13 == 4) {
                    f2Var = m3Var.f19516b;
                } else {
                    if (i13 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    f2Var = m3Var.f19517c;
                }
                if ((i15 & 12) == 0) {
                    o0Var.h(d2);
                    m3Var.f19515a = 0;
                    m3Var.f19516b = null;
                    m3Var.f19517c = null;
                    m3.f19514d.a(m3Var);
                }
                return f2Var;
            }
        }
        return null;
    }

    public final f2 k(y2 y2Var) {
        return j(y2Var, 8);
    }

    public final f2 l(y2 y2Var) {
        return j(y2Var, 4);
    }

    public final void m(y2 y2Var) {
        m3 m3Var = (m3) ((g1.o0) this.f19526a).get(y2Var);
        if (m3Var == null) {
            return;
        }
        m3Var.f19515a &= -2;
    }

    public final void n(y2 y2Var) {
        g1.p pVar = (g1.p) this.f19527b;
        int m13 = pVar.m() - 1;
        while (true) {
            if (m13 < 0) {
                break;
            }
            if (y2Var == pVar.n(m13)) {
                pVar.l(m13);
                break;
            }
            m13--;
        }
        m3 m3Var = (m3) ((g1.o0) this.f19526a).remove(y2Var);
        if (m3Var != null) {
            m3Var.f19515a = 0;
            m3Var.f19516b = null;
            m3Var.f19517c = null;
            m3.f19514d.a(m3Var);
        }
    }

    public n3() {
        this.f19526a = new g1.o0();
        this.f19527b = new g1.p();
    }

    public n3(l3 l3Var) {
        this.f19526a = l3Var;
        this.f19527b = new a7.e();
    }
}
