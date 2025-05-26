package yq1;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.identity.password.StrongPasswordTextField;
import h32.d4;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;
import okhttp3.internal.Util;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lyq1/u;", "Lyk1/k;", "Lzq1/q;", "<init>", "()V", "org/chromium/net/y", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class u extends d0 implements zq1.q {
    public static final /* synthetic */ int F0 = 0;
    public zq1.p A0;
    public final d4 B0 = d4.LOGIN;
    public GestaltButton C0;
    public GestaltText D0;
    public GestaltText E0;

    /* renamed from: j0, reason: collision with root package name */
    public i92.k f140015j0;

    /* renamed from: k0, reason: collision with root package name */
    public lb2.q f140016k0;

    /* renamed from: l0, reason: collision with root package name */
    public com.pinterest.identity.authentication.a f140017l0;

    /* renamed from: m0, reason: collision with root package name */
    public uk1.e f140018m0;

    /* renamed from: n0, reason: collision with root package name */
    public cr1.a f140019n0;

    /* renamed from: o0, reason: collision with root package name */
    public mr1.a f140020o0;

    /* renamed from: p0, reason: collision with root package name */
    public lh0.y1 f140021p0;

    /* renamed from: q0, reason: collision with root package name */
    public tb.l f140022q0;

    /* renamed from: r0, reason: collision with root package name */
    public or1.i f140023r0;

    /* renamed from: s0, reason: collision with root package name */
    public ox.b f140024s0;

    /* renamed from: t0, reason: collision with root package name */
    public rr1.g f140025t0;

    /* renamed from: u0, reason: collision with root package name */
    public GestaltButton f140026u0;

    /* renamed from: v0, reason: collision with root package name */
    public GestaltTextField f140027v0;

    /* renamed from: w0, reason: collision with root package name */
    public GestaltTextField f140028w0;

    /* renamed from: x0, reason: collision with root package name */
    public StrongPasswordTextField f140029x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f140030y0;

    /* renamed from: z0, reason: collision with root package name */
    public Map f140031z0;

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Y(this.f140030y0 ? vq1.d.arr_recovery_account : vq1.d.pick_password);
        gestaltToolbarImpl.S(null);
        gestaltToolbarImpl.I();
        if (this.f140030y0) {
            gestaltToolbarImpl.m();
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        i92.k kVar = this.f140015j0;
        if (kVar == null) {
            Intrinsics.r("toastUtils");
            throw null;
        }
        com.pinterest.identity.authentication.a aVar = this.f140017l0;
        if (aVar == null) {
            Intrinsics.r("authNavigationHelper");
            throw null;
        }
        cr1.a aVar2 = this.f140019n0;
        if (aVar2 == null) {
            Intrinsics.r("accountService");
            throw null;
        }
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        uk1.e eVar = this.f140018m0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        uj2.q p73 = p7();
        mr1.a aVar3 = this.f140020o0;
        if (aVar3 == null) {
            Intrinsics.r("accountSwitcher");
            throw null;
        }
        lb2.q qVar = this.f140016k0;
        if (qVar == null) {
            Intrinsics.r("authManager");
            throw null;
        }
        lh0.y1 y1Var = this.f140021p0;
        if (y1Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        tb.l lVar = this.f140022q0;
        if (lVar == null) {
            Intrinsics.r("pinterestKeychain");
            throw null;
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        mr1.b m13 = bs1.c.m(requireActivity);
        b60.b activeUserManager = getActiveUserManager();
        or1.i iVar = this.f140023r0;
        if (iVar == null) {
            Intrinsics.r("authLoggingUtils");
            throw null;
        }
        ox.b bVar = this.f140024s0;
        if (bVar == null) {
            Intrinsics.r("analyticsApi");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new zq1.o(kVar, aVar, aVar2, resources, g13, p73, aVar3, qVar, y1Var, lVar, m13, activeUserManager, iVar, bVar, new r42.j(requireContext));
    }

    @Override // nl1.d, nx.i1
    public final h32.g0 b2() {
        return h32.g0.FB_RECOVER_LOGIN_FORM;
    }

    public final boolean b8() {
        GestaltTextField gestaltTextField = this.f140027v0;
        if (gestaltTextField == null) {
            Intrinsics.r("passwordEt");
            throw null;
        }
        String B0 = gestaltTextField.B0();
        if (!this.f140030y0) {
            return !kotlin.text.z.j(B0);
        }
        GestaltTextField gestaltTextField2 = this.f140028w0;
        if (gestaltTextField2 != null) {
            String B02 = gestaltTextField2.B0();
            return (kotlin.text.z.j(B0) ^ true) && (kotlin.text.z.j(B02) ^ true) && Intrinsics.d(B02, B0);
        }
        Intrinsics.r("passwordConfirmField");
        throw null;
    }

    public final void c8() {
        boolean c13;
        zq1.p pVar = this.A0;
        if (pVar != null) {
            ((zq1.o) pVar).u3();
        }
        GestaltTextField gestaltTextField = this.f140027v0;
        if (gestaltTextField == null) {
            Intrinsics.r("passwordEt");
            throw null;
        }
        String B0 = gestaltTextField.B0();
        if (kotlin.text.z.j(B0)) {
            GestaltTextField gestaltTextField2 = this.f140027v0;
            if (gestaltTextField2 != null) {
                gestaltTextField2.X(new t(this, 2));
                return;
            } else {
                Intrinsics.r("passwordEt");
                throw null;
            }
        }
        rr1.g gVar = this.f140025t0;
        if (gVar == null) {
            Intrinsics.r("passwordValidationUtils");
            throw null;
        }
        c13 = gVar.c(B0, false);
        if (!c13) {
            GestaltTextField gestaltTextField3 = this.f140027v0;
            if (gestaltTextField3 != null) {
                gestaltTextField3.X(new t(this, 3));
                return;
            } else {
                Intrinsics.r("passwordEt");
                throw null;
            }
        }
        Map map = this.f140031z0;
        if (map == null) {
            Intrinsics.r("passwordParams");
            throw null;
        }
        LinkedHashMap destination = new LinkedHashMap();
        destination.put("new", B0);
        destination.put("new_confirm", B0);
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        destination.putAll(map);
        Map B = Util.B(destination);
        zq1.p pVar2 = this.A0;
        if (pVar2 != null) {
            ((zq1.o) pVar2).s3(B);
        }
        GestaltTextField gestaltTextField4 = this.f140027v0;
        if (gestaltTextField4 != null) {
            hf0.b.k(gestaltTextField4);
        } else {
            Intrinsics.r("passwordEt");
            throw null;
        }
    }

    public final void d8(boolean z13) {
        f7().d(z13 ? new of0.a(new mf0.l()) : new of0.a(null));
    }

    public final void e8(boolean z13) {
        GestaltButton gestaltButton = this.f140026u0;
        if (gestaltButton != null) {
            gestaltButton.d(new mm1.i(z13, 9));
        } else {
            Intrinsics.r("logInButton");
            throw null;
        }
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getB0() {
        return this.B0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lh0.y1 y1Var = this.f140021p0;
        if (y1Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) y1Var.f83514a;
        boolean z13 = g1Var.o("android_unauth_account_recovery_flow_phase1", "enabled", z3Var) || g1Var.l("android_unauth_account_recovery_flow_phase1");
        this.f140030y0 = z13;
        this.E = z13 ? vq1.c.fragment_create_new_password_phase1 : vq1.c.fragment_create_new_password;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String X = com.bumptech.glide.d.X(this, "com.pinterest.EXTRA_USERNAME");
        if (!(!kotlin.text.z.j(X))) {
            X = null;
        }
        if (X != null) {
            linkedHashMap.put("username", X);
        }
        String X2 = com.bumptech.glide.d.X(this, "com.pinterest.EXTRA_PASSWORD_EXPIRATION");
        if (!(!kotlin.text.z.j(X2))) {
            X2 = null;
        }
        if (X2 != null) {
            linkedHashMap.put("expiration", X2);
        }
        String X3 = com.bumptech.glide.d.X(this, "com.pinterest.EXTRA_PASSWORD_TOKEN");
        String str = kotlin.text.z.j(X3) ^ true ? X3 : null;
        if (str != null) {
            linkedHashMap.put("token", str);
        }
        this.f140031z0 = Util.B(linkedHashMap);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        Context requireContext = requireContext();
        int i13 = eo1.b.color_gray_500;
        Object obj = d5.a.f53679a;
        requireContext.getColor(i13);
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        dl2.b.x0(requireContext2, eo1.a.base_color_grayscale_0);
        View findViewById = v13.findViewById(vq1.b.password);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f140027v0 = (GestaltTextField) findViewById;
        View findViewById2 = v13.findViewById(vq1.b.login_bt);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById2;
        this.f140026u0 = gestaltButton;
        if (gestaltButton == null) {
            Intrinsics.r("logInButton");
            throw null;
        }
        final int i14 = 1;
        pk.a0.m(gestaltButton, new t(this, i14));
        GestaltTextField gestaltTextField = this.f140027v0;
        if (gestaltTextField == null) {
            Intrinsics.r("passwordEt");
            throw null;
        }
        final int i15 = 0;
        gestaltTextField.Z(new gm1.a(this) { // from class: yq1.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f139985b;

            {
                this.f139985b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i16 = i15;
                u this$0 = this.f139985b;
                switch (i16) {
                    case 0:
                        int i17 = u.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof xn1.i) {
                            GestaltTextField gestaltTextField2 = this$0.f140027v0;
                            if (gestaltTextField2 == null) {
                                Intrinsics.r("passwordEt");
                                throw null;
                            }
                            if (gestaltTextField2.k0().f20035f == yn1.f.ERROR) {
                                GestaltTextField gestaltTextField3 = this$0.f140027v0;
                                if (gestaltTextField3 == null) {
                                    Intrinsics.r("passwordEt");
                                    throw null;
                                }
                                gestaltTextField3.X(c.f139809q);
                            }
                        }
                        if (it instanceof xn1.a) {
                            this$0.e8(this$0.b8());
                        }
                        if ((it instanceof xn1.d) && ve.h.X((xn1.d) it, 2)) {
                            this$0.c8();
                            return;
                        }
                        return;
                    case 1:
                        int i18 = u.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof xn1.i) {
                            GestaltTextField gestaltTextField4 = this$0.f140028w0;
                            if (gestaltTextField4 == null) {
                                Intrinsics.r("passwordConfirmField");
                                throw null;
                            }
                            if (gestaltTextField4.k0().f20035f == yn1.f.ERROR) {
                                GestaltTextField gestaltTextField5 = this$0.f140028w0;
                                if (gestaltTextField5 == null) {
                                    Intrinsics.r("passwordConfirmField");
                                    throw null;
                                }
                                gestaltTextField5.X(c.f139811s);
                            }
                        }
                        if (it instanceof xn1.a) {
                            this$0.e8(this$0.b8());
                        }
                        if ((it instanceof xn1.d) && ve.h.X((xn1.d) it, 2)) {
                            this$0.c8();
                            return;
                        }
                        return;
                    default:
                        int i19 = u.F0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        zq1.p pVar = this$0.A0;
                        if (pVar != null) {
                            Map map = this$0.f140031z0;
                            if (map != null) {
                                ((zq1.o) pVar).t3(map);
                                return;
                            } else {
                                Intrinsics.r("passwordParams");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        if (this.f140030y0) {
            View findViewById3 = v13.findViewById(vq1.b.retype_password);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
            GestaltTextField gestaltTextField2 = (GestaltTextField) findViewById3;
            this.f140028w0 = gestaltTextField2;
            if (gestaltTextField2 == null) {
                Intrinsics.r("passwordConfirmField");
                throw null;
            }
            gestaltTextField2.Z(new gm1.a(this) { // from class: yq1.s

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u f139985b;

                {
                    this.f139985b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i16 = i14;
                    u this$0 = this.f139985b;
                    switch (i16) {
                        case 0:
                            int i17 = u.F0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof xn1.i) {
                                GestaltTextField gestaltTextField22 = this$0.f140027v0;
                                if (gestaltTextField22 == null) {
                                    Intrinsics.r("passwordEt");
                                    throw null;
                                }
                                if (gestaltTextField22.k0().f20035f == yn1.f.ERROR) {
                                    GestaltTextField gestaltTextField3 = this$0.f140027v0;
                                    if (gestaltTextField3 == null) {
                                        Intrinsics.r("passwordEt");
                                        throw null;
                                    }
                                    gestaltTextField3.X(c.f139809q);
                                }
                            }
                            if (it instanceof xn1.a) {
                                this$0.e8(this$0.b8());
                            }
                            if ((it instanceof xn1.d) && ve.h.X((xn1.d) it, 2)) {
                                this$0.c8();
                                return;
                            }
                            return;
                        case 1:
                            int i18 = u.F0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof xn1.i) {
                                GestaltTextField gestaltTextField4 = this$0.f140028w0;
                                if (gestaltTextField4 == null) {
                                    Intrinsics.r("passwordConfirmField");
                                    throw null;
                                }
                                if (gestaltTextField4.k0().f20035f == yn1.f.ERROR) {
                                    GestaltTextField gestaltTextField5 = this$0.f140028w0;
                                    if (gestaltTextField5 == null) {
                                        Intrinsics.r("passwordConfirmField");
                                        throw null;
                                    }
                                    gestaltTextField5.X(c.f139811s);
                                }
                            }
                            if (it instanceof xn1.a) {
                                this$0.e8(this$0.b8());
                            }
                            if ((it instanceof xn1.d) && ve.h.X((xn1.d) it, 2)) {
                                this$0.c8();
                                return;
                            }
                            return;
                        default:
                            int i19 = u.F0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            zq1.p pVar = this$0.A0;
                            if (pVar != null) {
                                Map map = this$0.f140031z0;
                                if (map != null) {
                                    ((zq1.o) pVar).t3(map);
                                    return;
                                } else {
                                    Intrinsics.r("passwordParams");
                                    throw null;
                                }
                            }
                            return;
                    }
                }
            });
            View findViewById4 = v13.findViewById(vq1.b.account_resilience_upsell_text);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
            this.D0 = (GestaltText) findViewById4;
            View findViewById5 = v13.findViewById(vq1.b.or_text);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
            this.E0 = (GestaltText) findViewById5;
            View findViewById6 = v13.findViewById(vq1.b.first_option_button);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
            GestaltButton gestaltButton2 = (GestaltButton) findViewById6;
            this.C0 = gestaltButton2;
            if (gestaltButton2 == null) {
                Intrinsics.r("googleLinkButton");
                throw null;
            }
            final int i16 = 2;
            gestaltButton2.e(new gm1.a(this) { // from class: yq1.s

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u f139985b;

                {
                    this.f139985b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i162 = i16;
                    u this$0 = this.f139985b;
                    switch (i162) {
                        case 0:
                            int i17 = u.F0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof xn1.i) {
                                GestaltTextField gestaltTextField22 = this$0.f140027v0;
                                if (gestaltTextField22 == null) {
                                    Intrinsics.r("passwordEt");
                                    throw null;
                                }
                                if (gestaltTextField22.k0().f20035f == yn1.f.ERROR) {
                                    GestaltTextField gestaltTextField3 = this$0.f140027v0;
                                    if (gestaltTextField3 == null) {
                                        Intrinsics.r("passwordEt");
                                        throw null;
                                    }
                                    gestaltTextField3.X(c.f139809q);
                                }
                            }
                            if (it instanceof xn1.a) {
                                this$0.e8(this$0.b8());
                            }
                            if ((it instanceof xn1.d) && ve.h.X((xn1.d) it, 2)) {
                                this$0.c8();
                                return;
                            }
                            return;
                        case 1:
                            int i18 = u.F0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof xn1.i) {
                                GestaltTextField gestaltTextField4 = this$0.f140028w0;
                                if (gestaltTextField4 == null) {
                                    Intrinsics.r("passwordConfirmField");
                                    throw null;
                                }
                                if (gestaltTextField4.k0().f20035f == yn1.f.ERROR) {
                                    GestaltTextField gestaltTextField5 = this$0.f140028w0;
                                    if (gestaltTextField5 == null) {
                                        Intrinsics.r("passwordConfirmField");
                                        throw null;
                                    }
                                    gestaltTextField5.X(c.f139811s);
                                }
                            }
                            if (it instanceof xn1.a) {
                                this$0.e8(this$0.b8());
                            }
                            if ((it instanceof xn1.d) && ve.h.X((xn1.d) it, 2)) {
                                this$0.c8();
                                return;
                            }
                            return;
                        default:
                            int i19 = u.F0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            zq1.p pVar = this$0.A0;
                            if (pVar != null) {
                                Map map = this$0.f140031z0;
                                if (map != null) {
                                    ((zq1.o) pVar).t3(map);
                                    return;
                                } else {
                                    Intrinsics.r("passwordParams");
                                    throw null;
                                }
                            }
                            return;
                    }
                }
            });
            zq1.p pVar = this.A0;
            if (pVar != null) {
                Map map = this.f140031z0;
                if (map == null) {
                    Intrinsics.r("passwordParams");
                    throw null;
                }
                ((zq1.o) pVar).q3(map);
            }
            View findViewById7 = v13.findViewById(vq1.b.strong_password_field);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
            this.f140029x0 = (StrongPasswordTextField) findViewById7;
            lh0.y1 y1Var = this.f140021p0;
            if (y1Var == null) {
                Intrinsics.r("experiments");
                throw null;
            }
            if (y1Var.e()) {
                GestaltTextField gestaltTextField3 = this.f140027v0;
                if (gestaltTextField3 == null) {
                    Intrinsics.r("passwordEt");
                    throw null;
                }
                gestaltTextField3.X(c.f139807o);
                GestaltTextField gestaltTextField4 = this.f140028w0;
                if (gestaltTextField4 == null) {
                    Intrinsics.r("passwordConfirmField");
                    throw null;
                }
                gestaltTextField4.X(c.f139808p);
                StrongPasswordTextField strongPasswordTextField = this.f140029x0;
                if (strongPasswordTextField == null) {
                    Intrinsics.r("strongPasswordField");
                    throw null;
                }
                strongPasswordTextField.setVisibility(0);
                StrongPasswordTextField strongPasswordTextField2 = this.f140029x0;
                if (strongPasswordTextField2 == null) {
                    Intrinsics.r("strongPasswordField");
                    throw null;
                }
                strongPasswordTextField2.g(new a.z0(this, 29));
                GestaltButton gestaltButton3 = this.f140026u0;
                if (gestaltButton3 != null) {
                    pk.a0.m(gestaltButton3, new t(this, i15));
                } else {
                    Intrinsics.r("logInButton");
                    throw null;
                }
            }
        }
    }
}
