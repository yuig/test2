package bb1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.l4;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lbb1/w;", "Lyk1/k;", "Lya1/e;", "<init>", "()V", "n91/z", "security_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class w extends e implements ya1.e {

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f22566u0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f22567j0;

    /* renamed from: k0, reason: collision with root package name */
    public cr1.a f22568k0;

    /* renamed from: l0, reason: collision with root package name */
    public i92.k f22569l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltText f22570m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltTextField f22571n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltButton f22572o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f22573p0;

    /* renamed from: q0, reason: collision with root package name */
    public ab1.n f22574q0;

    /* renamed from: r0, reason: collision with root package name */
    public nr.i f22575r0;

    /* renamed from: s0, reason: collision with root package name */
    public final d4 f22576s0 = d4.MULTI_FACTOR_AUTH_ENABLE;

    /* renamed from: t0, reason: collision with root package name */
    public final a4 f22577t0 = a4.PHONE_NUMBER;

    public static final boolean b8(w wVar) {
        if (wVar.f22570m0 == null) {
            Intrinsics.r("countryCodeText");
            throw null;
        }
        if (!kotlin.text.z.j(pk.a0.R(r0))) {
            if (wVar.f22571n0 == null) {
                Intrinsics.r("phoneNumberEdit");
                throw null;
            }
            if (!kotlin.text.z.j(r3.B0())) {
                return true;
            }
        }
        return false;
    }

    @Override // yk1.k, nl1.d
    public final void K7() {
        Window window;
        super.K7();
        FragmentActivity E4 = E4();
        if (E4 == null || (window = E4.getWindow()) == null) {
            return;
        }
        this.f22573p0 = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
    }

    @Override // yk1.k, nl1.d
    public final void L7() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            Window window = E4.getWindow();
            if (window != null) {
                window.setSoftInputMode(this.f22573p0);
            }
            hf0.b.l(E4);
        }
        super.L7();
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
        gestaltToolbarImpl.b0(getString(l52.c.settings_enable_mfa_step_progression, 2, 3));
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Navigation navigation = this.I;
        Object i03 = navigation != null ? navigation.i0("arg_verified_password") : null;
        String str = i03 instanceof String ? (String) i03 : null;
        String str2 = str == null ? "" : str;
        Navigation navigation2 = this.I;
        Object i04 = navigation2 != null ? navigation2.i0("arg_verified_email") : null;
        String str3 = i04 instanceof String ? (String) i04 : null;
        uk1.e eVar = this.f22567j0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d f13 = ((uk1.a) eVar).f(s7(), "");
        uj2.q p73 = p7();
        m60.w f73 = f7();
        cr1.a aVar = this.f22568k0;
        if (aVar != null) {
            return new ab1.n(f73, f13, aVar, p73, str2, str3);
        }
        Intrinsics.r("accountService");
        throw null;
    }

    public final void c8(boolean z13) {
        if (z13) {
            f7().d(new of0.a(new mf0.l()));
        } else {
            ep.b.C(null, f7());
        }
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getN0() {
        return this.f22577t0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getM0() {
        return this.f22576s0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = l52.b.fragment_enable_mfa_phone;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(l52.a.mfa_phone_country_code);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f22570m0 = (GestaltText) findViewById;
        View findViewById2 = onCreateView.findViewById(l52.a.mfa_phone_edit);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f22571n0 = (GestaltTextField) findViewById2;
        View findViewById3 = onCreateView.findViewById(l52.a.mfa_phone_next_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f22572o0 = (GestaltButton) findViewById3;
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        GestaltText gestaltText = this.f22570m0;
        if (gestaltText == null) {
            Intrinsics.r("countryCodeText");
            throw null;
        }
        gestaltText.i(h.f22503p);
        GestaltText gestaltText2 = this.f22570m0;
        if (gestaltText2 == null) {
            Intrinsics.r("countryCodeText");
            throw null;
        }
        final int i13 = 0;
        gestaltText2.j(new gm1.a(this) { // from class: bb1.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f22563b;

            {
                this.f22563b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                w this$0 = this.f22563b;
                switch (i14) {
                    case 0:
                        int i15 = w.f22566u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.COUNTRY_CODE_PICKER, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                            NavigationImpl w13 = Navigation.w1(l4.d());
                            Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
                            this$0.M1(w13);
                            return;
                        }
                        return;
                    case 1:
                        int i16 = w.f22566u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        nr.i iVar = this$0.f22575r0;
                        if (iVar != null) {
                            iVar.h3(it);
                        }
                        if (it instanceof xn1.a) {
                            GestaltButton gestaltButton = this$0.f22572o0;
                            if (gestaltButton != null) {
                                gestaltButton.d(new v(this$0, 1));
                                return;
                            } else {
                                Intrinsics.r("nextButton");
                                throw null;
                            }
                        }
                        return;
                    default:
                        int i17 = w.f22566u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NEXT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.n nVar = this$0.f22574q0;
                        if (nVar != null) {
                            GestaltText gestaltText3 = this$0.f22570m0;
                            if (gestaltText3 == null) {
                                Intrinsics.r("countryCodeText");
                                throw null;
                            }
                            String R = pk.a0.R(gestaltText3);
                            GestaltTextField gestaltTextField = this$0.f22571n0;
                            if (gestaltTextField != null) {
                                nVar.p3(R, gestaltTextField.B0());
                                return;
                            } else {
                                Intrinsics.r("phoneNumberEdit");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        GestaltTextField gestaltTextField = this.f22571n0;
        if (gestaltTextField == null) {
            Intrinsics.r("phoneNumberEdit");
            throw null;
        }
        gestaltTextField.addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 21));
        GestaltTextField gestaltTextField2 = this.f22571n0;
        if (gestaltTextField2 == null) {
            Intrinsics.r("phoneNumberEdit");
            throw null;
        }
        final int i14 = 1;
        gestaltTextField2.Z(new gm1.a(this) { // from class: bb1.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f22563b;

            {
                this.f22563b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                w this$0 = this.f22563b;
                switch (i142) {
                    case 0:
                        int i15 = w.f22566u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.COUNTRY_CODE_PICKER, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                            NavigationImpl w13 = Navigation.w1(l4.d());
                            Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
                            this$0.M1(w13);
                            return;
                        }
                        return;
                    case 1:
                        int i16 = w.f22566u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        nr.i iVar = this$0.f22575r0;
                        if (iVar != null) {
                            iVar.h3(it);
                        }
                        if (it instanceof xn1.a) {
                            GestaltButton gestaltButton = this$0.f22572o0;
                            if (gestaltButton != null) {
                                gestaltButton.d(new v(this$0, 1));
                                return;
                            } else {
                                Intrinsics.r("nextButton");
                                throw null;
                            }
                        }
                        return;
                    default:
                        int i17 = w.f22566u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NEXT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.n nVar = this$0.f22574q0;
                        if (nVar != null) {
                            GestaltText gestaltText3 = this$0.f22570m0;
                            if (gestaltText3 == null) {
                                Intrinsics.r("countryCodeText");
                                throw null;
                            }
                            String R = pk.a0.R(gestaltText3);
                            GestaltTextField gestaltTextField3 = this$0.f22571n0;
                            if (gestaltTextField3 != null) {
                                nVar.p3(R, gestaltTextField3.B0());
                                return;
                            } else {
                                Intrinsics.r("phoneNumberEdit");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        GestaltButton gestaltButton = this.f22572o0;
        if (gestaltButton == null) {
            Intrinsics.r("nextButton");
            throw null;
        }
        final int i15 = 2;
        gestaltButton.d(h.f22504q).e(new gm1.a(this) { // from class: bb1.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f22563b;

            {
                this.f22563b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i15;
                w this$0 = this.f22563b;
                switch (i142) {
                    case 0:
                        int i152 = w.f22566u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.COUNTRY_CODE_PICKER, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                            NavigationImpl w13 = Navigation.w1(l4.d());
                            Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
                            this$0.M1(w13);
                            return;
                        }
                        return;
                    case 1:
                        int i16 = w.f22566u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        nr.i iVar = this$0.f22575r0;
                        if (iVar != null) {
                            iVar.h3(it);
                        }
                        if (it instanceof xn1.a) {
                            GestaltButton gestaltButton2 = this$0.f22572o0;
                            if (gestaltButton2 != null) {
                                gestaltButton2.d(new v(this$0, 1));
                                return;
                            } else {
                                Intrinsics.r("nextButton");
                                throw null;
                            }
                        }
                        return;
                    default:
                        int i17 = w.f22566u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NEXT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.n nVar = this$0.f22574q0;
                        if (nVar != null) {
                            GestaltText gestaltText3 = this$0.f22570m0;
                            if (gestaltText3 == null) {
                                Intrinsics.r("countryCodeText");
                                throw null;
                            }
                            String R = pk.a0.R(gestaltText3);
                            GestaltTextField gestaltTextField3 = this$0.f22571n0;
                            if (gestaltTextField3 != null) {
                                nVar.p3(R, gestaltTextField3.B0());
                                return;
                            } else {
                                Intrinsics.r("phoneNumberEdit");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
    }
}
