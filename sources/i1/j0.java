package i1;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.y3;
import j1.g2;
import k1.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t3.f2;

/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70797i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f70798j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f70799k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(br1.f0 f0Var, Function1 function1) {
        super(3);
        this.f70799k = f0Var;
        this.f70798j = function1;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long d2;
        q3.q0 s03;
        br1.f0 f0Var;
        boolean z13;
        boolean z14;
        int i13;
        n4.e eVar;
        boolean z15;
        Object obj4;
        int i14 = this.f70797i;
        Object obj5 = this.f70799k;
        switch (i14) {
            case 0:
                q3.r0 r0Var = (q3.r0) obj;
                q3.c1 Q = ((q3.o0) obj2).Q(((n4.a) obj3).f89168a);
                if (r0Var.K()) {
                    if (!((Boolean) this.f70798j.invoke(((g2) obj5).f74078d.getValue())).booleanValue()) {
                        d2 = 0;
                        s03 = r0Var.s0((int) (d2 >> 32), (int) (d2 & 4294967295L), kotlin.collections.z0.d(), new i0(Q, 0));
                        return s03;
                    }
                }
                d2 = lb.l0.d(Q.f102178a, Q.f102179b);
                s03 = r0Var.s0((int) (d2 >> 32), (int) (d2 & 4294967295L), kotlin.collections.z0.d(), new i0(Q, 0));
                return s03;
            default:
                androidx.compose.foundation.layout.d BoxWithConstraints = (androidx.compose.foundation.layout.d) obj;
                i2.o oVar = (i2.o) obj2;
                int intValue = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((intValue & 14) == 0) {
                    intValue |= ((i2.s) oVar).h(BoxWithConstraints) ? 4 : 2;
                }
                if ((intValue & 91) == 18) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return Unit.f80348a;
                    }
                }
                boolean z16 = Float.compare(BoxWithConstraints.c(), (float) 400) < 0;
                boolean z17 = Float.compare(BoxWithConstraints.c(), (float) RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY) < 0;
                br1.f0 f0Var2 = (br1.f0) obj5;
                boolean z18 = f0Var2.f23786g;
                u2.g gVar = u2.b.f120025m;
                am.d dVar = i2.n.f71185a;
                u2.n nVar = u2.n.f120041b;
                if (z18) {
                    i2.s sVar2 = (i2.s) oVar;
                    sVar2.W(378812783);
                    n4.b bVar = (n4.b) sVar2.m(f2.f115983f);
                    t2 m03 = bf.b.m0(sVar2);
                    sVar2.W(-126314469);
                    Object J2 = sVar2.J();
                    Object obj6 = J2;
                    if (J2 == dVar) {
                        ParcelableSnapshotMutableState u13 = bs1.c.u1(null, y3.f71400a);
                        sVar2.g0(u13);
                        obj6 = u13;
                    }
                    i2.q1 q1Var = (i2.q1) obj6;
                    sVar2.r(false);
                    Integer valueOf = Integer.valueOf(m03.f78030d.h());
                    Integer valueOf2 = Integer.valueOf(m03.f78027a.h());
                    sVar2.W(-126310977);
                    boolean h10 = sVar2.h(m03);
                    Object J3 = sVar2.J();
                    Object obj7 = J3;
                    if (h10 || J3 == dVar) {
                        br1.z zVar = new br1.z(m03, null);
                        sVar2.g0(zVar);
                        obj7 = zVar;
                    }
                    sVar2.r(false);
                    i2.u.d(valueOf, valueOf2, (Function2) obj7, sVar2);
                    u2.q a13 = androidx.compose.ui.draw.a.a(bf.b.t0(androidx.compose.foundation.layout.e.f17184c, m03, 12), (z17 && f0Var2.f23785f) ? 0.0f : 1.0f);
                    p1.y a14 = p1.x.a(p1.l.f98545c, gVar, sVar2, 0);
                    int i15 = sVar2.P;
                    i2.z1 o13 = sVar2.o();
                    u2.q X = ao2.m0.X(sVar2, a13);
                    s3.k.Qo.getClass();
                    s3.i iVar = s3.j.f110798b;
                    if (!(sVar2.f71265a instanceof i2.f)) {
                        com.bumptech.glide.c.j0();
                        throw null;
                    }
                    sVar2.a0();
                    if (sVar2.O) {
                        sVar2.n(iVar);
                    } else {
                        sVar2.j0();
                    }
                    tb.f.f0(sVar2, a14, s3.j.f110801e);
                    tb.f.f0(sVar2, o13, s3.j.f110800d);
                    s3.h hVar = s3.j.f110802f;
                    if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i15))) {
                        ep.b.y(i15, sVar2, i15, hVar);
                    }
                    tb.f.f0(sVar2, X, s3.j.f110799c);
                    n4.e eVar2 = (n4.e) q1Var.getValue();
                    if (eVar2 != null) {
                        eVar = new n4.e(BoxWithConstraints.c() - eVar2.f89175a);
                        i13 = 8;
                    } else {
                        i13 = 8;
                        eVar = null;
                    }
                    br1.e0.n(f0Var2, z16, eVar, sVar2, i13);
                    sVar2.W(1395900273);
                    boolean h13 = sVar2.h(bVar);
                    Object J4 = sVar2.J();
                    if (h13 || J4 == dVar) {
                        z15 = false;
                        br1.a0 a0Var = new br1.a0(false ? 1 : 0, bVar, q1Var);
                        sVar2.g0(a0Var);
                        obj4 = a0Var;
                    } else {
                        z15 = false;
                        obj4 = J4;
                    }
                    sVar2.r(z15);
                    br1.e0.o(8, 0, sVar2, androidx.compose.ui.layout.b.h(nVar, (Function1) obj4), f0Var2, this.f70798j, z16);
                    sVar2.r(true);
                    sVar2.r(false);
                } else {
                    i2.s sVar3 = (i2.s) oVar;
                    sVar3.W(380384855);
                    if (z17) {
                        sVar3.W(380391396);
                        androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.f17184c, sVar3);
                        z14 = false;
                        sVar3.r(false);
                    } else {
                        sVar3.W(380494099);
                        FillElement fillElement = androidx.compose.foundation.layout.e.f17184c;
                        p1.e eVar3 = p1.l.f98545c;
                        p1.y a15 = p1.x.a(eVar3, gVar, sVar3, 0);
                        int i16 = sVar3.P;
                        i2.z1 o14 = sVar3.o();
                        u2.q X2 = ao2.m0.X(sVar3, fillElement);
                        s3.k.Qo.getClass();
                        s3.i iVar2 = s3.j.f110798b;
                        boolean z19 = sVar3.f71265a instanceof i2.f;
                        if (!z19) {
                            com.bumptech.glide.c.j0();
                            throw null;
                        }
                        sVar3.a0();
                        if (sVar3.O) {
                            sVar3.n(iVar2);
                        } else {
                            sVar3.j0();
                        }
                        s3.h hVar2 = s3.j.f110801e;
                        tb.f.f0(sVar3, a15, hVar2);
                        s3.h hVar3 = s3.j.f110800d;
                        tb.f.f0(sVar3, o14, hVar3);
                        s3.h hVar4 = s3.j.f110802f;
                        if (sVar3.O || !Intrinsics.d(sVar3.J(), Integer.valueOf(i16))) {
                            ep.b.y(i16, sVar3, i16, hVar4);
                        }
                        s3.h hVar5 = s3.j.f110799c;
                        tb.f.f0(sVar3, X2, hVar5);
                        p1.a0 a0Var2 = p1.a0.f98480a;
                        if (z16) {
                            sVar3.W(323598670);
                            t2 m04 = bf.b.m0(sVar3);
                            Integer valueOf3 = Integer.valueOf(m04.f78030d.h());
                            z13 = z16;
                            sVar3.W(1395915574);
                            boolean h14 = sVar3.h(m04);
                            Object J5 = sVar3.J();
                            Object obj8 = J5;
                            if (h14 || J5 == dVar) {
                                br1.b0 b0Var = new br1.b0(m04, null);
                                sVar3.g0(b0Var);
                                obj8 = b0Var;
                            }
                            sVar3.r(false);
                            i2.u.e(valueOf3, (Function2) obj8, sVar3);
                            u2.q t03 = bf.b.t0(p1.z.a(a0Var2, nVar, 1.0f), m04, 12);
                            p1.y a16 = p1.x.a(eVar3, gVar, sVar3, 0);
                            int i17 = sVar3.P;
                            i2.z1 o15 = sVar3.o();
                            u2.q X3 = ao2.m0.X(sVar3, t03);
                            if (!z19) {
                                com.bumptech.glide.c.j0();
                                throw null;
                            }
                            sVar3.a0();
                            if (sVar3.O) {
                                sVar3.n(iVar2);
                            } else {
                                sVar3.j0();
                            }
                            tb.f.f0(sVar3, a16, hVar2);
                            tb.f.f0(sVar3, o15, hVar3);
                            if (sVar3.O || !Intrinsics.d(sVar3.J(), Integer.valueOf(i17))) {
                                ep.b.y(i17, sVar3, i17, hVar4);
                            }
                            tb.f.f0(sVar3, X3, hVar5);
                            f0Var = f0Var2;
                            br1.e0.m(f0Var, br1.e0.f23779a, sVar3, 56, 0);
                            sVar3.r(true);
                            sVar3.r(false);
                        } else {
                            f0Var = f0Var2;
                            z13 = z16;
                            sVar3.W(324160824);
                            br1.e0.m(f0Var, p1.z.a(a0Var2, nVar, 1.0f), sVar3, 8, 0);
                            sVar3.r(false);
                        }
                        br1.e0.o(392, 0, sVar3, nVar, f0Var, this.f70798j, z13);
                        sVar3.r(true);
                        z14 = false;
                        sVar3.r(false);
                    }
                    sVar3.r(z14);
                }
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Function1 function1, g2 g2Var) {
        super(3);
        this.f70798j = function1;
        this.f70799k = g2Var;
    }
}
