package bb1;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
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
import com.pinterest.screens.l4;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lbb1/p;", "Lyk1/k;", "Lya1/c;", "<init>", "()V", "n91/z", "security_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class p extends c implements ya1.c {

    /* renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ int f22536v0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f22537j0;

    /* renamed from: k0, reason: collision with root package name */
    public i92.k f22538k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f22539l0;

    /* renamed from: m0, reason: collision with root package name */
    public ab1.h f22540m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltText f22541n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltText f22542o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltTextField f22543p0;

    /* renamed from: q0, reason: collision with root package name */
    public GestaltText f22544q0;

    /* renamed from: r0, reason: collision with root package name */
    public GestaltButton f22545r0;

    /* renamed from: s0, reason: collision with root package name */
    public String f22546s0;

    /* renamed from: t0, reason: collision with root package name */
    public final d4 f22547t0 = d4.MULTI_FACTOR_AUTH_ENABLE;

    /* renamed from: u0, reason: collision with root package name */
    public final a4 f22548u0 = a4.CONFIRM_EMAIL;

    @Override // yk1.k, nl1.d
    public final void K7() {
        Window window;
        super.K7();
        FragmentActivity E4 = E4();
        if (E4 == null || (window = E4.getWindow()) == null) {
            return;
        }
        this.f22539l0 = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
    }

    @Override // yk1.k, nl1.d
    public final void L7() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            Window window = E4.getWindow();
            if (window != null) {
                window.setSoftInputMode(this.f22539l0);
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
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.f22537j0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d f13 = ((uk1.a) eVar).f(s7(), "");
        uj2.q p73 = p7();
        return new ab1.h(f7(), f13, A7(), p73);
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
    public final a4 getF140068s0() {
        return this.f22548u0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF55071t0() {
        return this.f22547t0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = l52.b.fragment_enable_mfa_confirm_email;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f22546s0 = bundle != null ? bundle.getString("Email") : null;
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(l52.a.mfa_confirm_email_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f22541n0 = (GestaltText) findViewById;
        View findViewById2 = onCreateView.findViewById(l52.a.mfa_confirm_email_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f22542o0 = (GestaltText) findViewById2;
        View findViewById3 = onCreateView.findViewById(l52.a.mfa_confirm_email_edit);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f22543p0 = (GestaltTextField) findViewById3;
        View findViewById4 = onCreateView.findViewById(l52.a.mfa_confirm_email_error);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f22544q0 = (GestaltText) findViewById4;
        View findViewById5 = onCreateView.findViewById(l52.a.mfa_confirm_email_next);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f22545r0 = (GestaltButton) findViewById5;
        return onCreateView;
    }

    @Override // yk1.k, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        GestaltTextField gestaltTextField = this.f22543p0;
        if (gestaltTextField != null) {
            outState.putString("Email", String.valueOf(gestaltTextField.z0()));
        } else {
            Intrinsics.r("emailEditableText");
            throw null;
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        final int i13 = 1;
        final int i14 = 0;
        if (this.f22546s0 != null) {
            GestaltTextField gestaltTextField = this.f22543p0;
            if (gestaltTextField == null) {
                Intrinsics.r("emailEditableText");
                throw null;
            }
            gestaltTextField.X(new o(this, i14));
            GestaltButton gestaltButton = this.f22545r0;
            if (gestaltButton == null) {
                Intrinsics.r("nextButton");
                throw null;
            }
            gestaltButton.setEnabled(true);
        } else {
            GestaltTextField gestaltTextField2 = this.f22543p0;
            if (gestaltTextField2 == null) {
                Intrinsics.r("emailEditableText");
                throw null;
            }
            gestaltTextField2.addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 19));
        }
        GestaltTextField gestaltTextField3 = this.f22543p0;
        if (gestaltTextField3 == null) {
            Intrinsics.r("emailEditableText");
            throw null;
        }
        gestaltTextField3.Z(new gm1.a(this) { // from class: bb1.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f22533b;

            {
                this.f22533b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c gestaltEvent) {
                Editable editable;
                int i15 = i14;
                p this$0 = this.f22533b;
                switch (i15) {
                    case 0:
                        int i16 = p.f22536v0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(gestaltEvent, "gestaltEvent");
                        if (!(gestaltEvent instanceof xn1.a) || (editable = ((xn1.a) gestaltEvent).f135436c) == null) {
                            return;
                        }
                        GestaltButton gestaltButton2 = this$0.f22545r0;
                        if (gestaltButton2 != null) {
                            gestaltButton2.d(new uq.i(2, editable));
                            return;
                        } else {
                            Intrinsics.r("nextButton");
                            throw null;
                        }
                    case 1:
                        int i17 = p.f22536v0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(gestaltEvent, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.UPDATE_EMAIL_ADDRESS_TXT, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        hf0.b.l(this$0.requireActivity());
                        this$0.f7().d(Navigation.w1(l4.a()));
                        return;
                    default:
                        int i18 = p.f22536v0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(gestaltEvent, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NEXT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.h hVar = this$0.f22540m0;
                        if (hVar != null) {
                            GestaltTextField gestaltTextField4 = this$0.f22543p0;
                            if (gestaltTextField4 != null) {
                                hVar.p3(String.valueOf(gestaltTextField4.z0()));
                                return;
                            } else {
                                Intrinsics.r("emailEditableText");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        GestaltText gestaltText = this.f22544q0;
        if (gestaltText == null) {
            Intrinsics.r("incorrectEmailText");
            throw null;
        }
        gestaltText.j(new gm1.a(this) { // from class: bb1.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f22533b;

            {
                this.f22533b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c gestaltEvent) {
                Editable editable;
                int i15 = i13;
                p this$0 = this.f22533b;
                switch (i15) {
                    case 0:
                        int i16 = p.f22536v0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(gestaltEvent, "gestaltEvent");
                        if (!(gestaltEvent instanceof xn1.a) || (editable = ((xn1.a) gestaltEvent).f135436c) == null) {
                            return;
                        }
                        GestaltButton gestaltButton2 = this$0.f22545r0;
                        if (gestaltButton2 != null) {
                            gestaltButton2.d(new uq.i(2, editable));
                            return;
                        } else {
                            Intrinsics.r("nextButton");
                            throw null;
                        }
                    case 1:
                        int i17 = p.f22536v0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(gestaltEvent, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.UPDATE_EMAIL_ADDRESS_TXT, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        hf0.b.l(this$0.requireActivity());
                        this$0.f7().d(Navigation.w1(l4.a()));
                        return;
                    default:
                        int i18 = p.f22536v0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(gestaltEvent, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NEXT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.h hVar = this$0.f22540m0;
                        if (hVar != null) {
                            GestaltTextField gestaltTextField4 = this$0.f22543p0;
                            if (gestaltTextField4 != null) {
                                hVar.p3(String.valueOf(gestaltTextField4.z0()));
                                return;
                            } else {
                                Intrinsics.r("emailEditableText");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        GestaltButton gestaltButton2 = this.f22545r0;
        if (gestaltButton2 == null) {
            Intrinsics.r("nextButton");
            throw null;
        }
        final int i15 = 2;
        gestaltButton2.d(h.f22501n).e(new gm1.a(this) { // from class: bb1.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f22533b;

            {
                this.f22533b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c gestaltEvent) {
                Editable editable;
                int i152 = i15;
                p this$0 = this.f22533b;
                switch (i152) {
                    case 0:
                        int i16 = p.f22536v0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(gestaltEvent, "gestaltEvent");
                        if (!(gestaltEvent instanceof xn1.a) || (editable = ((xn1.a) gestaltEvent).f135436c) == null) {
                            return;
                        }
                        GestaltButton gestaltButton22 = this$0.f22545r0;
                        if (gestaltButton22 != null) {
                            gestaltButton22.d(new uq.i(2, editable));
                            return;
                        } else {
                            Intrinsics.r("nextButton");
                            throw null;
                        }
                    case 1:
                        int i17 = p.f22536v0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(gestaltEvent, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.UPDATE_EMAIL_ADDRESS_TXT, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        hf0.b.l(this$0.requireActivity());
                        this$0.f7().d(Navigation.w1(l4.a()));
                        return;
                    default:
                        int i18 = p.f22536v0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(gestaltEvent, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NEXT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.h hVar = this$0.f22540m0;
                        if (hVar != null) {
                            GestaltTextField gestaltTextField4 = this$0.f22543p0;
                            if (gestaltTextField4 != null) {
                                hVar.p3(String.valueOf(gestaltTextField4.z0()));
                                return;
                            } else {
                                Intrinsics.r("emailEditableText");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
    }
}
