package g90;

import androidx.viewpager.widget.ViewPager;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64531i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f64532j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(n nVar, int i13) {
        super(0);
        this.f64531i = i13;
        this.f64532j = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f64531i;
        n nVar = this.f64532j;
        switch (i13) {
            case 0:
                m143invoke();
                return Unit.f80348a;
            case 1:
                m143invoke();
                return Unit.f80348a;
            case 2:
                Navigation navigation = nVar.I;
                if (navigation != null) {
                    return navigation.getF49939a();
                }
                return null;
            default:
                wk2.a aVar = nVar.f64538g0;
                if (aVar != null) {
                    return (r) aVar.get();
                }
                Intrinsics.r("adapterProvider");
                throw null;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m143invoke() {
        int i13 = this.f64531i;
        Unit unit = null;
        n nVar = this.f64532j;
        switch (i13) {
            case 0:
                ViewPager viewPager = nVar.f64546o0;
                if (viewPager != null) {
                    kg.a.s(viewPager, 0L, null, 6);
                    return;
                } else {
                    Intrinsics.r("viewPager");
                    throw null;
                }
            default:
                int i14 = n.f64537w0;
                ScreenLocation screenLocation = (ScreenLocation) nVar.f64543l0.getValue();
                if (screenLocation != null) {
                    kh2.j.x2((c0) nVar.f64548q0.getValue(), new g(screenLocation));
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    nVar.D5();
                    return;
                }
                return;
        }
    }
}
