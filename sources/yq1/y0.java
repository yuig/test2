package yq1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.a4;
import h32.d4;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lyq1/y0;", "Lyk1/k;", "Lzq1/s;", "<init>", "()V", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class y0 extends g0 implements zq1.s {

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f140058t0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public so.f0 f140059j0;

    /* renamed from: k0, reason: collision with root package name */
    public com.pinterest.identity.authentication.a f140060k0;

    /* renamed from: l0, reason: collision with root package name */
    public uk1.e f140061l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltText f140062m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltTextField f140063n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltText f140064o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltButton f140065p0;

    /* renamed from: q0, reason: collision with root package name */
    public zq1.r f140066q0;

    /* renamed from: r0, reason: collision with root package name */
    public final d4 f140067r0 = d4.MULTI_FACTOR_AUTH_LOGIN;

    /* renamed from: s0, reason: collision with root package name */
    public final a4 f140068s0 = a4.VERIFICATION_CODE;

    @Override // mr1.c
    public final void H3(Function1 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        action.invoke(requireActivity);
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Y(vq1.d.two_factor_authentication_login_title);
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        so.f0 f0Var = this.f140059j0;
        if (f0Var == null) {
            Intrinsics.r("loginWithTwoFactorPresenterFactory");
            throw null;
        }
        uk1.e eVar = this.f140061l0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d f13 = ((uk1.a) eVar).f(s7(), "");
        com.pinterest.identity.authentication.a aVar = this.f140060k0;
        if (aVar == null) {
            Intrinsics.r("authNavigationHelper");
            throw null;
        }
        String X = com.bumptech.glide.d.X(this, "phone_number_end");
        Serializable V = com.bumptech.glide.d.V(this, "authority", null);
        Intrinsics.g(V, "null cannot be cast to non-null type com.pinterest.identity.core.model.Authority");
        Serializable V2 = com.bumptech.glide.d.V(this, "pending_login_params", null);
        Intrinsics.g(V2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
        return f0Var.a(f13, aVar, X, (qr1.m) V, (HashMap) V2, com.bumptech.glide.d.F(this, "is_auto"));
    }

    @Override // nl1.d
    public final boolean Z6() {
        return false;
    }

    public final void b8(yk1.i loadingState, int i13) {
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        if (x0.f140054a[loadingState.ordinal()] != 1) {
            ep.b.C(null, f7());
            return;
        }
        m60.w f73 = f7();
        mf0.l lVar = new mf0.l();
        Context context = lVar.getContext();
        lVar.q7(context != null ? context.getString(i13) : null);
        f73.d(new of0.a(lVar));
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF117886f1() {
        return this.f140068s0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF117885e1() {
        return this.f140067r0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = vq1.c.fragment_2fa_verification;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(vq1.b.two_factor_verification_description);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        Intrinsics.checkNotNullParameter(gestaltText, "<set-?>");
        this.f140062m0 = gestaltText;
        View findViewById2 = onCreateView.findViewById(vq1.b.two_factor_verification_code);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById2;
        Intrinsics.checkNotNullParameter(gestaltTextField, "<set-?>");
        this.f140063n0 = gestaltTextField;
        View findViewById3 = onCreateView.findViewById(vq1.b.two_factor_verification_resend);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById3;
        Intrinsics.checkNotNullParameter(gestaltText2, "<set-?>");
        this.f140064o0 = gestaltText2;
        View findViewById4 = onCreateView.findViewById(vq1.b.two_factor_verification_continue);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById4;
        Intrinsics.checkNotNullParameter(gestaltButton, "<set-?>");
        this.f140065p0 = gestaltButton;
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f140066q0 = null;
        super.onDestroyView();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        GestaltTextField gestaltTextField = this.f140063n0;
        if (gestaltTextField == null) {
            Intrinsics.r("verificationCodeEditText");
            throw null;
        }
        final int i13 = 0;
        gestaltTextField.Z(new gm1.a(this) { // from class: yq1.w0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0 f140050b;

            {
                this.f140050b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                zq1.r rVar;
                int i14 = i13;
                y0 this$0 = this.f140050b;
                switch (i14) {
                    case 0:
                        int i15 = y0.f140058t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (!(event instanceof xn1.i) || (rVar = this$0.f140066q0) == null) {
                            return;
                        }
                        ((zq1.v) rVar).r3(((xn1.i) event).f135454c);
                        return;
                    case 1:
                        int i16 = y0.f140058t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : h32.u0.CONTINUE_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        zq1.r rVar2 = this$0.f140066q0;
                        if (rVar2 != null) {
                            GestaltTextField gestaltTextField2 = this$0.f140063n0;
                            if (gestaltTextField2 != null) {
                                ((zq1.v) rVar2).p3(gestaltTextField2.B0());
                                return;
                            } else {
                                Intrinsics.r("verificationCodeEditText");
                                throw null;
                            }
                        }
                        return;
                    default:
                        int i17 = y0.f140058t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : h32.u0.RESEND_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        zq1.r rVar3 = this$0.f140066q0;
                        if (rVar3 != null) {
                            ((zq1.v) rVar3).q3();
                            return;
                        }
                        return;
                }
            }
        });
        GestaltTextField gestaltTextField2 = this.f140063n0;
        if (gestaltTextField2 == null) {
            Intrinsics.r("verificationCodeEditText");
            throw null;
        }
        gestaltTextField2.g0();
        GestaltButton gestaltButton = this.f140065p0;
        if (gestaltButton == null) {
            Intrinsics.r("continueButton");
            throw null;
        }
        final int i14 = 1;
        gestaltButton.e(new gm1.a(this) { // from class: yq1.w0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0 f140050b;

            {
                this.f140050b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                zq1.r rVar;
                int i142 = i14;
                y0 this$0 = this.f140050b;
                switch (i142) {
                    case 0:
                        int i15 = y0.f140058t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (!(event instanceof xn1.i) || (rVar = this$0.f140066q0) == null) {
                            return;
                        }
                        ((zq1.v) rVar).r3(((xn1.i) event).f135454c);
                        return;
                    case 1:
                        int i16 = y0.f140058t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : h32.u0.CONTINUE_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        zq1.r rVar2 = this$0.f140066q0;
                        if (rVar2 != null) {
                            GestaltTextField gestaltTextField22 = this$0.f140063n0;
                            if (gestaltTextField22 != null) {
                                ((zq1.v) rVar2).p3(gestaltTextField22.B0());
                                return;
                            } else {
                                Intrinsics.r("verificationCodeEditText");
                                throw null;
                            }
                        }
                        return;
                    default:
                        int i17 = y0.f140058t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : h32.u0.RESEND_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        zq1.r rVar3 = this$0.f140066q0;
                        if (rVar3 != null) {
                            ((zq1.v) rVar3).q3();
                            return;
                        }
                        return;
                }
            }
        });
        GestaltText gestaltText = this.f140064o0;
        if (gestaltText == null) {
            Intrinsics.r("resendCodeView");
            throw null;
        }
        gestaltText.i(c.f139818z);
        final int i15 = 2;
        gestaltText.j(new gm1.a(this) { // from class: yq1.w0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0 f140050b;

            {
                this.f140050b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                zq1.r rVar;
                int i142 = i15;
                y0 this$0 = this.f140050b;
                switch (i142) {
                    case 0:
                        int i152 = y0.f140058t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (!(event instanceof xn1.i) || (rVar = this$0.f140066q0) == null) {
                            return;
                        }
                        ((zq1.v) rVar).r3(((xn1.i) event).f135454c);
                        return;
                    case 1:
                        int i16 = y0.f140058t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : h32.u0.CONTINUE_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        zq1.r rVar2 = this$0.f140066q0;
                        if (rVar2 != null) {
                            GestaltTextField gestaltTextField22 = this$0.f140063n0;
                            if (gestaltTextField22 != null) {
                                ((zq1.v) rVar2).p3(gestaltTextField22.B0());
                                return;
                            } else {
                                Intrinsics.r("verificationCodeEditText");
                                throw null;
                            }
                        }
                        return;
                    default:
                        int i17 = y0.f140058t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : h32.u0.RESEND_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        zq1.r rVar3 = this$0.f140066q0;
                        if (rVar3 != null) {
                            ((zq1.v) rVar3).q3();
                            return;
                        }
                        return;
                }
            }
        });
    }
}
