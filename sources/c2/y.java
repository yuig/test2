package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25385i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p1.m1 f25386j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p1.x0 f25387k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kl2.l f25388l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(p1.m1 m1Var, p1.x0 x0Var, kl2.l lVar, int i13) {
        super(2);
        this.f25385i = i13;
        this.f25386j = m1Var;
        this.f25387k = x0Var;
        this.f25388l = lVar;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f25385i;
        p1.x0 x0Var = this.f25387k;
        p1.m1 m1Var = this.f25386j;
        kl2.l lVar = this.f25388l;
        int i15 = 3;
        switch (i14) {
            case 0:
                if ((i13 & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return;
                    }
                }
                u2.q b13 = androidx.compose.foundation.layout.e.b(u2.n.f120041b, 1.0f);
                r3.i iVar = p1.o1.f98564a;
                u2.q c13 = androidx.compose.foundation.layout.e.c(androidx.compose.foundation.layout.b.m(ao2.m0.p(b13, t3.p.f116119m, new i1.h(m1Var, i15)), x0Var), e0.f24655a);
                p1.e1 a13 = p1.c1.a(p1.l.f98543a, u2.b.f120023k, oVar, 54);
                i2.s sVar2 = (i2.s) oVar;
                int i16 = sVar2.P;
                i2.z1 o13 = sVar2.o();
                u2.q X = ao2.m0.X(oVar, c13);
                s3.k.Qo.getClass();
                s3.i iVar2 = s3.j.f110798b;
                if (!(sVar2.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar2.a0();
                if (sVar2.O) {
                    sVar2.n(iVar2);
                } else {
                    sVar2.j0();
                }
                tb.f.f0(oVar, a13, s3.j.f110801e);
                tb.f.f0(oVar, o13, s3.j.f110800d);
                s3.h hVar = s3.j.f110802f;
                if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i16))) {
                    ep.b.y(i16, sVar2, i16, hVar);
                }
                tb.f.f0(oVar, X, s3.j.f110799c);
                lVar.invoke(p1.g1.f98514a, oVar, 6);
                sVar2.r(true);
                return;
            default:
                if ((i13 & 3) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        return;
                    }
                }
                i2.u0 u0Var = b1.f24558a;
                i2.s sVar4 = (i2.s) oVar;
                long j13 = ((b3.w) sVar4.m(c1.f24577a)).f21392a;
                com.bumptech.glide.d.a(u0Var.c(Float.valueOf((!((s0) sVar4.m(u0.f25271a)).f() ? ((double) androidx.compose.ui.graphics.a.q(j13)) < 0.5d : ((double) androidx.compose.ui.graphics.a.q(j13)) > 0.5d) ? 0.6f : 0.74f)), q2.i.c(600325466, new y(m1Var, x0Var, lVar, 0), oVar), oVar, 56);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f25385i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
