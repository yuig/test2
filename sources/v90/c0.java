package v90;

import kh2.n3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f124872i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0 f124873j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(i0 i0Var, int i13) {
        super(2);
        this.f124872i = i13;
        this.f124873j = i0Var;
    }

    public final void b(i2.o oVar, int i13) {
        u2.n nVar = u2.n.f120041b;
        int i14 = this.f124872i;
        int i15 = 0;
        i0 i0Var = this.f124873j;
        int i16 = 2;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                t90.f.a((t90.o) i0Var.f124906d0.getValue(), androidx.compose.foundation.layout.b.p(androidx.compose.foundation.layout.e.b(nVar, 1.0f), com.bumptech.glide.d.A(eo1.c.space_300, oVar), 0.0f, 2), new b0(i0Var, i15), new b0(i0Var, 1), new b0(i0Var, i16), oVar, 8, 0);
                break;
            case 1:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                n3.e((s90.r0) i0Var.f124908f0.getValue(), null, oVar, 8, 2);
                break;
            case 2:
                if ((i13 & 11) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        break;
                    }
                }
                kg.t.c((s90.t0) i0Var.f124907e0.getValue(), androidx.compose.foundation.layout.b.n(nVar, com.bumptech.glide.d.A(eo1.c.space_200, oVar)), new b0(i0Var, 3), new b0(i0Var, 4), new b0(i0Var, 5), new b0(i0Var, 6), yl1.d.SECONDARY, 0, oVar, 14155776, 0);
                break;
            case 3:
                if ((i13 & 11) == 2) {
                    i2.s sVar4 = (i2.s) oVar;
                    if (sVar4.z()) {
                        sVar4.Q();
                        break;
                    }
                }
                i0.Y7(i0Var, oVar, 8);
                break;
            case 4:
                if ((i13 & 11) == 2) {
                    i2.s sVar5 = (i2.s) oVar;
                    if (sVar5.z()) {
                        sVar5.Q();
                        break;
                    }
                }
                i0.a8(i0Var, oVar, 8);
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar6 = (i2.s) oVar;
                    if (sVar6.z()) {
                        sVar6.Q();
                        break;
                    }
                }
                i0.Z7(i0Var, oVar, 8);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f124872i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 2:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 3:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 4:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
