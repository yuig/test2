package zz1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.w2;
import lh0.z3;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzz1/d0;", "Lnl1/d;", "", "<init>", "()V", "recoveryV2p_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class d0 extends w {

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ int f143172o0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public GestaltText f143173c0;

    /* renamed from: d0, reason: collision with root package name */
    public GestaltText f143174d0;

    /* renamed from: e0, reason: collision with root package name */
    public GestaltIconButton f143175e0;

    /* renamed from: f0, reason: collision with root package name */
    public GestaltText f143176f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltButton f143177g0;

    /* renamed from: i0, reason: collision with root package name */
    public Function1 f143179i0;

    /* renamed from: k0, reason: collision with root package name */
    public vy.m f143181k0;

    /* renamed from: l0, reason: collision with root package name */
    public i92.k f143182l0;

    /* renamed from: m0, reason: collision with root package name */
    public lb2.q f143183m0;

    /* renamed from: n0, reason: collision with root package name */
    public w2 f143184n0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f143178h0 = true;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f143180j0 = true;

    public final void Y7(gm1.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int j13 = event.j();
        if (j13 != yz1.a.first_option_button) {
            if (j13 == yz1.a.close_button_recovery && (event instanceof om1.l)) {
                vy.m mVar = this.f143181k0;
                if (mVar == null) {
                    Intrinsics.r("analyticsApi");
                    throw null;
                }
                mVar.a("recovery_v2_fb_google_link_dismiss");
                nx.d0.B(s7(), f1.AUTH_COLLECTION_DISMISS, g0.LINK_GOOGLE_MODAL, null, null, 28);
                Function1 function1 = this.f143179i0;
                if (function1 != null) {
                    function1.invoke(b02.b.f20771a);
                    return;
                }
                return;
            }
            return;
        }
        if (event instanceof xl1.a) {
            if (this.f143180j0) {
                s7().h0((r18 & 1) != 0 ? f1.TAP : f1.AUTH_COLLECTION_CLICK, (r18 & 2) != 0 ? null : u0.GOOGLE_CONTINUE_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                vy.m mVar2 = this.f143181k0;
                if (mVar2 == null) {
                    Intrinsics.r("analyticsApi");
                    throw null;
                }
                mVar2.a("recovery_v2_fb_gplus_connection_request");
                Z7();
                return;
            }
            vy.m mVar3 = this.f143181k0;
            if (mVar3 == null) {
                Intrinsics.r("analyticsApi");
                throw null;
            }
            mVar3.a("recovery_v2_fb_go_to_password_screen");
            s7().h0((r18 & 1) != 0 ? f1.TAP : f1.AUTH_COLLECTION_CLICK, (r18 & 2) != 0 ? null : u0.AUTH_COLLECTION_PASSWORD_INPUT, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            Function1 function12 = this.f143179i0;
            if (function12 != null) {
                function12.invoke(b02.g.f20777a);
            }
        }
    }

    public final void Z7() {
        lb2.q qVar = this.f143183m0;
        if (qVar == null) {
            Intrinsics.r("authManager");
            throw null;
        }
        lr1.h hVar = lr1.h.GoogleUnifiedAuthMethod;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        qVar.f(hVar, bs1.c.m(requireActivity)).r(tk2.e.f118017c).l(wj2.c.a()).o(new yx1.l(16, new b0(this, 0)), new yx1.l(17, new b0(this, 1)));
    }

    public final void a8(a02.c eventFlow) {
        Intrinsics.checkNotNullParameter(eventFlow, "eventFlow");
        this.f143179i0 = eventFlow;
    }

    public final void b8(rg0.n experienceValue) {
        Intrinsics.checkNotNullParameter(experienceValue, "experienceValue");
    }

    public final void c8(boolean z13) {
        this.f143180j0 = z13;
    }

    public final void d8(boolean z13) {
        this.f143178h0 = z13;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF75509a1() {
        return d4.UNKNOWN_VIEW;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.E = this.f143180j0 ? yz1.b.link_google_account_first_option : yz1.b.create_password_first_option;
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(yz1.a.header);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f143173c0 = (GestaltText) findViewById;
        View findViewById2 = view.findViewById(yz1.a.subheader);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f143174d0 = (GestaltText) findViewById2;
        View findViewById3 = view.findViewById(yz1.a.close_button_recovery);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f143175e0 = (GestaltIconButton) findViewById3;
        View findViewById4 = view.findViewById(yz1.a.second_option_text);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f143176f0 = (GestaltText) findViewById4;
        View findViewById5 = view.findViewById(yz1.a.first_option_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f143177g0 = (GestaltButton) findViewById5;
        View findViewById6 = view.findViewById(yz1.a.container);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        w2 w2Var = this.f143184n0;
        if (w2Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) w2Var.f83497a;
        if (g1Var.o("android_arr_modal_fb_deprecated", "enabled", z3Var) || g1Var.l("android_arr_modal_fb_deprecated")) {
            GestaltText gestaltText = this.f143173c0;
            if (gestaltText == null) {
                Intrinsics.r("header");
                throw null;
            }
            gestaltText.i(new b0(this, 2));
            GestaltText gestaltText2 = this.f143174d0;
            if (gestaltText2 == null) {
                Intrinsics.r("subheader");
                throw null;
            }
            gestaltText2.i(new b0(this, 3));
        } else {
            GestaltText gestaltText3 = this.f143173c0;
            if (gestaltText3 == null) {
                Intrinsics.r("header");
                throw null;
            }
            gestaltText3.i(k.f143205m);
            GestaltText gestaltText4 = this.f143174d0;
            if (gestaltText4 == null) {
                Intrinsics.r("subheader");
                throw null;
            }
            gestaltText4.i(new b0(this, 4));
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        GestaltText gestaltText5 = this.f143176f0;
        if (gestaltText5 == null) {
            Intrinsics.r("secondOptionText");
            throw null;
        }
        String string = getString(yz1.c.gbl_prefer_another_way_placeholder);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(this.f143180j0 ? yz1.c.gbl_create_password : yz1.c.gbl_link_account_to_google);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        f0.h.n(requireContext, gestaltText5, string, string2);
        GestaltButton gestaltButton = this.f143177g0;
        if (gestaltButton == null) {
            Intrinsics.r("firstOptionBtn");
            throw null;
        }
        gestaltButton.e(new c0(this, 0));
        if (this.f143178h0) {
            GestaltIconButton gestaltIconButton = this.f143175e0;
            if (gestaltIconButton == null) {
                Intrinsics.r("closeButton");
                throw null;
            }
            com.bumptech.glide.c.u1(gestaltIconButton);
        } else {
            GestaltIconButton gestaltIconButton2 = this.f143175e0;
            if (gestaltIconButton2 == null) {
                Intrinsics.r("closeButton");
                throw null;
            }
            com.bumptech.glide.c.d0(gestaltIconButton2);
        }
        GestaltIconButton gestaltIconButton3 = this.f143175e0;
        if (gestaltIconButton3 == null) {
            Intrinsics.r("closeButton");
            throw null;
        }
        gestaltIconButton3.u(new c0(this, 1));
        GestaltText gestaltText6 = this.f143176f0;
        if (gestaltText6 != null) {
            gestaltText6.setOnClickListener(new wq1.a(this, 18));
        } else {
            Intrinsics.r("secondOptionText");
            throw null;
        }
    }
}
