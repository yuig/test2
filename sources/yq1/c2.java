package yq1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import c2.m4;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.text.GestaltText;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyq1/c2;", "Lyq1/l2;", "<init>", "()V", "yq1/a2", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class c2 extends m0 {
    public static final /* synthetic */ int F0 = 0;
    public qr1.f0 C0 = qr1.f0.PERSONAL;
    public final xk2.v D0 = xk2.m.b(new yj1.d(this, 19));
    public final gh1.e E0 = new gh1.e(this, 10);

    @Override // yq1.l2, zq1.h0
    public final void G1(int i13, boolean z13) {
        GestaltText gestaltText = this.f139911q0;
        if (gestaltText != null) {
            gestaltText.i(new m4(this, i13, 27));
        } else {
            Intrinsics.r("errorTextView");
            throw null;
        }
    }

    @Override // zq1.h0
    public final void N2() {
        GestaltCheckBox gestaltCheckBox;
        ar1.a aVar = this.f139907m0;
        if (aVar != null) {
            boolean z13 = false;
            boolean n83 = n8(false);
            View view = getView();
            if (view != null && (gestaltCheckBox = (GestaltCheckBox) view.findViewById(vq1.b.chk_consent)) != null && !c0.d.a2(gestaltCheckBox)) {
                z13 = true;
            }
            aVar.I0(new ar1.b(n83, z13), ar1.d.KOREA_CONSENT_STEP);
        }
    }

    @Override // yq1.l2
    public final String f8() {
        return "";
    }

    @Override // yq1.l2
    public final String g8() {
        String string = getString(vq1.d.kr_description);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // yq1.l2
    public final String h8() {
        String string = getString(vq1.d.kr_consents);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // yq1.l2
    public final void l8() {
    }

    public final boolean n8(boolean z13) {
        GestaltCheckBox gestaltCheckBox;
        for (a2 a2Var : (List) this.D0.getValue()) {
            if (z13 || a2Var.d()) {
                View view = getView();
                if (view != null && (gestaltCheckBox = (GestaltCheckBox) view.findViewById(a2Var.a())) != null && !c0.d.a2(gestaltCheckBox)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // yq1.l2, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || arguments.getSerializable("EXTRA_KOREA_CONSENT") == null) {
            return;
        }
        Serializable serializable = arguments.getSerializable("EXTRA_KOREA_CONSENT");
        Intrinsics.g(serializable, "null cannot be cast to non-null type com.pinterest.identity.core.model.SignupType");
        this.C0 = (qr1.f0) serializable;
        arguments.remove("EXTRA_KOREA_CONSENT");
    }

    @Override // yq1.l2, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        GestaltCheckBox gestaltCheckBox;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        e8().X(c.I);
        ((ViewGroup) v13.findViewById(vq1.b.kr_consent_container)).setVisibility(0);
        View findViewById = v13.findViewById(vq1.b.chk_krconsent_all);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        c0.d.l((GestaltCheckBox) findViewById, new b2(this, 1));
        Iterator it = ((List) this.D0.getValue()).iterator();
        while (true) {
            int i13 = 4;
            if (!it.hasNext()) {
                j8(new wq1.a(this, 4));
                return;
            }
            a2 a2Var = (a2) it.next();
            int a13 = a2Var.a();
            int b13 = a2Var.b();
            int c13 = a2Var.c();
            View view = getView();
            if (view != null && (gestaltCheckBox = (GestaltCheckBox) view.findViewById(a13)) != null) {
                gestaltCheckBox.L(new w1.x0(this, b13, c13, i13));
                c0.d.l(gestaltCheckBox, new b2(this, 0));
            }
        }
    }
}
