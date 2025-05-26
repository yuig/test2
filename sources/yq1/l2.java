package yq1;

import android.content.ComponentCallbacks;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.identity.password.StrongPasswordTextField;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lyq1/l2;", "Lyk1/k;", "Lzq1/h0;", "<init>", "()V", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class l2 extends p0 implements zq1.h0 {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f139903y0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public so.k0 f139904j0;

    /* renamed from: k0, reason: collision with root package name */
    public uk1.e f139905k0;

    /* renamed from: l0, reason: collision with root package name */
    public lh0.y1 f139906l0;

    /* renamed from: m0, reason: collision with root package name */
    public ar1.a f139907m0;

    /* renamed from: n0, reason: collision with root package name */
    public zq1.g0 f139908n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltButton f139909o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltTextField f139910p0;

    /* renamed from: q0, reason: collision with root package name */
    public GestaltText f139911q0;

    /* renamed from: r0, reason: collision with root package name */
    public GestaltText f139912r0;

    /* renamed from: s0, reason: collision with root package name */
    public GestaltText f139913s0;

    /* renamed from: t0, reason: collision with root package name */
    public StrongPasswordTextField f139914t0;

    /* renamed from: u0, reason: collision with root package name */
    public String f139915u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f139916v0;

    /* renamed from: w0, reason: collision with root package name */
    public final k2 f139917w0;

    /* renamed from: x0, reason: collision with root package name */
    public final d4 f139918x0;

    public l2() {
        this.E = vq1.c.fragment_signup_step;
        this.f139915u0 = "";
        this.f139917w0 = new k2(this);
        this.f139918x0 = d4.REGISTRATION;
    }

    public void G1(int i13, boolean z13) {
        if (i13 == -1) {
            return;
        }
        if (z13) {
            GestaltText gestaltText = this.f139911q0;
            if (gestaltText == null) {
                Intrinsics.r("errorTextView");
                throw null;
            }
            String string = getString(i13);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            gestaltText.i(new dl1.i0(string, 17));
            gestaltText.announceForAccessibility(string);
        }
        this.f139916v0 = true;
        GestaltTextField e83 = e8();
        if (!z13) {
            e83.g0();
        }
        String string2 = getString(i13);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        e83.X(new fg0.f(e83, string2));
        hf0.b.k(e83);
    }

    @Override // yk1.k, nl1.d
    public final void K7() {
        super.K7();
        GestaltTextField e83 = e8();
        if (e83.k0().f20043n != fm1.c.VISIBLE) {
            e83 = null;
        }
        if (e83 != null) {
            e83.requestFocus();
            Window window = requireActivity().getWindow();
            h1.b bVar = new h1.b(e83);
            int i13 = Build.VERSION.SDK_INT;
            (i13 >= 35 ? new q5.f2(window, bVar) : i13 >= 30 ? new q5.e2(window, bVar) : new q5.d2(window, bVar)).l();
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        so.k0 k0Var = this.f139904j0;
        if (k0Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        uk1.e eVar = this.f139905k0;
        if (eVar != null) {
            return k0Var.a(((uk1.a) eVar).f(s7(), ""), p7());
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // zq1.h0
    public void W() {
    }

    public final void b8() {
        GestaltText gestaltText = this.f139911q0;
        if (gestaltText == null) {
            Intrinsics.r("errorTextView");
            throw null;
        }
        pk.a0.k0(gestaltText);
        e8().X(c.L);
    }

    public final GestaltButton c8() {
        GestaltButton gestaltButton = this.f139909o0;
        if (gestaltButton != null) {
            return gestaltButton;
        }
        Intrinsics.r("actionButton");
        throw null;
    }

    public final GestaltText d8() {
        GestaltText gestaltText = this.f139912r0;
        if (gestaltText != null) {
            return gestaltText;
        }
        Intrinsics.r("birthdayText");
        throw null;
    }

    public final GestaltTextField e8() {
        GestaltTextField gestaltTextField = this.f139910p0;
        if (gestaltTextField != null) {
            return gestaltTextField;
        }
        Intrinsics.r("editText");
        throw null;
    }

    public abstract String f8();

    public String g8() {
        return null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getG0() {
        return this.f139918x0;
    }

    public abstract String h8();

    public final void i8() {
        s7().U(generateLoggingContext(), h32.f1.VIEW, null, null, null, false);
    }

    public final void j8(View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        c8().e(new la1.k(26, listener, this));
    }

    public final void k8(boolean z13) {
        c8().d(new mm1.i(z13, 17));
    }

    public abstract void l8();

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentCallbacks parentFragment = getParentFragment();
        if (parentFragment != null) {
            try {
                this.f139907m0 = (ar1.a) parentFragment;
            } catch (ClassCastException unused) {
                throw new ClassCastException(getContext() + " must implement SignupHostContract.ActionListener");
            }
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        f7().j(this.f139917w0);
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        f7().h(this.f139917w0);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View v13, Bundle bundle) {
        GestaltText gestaltText;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(vq1.b.fragment_signup_step_edit);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById;
        Intrinsics.checkNotNullParameter(gestaltTextField, "<set-?>");
        this.f139910p0 = gestaltTextField;
        View findViewById2 = v13.findViewById(vq1.b.fragment_signup_step_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById2;
        Intrinsics.checkNotNullParameter(gestaltButton, "<set-?>");
        this.f139909o0 = gestaltButton;
        View findViewById3 = v13.findViewById(vq1.b.fragment_signup_step_edit_error);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById3;
        Intrinsics.checkNotNullParameter(gestaltText2, "<set-?>");
        this.f139911q0 = gestaltText2;
        View findViewById4 = v13.findViewById(vq1.b.fragment_signup_step_birthday);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltText gestaltText3 = (GestaltText) findViewById4;
        Intrinsics.checkNotNullParameter(gestaltText3, "<set-?>");
        this.f139912r0 = gestaltText3;
        View findViewById5 = v13.findViewById(vq1.b.fragment_signup_step_edit_explanation);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        GestaltText gestaltText4 = (GestaltText) findViewById5;
        Intrinsics.checkNotNullParameter(gestaltText4, "<set-?>");
        this.f139913s0 = gestaltText4;
        View findViewById6 = v13.findViewById(vq1.b.signup_strong_password_field);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        StrongPasswordTextField strongPasswordTextField = (StrongPasswordTextField) findViewById6;
        Intrinsics.checkNotNullParameter(strongPasswordTextField, "<set-?>");
        this.f139914t0 = strongPasswordTextField;
        GestaltText gestaltText5 = (GestaltText) v13.findViewById(vq1.b.fragment_signup_step_title);
        if (gestaltText5 != null) {
            pk.a0.p(gestaltText5, h8());
        }
        String g83 = g8();
        if (g83 != null && (gestaltText = (GestaltText) v13.findViewById(vq1.b.fragment_signup_step_subtitle)) != null) {
            gestaltText.i(new dl1.i0(g83, 16));
        }
        e8().X(new j2(this, 0));
        int i13 = 1;
        if (!kotlin.text.z.j(this.f139915u0)) {
            e8().X(new j2(this, i13));
        }
        k8(!kotlin.text.z.j(e8().B0()));
        l8();
    }
}
