package com.pinterest.creatorHub.feature.creatorpathways;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.imageview.WebImageView;
import h32.d4;
import h32.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import nt.c2;
import pk.a0;
import so.k7;
import t80.r;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/pinterest/creatorHub/feature/creatorpathways/f;", "Lyk1/k;", "Lcom/pinterest/creatorHub/feature/creatorpathways/c;", "<init>", "()V", "creatorPathways_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class f extends k implements c {

    /* renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f44784q0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public k7 f44785j0;

    /* renamed from: k0, reason: collision with root package name */
    public l f44786k0;

    /* renamed from: l0, reason: collision with root package name */
    public j f44787l0;

    /* renamed from: m0, reason: collision with root package name */
    public final v f44788m0 = m.b(new d(this, 4));

    /* renamed from: n0, reason: collision with root package name */
    public ConstraintLayout f44789n0;

    /* renamed from: o0, reason: collision with root package name */
    public final d4 f44790o0;

    /* renamed from: p0, reason: collision with root package name */
    public final g0 f44791p0;

    public f() {
        this.E = qd0.c.fragment_modal_creator_pathways;
        this.f44790o0 = d4.CREATOR_PATHWAYS;
        this.f44791p0 = g0.CREATOR_FUND_ELIGIBILITY_PATHWAY;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        k7 k7Var = this.f44785j0;
        if (k7Var == null) {
            Intrinsics.r("creatorPathwaysModalPresenterFactory");
            throw null;
        }
        j a13 = k7Var.a();
        this.f44787l0 = a13;
        ((ca2.e) this.f44788m0.getValue()).q(a13);
        return a13;
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final g0 getF73409e1() {
        return this.f44791p0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getG0() {
        return this.f44790o0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        jr0.b bVar;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        Navigation navigation = this.I;
        String g23 = navigation != null ? navigation.g2("KEY_CREATOR_HUB_MODAL_TYPE", "creator_fund_eligibility") : null;
        if (g23 == null) {
            g23 = "creator_fund_eligibility";
        }
        if (Intrinsics.d(g23, "creator_fund_eligibility")) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            String d2 = bs1.c.d2(requireContext, qd0.d.creator_pathways_modal_header_text);
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            String d23 = bs1.c.d2(requireContext2, qd0.d.creator_pathways_modal_body_text);
            Context requireContext3 = requireContext();
            int i13 = qd0.a.creator_hub_pathways_modal_background;
            Object obj = d5.a.f53679a;
            int color = requireContext3.getColor(i13);
            Context requireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
            bVar = new jr0.b("https://i.pinimg.com/originals/9d/1d/35/9d1d35dbc217beaf0994c8658ac40d35.png", d2, d23, color, new jr0.a(new d(this, 0), bs1.c.d2(requireContext4, qd0.d.creator_pathways_modal_cta_button_text)), null);
        } else {
            Context requireContext5 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
            String d24 = bs1.c.d2(requireContext5, qd0.d.creator_modal_full_screen_plays_title_text);
            Context requireContext6 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext6, "requireContext(...)");
            String d25 = bs1.c.d2(requireContext6, qd0.d.creator_modal_full_screen_plays_description_text);
            Context requireContext7 = requireContext();
            int i14 = qd0.a.creator_hub_modal_fullscreen_plays_background;
            Object obj2 = d5.a.f53679a;
            int color2 = requireContext7.getColor(i14);
            Context requireContext8 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext8, "requireContext(...)");
            jr0.a aVar = new jr0.a(new d(this, 1), bs1.c.d2(requireContext8, qd0.d.creator_modal_full_screen_plays_primary_cta_text));
            Context requireContext9 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext9, "requireContext(...)");
            bVar = new jr0.b("https://i.pinimg.com/originals/a3/c4/b5/a3c4b538ccb7af02aaded91149fb0017.png", d24, d25, color2, aVar, new jr0.a(new d(this, 2), bs1.c.d2(requireContext9, qd0.d.creator_modal_full_screen_plays_secondary_cta_text)));
        }
        View findViewById = onCreateView.findViewById(qd0.b.creator_hub_modal_container);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
        constraintLayout.setBackgroundTintList(ColorStateList.valueOf(bVar.a()));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f44789n0 = constraintLayout;
        GestaltButton gestaltButton = (GestaltButton) onCreateView.findViewById(qd0.b.creator_hub_modal_primary_button);
        gestaltButton.d(new e(bVar, 0));
        gestaltButton.e(new yb0.b(bVar, 3));
        jr0.a c13 = bVar.c();
        if (c13 != null) {
            GestaltButton gestaltButton2 = (GestaltButton) onCreateView.findViewById(qd0.b.creator_hub_modal_secondary_button);
            gestaltButton2.d(new e(c13, 1));
            gestaltButton2.e(new yb0.b(c13, 4));
        }
        ((GestaltIconButton) onCreateView.findViewById(qd0.b.creator_hub_modal_cancel_button)).u(new yb0.b(this, 5));
        GestaltText gestaltText = (GestaltText) onCreateView.findViewById(qd0.b.creator_hub_modal_body_text);
        gestaltText.i(new r(29, bVar, gestaltText));
        GestaltText gestaltText2 = (GestaltText) onCreateView.findViewById(qd0.b.creator_hub_modal_header_text);
        Intrinsics.f(gestaltText2);
        a0.p(gestaltText2, bVar.d());
        WebImageView webImageView = (WebImageView) onCreateView.findViewById(qd0.b.creator_hub_modal_image);
        webImageView.loadUrl(bVar.b());
        webImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((ca2.e) this.f44788m0.getValue()).l();
        super.onDestroy();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        ca2.e eVar = (ca2.e) this.f44788m0.getValue();
        ConstraintLayout constraintLayout = this.f44789n0;
        if (constraintLayout == null) {
            Intrinsics.r("bottomModalSheet");
            throw null;
        }
        eVar.m(constraintLayout);
        eVar.o(0);
        eVar.x((int) (hf0.b.f69003c * 0.9d));
        v13.postDelayed(new c2(this, 9), 500L);
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return null;
    }
}
