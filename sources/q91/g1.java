package q91;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.settings.account.view.PasswordEditView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.identity.password.StrongPasswordTextField;
import com.pinterest.navigation.Navigation;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.m3;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lq91/g1;", "Lyk1/k;", "Ll91/j;", "<init>", "()V", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class g1 extends g0 implements l91.j {
    public static final /* synthetic */ int D0 = 0;
    public p91.c0 A0;
    public int B0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f103108j0;

    /* renamed from: k0, reason: collision with root package name */
    public cr1.a f103109k0;

    /* renamed from: l0, reason: collision with root package name */
    public i92.k f103110l0;

    /* renamed from: m0, reason: collision with root package name */
    public m3 f103111m0;

    /* renamed from: n0, reason: collision with root package name */
    public tb.l f103112n0;

    /* renamed from: o0, reason: collision with root package name */
    public or1.i f103113o0;

    /* renamed from: p0, reason: collision with root package name */
    public ox.b f103114p0;

    /* renamed from: q0, reason: collision with root package name */
    public rr1.g f103115q0;

    /* renamed from: r0, reason: collision with root package name */
    public GestaltButton f103116r0;

    /* renamed from: s0, reason: collision with root package name */
    public PasswordEditView f103117s0;

    /* renamed from: t0, reason: collision with root package name */
    public View f103118t0;

    /* renamed from: u0, reason: collision with root package name */
    public PasswordEditView f103119u0;

    /* renamed from: v0, reason: collision with root package name */
    public PasswordEditView f103120v0;

    /* renamed from: w0, reason: collision with root package name */
    public StrongPasswordTextField f103121w0;

    /* renamed from: x0, reason: collision with root package name */
    public View f103122x0;

    /* renamed from: y0, reason: collision with root package name */
    public l91.f f103123y0 = l91.f.UPDATE;

    /* renamed from: z0, reason: collision with root package name */
    public Function1 f103124z0 = b.f103077x;
    public final d4 C0 = d4.SETTINGS;

    public static final void b8(g1 g1Var) {
        p91.c0 c0Var;
        GestaltButton gestaltButton = g1Var.f103116r0;
        if (gestaltButton == null) {
            Intrinsics.r("doneButton");
            throw null;
        }
        if (!gestaltButton.isEnabled() || (c0Var = g1Var.A0) == null) {
            return;
        }
        PasswordEditView passwordEditView = g1Var.f103117s0;
        if (passwordEditView == null) {
            Intrinsics.r("currentPasswordView");
            throw null;
        }
        String g13 = passwordEditView.g();
        PasswordEditView passwordEditView2 = g1Var.f103119u0;
        if (passwordEditView2 == null) {
            Intrinsics.r("newPasswordView");
            throw null;
        }
        String g14 = passwordEditView2.g();
        PasswordEditView passwordEditView3 = g1Var.f103120v0;
        if (passwordEditView3 != null) {
            c0Var.q3(g13, g14, passwordEditView3.g(), null);
        } else {
            Intrinsics.r("confirmPasswordView");
            throw null;
        }
    }

    public static final void c8(g1 g1Var) {
        p91.c0 c0Var = g1Var.A0;
        if (c0Var != null) {
            PasswordEditView passwordEditView = g1Var.f103117s0;
            if (passwordEditView == null) {
                Intrinsics.r("currentPasswordView");
                throw null;
            }
            String g13 = passwordEditView.g();
            PasswordEditView passwordEditView2 = g1Var.f103119u0;
            if (passwordEditView2 == null) {
                Intrinsics.r("newPasswordView");
                throw null;
            }
            String g14 = passwordEditView2.g();
            PasswordEditView passwordEditView3 = g1Var.f103120v0;
            if (passwordEditView3 != null) {
                c0Var.s3(g13, g14, passwordEditView3.g());
            } else {
                Intrinsics.r("confirmPasswordView");
                throw null;
            }
        }
    }

    @Override // yk1.k, nl1.d
    public final void K7() {
        Window window;
        super.K7();
        FragmentActivity E4 = E4();
        if (E4 == null || (window = E4.getWindow()) == null) {
            return;
        }
        this.B0 = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
    }

    @Override // yk1.k, nl1.d
    public final void L7() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            Window window = E4.getWindow();
            if (window != null) {
                window.setSoftInputMode(this.B0);
            }
            hf0.b.l(E4);
        }
        super.L7();
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (Intrinsics.d(code, "passcode_screen_code")) {
            boolean z13 = result.getBoolean("is_passcode_verified");
            String string = result.getString("passcode_verified");
            if (!z13 || string == null) {
                return;
            }
            this.f103124z0.invoke(string);
        }
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        rm1.q qVar = rm1.q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.P(qVar.drawableRes(requireContext, dl2.b.f1(requireContext2)), eo1.b.color_themed_text_default);
        gestaltToolbarImpl.b0(getString(m60.x0.password));
        gestaltToolbarImpl.m();
        GestaltButton gestaltButton = this.f103116r0;
        if (gestaltButton != null) {
            gestaltToolbarImpl.c(gestaltButton);
        } else {
            Intrinsics.r("doneButton");
            throw null;
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Navigation navigation = this.I;
        Object i03 = navigation != null ? navigation.i0("extra_password_mode") : null;
        l91.f fVar = i03 instanceof l91.f ? (l91.f) i03 : null;
        if (fVar == null) {
            fVar = l91.f.UPDATE;
        }
        this.f103123y0 = fVar;
        Navigation navigation2 = this.I;
        Object i04 = navigation2 != null ? navigation2.i0("extra_for_mfa") : null;
        Boolean bool = i04 instanceof Boolean ? (Boolean) i04 : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        uk1.e eVar = this.f103108j0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        uj2.q p73 = p7();
        l91.f fVar2 = this.f103123y0;
        cr1.a aVar = this.f103109k0;
        if (aVar == null) {
            Intrinsics.r("accountService");
            throw null;
        }
        b60.b activeUserManager = getActiveUserManager();
        m60.w f73 = f7();
        c60.d dVar = c60.d.f26513a;
        m3 m3Var = this.f103111m0;
        if (m3Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        tb.l lVar = this.f103112n0;
        if (lVar == null) {
            Intrinsics.r("pinterestKeychain");
            throw null;
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        mr1.b m13 = bs1.c.m(requireActivity);
        or1.i iVar = this.f103113o0;
        if (iVar == null) {
            Intrinsics.r("authLoggingUtils");
            throw null;
        }
        ox.b bVar = this.f103114p0;
        if (bVar == null) {
            Intrinsics.r("analyticsApi");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        r42.j jVar = new r42.j(requireContext);
        rr1.g gVar = this.f103115q0;
        if (gVar != null) {
            return new p91.c0(g13, p73, fVar2, aVar, activeUserManager, f73, booleanValue, m3Var, lVar, m13, iVar, bVar, jVar, gVar);
        }
        Intrinsics.r("passwordValidationUtils");
        throw null;
    }

    public final void d8() {
        p91.c0 c0Var = this.A0;
        if (c0Var != null) {
            PasswordEditView passwordEditView = this.f103117s0;
            if (passwordEditView == null) {
                Intrinsics.r("currentPasswordView");
                throw null;
            }
            String g13 = passwordEditView.g();
            StrongPasswordTextField strongPasswordTextField = this.f103121w0;
            if (strongPasswordTextField != null) {
                c0Var.t3(g13, strongPasswordTextField.i());
            } else {
                Intrinsics.r("strongNewPasswordView");
                throw null;
            }
        }
    }

    public final void e8(boolean z13) {
        GestaltButton gestaltButton = this.f103116r0;
        if (gestaltButton != null) {
            gestaltButton.d(new u81.h(z13, 8));
        } else {
            Intrinsics.r("doneButton");
            throw null;
        }
    }

    public final void f8(boolean z13) {
        if (z13) {
            f7().d(new of0.a(new mf0.l()));
        } else {
            ep.b.C(null, f7());
        }
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getG0() {
        return this.C0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = b52.b.fragment_settings_password;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.f103116r0 = new GestaltButton.SmallPrimaryButton(6, requireContext, (AttributeSet) null).d(b.f103076w);
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(b52.a.password_edit_current);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f103117s0 = (PasswordEditView) findViewById;
        View findViewById2 = onCreateView.findViewById(b52.a.new_password_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f103118t0 = findViewById2;
        View findViewById3 = onCreateView.findViewById(b52.a.password_edit_new);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f103119u0 = (PasswordEditView) findViewById3;
        View findViewById4 = onCreateView.findViewById(b52.a.password_edit_confirm);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f103120v0 = (PasswordEditView) findViewById4;
        View findViewById5 = onCreateView.findViewById(b52.a.new_password_text_field);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f103121w0 = (StrongPasswordTextField) findViewById5;
        View findViewById6 = onCreateView.findViewById(b52.a.mfa_password_disclaimer);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f103122x0 = findViewById6;
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        GestaltButton gestaltButton = this.f103116r0;
        if (gestaltButton == null) {
            Intrinsics.r("doneButton");
            throw null;
        }
        pk.a0.m(gestaltButton, new f1(this, 0));
        PasswordEditView passwordEditView = this.f103117s0;
        if (passwordEditView == null) {
            Intrinsics.r("currentPasswordView");
            throw null;
        }
        passwordEditView.k(new f1(this, 1));
        passwordEditView.i();
        m3 m3Var = this.f103111m0;
        if (m3Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        if (!m3Var.d()) {
            PasswordEditView passwordEditView2 = this.f103119u0;
            if (passwordEditView2 == null) {
                Intrinsics.r("newPasswordView");
                throw null;
            }
            passwordEditView2.k(new f1(this, 4));
            PasswordEditView passwordEditView3 = this.f103120v0;
            if (passwordEditView3 == null) {
                Intrinsics.r("confirmPasswordView");
                throw null;
            }
            passwordEditView3.k(new f1(this, 5));
            passwordEditView3.j(new h81.b(this, 7));
            return;
        }
        View view = this.f103118t0;
        if (view == null) {
            Intrinsics.r("newPasswordContainerView");
            throw null;
        }
        view.setVisibility(8);
        GestaltButton gestaltButton2 = this.f103116r0;
        if (gestaltButton2 == null) {
            Intrinsics.r("doneButton");
            throw null;
        }
        pk.a0.m(gestaltButton2, new f1(this, 2));
        PasswordEditView passwordEditView4 = this.f103117s0;
        if (passwordEditView4 == null) {
            Intrinsics.r("currentPasswordView");
            throw null;
        }
        passwordEditView4.k(new f1(this, 3));
        StrongPasswordTextField strongPasswordTextField = this.f103121w0;
        if (strongPasswordTextField == null) {
            Intrinsics.r("strongNewPasswordView");
            throw null;
        }
        strongPasswordTextField.setVisibility(0);
        strongPasswordTextField.g(new a.z0(this, 14));
    }
}
