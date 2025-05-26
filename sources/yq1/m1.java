package yq1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o82.b3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyq1/m1;", "Lo82/i3;", "<init>", "()V", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class m1 extends i0 {
    public static final /* synthetic */ int X0 = 0;
    public com.pinterest.identity.authentication.a F0;
    public lb2.d G0;
    public i92.k H0;
    public lu1.b I0;
    public final androidx.lifecycle.m1 J0;
    public GestaltText K0;
    public GestaltText L0;
    public GestaltSearchField M0;
    public GestaltButton N0;
    public LinearLayout O0;
    public GestaltButton P0;
    public GestaltButton Q0;
    public LinearLayout R0;
    public GestaltText S0;
    public GestaltButton T0;
    public GestaltTextField U0;
    public GestaltButton V0;
    public final d4 W0;

    public m1() {
        xk2.k r13 = d7.g.r(26, new ea1.t0(this, 19), xk2.n.NONE);
        int i13 = 17;
        this.J0 = kh2.a1.s(this, kotlin.jvm.internal.k0.f80436a.b(wr1.d1.class), new ea1.u0(r13, 16), new ca1.m(r13, i13), new ca1.n(this, r13, i13));
        this.W0 = d4.ACCOUNT_RECOVERY_RESILIENCE;
        h32.e0 e0Var = h32.g0.Companion;
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Y(vq1.d.recover_account_header);
        gestaltToolbarImpl.m();
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new w41.g0(d9().a(), 12);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new kd1.j(d9().c(), 14);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        wr1.f1 f1Var = new wr1.f1();
        d1 d1Var = new d1(this, 0);
        b3.G(adapter, 1, new yj1.d(this, 18), f1Var, l1.f139902a, d1Var, d9(), 32);
    }

    public final void b9() {
        GestaltButton gestaltButton = this.N0;
        if (gestaltButton == null) {
            Intrinsics.r("searchButton");
            throw null;
        }
        gestaltButton.d(new mm1.i(true, 15));
        boolean z13 = false;
        i9(false);
        LinearLayout linearLayout = this.O0;
        if (linearLayout == null) {
            Intrinsics.r("sendEmailSection");
            throw null;
        }
        bs1.c.R1(linearLayout, false);
        GestaltButton gestaltButton2 = this.Q0;
        if (gestaltButton2 == null) {
            Intrinsics.r("googleLoginButton");
            throw null;
        }
        gestaltButton2.d(new mm1.i(z13, 12));
        LinearLayout linearLayout2 = this.R0;
        if (linearLayout2 == null) {
            Intrinsics.r("passwordLoginSection");
            throw null;
        }
        bs1.c.R1(linearLayout2, false);
        h9(false);
        ((l82.c) d9().c()).a(wr1.r.f130998a);
        j9(vq1.d.recover_account_title, vq1.d.recover_account_description);
    }

    public final i92.k c9() {
        i92.k kVar = this.H0;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("toastUtils");
        throw null;
    }

    public final wr1.d1 d9() {
        return (wr1.d1) this.J0.getValue();
    }

    public final void e9() {
        String str;
        GestaltSearchField gestaltSearchField = this.M0;
        if (gestaltSearchField == null) {
            Intrinsics.r("recoverySearchField");
            throw null;
        }
        String I0 = gestaltSearchField.I0();
        GestaltTextField gestaltTextField = this.U0;
        if (gestaltTextField == null) {
            Intrinsics.r("passwordField");
            throw null;
        }
        String B0 = gestaltTextField.B0();
        GestaltTextField gestaltTextField2 = this.U0;
        if (gestaltTextField2 == null) {
            Intrinsics.r("passwordField");
            throw null;
        }
        hf0.b.k(gestaltTextField2);
        u50.r c13 = d9().c();
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        if (f13 == null || (str = f13.getUid()) == null) {
            str = "";
        }
        ((l82.c) c13).a(new wr1.b0(I0, B0, str));
    }

    public final void f9() {
        GestaltSearchField gestaltSearchField = this.M0;
        if (gestaltSearchField == null) {
            Intrinsics.r("recoverySearchField");
            throw null;
        }
        String I0 = gestaltSearchField.I0();
        GestaltSearchField gestaltSearchField2 = this.M0;
        if (gestaltSearchField2 == null) {
            Intrinsics.r("recoverySearchField");
            throw null;
        }
        gestaltSearchField2.clearFocus();
        GestaltSearchField gestaltSearchField3 = this.M0;
        if (gestaltSearchField3 == null) {
            Intrinsics.r("recoverySearchField");
            throw null;
        }
        hf0.b.k(gestaltSearchField3);
        b9();
        if (tr1.b.c(I0)) {
            ((l82.c) d9().c()).a(new wr1.f0(I0));
        } else {
            ((l82.c) d9().c()).a(new wr1.i0(I0));
        }
    }

    public final void g9() {
        hf0.b.l(requireActivity());
        GestaltSearchField gestaltSearchField = this.M0;
        if (gestaltSearchField == null) {
            Intrinsics.r("recoverySearchField");
            throw null;
        }
        String I0 = gestaltSearchField.I0();
        lb2.d dVar = this.G0;
        if (dVar == null) {
            Intrinsics.r("accountManager");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        lb2.d.b(dVar, requireContext, I0, false, 4);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF115278f0() {
        return this.W0;
    }

    public final void h9(boolean z13) {
        GestaltButton gestaltButton = this.V0;
        if (gestaltButton == null) {
            Intrinsics.r("getHelpButton");
            throw null;
        }
        gestaltButton.d(new mm1.i(z13, 11));
        GestaltButton gestaltButton2 = this.V0;
        if (gestaltButton2 != null) {
            gestaltButton2.e(new e1(this, 6));
        } else {
            Intrinsics.r("getHelpButton");
            throw null;
        }
    }

    public final void i9(boolean z13) {
        GestaltButton gestaltButton = this.N0;
        if (gestaltButton != null) {
            gestaltButton.d(new mm1.i(z13, 14));
        } else {
            Intrinsics.r("searchButton");
            throw null;
        }
    }

    public final void j9(int i13, int i14) {
        GestaltText gestaltText = this.K0;
        if (gestaltText == null) {
            Intrinsics.r("title");
            throw null;
        }
        gestaltText.i(new pn1.g(i13, 4));
        GestaltText gestaltText2 = this.L0;
        if (gestaltText2 != null) {
            gestaltText2.i(new pn1.g(i14, 5));
        } else {
            Intrinsics.r("description");
            throw null;
        }
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(vq1.c.fragment_recover_account, vq1.b.recovery_search_recycler_view);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        wr1.d1 d93 = d9();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        mr1.b m13 = bs1.c.m(requireActivity);
        h32.i0 p13 = s7().p();
        if (p13 == null) {
            p13 = new h32.i0(null, null, null, null, null, null);
        }
        d93.h(m13, p13);
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(vq1.b.recover_account_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.K0 = (GestaltText) findViewById;
        View findViewById2 = v13.findViewById(vq1.b.recover_account_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.L0 = (GestaltText) findViewById2;
        View findViewById3 = v13.findViewById(vq1.b.recovery_search_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.N0 = (GestaltButton) findViewById3;
        View findViewById4 = v13.findViewById(vq1.b.send_email_section);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.O0 = (LinearLayout) findViewById4;
        View findViewById5 = v13.findViewById(vq1.b.send_email_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.P0 = (GestaltButton) findViewById5;
        View findViewById6 = v13.findViewById(vq1.b.recovery_search);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.M0 = (GestaltSearchField) findViewById6;
        View findViewById7 = v13.findViewById(vq1.b.password_login_section);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.R0 = (LinearLayout) findViewById7;
        View findViewById8 = v13.findViewById(vq1.b.google_login_button);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.Q0 = (GestaltButton) findViewById8;
        View findViewById9 = v13.findViewById(vq1.b.forgot_password_link);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.S0 = (GestaltText) findViewById9;
        View findViewById10 = v13.findViewById(vq1.b.password_login_button);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.T0 = (GestaltButton) findViewById10;
        View findViewById11 = v13.findViewById(vq1.b.get_help_button);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.V0 = (GestaltButton) findViewById11;
        View findViewById12 = v13.findViewById(vq1.b.password_field);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.U0 = (GestaltTextField) findViewById12;
        GestaltText gestaltText = (GestaltText) v13.findViewById(vq1.b.help_center_link);
        gestaltText.i(new rq.c2(gestaltText, 25));
        GestaltSearchField gestaltSearchField = this.M0;
        if (gestaltSearchField == null) {
            Intrinsics.r("recoverySearchField");
            throw null;
        }
        gestaltSearchField.g0(new e1(this, 7));
        GestaltButton gestaltButton = this.P0;
        if (gestaltButton == null) {
            Intrinsics.r("sendEmailButton");
            throw null;
        }
        gestaltButton.e(new e1(this, 0));
        GestaltButton gestaltButton2 = this.N0;
        if (gestaltButton2 == null) {
            Intrinsics.r("searchButton");
            throw null;
        }
        gestaltButton2.e(new e1(this, 1));
        GestaltText gestaltText2 = this.S0;
        if (gestaltText2 == null) {
            Intrinsics.r("forgotPasswordLink");
            throw null;
        }
        gestaltText2.j(new e1(this, 2));
        GestaltButton gestaltButton3 = this.Q0;
        if (gestaltButton3 == null) {
            Intrinsics.r("googleLoginButton");
            throw null;
        }
        gestaltButton3.e(new e1(this, 3));
        GestaltButton gestaltButton4 = this.T0;
        if (gestaltButton4 == null) {
            Intrinsics.r("passwordLoginButton");
            throw null;
        }
        gestaltButton4.e(new e1(this, 4));
        GestaltTextField gestaltTextField = this.U0;
        if (gestaltTextField == null) {
            Intrinsics.r("passwordField");
            throw null;
        }
        gestaltTextField.Z(new e1(this, 5));
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new j1(this, null), 3);
    }
}
