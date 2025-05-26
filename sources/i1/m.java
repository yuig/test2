package i1;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import j1.g2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70825i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f70826j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f70827k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f70828l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f70829m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f70830n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ xk2.g f70831o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, xk2.g gVar, int i13) {
        super(2);
        this.f70825i = i13;
        this.f70826j = obj;
        this.f70827k = obj2;
        this.f70828l = obj3;
        this.f70829m = obj4;
        this.f70830n = obj5;
        this.f70831o = gVar;
    }

    public final void b(i2.o oVar, int i13) {
        Integer num;
        int i14 = this.f70825i;
        xk2.g gVar = this.f70831o;
        Object obj = this.f70830n;
        Object obj2 = this.f70829m;
        Object obj3 = this.f70828l;
        Object obj4 = this.f70827k;
        Object obj5 = this.f70826j;
        switch (i14) {
            case 0:
                if ((i13 & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                Function1 function1 = (Function1) obj3;
                x xVar = (x) obj2;
                i2.s sVar2 = (i2.s) oVar;
                Object J2 = sVar2.J();
                Object obj6 = i2.n.f71185a;
                if (J2 == obj6) {
                    J2 = (r0) function1.invoke(xVar);
                    sVar2.g0(J2);
                }
                r0 r0Var = (r0) J2;
                g2 g2Var = (g2) obj5;
                boolean i15 = sVar2.i(Intrinsics.d(g2Var.f().a(), obj4));
                Object J3 = sVar2.J();
                if (i15 || J3 == obj6) {
                    J3 = Intrinsics.d(g2Var.f().a(), obj4) ? o1.f70858b : ((r0) function1.invoke(xVar)).f70885b;
                    sVar2.g0(J3);
                }
                o1 o1Var = (o1) J3;
                Object J4 = sVar2.J();
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = g2Var.f74078d;
                if (J4 == obj6) {
                    J4 = new t(Intrinsics.d(obj4, parcelableSnapshotMutableState.getValue()));
                    sVar2.g0(J4);
                }
                t tVar = (t) J4;
                n1 n1Var = r0Var.f70884a;
                u2.n nVar = u2.n.f120041b;
                boolean j13 = sVar2.j(r0Var);
                Object J5 = sVar2.J();
                if (j13 || J5 == obj6) {
                    J5 = new h(r0Var, 0);
                    sVar2.g0(J5);
                }
                u2.q f13 = androidx.compose.ui.layout.b.f(nVar, (kl2.l) J5);
                tVar.f70899b.setValue(Boolean.valueOf(Intrinsics.d(obj4, parcelableSnapshotMutableState.getValue())));
                u2.q j14 = f13.j(tVar);
                boolean j15 = sVar2.j(obj4);
                Object J6 = sVar2.J();
                if (j15 || J6 == obj6) {
                    J6 = new i(obj4, 0);
                    sVar2.g0(J6);
                }
                Function1 function12 = (Function1) J6;
                boolean h10 = sVar2.h(o1Var);
                Object J7 = sVar2.J();
                if (h10 || J7 == obj6) {
                    J7 = new j(o1Var, 0);
                    sVar2.g0(J7);
                }
                b7.c.a(g2Var, function12, j14, n1Var, o1Var, (Function2) J7, q2.i.c(-616195562, new l((s2.t) obj, this.f70827k, xVar, (kl2.m) gVar, 0), sVar2), sVar2, 12582912, 64);
                break;
            default:
                if ((i13 & 3) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        break;
                    }
                }
                q3.o1 o1Var2 = (q3.o1) obj4;
                p1.l0 l0Var = new p1.l0((p1.m1) obj5, o1Var2);
                ((kl2.l) gVar).invoke(new p1.y0(androidx.compose.foundation.layout.b.f(l0Var, o1Var2.getLayoutDirection()), ((List) obj3).isEmpty() ? l0Var.d() : 0, androidx.compose.foundation.layout.b.e(l0Var, o1Var2.getLayoutDirection()), (((List) obj2).isEmpty() || (num = (Integer) obj) == null) ? l0Var.a() : o1Var2.f0(num.intValue())), oVar, 0);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f70825i) {
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
