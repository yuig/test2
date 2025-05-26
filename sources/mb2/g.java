package mb2;

import android.os.Bundle;
import android.view.View;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import m60.v0;
import m60.x0;
import pk.a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmb2/g;", "Lnl1/d;", "<init>", "()V", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class g extends c {

    /* renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ int f86876e0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final d4 f86877c0 = d4.SSO;

    /* renamed from: d0, reason: collision with root package name */
    public final a4 f86878d0 = a4.SSO_BUSINESS_DISCLAIMER;

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getW0() {
        return this.f86878d0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getV0() {
        return this.f86877c0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = v0.fragment_sso_signup_disclaimer;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(t0.sso_signup_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        a0.o((GestaltText) findViewById, x0.sso_signup_disclaimer_title, new Object[0]);
        View findViewById2 = v13.findViewById(t0.sso_signup_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        a0.o((GestaltText) findViewById2, x0.sso_signup_disclaimer_description, new Object[0]);
        View findViewById3 = v13.findViewById(t0.sso_signup_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById3;
        gestaltButton.setText(gestaltButton.getResources().getString(x0.sso_signup_disclaimer_button_label));
        gestaltButton.setOnClickListener(new wq1.a(this, 29));
    }
}
