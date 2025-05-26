package mm2;

import am2.g1;
import am2.u0;
import am2.u1;
import ao2.m0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.h1;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pn2.b1;
import pn2.r1;

/* loaded from: classes2.dex */
public final class i extends dm2.l implements km2.c {

    /* renamed from: h, reason: collision with root package name */
    public final rg.a f87681h;

    /* renamed from: i, reason: collision with root package name */
    public final gm2.q f87682i;

    /* renamed from: j, reason: collision with root package name */
    public final am2.g f87683j;

    /* renamed from: k, reason: collision with root package name */
    public final rg.a f87684k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.v f87685l;

    /* renamed from: m, reason: collision with root package name */
    public final am2.h f87686m;

    /* renamed from: n, reason: collision with root package name */
    public final am2.c0 f87687n;

    /* renamed from: o, reason: collision with root package name */
    public final u1 f87688o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f87689p;

    /* renamed from: q, reason: collision with root package name */
    public final h f87690q;

    /* renamed from: r, reason: collision with root package name */
    public final o f87691r;

    /* renamed from: s, reason: collision with root package name */
    public final u0 f87692s;

    /* renamed from: t, reason: collision with root package name */
    public final in2.i f87693t;

    /* renamed from: u, reason: collision with root package name */
    public final i0 f87694u;

    /* renamed from: v, reason: collision with root package name */
    public final lm2.d f87695v;

    /* renamed from: w, reason: collision with root package name */
    public final on2.l f87696w;

    static {
        h1.f("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(rg.a r9, am2.m r10, pm2.g r11, am2.g r12) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.i.<init>(rg.a, am2.m, pm2.g, am2.g):void");
    }

    @Override // dm2.b, am2.g
    public final in2.n I() {
        return this.f87693t;
    }

    @Override // am2.g
    public final g1 J() {
        return null;
    }

    @Override // am2.a0
    public final boolean M() {
        return false;
    }

    @Override // am2.g
    public final boolean P() {
        return false;
    }

    @Override // am2.g
    public final boolean S() {
        return false;
    }

    @Override // am2.g
    public final boolean Y() {
        return false;
    }

    @Override // am2.a0
    public final boolean Z() {
        return false;
    }

    @Override // dm2.f0
    public final in2.n a0(qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return (o) this.f87692s.a(kotlinTypeRefiner);
    }

    @Override // am2.g
    public final in2.n b0() {
        return this.f87694u;
    }

    @Override // am2.g
    public final am2.h c() {
        return this.f87686m;
    }

    @Override // am2.g
    public final am2.g c0() {
        return null;
    }

    @Override // am2.j
    public final b1 e() {
        return this.f87690q;
    }

    @Override // bm2.a
    public final bm2.i getAnnotations() {
        return this.f87695v;
    }

    @Override // am2.g, am2.p
    public final am2.q getVisibility() {
        am2.r rVar = am2.s.f15573a;
        u1 u1Var = this.f87688o;
        if (Intrinsics.d(u1Var, rVar)) {
            Class<?> declaringClass = this.f87682i.f65786a.getDeclaringClass();
            if ((declaringClass != null ? new gm2.q(declaringClass) : null) == null) {
                am2.r rVar2 = im2.u.f72780a;
                Intrinsics.f(rVar2);
                return rVar2;
            }
        }
        return m0.r0(u1Var);
    }

    @Override // am2.g
    public final boolean isInline() {
        return false;
    }

    @Override // am2.g, am2.k
    public final List k() {
        return (List) this.f87696w.invoke();
    }

    @Override // am2.g, am2.a0
    public final am2.c0 l() {
        return this.f87687n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // am2.g
    public final Collection p() {
        Class[] clsArr;
        ?? r43;
        if (this.f87687n != am2.c0.SEALED) {
            return q0.f80391a;
        }
        nm2.a m13 = com.bumptech.glide.c.m1(r1.COMMON, false, false, null, 7);
        Class clazz = this.f87682i.f65786a;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method method = (Method) com.bumptech.glide.c.i0().f33804b;
        if (method == null) {
            clsArr = null;
        } else {
            Object invoke = method.invoke(clazz, new Object[0]);
            Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (Class[]) invoke;
        }
        if (clsArr != null) {
            r43 = new ArrayList(clsArr.length);
            for (Class cls : clsArr) {
                r43.add(new gm2.s(cls));
            }
        } else {
            r43 = q0.f80391a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) r43).iterator();
        while (it.hasNext()) {
            am2.j b13 = ((com.google.firebase.messaging.q) this.f87684k.f107933e).O((pm2.i) it.next(), m13).w0().b();
            am2.g gVar = b13 instanceof am2.g ? (am2.g) b13 : null;
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        return CollectionsKt.x0(arrayList, new sw0.u(23));
    }

    @Override // am2.k
    public final boolean q() {
        return this.f87689p;
    }

    @Override // am2.g
    public final boolean s0() {
        return false;
    }

    public final String toString() {
        return "Lazy Java class " + fn2.d.h(this);
    }

    @Override // am2.g
    public final am2.f u() {
        return null;
    }

    @Override // am2.g
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public final List n() {
        return (List) this.f87691r.f87714q.invoke();
    }

    @Override // dm2.b, am2.g
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public final o L() {
        in2.n L = super.L();
        Intrinsics.g(L, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (o) L;
    }
}
