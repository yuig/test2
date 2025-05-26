package yq1;

import android.os.Bundle;
import android.view.View;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyq1/v1;", "Lyq1/l2;", "<init>", "()V", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class v1 extends k0 {
    public static final /* synthetic */ int D0 = 0;
    public String C0;

    @Override // zq1.h0
    public final void N2() {
        ar1.a aVar = this.f139907m0;
        if (aVar != null) {
            aVar.I0(e8().B0(), ar1.d.EMAIL_STEP);
        }
    }

    @Override // yq1.l2
    public final String f8() {
        String string = getString(vq1.d.signup_email_hint);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // yq1.l2
    public final String h8() {
        String string = getString(vq1.d.signup_whats_your_email);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // yq1.l2
    public final void l8() {
        GestaltTextField e83 = e8();
        e83.Z(new la1.k(25, this, e83));
    }

    @Override // yq1.l2, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("EXTRA_SIGNUP_EMAIL", "");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Intrinsics.checkNotNullParameter(string, "<set-?>");
            this.f139915u0 = string;
            arguments.remove("EXTRA_SIGNUP_EMAIL");
        }
    }

    @Override // yq1.l2, nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (e8().hasWindowFocus()) {
            hf0.b.s(e8());
        }
    }

    @Override // yq1.l2, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        e8().X(c.H);
        j8(new wq1.a(this, 2));
        GestaltText gestaltText = this.f139913s0;
        if (gestaltText == null) {
            Intrinsics.r("explanationTextView");
            throw null;
        }
        gestaltText.j(new gh1.e(this, 9));
        i8();
        k8(tr1.b.c(e8().B0()));
    }
}
