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
import h32.a4;
import h32.d4;
import h32.f1;
import h32.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e0;
import rc0.z0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lbb1/l;", "Lyk1/k;", "Lya1/b;", "<init>", "()V", "n91/z", "security_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class l extends b implements ya1.b {

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f22520u0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f22521j0;

    /* renamed from: k0, reason: collision with root package name */
    public cr1.a f22522k0;

    /* renamed from: l0, reason: collision with root package name */
    public i92.k f22523l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f22524m0;

    /* renamed from: n0, reason: collision with root package name */
    public ab1.f f22525n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltText f22526o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltTextField f22527p0;

    /* renamed from: q0, reason: collision with root package name */
    public GestaltText f22528q0;

    /* renamed from: r0, reason: collision with root package name */
    public GestaltButton f22529r0;

    /* renamed from: s0, reason: collision with root package name */
    public final d4 f22530s0 = d4.MULTI_FACTOR_AUTH_ENABLE;

    /* renamed from: t0, reason: collision with root package name */
    public final a4 f22531t0 = a4.VERIFICATION_CODE;

    @Override // yk1.k, nl1.d
    public final void K7() {
        Window window;
        super.K7();
        FragmentActivity E4 = E4();
        if (E4 == null || (window = E4.getWindow()) == null) {
            return;
        }
        this.f22524m0 = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
    }

    @Override // yk1.k, nl1.d
    public final void L7() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            Window window = E4.getWindow();
            if (window != null) {
                window.setSoftInputMode(this.f22524m0);
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
        gestaltToolbarImpl.b0(getString(l52.c.settings_enable_mfa_step_progression, 3, 3));
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Navigation navigation = this.I;
        Object i03 = navigation != null ? navigation.i0("arg_verified_password") : null;
        Intrinsics.g(i03, "null cannot be cast to non-null type kotlin.String");
        String str = (String) i03;
        Navigation navigation2 = this.I;
        Object i04 = navigation2 != null ? navigation2.i0("arg_verified_email") : null;
        String str2 = i04 instanceof String ? (String) i04 : null;
        uk1.e eVar = this.f22521j0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d f13 = ((uk1.a) eVar).f(s7(), "");
        uj2.q p73 = p7();
        cr1.a aVar = this.f22522k0;
        if (aVar != null) {
            return new ab1.f(f7(), f13, aVar, p73, str, str2);
        }
        Intrinsics.r("accountService");
        throw null;
    }

    public final void b8(boolean z13) {
        if (z13) {
            f7().d(new of0.a(new mf0.l()));
        } else {
            ep.b.C(null, f7());
        }
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF22517r0() {
        return this.f22531t0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF22516q0() {
        return this.f22530s0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = l52.b.fragment_enable_mfa_code;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(l52.a.mfa_code_verification_description);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f22526o0 = (GestaltText) findViewById;
        View findViewById2 = onCreateView.findViewById(l52.a.mfa_code_verification_edit);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f22527p0 = (GestaltTextField) findViewById2;
        View findViewById3 = onCreateView.findViewById(l52.a.mfa_code_verification_resend);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f22528q0 = (GestaltText) findViewById3;
        View findViewById4 = onCreateView.findViewById(l52.a.mfa_code_verification_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f22529r0 = (GestaltButton) findViewById4;
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        String str;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        Navigation navigation = this.I;
        Object i03 = navigation != null ? navigation.i0("arg_phone_number") : null;
        Intrinsics.g(i03, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) i03;
        GestaltText gestaltText = this.f22526o0;
        if (gestaltText == null) {
            Intrinsics.r("descriptionText");
            throw null;
        }
        int i13 = l52.c.settings_enable_mfa_verification_description;
        final int i14 = 1;
        Object[] objArr = new Object[1];
        if (str2.length() < 4) {
            str2 = null;
        }
        if (str2 == null || (str = e0.D(4, str2)) == null) {
            str = "";
        }
        final int i15 = 0;
        objArr[0] = str;
        String string = getString(i13, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        pk.a0.p(gestaltText, string);
        GestaltTextField gestaltTextField = this.f22527p0;
        if (gestaltTextField == null) {
            Intrinsics.r("verificationCodeEdit");
            throw null;
        }
        gestaltTextField.addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 18));
        GestaltTextField gestaltTextField2 = this.f22527p0;
        if (gestaltTextField2 == null) {
            Intrinsics.r("verificationCodeEdit");
            throw null;
        }
        gestaltTextField2.Z(new gm1.a(this) { // from class: bb1.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f22519b;

            {
                this.f22519b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                int i16 = i15;
                l this$0 = this.f22519b;
                switch (i16) {
                    case 0:
                        int i17 = l.f22520u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof xn1.a) {
                            GestaltButton gestaltButton = this$0.f22529r0;
                            if (gestaltButton != null) {
                                gestaltButton.d(new z0(3, event));
                                return;
                            } else {
                                Intrinsics.r("verifyButton");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        int i18 = l.f22520u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.RESEND_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.f fVar = this$0.f22525n0;
                        if (fVar != null) {
                            fVar.q3();
                            return;
                        }
                        return;
                    default:
                        int i19 = l.f22520u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NEXT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.f fVar2 = this$0.f22525n0;
                        if (fVar2 != null) {
                            GestaltTextField gestaltTextField3 = this$0.f22527p0;
                            if (gestaltTextField3 != null) {
                                fVar2.r3(String.valueOf(gestaltTextField3.z0()));
                                return;
                            } else {
                                Intrinsics.r("verificationCodeEdit");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        GestaltText gestaltText2 = this.f22528q0;
        if (gestaltText2 == null) {
            Intrinsics.r("resendCodeText");
            throw null;
        }
        gestaltText2.j(new gm1.a(this) { // from class: bb1.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f22519b;

            {
                this.f22519b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                int i16 = i14;
                l this$0 = this.f22519b;
                switch (i16) {
                    case 0:
                        int i17 = l.f22520u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof xn1.a) {
                            GestaltButton gestaltButton = this$0.f22529r0;
                            if (gestaltButton != null) {
                                gestaltButton.d(new z0(3, event));
                                return;
                            } else {
                                Intrinsics.r("verifyButton");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        int i18 = l.f22520u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.RESEND_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.f fVar = this$0.f22525n0;
                        if (fVar != null) {
                            fVar.q3();
                            return;
                        }
                        return;
                    default:
                        int i19 = l.f22520u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NEXT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.f fVar2 = this$0.f22525n0;
                        if (fVar2 != null) {
                            GestaltTextField gestaltTextField3 = this$0.f22527p0;
                            if (gestaltTextField3 != null) {
                                fVar2.r3(String.valueOf(gestaltTextField3.z0()));
                                return;
                            } else {
                                Intrinsics.r("verificationCodeEdit");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        GestaltButton gestaltButton = this.f22529r0;
        if (gestaltButton == null) {
            Intrinsics.r("verifyButton");
            throw null;
        }
        final int i16 = 2;
        gestaltButton.d(h.f22500m).e(new gm1.a(this) { // from class: bb1.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f22519b;

            {
                this.f22519b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                int i162 = i16;
                l this$0 = this.f22519b;
                switch (i162) {
                    case 0:
                        int i17 = l.f22520u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof xn1.a) {
                            GestaltButton gestaltButton2 = this$0.f22529r0;
                            if (gestaltButton2 != null) {
                                gestaltButton2.d(new z0(3, event));
                                return;
                            } else {
                                Intrinsics.r("verifyButton");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        int i18 = l.f22520u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.RESEND_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.f fVar = this$0.f22525n0;
                        if (fVar != null) {
                            fVar.q3();
                            return;
                        }
                        return;
                    default:
                        int i19 = l.f22520u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NEXT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.f fVar2 = this$0.f22525n0;
                        if (fVar2 != null) {
                            GestaltTextField gestaltTextField3 = this$0.f22527p0;
                            if (gestaltTextField3 != null) {
                                fVar2.r3(String.valueOf(gestaltTextField3.z0()));
                                return;
                            } else {
                                Intrinsics.r("verificationCodeEdit");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
    }
}
