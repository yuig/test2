package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.a4;
import h32.d4;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import so.z7;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\t\b\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/closeup/view/q;", "Lyq0/b0;", "", "Lyt0/d;", "Le11/h;", "Lzp0/h;", "Lgg1/b;", "Lnx/a;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class q extends d<Object> implements yt0.d, e11.h, zp0.h, gg1.b, nx.a {
    public static final /* synthetic */ int R0 = 0;
    public nx.f0 A0;
    public wk2.a B0;
    public i92.k C0;
    public ag1.h D0;
    public g70.h E0;
    public au0.d F0;
    public au0.d G0;
    public au0.d H0;
    public au0.d I0;
    public ConstraintLayout J0;
    public LinearLayout K0;
    public GestaltIconButton L0;
    public GestaltIconButton M0;
    public GestaltButton N0;
    public boolean O0;
    public final d4 P0 = d4.STORY_PIN_PAGE_EDIT;
    public final a4 Q0 = a4.STORY_PIN_CREATE;

    /* renamed from: z0, reason: collision with root package name */
    public z7 f46283z0;

    public static NavigationImpl U8(String str) {
        NavigationImpl z03 = Navigation.z0(com.pinterest.screens.d2.b(), str);
        z03.Y1("com.pinterest.EXTRA_FORCE_WEBVIEW", true);
        Intrinsics.checkNotNullExpressionValue(z03, "apply(...)");
        return z03;
    }

    public static NavigationImpl V8(q qVar, ScreenLocation screenLocation) {
        int value = ml1.b.UNSPECIFIED_TRANSITION.getValue();
        qVar.getClass();
        NavigationImpl L = Navigation.L(screenLocation, "", value);
        L.Y1("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", qVar.W8());
        Navigation navigation = qVar.I;
        L.m0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE", navigation != null ? navigation.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null);
        Navigation navigation2 = qVar.I;
        String v03 = navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_MEDIA_GALLERY_TYPE") : null;
        L.y0(v03 != null ? v03 : "", "com.pinterest.EXTRA_MEDIA_GALLERY_TYPE");
        Navigation navigation3 = qVar.I;
        Boolean valueOf = navigation3 != null ? Boolean.valueOf(navigation3.S("com.pinterest.EXTRA_ENABLE_VIDEO_UPLOAD", false)) : null;
        if (valueOf != null) {
            L.Y1("com.pinterest.EXTRA_ENABLE_VIDEO_UPLOAD", valueOf.booleanValue());
        }
        Navigation navigation4 = qVar.I;
        L.z(navigation4 != null ? navigation4.J1("com.pinterest.EXTRA_MEDIA_GALLERY_MAX_SELECTED_ITEMS") : -1, "com.pinterest.EXTRA_MEDIA_GALLERY_MAX_SELECTED_ITEMS");
        Navigation navigation5 = qVar.I;
        L.z(navigation5 != null ? navigation5.J1("com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS") : 0, "com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS");
        Intrinsics.checkNotNullExpressionValue(L, "apply(...)");
        return L;
    }

    @Override // nl1.d
    public final a4 D7() {
        return a4.STORY_PIN_CREATE;
    }

    @Override // gg1.b
    public final void E6(hg1.d optionType) {
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        switch (l.f46217a[optionType.ordinal()]) {
            case 1:
                b9(U8("https://help.pinterest.com/guide/guide-to-creating-pins"));
                return;
            case 2:
                b9(U8("https://business.pinterest.com/creative-best-practices/"));
                return;
            case 3:
                wy0 f13 = ((b60.d) getActiveUserManager()).f();
                String G2 = f13 != null ? f13.G2() : null;
                gg1.b.f64972so.getClass();
                String str = (String) gg1.a.a().get(G2);
                if (str == null) {
                    str = "768145348882884282";
                }
                g70.h hVar = this.E0;
                if (hVar != null) {
                    g70.h.b(hVar, str, new n(this, 2));
                    return;
                } else {
                    Intrinsics.r("boardNavigator");
                    throw null;
                }
            case 4:
                b9(U8("https://business.pinterest.com/creators/"));
                return;
            case 5:
                b9(U8("https://business.pinterest.com/creator-code/"));
                return;
            case 6:
                M1(V8(this, com.pinterest.screens.d2.e()));
                return;
            case 7:
                b9(U8("https://help.pinterest.com/business/article/pinterest-analytics"));
                return;
            default:
                return;
        }
    }

    @Override // yq0.t, yk1.k, nl1.d
    public final void K7() {
        requireActivity().getWindow().addFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        RecyclerView g83 = g8();
        if (g83 != null) {
            bs1.c.U1(g83);
        }
        super.K7();
    }

    @Override // yq0.t, yk1.k, nl1.d
    public final void L7() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        pk.a0.d1(requireActivity);
        requireActivity().getWindow().clearFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        RecyclerView g83 = g8();
        if (g83 != null) {
            bs1.c.X0(g83);
        }
        super.L7();
    }

    @Override // gg1.b
    public final void M2(hg1.b optionType) {
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        int i13 = l.f46218b[optionType.ordinal()];
        if (i13 == 1) {
            f7().d(new jc0.v(new yf1.b((xf1.a) null, 3), false, 0L, 30));
        } else {
            if (i13 != 2) {
                return;
            }
            b9(U8("https://help.pinterest.com"));
        }
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        au0.d dVar;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (Intrinsics.d(code, "com.pinterest.EXTRA_STORY_PIN_PRODUCT_EXTRA") || Intrinsics.d(code, "com.pinterest.EXTRA_STORY_PIN_VTO_PRODUCT_EXTRA")) {
            String string = result.getString("com.pinterest.EXTRA_STORY_PIN_PRODUCT_ID");
            if (this.O0) {
                if (string != null) {
                    f7().d(new hv0.h(string, result.getString("com.pinterest.EXTRA_STORY_PIN_PRODUCT_TITLE"), result.getString("com.pinterest.EXTRA_STORY_PIN_PRODUCT_IMAGE_URL")));
                }
            } else {
                if (string == null || (dVar = this.F0) == null) {
                    return;
                }
                dVar.z3(string, Intrinsics.d(code, "com.pinterest.EXTRA_STORY_PIN_PRODUCT_EXTRA") ? a42.f.PRODUCT_STICKER : Intrinsics.d(code, "com.pinterest.EXTRA_STORY_PIN_VTO_PRODUCT_EXTRA") ? a42.f.VIRTUAL_TRY_ON_MAKEUP_STICKER : a42.f.PRODUCT_STICKER, a42.o.TITLE);
            }
        }
    }

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(4, new o(this, 3));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        z7 z7Var = this.f46283z0;
        if (z7Var == null) {
            Intrinsics.r("ideaPinCreationCloseupPresenterFactory");
            throw null;
        }
        nx.f0 f0Var = this.A0;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        ag1.h hVar = this.D0;
        if (hVar == null) {
            Intrinsics.r("ideaPinSessionDataManager");
            throw null;
        }
        Navigation navigation = this.I;
        return z7Var.a(new du0.b(f0Var, hVar, this.P0, navigation != null ? navigation.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null, W8()), p7());
    }

    public final boolean W8() {
        Navigation navigation = this.I;
        if (navigation != null) {
            return navigation.S("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", false);
        }
        return false;
    }

    public final boolean X8() {
        ScreenDescription w13;
        com.pinterest.framework.screens.s sVar = this.f91293r;
        return Intrinsics.d((sVar == null || (w13 = sVar.w(1)) == null) ? null : w13.getScreenClass(), com.pinterest.screens.d2.n().getF48906a());
    }

    @Override // zp0.h
    public final void Y(SpannableStringBuilder updated) {
        Intrinsics.checkNotNullParameter(updated, "updated");
    }

    public final void Y8(h32.u0 u0Var) {
        nx.d0 s73 = s7();
        HashMap hashMap = new HashMap();
        Navigation navigation = this.I;
        bs1.c.G1("entry_type", navigation != null ? navigation.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null, hashMap);
        hashMap.put("is_draft", String.valueOf(W8()));
        Unit unit = Unit.f80348a;
        s73.Z(u0Var, hashMap);
    }

    public final void Z8(String str, boolean z13) {
        this.O0 = str != null;
        NavigationImpl V8 = V8(this, z13 ? com.pinterest.screens.d2.r() : com.pinterest.screens.d2.p());
        if (str != null) {
            V8.m0("pinProductUid", str);
        }
        M1(V8);
    }

    public final void a9() {
        int i13;
        if (X8()) {
            au0.d dVar = this.G0;
            if (dVar != null) {
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                dVar.H3(requireContext);
                return;
            }
            return;
        }
        au0.d dVar2 = this.H0;
        if (dVar2 != null) {
            int i14 = 1;
            if (dVar2.v3(W8())) {
                FragmentActivity requireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                Context requireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                Navigation navigation = this.I;
                if (navigation == null || !navigation.S("com.pinterest.EXTRA_IDEA_PIN_FROM_CAMERA", false)) {
                    i13 = aq1.h.unified_pin_drafts_saving_modal_subtitle;
                } else {
                    Navigation navigation2 = this.I;
                    i13 = (navigation2 == null || !navigation2.S("com.pinterest.EXTRA_IDEA_PIN_CAMERA_FROM_PHOTO_MODE", false)) ? aq1.h.idea_pin_video_saving_modal_subtitle : aq1.h.idea_pin_photo_saving_modal_subtitle;
                }
                kh2.a1.B0(requireActivity, requireContext2, Integer.valueOf(i13), new o(this, i14), new o(this, 2));
                return;
            }
        }
        au0.d dVar3 = this.I0;
        if (dVar3 != null) {
            dVar3.t3();
        }
        f7().d(new ag1.j());
        D5();
    }

    public final void b9(Navigation navigation) {
        lu1.d a73 = a7();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Intent b13 = a73.b(requireContext, lu1.a.MAIN_ACTIVITY);
        b13.putExtra("com.pinterest.EXTRA_PENDING_TASK", navigation);
        b13.putExtra("com.pinterest.EXTRA_SKIP_HOME_SCREEN", true);
        b13.putExtra("com.pinterest.EXTRA_NO_BOTTOM_NAV_INFLATION", true);
        requireContext().startActivity(b13);
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        a9();
        return true;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF35260t() {
        return this.Q0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF35259s() {
        return this.P0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(aq1.f.fragment_idea_pin_creation_closeup, aq1.d.p_recycler_view);
    }

    @Override // zp0.h
    public final void n6() {
    }

    @Override // yq0.t
    public final androidx.recyclerview.widget.v0 n8() {
        final cp.b bVar = new cp.b(this, 19);
        getContext();
        return new androidx.recyclerview.widget.v0(new PinterestLinearLayoutManager(bVar) { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinCreationCloseupFragment$getLayoutManagerContract$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
            public final boolean k() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
            public final void y0(androidx.recyclerview.widget.w2 w2Var) {
                super.y0(w2Var);
                ((ac2.o1) q.this.B7()).w();
            }
        });
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(aq1.d.idea_pin_help_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.L0 = (GestaltIconButton) findViewById;
        View findViewById2 = onCreateView.findViewById(aq1.d.story_pin_current_page_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = onCreateView.findViewById(aq1.d.done_gestalt_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.N0 = (GestaltButton) findViewById3;
        View findViewById4 = onCreateView.findViewById(aq1.d.story_pin_creation_toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.J0 = (ConstraintLayout) findViewById4;
        View findViewById5 = onCreateView.findViewById(aq1.d.back_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.M0 = (GestaltIconButton) findViewById5;
        GestaltIconButton gestaltIconButton = this.L0;
        if (gestaltIconButton == null) {
            Intrinsics.r("helpButton");
            throw null;
        }
        final int i13 = 0;
        gestaltIconButton.u(new gm1.a(this) { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f46210b;

            {
                this.f46210b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                ScreenDescription w13;
                Class cls = null;
                int i14 = i13;
                q this$0 = this.f46210b;
                switch (i14) {
                    case 0:
                        int i15 = q.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.Y8(h32.u0.STORY_PIN_QUESTION_BUTTON);
                            nx.f0 f0Var = this$0.A0;
                            if (f0Var != null) {
                                this$0.f7().d(new jc0.v(new rv0.a(this$0, f0Var), false, 0L, 30));
                                return;
                            } else {
                                Intrinsics.r("pinalyticsFactory");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        int i16 = q.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        com.pinterest.framework.screens.s sVar = this$0.f91293r;
                        if (sVar != null && (w13 = sVar.w(0)) != null) {
                            cls = w13.getScreenClass();
                        }
                        if (Intrinsics.d(cls, com.pinterest.screens.d2.m().getF48906a())) {
                            this$0.Y8(h32.u0.NEXT_BUTTON);
                            au0.d dVar = this$0.G0;
                            if (dVar != null) {
                                Context requireContext = this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                                dVar.H3(requireContext);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        int i17 = q.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            Navigation navigation = this$0.I;
                            this$0.Y8((navigation == null || !navigation.S("com.pinterest.EXTRA_IDEA_PIN_FROM_CAMERA", false)) ? h32.u0.CLOSE_BUTTON : h32.u0.BACK_BUTTON);
                            this$0.a9();
                            return;
                        }
                        return;
                }
            }
        });
        GestaltButton gestaltButton = this.N0;
        if (gestaltButton == null) {
            Intrinsics.r("nextGestaltButton");
            throw null;
        }
        final int i14 = 1;
        gestaltButton.d(new n(this, i14));
        gestaltButton.e(new gm1.a(this) { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f46210b;

            {
                this.f46210b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                ScreenDescription w13;
                Class cls = null;
                int i142 = i14;
                q this$0 = this.f46210b;
                switch (i142) {
                    case 0:
                        int i15 = q.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.Y8(h32.u0.STORY_PIN_QUESTION_BUTTON);
                            nx.f0 f0Var = this$0.A0;
                            if (f0Var != null) {
                                this$0.f7().d(new jc0.v(new rv0.a(this$0, f0Var), false, 0L, 30));
                                return;
                            } else {
                                Intrinsics.r("pinalyticsFactory");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        int i16 = q.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        com.pinterest.framework.screens.s sVar = this$0.f91293r;
                        if (sVar != null && (w13 = sVar.w(0)) != null) {
                            cls = w13.getScreenClass();
                        }
                        if (Intrinsics.d(cls, com.pinterest.screens.d2.m().getF48906a())) {
                            this$0.Y8(h32.u0.NEXT_BUTTON);
                            au0.d dVar = this$0.G0;
                            if (dVar != null) {
                                Context requireContext = this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                                dVar.H3(requireContext);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        int i17 = q.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            Navigation navigation = this$0.I;
                            this$0.Y8((navigation == null || !navigation.S("com.pinterest.EXTRA_IDEA_PIN_FROM_CAMERA", false)) ? h32.u0.CLOSE_BUTTON : h32.u0.BACK_BUTTON);
                            this$0.a9();
                            return;
                        }
                        return;
                }
            }
        });
        GestaltIconButton gestaltIconButton2 = this.M0;
        if (gestaltIconButton2 == null) {
            Intrinsics.r("backButton");
            throw null;
        }
        com.bumptech.glide.c.u1(gestaltIconButton2);
        GestaltIconButton gestaltIconButton3 = this.L0;
        if (gestaltIconButton3 == null) {
            Intrinsics.r("helpButton");
            throw null;
        }
        com.bumptech.glide.c.u1(gestaltIconButton3);
        Navigation navigation = this.I;
        if (navigation != null && navigation.S("com.pinterest.EXTRA_IDEA_PIN_CAMERA_PHOTO_MODE_ENABLED", false)) {
            GestaltIconButton gestaltIconButton4 = this.M0;
            if (gestaltIconButton4 == null) {
                Intrinsics.r("backButton");
                throw null;
            }
            com.bumptech.glide.c.u1(gestaltIconButton4);
        }
        Navigation navigation2 = this.I;
        if (navigation2 == null || !navigation2.S("com.pinterest.EXTRA_IDEA_PIN_FROM_CAMERA", false)) {
            GestaltIconButton gestaltIconButton5 = this.M0;
            if (gestaltIconButton5 == null) {
                Intrinsics.r("backButton");
                throw null;
            }
            gestaltIconButton5.t(p.f46277j);
        }
        GestaltIconButton gestaltIconButton6 = this.M0;
        if (gestaltIconButton6 == null) {
            Intrinsics.r("backButton");
            throw null;
        }
        if (gestaltIconButton6.w().f96642d == fm1.c.VISIBLE) {
            GestaltIconButton gestaltIconButton7 = this.M0;
            if (gestaltIconButton7 == null) {
                Intrinsics.r("backButton");
                throw null;
            }
            final int i15 = 2;
            gestaltIconButton7.u(new gm1.a(this) { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.k

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ q f46210b;

                {
                    this.f46210b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    ScreenDescription w13;
                    Class cls = null;
                    int i142 = i15;
                    q this$0 = this.f46210b;
                    switch (i142) {
                        case 0:
                            int i152 = q.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.Y8(h32.u0.STORY_PIN_QUESTION_BUTTON);
                                nx.f0 f0Var = this$0.A0;
                                if (f0Var != null) {
                                    this$0.f7().d(new jc0.v(new rv0.a(this$0, f0Var), false, 0L, 30));
                                    return;
                                } else {
                                    Intrinsics.r("pinalyticsFactory");
                                    throw null;
                                }
                            }
                            return;
                        case 1:
                            int i16 = q.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            com.pinterest.framework.screens.s sVar = this$0.f91293r;
                            if (sVar != null && (w13 = sVar.w(0)) != null) {
                                cls = w13.getScreenClass();
                            }
                            if (Intrinsics.d(cls, com.pinterest.screens.d2.m().getF48906a())) {
                                this$0.Y8(h32.u0.NEXT_BUTTON);
                                au0.d dVar = this$0.G0;
                                if (dVar != null) {
                                    Context requireContext = this$0.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                                    dVar.H3(requireContext);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            int i17 = q.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                Navigation navigation3 = this$0.I;
                                this$0.Y8((navigation3 == null || !navigation3.S("com.pinterest.EXTRA_IDEA_PIN_FROM_CAMERA", false)) ? h32.u0.CLOSE_BUTTON : h32.u0.BACK_BUTTON);
                                this$0.a9();
                                return;
                            }
                            return;
                    }
                }
            });
        }
        v8();
        return onCreateView;
    }

    @Override // e11.h
    public final void onFirstVisibleItemChanged(int i13, boolean z13) {
    }

    @Override // e11.h
    public final void onLastVisibleItemChanged(int i13, boolean z13) {
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        pk.a0.D(requireActivity);
        super.onResume();
        Q7(true);
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        RecyclerView recyclerView = (RecyclerView) v13.findViewById(nl1.e.recycler_adapter_view);
        int i13 = 0;
        recyclerView.setPaddingRelative(0, 0, 0, 0);
        new androidx.recyclerview.widget.n1().b(recyclerView);
        RecyclerView g83 = g8();
        if (g83 != null) {
            androidx.recyclerview.widget.l2 l2Var = g83.f19242n;
            Intrinsics.f(l2Var);
            addScrollListener(new e11.i(l2Var, this));
        }
        View findViewById = v13.findViewById(aq1.d.navigation_background);
        LinearLayout linearLayout = (LinearLayout) findViewById;
        Intrinsics.f(linearLayout);
        m mVar = new m(bs1.c.W(linearLayout, p92.a.idea_pin_navigation_background_height), new int[]{dl2.b.y0(linearLayout, eo1.a.color_background_dark_opacity_300), dl2.b.y0(linearLayout, eo1.a.sema_color_background_transparent)}, new float[]{0.0f, 1.0f});
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(mVar);
        linearLayout.setBackground(new LayerDrawable(new PaintDrawable[]{paintDrawable}));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.K0 = linearLayout;
        Navigation navigation = this.I;
        if (Intrinsics.d(navigation != null ? Boolean.valueOf(navigation.S("com.pinterest.EXTRA_STORY_PIN_TRIM_REQUIRED", false)) : null, Boolean.TRUE)) {
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            kh2.a1.z0(requireActivity, requireContext, new o(this, i13));
        }
        new oy.b0(this.P0, this.Q0, s92.o.COMPLETE, null, 8).i();
    }
}
