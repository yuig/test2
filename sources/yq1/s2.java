package yq1;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttonSocial.GestaltButtonSocial;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.h9;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyq1/s2;", "Lnl1/d;", "<init>", "()V", "org/chromium/net/y", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class s2 extends q0 {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f139988y0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public vy.m f139989c0;

    /* renamed from: d0, reason: collision with root package name */
    public lb2.q f139990d0;

    /* renamed from: e0, reason: collision with root package name */
    public mr1.a f139991e0;

    /* renamed from: f0, reason: collision with root package name */
    public com.pinterest.identity.authentication.a f139992f0;

    /* renamed from: g0, reason: collision with root package name */
    public lh0.y1 f139993g0;

    /* renamed from: h0, reason: collision with root package name */
    public lb2.d f139994h0;

    /* renamed from: i0, reason: collision with root package name */
    public gz1.b f139995i0;

    /* renamed from: j0, reason: collision with root package name */
    public h9 f139996j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f139997k0;

    /* renamed from: l0, reason: collision with root package name */
    public ConstraintLayout f139998l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltText f139999m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltTextField f140000n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltTextField f140001o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltText f140002p0;

    /* renamed from: q0, reason: collision with root package name */
    public GestaltButton f140003q0;

    /* renamed from: r0, reason: collision with root package name */
    public GestaltButton f140004r0;

    /* renamed from: s0, reason: collision with root package name */
    public GestaltButton f140005s0;

    /* renamed from: t0, reason: collision with root package name */
    public GestaltButtonSocial f140006t0;

    /* renamed from: u0, reason: collision with root package name */
    public GestaltButtonSocial f140007u0;

    /* renamed from: v0, reason: collision with root package name */
    public GestaltButtonSocial f140008v0;

    /* renamed from: w0, reason: collision with root package name */
    public String f140009w0;

    /* renamed from: x0, reason: collision with root package name */
    public final d4 f140010x0 = d4.LOGIN;

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Y(vq1.d.login);
        gestaltToolbarImpl.I();
        rm1.d dVar = new rm1.d(new rm1.f(rm1.q.CANCEL, rm1.i.LG), null, null, 0, null, 30);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        BitmapDrawable C = com.bumptech.glide.d.C(dVar, requireContext);
        String string = getString(m60.x0.cancel);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        gestaltToolbarImpl.T(C, string);
        gestaltToolbarImpl.m();
    }

    public final void Y7(kk2.g gVar) {
        xj2.c o13 = new kk2.h(new kk2.g(gVar, new tp1.c(29, new q2(this, 0)), 2), new g51.h(this, 17), 1).o(new o2(0, new q2(this, 1)), new o2(1, new q2(this, 2)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        R6(o13);
    }

    @Override // nl1.d
    public final boolean Z6() {
        return false;
    }

    public final lb2.q Z7() {
        lb2.q qVar = this.f139990d0;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.r("authManager");
        throw null;
    }

    public final lh0.y1 a8() {
        lh0.y1 y1Var = this.f139993g0;
        if (y1Var != null) {
            return y1Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    public final void b8(gm1.c cVar) {
        xn1.g gVar;
        KeyEvent keyEvent;
        int j13 = cVar.j();
        if (j13 == vq1.b.forgot_password_tv) {
            if (cVar instanceof rn1.f) {
                s7().X(h32.u0.RESET_BUTTON);
                s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : h32.u0.FORGET_PW_LINK, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                hf0.b.l(requireActivity());
                GestaltTextField gestaltTextField = this.f140000n0;
                if (gestaltTextField == null) {
                    Intrinsics.r("emailEditText");
                    throw null;
                }
                String B0 = gestaltTextField.B0();
                lb2.d dVar = this.f139994h0;
                if (dVar == null) {
                    Intrinsics.r("accountManager");
                    throw null;
                }
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                lb2.d.b(dVar, requireContext, B0, false, 4);
                return;
            }
            return;
        }
        if (j13 == vq1.b.email) {
            if (cVar instanceof xn1.a) {
                GestaltTextField gestaltTextField2 = this.f140000n0;
                if (gestaltTextField2 == null) {
                    Intrinsics.r("emailEditText");
                    throw null;
                }
                if (gestaltTextField2.k0().f20035f == yn1.f.ERROR) {
                    ConstraintLayout constraintLayout = this.f139998l0;
                    if (constraintLayout == null) {
                        Intrinsics.r("facebookErrorBanner");
                        throw null;
                    }
                    constraintLayout.setVisibility(4);
                    GestaltTextField gestaltTextField3 = this.f140000n0;
                    if (gestaltTextField3 != null) {
                        gestaltTextField3.X(c.M);
                        return;
                    } else {
                        Intrinsics.r("emailEditText");
                        throw null;
                    }
                }
                return;
            }
            return;
        }
        if (j13 == vq1.b.password) {
            if (!(cVar instanceof xn1.a)) {
                if ((cVar instanceof xn1.g) && (keyEvent = (gVar = (xn1.g) cVar).f135451d) != null && keyEvent.getAction() == 0 && gVar.f135450c == 66) {
                    ConstraintLayout constraintLayout2 = this.f139998l0;
                    if (constraintLayout2 == null) {
                        Intrinsics.r("facebookErrorBanner");
                        throw null;
                    }
                    constraintLayout2.setVisibility(4);
                    c8();
                    return;
                }
                return;
            }
            GestaltTextField gestaltTextField4 = this.f140001o0;
            if (gestaltTextField4 == null) {
                Intrinsics.r("passwordEditText");
                throw null;
            }
            if (gestaltTextField4.k0().f20035f == yn1.f.ERROR) {
                ConstraintLayout constraintLayout3 = this.f139998l0;
                if (constraintLayout3 == null) {
                    Intrinsics.r("facebookErrorBanner");
                    throw null;
                }
                constraintLayout3.setVisibility(4);
                GestaltTextField gestaltTextField5 = this.f140001o0;
                if (gestaltTextField5 != null) {
                    gestaltTextField5.X(r2.f139968l);
                    return;
                } else {
                    Intrinsics.r("passwordEditText");
                    throw null;
                }
            }
            return;
        }
        if (j13 == vq1.b.login_bt) {
            if (cVar instanceof xl1.a) {
                c8();
                return;
            }
            return;
        }
        if (j13 == vq1.b.line) {
            if (cVar instanceof xl1.a) {
                ConstraintLayout constraintLayout4 = this.f139998l0;
                if (constraintLayout4 == null) {
                    Intrinsics.r("facebookErrorBanner");
                    throw null;
                }
                constraintLayout4.setVisibility(4);
                lb2.q Z7 = Z7();
                lr1.h hVar = lr1.h.LineAuthenticationMethod;
                FragmentActivity requireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                Y7(Z7.b(hVar, bs1.c.m(requireActivity), null));
                return;
            }
            return;
        }
        if (j13 == vq1.b.line_social) {
            if (cVar instanceof am1.g) {
                ConstraintLayout constraintLayout5 = this.f139998l0;
                if (constraintLayout5 == null) {
                    Intrinsics.r("facebookErrorBanner");
                    throw null;
                }
                constraintLayout5.setVisibility(4);
                lb2.q Z72 = Z7();
                lr1.h hVar2 = lr1.h.LineAuthenticationMethod;
                FragmentActivity requireActivity2 = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                Y7(Z72.b(hVar2, bs1.c.m(requireActivity2), null));
                return;
            }
            return;
        }
        if (j13 == vq1.b.facebook) {
            if (cVar instanceof xl1.a) {
                lb2.q Z73 = Z7();
                lr1.h hVar3 = lr1.h.FacebookAuthenticationMethod;
                FragmentActivity requireActivity3 = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                Y7(Z73.b(hVar3, bs1.c.m(requireActivity3), null));
                return;
            }
            return;
        }
        if (j13 == vq1.b.facebook_social) {
            if (cVar instanceof am1.g) {
                lb2.q Z74 = Z7();
                lr1.h hVar4 = lr1.h.FacebookAuthenticationMethod;
                FragmentActivity requireActivity4 = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity4, "requireActivity(...)");
                Y7(Z74.b(hVar4, bs1.c.m(requireActivity4), null));
                return;
            }
            return;
        }
        if (j13 == vq1.b.gplus) {
            if (cVar instanceof xl1.a) {
                ConstraintLayout constraintLayout6 = this.f139998l0;
                if (constraintLayout6 == null) {
                    Intrinsics.r("facebookErrorBanner");
                    throw null;
                }
                constraintLayout6.setVisibility(4);
                lb2.q Z75 = Z7();
                lr1.h hVar5 = lr1.h.GoogleUnifiedAuthMethod;
                FragmentActivity requireActivity5 = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity5, "requireActivity(...)");
                Y7(Z75.b(hVar5, bs1.c.m(requireActivity5), null));
                return;
            }
            return;
        }
        if (j13 == vq1.b.gplus_social && (cVar instanceof am1.g)) {
            ConstraintLayout constraintLayout7 = this.f139998l0;
            if (constraintLayout7 == null) {
                Intrinsics.r("facebookErrorBanner");
                throw null;
            }
            constraintLayout7.setVisibility(4);
            lb2.q Z76 = Z7();
            lr1.h hVar6 = lr1.h.GoogleUnifiedAuthMethod;
            FragmentActivity requireActivity6 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity6, "requireActivity(...)");
            Y7(Z76.b(hVar6, bs1.c.m(requireActivity6), null));
        }
    }

    public final void c8() {
        s7().X(h32.u0.LOGIN_BUTTON);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        hf0.b.l(requireActivity);
        GestaltTextField gestaltTextField = this.f140000n0;
        if (gestaltTextField == null) {
            Intrinsics.r("emailEditText");
            throw null;
        }
        if (kotlin.text.z.j(gestaltTextField.B0())) {
            String string = getResources().getString(vq1.d.signup_email_empty);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            GestaltTextField gestaltTextField2 = this.f140000n0;
            if (gestaltTextField2 == null) {
                Intrinsics.r("emailEditText");
                throw null;
            }
            gestaltTextField2.X(new dl1.i0(string, 18)).g0();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            df.j1.m(requireContext, string);
            return;
        }
        GestaltTextField gestaltTextField3 = this.f140001o0;
        if (gestaltTextField3 == null) {
            Intrinsics.r("passwordEditText");
            throw null;
        }
        if (kotlin.text.z.j(gestaltTextField3.B0())) {
            d8(vq1.d.login_password_fail, false);
            return;
        }
        vy.m mVar = this.f139989c0;
        if (mVar == null) {
            Intrinsics.r("analyticsApi");
            throw null;
        }
        mVar.a("signup_login");
        lb2.q Z7 = Z7();
        GestaltTextField gestaltTextField4 = this.f140000n0;
        if (gestaltTextField4 == null) {
            Intrinsics.r("emailEditText");
            throw null;
        }
        String B0 = gestaltTextField4.B0();
        GestaltTextField gestaltTextField5 = this.f140001o0;
        if (gestaltTextField5 == null) {
            Intrinsics.r("passwordEditText");
            throw null;
        }
        String B02 = gestaltTextField5.B0();
        h9 h9Var = this.f139996j0;
        if (h9Var == null) {
            Intrinsics.r("pinterestLoginFactory");
            throw null;
        }
        pr1.h a13 = h9Var.a(B0, B02);
        FragmentActivity requireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
        Y7(Z7.c(a13, bs1.c.m(requireActivity2)));
    }

    public final void d8(int i13, boolean z13) {
        String string = getResources().getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        GestaltTextField gestaltTextField = this.f140001o0;
        if (gestaltTextField == null) {
            Intrinsics.r("passwordEditText");
            throw null;
        }
        gestaltTextField.X(new dl1.i0(string, 19));
        if (z13) {
            this.f139997k0 = true;
        } else {
            GestaltTextField gestaltTextField2 = this.f140001o0;
            if (gestaltTextField2 == null) {
                Intrinsics.r("passwordEditText");
                throw null;
            }
            gestaltTextField2.g0();
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        df.j1.m(requireContext, string);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF0() {
        return this.f140010x0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        Z7().d(i13, i14, intent);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = vq1.c.fragment_unauth_login;
        this.f140009w0 = com.bumptech.glide.d.X(this, "EXTRA_EMAIL");
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(vq1.b.scroll_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = onCreateView.findViewById(vq1.b.email);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f140000n0 = (GestaltTextField) findViewById2;
        View findViewById3 = onCreateView.findViewById(vq1.b.password);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f140001o0 = (GestaltTextField) findViewById3;
        View findViewById4 = onCreateView.findViewById(vq1.b.forgot_password_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f140002p0 = (GestaltText) findViewById4;
        View findViewById5 = onCreateView.findViewById(vq1.b.facebook_error_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f139998l0 = (ConstraintLayout) findViewById5;
        View findViewById6 = onCreateView.findViewById(vq1.b.facebook_error_message);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f139999m0 = (GestaltText) findViewById6;
        if (a8().b()) {
            View findViewById7 = onCreateView.findViewById(vq1.b.facebook_social);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
            this.f140006t0 = (GestaltButtonSocial) findViewById7;
            View findViewById8 = onCreateView.findViewById(vq1.b.gplus_social);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
            this.f140007u0 = (GestaltButtonSocial) findViewById8;
            View findViewById9 = onCreateView.findViewById(vq1.b.line_social);
            Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
            this.f140008v0 = (GestaltButtonSocial) findViewById9;
        } else {
            View findViewById10 = onCreateView.findViewById(vq1.b.facebook);
            Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
            this.f140003q0 = (GestaltButton) findViewById10;
            View findViewById11 = onCreateView.findViewById(vq1.b.gplus);
            Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
            this.f140004r0 = (GestaltButton) findViewById11;
            View findViewById12 = onCreateView.findViewById(vq1.b.line);
            Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
            this.f140005s0 = (GestaltButton) findViewById12;
        }
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        final int i13 = 3;
        if (this.f140009w0 != null) {
            GestaltTextField gestaltTextField = this.f140000n0;
            if (gestaltTextField == null) {
                Intrinsics.r("emailEditText");
                throw null;
            }
            gestaltTextField.X(new q2(this, i13));
        }
        GestaltTextField gestaltTextField2 = this.f140000n0;
        if (gestaltTextField2 == null) {
            Intrinsics.r("emailEditText");
            throw null;
        }
        final int i14 = 0;
        gestaltTextField2.Z(new gm1.a(this) { // from class: yq1.n2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s2 f139925b;

            {
                this.f139925b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i14;
                s2 this$0 = this.f139925b;
                switch (i15) {
                    case 0:
                        int i16 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 1:
                        int i17 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 2:
                        int i18 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 3:
                        int i19 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 4:
                        int i23 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 5:
                        int i24 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 6:
                        int i25 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 7:
                        int i26 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 8:
                        int i27 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 9:
                        int i28 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    default:
                        int i29 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                }
            }
        });
        GestaltTextField gestaltTextField3 = this.f140001o0;
        if (gestaltTextField3 == null) {
            Intrinsics.r("passwordEditText");
            throw null;
        }
        final int i15 = 2;
        gestaltTextField3.Z(new gm1.a(this) { // from class: yq1.n2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s2 f139925b;

            {
                this.f139925b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i15;
                s2 this$0 = this.f139925b;
                switch (i152) {
                    case 0:
                        int i16 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 1:
                        int i17 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 2:
                        int i18 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 3:
                        int i19 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 4:
                        int i23 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 5:
                        int i24 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 6:
                        int i25 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 7:
                        int i26 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 8:
                        int i27 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 9:
                        int i28 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    default:
                        int i29 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                }
            }
        });
        GestaltButton gestaltButton = (GestaltButton) v13.findViewById(vq1.b.login_bt);
        if (gestaltButton != null) {
            gestaltButton.setLayoutParams(gestaltButton.getLayoutParams());
            gestaltButton.d(r2.f139975s).e(new gm1.a(this) { // from class: yq1.n2

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s2 f139925b;

                {
                    this.f139925b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i152 = i13;
                    s2 this$0 = this.f139925b;
                    switch (i152) {
                        case 0:
                            int i16 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 1:
                            int i17 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 2:
                            int i18 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 3:
                            int i19 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 4:
                            int i23 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 5:
                            int i24 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 6:
                            int i25 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 7:
                            int i26 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 8:
                            int i27 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 9:
                            int i28 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        default:
                            int i29 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                    }
                }
            });
            gestaltButton.setAccessibilityDelegate(new androidx.appcompat.widget.t(this, 2));
        }
        final int i16 = 4;
        if (a8().b()) {
            GestaltButtonSocial gestaltButtonSocial = this.f140006t0;
            if (gestaltButtonSocial == null) {
                Intrinsics.r("facebookBtSocial");
                throw null;
            }
            kh2.b0.O(gestaltButtonSocial, r2.f139981y);
            GestaltButtonSocial gestaltButtonSocial2 = this.f140007u0;
            if (gestaltButtonSocial2 == null) {
                Intrinsics.r("gplusBtSocial");
                throw null;
            }
            kh2.b0.O(gestaltButtonSocial2, r2.f139982z);
            if (a8().f()) {
                GestaltButtonSocial gestaltButtonSocial3 = this.f140006t0;
                if (gestaltButtonSocial3 == null) {
                    Intrinsics.r("facebookBtSocial");
                    throw null;
                }
                kh2.b0.O(gestaltButtonSocial3, r2.f139976t);
            } else {
                GestaltButtonSocial gestaltButtonSocial4 = this.f140006t0;
                if (gestaltButtonSocial4 == null) {
                    Intrinsics.r("facebookBtSocial");
                    throw null;
                }
                gestaltButtonSocial4.s(new gm1.a(this) { // from class: yq1.n2

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ s2 f139925b;

                    {
                        this.f139925b = this;
                    }

                    @Override // gm1.a
                    public final void h3(gm1.c it) {
                        int i152 = i16;
                        s2 this$0 = this.f139925b;
                        switch (i152) {
                            case 0:
                                int i162 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 1:
                                int i17 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 2:
                                int i18 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 3:
                                int i19 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 4:
                                int i23 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 5:
                                int i24 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 6:
                                int i25 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 7:
                                int i26 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 8:
                                int i27 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 9:
                                int i28 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            default:
                                int i29 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                        }
                    }
                });
            }
            GestaltButtonSocial gestaltButtonSocial5 = this.f140007u0;
            if (gestaltButtonSocial5 == null) {
                Intrinsics.r("gplusBtSocial");
                throw null;
            }
            final int i17 = 5;
            kh2.b0.O(gestaltButtonSocial5, new q2(this, i17));
            gestaltButtonSocial5.s(new gm1.a(this) { // from class: yq1.n2

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s2 f139925b;

                {
                    this.f139925b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i152 = i17;
                    s2 this$0 = this.f139925b;
                    switch (i152) {
                        case 0:
                            int i162 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 1:
                            int i172 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 2:
                            int i18 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 3:
                            int i19 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 4:
                            int i23 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 5:
                            int i24 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 6:
                            int i25 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 7:
                            int i26 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 8:
                            int i27 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 9:
                            int i28 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        default:
                            int i29 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                    }
                }
            });
            GestaltButtonSocial gestaltButtonSocial6 = this.f140008v0;
            if (gestaltButtonSocial6 == null) {
                Intrinsics.r("lineBtSocial");
                throw null;
            }
            if (a8().c()) {
                kh2.b0.O(gestaltButtonSocial6, r2.f139977u);
                final int i18 = 6;
                gestaltButtonSocial6.s(new gm1.a(this) { // from class: yq1.n2

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ s2 f139925b;

                    {
                        this.f139925b = this;
                    }

                    @Override // gm1.a
                    public final void h3(gm1.c it) {
                        int i152 = i18;
                        s2 this$0 = this.f139925b;
                        switch (i152) {
                            case 0:
                                int i162 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 1:
                                int i172 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 2:
                                int i182 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 3:
                                int i19 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 4:
                                int i23 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 5:
                                int i24 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 6:
                                int i25 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 7:
                                int i26 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 8:
                                int i27 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 9:
                                int i28 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            default:
                                int i29 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                        }
                    }
                });
            } else {
                kh2.b0.O(gestaltButtonSocial6, r2.f139978v);
            }
        } else {
            GestaltButton gestaltButton2 = this.f140003q0;
            if (gestaltButton2 == null) {
                Intrinsics.r("facebookBt");
                throw null;
            }
            bs1.c.s(gestaltButton2, r2.f139979w);
            GestaltButton gestaltButton3 = this.f140004r0;
            if (gestaltButton3 == null) {
                Intrinsics.r("gplusBt");
                throw null;
            }
            bs1.c.s(gestaltButton3, r2.f139980x);
            if (a8().f()) {
                GestaltButton gestaltButton4 = this.f140003q0;
                if (gestaltButton4 == null) {
                    Intrinsics.r("facebookBt");
                    throw null;
                }
                bs1.c.s(gestaltButton4, r2.f139969m);
            } else {
                GestaltButton gestaltButton5 = this.f140003q0;
                if (gestaltButton5 == null) {
                    Intrinsics.r("facebookBt");
                    throw null;
                }
                bs1.c.s(gestaltButton5, r2.f139970n);
                final int i19 = 7;
                gestaltButton5.e(new gm1.a(this) { // from class: yq1.n2

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ s2 f139925b;

                    {
                        this.f139925b = this;
                    }

                    @Override // gm1.a
                    public final void h3(gm1.c it) {
                        int i152 = i19;
                        s2 this$0 = this.f139925b;
                        switch (i152) {
                            case 0:
                                int i162 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 1:
                                int i172 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 2:
                                int i182 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 3:
                                int i192 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 4:
                                int i23 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 5:
                                int i24 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 6:
                                int i25 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 7:
                                int i26 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 8:
                                int i27 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 9:
                                int i28 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            default:
                                int i29 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                        }
                    }
                });
            }
            GestaltButton gestaltButton6 = this.f140004r0;
            if (gestaltButton6 == null) {
                Intrinsics.r("gplusBt");
                throw null;
            }
            bs1.c.s(gestaltButton6, new q2(this, i16));
            final int i23 = 8;
            gestaltButton6.e(new gm1.a(this) { // from class: yq1.n2

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s2 f139925b;

                {
                    this.f139925b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i152 = i23;
                    s2 this$0 = this.f139925b;
                    switch (i152) {
                        case 0:
                            int i162 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 1:
                            int i172 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 2:
                            int i182 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 3:
                            int i192 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 4:
                            int i232 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 5:
                            int i24 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 6:
                            int i25 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 7:
                            int i26 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 8:
                            int i27 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 9:
                            int i28 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        default:
                            int i29 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                    }
                }
            });
            GestaltButton gestaltButton7 = this.f140005s0;
            if (gestaltButton7 == null) {
                Intrinsics.r("lineBt");
                throw null;
            }
            if (a8().c()) {
                bs1.c.s(gestaltButton7, r2.f139971o);
                final int i24 = 9;
                gestaltButton7.e(new gm1.a(this) { // from class: yq1.n2

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ s2 f139925b;

                    {
                        this.f139925b = this;
                    }

                    @Override // gm1.a
                    public final void h3(gm1.c it) {
                        int i152 = i24;
                        s2 this$0 = this.f139925b;
                        switch (i152) {
                            case 0:
                                int i162 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 1:
                                int i172 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 2:
                                int i182 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 3:
                                int i192 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 4:
                                int i232 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 5:
                                int i242 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 6:
                                int i25 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 7:
                                int i26 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 8:
                                int i27 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            case 9:
                                int i28 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                            default:
                                int i29 = s2.f139988y0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.b8(it);
                                break;
                        }
                    }
                });
            } else {
                bs1.c.s(gestaltButton7, r2.f139972p);
            }
        }
        GestaltButton gestaltButton8 = (GestaltButton) v13.findViewById(vq1.b.line);
        if (a8().c()) {
            final int i25 = 10;
            gestaltButton8.d(r2.f139973q).e(new gm1.a(this) { // from class: yq1.n2

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s2 f139925b;

                {
                    this.f139925b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i152 = i25;
                    s2 this$0 = this.f139925b;
                    switch (i152) {
                        case 0:
                            int i162 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 1:
                            int i172 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 2:
                            int i182 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 3:
                            int i192 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 4:
                            int i232 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 5:
                            int i242 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 6:
                            int i252 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 7:
                            int i26 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 8:
                            int i27 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        case 9:
                            int i28 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                        default:
                            int i29 = s2.f139988y0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.b8(it);
                            break;
                    }
                }
            });
        } else {
            Intrinsics.f(gestaltButton8);
            pk.a0.l0(gestaltButton8);
        }
        GestaltText gestaltText = this.f140002p0;
        if (gestaltText == null) {
            Intrinsics.r("forgotPasswordText");
            throw null;
        }
        final int i26 = 1;
        gestaltText.j(new gm1.a(this) { // from class: yq1.n2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s2 f139925b;

            {
                this.f139925b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i26;
                s2 this$0 = this.f139925b;
                switch (i152) {
                    case 0:
                        int i162 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 1:
                        int i172 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 2:
                        int i182 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 3:
                        int i192 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 4:
                        int i232 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 5:
                        int i242 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 6:
                        int i252 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 7:
                        int i262 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 8:
                        int i27 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    case 9:
                        int i28 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                    default:
                        int i29 = s2.f139988y0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.b8(it);
                        break;
                }
            }
        });
        GestaltText gestaltText2 = this.f139999m0;
        if (gestaltText2 != null) {
            gestaltText2.i(r2.f139974r);
        } else {
            Intrinsics.r("facebookErrorMessage");
            throw null;
        }
    }
}
