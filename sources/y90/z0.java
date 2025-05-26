package y90;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class z0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138280i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d1 f138281j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(d1 d1Var, int i13) {
        super(0);
        this.f138280i = i13;
        this.f138281j = d1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f138280i) {
            case 0:
                m291invoke();
                break;
            default:
                m291invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m291invoke() {
        int i13 = this.f138280i;
        d1 d1Var = this.f138281j;
        switch (i13) {
            case 0:
                x xVar = d1Var.f138167e;
                if (xVar != null) {
                    p pVar = new p(m62.i0.f86014a);
                    int i14 = d0.f138146w0;
                    xVar.f138265a.a8(pVar);
                    break;
                }
                break;
            default:
                x xVar2 = d1Var.f138167e;
                if (xVar2 != null) {
                    p pVar2 = new p(m62.r0.f86044a);
                    int i15 = d0.f138146w0;
                    xVar2.f138265a.a8(pVar2);
                    break;
                }
                break;
        }
    }
}
