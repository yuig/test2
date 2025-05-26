package yq1;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.h9;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyq1/u0;", "Lnl1/d;", "<init>", "()V", "org/chromium/net/y", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class u0 extends f0 {

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ int f140032o0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public vy.m f140033c0;

    /* renamed from: d0, reason: collision with root package name */
    public lb2.q f140034d0;

    /* renamed from: e0, reason: collision with root package name */
    public com.pinterest.identity.authentication.a f140035e0;

    /* renamed from: f0, reason: collision with root package name */
    public mr1.a f140036f0;

    /* renamed from: g0, reason: collision with root package name */
    public lb2.d f140037g0;

    /* renamed from: h0, reason: collision with root package name */
    public h9 f140038h0;

    /* renamed from: i0, reason: collision with root package name */
    public GestaltText f140039i0;

    /* renamed from: j0, reason: collision with root package name */
    public GestaltTextField f140040j0;

    /* renamed from: k0, reason: collision with root package name */
    public GestaltButton f140041k0;

    /* renamed from: l0, reason: collision with root package name */
    public GestaltText f140042l0;

    /* renamed from: m0, reason: collision with root package name */
    public String f140043m0;

    /* renamed from: n0, reason: collision with root package name */
    public final d4 f140044n0 = d4.LOGIN;

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        rm1.q qVar = rm1.q.ARROW_BACK;
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        Context context = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int drawableRes = qVar.drawableRes(context, dl2.b.f1(context2));
        gestaltToolbarImpl.Y(vq1.d.login);
        gestaltToolbarImpl.I();
        Drawable g03 = bs1.c.g0(this, drawableRes, Integer.valueOf(m60.r0.default_pds_icon_size), 2);
        String string = getString(m60.x0.back);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        gestaltToolbarImpl.T(g03, string);
        gestaltToolbarImpl.m();
    }

    public final void Y7(kk2.g gVar) {
        xj2.c o13 = new kk2.g(gVar, new tp1.c(26, new t0(this, 0)), 2).o(new tp1.c(27, new t0(this, 1)), new tp1.c(28, new t0(this, 2)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        R6(o13);
    }

    public final lb2.q Z7() {
        lb2.q qVar = this.f140034d0;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.r("authManager");
        throw null;
    }

    public final void a8() {
        GestaltTextField gestaltTextField = this.f140040j0;
        if (gestaltTextField == null) {
            Intrinsics.r("passwordEditText");
            throw null;
        }
        String B0 = gestaltTextField.B0();
        hf0.b.l(requireActivity());
        if (kotlin.text.z.j(B0)) {
            GestaltTextField gestaltTextField2 = this.f140040j0;
            if (gestaltTextField2 == null) {
                Intrinsics.r("passwordEditText");
                throw null;
            }
            gestaltTextField2.X(new t0(this, 3));
            GestaltTextField gestaltTextField3 = this.f140040j0;
            if (gestaltTextField3 != null) {
                gestaltTextField3.g0();
                return;
            } else {
                Intrinsics.r("passwordEditText");
                throw null;
            }
        }
        vy.m mVar = this.f140033c0;
        if (mVar == null) {
            Intrinsics.r("analyticsApi");
            throw null;
        }
        mVar.a("signup_login");
        lb2.q Z7 = Z7();
        String str = this.f140043m0;
        if (str == null) {
            Intrinsics.r("email");
            throw null;
        }
        h9 h9Var = this.f140038h0;
        if (h9Var == null) {
            Intrinsics.r("pinterestLoginFactory");
            throw null;
        }
        pr1.h a13 = h9Var.a(str, B0);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        Y7(Z7.c(a13, bs1.c.m(requireActivity)));
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF0() {
        return this.f140044n0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        Z7().d(i13, i14, intent);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = vq1.c.fragment_login_with_existing_email;
        this.f140043m0 = com.bumptech.glide.d.X(this, "EXTRA_EMAIL");
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(vq1.b.log_in_with_existing_email_copy);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f140039i0 = (GestaltText) findViewById;
        View findViewById2 = v13.findViewById(vq1.b.password);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f140040j0 = (GestaltTextField) findViewById2;
        View findViewById3 = v13.findViewById(vq1.b.continue_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f140041k0 = (GestaltButton) findViewById3;
        View findViewById4 = v13.findViewById(vq1.b.gplus);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f140042l0 = (GestaltText) findViewById4;
        View findViewById5 = v13.findViewById(vq1.b.f126439or);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        GestaltText gestaltText = this.f140039i0;
        if (gestaltText == null) {
            Intrinsics.r("copyTextView");
            throw null;
        }
        Resources resources = getResources();
        int i13 = vq1.d.log_in_with_existing_email;
        final int i14 = 1;
        Object[] objArr = new Object[1];
        String str = this.f140043m0;
        if (str == null) {
            Intrinsics.r("email");
            throw null;
        }
        final int i15 = 0;
        objArr[0] = str;
        CharSequence a03 = df.j1.a0(resources.getString(i13, objArr));
        Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
        pk.a0.q(gestaltText, bs1.c.p2(a03));
        GestaltTextField gestaltTextField = this.f140040j0;
        if (gestaltTextField == null) {
            Intrinsics.r("passwordEditText");
            throw null;
        }
        gestaltTextField.Z(new gm1.a(this) { // from class: yq1.r0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f139965b;

            {
                this.f139965b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                xn1.g gVar;
                KeyEvent keyEvent;
                Editable editable;
                int i16 = i15;
                u0 this$0 = this.f139965b;
                switch (i16) {
                    case 0:
                        int i17 = u0.f140032o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof xn1.a) && (editable = ((xn1.a) it).f135436c) != null && editable.length() > 0) {
                            GestaltButton gestaltButton = this$0.f140041k0;
                            if (gestaltButton == null) {
                                Intrinsics.r("continueButton");
                                throw null;
                            }
                            gestaltButton.d(c.f139816x);
                        }
                        if ((it instanceof xn1.g) && (keyEvent = (gVar = (xn1.g) it).f135451d) != null && keyEvent.getAction() == 0 && gVar.f135450c == 66) {
                            this$0.a8();
                            return;
                        }
                        return;
                    case 1:
                        int i18 = u0.f140032o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a8();
                        return;
                    case 2:
                        int i19 = u0.f140032o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        lb2.q Z7 = this$0.Z7();
                        lr1.h hVar = lr1.h.GoogleUnifiedAuthMethod;
                        FragmentActivity requireActivity = this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        this$0.Y7(Z7.b(hVar, bs1.c.m(requireActivity), null));
                        return;
                    default:
                        int i23 = u0.f140032o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s7().X(h32.u0.RESET_BUTTON);
                        hf0.b.l(this$0.requireActivity());
                        lb2.d dVar = this$0.f140037g0;
                        if (dVar == null) {
                            Intrinsics.r("accountManager");
                            throw null;
                        }
                        Context requireContext = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        String str2 = this$0.f140043m0;
                        if (str2 != null) {
                            lb2.d.b(dVar, requireContext, str2, false, 4);
                            return;
                        } else {
                            Intrinsics.r("email");
                            throw null;
                        }
                }
            }
        });
        GestaltButton gestaltButton = this.f140041k0;
        if (gestaltButton == null) {
            Intrinsics.r("continueButton");
            throw null;
        }
        gestaltButton.d(c.f139817y).e(new gm1.a(this) { // from class: yq1.r0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f139965b;

            {
                this.f139965b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                xn1.g gVar;
                KeyEvent keyEvent;
                Editable editable;
                int i16 = i14;
                u0 this$0 = this.f139965b;
                switch (i16) {
                    case 0:
                        int i17 = u0.f140032o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof xn1.a) && (editable = ((xn1.a) it).f135436c) != null && editable.length() > 0) {
                            GestaltButton gestaltButton2 = this$0.f140041k0;
                            if (gestaltButton2 == null) {
                                Intrinsics.r("continueButton");
                                throw null;
                            }
                            gestaltButton2.d(c.f139816x);
                        }
                        if ((it instanceof xn1.g) && (keyEvent = (gVar = (xn1.g) it).f135451d) != null && keyEvent.getAction() == 0 && gVar.f135450c == 66) {
                            this$0.a8();
                            return;
                        }
                        return;
                    case 1:
                        int i18 = u0.f140032o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a8();
                        return;
                    case 2:
                        int i19 = u0.f140032o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        lb2.q Z7 = this$0.Z7();
                        lr1.h hVar = lr1.h.GoogleUnifiedAuthMethod;
                        FragmentActivity requireActivity = this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        this$0.Y7(Z7.b(hVar, bs1.c.m(requireActivity), null));
                        return;
                    default:
                        int i23 = u0.f140032o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s7().X(h32.u0.RESET_BUTTON);
                        hf0.b.l(this$0.requireActivity());
                        lb2.d dVar = this$0.f140037g0;
                        if (dVar == null) {
                            Intrinsics.r("accountManager");
                            throw null;
                        }
                        Context requireContext = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        String str2 = this$0.f140043m0;
                        if (str2 != null) {
                            lb2.d.b(dVar, requireContext, str2, false, 4);
                            return;
                        } else {
                            Intrinsics.r("email");
                            throw null;
                        }
                }
            }
        });
        GestaltText gestaltText2 = this.f140042l0;
        if (gestaltText2 == null) {
            Intrinsics.r("gplusButton");
            throw null;
        }
        final int i16 = 2;
        gestaltText2.j(new gm1.a(this) { // from class: yq1.r0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f139965b;

            {
                this.f139965b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                xn1.g gVar;
                KeyEvent keyEvent;
                Editable editable;
                int i162 = i16;
                u0 this$0 = this.f139965b;
                switch (i162) {
                    case 0:
                        int i17 = u0.f140032o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof xn1.a) && (editable = ((xn1.a) it).f135436c) != null && editable.length() > 0) {
                            GestaltButton gestaltButton2 = this$0.f140041k0;
                            if (gestaltButton2 == null) {
                                Intrinsics.r("continueButton");
                                throw null;
                            }
                            gestaltButton2.d(c.f139816x);
                        }
                        if ((it instanceof xn1.g) && (keyEvent = (gVar = (xn1.g) it).f135451d) != null && keyEvent.getAction() == 0 && gVar.f135450c == 66) {
                            this$0.a8();
                            return;
                        }
                        return;
                    case 1:
                        int i18 = u0.f140032o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a8();
                        return;
                    case 2:
                        int i19 = u0.f140032o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        lb2.q Z7 = this$0.Z7();
                        lr1.h hVar = lr1.h.GoogleUnifiedAuthMethod;
                        FragmentActivity requireActivity = this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        this$0.Y7(Z7.b(hVar, bs1.c.m(requireActivity), null));
                        return;
                    default:
                        int i23 = u0.f140032o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s7().X(h32.u0.RESET_BUTTON);
                        hf0.b.l(this$0.requireActivity());
                        lb2.d dVar = this$0.f140037g0;
                        if (dVar == null) {
                            Intrinsics.r("accountManager");
                            throw null;
                        }
                        Context requireContext = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        String str2 = this$0.f140043m0;
                        if (str2 != null) {
                            lb2.d.b(dVar, requireContext, str2, false, 4);
                            return;
                        } else {
                            Intrinsics.r("email");
                            throw null;
                        }
                }
            }
        });
        final int i17 = 3;
        ((GestaltText) v13.findViewById(vq1.b.forgot_password)).j(new gm1.a(this) { // from class: yq1.r0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f139965b;

            {
                this.f139965b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                xn1.g gVar;
                KeyEvent keyEvent;
                Editable editable;
                int i162 = i17;
                u0 this$0 = this.f139965b;
                switch (i162) {
                    case 0:
                        int i172 = u0.f140032o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof xn1.a) && (editable = ((xn1.a) it).f135436c) != null && editable.length() > 0) {
                            GestaltButton gestaltButton2 = this$0.f140041k0;
                            if (gestaltButton2 == null) {
                                Intrinsics.r("continueButton");
                                throw null;
                            }
                            gestaltButton2.d(c.f139816x);
                        }
                        if ((it instanceof xn1.g) && (keyEvent = (gVar = (xn1.g) it).f135451d) != null && keyEvent.getAction() == 0 && gVar.f135450c == 66) {
                            this$0.a8();
                            return;
                        }
                        return;
                    case 1:
                        int i18 = u0.f140032o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.a8();
                        return;
                    case 2:
                        int i19 = u0.f140032o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        lb2.q Z7 = this$0.Z7();
                        lr1.h hVar = lr1.h.GoogleUnifiedAuthMethod;
                        FragmentActivity requireActivity = this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        this$0.Y7(Z7.b(hVar, bs1.c.m(requireActivity), null));
                        return;
                    default:
                        int i23 = u0.f140032o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s7().X(h32.u0.RESET_BUTTON);
                        hf0.b.l(this$0.requireActivity());
                        lb2.d dVar = this$0.f140037g0;
                        if (dVar == null) {
                            Intrinsics.r("accountManager");
                            throw null;
                        }
                        Context requireContext = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        String str2 = this$0.f140043m0;
                        if (str2 != null) {
                            lb2.d.b(dVar, requireContext, str2, false, 4);
                            return;
                        } else {
                            Intrinsics.r("email");
                            throw null;
                        }
                }
            }
        });
    }
}
