package yq1;

import android.content.Context;
import android.net.Uri;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f139838b;

    public /* synthetic */ e1(m1 m1Var, int i13) {
        this.f139837a = i13;
        this.f139838b = m1Var;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f139837a;
        m1 this$0 = this.f139838b;
        switch (i13) {
            case 0:
                int i14 = m1.X0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.d9().f130960h.e().a(wr1.j0.f130975a);
                this$0.g9();
                return;
            case 1:
                int i15 = m1.X0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.f9();
                return;
            case 2:
                int i16 = m1.X0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.d9().f130960h.e().a(wr1.u.f131020a);
                this$0.g9();
                return;
            case 3:
                int i17 = m1.X0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.d9().f130960h.e().a(wr1.x.f131026a);
                return;
            case 4:
                int i18 = m1.X0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.e9();
                return;
            case 5:
                int i19 = m1.X0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xn1.i) {
                    GestaltTextField gestaltTextField = this$0.U0;
                    if (gestaltTextField == null) {
                        Intrinsics.r("passwordField");
                        throw null;
                    }
                    if (gestaltTextField.k0().f20035f == yn1.f.ERROR) {
                        GestaltTextField gestaltTextField2 = this$0.U0;
                        if (gestaltTextField2 == null) {
                            Intrinsics.r("passwordField");
                            throw null;
                        }
                        gestaltTextField2.X(c.A);
                    }
                }
                if (it instanceof xn1.a) {
                    GestaltTextField gestaltTextField3 = this$0.U0;
                    if (gestaltTextField3 == null) {
                        Intrinsics.r("passwordField");
                        throw null;
                    }
                    boolean z13 = !kotlin.text.z.j(gestaltTextField3.B0());
                    GestaltButton gestaltButton = this$0.T0;
                    if (gestaltButton == null) {
                        Intrinsics.r("passwordLoginButton");
                        throw null;
                    }
                    gestaltButton.d(new mm1.i(z13, 13));
                }
                if ((it instanceof xn1.d) && ve.h.X((xn1.d) it, 2)) {
                    this$0.e9();
                    return;
                }
                return;
            case 6:
                int i23 = m1.X0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.d9().f130960h.e().a(wr1.v.f131022a);
                lu1.b bVar = this$0.I0;
                if (bVar == null) {
                    Intrinsics.r("activityHelper");
                    throw null;
                }
                Context requireContext = this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                Uri parse = Uri.parse(this$0.getString(yr1.c.url_account_recovery_contact));
                Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                ((lu1.c) bVar).s(requireContext, parse, null);
                return;
            default:
                int i24 = m1.X0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof cn1.q) {
                    GestaltSearchField gestaltSearchField = this$0.M0;
                    if (gestaltSearchField == null) {
                        Intrinsics.r("recoverySearchField");
                        throw null;
                    }
                    if (gestaltSearchField.I0().length() == 0) {
                        this$0.i9(false);
                        this$0.b9();
                        return;
                    }
                }
                if (it instanceof cn1.r) {
                    this$0.f9();
                    return;
                }
                GestaltSearchField gestaltSearchField2 = this$0.M0;
                if (gestaltSearchField2 == null) {
                    Intrinsics.r("recoverySearchField");
                    throw null;
                }
                if (gestaltSearchField2.I0().length() > 0) {
                    this$0.i9(true);
                    return;
                }
                return;
        }
    }
}
