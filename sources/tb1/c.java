package tb1;

import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import dv0.q;
import h32.g0;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f117130b;

    public /* synthetic */ c(h hVar, int i13) {
        this.f117129a = i13;
        this.f117130b = hVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f117129a;
        h this$0 = this.f117130b;
        switch (i13) {
            case 0:
                int i14 = h.f117139z0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.s7().F(g0.PARENTAL_PASSCODE_SETTINGS_VIEW, u0.EXTERNAL_LINK);
                return;
            case 1:
                int i15 = h.f117139z0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof xn1.i) {
                    q qVar = this$0.f117142l0;
                    if (qVar == null) {
                        Intrinsics.r("passcodeDelegate");
                        throw null;
                    }
                    xn1.i iVar = (xn1.i) it;
                    qVar.q(iVar.f135454c);
                    boolean z13 = iVar.f135454c.length() == 4;
                    GestaltButton gestaltButton = this$0.f117145o0;
                    if (gestaltButton == null) {
                        Intrinsics.r("setPasscodeButton");
                        throw null;
                    }
                    gestaltButton.d(new u81.h(z13, 23));
                    GestaltTextField gestaltTextField = this$0.f117146p0;
                    if (gestaltTextField != null) {
                        gestaltTextField.X(new u81.h(z13, 24));
                        return;
                    } else {
                        Intrinsics.r("passcodeEditTextInput");
                        throw null;
                    }
                }
                return;
            default:
                int i16 = h.f117139z0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                GestaltButton gestaltButton2 = this$0.f117145o0;
                if (gestaltButton2 != null) {
                    this$0.onClick(gestaltButton2);
                    return;
                } else {
                    Intrinsics.r("setPasscodeButton");
                    throw null;
                }
        }
    }
}
