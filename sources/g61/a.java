package g61;

import android.view.View;
import cb2.w;
import cb2.x;
import ck2.i;
import com.pinterest.api.model.f30;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.t3;
import ek2.j;
import fe1.k;
import h32.u0;
import kh2.b0;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import nx.d0;
import ua2.v;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f63720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f63721c;

    public /* synthetic */ a(Object obj, boolean z13, int i13) {
        this.f63719a = i13;
        this.f63721c = obj;
        this.f63720b = z13;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f61.a aVar;
        int i13 = this.f63719a;
        boolean z13 = this.f63720b;
        Object obj = this.f63721c;
        switch (i13) {
            case 0:
                e this$0 = (e) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                f30 pin = this$0.f63737g;
                if (pin == null || (aVar = this$0.f63731a) == null) {
                    return;
                }
                Intrinsics.checkNotNullParameter(pin, "pin");
                if (z13) {
                    aVar.p3(pin);
                    return;
                } else {
                    u.f85943a.d(Navigation.z0((ScreenLocation) t3.f51397c.getValue(), pin.getUid()));
                    return;
                }
            case 1:
                k this$02 = (k) obj;
                int i14 = k.f62069h;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (z13) {
                    return;
                }
                this$02.f62074e.performClick();
                return;
            default:
                x this$03 = (x) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                d0 d0Var = this$03.f27377J;
                if (d0Var == null) {
                    Intrinsics.r("fragmentPinalytics");
                    throw null;
                }
                this$03.l(d0Var, u0.PIN_REACTION_BUTTON);
                f30 f30Var = this$03.I;
                if (f30Var == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                String b13 = this$03.f27383f.b(f30Var);
                f30 f30Var2 = this$03.I;
                if (f30Var2 == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                String uid = f30Var2.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                this$03.E = (j) b0.c2(this$03.f27378a, uid, v32.c.LIKE, b13, z13).F(new v(5, new w(this$03, 0)), new v(6, new w(this$03, 1)), i.f27923c, i.f27924d);
                return;
        }
    }

    public /* synthetic */ a(boolean z13, k kVar) {
        this.f63719a = 1;
        this.f63720b = z13;
        this.f63721c = kVar;
    }
}
