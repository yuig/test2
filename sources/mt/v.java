package mt;

import kotlin.jvm.functions.Function0;
import nt.b2;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88135i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f88136j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(y yVar, int i13) {
        super(0);
        this.f88135i = i13;
        this.f88136j = yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f88135i;
        y yVar = this.f88136j;
        switch (i13) {
            case 0:
                int i14 = y.B0;
                b2 b2Var = new b2(yVar.c8(), yVar.f8(), new mq.z(yVar.j8().f88129g.e(), 6));
                b2Var.setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
                return b2Var;
            default:
                int i15 = y.B0;
                return new ws.s(yVar.c8(), yVar.f8(), yVar.j8().f88129g.e(), 1);
        }
    }
}
