package ev0;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.c0;
import av0.u;
import av0.w;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.metadata.view.MetadataRootView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.grid.PinterestRecyclerView;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.u0;
import i32.y0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kh2.a1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.f0;
import om0.m1;
import oy.b0;
import rl2.g0;
import so.l8;
import so.oa;
import xk2.v;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lev0/l;", "Lyq0/b0;", "", "Lav0/d;", "<init>", "()V", "vt1/a", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class l extends b<Object> implements av0.d {
    public static final /* synthetic */ int W0 = 0;
    public i92.k A0;
    public h22.f B0;
    public ag1.h C0;
    public View E0;
    public View F0;
    public PinterestRecyclerView G0;
    public GestaltIconButton H0;
    public GestaltIconButton I0;
    public ConstraintLayout J0;
    public GestaltButton K0;
    public MetadataRootView L0;
    public dv0.k M0;
    public av0.g N0;
    public av0.i O0;
    public av0.c P0;
    public boolean Q0;
    public final d4 U0;
    public final a4 V0;

    /* renamed from: z0, reason: collision with root package name */
    public l8 f60268z0;
    public final xk2.k D0 = xk2.m.a(xk2.n.NONE, new i(this, 1));
    public final uk2.f R0 = cb.r("create(...)");
    public final uk2.f S0 = cb.r("create(...)");
    public final v T0 = xk2.m.b(new i(this, 0));

    public l() {
        this.E = aq1.f.idea_pin_metadata_fragment;
        this.U0 = d4.STORY_PIN_METADATA;
        this.V0 = a4.STORY_PIN_CREATE;
    }

    public static void W8(l lVar, u0 u0Var, HashMap hashMap) {
        f1 f1Var = f1.TAP;
        lVar.getClass();
        HashMap hashMap2 = new HashMap(lVar.V8().getF63135d0());
        for (Map.Entry entry : hashMap.entrySet()) {
            hashMap2.put((String) entry.getKey(), (String) entry.getValue());
        }
        d0 d0Var = lVar.V8().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap2, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    @Override // yq0.t, yk1.k, nl1.d
    public final void L7() {
        V6();
        f7().d(new dg0.c(dg0.b.DISMISS_UI));
        super.L7();
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(9, new xo0.i(requireContext, 10));
        adapter.G(10, new xo0.i(requireContext, 11));
        adapter.G(1, new xo0.i(requireContext, 12));
        adapter.G(7, new xo0.i(requireContext, 13));
        adapter.G(0, new xo0.i(requireContext, 14));
        adapter.G(5, new m1(18, requireContext, this));
        adapter.G(6, new xo0.i(requireContext, 15));
    }

    public final void U8(boolean z13) {
        View view;
        FragmentActivity E4 = E4();
        if (E4 != null) {
            E4.setResult(-1);
        }
        FragmentActivity E42 = E4();
        if (E42 != null) {
            E42.finish();
        }
        if (!z13 || (view = getView()) == null) {
            return;
        }
        i92.k kVar = this.A0;
        if (kVar != null) {
            uv0.k.d(kVar, view);
        } else {
            Intrinsics.r("toastUtils");
            throw null;
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        l8 l8Var = this.f60268z0;
        if (l8Var == null) {
            Intrinsics.r("ideaPinMetadataPresenterFactory");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        du0.b V8 = V8();
        Navigation navigation = this.I;
        boolean S = navigation != null ? navigation.S("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", false) : false;
        Navigation navigation2 = this.I;
        String v03 = navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null;
        Navigation navigation3 = this.I;
        dv0.k a13 = l8Var.a(requireContext, V8, S, v03, navigation3 != null ? navigation3.J1("com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS") : 0);
        this.M0 = a13;
        return a13;
    }

    public final du0.b V8() {
        f0 b73 = b7();
        ag1.h hVar = this.C0;
        if (hVar == null) {
            Intrinsics.r("ideaPinSessionDataManager");
            throw null;
        }
        d4 d4Var = d4.STORY_PIN_METADATA;
        Navigation navigation = this.I;
        boolean S = navigation != null ? navigation.S("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", false) : false;
        Navigation navigation2 = this.I;
        return new du0.b(b73, hVar, d4Var, navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null, S);
    }

    public final void X8(kg.n state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof av0.r) {
            ag1.h hVar = this.C0;
            if (hVar == null) {
                Intrinsics.r("ideaPinSessionDataManager");
                throw null;
            }
            if (hVar.a().b() == fg1.b.FINISHING_TOUCHES_FIRST) {
                f7().d(new ag1.j());
            }
            hf0.b.k(getView());
            D5();
            return;
        }
        if (state instanceof av0.p) {
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            a1.u0(requireActivity, requireContext, new i(this, 2));
            return;
        }
        if (state instanceof av0.q) {
            FragmentActivity requireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            a1.v0(requireActivity2, requireContext2, new i(this, 3));
            return;
        }
        if (state instanceof w) {
            FragmentActivity requireActivity3 = requireActivity();
            Context requireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
            g0.h0(requireActivity3, requireContext3);
            return;
        }
        if (state instanceof u) {
            FragmentActivity requireActivity4 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity4, "requireActivity(...)");
            Context requireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
            av0.i iVar = this.O0;
            if (iVar != null) {
                a1.w0(requireActivity4, requireContext4, ((dv0.k) iVar).v3(), new i(this, 4));
                return;
            } else {
                Intrinsics.r("scheduleDateUpdateListener");
                throw null;
            }
        }
        if (state instanceof av0.s) {
            Context context = kb0.a.f79058b;
            ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(getResources().getString(aq1.h.story_pin_validation_error_missing_media));
            ag1.h hVar2 = this.C0;
            if (hVar2 == null) {
                Intrinsics.r("ideaPinSessionDataManager");
                throw null;
            }
            if (hVar2.a().b() == fg1.b.FINISHING_TOUCHES_FIRST) {
                return;
            }
            D5();
            return;
        }
        if (state instanceof av0.t) {
            i92.k kVar = this.A0;
            if (kVar != null) {
                kVar.n(aq1.h.no_internet_connection_error);
                return;
            } else {
                Intrinsics.r("toastUtils");
                throw null;
            }
        }
        if (state instanceof av0.v) {
            FragmentActivity requireActivity5 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity5, "requireActivity(...)");
            Context requireContext5 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
            a1.B0(requireActivity5, requireContext5, null, new i(this, 5), new i(this, 6));
        }
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        dv0.k kVar = this.M0;
        if (kVar == null) {
            Intrinsics.r("actionListener");
            throw null;
        }
        kVar.w3(av0.l.f20512f);
        hf0.b.k(getView());
        return true;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF87513d1() {
        return this.V0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF98673x0() {
        return this.U0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(this.E, aq1.d.p_recycler_view);
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(aq1.d.header);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.E0 = findViewById;
        View findViewById2 = onCreateView.findViewById(aq1.d.bottom_bar_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.F0 = findViewById2;
        View findViewById3 = onCreateView.findViewById(aq1.d.p_recycler_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.G0 = (PinterestRecyclerView) findViewById3;
        View findViewById4 = onCreateView.findViewById(aq1.d.metadata_back_btn);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.H0 = (GestaltIconButton) findViewById4;
        View findViewById5 = onCreateView.findViewById(aq1.d.create_gestalt_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.K0 = (GestaltButton) findViewById5;
        View findViewById6 = onCreateView.findViewById(aq1.d.save_draft_button);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.I0 = (GestaltIconButton) findViewById6;
        View findViewById7 = onCreateView.findViewById(aq1.d.bottom_bar_container);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.J0 = (ConstraintLayout) findViewById7;
        View findViewById8 = onCreateView.findViewById(aq1.d.story_pin_metadata_root);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.L0 = (MetadataRootView) findViewById8;
        PinterestRecyclerView pinterestRecyclerView = this.G0;
        if (pinterestRecyclerView == null) {
            Intrinsics.r("pinterestRecyclerView");
            throw null;
        }
        pinterestRecyclerView.b(new c0(this, 13));
        MetadataRootView metadataRootView = this.L0;
        if (metadataRootView == null) {
            Intrinsics.r("metadataRootView");
            throw null;
        }
        metadataRootView.L(dq1.c.attribute_compound_edit_text);
        MetadataRootView metadataRootView2 = this.L0;
        if (metadataRootView2 == null) {
            Intrinsics.r("metadataRootView");
            throw null;
        }
        metadataRootView2.L(dq1.c.description_edit_text);
        MetadataRootView metadataRootView3 = this.L0;
        if (metadataRootView3 == null) {
            Intrinsics.r("metadataRootView");
            throw null;
        }
        metadataRootView3.L(dq1.c.attribute_value);
        MetadataRootView metadataRootView4 = this.L0;
        if (metadataRootView4 == null) {
            Intrinsics.r("metadataRootView");
            throw null;
        }
        metadataRootView4.L(aq1.d.idea_pin_link_creation);
        GestaltIconButton gestaltIconButton = this.H0;
        if (gestaltIconButton == null) {
            Intrinsics.r("backButton");
            throw null;
        }
        final int i13 = 0;
        gestaltIconButton.u(new gm1.a(this) { // from class: ev0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f60253b;

            {
                this.f60253b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                l this$0 = this.f60253b;
                switch (i14) {
                    case 0:
                        int i15 = l.W0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            dv0.k kVar = this$0.M0;
                            if (kVar != null) {
                                kVar.w3(av0.l.f20512f);
                                return;
                            } else {
                                Intrinsics.r("actionListener");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        int i16 = l.W0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.S0.c(Unit.f80348a);
                        return;
                    default:
                        int i17 = l.W0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            dv0.k kVar2 = this$0.M0;
                            if (kVar2 != null) {
                                kVar2.w3(new av0.o(u0.STORY_PIN_METADATA_SAVE_DRAFT_BUTTON));
                                return;
                            } else {
                                Intrinsics.r("actionListener");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        GestaltButton gestaltButton = this.K0;
        if (gestaltButton == null) {
            Intrinsics.r("createButton");
            throw null;
        }
        final int i14 = 1;
        gestaltButton.e(new gm1.a(this) { // from class: ev0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f60253b;

            {
                this.f60253b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                l this$0 = this.f60253b;
                switch (i142) {
                    case 0:
                        int i15 = l.W0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            dv0.k kVar = this$0.M0;
                            if (kVar != null) {
                                kVar.w3(av0.l.f20512f);
                                return;
                            } else {
                                Intrinsics.r("actionListener");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        int i16 = l.W0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.S0.c(Unit.f80348a);
                        return;
                    default:
                        int i17 = l.W0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            dv0.k kVar2 = this$0.M0;
                            if (kVar2 != null) {
                                kVar2.w3(new av0.o(u0.STORY_PIN_METADATA_SAVE_DRAFT_BUTTON));
                                return;
                            } else {
                                Intrinsics.r("actionListener");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        GestaltIconButton gestaltIconButton2 = this.I0;
        if (gestaltIconButton2 == null) {
            Intrinsics.r("saveDraftButton");
            throw null;
        }
        final int i15 = 2;
        gestaltIconButton2.u(new gm1.a(this) { // from class: ev0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f60253b;

            {
                this.f60253b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i15;
                l this$0 = this.f60253b;
                switch (i142) {
                    case 0:
                        int i152 = l.W0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            dv0.k kVar = this$0.M0;
                            if (kVar != null) {
                                kVar.w3(av0.l.f20512f);
                                return;
                            } else {
                                Intrinsics.r("actionListener");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        int i16 = l.W0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.S0.c(Unit.f80348a);
                        return;
                    default:
                        int i17 = l.W0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            dv0.k kVar2 = this$0.M0;
                            if (kVar2 != null) {
                                kVar2.w3(new av0.o(u0.STORY_PIN_METADATA_SAVE_DRAFT_BUTTON));
                                return;
                            } else {
                                Intrinsics.r("actionListener");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        com.bumptech.glide.c.u1(gestaltIconButton2);
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        MetadataRootView metadataRootView = this.L0;
        if (metadataRootView == null) {
            Intrinsics.r("metadataRootView");
            throw null;
        }
        metadataRootView.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this.T0.getValue());
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MetadataRootView metadataRootView = this.L0;
        if (metadataRootView == null) {
            Intrinsics.r("metadataRootView");
            throw null;
        }
        metadataRootView.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this.T0.getValue());
        ur0.g.d(y0.ANDROID_STORY_PIN_CREATION_METADATA, this, null);
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        s92.o oVar = s92.o.COMPLETE;
        new b0(this.U0, this.V0, oVar, null, 8).i();
        ek2.f i13 = fk2.m.f62459a.d(300L, TimeUnit.MILLISECONDS).i(new cp.b0(this, 19), new mu0.a(29, j.f60261k));
        Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
        R6(i13);
    }
}
