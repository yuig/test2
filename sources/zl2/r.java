package zl2;

import am2.c0;
import am2.d0;
import am2.i1;
import am2.x;
import ao2.m0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dm2.c1;
import dm2.i0;
import dm2.u0;
import dm2.y;
import dm2.z;
import i2.j2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import pn2.h0;
import pn2.q1;

/* loaded from: classes2.dex */
public final class r implements cm2.b, cm2.e {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f142144h;

    /* renamed from: a, reason: collision with root package name */
    public final d0 f142145a;

    /* renamed from: b, reason: collision with root package name */
    public final on2.l f142146b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f142147c;

    /* renamed from: d, reason: collision with root package name */
    public final on2.l f142148d;

    /* renamed from: e, reason: collision with root package name */
    public final on2.f f142149e;

    /* renamed from: f, reason: collision with root package name */
    public final on2.l f142150f;

    /* renamed from: g, reason: collision with root package name */
    public final on2.n f142151g;

    static {
        l0 l0Var = k0.f80436a;
        f142144h = new rl2.u[]{l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(r.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(r.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(r.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public r(i0 moduleDescriptor, on2.u storageManager, tu1.u settingsComputation) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(settingsComputation, "settingsComputation");
        this.f142145a = moduleDescriptor;
        on2.q qVar = (on2.q) storageManager;
        qVar.getClass();
        this.f142146b = new on2.l(qVar, settingsComputation);
        dm2.m mVar = new dm2.m(new n(moduleDescriptor, new ym2.c("java.io")), ym2.g.e("Serializable"), c0.ABSTRACT, am2.h.INTERFACE, e0.b(new pn2.d0(qVar, new o(this, 0))), qVar);
        mVar.u0(in2.m.f72874b, s0.f80394a, null);
        h0 j13 = mVar.j();
        Intrinsics.checkNotNullExpressionValue(j13, "getDefaultType(...)");
        this.f142147c = j13;
        this.f142148d = new on2.l(qVar, new j2(20, this, qVar));
        this.f142149e = new on2.f(qVar, new ConcurrentHashMap(3, 1.0f, 2));
        this.f142150f = new on2.l(qVar, new o(this, 1));
        this.f142151g = qVar.d(new p(this, 0));
    }

    public static final boolean g(am2.f fVar, q1 q1Var, am2.f fVar2) {
        return bn2.o.k(fVar, ((dm2.k) fVar2).d(q1Var)) == bn2.m.OVERRIDABLE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean j(am2.f fVar, nn2.j jVar) {
        z zVar = (z) fVar;
        if (zVar.x().size() == 1) {
            List x13 = zVar.x();
            Intrinsics.checkNotNullExpressionValue(x13, "getValueParameters(...)");
            am2.j b13 = ((c1) ((i1) CollectionsKt.s0(x13))).getType().w0().b();
            if (Intrinsics.d(b13 != null ? fn2.d.h(b13) : null, fn2.d.h(jVar))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cm2.b
    public final Collection a(nn2.j classDescriptor) {
        am2.g d2;
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (classDescriptor.f91600k != am2.h.CLASS || !i().f142131b) {
            return q0.f80391a;
        }
        mm2.i h10 = h(classDescriptor);
        if (h10 != null && (d2 = e.d(fn2.d.g(h10), b.f142102f)) != null) {
            q1 c13 = dl2.b.X(d2, h10).c();
            List n13 = h10.n();
            ArrayList arrayList = new ArrayList();
            for (Object obj : n13) {
                am2.f fVar = (am2.f) obj;
                if (((z) fVar).getVisibility().f15569a.f15600b) {
                    Collection n14 = d2.n();
                    Intrinsics.checkNotNullExpressionValue(n14, "getConstructors(...)");
                    Collection<am2.f> collection = n14;
                    if (!(collection instanceof Collection) || !collection.isEmpty()) {
                        for (am2.f fVar2 : collection) {
                            Intrinsics.f(fVar2);
                            if (g(fVar2, c13, fVar)) {
                                break;
                            }
                        }
                    }
                    if (!j(fVar, classDescriptor) && !xl2.l.E(fVar)) {
                        LinkedHashSet linkedHashSet = u.f142154a;
                        if (!u.f142159f.contains(lb.l0.p1(h10, com.bumptech.glide.c.s(fVar, 3)))) {
                            arrayList.add(obj);
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                x xVar = (am2.f) it.next();
                z zVar = (z) xVar;
                zVar.getClass();
                y z03 = zVar.z0(q1.f100833b);
                z03.k(classDescriptor);
                z03.f(classDescriptor.j());
                z03.f55556o = true;
                z03.r(c13.h());
                LinkedHashSet linkedHashSet2 = u.f142154a;
                if (!u.f142160g.contains(lb.l0.p1(h10, com.bumptech.glide.c.s(xVar, 3)))) {
                    z03.c((bm2.i) lb.l0.B0(this.f142150f, f142144h[2]));
                }
                am2.p w03 = z03.f55565x.w0(z03);
                Intrinsics.g(w03, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                arrayList2.add((am2.f) w03);
            }
            return arrayList2;
        }
        return q0.f80391a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (java.io.Serializable.class.isAssignableFrom(java.lang.Class.forName(r4.b().b())) != false) goto L14;
     */
    @Override // cm2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection b(nn2.j r4) {
        /*
            r3 = this;
            java.lang.String r0 = "classDescriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            ym2.e r4 = fn2.d.h(r4)
            java.util.LinkedHashSet r0 = zl2.u.f142154a
            boolean r0 = zl2.u.a(r4)
            pn2.h0 r1 = r3.f142147c
            if (r0 == 0) goto L2c
            pn2.h0 r4 = r3.f()
            java.lang.String r0 = "<get-cloneableType>(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            r0 = 2
            pn2.b0[] r0 = new pn2.b0[r0]
            r2 = 0
            r0[r2] = r4
            r4 = 1
            r0[r4] = r1
            java.util.List r4 = kotlin.collections.f0.j(r0)
            java.util.Collection r4 = (java.util.Collection) r4
            goto L5e
        L2c:
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = zl2.u.a(r4)
            if (r0 == 0) goto L38
            goto L55
        L38:
            java.lang.String r0 = zl2.d.f142106a
            ym2.b r4 = zl2.d.g(r4)
            if (r4 != 0) goto L41
            goto L5c
        L41:
            ym2.c r4 = r4.b()     // Catch: java.lang.ClassNotFoundException -> L5c
            java.lang.String r4 = r4.b()     // Catch: java.lang.ClassNotFoundException -> L5c
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L5c
            java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
            boolean r4 = r0.isAssignableFrom(r4)
            if (r4 == 0) goto L5c
        L55:
            java.util.List r4 = kotlin.collections.e0.b(r1)
            java.util.Collection r4 = (java.util.Collection) r4
            goto L5e
        L5c:
            kotlin.collections.q0 r4 = kotlin.collections.q0.f80391a
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.r.b(nn2.j):java.util.Collection");
    }

    @Override // cm2.b
    public final Collection c(nn2.j classDescriptor) {
        Set set;
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (i().f142131b) {
            mm2.i h10 = h(classDescriptor);
            if (h10 == null || (set = h10.L().b()) == null) {
                set = s0.f80394a;
            }
        } else {
            set = s0.f80394a;
        }
        return set;
    }

    @Override // cm2.e
    public final boolean d(nn2.j classDescriptor, nn2.t functionDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        mm2.i h10 = h(classDescriptor);
        if (h10 == null || !functionDescriptor.getAnnotations().Q(cm2.f.f28034a)) {
            return true;
        }
        if (!i().f142131b) {
            return false;
        }
        String s13 = com.bumptech.glide.c.s(functionDescriptor, 3);
        mm2.o L = h10.L();
        ym2.g name = functionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Collection a13 = L.a(name, hm2.e.FROM_BUILTINS);
        if (!(a13 instanceof Collection) || !a13.isEmpty()) {
            Iterator it = a13.iterator();
            while (it.hasNext()) {
                if (Intrinsics.d(com.bumptech.glide.c.s((u0) it.next(), 3), s13)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x02b2, code lost:
    
        if (r11 != 4) goto L102;
     */
    @Override // cm2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection e(ym2.g r17, nn2.j r18) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.r.e(ym2.g, nn2.j):java.util.Collection");
    }

    public final h0 f() {
        return (h0) lb.l0.B0(this.f142148d, f142144h[1]);
    }

    public final mm2.i h(am2.g gVar) {
        ym2.c b13;
        if (gVar == null) {
            xl2.l.a(RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL);
            throw null;
        }
        ym2.g gVar2 = xl2.l.f135279e;
        if (xl2.l.b(gVar, xl2.q.f135292a) || !xl2.l.K(gVar)) {
            return null;
        }
        ym2.e h10 = fn2.d.h(gVar);
        if (!h10.d()) {
            return null;
        }
        String str = d.f142106a;
        ym2.b g13 = d.g(h10);
        if (g13 == null || (b13 = g13.b()) == null) {
            return null;
        }
        am2.g g03 = m0.g0(i().f142130a, b13, hm2.e.FROM_BUILTINS);
        if (g03 instanceof mm2.i) {
            return (mm2.i) g03;
        }
        return null;
    }

    public final i i() {
        return (i) lb.l0.B0(this.f142146b, f142144h[0]);
    }
}
