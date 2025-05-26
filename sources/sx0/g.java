package sx0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.pinterest.feature.newshub.feed.view.NewsHubEmptyStateView;
import com.pinterest.framework.screens.k;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import h32.f1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.h2;
import m60.g0;
import m60.t;
import nx.d0;
import pk.a0;
import px0.i;
import rb2.q;
import x02.w1;
import xk2.m;
import xk2.v;
import yq0.z;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u00032\u00020\u0004B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsx0/g;", "Lyq0/b0;", "", "Lmx0/c;", "Lcom/pinterest/framework/screens/k;", "<init>", "()V", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class g extends a<Object> implements mx0.c, k {
    public static final /* synthetic */ int T0 = 0;
    public w1 A0;
    public w12.b B0;
    public uo.a C0;
    public h2 D0;
    public uk1.e E0;
    public wk2.a F0;
    public g0 G0;
    public oc.c H0;
    public h12.a I0;
    public no1.d J0;
    public fp.b K0;
    public i L0;
    public q M0;
    public NewsHubEmptyStateView O0;

    /* renamed from: z0, reason: collision with root package name */
    public zf0.f f115624z0;
    public final v N0 = m.b(new c(this, 0));
    public final a4 P0 = a4.NEWS_HUB_FEED;
    public final d Q0 = new d(this);
    public final v R0 = m.b(new c(this, 13));
    public final v S0 = m.b(new c(this, 14));

    @Override // nl1.d
    public final void I7() {
        if (U8()) {
            d0.v(s7(), f1.CONVERSATION_INBOX_VIEWED, null, false, 12);
        }
        super.I7();
    }

    @Override // yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        if (U8()) {
            f7().h((t) this.R0.getValue());
            f7().h((t) this.S0.getValue());
        }
    }

    @Override // yq0.t, yk1.k, nl1.d
    public final void L7() {
        V8();
        super.L7();
    }

    @Override // com.pinterest.framework.screens.k
    public final void P4(Bundle bundle) {
        E8(0, true);
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(296, new c(this, 4));
        adapter.G(294, new c(this, 5));
        adapter.G(295, new c(this, 6));
        if (U8()) {
            adapter.G(3, new c(this, 7));
            adapter.G(18, new c(this, 8));
            adapter.G(5, new c(this, 9));
            adapter.G(4, new c(this, 10));
            adapter.G(23, new c(this, 11));
            adapter.G(24, new c(this, 12));
            adapter.G(25, new c(this, 2));
            adapter.G(297, new c(this, 3));
        }
    }

    @Override // nl1.d
    public final void S7(fo1.a gestaltToolbar) {
        Intrinsics.checkNotNullParameter(gestaltToolbar, "gestaltToolbar");
        if (U8()) {
            ((GestaltToolbarImpl) gestaltToolbar).Y(zu1.e.notification_host_inbox_tab);
        } else {
            ((GestaltToolbarImpl) gestaltToolbar).Y(c52.e.notifications);
        }
        ((GestaltToolbarImpl) gestaltToolbar).h0();
    }

    public final boolean U8() {
        return ((Boolean) this.N0.getValue()).booleanValue();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.E0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        uj2.q p73 = p7();
        w1 w1Var = this.A0;
        if (w1Var == null) {
            Intrinsics.r("newsHubRepository");
            throw null;
        }
        w12.b bVar = this.B0;
        if (bVar == null) {
            Intrinsics.r("newsHubService");
            throw null;
        }
        uo.a aVar = this.C0;
        if (aVar == null) {
            Intrinsics.r("graphQLNewsHubDataSource");
            throw null;
        }
        oc.c cVar = this.H0;
        if (cVar == null) {
            Intrinsics.r("apolloClient");
            throw null;
        }
        h12.a aVar2 = this.I0;
        if (aVar2 == null) {
            Intrinsics.r("boardInviteApi");
            throw null;
        }
        no1.d dVar = this.J0;
        if (dVar == null) {
            Intrinsics.r("contactRequestRemoteDataSource");
            throw null;
        }
        wk2.a aVar3 = this.F0;
        if (aVar3 == null) {
            Intrinsics.r("newsHubInAppNavigatorProvider");
            throw null;
        }
        Object obj = aVar3.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        nu1.a aVar4 = (nu1.a) obj;
        g0 g0Var = this.G0;
        if (g0Var != null) {
            return new i(g13, p73, w1Var, bVar, aVar, cVar, aVar2, dVar, aVar4, g0Var, new b(this, 0));
        }
        Intrinsics.r("pageSizeProvider");
        throw null;
    }

    public final void V8() {
        fp.b bVar = this.K0;
        if (bVar == null) {
            Intrinsics.r("declinedContactRequests");
            throw null;
        }
        if (bVar.c() || !U8()) {
            return;
        }
        fp.b bVar2 = this.K0;
        if (bVar2 == null) {
            Intrinsics.r("declinedContactRequests");
            throw null;
        }
        no1.d dVar = this.J0;
        if (dVar != null) {
            bVar2.a(dVar, new c(this, 1));
        } else {
            Intrinsics.r("contactRequestRemoteDataSource");
            throw null;
        }
    }

    @Override // nl1.d, jl1.a, com.pinterest.framework.screens.m
    public final void activate() {
        super.activate();
        f7().h(this.Q0);
        if (U8()) {
            f7().h((t) this.R0.getValue());
            f7().h((t) this.S0.getValue());
        }
    }

    @Override // nl1.d, jl1.a, com.pinterest.framework.screens.m
    public final void deactivate() {
        f7().j(this.Q0);
        super.deactivate();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getP0() {
        return this.P0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getK0() {
        return (this.D0 == null || !U8()) ? d4.NEWS_HUB : d4.UNIFIED_INBOX;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(zu1.d.fragment_news_hub_feed_multi_section, zu1.c.p_recycler_view);
        eVar.c(zu1.c.swipe_container);
        eVar.f979c = zu1.c.empty_state_container;
        return eVar;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (U8()) {
            f7().j((t) this.R0.getValue());
            f7().j((t) this.S0.getValue());
        }
        super.onDestroyView();
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        fo1.a i73;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        h2 h2Var = this.D0;
        if (h2Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        h2Var.a();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        a8(new wx0.a(a0.K(12, resources), new b(this, 2)));
        b8(new rx0.a(getResources().getDimensionPixelSize(eo1.c.toolbar_height), new b(this, 3)));
        Navigation navigation = this.I;
        if ((navigation == null || !navigation.S("com.pinterest.EXTRA_IS_DEEPLINK", false)) && (i73 = i7()) != null) {
            ((GestaltToolbarImpl) i73).B();
        }
        tq0.h f13 = vb0.i.f();
        f13.n(new com.pinterest.feature.newshub.b(s7(), f1.NEWS_HUB_FEED_IMPRESSION_ONE_PIXEL));
        Intrinsics.checkNotNullParameter(this, "observable");
        addRecyclerViewEventListener(f13);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        NewsHubEmptyStateView newsHubEmptyStateView = new NewsHubEmptyStateView(requireContext);
        newsHubEmptyStateView.L(new b(this, 1));
        this.O0 = newsHubEmptyStateView;
        O8(newsHubEmptyStateView, 17);
    }
}
