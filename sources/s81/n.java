package s81;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.e5;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import m60.u;
import m60.w;

/* loaded from: classes5.dex */
public final class n extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111915i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f111916j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(p pVar, int i13) {
        super(0);
        this.f111915i = i13;
        this.f111916j = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f111915i) {
            case 0:
                m258invoke();
                break;
            default:
                m258invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m258invoke() {
        int i13 = this.f111915i;
        p pVar = this.f111916j;
        switch (i13) {
            case 0:
                pVar.getPinalytics().X(u0.VIRTUAL_TRY_ON_ICON);
                w wVar = u.f85943a;
                NavigationImpl w13 = Navigation.w1((ScreenLocation) e5.f50738c.getValue());
                w13.z(f42.i.LENS.getValue(), "com.pinterest.EXTRA_VIRTUAL_TRY_ON_SOURCE_TYPE");
                wVar.d(w13);
                break;
            default:
                pVar.g4(pVar.f111924b ? h.ACTIVE_CAMERA : h.CAMERA_DENIED);
                break;
        }
    }
}
