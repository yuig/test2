package zp;

import android.view.View;
import com.pinterest.api.model.rj0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.pin.PinFeatureModuleLocation;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.f3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f142579b;

    public /* synthetic */ x0(d1 d1Var, int i13) {
        this.f142578a = i13;
        this.f142579b = d1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wy0 e13;
        int i13 = this.f142578a;
        d1 this$0 = this.f142579b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getEventManager().d(new jc0.s(false));
                NavigationImpl w13 = Navigation.w1((ScreenLocation) f3.f50786c.getValue());
                w13.m0("com.pinterest.CLOSEUP_PIN_ID", this$0.K);
                rj0 R = this$0.L.R();
                w13.m0("com.pinterest.EXTRA_USER_ID", (R == null || (e13 = R.e()) == null) ? null : e13.getUid());
                w13.e(this$0);
                this$0.getEventManager().d(w13);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.o0()) {
                    this$0.getEventManager().d(new jc0.s(false));
                    this$0.t0().F(h32.g0.PIN_EDIT_MODAL, h32.u0.BOARD_EDIT_BUTTON);
                    NavigationImpl w14 = Navigation.w1((ScreenLocation) f3.f50784a.getValue());
                    w14.Y1("com.pinterest.IS_EDIT", true);
                    w14.Y1("com.pinterest.EXTRA_IS_EDITABLE_PIN", true);
                    this$0.getEventManager().d(w14);
                    break;
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String str = this$0.Q;
                if (str == null) {
                    str = this$0.M;
                }
                if (this$0.o0() && str != null) {
                    this$0.getEventManager().d(new jc0.s(false));
                    this$0.t0().F(h32.g0.PIN_EDIT_MODAL, h32.u0.BOARD_SECTION_EDIT_BUTTON);
                    this$0.getEventManager().d(Navigation.z0(PinFeatureModuleLocation.PIN_EDIT_BOARD_SECTION_PICKER, str));
                    break;
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                nx.d0 t03 = this$0.t0();
                h32.u0 u0Var = h32.u0.PIN_DELETE_BUTTON;
                h32.g0 g0Var = h32.g0.MODAL_DIALOG;
                aq.j jVar = this$0.L;
                t03.b0(u0Var, g0Var, jVar.B(), false);
                this$0.getEventManager().d(new jc0.s());
                jVar.q(new androidx.appcompat.widget.q(this$0, 0));
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.B0();
                break;
        }
    }
}
