package ma1;

import h32.f1;
import h32.i0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f86788i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f86789j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0 f86790k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, i0 i0Var, int i13) {
        super(0);
        this.f86788i = i13;
        this.f86789j = nVar;
        this.f86790k = i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f86788i) {
            case 0:
                m186invoke();
                break;
            default:
                m186invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m186invoke() {
        int i13 = this.f86788i;
        n nVar = this.f86789j;
        switch (i13) {
            case 0:
                i0 a13 = i0.a(this.f86790k, null, null, null, u0.CANCEL_BUTTON, 95);
                f1 f1Var = f1.TAP;
                int i14 = n.K0;
                nVar.s7().t(a13, null, null, f1Var, null, null, false);
                break;
            default:
                f1 f1Var2 = f1.VIEW;
                int i15 = n.K0;
                nVar.s7().t(this.f86790k, null, null, f1Var2, null, null, false);
                break;
        }
    }
}
