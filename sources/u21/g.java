package u21;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120088i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f120089j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i13) {
        super(2);
        this.f120088i = i13;
        this.f120089j = hVar;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f120088i;
        h hVar = this.f120089j;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                int i15 = h.f120090g0;
                oe.f.b((d0) hVar.f120091c0.getValue(), null, oVar, 8, 2);
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                fc0.n.a(false, null, false, false, q2.i.c(-2005552108, new g(hVar, 0), oVar), oVar, 24576, 15);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f120088i) {
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
