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
import h32.a4;
import h32.d4;
import h32.f1;
import h32.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import x02.x2;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lbb1/s;", "Lyk1/k;", "Lya1/d;", "<init>", "()V", "n91/z", "security_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class s extends d implements ya1.d {

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f22551t0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f22552j0;

    /* renamed from: k0, reason: collision with root package name */
    public i92.k f22553k0;

    /* renamed from: l0, reason: collision with root package name */
    public cr1.a f22554l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f22555m0;

    /* renamed from: n0, reason: collision with root package name */
    public ab1.l f22556n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltTextField f22557o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltText f22558p0;

    /* renamed from: q0, reason: collision with root package name */
    public GestaltButton f22559q0;

    /* renamed from: r0, reason: collision with root package name */
    public final d4 f22560r0 = d4.MULTI_FACTOR_AUTH_ENABLE;

    /* renamed from: s0, reason: collision with root package name */
    public final a4 f22561s0 = a4.CONFIRM_PASSWORD;

    @Override // yk1.k, nl1.d
    public final void K7() {
        Window window;
        super.K7();
        FragmentActivity E4 = E4();
        if (E4 == null || (window = E4.getWindow()) == null) {
            return;
        }
        this.f22555m0 = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
    }

    @Override // yk1.k, nl1.d
    public final void L7() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            Window window = E4.getWindow();
            if (window != null) {
                window.setSoftInputMode(this.f22555m0);
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
        gestaltToolbarImpl.b0(getString(l52.c.settings_enable_mfa_step_progression, 1, 3));
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Navigation navigation = this.I;
        Object i03 = navigation != null ? navigation.i0("arg_verified_email") : null;
        String str = i03 instanceof String ? (String) i03 : null;
        uk1.e eVar = this.f22552j0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d f13 = ((uk1.a) eVar).f(s7(), "");
        uj2.q p73 = p7();
        x2 A7 = A7();
        cr1.a aVar = this.f22554l0;
        if (aVar != null) {
            return new ab1.l(f13, p73, A7, aVar, str);
        }
        Intrinsics.r("accountService");
        throw null;
    }

    public final void b8(String str) {
        i92.k kVar = this.f22553k0;
        if (kVar == null) {
            Intrinsics.r("toastUtils");
            throw null;
        }
        if (str == null) {
            str = getString(x0.generic_error);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        kVar.i(str);
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
    public final a4 getH0() {
        return this.f22561s0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getG0() {
        return this.f22560r0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = l52.b.fragment_enable_mfa_password;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(l52.a.mfa_password_edit);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f22557o0 = (GestaltTextField) findViewById;
        View findViewById2 = onCreateView.findViewById(l52.a.mfa_password_forgot);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f22558p0 = (GestaltText) findViewById2;
        View findViewById3 = onCreateView.findViewById(l52.a.mfa_password_next);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f22559q0 = (GestaltButton) findViewById3;
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        GestaltTextField gestaltTextField = this.f22557o0;
        if (gestaltTextField == null) {
            Intrinsics.r("passwordEditText");
            throw null;
        }
        gestaltTextField.addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 20));
        GestaltTextField gestaltTextField2 = this.f22557o0;
        if (gestaltTextField2 == null) {
            Intrinsics.r("passwordEditText");
            throw null;
        }
        final int i13 = 0;
        gestaltTextField2.Z(new gm1.a(this) { // from class: bb1.r

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f22550b;

            {
                this.f22550b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                Editable editable;
                int i14 = i13;
                s this$0 = this.f22550b;
                switch (i14) {
                    case 0:
                        int i15 = s.f22551t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (!(event instanceof xn1.a) || (editable = ((xn1.a) event).f135436c) == null) {
                            return;
                        }
                        GestaltButton gestaltButton = this$0.f22559q0;
                        if (gestaltButton != null) {
                            gestaltButton.d(new uq.i(3, editable));
                            return;
                        } else {
                            Intrinsics.r("nextButton");
                            throw null;
                        }
                    case 1:
                        int i16 = s.f22551t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.FORGET_PW_LINK, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        hf0.b.l(this$0.requireActivity());
                        ab1.l lVar = this$0.f22556n0;
                        if (lVar != null) {
                            lVar.q3();
                            return;
                        }
                        return;
                    default:
                        int i17 = s.f22551t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NEXT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.l lVar2 = this$0.f22556n0;
                        if (lVar2 != null) {
                            GestaltTextField gestaltTextField3 = this$0.f22557o0;
                            if (gestaltTextField3 != null) {
                                lVar2.r3(String.valueOf(gestaltTextField3.z0()));
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
        GestaltText gestaltText = this.f22558p0;
        if (gestaltText == null) {
            Intrinsics.r("passwordForgotText");
            throw null;
        }
        final int i14 = 1;
        gestaltText.j(new gm1.a(this) { // from class: bb1.r

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f22550b;

            {
                this.f22550b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                Editable editable;
                int i142 = i14;
                s this$0 = this.f22550b;
                switch (i142) {
                    case 0:
                        int i15 = s.f22551t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (!(event instanceof xn1.a) || (editable = ((xn1.a) event).f135436c) == null) {
                            return;
                        }
                        GestaltButton gestaltButton = this$0.f22559q0;
                        if (gestaltButton != null) {
                            gestaltButton.d(new uq.i(3, editable));
                            return;
                        } else {
                            Intrinsics.r("nextButton");
                            throw null;
                        }
                    case 1:
                        int i16 = s.f22551t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.FORGET_PW_LINK, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        hf0.b.l(this$0.requireActivity());
                        ab1.l lVar = this$0.f22556n0;
                        if (lVar != null) {
                            lVar.q3();
                            return;
                        }
                        return;
                    default:
                        int i17 = s.f22551t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NEXT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.l lVar2 = this$0.f22556n0;
                        if (lVar2 != null) {
                            GestaltTextField gestaltTextField3 = this$0.f22557o0;
                            if (gestaltTextField3 != null) {
                                lVar2.r3(String.valueOf(gestaltTextField3.z0()));
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
        GestaltButton gestaltButton = this.f22559q0;
        if (gestaltButton == null) {
            Intrinsics.r("nextButton");
            throw null;
        }
        final int i15 = 2;
        gestaltButton.d(h.f22502o).e(new gm1.a(this) { // from class: bb1.r

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f22550b;

            {
                this.f22550b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                Editable editable;
                int i142 = i15;
                s this$0 = this.f22550b;
                switch (i142) {
                    case 0:
                        int i152 = s.f22551t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (!(event instanceof xn1.a) || (editable = ((xn1.a) event).f135436c) == null) {
                            return;
                        }
                        GestaltButton gestaltButton2 = this$0.f22559q0;
                        if (gestaltButton2 != null) {
                            gestaltButton2.d(new uq.i(3, editable));
                            return;
                        } else {
                            Intrinsics.r("nextButton");
                            throw null;
                        }
                    case 1:
                        int i16 = s.f22551t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.FORGET_PW_LINK, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        hf0.b.l(this$0.requireActivity());
                        ab1.l lVar = this$0.f22556n0;
                        if (lVar != null) {
                            lVar.q3();
                            return;
                        }
                        return;
                    default:
                        int i17 = s.f22551t0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "it");
                        this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.NEXT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        ab1.l lVar2 = this$0.f22556n0;
                        if (lVar2 != null) {
                            GestaltTextField gestaltTextField3 = this$0.f22557o0;
                            if (gestaltTextField3 != null) {
                                lVar2.r3(String.valueOf(gestaltTextField3.z0()));
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
