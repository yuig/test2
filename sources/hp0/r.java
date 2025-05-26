package hp0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69863i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f69864j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(t tVar, int i13) {
        super(1);
        this.f69863i = i13;
        this.f69864j = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f69863i;
        t tVar = this.f69864j;
        switch (i13) {
            case 0:
                gb2.i iVar = (gb2.i) obj;
                if (q.f69862a[iVar.f64754b.ordinal()] == 1) {
                    int i14 = t.A0;
                    ip0.a aVar = (ip0.a) tVar.f69876r0.getValue();
                    String str = iVar.f64753a;
                    aVar.D3(str);
                    ((lp0.b) tVar.f69875q0.getValue()).C(str);
                }
                break;
            default:
                lp0.c swipeType = (lp0.c) obj;
                Intrinsics.checkNotNullParameter(swipeType, "swipeType");
                c cVar = new c(swipeType);
                int i15 = t.A0;
                kh2.j.x2((f0) tVar.f69870l0.getValue(), cVar);
                break;
        }
        return Unit.f80348a;
    }
}
