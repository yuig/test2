package z3;

import ao2.m0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k1.j1;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s3.k0;
import s3.q1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final u2.p f140711a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f140712b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f140713c;

    /* renamed from: d, reason: collision with root package name */
    public final j f140714d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f140715e;

    /* renamed from: f, reason: collision with root package name */
    public q f140716f;

    /* renamed from: g, reason: collision with root package name */
    public final int f140717g;

    public q(u2.p pVar, boolean z13, k0 k0Var, j jVar) {
        this.f140711a = pVar;
        this.f140712b = z13;
        this.f140713c = k0Var;
        this.f140714d = jVar;
        this.f140717g = k0Var.f110814b;
    }

    public static /* synthetic */ List e(q qVar) {
        ArrayList arrayList = new ArrayList();
        qVar.d(arrayList);
        return arrayList;
    }

    public static /* synthetic */ List i(q qVar, boolean z13, int i13) {
        boolean z14 = (i13 & 1) != 0 ? !qVar.f140712b : false;
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return qVar.h(z14, z13, false);
    }

    public final q a(g gVar, Function1 function1) {
        j jVar = new j();
        jVar.f140701b = false;
        jVar.f140702c = false;
        function1.invoke(jVar);
        q qVar = new q(new n(function1), false, new k0(true, this.f140717g + (gVar != null ? 1000000000 : 2000000000)), jVar);
        qVar.f140715e = true;
        qVar.f140716f = this;
        return qVar;
    }

    public final void b(k0 k0Var, ArrayList arrayList, boolean z13) {
        k2.e x13 = k0Var.x();
        int i13 = x13.f78184c;
        if (i13 > 0) {
            Object[] objArr = x13.f78182a;
            int i14 = 0;
            do {
                k0 k0Var2 = (k0) objArr[i14];
                if (k0Var2.G() && (z13 || !k0Var2.I)) {
                    if (k0Var2.f110837y.d(8)) {
                        arrayList.add(m0.c(k0Var2, this.f140712b));
                    } else {
                        b(k0Var2, arrayList, z13);
                    }
                }
                i14++;
            } while (i14 < i13);
        }
    }

    public final q1 c() {
        if (this.f140715e) {
            q k13 = k();
            if (k13 != null) {
                return k13.c();
            }
            return null;
        }
        s3.m F = m0.F(this.f140713c);
        if (F == null) {
            F = this.f140711a;
        }
        return com.bumptech.glide.c.S0(F, 8);
    }

    public final void d(List list) {
        List o13 = o(false, false);
        int size = o13.size();
        for (int i13 = 0; i13 < size; i13++) {
            q qVar = (q) o13.get(i13);
            if (qVar.m()) {
                list.add(qVar);
            } else if (!qVar.f140714d.f140702c) {
                qVar.d(list);
            }
        }
    }

    public final a3.d f() {
        q1 c13 = c();
        if (c13 != null) {
            if (!c13.X0().f120054m) {
                c13 = null;
            }
            if (c13 != null) {
                return androidx.compose.ui.layout.b.e(c13).J(c13, true);
            }
        }
        return a3.d.f483e;
    }

    public final a3.d g() {
        q1 c13 = c();
        if (c13 != null) {
            if (!c13.X0().f120054m) {
                c13 = null;
            }
            if (c13 != null) {
                return androidx.compose.ui.layout.b.d(c13);
            }
        }
        return a3.d.f483e;
    }

    public final List h(boolean z13, boolean z14, boolean z15) {
        return (z13 || !this.f140714d.f140702c) ? m() ? e(this) : o(z14, z15) : q0.f80391a;
    }

    public final j j() {
        boolean m13 = m();
        j jVar = this.f140714d;
        if (!m13) {
            return jVar;
        }
        j b13 = jVar.b();
        n(b13);
        return b13;
    }

    public final q k() {
        q qVar = this.f140716f;
        if (qVar != null) {
            return qVar;
        }
        k0 k0Var = this.f140713c;
        boolean z13 = this.f140712b;
        k0 v13 = z13 ? m0.v(k0Var, o.f140708k) : null;
        if (v13 == null) {
            v13 = m0.v(k0Var, p.f140710i);
        }
        if (v13 == null) {
            return null;
        }
        return m0.c(v13, z13);
    }

    public final List l() {
        return i(this, true, 4);
    }

    public final boolean m() {
        return this.f140712b && this.f140714d.f140701b;
    }

    public final void n(j jVar) {
        if (this.f140714d.f140702c) {
            return;
        }
        List o13 = o(false, false);
        int size = o13.size();
        for (int i13 = 0; i13 < size; i13++) {
            q qVar = (q) o13.get(i13);
            if (!qVar.m()) {
                for (Map.Entry entry : qVar.f140714d.f140700a.entrySet()) {
                    x xVar = (x) entry.getKey();
                    Object value = entry.getValue();
                    LinkedHashMap linkedHashMap = jVar.f140700a;
                    Object obj = linkedHashMap.get(xVar);
                    Intrinsics.g(xVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                    Object invoke = xVar.f140762b.invoke(obj, value);
                    if (invoke != null) {
                        linkedHashMap.put(xVar, invoke);
                    }
                }
                qVar.n(jVar);
            }
        }
    }

    public final List o(boolean z13, boolean z14) {
        if (this.f140715e) {
            return q0.f80391a;
        }
        ArrayList arrayList = new ArrayList();
        b(this.f140713c, arrayList, z14);
        if (z13) {
            x xVar = t.f140751t;
            j jVar = this.f140714d;
            g gVar = (g) bs1.c.M0(jVar, xVar);
            int i13 = 0;
            int i14 = 1;
            if (gVar != null && jVar.f140701b && (!arrayList.isEmpty())) {
                arrayList.add(a(gVar, new m(gVar, i13)));
            }
            x xVar2 = t.f140733b;
            LinkedHashMap linkedHashMap = jVar.f140700a;
            if (linkedHashMap.containsKey(xVar2) && (!arrayList.isEmpty()) && jVar.f140701b) {
                Object obj = linkedHashMap.get(xVar2);
                if (obj == null) {
                    obj = null;
                }
                List list = (List) obj;
                String str = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new j1(str, i14)));
                }
            }
        }
        return arrayList;
    }
}
