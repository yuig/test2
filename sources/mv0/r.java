package mv0;

import a.cb;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.v0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.ui.grid.PinterestRecyclerView;
import df.j1;
import h32.a4;
import h32.d4;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import so.oa;
import so.p8;
import x02.i2;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmv0/r;", "Ljd1/d;", "Ljv0/b;", "Lnr0/j;", "Ldl1/s;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class r extends d implements jv0.b {

    /* renamed from: t1, reason: collision with root package name */
    public static final /* synthetic */ int f88395t1 = 0;

    /* renamed from: h1, reason: collision with root package name */
    public p8 f88396h1;

    /* renamed from: i1, reason: collision with root package name */
    public GestaltStaticSearchBar f88397i1;

    /* renamed from: j1, reason: collision with root package name */
    public RelativeLayout f88398j1;

    /* renamed from: k1, reason: collision with root package name */
    public PinterestRecyclerView f88399k1;

    /* renamed from: l1, reason: collision with root package name */
    public o f88400l1;

    /* renamed from: m1, reason: collision with root package name */
    public lv0.g f88401m1;

    /* renamed from: n1, reason: collision with root package name */
    public lv0.g f88402n1;

    /* renamed from: o1, reason: collision with root package name */
    public String f88403o1;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f88404p1;

    /* renamed from: q1, reason: collision with root package name */
    public final n f88405q1;

    /* renamed from: r1, reason: collision with root package name */
    public final boolean f88406r1;

    /* renamed from: s1, reason: collision with root package name */
    public final d4 f88407s1;

    public r() {
        n nVar = new n();
        nVar.E(new p(this, 0));
        this.f88405q1 = nVar;
        this.S = false;
        this.f88406r1 = true;
        this.f88407s1 = d4.PRODUCT_TAGGING;
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        String searchQuery;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (!Intrinsics.d(code, "com.pinterest.EXTRA_STORY_PIN_PRODUCT_SEARCH_QUERY") || (searchQuery = result.getString("com.pinterest.EXTRA_SEARCH_ENTERED_QUERY")) == null) {
            return;
        }
        this.f88403o1 = searchQuery;
        if (this.f88397i1 == null) {
            this.f88404p1 = true;
            return;
        }
        lv0.g gVar = this.f88402n1;
        if (gVar != null) {
            gVar.D3(searchQuery);
        }
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        GestaltStaticSearchBar gestaltStaticSearchBar = this.f88397i1;
        if (gestaltStaticSearchBar != null) {
            oe.f.n(gestaltStaticSearchBar, new zu0.c(searchQuery, 5));
        } else {
            Intrinsics.r("searchBar");
            throw null;
        }
    }

    @Override // jd1.d, sq0.e, yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL, new q(this, 0));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_RECENTLY_SAVED_PRODUCT_HEADER, new q(this, 1));
    }

    @Override // jd1.d, yk1.k
    public final yk1.m V7() {
        Bundle f49207c;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        uk1.d p93 = p9();
        p93.d(this.f88407s1, a4.PRODUCT_TAGGING_SEARCH_PRODUCT_FEED, null, null, q7());
        bVar.g(p93);
        bVar.f(m9());
        wk1.c a13 = bVar.a();
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        id1.h o93 = o9(requireContext2);
        p8 p8Var = this.f88396h1;
        if (p8Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        Context requireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
        boolean G = com.bumptech.glide.d.G(this, "com.pinterest.EXTRA_IDEA_PIN_METADATA_IS_FROM_FINISHING_TOUCHES", false);
        g0 g0Var = (g0) this.P0.getValue();
        Object[] objArr = new Object[1];
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        objArr[0] = f13 != null ? f13.getUid() : null;
        String V = j1.V("users/%s/pins/products/", objArr);
        HashMap h93 = h9();
        k81.k kVar = new k81.k();
        if (getF117461i1()) {
            kVar.a(q9());
        }
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        i2 m93 = m9();
        ScreenDescription screenDescription = this.f76937a;
        this.f88401m1 = p8Var.a(requireContext3, G, o93, a13, g0Var, V, h93, kVar, resources, m93, (screenDescription == null || (f49207c = screenDescription.getF49207c()) == null) ? null : f49207c.getString("com.pinterest.EXTRA_STORY_PIN_PRODUCT_ID"), this);
        zd1.o b13 = o93.b();
        if (b13 != null) {
            lv0.g gVar = this.f88401m1;
            Intrinsics.f(gVar);
            b13.c(gVar);
        }
        zd1.o b14 = o93.b();
        if (b14 != null) {
            b14.g();
        }
        lv0.g gVar2 = this.f88401m1;
        this.f88402n1 = gVar2;
        Intrinsics.g(gVar2, "null cannot be cast to non-null type com.pinterest.feature.ideaPinCreation.producttagging.presenter.IdeaPinProductSearchPresenter");
        return gVar2;
    }

    @Override // jd1.d
    public final String g9() {
        return "search/pins/";
    }

    @Override // jd1.d, nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF140467e0() {
        return this.f88407s1;
    }

    @Override // jd1.d
    public final h32.g0 k9() {
        return null;
    }

    @Override // jd1.d, yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(aq1.f.fragment_idea_pins_product_search, aq1.d.p_recycler_view);
        eVar.c(aq1.d.shopping_multisection_swipe_container);
        eVar.f979c = aq1.d.empty_state_container;
        return eVar;
    }

    @Override // jd1.d, sq0.e, yq0.t
    public final v0 n8() {
        return t9();
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(aq1.d.story_pin_product_search_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f88397i1 = (GestaltStaticSearchBar) findViewById;
        View findViewById2 = onCreateView.findViewById(aq1.d.pin_details_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f88398j1 = (RelativeLayout) findViewById2;
        View findViewById3 = onCreateView.findViewById(aq1.d.brands_recycler_view);
        PinterestRecyclerView pinterestRecyclerView = (PinterestRecyclerView) findViewById3;
        cp.b bVar = new cp.b(this, 21);
        pinterestRecyclerView.getContext();
        pinterestRecyclerView.l(new PinterestLinearLayoutManager(bVar, 0, false));
        pinterestRecyclerView.j(this.f88405q1);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f88399k1 = pinterestRecyclerView;
        GestaltStaticSearchBar gestaltStaticSearchBar = this.f88397i1;
        if (gestaltStaticSearchBar == null) {
            Intrinsics.r("searchBar");
            throw null;
        }
        oe.f.n(gestaltStaticSearchBar, new p(this, 1));
        F8(getString(aq1.h.product_search_view_empty_state_message));
        onCreateView.post(new vs0.b(this, 7));
        return onCreateView;
    }

    @Override // jd1.d
    /* renamed from: s9, reason: from getter */
    public final boolean getF117461i1() {
        return this.f88406r1;
    }

    @Override // nl1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        HashMap hashMap = new HashMap();
        String str = this.f88403o1;
        if (str != null) {
            hashMap.put("entered_query", str);
        }
        return hashMap;
    }

    @Override // jd1.d
    public final String v9() {
        return "shop_feed";
    }

    @Override // jd1.d
    public final a4 x9() {
        return a4.PRODUCT_TAGGING_SEARCH_PRODUCT_FEED;
    }
}
