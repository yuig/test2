package hx0;

import android.content.Context;
import androidx.camera.core.impl.j;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.dh;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.qx;
import com.pinterest.api.model.tx;
import com.pinterest.feature.pin.RepinAnimationData;
import com.pinterest.feature.pin.r;
import com.pinterest.ui.grid.PinterestRecyclerView;
import dl1.s;
import g70.h;
import gi.m;
import gp1.k;
import h32.f1;
import h32.g0;
import h32.n1;
import h32.u0;
import i32.l;
import i32.y0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kx0.o;
import kx0.u;
import lh0.a4;
import lh0.g1;
import lh0.h2;
import lh0.z3;
import m60.w;
import mj0.g;
import ni1.d0;
import ni1.t2;
import nx.d1;
import qa2.h0;
import so.n6;
import wk1.i;
import wk1.n;
import zf0.f;

/* loaded from: classes5.dex */
public final class e extends n implements ux0.a, g {

    /* renamed from: a, reason: collision with root package name */
    public final ku1.a f70507a;

    /* renamed from: b, reason: collision with root package name */
    public final w f70508b;

    /* renamed from: c, reason: collision with root package name */
    public final uo.a f70509c;

    /* renamed from: d, reason: collision with root package name */
    public final f f70510d;

    /* renamed from: e, reason: collision with root package name */
    public final m f70511e;

    /* renamed from: f, reason: collision with root package name */
    public final h2 f70512f;

    /* renamed from: g, reason: collision with root package name */
    public final e02.a f70513g;

    /* renamed from: h, reason: collision with root package name */
    public final il1.a f70514h;

    /* renamed from: i, reason: collision with root package name */
    public final r f70515i;

    /* renamed from: j, reason: collision with root package name */
    public final h f70516j;

    /* renamed from: k, reason: collision with root package name */
    public final com.pinterest.feature.newshub.b f70517k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f70518l;

    /* renamed from: m, reason: collision with root package name */
    public final k f70519m;

    /* renamed from: n, reason: collision with root package name */
    public final gx0.e f70520n;

    /* renamed from: o, reason: collision with root package name */
    public final com.pinterest.framework.multisection.datasource.pagedlist.f f70521o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f70522p;

    /* renamed from: q, reason: collision with root package name */
    public final c f70523q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String id3, wk1.c params, Context context, ku1.a navigationManager, w eventManager, uo.a graphQLNewsHubDataSource, f educationHelper, m eventController, h2 newsHubExperiments, d1 trackingParamAttacher, x12.a newsHubDetailPagedListService, nr0.m dynamicGridViewBinderDelegateFactory, pb0.d fuzzyDateFormatter, b60.b activeUserManager, t2 viewModelFactory, d0 pinModelToVMStateConverterFactory, e02.a boardRouter, il1.a fragmentFactory, r repinAnimationUtil, j repinHelper, h boardNavigator) {
        super(params);
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(graphQLNewsHubDataSource, "graphQLNewsHubDataSource");
        Intrinsics.checkNotNullParameter(educationHelper, "educationHelper");
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        Intrinsics.checkNotNullParameter(newsHubExperiments, "newsHubExperiments");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(newsHubDetailPagedListService, "newsHubDetailPagedListService");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(pinModelToVMStateConverterFactory, "pinModelToVMStateConverterFactory");
        Intrinsics.checkNotNullParameter(boardRouter, "boardRouter");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(repinHelper, "repinHelper");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f70507a = navigationManager;
        this.f70508b = eventManager;
        this.f70509c = graphQLNewsHubDataSource;
        this.f70510d = educationHelper;
        this.f70511e = eventController;
        this.f70512f = newsHubExperiments;
        this.f70513g = boardRouter;
        this.f70514h = fragmentFactory;
        this.f70515i = repinAnimationUtil;
        this.f70516j = boardNavigator;
        this.f70517k = new com.pinterest.feature.newshub.b(getPinalytics(), f1.NEWS_HUB_DETAIL_IMPRESSION_ONE_PIXEL);
        this.f70518l = new LinkedHashSet();
        this.f70519m = j.i(jo1.a.NEWS_HUB);
        uk1.d presenterPinalytics = getPresenterPinalytics();
        uk1.d presenterPinalytics2 = getPresenterPinalytics();
        qa2.n nVar = params.f130131b;
        gx0.e eVar = new gx0.e(id3, presenterPinalytics, ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics2, nVar.f103320a, nVar, params.f130137h), eventManager, newsHubDetailPagedListService, context, newsHubExperiments, new d(this, 1), new gv0.b(this, 3), fuzzyDateFormatter, trackingParamAttacher, activeUserManager, viewModelFactory, pinModelToVMStateConverterFactory, this, boardNavigator);
        this.f70520n = eVar;
        this.f70521o = new com.pinterest.framework.multisection.datasource.pagedlist.f(eVar, 12);
        h2 b13 = h2.f83379b.b();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) b13.f83382a;
        this.f70522p = g1Var.o("android_news_hub_hf_pivot", "enabled", z3Var) || g1Var.l("android_news_hub_hf_pivot");
        this.f70523q = new c(this, id3);
    }

    public static final int u3(e eVar, List list, String str) {
        Object obj;
        s sVar;
        eVar.getClass();
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            s sVar2 = (s) next;
            u uVar = sVar2 instanceof u ? (u) sVar2 : null;
            if (uVar != null && (sVar = uVar.f81090d) != null) {
                obj = sVar.getUid();
            }
            if (Intrinsics.d(obj, str)) {
                obj = next;
                break;
            }
        }
        return CollectionsKt.W(obj, list);
    }

    @Override // mj0.g
    public final boolean a6(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return this.f70518l.contains(pin.getUid());
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f70521o);
    }

    @Override // mj0.g
    public final void l2(f30 pin, h0 h0Var) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f70515i.getClass();
        RepinAnimationData a13 = r.a(h0Var);
        e02.a.b(this.f70513g, pin, false, this.f70514h, null, null, null, null, null, null, null, null, h32.a4.NEWS_HUB_DETAIL.toString(), null, null, null, false, true, a13, "PIN_REPIN", "news_hub_detail_quick_save", this.f70519m, null, 2160632);
    }

    @Override // wk1.q, sq0.w
    public final void loadMoreData() {
        os.f fVar;
        RecyclerView g83;
        super.loadMoreData();
        if ((this.f70522p || ((g83 = ((o) ((fx0.b) getView())).g8()) != null && g83.canScrollVertically(1))) && !this.f70521o.f49190a.t0()) {
            o oVar = (o) ((fx0.b) getView());
            oVar.getClass();
            Intrinsics.checkNotNullParameter(this, "exploreHomeFeedFooterViewListener");
            PinterestRecyclerView pinterestRecyclerView = oVar.f139736j0;
            if (pinterestRecyclerView == null || (fVar = pinterestRecyclerView.f52533c) == null || fVar.J() == 0) {
                kx0.b creator = new kx0.b(oVar, this, 0);
                Intrinsics.checkNotNullParameter(creator, "creator");
                PinterestRecyclerView pinterestRecyclerView2 = oVar.f139736j0;
                if (pinterestRecyclerView2 != null) {
                    pinterestRecyclerView2.c(creator);
                }
            }
        }
    }

    @Override // ux0.a
    public final void m() {
        com.pinterest.framework.screens.s sVar;
        getPinalytics().F(g0.NEWS_HUB_BACK_TO_HOMEFEED_BUTTON, u0.NEWS_HUB_PINS_REC_HF_UPSELL_BUTTON);
        ku1.a aVar = this.f70507a;
        r70.a aVar2 = (aVar == null || (sVar = ((ku1.j) aVar).f80914l) == null) ? null : sVar.f49234i;
        r70.a aVar3 = aVar2 instanceof r70.a ? aVar2 : null;
        if (aVar3 != null) {
            aVar3.k(com.pinterest.framework.screens.u.GO_TO_HOME_FEED_UPSELL);
        }
    }

    @Override // wk1.n, yk1.b
    public final void onDeactivate() {
        this.f70510d.getClass();
        if (f.f(y0.ANDROID_NOTIFICATIONS_TAKEOVER, new l[]{l.ANDROID_NEWS_HUB_SCROLL_PROMPT})) {
            this.f70508b.d(new dg0.c(dg0.b.DISMISS));
        }
        super.onDeactivate();
    }

    @Override // wk1.n, wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        this.f70517k.d();
        ((o) ((fx0.b) getView())).f81077b1 = null;
        this.f70508b.j(this.f70523q);
        super.onUnbind();
    }

    public final boolean v3(int i13) {
        if (i13 < 0 || i13 >= this.f70520n.f49127q.size()) {
            return false;
        }
        com.pinterest.framework.multisection.datasource.pagedlist.f fVar = this.f70521o;
        return (fVar.getItemViewType(i13) == 1500 || fVar.getItemViewType(i13) == 1501) ? false : true;
    }

    public final void w3(String newsId) {
        if (newsId == null) {
            return;
        }
        uo.a aVar = this.f70509c;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(newsId, "newsId");
        oc.a c13 = aVar.f122922a.c(new b40.g0(newsId));
        d7.b.E(c13, vc.f.NetworkOnly);
        kk2.m k13 = com.bumptech.glide.d.u0(c13).k(new jr1.a(15, cv1.a.f53310i));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        xj2.c o13 = k13.r(tk2.e.f118017c).l(wj2.c.a()).o(new gw0.a(29, new d(this, 0)), new a(0, b.f70501k));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: x3, reason: merged with bridge method [inline-methods] */
    public final void r3(fx0.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        ((o) view).f81077b1 = this;
        this.f70508b.h(this.f70523q);
    }

    public final void z3(int i13) {
        qx qxVar;
        u g03 = !v3(i13) ? null : this.f70520n.g0(i13);
        if (g03 == null || (qxVar = g03.f81089c) == null) {
            qxVar = null;
        }
        if (qxVar == null) {
            return;
        }
        String uid = qxVar.getUid();
        dh g13 = qxVar.g();
        Short valueOf = g13 != null ? Short.valueOf((short) g13.getValue()) : null;
        tx u13 = qxVar.u();
        n1 impression = new n1(uid, u13 != null ? Short.valueOf((short) u13.getValue()) : null, null, valueOf);
        com.pinterest.feature.newshub.b bVar = this.f70517k;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(impression, "impression");
        bVar.l(impression);
    }
}
