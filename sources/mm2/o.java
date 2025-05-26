package mm2;

import am2.i1;
import ao2.m0;
import dm2.b1;
import dm2.c1;
import dm2.s0;
import dm2.u0;
import im2.r0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import pn2.r1;
import pn2.t1;
import pn2.v1;

/* loaded from: classes2.dex */
public final class o extends c0 {

    /* renamed from: n, reason: collision with root package name */
    public final am2.g f87711n;

    /* renamed from: o, reason: collision with root package name */
    public final pm2.g f87712o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f87713p;

    /* renamed from: q, reason: collision with root package name */
    public final on2.l f87714q;

    /* renamed from: r, reason: collision with root package name */
    public final on2.l f87715r;

    /* renamed from: s, reason: collision with root package name */
    public final on2.l f87716s;

    /* renamed from: t, reason: collision with root package name */
    public final on2.l f87717t;

    /* renamed from: u, reason: collision with root package name */
    public final on2.m f87718u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(rg.a c13, am2.g ownerDescriptor, pm2.g jClass, boolean z13, o oVar) {
        super(c13, oVar);
        Intrinsics.checkNotNullParameter(c13, "c");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f87711n = ownerDescriptor;
        this.f87712o = jClass;
        this.f87713p = z13;
        on2.u c14 = c13.c();
        m mVar = new m(this, c13);
        on2.q qVar = (on2.q) c14;
        qVar.getClass();
        this.f87714q = new on2.l(qVar, mVar);
        on2.u c15 = c13.c();
        n nVar = new n(this, 1);
        on2.q qVar2 = (on2.q) c15;
        qVar2.getClass();
        this.f87715r = new on2.l(qVar2, nVar);
        on2.u c16 = c13.c();
        m mVar2 = new m(c13, this);
        on2.q qVar3 = (on2.q) c16;
        qVar3.getClass();
        this.f87716s = new on2.l(qVar3, mVar2);
        on2.u c17 = c13.c();
        n nVar2 = new n(this, 0);
        on2.q qVar4 = (on2.q) c17;
        qVar4.getClass();
        this.f87717t = new on2.l(qVar4, nVar2);
        this.f87718u = ((on2.q) c13.c()).e(new br1.a0(7, this, c13));
    }

    public static u0 C(u0 u0Var, am2.x xVar, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return u0Var;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            u0 u0Var2 = (u0) it.next();
            if (!Intrinsics.d(u0Var, u0Var2) && u0Var2.C == null && F(u0Var2, xVar)) {
                am2.x build = u0Var.q0().g().build();
                Intrinsics.f(build);
                return (u0) build;
            }
        }
        return u0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static dm2.u0 D(dm2.u0 r5) {
        /*
            java.util.List r0 = r5.x()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Object r0 = kotlin.collections.CollectionsKt.d0(r0)
            am2.i1 r0 = (am2.i1) r0
            r2 = 0
            if (r0 == 0) goto L7f
            r3 = r0
            dm2.c1 r3 = (dm2.c1) r3
            pn2.b0 r3 = r3.getType()
            pn2.b1 r3 = r3.w0()
            am2.j r3 = r3.b()
            if (r3 == 0) goto L38
            ym2.e r3 = fn2.d.h(r3)
            if (r3 == 0) goto L38
            boolean r4 = r3.d()
            if (r4 == 0) goto L30
            goto L31
        L30:
            r3 = r2
        L31:
            if (r3 == 0) goto L38
            ym2.c r3 = r3.g()
            goto L39
        L38:
            r3 = r2
        L39:
            ym2.c r4 = xl2.r.f135327g
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r4)
            if (r3 == 0) goto L42
            goto L43
        L42:
            r0 = r2
        L43:
            if (r0 != 0) goto L46
            goto L7f
        L46:
            am2.w r2 = r5.q0()
            java.util.List r5 = r5.x()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            java.util.List r5 = kotlin.collections.CollectionsKt.O(r5)
            am2.w r5 = r2.b(r5)
            dm2.c1 r0 = (dm2.c1) r0
            pn2.b0 r0 = r0.getType()
            java.util.List r0 = r0.u0()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            pn2.g1 r0 = (pn2.g1) r0
            pn2.b0 r0 = r0.getType()
            am2.w r5 = r5.f(r0)
            am2.x r5 = r5.build()
            dm2.u0 r5 = (dm2.u0) r5
            if (r5 != 0) goto L7b
            goto L7e
        L7b:
            r0 = 1
            r5.f55583v = r0
        L7e:
            return r5
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.o.D(dm2.u0):dm2.u0");
    }

    public static boolean F(am2.b bVar, am2.b bVar2) {
        bn2.m c13 = bn2.o.f23590d.p(bVar2, bVar, true).c();
        Intrinsics.checkNotNullExpressionValue(c13, "getResult(...)");
        return c13 == bn2.m.OVERRIDABLE && !re2.f.f(bVar2, bVar);
    }

    public static boolean G(u0 u0Var, u0 u0Var2) {
        int i13 = im2.e.f72718m;
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        if (Intrinsics.d(u0Var.getName().b(), "removeAt") && Intrinsics.d(com.bumptech.glide.c.t(u0Var), r0.f72772h.f72758e)) {
            u0Var2 = u0Var2.o0();
        }
        Intrinsics.f(u0Var2);
        return F(u0Var2, u0Var);
    }

    public static u0 H(am2.r0 r0Var, String str, Function1 function1) {
        u0 u0Var;
        ym2.g e13 = ym2.g.e(str);
        Intrinsics.checkNotNullExpressionValue(e13, "identifier(...)");
        Iterator it = ((Iterable) function1.invoke(e13)).iterator();
        do {
            u0Var = null;
            if (!it.hasNext()) {
                break;
            }
            u0 u0Var2 = (u0) it.next();
            if (u0Var2.x().size() == 0) {
                qn2.o oVar = qn2.d.f104496a;
                pn2.b0 b0Var = u0Var2.f55568g;
                if (b0Var != null && oVar.b(b0Var, r0Var.getType())) {
                    u0Var = u0Var2;
                }
            }
        } while (u0Var == null);
        return u0Var;
    }

    public static u0 J(am2.r0 r0Var, Function1 function1) {
        u0 u0Var;
        pn2.b0 b0Var;
        String b13 = r0Var.getName().b();
        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        ym2.g e13 = ym2.g.e(im2.c0.b(b13));
        Intrinsics.checkNotNullExpressionValue(e13, "identifier(...)");
        Iterator it = ((Iterable) function1.invoke(e13)).iterator();
        do {
            u0Var = null;
            if (!it.hasNext()) {
                break;
            }
            u0 u0Var2 = (u0) it.next();
            if (u0Var2.x().size() == 1 && (b0Var = u0Var2.f55568g) != null) {
                ym2.g gVar = xl2.l.f135279e;
                if (xl2.l.F(b0Var, xl2.q.f135298d)) {
                    qn2.o oVar = qn2.d.f104496a;
                    List x13 = u0Var2.x();
                    Intrinsics.checkNotNullExpressionValue(x13, "getValueParameters(...)");
                    if (oVar.a(((c1) ((i1) CollectionsKt.s0(x13))).getType(), r0Var.getType())) {
                        u0Var = u0Var2;
                    }
                }
            }
        } while (u0Var == null);
        return u0Var;
    }

    public static boolean M(u0 u0Var, am2.x xVar) {
        String s13 = com.bumptech.glide.c.s(u0Var, 2);
        am2.x o03 = xVar.o0();
        Intrinsics.checkNotNullExpressionValue(o03, "getOriginal(...)");
        return Intrinsics.d(s13, com.bumptech.glide.c.s(o03, 2)) && !F(u0Var, xVar);
    }

    public static final ArrayList v(o oVar, ym2.g gVar) {
        Collection f13 = ((c) oVar.f87646e.invoke()).f(gVar);
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(f13, 10));
        Iterator it = f13.iterator();
        while (it.hasNext()) {
            arrayList.add(oVar.t((gm2.z) it.next()));
        }
        return arrayList;
    }

    public static final ArrayList w(o oVar, ym2.g gVar) {
        LinkedHashSet K = oVar.K(gVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : K) {
            u0 u0Var = (u0) obj;
            Intrinsics.checkNotNullParameter(u0Var, "<this>");
            if (dl2.b.T0(u0Var) == null && im2.h.a(u0Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void A(Set set, AbstractCollection abstractCollection, wn2.i iVar, l lVar) {
        u0 u0Var;
        s0 s0Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            am2.r0 r0Var = (am2.r0) it.next();
            km2.d dVar = null;
            if (E(r0Var, lVar)) {
                u0 I = I(r0Var, lVar);
                Intrinsics.f(I);
                if (r0Var.C()) {
                    u0Var = J(r0Var, lVar);
                    Intrinsics.f(u0Var);
                } else {
                    u0Var = null;
                }
                if (u0Var != null) {
                    u0Var.l();
                    I.l();
                }
                km2.d dVar2 = new km2.d(this.f87711n, I, u0Var, r0Var);
                pn2.b0 b0Var = I.f55568g;
                Intrinsics.f(b0Var);
                q0 q0Var = q0.f80391a;
                dVar2.B0(b0Var, q0Var, p(), null, q0Var);
                dm2.r0 W = dl2.b.W(dVar2, I.getAnnotations(), false, I.b());
                W.f55479l = I;
                W.w0(dVar2.getType());
                Intrinsics.checkNotNullExpressionValue(W, "apply(...)");
                if (u0Var != null) {
                    List x13 = u0Var.x();
                    Intrinsics.checkNotNullExpressionValue(x13, "getValueParameters(...)");
                    Object obj = (i1) CollectionsKt.firstOrNull(x13);
                    if (obj == null) {
                        throw new AssertionError("No parameter found for " + u0Var);
                    }
                    s0Var = dl2.b.Y(dVar2, u0Var.getAnnotations(), ((bm2.b) obj).getAnnotations(), false, u0Var.getVisibility(), u0Var.b());
                    s0Var.f55479l = u0Var;
                } else {
                    s0Var = null;
                }
                dVar2.y0(W, s0Var, null, null);
                dVar = dVar2;
            }
            if (dVar != null) {
                abstractCollection.add(dVar);
                if (iVar != null) {
                    iVar.add(r0Var);
                    return;
                }
                return;
            }
        }
    }

    public final Collection B() {
        boolean z13 = this.f87713p;
        am2.g classDescriptor = this.f87711n;
        if (z13) {
            Collection c13 = classDescriptor.e().c();
            Intrinsics.checkNotNullExpressionValue(c13, "getSupertypes(...)");
            return c13;
        }
        ((qn2.o) ((lm2.a) this.f87643b.f107929a).f83951u).getClass();
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Collection c14 = classDescriptor.e().c();
        Intrinsics.checkNotNullExpressionValue(c14, "getSupertypes(...)");
        return c14;
    }

    public final boolean E(am2.r0 r0Var, Function1 function1) {
        if (l0.G0(r0Var)) {
            return false;
        }
        u0 I = I(r0Var, function1);
        u0 J2 = J(r0Var, function1);
        if (I == null) {
            return false;
        }
        if (r0Var.C()) {
            return J2 != null && J2.l() == I.l();
        }
        return true;
    }

    public final u0 I(am2.r0 r0Var, Function1 function1) {
        ym2.g gVar;
        dm2.r0 getter = r0Var.getGetter();
        String str = null;
        am2.s0 s0Var = getter != null ? (am2.s0) dl2.b.T0(getter) : null;
        if (s0Var != null) {
            Intrinsics.checkNotNullParameter(s0Var, "<this>");
            xl2.l.B(s0Var);
            am2.d b13 = fn2.d.b(fn2.d.l(s0Var), im2.j.f72748i);
            if (b13 != null && (gVar = (ym2.g) im2.i.f72744a.get(fn2.d.g(b13))) != null) {
                str = gVar.b();
            }
        }
        if (str != null && !dl2.b.p1(this.f87711n, s0Var)) {
            return H(r0Var, str, function1);
        }
        String b14 = r0Var.getName().b();
        Intrinsics.checkNotNullExpressionValue(b14, "asString(...)");
        return H(r0Var, im2.c0.a(b14), function1);
    }

    public final LinkedHashSet K(ym2.g gVar) {
        Collection B = B();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = B.iterator();
        while (it.hasNext()) {
            kotlin.collections.k0.u(((pn2.b0) it.next()).w().a(gVar, hm2.e.WHEN_GET_SUPER_MEMBERS), linkedHashSet);
        }
        return linkedHashSet;
    }

    public final Set L(ym2.g gVar) {
        Collection B = B();
        ArrayList arrayList = new ArrayList();
        Iterator it = B.iterator();
        while (it.hasNext()) {
            Collection d2 = ((pn2.b0) it.next()).w().d(gVar, hm2.e.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(d2, 10));
            Iterator it2 = d2.iterator();
            while (it2.hasNext()) {
                arrayList2.add((am2.r0) it2.next());
            }
            kotlin.collections.k0.u(arrayList2, arrayList);
        }
        return CollectionsKt.J0(arrayList);
    }

    public final boolean N(u0 u0Var) {
        Iterable k13;
        ym2.g methodName = u0Var.getName();
        Intrinsics.checkNotNullExpressionValue(methodName, "getName(...)");
        Intrinsics.checkNotNullParameter(methodName, "name");
        String name = methodName.b();
        Intrinsics.checkNotNullExpressionValue(name, "asString(...)");
        ym2.c cVar = im2.c0.f72699a;
        Intrinsics.checkNotNullParameter(name, "name");
        if (kotlin.text.z.p(name, "get", false) || kotlin.text.z.p(name, "is", false)) {
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            ym2.g B = kotlin.jvm.internal.j.B(methodName, "get", null, 12);
            if (B == null) {
                B = kotlin.jvm.internal.j.B(methodName, "is", null, 8);
            }
            k13 = kotlin.collections.f0.k(B);
        } else {
            Intrinsics.checkNotNullParameter(name, "name");
            if (kotlin.text.z.p(name, "set", false)) {
                Intrinsics.checkNotNullParameter(methodName, "methodName");
                Intrinsics.checkNotNullParameter(methodName, "methodName");
                ym2.g B2 = kotlin.jvm.internal.j.B(methodName, "set", null, 4);
                Intrinsics.checkNotNullParameter(methodName, "methodName");
                ym2.g[] elements = {B2, kotlin.jvm.internal.j.B(methodName, "set", "is", 4)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                k13 = kotlin.collections.c0.A(elements);
            } else {
                Map map = im2.i.f72744a;
                Intrinsics.checkNotNullParameter(methodName, "name1");
                k13 = (List) im2.i.f72745b.get(methodName);
                if (k13 == null) {
                    k13 = q0.f80391a;
                }
            }
        }
        Iterable iterable = k13;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Set<am2.r0> L = L((ym2.g) it.next());
                if (!(L instanceof Collection) || !L.isEmpty()) {
                    for (am2.r0 r0Var : L) {
                        if (E(r0Var, new br1.a0(6, u0Var, this))) {
                            if (!r0Var.C()) {
                                String name2 = u0Var.getName().b();
                                Intrinsics.checkNotNullExpressionValue(name2, "asString(...)");
                                Intrinsics.checkNotNullParameter(name2, "name");
                                if (!kotlin.text.z.p(name2, "set", false)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        re2.h hVar = r0.f72765a;
        ym2.g name3 = u0Var.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
        Intrinsics.checkNotNullParameter(name3, "name");
        ym2.g gVar = (ym2.g) r0.f72776l.get(name3);
        if (gVar != null) {
            LinkedHashSet K = K(gVar);
            ArrayList arrayList = new ArrayList();
            for (Object obj : K) {
                u0 u0Var2 = (u0) obj;
                Intrinsics.checkNotNullParameter(u0Var2, "<this>");
                if (dl2.b.T0(u0Var2) != null) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                am2.w q03 = u0Var.q0();
                q03.o(gVar);
                q03.p();
                q03.m();
                am2.x build = q03.build();
                Intrinsics.f(build);
                u0 u0Var3 = (u0) build;
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (G((u0) it2.next(), u0Var3)) {
                            return false;
                        }
                    }
                }
            }
        }
        int i13 = im2.h.f72741m;
        ym2.g name4 = u0Var.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
        if (im2.h.b(name4)) {
            ym2.g name5 = u0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name5, "getName(...)");
            LinkedHashSet K2 = K(name5);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = K2.iterator();
            while (it3.hasNext()) {
                am2.x a13 = im2.h.a((u0) it3.next());
                if (a13 != null) {
                    arrayList2.add(a13);
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    if (M(u0Var, (am2.x) it4.next())) {
                        return false;
                    }
                }
            }
        }
        u0 D = D(u0Var);
        if (D != null) {
            ym2.g name6 = u0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name6, "getName(...)");
            LinkedHashSet<u0> K3 = K(name6);
            if (!K3.isEmpty()) {
                for (u0 u0Var4 : K3) {
                    if (u0Var4.isSuspend() && F(D, u0Var4)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final void O(ym2.g name, hm2.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        dl2.b.p2(((lm2.a) this.f87643b.f107929a).f83944n, (hm2.e) location, this.f87711n, name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final km2.g P(pm2.o oVar) {
        rg.a aVar = this.f87643b;
        km2.g I0 = km2.g.I0(this.f87711n, dl2.b.v2(aVar, oVar), ((gm2.y) oVar).c(), ((fm2.f) ((lm2.a) aVar.f107929a).f83940j).b(oVar), true);
        Intrinsics.checkNotNullExpressionValue(I0, "createJavaMethod(...)");
        pn2.b0 O = ((com.google.firebase.messaging.q) aVar.f107933e).O(((gm2.c0) oVar).f(), com.bumptech.glide.c.m1(r1.COMMON, false, false, null, 6));
        dm2.d p13 = p();
        q0 q0Var = q0.f80391a;
        am2.c0.Companion.getClass();
        I0.H0(null, p13, q0Var, q0Var, q0Var, O, am2.b0.a(false, false, true), am2.s.f15577e, null);
        I0.E = km2.f.get(false, false);
        ((re2.f) ((lm2.a) aVar.f107929a).f83937g).getClass();
        return I0;
    }

    @Override // mm2.c0, in2.o, in2.n
    public final Collection a(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        O(name, location);
        return super.a(name, location);
    }

    @Override // mm2.c0, in2.o, in2.n
    public final Collection d(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        O(name, location);
        return super.d(name, location);
    }

    @Override // in2.o, in2.p
    public final am2.j e(ym2.g name, hm2.e location) {
        on2.m mVar;
        am2.g gVar;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        O(name, location);
        o oVar = (o) this.f87644c;
        return (oVar == null || (mVar = oVar.f87718u) == null || (gVar = (am2.g) mVar.invoke(name)) == null) ? (am2.j) this.f87718u.invoke(name) : gVar;
    }

    @Override // mm2.c0
    public final Set h(in2.g kindFilter, in2.k kVar) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return kotlin.collections.i1.i((Set) this.f87715r.invoke(), ((Map) this.f87717t.invoke()).keySet());
    }

    @Override // mm2.c0
    public final Set i(in2.g kindFilter, in2.k kVar) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        am2.g gVar = this.f87711n;
        Collection c13 = gVar.e().c();
        Intrinsics.checkNotNullExpressionValue(c13, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = c13.iterator();
        while (it.hasNext()) {
            kotlin.collections.k0.u(((pn2.b0) it.next()).w().b(), linkedHashSet);
        }
        on2.l lVar = this.f87646e;
        linkedHashSet.addAll(((c) lVar.invoke()).a());
        linkedHashSet.addAll(((c) lVar.invoke()).d());
        linkedHashSet.addAll(h(kindFilter, kVar));
        rg.a aVar = this.f87643b;
        linkedHashSet.addAll(((gn2.a) ((lm2.a) aVar.f107929a).f83954x).e(aVar, gVar));
        return linkedHashSet;
    }

    @Override // mm2.c0
    public final void j(ArrayList result, ym2.g name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        if (((gm2.q) this.f87712o).g()) {
            on2.l lVar = this.f87646e;
            if (((c) lVar.invoke()).b(name) != null) {
                if (!result.isEmpty()) {
                    Iterator it = result.iterator();
                    while (it.hasNext()) {
                        if (((u0) it.next()).x().isEmpty()) {
                            break;
                        }
                    }
                }
                pm2.o b13 = ((c) lVar.invoke()).b(name);
                Intrinsics.f(b13);
                result.add(P(b13));
            }
        }
        rg.a aVar = this.f87643b;
        ((gn2.a) ((lm2.a) aVar.f107929a).f83954x).b(aVar, this.f87711n, name, result);
    }

    @Override // mm2.c0
    public final c k() {
        return new a(this.f87712o, j.f87700i);
    }

    @Override // mm2.c0
    public final void m(LinkedHashSet result, ym2.g name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        LinkedHashSet K = K(name);
        re2.h hVar = r0.f72765a;
        Intrinsics.checkNotNullParameter(name, "<this>");
        if (!r0.f72775k.contains(name)) {
            int i13 = im2.h.f72741m;
            if (!im2.h.b(name)) {
                if (!K.isEmpty()) {
                    Iterator it = K.iterator();
                    while (it.hasNext()) {
                        if (((am2.x) it.next()).isSuspend()) {
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : K) {
                    if (N((u0) obj)) {
                        arrayList.add(obj);
                    }
                }
                y(result, name, arrayList, false);
                return;
            }
        }
        wn2.i iVar = new wn2.i();
        LinkedHashSet c13 = l0.c1(name, K, q0.f80391a, this.f87711n, ln2.u.f84139a, ((qn2.o) ((lm2.a) this.f87643b.f107929a).f83951u).f104515d);
        Intrinsics.checkNotNullExpressionValue(c13, "resolveOverridesForNonStaticMembers(...)");
        z(name, result, c13, result, new k(this, 0));
        z(name, result, c13, iVar, new k(this, 1));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : K) {
            if (N((u0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        y(result, name, CollectionsKt.l0(iVar, arrayList2), true);
    }

    @Override // mm2.c0
    public final void n(ArrayList result, ym2.g name) {
        gm2.z typeParameterOwner;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        boolean isAnnotation = ((gm2.q) this.f87712o).f65786a.isAnnotation();
        rg.a aVar = this.f87643b;
        if (isAnnotation && (typeParameterOwner = (gm2.z) CollectionsKt.t0(((c) this.f87646e.invoke()).f(name))) != null) {
            km2.h containingDeclaration = km2.h.C0(this.f87711n, dl2.b.v2(aVar, typeParameterOwner), am2.c0.FINAL, m0.r0(typeParameterOwner.e()), false, typeParameterOwner.c(), ((fm2.f) ((lm2.a) aVar.f107929a).f83940j).b(typeParameterOwner), false);
            Intrinsics.checkNotNullExpressionValue(containingDeclaration, "create(...)");
            dm2.r0 Q = dl2.b.Q(containingDeclaration, bm2.h.f23540a);
            Intrinsics.checkNotNullExpressionValue(Q, "createDefaultGetter(...)");
            containingDeclaration.y0(Q, null, null, null);
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
            Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
            pn2.b0 l13 = c0.l(typeParameterOwner, new rg.a((lm2.a) aVar.f107929a, new lm2.f(aVar, containingDeclaration, typeParameterOwner, 0), (xk2.k) aVar.f107931c));
            q0 q0Var = q0.f80391a;
            containingDeclaration.B0(l13, q0Var, p(), null, q0Var);
            Q.w0(l13);
            result.add(containingDeclaration);
        }
        Set L = L(name);
        if (L.isEmpty()) {
            return;
        }
        wn2.i iVar = new wn2.i();
        wn2.i iVar2 = new wn2.i();
        A(L, result, iVar, new l(this, 0));
        A(kotlin.collections.i1.h(L, iVar), iVar2, null, new l(this, 1));
        LinkedHashSet i13 = kotlin.collections.i1.i(L, iVar2);
        lm2.a aVar2 = (lm2.a) aVar.f107929a;
        LinkedHashSet c13 = l0.c1(name, i13, result, this.f87711n, aVar2.f83936f, ((qn2.o) aVar2.f83951u).f104515d);
        Intrinsics.checkNotNullExpressionValue(c13, "resolveOverridesForNonStaticMembers(...)");
        result.addAll(c13);
    }

    @Override // mm2.c0
    public final Set o(in2.g kindFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        if (((gm2.q) this.f87712o).f65786a.isAnnotation()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((c) this.f87646e.invoke()).e());
        Collection c13 = this.f87711n.e().c();
        Intrinsics.checkNotNullExpressionValue(c13, "getSupertypes(...)");
        Iterator it = c13.iterator();
        while (it.hasNext()) {
            kotlin.collections.k0.u(((pn2.b0) it.next()).w().f(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // mm2.c0
    public final dm2.d p() {
        am2.g gVar = this.f87711n;
        if (gVar != null) {
            int i13 = bn2.e.f23579a;
            return gVar.t0();
        }
        bn2.e.a(0);
        throw null;
    }

    @Override // mm2.c0
    public final am2.m q() {
        return this.f87711n;
    }

    @Override // mm2.c0
    public final boolean r(km2.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (((gm2.q) this.f87712o).f65786a.isAnnotation()) {
            return false;
        }
        return N(gVar);
    }

    @Override // mm2.c0
    public final x s(gm2.z method, ArrayList methodTypeParameters, pn2.b0 returnType, List valueParameters) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(methodTypeParameters, "methodTypeParameters");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
        ((re2.h) ((lm2.a) this.f87643b.f107929a).f83935e).getClass();
        if (method == null) {
            re2.h.c(0);
            throw null;
        }
        if (this.f87711n == null) {
            re2.h.c(1);
            throw null;
        }
        if (returnType == null) {
            re2.h.c(2);
            throw null;
        }
        if (valueParameters == null) {
            re2.h.c(3);
            throw null;
        }
        List emptyList = Collections.emptyList();
        com.google.android.gms.common.api.internal.b0 b0Var = new com.google.android.gms.common.api.internal.b0(valueParameters, methodTypeParameters, emptyList, returnType);
        Intrinsics.checkNotNullExpressionValue(b0Var, "resolvePropagatedSignature(...)");
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        List list = (List) b0Var.f30791d;
        if (list == null) {
            com.google.android.gms.common.api.internal.b0.a(5);
            throw null;
        }
        Intrinsics.checkNotNullExpressionValue(list, "getValueParameters(...)");
        List list2 = (List) b0Var.f30792e;
        if (list2 == null) {
            com.google.android.gms.common.api.internal.b0.a(6);
            throw null;
        }
        Intrinsics.checkNotNullExpressionValue(list2, "getTypeParameters(...)");
        boolean z13 = b0Var.f30788a;
        List list3 = emptyList;
        Intrinsics.checkNotNullExpressionValue(list3, "getErrors(...)");
        return new x(list, list2, list3, returnType, z13);
    }

    @Override // mm2.c0
    public final String toString() {
        return "Lazy Java member scope for " + ((gm2.q) this.f87712o).c();
    }

    public final void x(ArrayList arrayList, km2.b bVar, int i13, gm2.z zVar, pn2.b0 b0Var, pn2.b0 b0Var2) {
        o oVar;
        v1 v1Var;
        bm2.g gVar = bm2.h.f23540a;
        ym2.g c13 = zVar.c();
        v1 i14 = t1.i(b0Var);
        Intrinsics.checkNotNullExpressionValue(i14, "makeNotNullable(...)");
        Object defaultValue = zVar.f65794a.getDefaultValue();
        boolean z13 = (defaultValue != null ? re2.h.g(defaultValue, null) : null) != null;
        if (b0Var2 != null) {
            oVar = this;
            v1Var = t1.i(b0Var2);
        } else {
            oVar = this;
            v1Var = null;
        }
        arrayList.add(new b1(bVar, null, i13, gVar, c13, i14, z13, false, false, v1Var, ((fm2.f) ((lm2.a) oVar.f87643b.f107929a).f83940j).b(zVar)));
    }

    public final void y(LinkedHashSet linkedHashSet, ym2.g gVar, ArrayList arrayList, boolean z13) {
        lm2.a aVar = (lm2.a) this.f87643b.f107929a;
        LinkedHashSet<u0> c13 = l0.c1(gVar, arrayList, linkedHashSet, this.f87711n, aVar.f83936f, ((qn2.o) aVar.f83951u).f104515d);
        Intrinsics.checkNotNullExpressionValue(c13, "resolveOverridesForNonStaticMembers(...)");
        if (!z13) {
            linkedHashSet.addAll(c13);
            return;
        }
        ArrayList l03 = CollectionsKt.l0(c13, linkedHashSet);
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(c13, 10));
        for (u0 u0Var : c13) {
            u0 u0Var2 = (u0) dl2.b.U0(u0Var);
            if (u0Var2 != null) {
                u0Var = C(u0Var, u0Var2, l03);
            }
            arrayList2.add(u0Var);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0139 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(ym2.g r11, java.util.LinkedHashSet r12, java.util.LinkedHashSet r13, java.util.AbstractSet r14, mm2.k r15) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.o.z(ym2.g, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.AbstractSet, mm2.k):void");
    }
}
