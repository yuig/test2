package jq1;

import a.cb;
import a.z0;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.v0;
import com.pinterest.api.model.qk0;
import com.pinterest.design.brio.widget.progress.PinterestLoadingLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.sharesheet.view.AnimatedSendShareButton;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.grid.PinterestRecyclerView;
import df.j1;
import h32.a4;
import h32.d4;
import h32.g0;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import nm.u;
import pk.a0;
import so.oa;
import so.p;
import so.q;
import yq0.z;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljq1/n;", "Ljd1/d;", "Lgq1/c;", "Lnr0/j;", "Ldl1/s;", "<init>", "()V", "ideaPinDisplay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class n extends f implements gq1.c {
    public static final /* synthetic */ int H1 = 0;
    public GestaltText A1;
    public GestaltButton B1;
    public GestaltText C1;
    public PinterestRecyclerView D1;
    public final xj2.b E1 = new xj2.b();
    public final xk2.k F1;
    public final xk2.k G1;

    /* renamed from: h1, reason: collision with root package name */
    public hf0.c f77501h1;

    /* renamed from: i1, reason: collision with root package name */
    public f0 f77502i1;

    /* renamed from: j1, reason: collision with root package name */
    public p f77503j1;

    /* renamed from: k1, reason: collision with root package name */
    public gq1.b f77504k1;

    /* renamed from: l1, reason: collision with root package name */
    public q f77505l1;

    /* renamed from: m1, reason: collision with root package name */
    public View f77506m1;

    /* renamed from: n1, reason: collision with root package name */
    public ViewGroup f77507n1;

    /* renamed from: o1, reason: collision with root package name */
    public GestaltText f77508o1;

    /* renamed from: p1, reason: collision with root package name */
    public GestaltAvatar f77509p1;

    /* renamed from: q1, reason: collision with root package name */
    public GestaltText f77510q1;

    /* renamed from: r1, reason: collision with root package name */
    public GestaltText f77511r1;

    /* renamed from: s1, reason: collision with root package name */
    public GestaltText f77512s1;

    /* renamed from: t1, reason: collision with root package name */
    public GestaltText f77513t1;

    /* renamed from: u1, reason: collision with root package name */
    public GestaltText f77514u1;

    /* renamed from: v1, reason: collision with root package name */
    public LinearLayout f77515v1;

    /* renamed from: w1, reason: collision with root package name */
    public GestaltButton f77516w1;

    /* renamed from: x1, reason: collision with root package name */
    public AnimatedSendShareButton f77517x1;

    /* renamed from: y1, reason: collision with root package name */
    public iq1.e f77518y1;

    /* renamed from: z1, reason: collision with root package name */
    public String f77519z1;

    public n() {
        xk2.n nVar = xk2.n.NONE;
        this.F1 = xk2.m.a(nVar, new j(this, 2));
        this.G1 = xk2.m.a(nVar, new j(this, 1));
    }

    public static final void C9(n nVar, int i13) {
        ca2.e D9 = nVar.D9();
        D9.f27245d = i13;
        if (!hf0.b.q()) {
            ca2.e.w(D9, 0, null, null, null, 15);
            return;
        }
        PinterestRecyclerView pinterestRecyclerView = nVar.D1;
        if (pinterestRecyclerView == null) {
            Intrinsics.r("recyclerView");
            throw null;
        }
        int i14 = i13 * 2;
        pinterestRecyclerView.getLayoutParams().height = i14;
        ca2.e.w(D9, i14, null, null, null, 14);
    }

    public final ca2.e D9() {
        return (ca2.e) this.G1.getValue();
    }

    public final boolean E9() {
        Navigation navigation = this.I;
        return navigation != null && navigation.w("com.pinterest.EXTRA_SHOP_CATEGORY");
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void K7() {
        requireActivity().getWindow().addFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        super.K7();
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void L7() {
        requireActivity().getWindow().clearFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        super.L7();
    }

    @Override // jd1.d, sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL, new j(this, 3));
    }

    @Override // jd1.d, yk1.k
    public final yk1.m V7() {
        Navigation navigation = this.I;
        Object X0 = navigation != null ? navigation.X0() : null;
        qk0 qk0Var = X0 instanceof qk0 ? (qk0) X0 : null;
        Navigation navigation2 = this.I;
        Object X02 = navigation2 != null ? navigation2.X0() : null;
        qf1.n nVar = X02 instanceof qf1.n ? (qf1.n) X02 : null;
        Navigation navigation3 = this.I;
        String f49940b = navigation3 != null ? navigation3.getF49940b() : null;
        Navigation navigation4 = this.I;
        boolean S = navigation4 != null ? navigation4.S("com.pinterest.EXTRA_STORY_PIN_PAGE_IS_AD", false) : false;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        uk1.d p93 = p9();
        p93.d(getF91831t0(), getG0(), null, getF123811z0(), null);
        String q73 = q7();
        if (q73 != null) {
            p93.f122380b = q73;
        }
        Navigation navigation5 = this.I;
        String v03 = navigation5 != null ? navigation5.v0("IDEA_STREAM_EXTRAS_KEY_PARENT_PAIR_ID") : null;
        if (v03 != null) {
            p93.f122383e = v03;
        }
        bVar.g(p93);
        bVar.f(m9());
        wk1.c a13 = bVar.a();
        q qVar = this.f77505l1;
        if (qVar == null) {
            Intrinsics.r("ideaPinBottomSheetPresenterFactory");
            throw null;
        }
        iq1.e a14 = qVar.a(qk0Var, f49940b, S, g9(), a13, h9(), getO0(), nVar, E9());
        this.f77518y1 = a14;
        return a14;
    }

    @Override // jd1.d
    public final String g9() {
        Navigation navigation = this.I;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        f0 f0Var = this.f77502i1;
        if (f0Var != null) {
            f0Var.N(f49940b, "A valid ID must be passed through the navigation object or getApiEndpoint() will return an invalid URL.", new Object[0]);
            return j1.V(E9() ? "storypins/%s/stela/pins/" : "storypins/%s/products/", f49940b);
        }
        Intrinsics.r("devUtils");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getAuxData */
    public final HashMap getO0() {
        Navigation navigation = this.I;
        HashMap hashMap = null;
        if (navigation == null) {
            return null;
        }
        if (E9()) {
            hashMap = new HashMap();
            u uVar = new u();
            String v03 = navigation.v0("com.pinterest.EXTRA_SHOP_CATEGORY");
            if (v03 != null) {
                uVar.u("category_id", v03);
            }
            uVar.u("idea_pin_id", navigation.getF49940b());
            String sVar = uVar.toString();
            Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
            hashMap.put("commerce_data", sVar);
        }
        return hashMap;
    }

    @Override // jd1.d, uk1.c
    /* renamed from: getComponentType */
    public final g0 getF123811z0() {
        String v03;
        g0 valueOf;
        if (E9()) {
            return null;
        }
        Navigation navigation = this.I;
        return (navigation == null || (v03 = navigation.v0("IDEA_STREAM_EXTRAS_KEY_COMPONENT_TYPE")) == null || (valueOf = g0.valueOf(v03)) == null) ? g0.PIN_STORY_PIN_PAGE : valueOf;
    }

    @Override // jd1.d, uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getG0() {
        String v03;
        a4 valueOf;
        Navigation navigation = this.I;
        return (navigation == null || (v03 = navigation.v0("IDEA_STREAM_EXTRAS_KEY_VIEW_PARAMETER_TYPE")) == null || (valueOf = a4.valueOf(v03)) == null) ? a4.STORY_PIN_LIST : valueOf;
    }

    @Override // jd1.d, nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF91831t0() {
        String v03;
        d4 valueOf;
        Navigation navigation = this.I;
        return (navigation == null || (v03 = navigation.v0("IDEA_STREAM_EXTRAS_KEY_VIEW_TYPE")) == null || (valueOf = d4.valueOf(v03)) == null) ? d4.MODAL : valueOf;
    }

    @Override // jd1.d
    public final HashMap h9() {
        String v03;
        HashMap h93 = super.h9();
        if (E9()) {
            Navigation navigation = this.I;
            if (navigation != null && (v03 = navigation.v0("com.pinterest.EXTRA_SHOP_CATEGORY")) != null) {
            }
            Navigation navigation2 = this.I;
            if (navigation2 != null) {
            }
        }
        return h93;
    }

    @Override // jd1.d, yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(fq1.c.idea_pin_list_bottom_sheet_fragment, fq1.b.p_recycler_view);
        eVar.b(fq1.b.idea_pin_bottom_sheet_loading_layout);
        return eVar;
    }

    @Override // jd1.d, sq0.e, yq0.t
    public final v0 n8() {
        return t9();
    }

    @Override // jd1.d, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        this.L = false;
        this.M = true;
        super.onCreate(bundle);
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(fq1.b.idea_pin_list_bottom_sheet_background);
        findViewById.setAlpha(0.0f);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f77506m1 = findViewById;
        View findViewById2 = onCreateView.findViewById(fq1.b.header_placeholder_view);
        ViewGroup viewGroup2 = (ViewGroup) findViewById2;
        Context context = getContext();
        GestaltIconButton gestaltIconButton = null;
        if (context != null) {
            GestaltIconButton gestaltIconButton2 = new GestaltIconButton(6, context, (AttributeSet) null);
            gestaltIconButton2.t(k.f77490j);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int W = bs1.c.W(gestaltIconButton2, eo1.c.space_200);
            layoutParams.setMarginStart(W);
            layoutParams.topMargin = W;
            layoutParams.gravity = 8388627;
            gestaltIconButton2.setLayoutParams(layoutParams);
            gestaltIconButton2.u(new g(this, 2));
            gestaltIconButton = gestaltIconButton2;
        }
        viewGroup2.addView(gestaltIconButton);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f77507n1 = viewGroup2;
        View findViewById3 = onCreateView.findViewById(fq1.b.bottom_sheet_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f77508o1 = (GestaltText) findViewById3;
        View findViewById4 = onCreateView.findViewById(fq1.b.creator_avatar);
        GestaltAvatar gestaltAvatar = (GestaltAvatar) findViewById4;
        gestaltAvatar.H2(k.f77492l);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f77509p1 = gestaltAvatar;
        View findViewById5 = onCreateView.findViewById(fq1.b.creator_name);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f77510q1 = (GestaltText) findViewById5;
        View findViewById6 = onCreateView.findViewById(fq1.b.affiliate_disclosure);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f77511r1 = (GestaltText) findViewById6;
        View findViewById7 = onCreateView.findViewById(fq1.b.description);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f77512s1 = (GestaltText) findViewById7;
        View findViewById8 = onCreateView.findViewById(fq1.b.key_value_blocks);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f77513t1 = (GestaltText) findViewById8;
        View findViewById9 = onCreateView.findViewById(fq1.b.list_blocks);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f77514u1 = (GestaltText) findViewById9;
        View findViewById10 = onCreateView.findViewById(fq1.b.rich_recipe_container);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f77515v1 = (LinearLayout) findViewById10;
        View findViewById11 = onCreateView.findViewById(fq1.b.ads_action_button);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.B1 = (GestaltButton) findViewById11;
        View findViewById12 = onCreateView.findViewById(fq1.b.ads_description);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.A1 = (GestaltText) findViewById12;
        View findViewById13 = onCreateView.findViewById(fq1.b.bottom_sheet_link);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        this.C1 = (GestaltText) findViewById13;
        final int i13 = 0;
        this.f77516w1 = ((GestaltButton) onCreateView.findViewById(fq1.b.copy_list_button)).e(new g(this, i13));
        View findViewById14 = onCreateView.findViewById(fq1.b.send_share_button);
        AnimatedSendShareButton animatedSendShareButton = (AnimatedSendShareButton) findViewById14;
        animatedSendShareButton.setVisibility(0);
        animatedSendShareButton.setOnClickListener(new View.OnClickListener(this) { // from class: jq1.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f77485b;

            {
                this.f77485b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                n this$0 = this.f77485b;
                switch (i14) {
                    case 0:
                        int i15 = n.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        iq1.e eVar = this$0.f77518y1;
                        if (eVar != null) {
                            eVar.w3();
                            return;
                        } else {
                            Intrinsics.r("presenter");
                            throw null;
                        }
                    default:
                        int i16 = n.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.f77501h1 == null) {
                            Intrinsics.r("deviceInfoProvider");
                            throw null;
                        }
                        ca2.e.i(this$0.D9(), "navigation", hf0.b.f69003c - this$0.D9().g(), null, 4);
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById14, "apply(...)");
        this.f77517x1 = animatedSendShareButton;
        D9().m(onCreateView.findViewById(fq1.b.idea_pin_list_bottom_sheet));
        View findViewById15 = onCreateView.findViewById(fq1.b.p_recycler_view);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(...)");
        this.D1 = (PinterestRecyclerView) findViewById15;
        NestedScrollView nestedScrollView = (NestedScrollView) onCreateView.findViewById(fq1.b.idea_pin_list_bottom_sheet_scroll_view);
        Intrinsics.f(nestedScrollView);
        nestedScrollView.k0(new z0(this, 26));
        final int i14 = 1;
        onCreateView.setOnClickListener(new View.OnClickListener(this) { // from class: jq1.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f77485b;

            {
                this.f77485b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                n this$0 = this.f77485b;
                switch (i142) {
                    case 0:
                        int i15 = n.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        iq1.e eVar = this$0.f77518y1;
                        if (eVar != null) {
                            eVar.w3();
                            return;
                        } else {
                            Intrinsics.r("presenter");
                            throw null;
                        }
                    default:
                        int i16 = n.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.f77501h1 == null) {
                            Intrinsics.r("deviceInfoProvider");
                            throw null;
                        }
                        ca2.e.i(this$0.D9(), "navigation", hf0.b.f69003c - this$0.D9().g(), null, 4);
                        return;
                }
            }
        });
        View findViewById16 = onCreateView.findViewById(fq1.b.idea_pin_bottom_sheet_loading_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "findViewById(...)");
        pe.i.q1((PinterestLoadingLayout) findViewById16);
        if (E9()) {
            bs1.c.R1(onCreateView.findViewById(fq1.b.bottom_sheet_linear_layout), false);
            View findViewById17 = onCreateView.findViewById(fq1.b.idea_pin_bottom_sheet_toolbar_layout);
            Intrinsics.checkNotNullExpressionValue(findViewById17, "findViewById(...)");
            findViewById17.setPaddingRelative(findViewById17.getPaddingStart(), findViewById17.getPaddingTop(), findViewById17.getPaddingEnd(), 0);
            ((GestaltText) onCreateView.findViewById(fq1.b.header_place_holder_title)).i(new an1.i(this, 29));
        }
        return onCreateView;
    }

    @Override // jd1.d, sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        D9().l();
        this.E1.dispose();
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a0.d1(requireActivity);
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a0.D(requireActivity);
    }

    @Override // jd1.d, sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        b9(0);
        a8(new eb2.d(null, new l(0, this, v13), null, null, 13));
    }

    @Override // jd1.d
    public final String v9() {
        return "pin";
    }
}
