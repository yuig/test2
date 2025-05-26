package n91;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.m1;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.a4;
import h32.d4;
import java.io.Serializable;
import java.util.HashMap;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import m60.x0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln91/q;", "Lnl1/d;", "<init>", "()V", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class q extends d0 {

    /* renamed from: m0, reason: collision with root package name */
    public static final /* synthetic */ int f90057m0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final d4 f90058c0 = d4.EMAIL_VERIFICATION;

    /* renamed from: d0, reason: collision with root package name */
    public final a4 f90059d0 = a4.EMAIL_VERIFICATION_OTP;

    /* renamed from: e0, reason: collision with root package name */
    public final m1 f90060e0;

    /* renamed from: f0, reason: collision with root package name */
    public GestaltSpinner f90061f0;

    /* renamed from: g0, reason: collision with root package name */
    public SettingsRoundHeaderView f90062g0;

    /* renamed from: h0, reason: collision with root package name */
    public GestaltText f90063h0;

    /* renamed from: i0, reason: collision with root package name */
    public GestaltTextField f90064i0;

    /* renamed from: j0, reason: collision with root package name */
    public GestaltButton f90065j0;

    /* renamed from: k0, reason: collision with root package name */
    public GestaltButton f90066k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f90067l0;

    public q() {
        int i13 = 23;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new uv0.f(26, new kl0.w(this, i13)));
        int i14 = 24;
        this.f90060e0 = a1.s(this, k0.f80436a.b(c0.class), new ml0.v(a13, i13), new kl0.x(null, a13, i14), new kl0.y(this, a13, i14));
    }

    @Override // nl1.d
    public final void K7() {
        Window window;
        super.K7();
        FragmentActivity E4 = E4();
        if (E4 == null || (window = E4.getWindow()) == null) {
            return;
        }
        this.f90067l0 = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
    }

    @Override // nl1.d
    public final void L7() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            Window window = E4.getWindow();
            if (window != null) {
                window.setSoftInputMode(this.f90067l0);
            }
            hf0.b.l(E4);
        }
        super.L7();
    }

    public final c0 Y7() {
        return (c0) this.f90060e0.getValue();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF99381w0() {
        return this.f90059d0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF99380v0() {
        return this.f90058c0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = b52.b.fragment_email_otp_confirmation;
        this.L = false;
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_EMAIL", "");
        Serializable W = com.bumptech.glide.d.W(this, "com.pinterest.EXTRA_PRIOR_EMAIL_CHANGE_REQUEST");
        HashMap hashMap = W instanceof HashMap ? (HashMap) W : null;
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        Y7().h(generateLoggingContext(), Z, hashMap);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(b52.a.loading_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f90061f0 = (GestaltSpinner) findViewById;
        View findViewById2 = onCreateView.findViewById(b52.a.header_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f90062g0 = (SettingsRoundHeaderView) findViewById2;
        View findViewById3 = onCreateView.findViewById(b52.a.email_verification_code_description);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f90063h0 = (GestaltText) findViewById3;
        View findViewById4 = onCreateView.findViewById(b52.a.email_verification_code_input);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f90064i0 = (GestaltTextField) findViewById4;
        View findViewById5 = onCreateView.findViewById(b52.a.email_verification_code_resend);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f90065j0 = (GestaltButton) findViewById5;
        View findViewById6 = onCreateView.findViewById(b52.a.email_verification_code_submit_button);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f90066k0 = (GestaltButton) findViewById6;
        SettingsRoundHeaderView settingsRoundHeaderView = this.f90062g0;
        if (settingsRoundHeaderView == null) {
            Intrinsics.r("headerView");
            throw null;
        }
        settingsRoundHeaderView.k0(x0.email);
        settingsRoundHeaderView.d0(rm1.q.CANCEL);
        settingsRoundHeaderView.g0(new x61.e(this, 24));
        GestaltTextField gestaltTextField = this.f90064i0;
        if (gestaltTextField == null) {
            Intrinsics.r("verificationCodeInput");
            throw null;
        }
        gestaltTextField.L(new j41.i(this, 26));
        GestaltButton gestaltButton = this.f90065j0;
        if (gestaltButton == null) {
            Intrinsics.r("verificationCodeResend");
            throw null;
        }
        final int i13 = 0;
        gestaltButton.e(new gm1.a(this) { // from class: n91.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f90048b;

            {
                this.f90048b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                int i14 = i13;
                q this$0 = this.f90048b;
                switch (i14) {
                    case 0:
                        int i15 = q.f90057m0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof xl1.a) {
                            kh2.j.x2(this$0.Y7(), c.f90035a);
                            break;
                        }
                        break;
                    default:
                        int i16 = q.f90057m0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof xl1.a) {
                            kh2.j.x2(this$0.Y7(), f.f90042a);
                            break;
                        }
                        break;
                }
            }
        });
        GestaltButton gestaltButton2 = this.f90066k0;
        if (gestaltButton2 == null) {
            Intrinsics.r("submitButton");
            throw null;
        }
        final int i14 = 1;
        gestaltButton2.e(new gm1.a(this) { // from class: n91.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f90048b;

            {
                this.f90048b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                int i142 = i14;
                q this$0 = this.f90048b;
                switch (i142) {
                    case 0:
                        int i15 = q.f90057m0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof xl1.a) {
                            kh2.j.x2(this$0.Y7(), c.f90035a);
                            break;
                        }
                        break;
                    default:
                        int i16 = q.f90057m0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof xl1.a) {
                            kh2.j.x2(this$0.Y7(), f.f90042a);
                            break;
                        }
                        break;
                }
            }
        });
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new p(this, null), 3);
    }
}
