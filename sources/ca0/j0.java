package ca0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ni1.x1;

/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27132i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u50.r f27133j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(u50.r rVar, int i13) {
        super(0);
        this.f27132i = i13;
        this.f27133j = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f27132i) {
            case 0:
                m83invoke();
                break;
            case 1:
                m83invoke();
                break;
            case 2:
                m83invoke();
                break;
            case 3:
                m83invoke();
                break;
            default:
                m83invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m83invoke() {
        int i13 = this.f27132i;
        u50.r rVar = this.f27133j;
        switch (i13) {
            case 0:
                rVar.a(h.f27118a);
                break;
            case 1:
                rVar.a(fa0.u0.f61538a);
                break;
            case 2:
                rVar.a(ea0.o0.f57985a);
                break;
            case 3:
                if (rVar != null) {
                    rVar.a(new ni1.e1(true, true));
                    break;
                }
                break;
            default:
                rVar.a(new x1(new gk1.r(true)));
                break;
        }
    }
}
