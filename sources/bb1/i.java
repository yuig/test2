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
import h32.a4;
import h32.d4;
import h32.f1;
import h32.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x02.x2;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lbb1/i;", "Lyk1/k;", "Lya1/a;", "<init>", "()V", "security_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class i extends a implements ya1.a {

    /* renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f22508s0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f22509j0;

    /* renamed from: k0, reason: collision with root package name */
    public cr1.a f22510k0;

    /* renamed from: l0, reason: collision with root package name */
    public i92.k f22511l0;

    /* renamed from: m0, reason: collision with root package name */
    public ab1.c f22512m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltTextField f22513n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltText f22514o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltButton f22515p0;

    /* renamed from: q0, reason: collision with root package name */
    public final d4 f22516q0 = d4.MULTI_FACTOR_AUTH_DISABLE;

    /* renamed from: r0, reason: collision with root package name */
    public final a4 f22517r0 = a4.CONFIRM_PASSWORD;

    @Override // yk1.k, nl1.d
    public final void K7() {
        Window window;
        super.K7();
        FragmentActivity E4 = E4();
        if (E4 == null || (window = E4.getWindow()) == null) {
            return;
        }
        int i13 = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
    }

    @Override // yk1.k, nl1.d
    public final void L7() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
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
        gestaltToolbarImpl.b0(getString(l52.c.settings_disable_mfa_header));
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.f22509j0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d f13 = ((uk1.a) eVar).f(s7(), "");
        uj2.q p73 = p7();
        x2 A7 = A7();
        cr1.a aVar = this.f22510k0;
        if (aVar != null) {
            return new ab1.c(f13, p73, A7, aVar, f7());
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
        return this.f22517r0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF22516q0() {
        return this.f22516q0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = l52.b.fragment_disable_mfa;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(l52.a.mfa_password_edit);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f22513n0 = (GestaltTextField) findViewById;
        View findViewById2 = onCreateView.findViewById(l52.a.mfa_password_forgot);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f22514o0 = (GestaltText) findViewById2;
        View findViewById3 = onCreateView.findViewById(l52.a.mfa_password_next);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f22515p0 = (GestaltButton) findViewById3;
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        GestaltTextField gestaltTextField = this.f22513n0;
        if (gestaltTextField == null) {
            Intrinsics.r("passwordEditText");
            throw null;
        }
        gestaltTextField.addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 17));
        GestaltTextField gestaltTextField2 = this.f22513n0;
        if (gestaltTextField2 == null) {
            Intrinsics.r("passwordEditText");
            throw null;
        }
        final int i13 = 0;
        gestaltTextField2.Z(new gm1.a(this) { // from class: bb1.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f22496b;

            {
                this.f22496b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                Editable editable;
                int i14 = i13;
                i this$0 = this.f22496b;
                switch (i14) {
                    case 0:
                        int i15 = i.f22508s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (!(event instanceof xn1.a) || (editable = ((xn1.a) event).f135436c) == null) {
                            return;
                        }
                        GestaltButton gestaltButton = this$0.f22515p0;
                        if (gestaltButton != null) {
                            gestaltButton.d(new uq.i(1, editable));
                            return;
                        } else {
                            Intrinsics.r("nextButton");
                            throw null;
                        }
                    case 1:
                        int i16 = i.f22508s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.FORGET_PW_LINK, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        hf0.b.l(this$0.requireActivity());
                        ab1.c cVar = this$0.f22512m0;
                        if (cVar != null) {
                            cVar.r3(false);
                            return;
                        }
                        return;
                    default:
                        int i17 = i.f22508s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NEXT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.c cVar2 = this$0.f22512m0;
                        if (cVar2 != null) {
                            GestaltTextField gestaltTextField3 = this$0.f22513n0;
                            if (gestaltTextField3 != null) {
                                cVar2.s3(String.valueOf(gestaltTextField3.z0()));
                                return;
                            } else {
                                Intrinsics.r("passwordEditText");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        GestaltText gestaltText = this.f22514o0;
        if (gestaltText == null) {
            Intrinsics.r("passwordForgotText");
            throw null;
        }
        final int i14 = 1;
        gestaltText.j(new gm1.a(this) { // from class: bb1.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f22496b;

            {
                this.f22496b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                Editable editable;
                int i142 = i14;
                i this$0 = this.f22496b;
                switch (i142) {
                    case 0:
                        int i15 = i.f22508s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (!(event instanceof xn1.a) || (editable = ((xn1.a) event).f135436c) == null) {
                            return;
                        }
                        GestaltButton gestaltButton = this$0.f22515p0;
                        if (gestaltButton != null) {
                            gestaltButton.d(new uq.i(1, editable));
                            return;
                        } else {
                            Intrinsics.r("nextButton");
                            throw null;
                        }
                    case 1:
                        int i16 = i.f22508s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.FORGET_PW_LINK, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        hf0.b.l(this$0.requireActivity());
                        ab1.c cVar = this$0.f22512m0;
                        if (cVar != null) {
                            cVar.r3(false);
                            return;
                        }
                        return;
                    default:
                        int i17 = i.f22508s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NEXT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.c cVar2 = this$0.f22512m0;
                        if (cVar2 != null) {
                            GestaltTextField gestaltTextField3 = this$0.f22513n0;
                            if (gestaltTextField3 != null) {
                                cVar2.s3(String.valueOf(gestaltTextField3.z0()));
                                return;
                            } else {
                                Intrinsics.r("passwordEditText");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        GestaltButton gestaltButton = this.f22515p0;
        if (gestaltButton == null) {
            Intrinsics.r("nextButton");
            throw null;
        }
        final int i15 = 2;
        gestaltButton.d(h.f22498k).e(new gm1.a(this) { // from class: bb1.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f22496b;

            {
                this.f22496b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                Editable editable;
                int i142 = i15;
                i this$0 = this.f22496b;
                switch (i142) {
                    case 0:
                        int i152 = i.f22508s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (!(event instanceof xn1.a) || (editable = ((xn1.a) event).f135436c) == null) {
                            return;
                        }
                        GestaltButton gestaltButton2 = this$0.f22515p0;
                        if (gestaltButton2 != null) {
                            gestaltButton2.d(new uq.i(1, editable));
                            return;
                        } else {
                            Intrinsics.r("nextButton");
                            throw null;
                        }
                    case 1:
                        int i16 = i.f22508s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.FORGET_PW_LINK, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        hf0.b.l(this$0.requireActivity());
                        ab1.c cVar = this$0.f22512m0;
                        if (cVar != null) {
                            cVar.r3(false);
                            return;
                        }
                        return;
                    default:
                        int i17 = i.f22508s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NEXT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.c cVar2 = this$0.f22512m0;
                        if (cVar2 != null) {
                            GestaltTextField gestaltTextField3 = this$0.f22513n0;
                            if (gestaltTextField3 != null) {
                                cVar2.s3(String.valueOf(gestaltTextField3.z0()));
                                return;
                            } else {
                                Intrinsics.r("passwordEditText");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
    }
}
