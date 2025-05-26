package w21;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127759i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y1 f127760j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(y1 y1Var, int i13) {
        super(1);
        this.f127759i = i13;
        this.f127760j = y1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f127759i;
        y1 y1Var = this.f127760j;
        switch (i13) {
            case 0:
                om1.p event = (om1.p) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof om1.l) {
                    y1Var.f127879g.e().a(p.f127763a);
                }
                break;
            default:
                l82.n start = (l82.n) obj;
                Intrinsics.checkNotNullParameter(start, "$this$start");
                zy.d0 d0Var = y1Var.f127878f;
                start.a(d0Var, new y01.o1(9), d0Var.a());
                l82.n.b(start, y1Var.f127875c);
                l82.n.b(start, y1Var.f127876d);
                z zVar = y1Var.f127877e;
                start.a(zVar, new y01.o1(8), zVar.a());
                break;
        }
        return Unit.f80348a;
    }
}
