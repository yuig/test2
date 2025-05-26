package tc0;

import c2.d6;
import c2.u2;
import kh2.a1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import uc0.k1;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117223i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k1 f117224j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(k1 k1Var, int i13) {
        super(2);
        this.f117223i = i13;
        this.f117224j = k1Var;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f117223i;
        k1 k1Var = this.f117224j;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                d6.b(a1.D0(k1Var.f121806b, oVar), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oVar, 0, 0, 131070);
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                u2.b(k1Var.f121808d, a1.D0(k1Var.f121807c, oVar), oVar);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f117223i) {
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
