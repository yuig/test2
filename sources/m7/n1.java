package m7;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final n7.q0 f86315a;

    /* renamed from: e, reason: collision with root package name */
    public final m1 f86319e;

    /* renamed from: h, reason: collision with root package name */
    public final n7.a f86322h;

    /* renamed from: i, reason: collision with root package name */
    public final d7.o f86323i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f86325k;

    /* renamed from: l, reason: collision with root package name */
    public g7.a0 f86326l;

    /* renamed from: j, reason: collision with root package name */
    public g8.e1 f86324j = new g8.e1();

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f86317c = new IdentityHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f86318d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f86316b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f86320f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f86321g = new HashSet();

    public n1(m1 m1Var, n7.a aVar, d7.i0 i0Var, n7.q0 q0Var) {
        this.f86315a = q0Var;
        this.f86319e = m1Var;
        this.f86322h = aVar;
        this.f86323i = i0Var;
    }

    public final a7.b1 a(int i13, List list, g8.e1 e1Var) {
        if (!list.isEmpty()) {
            this.f86324j = e1Var;
            for (int i14 = i13; i14 < list.size() + i13; i14++) {
                l1 l1Var = (l1) list.get(i14 - i13);
                ArrayList arrayList = this.f86316b;
                if (i14 > 0) {
                    l1 l1Var2 = (l1) arrayList.get(i14 - 1);
                    l1Var.f86295d = l1Var2.f86292a.f64485o.f64402b.p() + l1Var2.f86295d;
                    l1Var.f86296e = false;
                    l1Var.f86294c.clear();
                } else {
                    l1Var.f86295d = 0;
                    l1Var.f86296e = false;
                    l1Var.f86294c.clear();
                }
                int p13 = l1Var.f86292a.f64485o.f64402b.p();
                for (int i15 = i14; i15 < arrayList.size(); i15++) {
                    ((l1) arrayList.get(i15)).f86295d += p13;
                }
                arrayList.add(i14, l1Var);
                this.f86318d.put(l1Var.f86293b, l1Var);
                if (this.f86325k) {
                    f(l1Var);
                    if (this.f86317c.isEmpty()) {
                        this.f86321g.add(l1Var);
                    } else {
                        c(l1Var);
                    }
                }
            }
        }
        return b();
    }

    public final a7.b1 b() {
        ArrayList arrayList = this.f86316b;
        if (arrayList.isEmpty()) {
            return a7.b1.f958a;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            l1 l1Var = (l1) arrayList.get(i14);
            l1Var.f86295d = i13;
            i13 += l1Var.f86292a.f64485o.f64402b.p();
        }
        return new t1(arrayList, this.f86324j);
    }

    public final void c(l1 l1Var) {
        k1 k1Var = (k1) this.f86320f.get(l1Var);
        if (k1Var != null) {
            k1Var.f86240a.c(k1Var.f86241b);
        }
    }

    public final void d() {
        Iterator it = this.f86321g.iterator();
        while (it.hasNext()) {
            l1 l1Var = (l1) it.next();
            if (l1Var.f86294c.isEmpty()) {
                c(l1Var);
                it.remove();
            }
        }
    }

    public final void e(l1 l1Var) {
        if (l1Var.f86296e && l1Var.f86294c.isEmpty()) {
            k1 k1Var = (k1) this.f86320f.remove(l1Var);
            k1Var.getClass();
            g8.a aVar = k1Var.f86240a;
            aVar.r(k1Var.f86241b);
            j1 j1Var = k1Var.f86242c;
            aVar.v(j1Var);
            aVar.u(j1Var);
            this.f86321g.remove(l1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [g8.f0, m7.e1] */
    public final void f(l1 l1Var) {
        g8.z zVar = l1Var.f86292a;
        ?? r13 = new g8.f0() { // from class: m7.e1
            @Override // g8.f0
            public final void a(g8.a aVar, a7.b1 b1Var) {
                d7.i0 i0Var = ((u0) n1.this.f86319e).f86417h;
                i0Var.e(2);
                i0Var.f(22);
            }
        };
        j1 j1Var = new j1(this, l1Var);
        this.f86320f.put(l1Var, new k1(zVar, r13, j1Var));
        Handler o13 = d7.n0.o(null);
        g8.h0 h0Var = zVar.f64174c;
        h0Var.getClass();
        g8.g0 g0Var = new g8.g0();
        g0Var.f64267a = o13;
        g0Var.f64268b = j1Var;
        h0Var.f64278c.add(g0Var);
        Handler o14 = d7.n0.o(null);
        s7.m mVar = zVar.f64175d;
        mVar.getClass();
        s7.l lVar = new s7.l();
        lVar.f111325a = o14;
        lVar.f111326b = j1Var;
        mVar.f111329c.add(lVar);
        zVar.m(r13, this.f86326l, this.f86315a);
    }

    public final void g(g8.c0 c0Var) {
        IdentityHashMap identityHashMap = this.f86317c;
        l1 l1Var = (l1) identityHashMap.remove(c0Var);
        l1Var.getClass();
        l1Var.f86292a.q(c0Var);
        l1Var.f86294c.remove(((g8.w) c0Var).f64458a);
        if (!identityHashMap.isEmpty()) {
            d();
        }
        e(l1Var);
    }

    public final void h(int i13, int i14) {
        for (int i15 = i14 - 1; i15 >= i13; i15--) {
            ArrayList arrayList = this.f86316b;
            l1 l1Var = (l1) arrayList.remove(i15);
            this.f86318d.remove(l1Var.f86293b);
            int i16 = -l1Var.f86292a.f64485o.f64402b.p();
            for (int i17 = i15; i17 < arrayList.size(); i17++) {
                ((l1) arrayList.get(i17)).f86295d += i16;
            }
            l1Var.f86296e = true;
            if (this.f86325k) {
                e(l1Var);
            }
        }
    }
}
