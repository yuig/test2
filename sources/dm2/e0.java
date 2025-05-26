package dm2;

import am2.g1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pn2.l1;
import pn2.q1;
import pn2.t1;
import pn2.w1;

/* loaded from: classes4.dex */
public final class e0 extends f0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f55411a;

    /* renamed from: b, reason: collision with root package name */
    public final q1 f55412b;

    /* renamed from: c, reason: collision with root package name */
    public q1 f55413c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f55414d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f55415e;

    /* renamed from: f, reason: collision with root package name */
    public pn2.o f55416f;

    public e0(f0 f0Var, q1 q1Var) {
        this.f55411a = f0Var;
        this.f55412b = q1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void o0(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dm2.e0.o0(int):void");
    }

    @Override // am2.g
    public final in2.n G(l1 l1Var) {
        if (l1Var != null) {
            fn2.d.i(bn2.e.d(this));
            return X(l1Var, qn2.h.f104498a);
        }
        o0(10);
        throw null;
    }

    @Override // am2.g
    public final in2.n I() {
        in2.n I = this.f55411a.I();
        if (I != null) {
            return I;
        }
        o0(28);
        throw null;
    }

    @Override // am2.g
    public final g1 J() {
        g1 J2 = this.f55411a.J();
        if (J2 == null) {
            return null;
        }
        d0 transform = new d0(this, 1);
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (J2 instanceof am2.y) {
            am2.y yVar = (am2.y) J2;
            return new am2.y(yVar.f15603a, (sn2.g) transform.invoke(yVar.f15604b));
        }
        if (!(J2 instanceof am2.e0)) {
            throw new NoWhenBranchMatchedException();
        }
        List<Pair> b13 = J2.b();
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(b13, 10));
        for (Pair pair : b13) {
            arrayList.add(new Pair((ym2.g) pair.f80346a, transform.invoke((sn2.g) pair.f80347b)));
        }
        return new am2.e0(arrayList);
    }

    @Override // am2.g
    public final in2.n L() {
        fn2.d.i(bn2.e.d(this.f55411a));
        return a0(qn2.h.f104498a);
    }

    @Override // am2.a0
    public final boolean M() {
        return this.f55411a.M();
    }

    @Override // am2.g
    public final List N() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        o0(17);
        throw null;
    }

    @Override // am2.g
    public final boolean P() {
        return this.f55411a.P();
    }

    @Override // am2.g
    public final boolean S() {
        return this.f55411a.S();
    }

    @Override // dm2.f0
    public final in2.n X(l1 l1Var, qn2.i iVar) {
        if (l1Var == null) {
            o0(5);
            throw null;
        }
        in2.n X = this.f55411a.X(l1Var, iVar);
        if (!this.f55412b.f100834a.f()) {
            return new in2.s(X, r0());
        }
        if (X != null) {
            return X;
        }
        o0(7);
        throw null;
    }

    @Override // am2.g
    public final boolean Y() {
        return this.f55411a.Y();
    }

    @Override // am2.a0
    public final boolean Z() {
        return this.f55411a.Z();
    }

    @Override // dm2.f0, am2.g, am2.m
    /* renamed from: a */
    public final am2.g o0() {
        am2.g o03 = this.f55411a.o0();
        if (o03 != null) {
            return o03;
        }
        o0(21);
        throw null;
    }

    @Override // dm2.f0
    public final in2.n a0(qn2.i iVar) {
        in2.n a03 = this.f55411a.a0(iVar);
        if (!this.f55412b.f100834a.f()) {
            return new in2.s(a03, r0());
        }
        if (a03 != null) {
            return a03;
        }
        o0(14);
        throw null;
    }

    @Override // am2.n
    public final am2.w0 b() {
        return am2.w0.f15602a;
    }

    @Override // am2.g
    public final in2.n b0() {
        in2.n b03 = this.f55411a.b0();
        if (b03 != null) {
            return b03;
        }
        o0(15);
        throw null;
    }

    @Override // am2.g
    public final am2.h c() {
        am2.h c13 = this.f55411a.c();
        if (c13 != null) {
            return c13;
        }
        o0(25);
        throw null;
    }

    @Override // am2.g
    public final am2.g c0() {
        return this.f55411a.c0();
    }

    @Override // am2.y0
    public final am2.n d(q1 q1Var) {
        if (q1Var != null) {
            return q1Var.f100834a.f() ? this : new e0(this, q1.f(q1Var.h(), r0().h()));
        }
        o0(23);
        throw null;
    }

    @Override // am2.j
    public final pn2.b1 e() {
        pn2.b1 e13 = this.f55411a.e();
        if (this.f55412b.f100834a.f()) {
            if (e13 != null) {
                return e13;
            }
            o0(0);
            throw null;
        }
        if (this.f55416f == null) {
            q1 r03 = r0();
            Collection c13 = e13.c();
            ArrayList arrayList = new ArrayList(c13.size());
            Iterator it = c13.iterator();
            while (it.hasNext()) {
                arrayList.add(r03.l((pn2.b0) it.next(), w1.INVARIANT));
            }
            this.f55416f = new pn2.o(this, this.f55414d, arrayList, on2.q.f96785e);
        }
        pn2.o oVar = this.f55416f;
        if (oVar != null) {
            return oVar;
        }
        o0(1);
        throw null;
    }

    @Override // am2.m
    public final am2.m g() {
        am2.m g13 = this.f55411a.g();
        if (g13 != null) {
            return g13;
        }
        o0(22);
        throw null;
    }

    @Override // bm2.a
    public final bm2.i getAnnotations() {
        bm2.i annotations = this.f55411a.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        o0(19);
        throw null;
    }

    @Override // am2.m
    public final ym2.g getName() {
        ym2.g name = this.f55411a.getName();
        if (name != null) {
            return name;
        }
        o0(20);
        throw null;
    }

    @Override // am2.g, am2.p
    public final am2.q getVisibility() {
        am2.q visibility = this.f55411a.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        o0(27);
        throw null;
    }

    @Override // am2.a0
    public final boolean isExternal() {
        return this.f55411a.isExternal();
    }

    @Override // am2.g
    public final boolean isInline() {
        return this.f55411a.isInline();
    }

    @Override // am2.g, am2.j
    public final pn2.h0 j() {
        pn2.u0 a13;
        List e13 = t1.e(e().getParameters());
        bm2.i annotations = getAnnotations();
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (annotations.isEmpty()) {
            pn2.u0.f100848b.getClass();
            a13 = pn2.u0.f100849c;
        } else {
            pn2.t0 t0Var = pn2.u0.f100848b;
            List b13 = kotlin.collections.e0.b(new pn2.m(annotations));
            t0Var.getClass();
            a13 = pn2.t0.a(b13);
        }
        return pn2.g.r(e13, L(), a13, e(), false);
    }

    @Override // am2.g, am2.k
    public final List k() {
        r0();
        ArrayList arrayList = this.f55415e;
        if (arrayList != null) {
            return arrayList;
        }
        o0(30);
        throw null;
    }

    @Override // am2.g, am2.a0
    public final am2.c0 l() {
        am2.c0 l13 = this.f55411a.l();
        if (l13 != null) {
            return l13;
        }
        o0(26);
        throw null;
    }

    @Override // am2.m
    public final Object l0(ul2.e eVar, Object obj) {
        return eVar.b(this, obj);
    }

    @Override // am2.g
    public final Collection n() {
        Collection<am2.p> n13 = this.f55411a.n();
        ArrayList arrayList = new ArrayList(n13.size());
        for (am2.p pVar : n13) {
            z zVar = (z) pVar;
            zVar.getClass();
            y z03 = zVar.z0(q1.f100833b);
            z03.f55546e = ((k) pVar).o0();
            z03.h(zVar.l());
            z03.i(zVar.getVisibility());
            z03.j(zVar.c());
            z03.f55554m = false;
            arrayList.add(((k) ((am2.f) z03.f55565x.w0(z03))).d(r0()));
        }
        return arrayList;
    }

    @Override // am2.g
    public final Collection p() {
        Collection p13 = this.f55411a.p();
        if (p13 != null) {
            return p13;
        }
        o0(31);
        throw null;
    }

    @Override // am2.k
    public final boolean q() {
        return this.f55411a.q();
    }

    public final q1 r0() {
        if (this.f55413c == null) {
            q1 q1Var = this.f55412b;
            if (q1Var.f100834a.f()) {
                this.f55413c = q1Var;
            } else {
                List parameters = this.f55411a.e().getParameters();
                this.f55414d = new ArrayList(parameters.size());
                this.f55413c = com.bumptech.glide.c.k1(parameters, q1Var.h(), this, this.f55414d);
                this.f55415e = CollectionsKt.P(this.f55414d, new d0(this, 0));
            }
        }
        return this.f55413c;
    }

    @Override // am2.g
    public final boolean s0() {
        return this.f55411a.s0();
    }

    @Override // am2.g
    public final d t0() {
        throw new UnsupportedOperationException();
    }

    @Override // am2.g
    public final am2.f u() {
        return this.f55411a.u();
    }
}
