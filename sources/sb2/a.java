package sb2;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.g1;
import kh2.n3;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import m60.w;
import rg0.n;
import yk1.b;

/* loaded from: classes4.dex */
public final class a extends b implements rj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final nu1.a f112274a;

    /* renamed from: b, reason: collision with root package name */
    public n f112275b;

    /* renamed from: c, reason: collision with root package name */
    public String f112276c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(nu1.a inAppNavigator) {
        super(0);
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        this.f112274a = inAppNavigator;
    }

    @Override // rj0.b
    public final void b() {
        String str = this.f112276c;
        if (str != null) {
            if (n3.u0(str)) {
                w wVar = u.f85943a;
                NavigationImpl w13 = Navigation.w1((ScreenLocation) g1.f50826p.getValue());
                w13.y0(str, "com.pinterest.EXTRA_GOLD_STANDARD_URL");
                wVar.d(w13);
                return;
            }
            nu1.a.c(this.f112274a, str, null, null, false, 30);
            n nVar = this.f112275b;
            if (nVar != null) {
                nVar.a(null, null);
            }
        }
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        rj0.a view = (rj0.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        view.A(this);
        n nVar2 = this.f112275b;
        if (nVar2 != null) {
            nVar2.g();
        }
    }
}
