package q4;

import c2.d6;
import i2.u0;
import i2.v3;
import kh2.a1;
import kh2.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import uc0.l0;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102317i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v3 f102318j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(v3 v3Var, int i13) {
        super(2);
        this.f102317i = i13;
        this.f102318j = v3Var;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = 0;
        int i15 = this.f102317i;
        v3 v3Var = this.f102318j;
        switch (i15) {
            case 0:
                if ((i13 & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                ((Function2) v3Var.getValue()).invoke(oVar, 0);
                break;
            case 1:
                if ((i13 & 3) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                m0.e(z3.l.a(u2.n.f120041b, false, c.f102310j), q2.i.c(-533674951, new d(v3Var, i14), oVar), oVar, 48, 0);
                break;
            case 2:
                if ((i13 & 3) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        break;
                    }
                }
                u0 u0Var = l.f102344a;
                ((Function2) v3Var.getValue()).invoke(oVar, 0);
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar4 = (i2.s) oVar;
                    if (sVar4.z()) {
                        sVar4.Q();
                        break;
                    }
                }
                d6.b(a1.D0(((l0) v3Var.getValue()).f121817d.f121802a, oVar), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oVar, 0, 0, 131070);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f102317i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 2:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
