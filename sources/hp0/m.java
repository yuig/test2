package hp0;

import android.view.ViewConfiguration;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.o1;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69854i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f69855j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(t tVar, int i13) {
        super(0);
        this.f69854i = i13;
        this.f69855j = tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f69854i;
        Unit unit = null;
        t tVar = this.f69855j;
        switch (i13) {
            case 0:
                int i14 = t.A0;
                ScreenLocation screenLocation = (ScreenLocation) tVar.f69878t0.getValue();
                if (screenLocation != null) {
                    kh2.j.x2((f0) tVar.f69870l0.getValue(), new g(screenLocation));
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    tVar.D5();
                }
                return Unit.f80348a;
            case 1:
                uj2.q p73 = tVar.p7();
                uk1.e eVar = tVar.f69865g0;
                if (eVar != null) {
                    return new ip0.a(((uk1.a) eVar).f(tVar.s7(), ""), p73);
                }
                Intrinsics.r("presenterPinAnalyticsFactory");
                throw null;
            case 2:
                Navigation navigation = tVar.I;
                if (navigation != null) {
                    return navigation.getF49939a();
                }
                return null;
            case 3:
                return Integer.valueOf(ViewConfiguration.get(tVar.requireContext()).getScaledTouchSlop());
            default:
                o1 o1Var = tVar.f69866h0;
                if (o1Var != null) {
                    return new lp0.b(tVar.s7(), new s(0, this.f69855j, t.class, "logCarouselItemImpressions", "logCarouselItemImpressions()V", 0), (mp0.e) o1Var.f113575a.f114091b.f114330i0.get());
                }
                Intrinsics.r("qcmDrawerPagerAdapterFactory");
                throw null;
        }
    }
}
