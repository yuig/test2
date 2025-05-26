package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class r1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77994i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t1 f77995j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(t1 t1Var, int i13) {
        super(0);
        this.f77994i = i13;
        this.f77995j = t1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j13 = y2.h.f136670b;
        t1 t1Var = this.f77995j;
        int i13 = this.f77994i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        q3.x xVar = (q3.x) t1Var.A.getValue();
                        if (xVar != null) {
                            j13 = xVar.c0(0L);
                            break;
                        }
                        break;
                    default:
                        j13 = t1Var.C;
                        break;
                }
                return new a3.c(j13);
            case 1:
                switch (i13) {
                    case 0:
                        q3.x xVar2 = (q3.x) t1Var.A.getValue();
                        if (xVar2 != null) {
                            j13 = xVar2.c0(0L);
                            break;
                        }
                        break;
                    default:
                        j13 = t1Var.C;
                        break;
                }
                return new a3.c(j13);
            default:
                t1Var.O0();
                return Unit.f80348a;
        }
    }
}
