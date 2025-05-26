package tx0;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.m1;
import com.pinterest.feature.newshub.feed.view.NewsHubEmptyStateView;
import h32.a4;
import h32.d4;
import h32.f1;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import nx.d0;
import o82.b3;
import x02.w1;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Ltx0/o;", "Lo82/i3;", "<init>", "()V", "Luk1/d;", "presenterPinalytics", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class o extends b {
    public static final /* synthetic */ int O0 = 0;
    public w12.b F0;
    public uo.a G0;
    public w1 H0;
    public wk2.a I0;
    public uk1.e J0;
    public final m1 K0;
    public final xk2.v L0;
    public final d4 M0;
    public final a4 N0;

    public o() {
        int i13 = 10;
        int i14 = 9;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new uv0.f(i14, new kl0.w(this, i13)));
        this.K0 = a1.s(this, k0.f80436a.b(a0.class), new ml0.v(a13, i14), new kl0.x(null, a13, i13), new kl0.y(this, a13, i13));
        this.L0 = xk2.m.b(new h(this, 0));
        this.M0 = d4.NEWS_HUB;
        this.N0 = a4.NEWS_HUB_FEED;
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(((a0) this.K0.getValue()).a(), 25);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new j(((a0) this.K0.getValue()).c(), 0);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        xk2.v b13 = xk2.m.b(new h(this, 3));
        h hVar = new h(this, 1);
        d0 d0Var = ((uk1.d) b13.getValue()).f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        wk2.a aVar = this.I0;
        if (aVar == null) {
            Intrinsics.r("newsHubInAppNavigatorProvider");
            throw null;
        }
        Object obj = aVar.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        nu1.a aVar2 = (nu1.a) obj;
        w12.b bVar = this.F0;
        if (bVar == null) {
            Intrinsics.r("newsHubService");
            throw null;
        }
        uo.a aVar3 = this.G0;
        if (aVar3 == null) {
            Intrinsics.r("graphQLNewsHubDataSource");
            throw null;
        }
        adapter.E(296, hVar, new xv.g(d0Var, aVar2, bVar, aVar3), n.f119665j);
        h hVar2 = new h(this, 2);
        d0 d0Var2 = ((uk1.d) b13.getValue()).f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
        wk2.a aVar4 = this.I0;
        if (aVar4 == null) {
            Intrinsics.r("newsHubInAppNavigatorProvider");
            throw null;
        }
        Object obj2 = aVar4.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        nu1.a aVar5 = (nu1.a) obj2;
        w12.b bVar2 = this.F0;
        if (bVar2 == null) {
            Intrinsics.r("newsHubService");
            throw null;
        }
        uo.a aVar6 = this.G0;
        if (aVar6 != null) {
            adapter.E(294, hVar2, new xv.g(d0Var2, aVar5, bVar2, aVar6), n.f119666k);
        } else {
            Intrinsics.r("graphQLNewsHubDataSource");
            throw null;
        }
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF35234i() {
        return this.N0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF2091g0() {
        return this.M0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(zu1.d.fragment_news_hub_feed, zu1.c.p_recycler_view);
        eVar.c(zu1.c.swipe_container);
        eVar.f979c = zu1.c.empty_state_container;
        return eVar;
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new m(this, null), 3);
        tq0.h f13 = vb0.i.f();
        f13.n(new com.pinterest.feature.newshub.b(s7(), f1.NEWS_HUB_FEED_IMPRESSION_ONE_PIXEL));
        Intrinsics.checkNotNullParameter(this, "observable");
        addRecyclerViewEventListener(f13);
        O8((NewsHubEmptyStateView) this.L0.getValue(), 17);
    }
}
