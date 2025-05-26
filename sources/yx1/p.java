package yx1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.u2;
import h32.f1;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import so.u0;
import x02.i2;

/* loaded from: classes4.dex */
public final class p extends yk1.t implements d, ey1.a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f140386a;

    /* renamed from: b, reason: collision with root package name */
    public final wx1.c f140387b;

    /* renamed from: c, reason: collision with root package name */
    public final jw1.c f140388c;

    /* renamed from: d, reason: collision with root package name */
    public final gw1.h f140389d;

    /* renamed from: e, reason: collision with root package name */
    public final px.a f140390e;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f140391f;

    /* renamed from: g, reason: collision with root package name */
    public final cy1.b f140392g;

    /* renamed from: h, reason: collision with root package name */
    public final m60.w f140393h;

    /* renamed from: i, reason: collision with root package name */
    public final b60.b f140394i;

    /* renamed from: j, reason: collision with root package name */
    public final yx.c f140395j;

    /* renamed from: k, reason: collision with root package name */
    public f30 f140396k;

    /* renamed from: l, reason: collision with root package name */
    public Date f140397l;

    /* renamed from: m, reason: collision with root package name */
    public jw1.b f140398m;

    /* renamed from: n, reason: collision with root package name */
    public String f140399n;

    /* renamed from: o, reason: collision with root package name */
    public ww1.c f140400o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f140401p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f140402q;

    /* renamed from: r, reason: collision with root package name */
    public final xk2.v f140403r;

    /* renamed from: s, reason: collision with root package name */
    public vh f140404s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(uk1.d presenterPinalytics, boolean z13, uj2.q networkStateStream, wx1.c pinStatsMetricsAdapterFactory, jw1.c typePinnersAdapterFactory, gw1.h productTagAdapterFactory, px.c analyticsRepository, i2 pinRepository, cy1.b analyticsAutoPollingChecker, yx.b filterRepositoryFactory, m60.w eventManager, b60.b activeUserManager) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pinStatsMetricsAdapterFactory, "pinStatsMetricsAdapterFactory");
        Intrinsics.checkNotNullParameter(typePinnersAdapterFactory, "typePinnersAdapterFactory");
        Intrinsics.checkNotNullParameter(productTagAdapterFactory, "productTagAdapterFactory");
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(analyticsAutoPollingChecker, "analyticsAutoPollingChecker");
        Intrinsics.checkNotNullParameter(filterRepositoryFactory, "filterRepositoryFactory");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f140386a = z13;
        this.f140387b = pinStatsMetricsAdapterFactory;
        this.f140388c = typePinnersAdapterFactory;
        this.f140389d = productTagAdapterFactory;
        this.f140390e = analyticsRepository;
        this.f140391f = pinRepository;
        this.f140392g = analyticsAutoPollingChecker;
        this.f140393h = eventManager;
        this.f140394i = activeUserManager;
        this.f140395j = ((u0) filterRepositoryFactory).a(zx.a.FILTER_PIN_STATS, yb2.a.b(((b60.d) activeUserManager).f()));
        this.f140400o = ww1.c.PRODUCT_TAG_IMPRESSION;
        this.f140401p = new ArrayList();
        this.f140403r = xk2.m.b(o.f140385i);
    }

    @Override // ey1.a
    public final void c1() {
        t3();
    }

    @Override // yk1.b
    public final void onActivate() {
        this.f140392g.d(this);
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        e view = (e) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "pinStatsListener");
        ((j) view).D0 = this;
    }

    @Override // yk1.b
    public final void onDeactivate() {
        this.f140392g.e();
    }

    public final void p3(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f140399n = pinId;
        ((j) ((e) getView())).c8(q.f140406c);
        i2 i2Var = this.f140391f;
        Intrinsics.checkNotNullParameter(i2Var, "<this>");
        addDisposable(c0.d.W2(i2Var, n00.c.PIN_STATS_DETAILS_FIELDS).Q(pinId).t(new jr1.a(16, new m(this, 1))).s().o(new l(0, new m(this, 2)), new l(1, new m(this, 3))));
    }

    public final void q3(vh productTagData) {
        Intrinsics.checkNotNullParameter(productTagData, "productTagData");
        Intrinsics.checkNotNullParameter(productTagData, "productTagData");
        addDisposable(((px.c) this.f140390e).e(ph.a.Y(kh2.j.t2(this.f140395j.c(), true), String.valueOf(this.f140399n), ph.a.u(productTagData, this.f140400o), this.f140400o)).o(new ru1.d(26, new m(this, 5)), new ru1.d(27, new m(this, 6))));
    }

    public final f30 r3() {
        f30 f30Var = this.f140396k;
        if (f30Var != null) {
            return f30Var;
        }
        Intrinsics.r("pin");
        throw null;
    }

    public final void s3(ww1.c metricType) {
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        this.f140395j.d();
        d0 pinalytics = getPinalytics();
        f1 f1Var = f1.TAP;
        h32.u0 u0Var = h32.u0.ANALYTICS_GRAPH_CLOSEUP_BUTTON;
        HashMap hashMap = new HashMap();
        hashMap.put("analytics_next_value", metricType.name());
        Unit unit = Unit.f80348a;
        pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        NavigationImpl w13 = Navigation.w1((ScreenLocation) u2.f51427d.getValue());
        ArrayList arrayList = this.f140401p;
        ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ww1.c) it.next()).name());
        }
        w13.d("METRIC_TYPES_EXTRA_KEY", arrayList2);
        ArrayList l13 = f0.l(mw1.j.f88439c);
        if (yb2.a.b(((b60.d) this.f140394i).f())) {
            l13.add(new mw1.i());
        }
        if (ph.a.x0(r3())) {
            l13.add(new mw1.l());
        }
        l13.add(new mw1.h());
        ArrayList arrayList3 = new ArrayList(g0.q(l13, 10));
        Iterator it2 = l13.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((mw1.m) it2.next()).f88442a);
        }
        w13.d("SPLIT_TYPES_EXTRA_KEY", arrayList3);
        w13.m0("METRIC_TYPE_EXTRA_KEY", metricType.name());
        w13.m0("PIN_TYPE", ph.a.V(r3()).name());
        w13.m0("PIN_ID", this.f140399n);
        this.f140393h.d(w13);
    }

    public final void t3() {
        String str = this.f140399n;
        if (str != null) {
            p3(str);
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        e view = (e) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "pinStatsListener");
        ((j) view).D0 = this;
    }
}
