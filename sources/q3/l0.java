package q3;

import android.view.ViewGroup;
import i2.s2;
import i2.y3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s3.l2;
import t3.f5;

/* loaded from: classes.dex */
public final class l0 implements i2.m {

    /* renamed from: a, reason: collision with root package name */
    public final s3.k0 f102230a;

    /* renamed from: b, reason: collision with root package name */
    public i2.w f102231b;

    /* renamed from: c, reason: collision with root package name */
    public q1 f102232c;

    /* renamed from: d, reason: collision with root package name */
    public int f102233d;

    /* renamed from: e, reason: collision with root package name */
    public int f102234e;

    /* renamed from: n, reason: collision with root package name */
    public int f102243n;

    /* renamed from: o, reason: collision with root package name */
    public int f102244o;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f102235f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f102236g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final f0 f102237h = new f0(this);

    /* renamed from: i, reason: collision with root package name */
    public final d0 f102238i = new d0(this);

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f102239j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final p1 f102240k = new p1();

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f102241l = new LinkedHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final k2.e f102242m = new k2.e(new Object[16]);

    /* renamed from: p, reason: collision with root package name */
    public final String f102245p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public l0(s3.k0 k0Var, q1 q1Var) {
        this.f102230a = k0Var;
        this.f102232c = q1Var;
    }

    public static void l(s3.k0 k0Var) {
        s3.v0 v0Var = k0Var.f110838z;
        s3.t0 t0Var = v0Var.f110984r;
        s3.i0 i0Var = s3.i0.NotUsed;
        t0Var.f110940k = i0Var;
        s3.q0 q0Var = v0Var.f110985s;
        if (q0Var != null) {
            q0Var.f110880i = i0Var;
        }
    }

    @Override // i2.m
    public final void a() {
        i(true);
    }

    @Override // i2.m
    public final void b() {
        i(false);
    }

    @Override // i2.m
    public final void c() {
        s3.k0 k0Var = this.f102230a;
        k0Var.f110824l = true;
        HashMap hashMap = this.f102235f;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            s2 s2Var = ((c0) it.next()).f102174c;
            if (s2Var != null) {
                ((i2.z) s2Var).dispose();
            }
        }
        k0Var.R();
        k0Var.f110824l = false;
        hashMap.clear();
        this.f102236g.clear();
        this.f102244o = 0;
        this.f102243n = 0;
        this.f102239j.clear();
        h();
    }

    public final void f(int i13) {
        boolean z13 = false;
        this.f102243n = 0;
        int size = (this.f102230a.q().size() - this.f102244o) - 1;
        if (i13 <= size) {
            this.f102240k.clear();
            if (i13 <= size) {
                int i14 = i13;
                while (true) {
                    this.f102240k.b(g(i14));
                    if (i14 == size) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f102232c.b(this.f102240k);
            s2.i P = bk.f.P();
            Function1 f13 = P != null ? P.f() : null;
            s2.i X = bk.f.X(P);
            boolean z14 = false;
            while (size >= i13) {
                try {
                    s3.k0 k0Var = (s3.k0) this.f102230a.q().get(size);
                    Object obj = this.f102235f.get(k0Var);
                    Intrinsics.f(obj);
                    c0 c0Var = (c0) obj;
                    Object b13 = c0Var.b();
                    if (this.f102240k.contains(b13)) {
                        this.f102243n++;
                        if (((Boolean) c0Var.f102177f.getValue()).booleanValue()) {
                            l(k0Var);
                            c0Var.c();
                            z14 = true;
                        }
                    } else {
                        s3.k0 k0Var2 = this.f102230a;
                        k0Var2.f110824l = true;
                        this.f102235f.remove(k0Var);
                        s2 s2Var = c0Var.f102174c;
                        if (s2Var != null) {
                            ((i2.z) s2Var).dispose();
                        }
                        this.f102230a.S(size, 1);
                        k0Var2.f110824l = false;
                    }
                    this.f102236g.remove(b13);
                    size--;
                } catch (Throwable th3) {
                    bk.f.c0(P, X, f13);
                    throw th3;
                }
            }
            Unit unit = Unit.f80348a;
            bk.f.c0(P, X, f13);
            if (z14) {
                synchronized (s2.p.f110667b) {
                    g1.g0 g0Var = ((s2.b) s2.p.f110674i.get()).f110610h;
                    if (g0Var != null) {
                        if (g0Var.c()) {
                            z13 = true;
                        }
                    }
                }
                if (z13) {
                    s2.p.a();
                }
            }
        }
        h();
    }

    public final Object g(int i13) {
        Object obj = this.f102235f.get((s3.k0) this.f102230a.q().get(i13));
        Intrinsics.f(obj);
        return ((c0) obj).f102172a;
    }

    public final void h() {
        int size = this.f102230a.q().size();
        HashMap hashMap = this.f102235f;
        if (hashMap.size() != size) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + hashMap.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((size - this.f102243n) - this.f102244o < 0) {
            StringBuilder s13 = a.a.s("Incorrect state. Total children ", size, ". Reusable children ");
            s13.append(this.f102243n);
            s13.append(". Precomposed children ");
            s13.append(this.f102244o);
            throw new IllegalArgumentException(s13.toString().toString());
        }
        HashMap hashMap2 = this.f102239j;
        if (hashMap2.size() == this.f102244o) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f102244o + ". Map size " + hashMap2.size()).toString());
    }

    public final void i(boolean z13) {
        this.f102244o = 0;
        this.f102239j.clear();
        s3.k0 k0Var = this.f102230a;
        int size = k0Var.q().size();
        if (this.f102243n != size) {
            this.f102243n = size;
            s2.i P = bk.f.P();
            Function1 f13 = P != null ? P.f() : null;
            s2.i X = bk.f.X(P);
            for (int i13 = 0; i13 < size; i13++) {
                try {
                    s3.k0 k0Var2 = (s3.k0) k0Var.q().get(i13);
                    c0 c0Var = (c0) this.f102235f.get(k0Var2);
                    if (c0Var != null && ((Boolean) c0Var.f102177f.getValue()).booleanValue()) {
                        l(k0Var2);
                        if (z13) {
                            s2 s2Var = c0Var.f102174c;
                            if (s2Var != null) {
                                ((i2.z) s2Var).o();
                            }
                            c0Var.f102177f = bs1.c.u1(Boolean.FALSE, y3.f71400a);
                        } else {
                            c0Var.c();
                        }
                        c0Var.f102172a = k1.f102228a;
                    }
                } catch (Throwable th3) {
                    bk.f.c0(P, X, f13);
                    throw th3;
                }
            }
            Unit unit = Unit.f80348a;
            bk.f.c0(P, X, f13);
            this.f102236g.clear();
        }
        h();
    }

    public final void j(int i13, int i14, int i15) {
        s3.k0 k0Var = this.f102230a;
        k0Var.f110824l = true;
        k0Var.L(i13, i14, i15);
        k0Var.f110824l = false;
    }

    public final l1 k(Object obj, Function2 function2) {
        s3.k0 k0Var = this.f102230a;
        if (!k0Var.G()) {
            return new j0();
        }
        h();
        if (!this.f102236g.containsKey(obj)) {
            this.f102241l.remove(obj);
            HashMap hashMap = this.f102239j;
            Object obj2 = hashMap.get(obj);
            if (obj2 == null) {
                obj2 = n(obj);
                if (obj2 != null) {
                    j(k0Var.q().indexOf(obj2), k0Var.q().size(), 1);
                    this.f102244o++;
                } else {
                    int size = k0Var.q().size();
                    s3.k0 k0Var2 = new s3.k0(true, 2, 0);
                    k0Var.f110824l = true;
                    k0Var.A(size, k0Var2);
                    k0Var.f110824l = false;
                    this.f102244o++;
                    obj2 = k0Var2;
                }
                hashMap.put(obj, obj2);
            }
            m((s3.k0) obj2, obj, function2);
        }
        return new k0(this, obj);
    }

    public final void m(s3.k0 k0Var, Object obj, Function2 function2) {
        boolean z13;
        HashMap hashMap = this.f102235f;
        Object obj2 = hashMap.get(k0Var);
        Object obj3 = obj2;
        if (obj2 == null) {
            q2.h hVar = l.f102229a;
            c0 c0Var = new c0();
            c0Var.f102172a = obj;
            c0Var.f102173b = hVar;
            c0Var.f102174c = null;
            c0Var.f102177f = bs1.c.u1(Boolean.TRUE, y3.f71400a);
            hashMap.put(k0Var, c0Var);
            obj3 = c0Var;
        }
        c0 c0Var2 = (c0) obj3;
        s2 s2Var = c0Var2.f102174c;
        if (s2Var != null) {
            i2.z zVar = (i2.z) s2Var;
            synchronized (zVar.f71404d) {
                z13 = zVar.f71414n.f78194a.f63242e > 0;
            }
        } else {
            z13 = true;
        }
        if (c0Var2.f102173b != function2 || z13 || c0Var2.a()) {
            c0Var2.f102173b = function2;
            s2.i P = bk.f.P();
            Function1 f13 = P != null ? P.f() : null;
            s2.i X = bk.f.X(P);
            try {
                s3.k0 k0Var2 = this.f102230a;
                k0Var2.f110824l = true;
                Function2 function22 = c0Var2.f102173b;
                s2 s2Var2 = c0Var2.f102174c;
                i2.w wVar = this.f102231b;
                if (wVar == null) {
                    throw new IllegalStateException("parent composition reference not set".toString());
                }
                boolean z14 = c0Var2.f102176e;
                p1.v vVar = new p1.v(2, c0Var2, function22);
                Object obj4 = q2.i.f102113a;
                q2.h hVar2 = new q2.h(vVar, true, -1750409193);
                if (s2Var2 == null || ((i2.z) s2Var2).f71421u) {
                    ViewGroup.LayoutParams layoutParams = f5.f115998a;
                    l2 l2Var = new l2(k0Var);
                    Object obj5 = i2.a0.f71069a;
                    s2Var2 = new i2.z(wVar, l2Var);
                }
                if (z14) {
                    ((i2.z) s2Var2).B(hVar2);
                } else {
                    ((i2.z) s2Var2).n(hVar2);
                }
                c0Var2.f102174c = s2Var2;
                c0Var2.f102176e = false;
                k0Var2.f110824l = false;
                Unit unit = Unit.f80348a;
                bk.f.c0(P, X, f13);
                c0Var2.f102175d = false;
            } catch (Throwable th3) {
                bk.f.c0(P, X, f13);
                throw th3;
            }
        }
    }

    public final s3.k0 n(Object obj) {
        int i13;
        if (this.f102243n == 0) {
            return null;
        }
        s3.k0 k0Var = this.f102230a;
        int size = k0Var.q().size() - this.f102244o;
        int i14 = size - this.f102243n;
        int i15 = size - 1;
        int i16 = i15;
        while (true) {
            if (i16 < i14) {
                i13 = -1;
                break;
            }
            if (Intrinsics.d(g(i16), obj)) {
                i13 = i16;
                break;
            }
            i16--;
        }
        HashMap hashMap = this.f102235f;
        if (i13 == -1) {
            while (i15 >= i14) {
                Object obj2 = hashMap.get((s3.k0) k0Var.q().get(i15));
                Intrinsics.f(obj2);
                c0 c0Var = (c0) obj2;
                if (c0Var.b() == k1.f102228a || this.f102232c.a(obj, c0Var.b())) {
                    c0Var.d(obj);
                    i16 = i15;
                    i13 = i16;
                    break;
                }
                i15--;
            }
            i16 = i15;
        }
        if (i13 == -1) {
            return null;
        }
        if (i16 != i14) {
            j(i16, i14, 1);
        }
        this.f102243n--;
        s3.k0 k0Var2 = (s3.k0) k0Var.q().get(i14);
        Object obj3 = hashMap.get(k0Var2);
        Intrinsics.f(obj3);
        c0 c0Var2 = (c0) obj3;
        c0Var2.f102177f = bs1.c.u1(Boolean.TRUE, y3.f71400a);
        c0Var2.f102176e = true;
        c0Var2.f102175d = true;
        return k0Var2;
    }
}
