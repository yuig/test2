package zz1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.p1;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.identity.password.StrongPasswordTextField;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.u0;
import kh2.j1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.w2;
import lh0.z0;
import lh0.z3;
import nx.d1;
import nx.f0;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzz1/p;", "Lnl1/d;", "", "<init>", "()V", "recoveryV2p_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class p extends nl1.d implements af2.c {

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f143223r0 = 0;
    public ye2.m X;
    public boolean Y;
    public volatile ye2.h Z;

    /* renamed from: a0, reason: collision with root package name */
    public final Object f143224a0 = new Object();

    /* renamed from: b0, reason: collision with root package name */
    public boolean f143225b0 = false;

    /* renamed from: c0, reason: collision with root package name */
    public GestaltTextField f143226c0;

    /* renamed from: d0, reason: collision with root package name */
    public GestaltTextField f143227d0;

    /* renamed from: e0, reason: collision with root package name */
    public GestaltIconButton f143228e0;

    /* renamed from: f0, reason: collision with root package name */
    public GestaltButton f143229f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltText f143230g0;

    /* renamed from: h0, reason: collision with root package name */
    public StrongPasswordTextField f143231h0;

    /* renamed from: i0, reason: collision with root package name */
    public String f143232i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f143233j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f143234k0;

    /* renamed from: l0, reason: collision with root package name */
    public i92.k f143235l0;

    /* renamed from: m0, reason: collision with root package name */
    public vy.m f143236m0;

    /* renamed from: n0, reason: collision with root package name */
    public cr1.a f143237n0;

    /* renamed from: o0, reason: collision with root package name */
    public rr1.g f143238o0;

    /* renamed from: p0, reason: collision with root package name */
    public w2 f143239p0;

    /* renamed from: q0, reason: collision with root package name */
    public Function1 f143240q0;

    public final void V7(String str, String str2) {
        cr1.a aVar = this.f143237n0;
        if (aVar != null) {
            new kk2.h(new kk2.g(aVar.s(null, str, str2, null, null).r(tk2.e.f118017c).l(wj2.c.a()), new yx1.l(11, new n(this, 0)), 2), new g51.h(this, 20), 1).o(new yx1.l(12, new n(this, 1)), new yx1.l(13, new n(this, 2)));
        } else {
            Intrinsics.r("accountService");
            throw null;
        }
    }

    @Override // af2.c
    /* renamed from: W7, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.Z == null) {
            synchronized (this.f143224a0) {
                try {
                    if (this.Z == null) {
                        this.Z = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.Z;
    }

    public final void X7(gm1.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int j13 = event.j();
        if (j13 != yz1.a.gestalt_continue_button) {
            if (j13 != yz1.a.ic_return) {
                if (j13 == yz1.a.password_confirm_field) {
                    if (event instanceof xn1.a) {
                        Y7(String.valueOf(((xn1.a) event).f135436c));
                        return;
                    }
                    return;
                } else {
                    if (j13 == yz1.a.password_field && (event instanceof xn1.a)) {
                        Y7(String.valueOf(((xn1.a) event).f135436c));
                        return;
                    }
                    return;
                }
            }
            if (event instanceof om1.l) {
                vy.m mVar = this.f143236m0;
                if (mVar == null) {
                    Intrinsics.r("analyticsApi");
                    throw null;
                }
                mVar.a("recovery_v2_fb_back_recovery_password");
                s7().h0((r18 & 1) != 0 ? f1.TAP : f1.AUTH_COLLECTION_CLICK, (r18 & 2) != 0 ? null : u0.BACK_BUTTON, (r18 & 4) != 0 ? null : g0.CREATE_PASSWORD_MODAL, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                Function1 function1 = this.f143240q0;
                if (function1 != null) {
                    function1.invoke(new b02.i(this.f143233j0));
                    return;
                }
                return;
            }
            return;
        }
        if (event instanceof xl1.a) {
            GestaltTextField gestaltTextField = this.f143226c0;
            if (gestaltTextField == null) {
                Intrinsics.r("passwordField");
                throw null;
            }
            String B0 = gestaltTextField.B0();
            GestaltTextField gestaltTextField2 = this.f143227d0;
            if (gestaltTextField2 == null) {
                Intrinsics.r("passwordFieldConfirm");
                throw null;
            }
            String B02 = gestaltTextField2.B0();
            s7().h0((r18 & 1) != 0 ? f1.TAP : f1.AUTH_COLLECTION_CLICK, (r18 & 2) != 0 ? null : u0.UPDATE_BUTTON, (r18 & 4) != 0 ? null : g0.CREATE_PASSWORD_MODAL, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            int i13 = 10;
            if (!Intrinsics.d(B0, B02)) {
                GestaltTextField gestaltTextField3 = this.f143227d0;
                if (gestaltTextField3 != null) {
                    gestaltTextField3.X(new pn1.g(yz1.c.gbl_password_not_match, i13));
                    return;
                } else {
                    Intrinsics.r("passwordFieldConfirm");
                    throw null;
                }
            }
            rr1.g gVar = this.f143238o0;
            if (gVar == null) {
                Intrinsics.r("passwordValidationUtils");
                throw null;
            }
            if (gVar.c(B0, false)) {
                V7(B0, B02);
                return;
            }
            GestaltTextField gestaltTextField4 = this.f143227d0;
            if (gestaltTextField4 != null) {
                gestaltTextField4.X(new pn1.g(yz1.c.your_password_too_short, i13));
            } else {
                Intrinsics.r("passwordFieldConfirm");
                throw null;
            }
        }
    }

    public final void Y7(String str) {
        GestaltTextField gestaltTextField = this.f143227d0;
        if (gestaltTextField == null) {
            Intrinsics.r("passwordFieldConfirm");
            throw null;
        }
        String B0 = gestaltTextField.B0();
        boolean z13 = false;
        if (str.length() > 0 && B0.length() > 0) {
            rr1.g gVar = this.f143238o0;
            if (gVar == null) {
                Intrinsics.r("passwordValidationUtils");
                throw null;
            }
            if (gVar.c(str, false)) {
                z13 = true;
            }
        }
        b8(z13);
    }

    public final void Z7() {
        if (this.X == null) {
            this.X = new ye2.m(super.getContext(), this);
            this.Y = ue.c.x(super.getContext());
        }
    }

    public final void a8() {
        if (this.f143225b0) {
            return;
        }
        this.f143225b0 = true;
        x8 x8Var = (x8) ((q) generatedComponent());
        oa oaVar = x8Var.f114707a;
        this.f91283h = oaVar.Ec;
        this.f91284i = (x2) oaVar.f113800m3.get();
        this.f91285j = (f0) oaVar.f113747j2.get();
        this.f91286k = r70.b.f106349i.k0();
        this.f91287l = (hs1.q) oaVar.f113875q7.get();
        this.f91288m = (bz.i) oaVar.C9.get();
        this.f91289n = (lu1.d) oaVar.f113782l2.get();
        this.f91290o = (ac2.m) oaVar.C7.get();
        this.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        this.f91292q = (ku1.a) s8Var.f114402n.get();
        this.f91293r = s8Var.u6();
        this.f91294s = (ff0.f) s8Var.f114417o.get();
        this.f91295t = oaVar.T2();
        this.f91296u = (d1) oaVar.f113730i2.get();
        this.f91297v = (b60.b) oaVar.f113850p0.get();
        this.f91298w = (m60.w) oaVar.f113885r0.get();
        this.f91299x = (tb0.h) oaVar.f113797m0.get();
        this.f91300y = (uj2.q) oaVar.f113947u9.get();
        this.f91301z = (a80.a) oaVar.Wc.get();
        this.A = (z70.f) oaVar.f113764k2.get();
        this.f143235l0 = (i92.k) oaVar.f113921t1.get();
        this.f143236m0 = (vy.m) oaVar.M1.get();
        this.f143237n0 = (cr1.a) oaVar.A2.get();
        this.f143238o0 = (rr1.g) s8Var.f114321h6.get();
        this.f143239p0 = new w2((z0) x8Var.f114707a.D0.get());
    }

    public final void b8(boolean z13) {
        GestaltButton gestaltButton = this.f143229f0;
        if (gestaltButton != null) {
            gestaltButton.d(new fx1.d(z13, 9));
        } else {
            Intrinsics.r("doneBtn");
            throw null;
        }
    }

    public final void c8(a02.c eventFlow) {
        Intrinsics.checkNotNullParameter(eventFlow, "eventFlow");
        this.f143240q0 = eventFlow;
    }

    public final void d8(boolean z13) {
        this.f143234k0 = z13;
    }

    public final void e8(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f143232i0 = email;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.Y) {
            return null;
        }
        Z7();
        return this.X;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF49928r0() {
        return d4.UNKNOWN_VIEW;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Z7();
        a8();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.E = yz1.b.create_password_layout;
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(yz1.a.password_field);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f143226c0 = (GestaltTextField) findViewById;
        View findViewById2 = view.findViewById(yz1.a.password_confirm_field);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f143227d0 = (GestaltTextField) findViewById2;
        View findViewById3 = view.findViewById(yz1.a.ic_return);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f143228e0 = (GestaltIconButton) findViewById3;
        View findViewById4 = view.findViewById(yz1.a.gestalt_continue_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f143229f0 = (GestaltButton) findViewById4;
        View findViewById5 = view.findViewById(yz1.a.txtEnterPassword);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f143230g0 = (GestaltText) findViewById5;
        View findViewById6 = view.findViewById(yz1.a.strong_password_field);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f143231h0 = (StrongPasswordTextField) findViewById6;
        GestaltIconButton gestaltIconButton = this.f143228e0;
        if (gestaltIconButton == null) {
            Intrinsics.r("returnBtn");
            throw null;
        }
        int i13 = 3;
        gestaltIconButton.u(new o(this, 3));
        GestaltButton gestaltButton = this.f143229f0;
        if (gestaltButton == null) {
            Intrinsics.r("doneBtn");
            throw null;
        }
        gestaltButton.e(new o(this, 2));
        GestaltTextField gestaltTextField = this.f143226c0;
        if (gestaltTextField == null) {
            Intrinsics.r("passwordField");
            throw null;
        }
        gestaltTextField.Z(new o(this, 0));
        GestaltTextField gestaltTextField2 = this.f143227d0;
        if (gestaltTextField2 == null) {
            Intrinsics.r("passwordFieldConfirm");
            throw null;
        }
        gestaltTextField2.Z(new o(this, 1));
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        GestaltText gestaltText = this.f143230g0;
        if (gestaltText == null) {
            Intrinsics.r("txtInstructions");
            throw null;
        }
        String string = getString(yz1.c.gbl_enter_password_for_v2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = this.f143232i0;
        if (str == null) {
            str = "";
        }
        f0.h.n(requireActivity, gestaltText, string, str);
        w2 w2Var = this.f143239p0;
        if (w2Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) w2Var.f83497a;
        if (g1Var.o("android_strong_password", "enabled", z3Var) || g1Var.l("android_strong_password")) {
            GestaltTextField gestaltTextField3 = this.f143226c0;
            if (gestaltTextField3 == null) {
                Intrinsics.r("passwordField");
                throw null;
            }
            gestaltTextField3.X(k.f143203k);
            GestaltTextField gestaltTextField4 = this.f143227d0;
            if (gestaltTextField4 == null) {
                Intrinsics.r("passwordFieldConfirm");
                throw null;
            }
            gestaltTextField4.X(k.f143204l);
            StrongPasswordTextField strongPasswordTextField = this.f143231h0;
            if (strongPasswordTextField == null) {
                Intrinsics.r("strongPasswordField");
                throw null;
            }
            strongPasswordTextField.setVisibility(0);
            GestaltButton gestaltButton2 = this.f143229f0;
            if (gestaltButton2 == null) {
                Intrinsics.r("doneBtn");
                throw null;
            }
            pk.a0.m(gestaltButton2, new n(this, i13));
            StrongPasswordTextField strongPasswordTextField2 = this.f143231h0;
            if (strongPasswordTextField2 == null) {
                Intrinsics.r("strongPasswordField");
                throw null;
            }
            yq1.d1 handler = new yq1.d1(this, 4);
            Intrinsics.checkNotNullParameter(handler, "handler");
            strongPasswordTextField2.f49850g = handler;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.X;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Z7();
        a8();
    }
}
