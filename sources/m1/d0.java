package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d0 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85312i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f85313j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i13, Function1 function1) {
        super(3);
        this.f85312i = i13;
        this.f85313j = function1;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        am.d dVar = i2.n.f71185a;
        int i13 = this.f85312i;
        Function1 function1 = this.f85313j;
        switch (i13) {
            case 0:
                long j13 = ((a3.c) obj3).f482a;
                function1.invoke(new a3.c(((n3.q) obj2).f89109c));
                return Unit.f80348a;
            case 1:
                ((Number) obj3).intValue();
                i2.s sVar = (i2.s) ((i2.o) obj2);
                sVar.W(-1608161351);
                boolean h10 = sVar.h(function1);
                Object J2 = sVar.J();
                if (h10 || J2 == dVar) {
                    J2 = new p1.b0(function1);
                    sVar.g0(J2);
                }
                p1.b0 b0Var = (p1.b0) J2;
                sVar.r(false);
                return b0Var;
            default:
                i1.m0 AnimatedVisibility = (i1.m0) obj;
                i2.o oVar = (i2.o) obj2;
                ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                u2.q j14 = androidx.compose.foundation.layout.e.b(u2.n.f120041b, 1.0f).j(kh2.b0.y1(oVar));
                p1.e1 a13 = p1.c1.a(p1.l.f98548f, u2.b.f120023k, oVar, 54);
                i2.s sVar2 = (i2.s) oVar;
                int i14 = sVar2.P;
                i2.z1 o13 = sVar2.o();
                u2.q X = ao2.m0.X(oVar, j14);
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
                if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i14))) {
                    ep.b.y(i14, sVar2, i14, hVar);
                }
                tb.f.f0(oVar, X, s3.j.f110799c);
                om1.c cVar = new om1.c(rm1.q.CANCEL, om1.e.LG, om1.f.WASH_WHITE, null, null, false, 0, 1016);
                sVar2.W(443488167);
                boolean h13 = sVar2.h(function1);
                Object J3 = sVar2.J();
                if (h13 || J3 == dVar) {
                    J3 = new i1.f1(13, function1);
                    sVar2.g0(J3);
                }
                sVar2.r(false);
                ig1.b.b(cVar, null, (Function1) J3, oVar, 8, 2);
                boolean z13 = false;
                fm1.c cVar2 = null;
                u50.i0 i0Var = null;
                rm1.q qVar = null;
                rm1.q qVar2 = null;
                yl1.b bVar = new yl1.b(bs1.c.j2(new String[0], m60.x0.done), z13, cVar2, i0Var, yl1.d.SECONDARY.getColorPalette(), yl1.c.SMALL, qVar, qVar2, 0, null, 974);
                sVar2.W(443499899);
                boolean h14 = sVar2.h(function1);
                Object J4 = sVar2.J();
                if (h14 || J4 == dVar) {
                    J4 = new i1.f1(14, function1);
                    sVar2.g0(J4);
                }
                sVar2.r(false);
                rl2.g0.b(bVar, null, (Function1) J4, oVar, 8, 2);
                sVar2.r(true);
                return Unit.f80348a;
        }
    }
}
