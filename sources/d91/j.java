package d91;

import a.cb;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import androidx.recyclerview.widget.v0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.storypin.creation.interesttagging.view.ShoppingBrandCapsule;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import de1.t;
import h32.a4;
import h32.d4;
import h32.g0;
import java.util.HashMap;
import kg.p;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;
import so.b4;
import so.oa;
import uj2.q;
import xk2.v;
import yq0.z;
import zd1.o;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ld91/j;", "Ljd1/d;", "Lx81/f;", "Lnr0/j;", "Ldl1/s;", "<init>", "()V", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class j extends a implements x81.f {

    /* renamed from: v1, reason: collision with root package name */
    public static final /* synthetic */ int f54083v1 = 0;

    /* renamed from: h1, reason: collision with root package name */
    public b4 f54084h1;

    /* renamed from: i1, reason: collision with root package name */
    public HorizontalScrollView f54085i1;

    /* renamed from: j1, reason: collision with root package name */
    public LinearLayout f54086j1;

    /* renamed from: k1, reason: collision with root package name */
    public a91.f f54087k1;

    /* renamed from: l1, reason: collision with root package name */
    public a91.f f54088l1;

    /* renamed from: m1, reason: collision with root package name */
    public t f54089m1;

    /* renamed from: n1, reason: collision with root package name */
    public t f54090n1;

    /* renamed from: o1, reason: collision with root package name */
    public t f54091o1;

    /* renamed from: p1, reason: collision with root package name */
    public final HashMap f54092p1 = new HashMap();

    /* renamed from: q1, reason: collision with root package name */
    public final v f54093q1 = xk2.m.b(i.f54079j);

    /* renamed from: r1, reason: collision with root package name */
    public final v f54094r1 = xk2.m.b(i.f54081l);

    /* renamed from: s1, reason: collision with root package name */
    public final v f54095s1 = xk2.m.b(i.f54080k);

    /* renamed from: t1, reason: collision with root package name */
    public final boolean f54096t1 = true;

    /* renamed from: u1, reason: collision with root package name */
    public final d4 f54097u1 = d4.VTO_PRODUCT_TAGGING;

    public final void C9(c91.g vtoFilterType, boolean z13) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(vtoFilterType, "vtoFilterType");
        ShoppingBrandCapsule shoppingBrandCapsule = (ShoppingBrandCapsule) this.f54092p1.get(vtoFilterType);
        if (shoppingBrandCapsule == null) {
            return;
        }
        if (z13) {
            Context requireContext = requireContext();
            int i13 = uc2.c.rounded_capsule_blue;
            Object obj = d5.a.f53679a;
            drawable = requireContext.getDrawable(i13);
        } else {
            Context requireContext2 = requireContext();
            int i14 = dq1.b.rounded_capsule_brio_light_grey;
            Object obj2 = d5.a.f53679a;
            drawable = requireContext2.getDrawable(i14);
        }
        shoppingBrandCapsule.setBackground(drawable);
    }

    @Override // jd1.d, sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL, new h81.b(this, 2));
    }

    @Override // jd1.d, sq0.e, nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.S7(toolbar);
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.d0(vn1.c.LIGHT);
        Context context = getContext();
        if (context != null) {
            Drawable u13 = gestaltToolbarImpl.u();
            int i13 = eo1.b.color_white_0;
            Object obj = d5.a.f53679a;
            u13.setTint(context.getColor(i13));
        }
        gestaltToolbarImpl.w().setOnClickListener(new x61.e(this, 21));
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
        p93.d(this.f54097u1, a4.VTO_PRODUCT_TAGGING_PRODUCT_FEED, null, null, q7());
        bVar.g(p93);
        bVar.f(m9());
        wk1.c a13 = bVar.a();
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        id1.h o93 = o9(requireContext2);
        b4 b4Var = this.f54084h1;
        if (b4Var == null) {
            Intrinsics.r("vtoProductSearchPresenterFactory");
            throw null;
        }
        HashMap h93 = h9();
        v vVar = this.f54093q1;
        o oVar = (o) vVar.getValue();
        v vVar2 = this.f54094r1;
        o oVar2 = (o) vVar2.getValue();
        v vVar3 = this.f54095s1;
        a91.f a14 = b4Var.a(o93, a13, h93, oVar, oVar2, (o) vVar3.getValue(), this);
        o oVar3 = (o) vVar.getValue();
        f0 n93 = n9();
        q p73 = p7();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Resources.Theme theme = requireContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        this.f54089m1 = p.w(a14, oVar3, n93, this.f54097u1, p73, resources, theme, getResources().getString(uc2.h.try_on_filters_brands));
        o oVar4 = (o) vVar2.getValue();
        f0 n94 = n9();
        q p74 = p7();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        Resources.Theme theme2 = requireContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme2, "getTheme(...)");
        this.f54090n1 = p.w(a14, oVar4, n94, this.f54097u1, p74, resources2, theme2, getResources().getString(uc2.h.try_on_filters_price));
        o oVar5 = (o) vVar3.getValue();
        f0 n95 = n9();
        q p75 = p7();
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        Resources.Theme theme3 = requireContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme3, "getTheme(...)");
        this.f54091o1 = p.w(a14, oVar5, n95, this.f54097u1, p75, resources3, theme3, getResources().getString(uc2.h.try_on_filters_colors));
        this.f54088l1 = a14;
        this.f54087k1 = a14;
        o b13 = o93.b();
        if (b13 != null) {
            b13.g();
        }
        a91.f fVar = this.f54087k1;
        Intrinsics.g(fVar, "null cannot be cast to non-null type com.pinterest.feature.search.visual.tryon.presenter.VTOProductSearchPresenter");
        return fVar;
    }

    @Override // jd1.d
    public final String g9() {
        return "visual_search/virtual_try_on/makeup_products/";
    }

    @Override // jd1.d, nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getE0() {
        return this.f54097u1;
    }

    @Override // jd1.d
    public final HashMap h9() {
        return z0.f(new Pair("enable_product_filters", "true"), new Pair("feed_source", String.valueOf(f42.i.PRODUCT_TAGGING.getValue())));
    }

    @Override // jd1.d
    public final /* bridge */ /* synthetic */ g0 k9() {
        return null;
    }

    @Override // jd1.d, yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(uc2.f.fragment_vto_product_search, uc2.d.p_recycler_view);
        eVar.c(uc2.d.shopping_multisection_swipe_container);
        eVar.f979c = uc2.d.empty_state_container;
        return eVar;
    }

    @Override // jd1.d, sq0.e, yq0.t
    public final v0 n8() {
        g41.a aVar = new g41.a(this, 4);
        getContext();
        PinterestGridLayoutManager pinterestGridLayoutManager = new PinterestGridLayoutManager(aVar, hf0.b.f69004d);
        pinterestGridLayoutManager.K = new ht0.p(this, pinterestGridLayoutManager, 3);
        return new v0(pinterestGridLayoutManager);
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(uc2.d.filters_scroll_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f54085i1 = (HorizontalScrollView) findViewById;
        View findViewById2 = onCreateView.findViewById(uc2.d.filters_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f54086j1 = (LinearLayout) findViewById2;
        F8(getString(uc2.h.try_on_filters_no_results));
        return onCreateView;
    }

    @Override // jd1.d
    /* renamed from: s9, reason: from getter */
    public final boolean getF117461i1() {
        return this.f54096t1;
    }

    @Override // jd1.d
    public final String u9() {
        String string = getResources().getString(r80.f.idea_pin_multiple_product_tag_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // jd1.d
    public final String v9() {
        return "shop_feed";
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (GestaltToolbarImpl) mainView.findViewById(uc2.d.toolbar);
    }

    @Override // jd1.d
    public final a4 x9() {
        return a4.VTO_PRODUCT_TAGGING_PRODUCT_FEED;
    }
}
