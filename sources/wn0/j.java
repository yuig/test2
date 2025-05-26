package wn0;

import a.cb;
import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.c2;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.y2;
import ap.o;
import ba.q;
import com.google.android.material.appbar.AppBarLayout;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.n8;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.feature.board.common.filter.view.BoardPinsFilter;
import com.pinterest.feature.board.detail.collaboratorview.view.RevampBoardHeaderCollaboratorView;
import com.pinterest.feature.board.detail.floatingtoolbar.FloatingToolbarView;
import com.pinterest.feature.board.selectpins.BoardSelectPinsHeaderView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.view.NoticeView;
import dl1.s;
import gi.m;
import h32.a4;
import h32.d4;
import h32.i0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kh2.a1;
import kh2.g3;
import kh2.m0;
import kl0.w;
import kl0.x;
import kl0.y;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import lh0.v;
import m60.d0;
import m60.t0;
import nx.f0;
import so.oa;
import so.s5;
import tj0.b0;
import x02.i2;
import x02.u2;
import x02.x0;
import xk2.n;
import yq0.z;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u00020\u0006:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lwn0/j;", "Lwk1/k;", "Ldl1/s;", "", "Lsn0/a;", "Lnr0/j;", "Lkk0/c;", "<init>", "()V", "gi2/b", "boardSection_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class j extends l<s> implements sn0.a, kk0.c {
    public static final /* synthetic */ int H1 = 0;
    public BoardPinsFilter A1;
    public FloatingToolbarView B1;
    public BoardSelectPinsHeaderView C1;
    public NoticeView D1;
    public FrameLayout E1;
    public final xk2.k F1;
    public final d4 G1;
    public s5 R0;
    public x0 S0;
    public i2 T0;
    public o U0;
    public uk1.e V0;
    public f0 W0;
    public d0 X0;
    public j12.k Y0;
    public m Z0;

    /* renamed from: a1, reason: collision with root package name */
    public oc.c f130478a1;

    /* renamed from: b1, reason: collision with root package name */
    public v f130479b1;

    /* renamed from: c1, reason: collision with root package name */
    public x92.b f130480c1;

    /* renamed from: d1, reason: collision with root package name */
    public zf0.f f130481d1;

    /* renamed from: e1, reason: collision with root package name */
    public yk1.j f130482e1;

    /* renamed from: f1, reason: collision with root package name */
    public u2 f130483f1;

    /* renamed from: g1, reason: collision with root package name */
    public b0 f130484g1;

    /* renamed from: h1, reason: collision with root package name */
    public c2 f130485h1;

    /* renamed from: i1, reason: collision with root package name */
    public sn0.b f130486i1;

    /* renamed from: j1, reason: collision with root package name */
    public mk0.e f130487j1;

    /* renamed from: k1, reason: collision with root package name */
    public rk0.j f130488k1;

    /* renamed from: l1, reason: collision with root package name */
    public final m1 f130489l1;

    /* renamed from: m1, reason: collision with root package name */
    public final HashSet f130490m1;

    /* renamed from: n1, reason: collision with root package name */
    public GestaltToolbarImpl f130491n1;

    /* renamed from: o1, reason: collision with root package name */
    public AppBarLayout f130492o1;

    /* renamed from: p1, reason: collision with root package name */
    public GestaltIconButton f130493p1;

    /* renamed from: q1, reason: collision with root package name */
    public GestaltIconButton f130494q1;

    /* renamed from: r1, reason: collision with root package name */
    public GestaltText f130495r1;

    /* renamed from: s1, reason: collision with root package name */
    public GestaltText f130496s1;

    /* renamed from: t1, reason: collision with root package name */
    public GestaltPreviewTextView f130497t1;

    /* renamed from: u1, reason: collision with root package name */
    public GestaltText f130498u1;

    /* renamed from: v1, reason: collision with root package name */
    public GestaltText f130499v1;

    /* renamed from: w1, reason: collision with root package name */
    public GestaltText f130500w1;

    /* renamed from: x1, reason: collision with root package name */
    public GestaltText f130501x1;

    /* renamed from: y1, reason: collision with root package name */
    public RevampBoardHeaderCollaboratorView f130502y1;

    /* renamed from: z1, reason: collision with root package name */
    public GestaltText f130503z1;

    public j() {
        this.Y = true;
        int i13 = 4;
        w wVar = new w(this, i13);
        n nVar = n.NONE;
        xk2.k a13 = xk2.m.a(nVar, new ca0.b0(12, wVar));
        this.f130489l1 = a1.s(this, k0.f80436a.b(vn0.n.class), new ml0.v(a13, 3), new x(null, a13, i13), new y(this, a13, i13));
        this.f130490m1 = new HashSet();
        this.F1 = xk2.m.a(nVar, new e(this, 0));
        this.G1 = d4.BOARD_SECTION;
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        sn0.b bVar;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (!result.getBoolean("com.pinterest.EXTRA_BOARD_OR_SECTION_PIN_DELETED") || (bVar = this.f130486i1) == null) {
            return;
        }
        ((un0.h) bVar).s3();
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED, new q(requireContext, 25));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER, new q(requireContext, 26));
        adapter.G(81, dl2.b.m2(s7(), W8(), new k1.q(this, requireContext, adapter, 24)));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, new q(requireContext, 27));
        int i13 = 2;
        adapter.G(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_BOARDS, new om0.m1(i13, requireContext, this));
        adapter.H(new int[]{86753091, 86753092, 86753093}, new e(this, 1));
        adapter.G(66, dl2.b.m2(s7(), W8(), new e(this, i13)));
        adapter.G(1122334455, new q(requireContext, 28));
        int[] iArr = mj0.j.f87276a;
        nx.d0 s73 = s7();
        qa2.n W8 = W8();
        uj2.q p73 = p7();
        b0 b0Var = this.f130484g1;
        if (b0Var == null) {
            Intrinsics.r("oneTapSavePinVideoGridCellFactory");
            throw null;
        }
        mj0.j.b(adapter, requireContext, s73, W8, p73, b0Var);
        adapter.A(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r7v10, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    @Override // kk0.c
    public final void S3(dl0.a boardDetailModel, ArrayList collaborators) {
        ?? r73;
        Intrinsics.checkNotNullParameter(collaborators, "collaborators");
        Intrinsics.checkNotNullParameter(boardDetailModel, "boardDetailModel");
        int size = collaborators.size();
        if (size > 0) {
            List y03 = CollectionsKt.y0(collaborators, 2);
            if (y03 == null) {
                r73 = q0.f80391a;
            } else if (boardDetailModel.f55178f) {
                r73 = q0.f80391a;
            } else {
                List<lk0.a> list = y03;
                r73 = new ArrayList(g0.q(list, 10));
                for (lk0.a aVar : list) {
                    r73.add(new nk0.a(new om0.m1(1, this, aVar), aVar.f83639d));
                }
            }
        } else {
            r73 = q0.f80391a;
        }
        Context context = getContext();
        CharSequence z13 = context != null ? g3.z(context, r73, size, new e(this, 3)) : null;
        if (z13 != null) {
            GestaltText gestaltText = this.f130503z1;
            if (gestaltText == null) {
                Intrinsics.r("boardCollaboratorsText");
                throw null;
            }
            gestaltText.i(new ip.d(18, z13));
        }
    }

    @Override // sq0.e
    public final qa2.n T8(nr0.b pinActionHandler) {
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        nx.d0 s73 = s7();
        y32.f fVar = y32.f.CLOSEUP_LONGPRESS;
        boolean m93 = m9();
        if (this.f130481d1 != null) {
            return new kl0.a(s73, fVar, pinActionHandler, m93, zf0.f.h(), true, 0).a(new yk1.a(getResources(), requireContext().getTheme()));
        }
        Intrinsics.r("educationHelper");
        throw null;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        uk1.e eVar = this.V0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(((uk1.a) eVar).g());
        i2 i2Var = this.T0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        s5 s5Var = this.R0;
        if (s5Var == null) {
            Intrinsics.r("boardSectionPresenterFactory");
            throw null;
        }
        String k93 = k9();
        String l93 = l9();
        j12.k kVar = this.Y0;
        if (kVar != null) {
            return s5Var.a(k93, l93, kVar, a13);
        }
        Intrinsics.r("boardSectionService");
        throw null;
    }

    @Override // ha2.f
    public final void Y4(ha2.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        f7().d(new jc0.v(new lp.k(configuration), false, 0L, 30));
    }

    @Override // sq0.e
    public final int Y8() {
        return 0;
    }

    @Override // com.pinterest.feature.board.organize.g
    public final void c2(androidx.recyclerview.widget.q0 itemTouchHelper, boolean z13) {
        Intrinsics.checkNotNullParameter(itemTouchHelper, "itemTouchHelper");
        itemTouchHelper.i(z13 ? g8() : null);
    }

    @Override // com.pinterest.feature.board.organize.g
    public final void d4(rk0.j organizeMultiToolbar) {
        Intrinsics.checkNotNullParameter(organizeMultiToolbar, "organizeMultiToolbar");
        this.f130488k1 = organizeMultiToolbar;
        View findViewById = requireView().findViewById(k70.b.organize_header);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.C1 = (BoardSelectPinsHeaderView) findViewById;
        View findViewById2 = requireView().findViewById(k70.b.organize_floating_toolbar_card);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        FloatingToolbarView floatingToolbarView = (FloatingToolbarView) findViewById2;
        this.B1 = floatingToolbarView;
        if (floatingToolbarView == null) {
            Intrinsics.r("bottomOrganizeFloatingToolbarCard");
            throw null;
        }
        floatingToolbarView.setTranslationY(400.0f);
        FloatingToolbarView floatingToolbarView2 = this.B1;
        if (floatingToolbarView2 == null) {
            Intrinsics.r("bottomOrganizeFloatingToolbarCard");
            throw null;
        }
        ca0.y yVar = new ca0.y(((vn0.n) this.f130489l1.getValue()).c(), 24);
        BoardSelectPinsHeaderView boardSelectPinsHeaderView = this.C1;
        if (boardSelectPinsHeaderView == null) {
            Intrinsics.r("topOrganizeAppBar");
            throw null;
        }
        organizeMultiToolbar.v(floatingToolbarView2, yVar, boardSelectPinsHeaderView, k9());
        sn0.b bVar = this.f130486i1;
        Intrinsics.g(bVar, "null cannot be cast to non-null type com.pinterest.feature.board.organize.OrganizeView.OrganizeViewListener");
        organizeMultiToolbar.m(bVar, this);
        organizeMultiToolbar.j(g8());
        AppBarLayout appBarLayout = this.f130492o1;
        if (appBarLayout != null) {
            appBarLayout.b(organizeMultiToolbar.q());
        } else {
            Intrinsics.r("boardSectionHeaderContainer");
            throw null;
        }
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        jl0.d p13;
        rk0.j jVar = this.f130488k1;
        if (!com.bumptech.glide.d.o0((jVar == null || (p13 = jVar.p()) == null) ? null : Boolean.valueOf(p13.inOrganize()))) {
            nl1.d.J7();
            return false;
        }
        rk0.j jVar2 = this.f130488k1;
        if (jVar2 != null) {
            jVar2.u(jl0.d.VIEW);
        }
        return true;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getQ0() {
        return m9() ? a4.BOARD_SELF : a4.BOARD_OTHERS;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getP0() {
        return this.G1;
    }

    public final GestaltIconButton j9(int i13, rm1.q qVar, String str, b bVar) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        GestaltIconButton gestaltIconButton = new GestaltIconButton(6, requireContext, (AttributeSet) null);
        gestaltIconButton.t(new kl0.h(str, qVar, i13, 1));
        gestaltIconButton.u(new jq.m(bVar, gestaltIconButton, 3));
        GestaltToolbarImpl gestaltToolbarImpl = this.f130491n1;
        if (gestaltToolbarImpl != null) {
            gestaltToolbarImpl.c(gestaltIconButton);
            return gestaltIconButton;
        }
        Intrinsics.r("topAppBar");
        throw null;
    }

    public final String k9() {
        return com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_BOARD_ID", "");
    }

    public final String l9() {
        Navigation navigation = this.I;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        return f49940b == null ? com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_BOARD_SECTION_ID", "") : f49940b;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(k70.c.fragment_revamp_board_section, k70.b.p_recycler_view);
        eVar.f979c = k70.b.empty_state_container;
        eVar.c(k70.b.swipe_container);
        return eVar;
    }

    public final boolean m9() {
        v7 a13 = ew.a(k9());
        if (a13 == null) {
            n8 n8Var = n8.f40341a;
            String k93 = k9();
            wy0 f13 = ((b60.d) getActiveUserManager()).f();
            n8Var.getClass();
            return Intrinsics.d(n8.a(f13, k93), Boolean.TRUE);
        }
        wy0 Q = com.bumptech.glide.d.Q(getActiveUserManager());
        wy0 k13 = a13.k1();
        String uid = k13 != null ? k13.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        return dl2.b.S1(Q, uid);
    }

    @Override // com.pinterest.feature.board.organize.g
    public final y2 n5(int i13) {
        RecyclerView g83 = g8();
        if (g83 != null) {
            return g83.S0(i13);
        }
        return null;
    }

    public final String n9(int i13, boolean z13) {
        String string = getResources().getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return !z13 ? "" : dl2.b.Q1() ? a.a.j(" · ", string) : a.a.C(string, " · ");
    }

    public final void o9(int i13, zo.c boardViewType) {
        Intrinsics.checkNotNullParameter(boardViewType, "boardViewType");
        RecyclerView g83 = g8();
        if (g83 != null) {
            wa2.i iVar = W8().f103320a;
            int i14 = c.f130465a[boardViewType.ordinal()];
            if (i14 == 1) {
                iVar.f128797t = true;
                iVar.f128791q = true;
                iVar.f128793r = false;
            } else if (i14 != 2) {
                iVar.f128797t = false;
                iVar.f128791q = false;
                iVar.f128793r = false;
            } else {
                iVar.f128797t = true;
                iVar.f128791q = false;
                iVar.f128793r = true;
            }
            sn0.b bVar = this.f130486i1;
            if (bVar != null) {
                wa2.i pinFeatureConfig = W8().f103320a;
                Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
                wa2.i pinFeatureConfig2 = wa2.i.a(pinFeatureConfig, false, false, false, true, false, false, false, null, null, null, null, -5242881, -1, 1023);
                tn0.e eVar = ((un0.h) bVar).M;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(pinFeatureConfig2, "pinFeatureConfig");
                eVar.o(66, new yi0.a(pinFeatureConfig2, eVar.Q));
            }
            l2 l2Var = g83.f19242n;
            PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = l2Var instanceof PinterestStaggeredGridLayoutManager ? (PinterestStaggeredGridLayoutManager) l2Var : null;
            if (pinterestStaggeredGridLayoutManager != null) {
                d0 d0Var = this.X0;
                if (d0Var == null) {
                    Intrinsics.r("gridColumnCountProvider");
                    throw null;
                }
                pinterestStaggeredGridLayoutManager.h1(d0Var.a(boardViewType.toGridRepStyle()));
                P8();
                sn0.b bVar2 = this.f130486i1;
                pinterestStaggeredGridLayoutManager.e1((bVar2 != null ? ((un0.h) bVar2).x3() : 0) - 1, 0);
            }
            z zVar = (z) this.f139732f0;
            if (zVar != null) {
                sn0.b bVar3 = this.f130486i1;
                zVar.l(bVar3 != null ? ((un0.h) bVar3).x3() : 0, i13);
            }
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        v vVar = this.f130479b1;
        if (vVar == null) {
            Intrinsics.r("boardSectionExperiments");
            throw null;
        }
        vVar.a();
        super.onCreate(bundle);
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        HashSet hashSet = this.f130490m1;
        ArrayList Q = CollectionsKt.Q(CollectionsKt.F0(hashSet));
        ArrayList arrayList = new ArrayList();
        Iterator it = Q.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Animator) next).isRunning()) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Animator) it2.next()).cancel();
        }
        hashSet.clear();
        AppBarLayout appBarLayout = this.f130492o1;
        if (appBarLayout == null) {
            Intrinsics.r("boardSectionHeaderContainer");
            throw null;
        }
        appBarLayout.l((com.google.android.material.appbar.h) this.F1.getValue());
        this.f130488k1 = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [wn0.b] */
    /* JADX WARN: Type inference failed for: r8v1, types: [wn0.b] */
    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(v13, "v");
        View findViewById = v13.findViewById(k70.b.toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) findViewById;
        this.f130491n1 = gestaltToolbarImpl;
        if (gestaltToolbarImpl == null) {
            Intrinsics.r("topAppBar");
            throw null;
        }
        rm1.q qVar = rm1.q.ARROW_BACK;
        Context context = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int drawableRes = qVar.drawableRes(context, dl2.b.f1(context2));
        final int i13 = 1;
        gestaltToolbarImpl.N(1);
        gestaltToolbarImpl.M(eo1.b.color_themed_background_default);
        Context context3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
        int i14 = eo1.b.color_themed_dark_gray;
        Intrinsics.checkNotNullParameter(context3, "context");
        Object obj = d5.a.f53679a;
        Drawable drawable2 = context3.getDrawable(drawableRes);
        Intrinsics.checkNotNullParameter(context3, "context");
        if (drawable2 != null) {
            int color = i14 == 0 ? context3.getColor(df0.a.f54892a) : context3.getColor(i14);
            Intrinsics.checkNotNullParameter(context3, "context");
            if (color == 0) {
                color = context3.getColor(df0.a.f54892a);
            }
            drawable = drawable2.mutate();
            drawable.setTint(color);
        } else {
            drawable = null;
        }
        gestaltToolbarImpl.S(drawable);
        final int i15 = 0;
        gestaltToolbarImpl.v().setOnClickListener(new View.OnClickListener(this) { // from class: wn0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f130464b;

            {
                this.f130464b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i16 = i15;
                j this$0 = this.f130464b;
                switch (i16) {
                    case 0:
                        int i17 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P7();
                        break;
                    case 1:
                        int i18 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sn0.b bVar = this$0.f130486i1;
                        if (bVar != null) {
                            ((un0.h) bVar).K3();
                            break;
                        }
                        break;
                    case 2:
                        int i19 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sn0.b bVar2 = this$0.f130486i1;
                        if (bVar2 != null) {
                            ((un0.h) bVar2).H3();
                            break;
                        }
                        break;
                    default:
                        int i23 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sn0.b bVar3 = this$0.f130486i1;
                        if (bVar3 != null) {
                            ((un0.h) bVar3).J3();
                            break;
                        }
                        break;
                }
            }
        });
        gestaltToolbarImpl.z().setOnClickListener(new View.OnClickListener(this) { // from class: wn0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f130464b;

            {
                this.f130464b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i16 = i13;
                j this$0 = this.f130464b;
                switch (i16) {
                    case 0:
                        int i17 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P7();
                        break;
                    case 1:
                        int i18 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sn0.b bVar = this$0.f130486i1;
                        if (bVar != null) {
                            ((un0.h) bVar).K3();
                            break;
                        }
                        break;
                    case 2:
                        int i19 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sn0.b bVar2 = this$0.f130486i1;
                        if (bVar2 != null) {
                            ((un0.h) bVar2).H3();
                            break;
                        }
                        break;
                    default:
                        int i23 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sn0.b bVar3 = this$0.f130486i1;
                        if (bVar3 != null) {
                            ((un0.h) bVar3).J3();
                            break;
                        }
                        break;
                }
            }
        });
        gestaltToolbarImpl.z().setAlpha(0.0f);
        gestaltToolbarImpl.H();
        int i16 = t0.board_host_message_icon;
        rm1.q qVar2 = rm1.q.SPEECH_ELLIPSIS;
        String string = getResources().getString(d70.g.accessibility_message_icon);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        final int i17 = 2;
        this.f130494q1 = j9(i16, qVar2, string, new View.OnClickListener(this) { // from class: wn0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f130464b;

            {
                this.f130464b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i162 = i17;
                j this$0 = this.f130464b;
                switch (i162) {
                    case 0:
                        int i172 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P7();
                        break;
                    case 1:
                        int i18 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sn0.b bVar = this$0.f130486i1;
                        if (bVar != null) {
                            ((un0.h) bVar).K3();
                            break;
                        }
                        break;
                    case 2:
                        int i19 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sn0.b bVar2 = this$0.f130486i1;
                        if (bVar2 != null) {
                            ((un0.h) bVar2).H3();
                            break;
                        }
                        break;
                    default:
                        int i23 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sn0.b bVar3 = this$0.f130486i1;
                        if (bVar3 != null) {
                            ((un0.h) bVar3).J3();
                            break;
                        }
                        break;
                }
            }
        });
        int i18 = t0.board_host_options_icon;
        rm1.q qVar3 = rm1.q.ELLIPSIS;
        String string2 = getResources().getString(m60.x0.more_options);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        final int i19 = 3;
        this.f130493p1 = j9(i18, qVar3, string2, new View.OnClickListener(this) { // from class: wn0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f130464b;

            {
                this.f130464b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i162 = i19;
                j this$0 = this.f130464b;
                switch (i162) {
                    case 0:
                        int i172 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P7();
                        break;
                    case 1:
                        int i182 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sn0.b bVar = this$0.f130486i1;
                        if (bVar != null) {
                            ((un0.h) bVar).K3();
                            break;
                        }
                        break;
                    case 2:
                        int i192 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sn0.b bVar2 = this$0.f130486i1;
                        if (bVar2 != null) {
                            ((un0.h) bVar2).H3();
                            break;
                        }
                        break;
                    default:
                        int i23 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sn0.b bVar3 = this$0.f130486i1;
                        if (bVar3 != null) {
                            ((un0.h) bVar3).J3();
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById2 = v13.findViewById(k70.b.board_section_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltPreviewTextView gestaltPreviewTextView = (GestaltPreviewTextView) findViewById2;
        this.f130497t1 = gestaltPreviewTextView;
        if (gestaltPreviewTextView == null) {
            Intrinsics.r("sectionDescriptionView");
            throw null;
        }
        gestaltPreviewTextView.j(new gm1.a(this) { // from class: wn0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f130462b;

            {
                this.f130462b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                int i23 = i13;
                j this$0 = this.f130462b;
                switch (i23) {
                    case 0:
                        int i24 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof rn1.f) {
                            this$0.P7();
                            return;
                        }
                        return;
                    default:
                        int i25 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof rn1.f) {
                            GestaltPreviewTextView gestaltPreviewTextView2 = this$0.f130497t1;
                            if (gestaltPreviewTextView2 != null) {
                                m0.g(gestaltPreviewTextView2, i.f130477i);
                                return;
                            } else {
                                Intrinsics.r("sectionDescriptionView");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        View findViewById3 = v13.findViewById(k70.b.board_pins_filter);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.A1 = (BoardPinsFilter) findViewById3;
        View findViewById4 = v13.findViewById(k70.b.board_tag);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f130498u1 = (GestaltText) findViewById4;
        View findViewById5 = v13.findViewById(k70.b.board_status_archived);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f130500w1 = (GestaltText) findViewById5;
        View findViewById6 = v13.findViewById(k70.b.board_status_secret);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f130499v1 = (GestaltText) findViewById6;
        View findViewById7 = v13.findViewById(k70.b.board_status_pin_section_count);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f130501x1 = (GestaltText) findViewById7;
        View findViewById8 = v13.findViewById(k70.b.board_collaborators);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f130502y1 = (RevampBoardHeaderCollaboratorView) findViewById8;
        View findViewById9 = v13.findViewById(k70.b.board_collaborators_text);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f130503z1 = (GestaltText) findViewById9;
        setPinalytics(s7());
        View findViewById10 = v13.findViewById(k70.b.board_section_header_container);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById10;
        appBarLayout.b((com.google.android.material.appbar.h) this.F1.getValue());
        Intrinsics.checkNotNullExpressionValue(findViewById10, "apply(...)");
        this.f130492o1 = appBarLayout;
        super.onViewCreated(v13, bundle);
        View findViewById11 = v13.findViewById(k70.b.board_title);
        GestaltText gestaltText = (GestaltText) findViewById11;
        gestaltText.j(new gm1.a(this) { // from class: wn0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f130462b;

            {
                this.f130462b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                int i23 = i15;
                j this$0 = this.f130462b;
                switch (i23) {
                    case 0:
                        int i24 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof rn1.f) {
                            this$0.P7();
                            return;
                        }
                        return;
                    default:
                        int i25 = j.H1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof rn1.f) {
                            GestaltPreviewTextView gestaltPreviewTextView2 = this$0.f130497t1;
                            if (gestaltPreviewTextView2 != null) {
                                m0.g(gestaltPreviewTextView2, i.f130477i);
                                return;
                            } else {
                                Intrinsics.r("sectionDescriptionView");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById11, "apply(...)");
        this.f130495r1 = gestaltText;
        View findViewById12 = v13.findViewById(k70.b.board_section_title);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f130496s1 = (GestaltText) findViewById12;
        v8();
        View findViewById13 = v13.findViewById(k70.b.board_section_header_advisory_notice);
        NoticeView noticeView = (NoticeView) findViewById13;
        noticeView.getClass();
        Intrinsics.checkNotNullExpressionValue(findViewById13, "apply(...)");
        this.D1 = noticeView;
        View findViewById14 = v13.findViewById(k70.b.board_section_header_advisory_container);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        this.E1 = (FrameLayout) findViewById14;
        vn0.n nVar = (vn0.n) this.f130489l1.getValue();
        i0 d03 = gi2.b.d0(getQ0(), this.G1, l9());
        String k93 = k9();
        String l93 = l9();
        tk0.c.Companion.getClass();
        nVar.h(d03, k93, l93, tk0.b.b());
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new h(this, null), 3);
    }

    @Override // com.pinterest.feature.board.organize.g
    public final void showLoadingSpinner(boolean z13) {
    }

    @Override // com.pinterest.feature.board.organize.g
    public final void u5(boolean z13) {
        AppBarLayout appBarLayout = this.f130492o1;
        if (appBarLayout == null) {
            Intrinsics.r("boardSectionHeaderContainer");
            throw null;
        }
        appBarLayout.setAlpha(z13 ? 1.0f : 0.4f);
        if (!z13) {
            appBarLayout.m(false, true);
        }
        RevampBoardHeaderCollaboratorView revampBoardHeaderCollaboratorView = this.f130502y1;
        if (revampBoardHeaderCollaboratorView == null) {
            Intrinsics.r("boardCollaborators");
            throw null;
        }
        revampBoardHeaderCollaboratorView.setEnabled(z13);
        BoardPinsFilter boardPinsFilter = this.A1;
        if (boardPinsFilter == null) {
            Intrinsics.r("boardSectionPinsFilter");
            throw null;
        }
        boardPinsFilter.setEnabled(z13);
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f139734h0;
        if (pinterestSwipeRefreshLayout == null) {
            return;
        }
        pinterestSwipeRefreshLayout.setEnabled(z13);
    }

    @Override // ha2.f
    public final void x2() {
        a.c.y(f7());
    }

    @Override // com.pinterest.feature.board.organize.g
    public final void z4(rk0.j organizeMultiToolbar) {
        Intrinsics.checkNotNullParameter(organizeMultiToolbar, "organizeMultiToolbar");
        this.f130488k1 = organizeMultiToolbar;
        View findViewById = requireView().findViewById(k70.b.board_floating_toolbar_card);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        FloatingToolbarView floatingToolbarView = (FloatingToolbarView) findViewById;
        if (floatingToolbarView == null) {
            Intrinsics.r("bottomFloatingToolbarCard");
            throw null;
        }
        ca0.y yVar = new ca0.y(((vn0.n) this.f130489l1.getValue()).c(), 23);
        GestaltToolbarImpl gestaltToolbarImpl = this.f130491n1;
        if (gestaltToolbarImpl == null) {
            Intrinsics.r("topAppBar");
            throw null;
        }
        organizeMultiToolbar.h(floatingToolbarView, yVar, gestaltToolbarImpl, k9(), s7());
        organizeMultiToolbar.b(g8());
        b9(getResources().getDimensionPixelOffset(d70.b.floating_toolbar_recycler_padding));
    }
}
