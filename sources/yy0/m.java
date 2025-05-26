package yy0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140462i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f140463j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i13) {
        super(2);
        this.f140462i = i13;
        this.f140463j = nVar;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f140462i;
        n nVar = this.f140463j;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                int i15 = n.f140464g0;
                dn.c.c((d) bs1.c.y(nVar.Y7().f140448f.d(), new d(), null, oVar, 72, 2).getValue(), null, new dx0.d(nVar, 13), oVar, 8, 2);
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                fc0.n.a(false, null, false, false, q2.i.c(-1869012419, new m(nVar, 0), oVar), oVar, 24576, 15);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f140462i) {
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
