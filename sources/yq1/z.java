package yq1;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttonSocial.GestaltButtonSocial;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.identity.authentication.view.SuggestedDomainsView;
import com.pinterest.identity.core.error.UnauthException;
import h32.d4;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyq1/z;", "Lnl1/d;", "<init>", "()V", "org/chromium/net/y", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class z extends e0 {

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f140086r0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public vy.m f140087c0;

    /* renamed from: d0, reason: collision with root package name */
    public lb2.q f140088d0;

    /* renamed from: e0, reason: collision with root package name */
    public il1.a f140089e0;

    /* renamed from: f0, reason: collision with root package name */
    public com.pinterest.identity.authentication.a f140090f0;

    /* renamed from: g0, reason: collision with root package name */
    public lh0.y1 f140091g0;

    /* renamed from: h0, reason: collision with root package name */
    public so.e0 f140092h0;

    /* renamed from: i0, reason: collision with root package name */
    public GestaltTextField f140093i0;

    /* renamed from: j0, reason: collision with root package name */
    public SuggestedDomainsView f140094j0;

    /* renamed from: k0, reason: collision with root package name */
    public GestaltButton f140095k0;

    /* renamed from: l0, reason: collision with root package name */
    public GestaltText f140096l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltButtonSocial f140097m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltText f140098n0;

    /* renamed from: o0, reason: collision with root package name */
    public sr1.g f140099o0;

    /* renamed from: p0, reason: collision with root package name */
    public String f140100p0;

    /* renamed from: q0, reason: collision with root package name */
    public final d4 f140101q0 = d4.REGISTRATION;

    public static final void Y7(z zVar, Throwable th3) {
        zVar.getClass();
        if (th3 instanceof UnauthException.UserLookUpRateLimitHit) {
            String string = zVar.getString(vq1.d.email_check_rate_limit_hit);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            zVar.b8(string);
        } else if (th3 instanceof UnauthException.UserLookUpError) {
            String string2 = zVar.getString(vq1.d.email_check_failed);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            zVar.b8(string2);
        } else {
            com.pinterest.identity.authentication.a aVar = zVar.f140090f0;
            if (aVar != null) {
                aVar.a(false, th3);
            } else {
                Intrinsics.r("authNavigationHelper");
                throw null;
            }
        }
    }

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
        sr1.g gVar = this.f140099o0;
        if (gVar == null) {
            Intrinsics.r("pendingSignupData");
            throw null;
        }
        qr1.m a13 = gVar.a();
        if (a13 instanceof qr1.i) {
            gestaltToolbarImpl.Y(vq1.d.sign_up_with_line);
        } else if (a13 instanceof qr1.f) {
            gestaltToolbarImpl.Y(vq1.d.sign_up_with_facebook);
        }
        gestaltToolbarImpl.I();
        Drawable g03 = bs1.c.g0(this, drawableRes, Integer.valueOf(m60.r0.default_pds_icon_size), 2);
        String string = getString(m60.x0.back);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        gestaltToolbarImpl.T(g03, string);
        gestaltToolbarImpl.m();
    }

    public final void Z7(kk2.g gVar) {
        xj2.c o13 = gVar.o(new tp1.c(24, new y(this, 0)), new tp1.c(25, new y(this, 1)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        R6(o13);
    }

    public final lb2.q a8() {
        lb2.q qVar = this.f140088d0;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.r("authManager");
        throw null;
    }

    public final void b8(String str) {
        GestaltTextField gestaltTextField = this.f140093i0;
        if (gestaltTextField == null) {
            Intrinsics.r("emailEditText");
            throw null;
        }
        gestaltTextField.g0();
        GestaltTextField gestaltTextField2 = this.f140093i0;
        if (gestaltTextField2 != null) {
            gestaltTextField2.X(new dl1.i0(str, 14));
        } else {
            Intrinsics.r("emailEditText");
            throw null;
        }
    }

    public final void c8() {
        GestaltTextField gestaltTextField = this.f140093i0;
        if (gestaltTextField == null) {
            Intrinsics.r("emailEditText");
            throw null;
        }
        String B0 = gestaltTextField.B0();
        GestaltTextField gestaltTextField2 = this.f140093i0;
        if (gestaltTextField2 == null) {
            Intrinsics.r("emailEditText");
            throw null;
        }
        hf0.b.k(gestaltTextField2);
        if (tr1.b.c(B0)) {
            xj2.c o13 = a8().g(B0).o(new tp1.c(22, new x(this, B0, 1)), new tp1.c(23, new y(this, 6)));
            Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
            R6(o13);
        } else {
            String string = getString(kotlin.text.z.j(B0) ? vq1.d.signup_email_empty : m60.x0.signup_email_invalid);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            b8(string);
        }
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF0() {
        return this.f140101q0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        a8().d(i13, i14, intent);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = vq1.c.fragment_email_collection;
        Serializable V = com.bumptech.glide.d.V(this, "EXTRA_PENDING_SIGNUP_DATA", null);
        Intrinsics.g(V, "null cannot be cast to non-null type com.pinterest.identity.core.signup.PendingSignupData");
        this.f140099o0 = (sr1.g) V;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(vq1.b.email_collection_copy);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = v13.findViewById(vq1.b.email);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f140093i0 = (GestaltTextField) findViewById2;
        View findViewById3 = v13.findViewById(vq1.b.suggested_domains_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f140094j0 = (SuggestedDomainsView) findViewById3;
        View findViewById4 = v13.findViewById(vq1.b.continue_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f140095k0 = (GestaltButton) findViewById4;
        View findViewById5 = v13.findViewById(vq1.b.gplus);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f140096l0 = (GestaltText) findViewById5;
        View findViewById6 = v13.findViewById(vq1.b.gplus_social);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f140097m0 = (GestaltButtonSocial) findViewById6;
        View findViewById7 = v13.findViewById(vq1.b.f126439or);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        View findViewById8 = v13.findViewById(vq1.b.email_auto_correction_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f140098n0 = (GestaltText) findViewById8;
        SuggestedDomainsView suggestedDomainsView = this.f140094j0;
        if (suggestedDomainsView == null) {
            Intrinsics.r("suggestedDomainsView");
            throw null;
        }
        int i13 = 4;
        suggestedDomainsView.setVisibility(4);
        SuggestedDomainsView suggestedDomainsView2 = this.f140094j0;
        if (suggestedDomainsView2 == null) {
            Intrinsics.r("suggestedDomainsView");
            throw null;
        }
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        final int i14 = 0;
        String country = context.getResources().getConfiguration().getLocales().get(0).getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "also(...)");
        suggestedDomainsView2.a(country);
        SuggestedDomainsView suggestedDomainsView3 = this.f140094j0;
        if (suggestedDomainsView3 == null) {
            Intrinsics.r("suggestedDomainsView");
            throw null;
        }
        final int i15 = 2;
        y clickHandler = new y(this, i15);
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        suggestedDomainsView3.f49829b.f23778e = clickHandler;
        GestaltTextField gestaltTextField = this.f140093i0;
        if (gestaltTextField == null) {
            Intrinsics.r("emailEditText");
            throw null;
        }
        gestaltTextField.Z(new gm1.a(this) { // from class: yq1.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f140048b;

            {
                this.f140048b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                xn1.g gVar;
                KeyEvent keyEvent;
                int i16 = i15;
                z this$0 = this.f140048b;
                switch (i16) {
                    case 0:
                        int i17 = z.f140086r0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.c8();
                        return;
                    case 1:
                        int i18 = z.f140086r0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        String str = this$0.f140100p0;
                        if (str == null) {
                            Intrinsics.r("emailTypoSuggestion");
                            throw null;
                        }
                        if (str.length() > 0) {
                            GestaltTextField gestaltTextField2 = this$0.f140093i0;
                            if (gestaltTextField2 == null) {
                                Intrinsics.r("emailEditText");
                                throw null;
                            }
                            gestaltTextField2.X(new y(this$0, 5));
                        }
                        this$0.s7().F(null, h32.u0.SUGGESTED_EMAIL);
                        return;
                    default:
                        int i19 = z.f140086r0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof xn1.a) {
                            this$0.getClass();
                            Editable editable = ((xn1.a) it).f135436c;
                            if (editable != null && editable.length() > 0) {
                                GestaltButton gestaltButton = this$0.f140095k0;
                                if (gestaltButton == null) {
                                    Intrinsics.r("continueButton");
                                    throw null;
                                }
                                gestaltButton.d(c.f139812t);
                            }
                        }
                        if (it instanceof xn1.i) {
                            SuggestedDomainsView suggestedDomainsView4 = this$0.f140094j0;
                            if (suggestedDomainsView4 == null) {
                                Intrinsics.r("suggestedDomainsView");
                                throw null;
                            }
                            int i23 = 0;
                            boolean z13 = suggestedDomainsView4.getVisibility() == 0;
                            xn1.i iVar = (xn1.i) it;
                            int length = iVar.f135454c.length();
                            String str2 = iVar.f135454c;
                            if (length == 0 && z13) {
                                SuggestedDomainsView suggestedDomainsView5 = this$0.f140094j0;
                                if (suggestedDomainsView5 == null) {
                                    Intrinsics.r("suggestedDomainsView");
                                    throw null;
                                }
                                suggestedDomainsView5.setVisibility(4);
                            } else if (str2.length() > 0 && !z13) {
                                SuggestedDomainsView suggestedDomainsView6 = this$0.f140094j0;
                                if (suggestedDomainsView6 == null) {
                                    Intrinsics.r("suggestedDomainsView");
                                    throw null;
                                }
                                suggestedDomainsView6.setVisibility(0);
                            }
                            if (str2.length() > 0) {
                                String a13 = gp1.e.a(str2);
                                if (a13 == null || kotlin.text.z.j(a13)) {
                                    GestaltText gestaltText = this$0.f140098n0;
                                    if (gestaltText == null) {
                                        Intrinsics.r("emailAutoCorrectionTv");
                                        throw null;
                                    }
                                    gestaltText.i(c.f139813u);
                                    this$0.f140100p0 = "";
                                } else {
                                    GestaltText gestaltText2 = this$0.f140098n0;
                                    if (gestaltText2 == null) {
                                        Intrinsics.r("emailAutoCorrectionTv");
                                        throw null;
                                    }
                                    gestaltText2.i(new x(this$0, a13, i23));
                                    this$0.f140100p0 = a13;
                                }
                            }
                        }
                        if ((it instanceof xn1.g) && (keyEvent = (gVar = (xn1.g) it).f135451d) != null && keyEvent.getAction() == 0 && gVar.f135450c == 66) {
                            this$0.c8();
                            return;
                        }
                        return;
                }
            }
        });
        GestaltButton gestaltButton = this.f140095k0;
        if (gestaltButton == null) {
            Intrinsics.r("continueButton");
            throw null;
        }
        gestaltButton.d(c.f139814v).e(new gm1.a(this) { // from class: yq1.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f140048b;

            {
                this.f140048b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                xn1.g gVar;
                KeyEvent keyEvent;
                int i16 = i14;
                z this$0 = this.f140048b;
                switch (i16) {
                    case 0:
                        int i17 = z.f140086r0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.c8();
                        return;
                    case 1:
                        int i18 = z.f140086r0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        String str = this$0.f140100p0;
                        if (str == null) {
                            Intrinsics.r("emailTypoSuggestion");
                            throw null;
                        }
                        if (str.length() > 0) {
                            GestaltTextField gestaltTextField2 = this$0.f140093i0;
                            if (gestaltTextField2 == null) {
                                Intrinsics.r("emailEditText");
                                throw null;
                            }
                            gestaltTextField2.X(new y(this$0, 5));
                        }
                        this$0.s7().F(null, h32.u0.SUGGESTED_EMAIL);
                        return;
                    default:
                        int i19 = z.f140086r0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof xn1.a) {
                            this$0.getClass();
                            Editable editable = ((xn1.a) it).f135436c;
                            if (editable != null && editable.length() > 0) {
                                GestaltButton gestaltButton2 = this$0.f140095k0;
                                if (gestaltButton2 == null) {
                                    Intrinsics.r("continueButton");
                                    throw null;
                                }
                                gestaltButton2.d(c.f139812t);
                            }
                        }
                        if (it instanceof xn1.i) {
                            SuggestedDomainsView suggestedDomainsView4 = this$0.f140094j0;
                            if (suggestedDomainsView4 == null) {
                                Intrinsics.r("suggestedDomainsView");
                                throw null;
                            }
                            int i23 = 0;
                            boolean z13 = suggestedDomainsView4.getVisibility() == 0;
                            xn1.i iVar = (xn1.i) it;
                            int length = iVar.f135454c.length();
                            String str2 = iVar.f135454c;
                            if (length == 0 && z13) {
                                SuggestedDomainsView suggestedDomainsView5 = this$0.f140094j0;
                                if (suggestedDomainsView5 == null) {
                                    Intrinsics.r("suggestedDomainsView");
                                    throw null;
                                }
                                suggestedDomainsView5.setVisibility(4);
                            } else if (str2.length() > 0 && !z13) {
                                SuggestedDomainsView suggestedDomainsView6 = this$0.f140094j0;
                                if (suggestedDomainsView6 == null) {
                                    Intrinsics.r("suggestedDomainsView");
                                    throw null;
                                }
                                suggestedDomainsView6.setVisibility(0);
                            }
                            if (str2.length() > 0) {
                                String a13 = gp1.e.a(str2);
                                if (a13 == null || kotlin.text.z.j(a13)) {
                                    GestaltText gestaltText = this$0.f140098n0;
                                    if (gestaltText == null) {
                                        Intrinsics.r("emailAutoCorrectionTv");
                                        throw null;
                                    }
                                    gestaltText.i(c.f139813u);
                                    this$0.f140100p0 = "";
                                } else {
                                    GestaltText gestaltText2 = this$0.f140098n0;
                                    if (gestaltText2 == null) {
                                        Intrinsics.r("emailAutoCorrectionTv");
                                        throw null;
                                    }
                                    gestaltText2.i(new x(this$0, a13, i23));
                                    this$0.f140100p0 = a13;
                                }
                            }
                        }
                        if ((it instanceof xn1.g) && (keyEvent = (gVar = (xn1.g) it).f135451d) != null && keyEvent.getAction() == 0 && gVar.f135450c == 66) {
                            this$0.c8();
                            return;
                        }
                        return;
                }
            }
        });
        lh0.y1 y1Var = this.f140091g0;
        if (y1Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        if (y1Var.b()) {
            GestaltButtonSocial gestaltButtonSocial = this.f140097m0;
            if (gestaltButtonSocial == null) {
                Intrinsics.r("gplusButtonSocial");
                throw null;
            }
            kh2.b0.O(gestaltButtonSocial, c.f139815w);
            GestaltButtonSocial gestaltButtonSocial2 = this.f140097m0;
            if (gestaltButtonSocial2 == null) {
                Intrinsics.r("gplusButtonSocial");
                throw null;
            }
            kg.a.i(gestaltButtonSocial2, new y(this, 3));
        } else {
            GestaltText gestaltText = this.f140096l0;
            if (gestaltText == null) {
                Intrinsics.r("gplusButton");
                throw null;
            }
            pk.a0.w1(gestaltText);
            GestaltText gestaltText2 = this.f140096l0;
            if (gestaltText2 == null) {
                Intrinsics.r("gplusButton");
                throw null;
            }
            pk.a0.n(gestaltText2, new y(this, i13));
        }
        String b13 = hf0.b.b();
        if (b13 != null && b13.length() != 0) {
            vy.m mVar = this.f140087c0;
            if (mVar == null) {
                Intrinsics.r("analyticsApi");
                throw null;
            }
            mVar.a("can_prefill_email");
            GestaltTextField gestaltTextField2 = this.f140093i0;
            if (gestaltTextField2 == null) {
                Intrinsics.r("emailEditText");
                throw null;
            }
            gestaltTextField2.X(new dl1.i0(b13, 15));
        }
        GestaltText gestaltText3 = this.f140098n0;
        if (gestaltText3 == null) {
            Intrinsics.r("emailAutoCorrectionTv");
            throw null;
        }
        final int i16 = 1;
        gestaltText3.j(new gm1.a(this) { // from class: yq1.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f140048b;

            {
                this.f140048b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                xn1.g gVar;
                KeyEvent keyEvent;
                int i162 = i16;
                z this$0 = this.f140048b;
                switch (i162) {
                    case 0:
                        int i17 = z.f140086r0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.c8();
                        return;
                    case 1:
                        int i18 = z.f140086r0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        String str = this$0.f140100p0;
                        if (str == null) {
                            Intrinsics.r("emailTypoSuggestion");
                            throw null;
                        }
                        if (str.length() > 0) {
                            GestaltTextField gestaltTextField22 = this$0.f140093i0;
                            if (gestaltTextField22 == null) {
                                Intrinsics.r("emailEditText");
                                throw null;
                            }
                            gestaltTextField22.X(new y(this$0, 5));
                        }
                        this$0.s7().F(null, h32.u0.SUGGESTED_EMAIL);
                        return;
                    default:
                        int i19 = z.f140086r0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof xn1.a) {
                            this$0.getClass();
                            Editable editable = ((xn1.a) it).f135436c;
                            if (editable != null && editable.length() > 0) {
                                GestaltButton gestaltButton2 = this$0.f140095k0;
                                if (gestaltButton2 == null) {
                                    Intrinsics.r("continueButton");
                                    throw null;
                                }
                                gestaltButton2.d(c.f139812t);
                            }
                        }
                        if (it instanceof xn1.i) {
                            SuggestedDomainsView suggestedDomainsView4 = this$0.f140094j0;
                            if (suggestedDomainsView4 == null) {
                                Intrinsics.r("suggestedDomainsView");
                                throw null;
                            }
                            int i23 = 0;
                            boolean z13 = suggestedDomainsView4.getVisibility() == 0;
                            xn1.i iVar = (xn1.i) it;
                            int length = iVar.f135454c.length();
                            String str2 = iVar.f135454c;
                            if (length == 0 && z13) {
                                SuggestedDomainsView suggestedDomainsView5 = this$0.f140094j0;
                                if (suggestedDomainsView5 == null) {
                                    Intrinsics.r("suggestedDomainsView");
                                    throw null;
                                }
                                suggestedDomainsView5.setVisibility(4);
                            } else if (str2.length() > 0 && !z13) {
                                SuggestedDomainsView suggestedDomainsView6 = this$0.f140094j0;
                                if (suggestedDomainsView6 == null) {
                                    Intrinsics.r("suggestedDomainsView");
                                    throw null;
                                }
                                suggestedDomainsView6.setVisibility(0);
                            }
                            if (str2.length() > 0) {
                                String a13 = gp1.e.a(str2);
                                if (a13 == null || kotlin.text.z.j(a13)) {
                                    GestaltText gestaltText4 = this$0.f140098n0;
                                    if (gestaltText4 == null) {
                                        Intrinsics.r("emailAutoCorrectionTv");
                                        throw null;
                                    }
                                    gestaltText4.i(c.f139813u);
                                    this$0.f140100p0 = "";
                                } else {
                                    GestaltText gestaltText22 = this$0.f140098n0;
                                    if (gestaltText22 == null) {
                                        Intrinsics.r("emailAutoCorrectionTv");
                                        throw null;
                                    }
                                    gestaltText22.i(new x(this$0, a13, i23));
                                    this$0.f140100p0 = a13;
                                }
                            }
                        }
                        if ((it instanceof xn1.g) && (keyEvent = (gVar = (xn1.g) it).f135451d) != null && keyEvent.getAction() == 0 && gVar.f135450c == 66) {
                            this$0.c8();
                            return;
                        }
                        return;
                }
            }
        });
    }
}
