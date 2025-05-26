package yq1;

import android.os.Bundle;
import android.view.View;
import com.pinterest.identity.password.StrongPasswordTextField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyq1/h2;", "Lyq1/l2;", "<init>", "()V", "org/chromium/net/y", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class h2 extends o0 {
    public static final /* synthetic */ int E0 = 0;
    public rr1.g C0;
    public cr1.a D0;

    @Override // zq1.h0
    public final void N2() {
        ar1.a aVar = this.f139907m0;
        if (aVar != null) {
            aVar.I0(e8().B0(), ar1.d.PASSWORD_STEP);
        }
    }

    @Override // yq1.l2
    public final String f8() {
        String string = getString(m60.x0.password);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // yq1.l2
    public final String h8() {
        String string = getString(c52.e.create_a_password);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // yq1.l2
    public final void l8() {
        e8().Z(new gh1.e(this, 12));
    }

    @Override // yq1.l2, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("EXTRA_SIGNUP_PWD", "");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Intrinsics.checkNotNullParameter(string, "<set-?>");
            this.f139915u0 = string;
        }
    }

    @Override // yq1.l2, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        i8();
        e8().X(c.K);
        j8(new wq1.a(this, 6));
        lh0.y1 y1Var = this.f139906l0;
        if (y1Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        if (y1Var.e()) {
            e8().setVisibility(8);
            int i13 = 1;
            pk.a0.m(c8(), new u1(this, i13));
            StrongPasswordTextField strongPasswordTextField = this.f139914t0;
            if (strongPasswordTextField == null) {
                Intrinsics.r("strongPasswordField");
                throw null;
            }
            strongPasswordTextField.setVisibility(0);
            d1 handler = new d1(this, i13);
            Intrinsics.checkNotNullParameter(handler, "handler");
            strongPasswordTextField.f49850g = handler;
            strongPasswordTextField.requestFocus();
        }
    }
}
