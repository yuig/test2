package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25080i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p1.x0 f25081j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kl2.l f25082k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(p1.x0 x0Var, kl2.l lVar, int i13) {
        super(2);
        this.f25080i = i13;
        this.f25081j = x0Var;
        this.f25082k = lVar;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f25080i;
        p1.x0 x0Var = this.f25081j;
        kl2.l lVar = this.f25082k;
        switch (i14) {
            case 0:
                if ((i13 & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return;
                    }
                }
                u2.q m13 = androidx.compose.foundation.layout.b.m(androidx.compose.foundation.layout.e.a(u2.n.f120041b, p0.f25057b, p0.f25058c), x0Var);
                p1.e1 a13 = p1.c1.a(p1.l.f98547e, u2.b.f120023k, oVar, 54);
                i2.s sVar2 = (i2.s) oVar;
                int i15 = sVar2.P;
                i2.z1 o13 = sVar2.o();
                u2.q X = ao2.m0.X(oVar, m13);
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
                tb.f.f0(oVar, a13, s3.j.f110801e);
                tb.f.f0(oVar, o13, s3.j.f110800d);
                s3.h hVar = s3.j.f110802f;
                if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i15))) {
                    ep.b.y(i15, sVar2, i15, hVar);
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
                d6.a(((e6) ((i2.s) oVar).m(f6.f24738b)).f24712k, q2.i.c(-630330208, new q0(x0Var, lVar, 0), oVar), oVar, 48);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f25080i) {
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
