package d51;

import h32.g0;
import h32.u0;
import j51.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53718i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f53719j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, int i13) {
        super(0);
        this.f53718i = i13;
        this.f53719j = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        s sVar = this.f53719j;
        int i13 = this.f53718i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        g51.n nVar = (g51.n) sVar.f53720h;
                        if (nVar.isBound()) {
                            nVar.getPinalytics().F(g0.WIDGET_ACTION_BAR, u0.NAVIGATION_HOME_BUTTON);
                            ((d0) ((c51.f) nVar.getView())).m();
                            break;
                        }
                        break;
                    default:
                        ((g51.n) sVar.f53720h).K3();
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        g51.n nVar2 = (g51.n) sVar.f53720h;
                        if (nVar2.isBound()) {
                            nVar2.getPinalytics().F(g0.WIDGET_ACTION_BAR, u0.NAVIGATION_HOME_BUTTON);
                            ((d0) ((c51.f) nVar2.getView())).m();
                            break;
                        }
                        break;
                    default:
                        ((g51.n) sVar.f53720h).K3();
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
