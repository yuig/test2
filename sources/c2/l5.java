package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l5 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f24927i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m1 f24928j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f24929k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function2 f24930l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(float f13, m1 m1Var, boolean z13, Function2 function2) {
        super(3);
        this.f24927i = f13;
        this.f24928j = m1Var;
        this.f24929k = z13;
        this.f24930l = function2;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        u2.q qVar = (u2.q) obj;
        i2.o oVar = (i2.o) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((i2.s) oVar).h(qVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        u2.q a13 = androidx.compose.ui.draw.a.a(qVar, this.f24927i);
        q3.p0 e13 = p1.q.e(u2.b.f120013a, false);
        i2.s sVar2 = (i2.s) oVar;
        int i13 = sVar2.P;
        i2.z1 o13 = sVar2.o();
        u2.q X = ao2.m0.X(oVar, a13);
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
        tb.f.f0(oVar, e13, s3.j.f110801e);
        tb.f.f0(oVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i13))) {
            ep.b.y(i13, sVar2, i13, hVar);
        }
        tb.f.f0(oVar, X, s3.j.f110799c);
        m1 m1Var = this.f24928j;
        m1Var.getClass();
        sVar2.W(264799724);
        i2.q1 K1 = bs1.c.K1(new b3.w(this.f24929k ? m1Var.f24956t : m1Var.f24957u), sVar2);
        sVar2.r(false);
        q5.b(((b3.w) K1.getValue()).f21392a, ((e6) ((i2.s) oVar).m(f6.f24738b)).f24708g, null, this.f24930l, oVar, 0, 4);
        sVar2.r(true);
        return Unit.f80348a;
    }
}
