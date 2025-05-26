package dy0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56598i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f56599j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i13) {
        super(2);
        this.f56598i = i13;
        this.f56599j = oVar;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = 0;
        int i15 = this.f56598i;
        o oVar2 = this.f56599j;
        switch (i15) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                int i16 = o.f56602h0;
                i0.c((e) bs1.c.y(oVar2.Y7().f56610e.d(), new e(false, 63), null, oVar, 72, 2).getValue(), null, oVar, 8, 2);
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                fc0.n.a(false, null, false, false, q2.i.c(-1348495109, new n(oVar2, i14), oVar), oVar, 24576, 15);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f56598i) {
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
