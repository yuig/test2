package k90;

import a.cb;
import a.sc;
import android.R;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.q;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n3;
import androidx.recyclerview.widget.v0;
import com.pinterest.collage.cutoutcloseup.layoutmanager.CollagesCarouselLayoutManager;
import com.pinterest.collage.cutoutcloseup.view.CutoutCarouselView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.f1;
import h32.g0;
import java.util.WeakHashMap;
import kg.t;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import lh0.e0;
import lr.v;
import m60.d0;
import m60.y;
import pk.a0;
import q5.m0;
import qa2.n;
import so.oa;
import so.q6;
import yq0.z;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk90/c;", "Ljd1/d;", "Lc90/a;", "Lnr0/j;", "Ldl1/s;", "<init>", "()V", "cutoutCloseup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends m implements c90.a {

    /* renamed from: v1, reason: collision with root package name */
    public static final /* synthetic */ int f78723v1 = 0;

    /* renamed from: h1, reason: collision with root package name */
    public d0 f78724h1;

    /* renamed from: i1, reason: collision with root package name */
    public q6 f78725i1;

    /* renamed from: j1, reason: collision with root package name */
    public n3 f78726j1;

    /* renamed from: k1, reason: collision with root package name */
    public pb0.a f78727k1;

    /* renamed from: l1, reason: collision with root package name */
    public np0.g f78728l1;

    /* renamed from: m1, reason: collision with root package name */
    public nx.k f78729m1;

    /* renamed from: n1, reason: collision with root package name */
    public e0 f78730n1;

    /* renamed from: o1, reason: collision with root package name */
    public hs.d f78731o1;

    /* renamed from: p1, reason: collision with root package name */
    public View f78732p1;

    /* renamed from: q1, reason: collision with root package name */
    public f90.b f78733q1;

    /* renamed from: r1, reason: collision with root package name */
    public ca2.e f78734r1;

    /* renamed from: s1, reason: collision with root package name */
    public View f78735s1;

    /* renamed from: t1, reason: collision with root package name */
    public CutoutCarouselView f78736t1;

    /* renamed from: u1, reason: collision with root package name */
    public long f78737u1;

    public final pb0.a C9() {
        pb0.a aVar = this.f78727k1;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("clock");
        throw null;
    }

    public final String D9() {
        Navigation navigation = this.I;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        return f49940b == null ? "" : f49940b;
    }

    public final void E9() {
        if (F9()) {
            nx.d0.B(s7(), f1.COLLAGE_CUTOUT_DRAWER_CLOSE, null, null, null, 30);
        }
        int d2 = hf0.b.d(E4());
        ca2.e eVar = this.f78734r1;
        if (eVar == null) {
            Intrinsics.r("bottomSheetController");
            throw null;
        }
        float g13 = d2 - eVar.g();
        ca2.e eVar2 = this.f78734r1;
        if (eVar2 != null) {
            ca2.e.i(eVar2, "navigation", g13, null, 4);
        } else {
            Intrinsics.r("bottomSheetController");
            throw null;
        }
    }

    public final boolean F9() {
        return com.bumptech.glide.d.G(this, "EXTRA_COLLAGES_SHUFFLE_ITEM_IS_COLLAGE_AD", false);
    }

    @Override // jd1.d, sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(845239, new b10.z(7, this, requireContext));
    }

    @Override // jd1.d, sq0.e
    public final n T8(nr0.b pinActionHandler) {
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        return new qa2.f(s7(), y32.f.CLOSEUP_LONGPRESS, pinActionHandler, "pin").a(new yk1.a(getResources(), requireContext().getTheme()));
    }

    @Override // jd1.d, yk1.k
    public final yk1.m V7() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        uk1.d p93 = p9();
        p93.d(this.f75509a1, a4.PIN_CLOSEUP, null, g0.PIN_CLOSEUP, null);
        String q73 = q7();
        if (q73 != null) {
            p93.f122380b = q73;
        }
        bVar.g(p93);
        bVar.f(m9());
        wk1.c a13 = bVar.a();
        q6 q6Var = this.f78725i1;
        if (q6Var == null) {
            Intrinsics.r("collagesBottomSheetPresenterFactory");
            throw null;
        }
        f90.b a14 = q6Var.a(D9(), com.bumptech.glide.d.Z(this, "EXTRA_COLLAGES_SHUFFLE_ITEM_ID", ""), com.bumptech.glide.d.Z(this, "EXTRA_COLLAGES_SHUFFLE_ITEM_ASSET_ID", ""), a13, m9(), F9(), com.bumptech.glide.d.Z(this, "EXTRA_COLLAGES_ROOT_PIN_ID", ""));
        this.f78733q1 = a14;
        return a14;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        E9();
        return true;
    }

    @Override // jd1.d
    public final String g9() {
        return "";
    }

    @Override // sq0.e, sq0.b0
    /* renamed from: getNumColumns */
    public final int getT0() {
        d0 d0Var = this.f78724h1;
        if (d0Var != null) {
            return d0Var.a(y.REGULAR);
        }
        Intrinsics.r("gridColumnCountProvider");
        throw null;
    }

    @Override // jd1.d
    public final g0 k9() {
        return g0.PIN_CLOSEUP;
    }

    @Override // jd1.d, yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(a90.d.collages_bottom_sheet_fragment, a90.c.p_recycler_view);
        eVar.f979c = a90.c.collages_bottom_sheet_loading_layout;
        return eVar;
    }

    @Override // jd1.d, sq0.e, yq0.t
    public final v0 n8() {
        n3 n3Var = this.f78726j1;
        if (n3Var == null) {
            Intrinsics.r("pinterestStaggeredGridLayoutManagerFactory");
            throw null;
        }
        PinterestStaggeredGridLayoutManagerImpl f13 = n3Var.f(r8(), getT0());
        f13.f1(getT0() == 2 ? 10 : 0);
        f13.M1(CollectionsKt.m0(845239, RecyclerViewTypes.FULL_SPAN_ITEM_TYPES));
        return new v0(f13);
    }

    @Override // jd1.d, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        hs.d dVar = this.f78731o1;
        if (dVar == null) {
            Intrinsics.r("moduleViewabilityHelper");
            throw null;
        }
        if (dVar.a() && (!hf0.b.q() || !hf0.b.m())) {
            FragmentActivity requireActivity = requireActivity();
            l0.j1(requireActivity.getWindow(), false);
            if (requireActivity.getWindow().getStatusBarColor() != 0) {
                requireActivity.getWindow().setStatusBarColor(0);
            }
            Window window = requireActivity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            a0.f1(window);
            View findViewById = requireActivity.getWindow().getDecorView().findViewById(R.id.content);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            sc scVar = new sc(25);
            WeakHashMap weakHashMap = q5.v0.f102521a;
            m0.n(findViewById, scVar);
        }
        C9();
        this.f78737u1 = System.currentTimeMillis();
        this.L = false;
        this.M = true;
        super.onCreate(bundle);
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        int i13;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(a90.c.collages_bottom_sheet_background);
        findViewById.setAlpha(0.0f);
        findViewById.setOnClickListener(new tq.j(this, 18));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f78732p1 = findViewById;
        bh.b bVar = new bh.b(s7(), new v(this, 22));
        a aVar = new a(this, 0);
        int O = com.bumptech.glide.d.O(this, "EXTRA_COLLAGES_SHUFFLE_WIDTH", hf0.b.f69002b);
        if (F9()) {
            i13 = (int) (hf0.b.d(E4()) * (F9() ? 0.6d : 0.66d));
        } else {
            i13 = -1;
        }
        ca2.e eVar = new ca2.e(true, aVar, 0, 0, Integer.valueOf(O), i13, null, bVar, false, false, 844);
        eVar.m(onCreateView.findViewById(a90.c.collages_bottom_sheet));
        this.f78734r1 = eVar;
        int X = bs1.c.X(this, eo1.c.space_800);
        int X2 = bs1.c.X(this, eo1.c.space_300);
        int X3 = bs1.c.X(this, eo1.c.space_200);
        int i14 = X + X2 + X3;
        View findViewById2 = onCreateView.findViewById(a90.c.collages_bottom_sheet_header);
        Intrinsics.f(findViewById2);
        ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -1;
        layoutParams.height = i14;
        findViewById2.setLayoutParams(layoutParams);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f78735s1 = findViewById2;
        ViewGroup viewGroup2 = (ViewGroup) onCreateView.findViewById(a90.c.collages_bottom_sheet_header_close_button);
        Context context = getContext();
        View view = null;
        byte b13 = 0;
        if (context != null) {
            GestaltIconButton gestaltIconButton = new GestaltIconButton(6, context, (AttributeSet) (b13 == true ? 1 : 0));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMarginStart(bs1.c.W(gestaltIconButton, eo1.c.space_300));
            layoutParams2.topMargin = X2;
            layoutParams2.bottomMargin = X3;
            layoutParams2.gravity = 8388627;
            gestaltIconButton.setLayoutParams(layoutParams2);
            gestaltIconButton.t(b.f78716j);
            gestaltIconButton.u(new xo.k(this, 27));
            view = gestaltIconButton;
        }
        viewGroup2.addView(view);
        View findViewById3 = onCreateView.findViewById(a90.c.collages_bottom_sheet_carousel);
        CutoutCarouselView cutoutCarouselView = (CutoutCarouselView) findViewById3;
        cutoutCarouselView.setLayoutParams(new RelativeLayout.LayoutParams(com.bumptech.glide.d.O(this, "EXTRA_COLLAGES_SHUFFLE_WIDTH", hf0.b.f69002b), -2));
        int q13 = t.q(com.bumptech.glide.d.O(this, "EXTRA_COLLAGES_SHUFFLE_WIDTH", hf0.b.f69002b), bs1.c.W(cutoutCarouselView, a90.a.collages_bottom_sheet_carousel_item_width));
        cp.b bVar2 = new cp.b(this, 3);
        Context context2 = cutoutCarouselView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        cutoutCarouselView.R2(new CollagesCarouselLayoutManager(bVar2, context2, new q(this, 0), q13));
        cutoutCarouselView.setTranslationY(-bs1.c.W(cutoutCarouselView, a90.a.collages_bottom_sheet_top_margin_collapsed_mode));
        cutoutCarouselView.H2(new b90.b(q13));
        cutoutCarouselView.addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 10));
        Intrinsics.checkNotNullExpressionValue(findViewById3, "also(...)");
        this.f78736t1 = cutoutCarouselView;
        RecyclerView g83 = g8();
        if (g83 != null) {
            g83.f19220c.c().h(845239);
            g83.setOverScrollMode(2);
            g83.setTranslationY(-bs1.c.W(g83, a90.a.collages_bottom_sheet_top_margin_collapsed_mode));
        }
        return onCreateView;
    }

    @Override // jd1.d, sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ca2.e eVar = this.f78734r1;
        if (eVar == null) {
            Intrinsics.r("bottomSheetController");
            throw null;
        }
        eVar.l();
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

    @Override // jd1.d
    public final String v9() {
        return "pin";
    }

    @Override // jd1.d
    public final a4 x9() {
        return a4.PIN_CLOSEUP;
    }
}
