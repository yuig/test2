package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class l0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85434i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t0 f85435j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(t0 t0Var, int i13) {
        super(0);
        this.f85434i = i13;
        this.f85435j = t0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f85434i;
        t0 t0Var = this.f85435j;
        switch (i13) {
            case 0:
                co2.q qVar = t0Var.f85582t;
                if (qVar != null) {
                    qVar.g(v.f85605a);
                }
                return Unit.f80348a;
            default:
                return Boolean.valueOf(!t0Var.W0());
        }
    }
}
