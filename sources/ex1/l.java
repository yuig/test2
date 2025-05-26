package ex1;

import android.content.Context;
import com.pinterest.api.model.a40;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import uj2.b0;
import uj2.q;
import yk1.r;
import yk1.t;
import yk1.v;

/* loaded from: classes4.dex */
public final class l extends t implements ey1.a {

    /* renamed from: l, reason: collision with root package name */
    public static final List f60405l = f0.j(ww1.c.IMPRESSION, ww1.c.ENGAGEMENT, ww1.c.PIN_CLICK, ww1.c.OUTBOUND_CLICK, ww1.c.SAVE);

    /* renamed from: m, reason: collision with root package name */
    public static final List f60406m = f0.j(ww1.c.VIDEO_MRC_VIEW, ww1.c.VIDEO_AVG_WATCH_TIME, ww1.c.VIDEO_V50_WATCH_TIME, ww1.c.QUARTILE_95_PERCENT_VIEW, ww1.c.VIDEO_10S_VIEW);

    /* renamed from: a, reason: collision with root package name */
    public final v f60407a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60408b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f60409c;

    /* renamed from: d, reason: collision with root package name */
    public ww1.c f60410d;

    /* renamed from: e, reason: collision with root package name */
    public final w f60411e;

    /* renamed from: f, reason: collision with root package name */
    public final pb0.d f60412f;

    /* renamed from: g, reason: collision with root package name */
    public final px.a f60413g;

    /* renamed from: h, reason: collision with root package name */
    public final b60.b f60414h;

    /* renamed from: i, reason: collision with root package name */
    public final lw1.a f60415i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f60416j;

    /* renamed from: k, reason: collision with root package name */
    public xj2.c f60417k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, v viewResources, d0 pinalytics, int i13, boolean z13, ww1.c selectedMetric, q networkStateStream, w eventManager, uk1.e presenterPinalyticsFactory, pb0.d fuzzyDateFormatter, px.c analyticsRepository, b60.b activeUserManager, lw1.a analyticsAutoPollingChecker, xw1.b filterViewAdapterForOverviewFactory) {
        super(((uk1.a) presenterPinalyticsFactory).f(pinalytics, ""), networkStateStream);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(selectedMetric, "selectedMetric");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(analyticsAutoPollingChecker, "analyticsAutoPollingChecker");
        Intrinsics.checkNotNullParameter(filterViewAdapterForOverviewFactory, "filterViewAdapterForOverviewFactory");
        this.f60407a = viewResources;
        this.f60408b = i13;
        this.f60409c = z13;
        this.f60410d = selectedMetric;
        this.f60411e = eventManager;
        this.f60412f = fuzzyDateFormatter;
        this.f60413g = analyticsRepository;
        this.f60414h = activeUserManager;
        this.f60415i = analyticsAutoPollingChecker;
        this.f60416j = xk2.m.b(new yv1.i(filterViewAdapterForOverviewFactory, 3));
    }

    @Override // ey1.a
    public final void c1() {
        r3();
    }

    @Override // yk1.b
    public final void onActivate() {
        this.f60415i.d(this);
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        j view = (j) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        view.L2(this);
        s3();
        q3();
    }

    @Override // yk1.b
    public final void onDeactivate() {
        this.f60415i.e();
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        ((j) getView()).j0();
        xj2.c cVar = this.f60417k;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f60417k = null;
        super.onUnbind();
    }

    public final void p3(a40 a40Var) {
        String str = "";
        if (a40Var != null) {
            Boolean e13 = a40Var.e();
            Intrinsics.checkNotNullExpressionValue(e13, "getIsRealtime(...)");
            boolean booleanValue = e13.booleanValue();
            v vVar = this.f60407a;
            if (booleanValue) {
                str = ((yk1.a) vVar).f139224a.getString(com.pinterest.partnerAnalytics.g.updated_in_real_time);
            } else if (((long) a40Var.f().doubleValue()) > 0) {
                Date date = new Date((long) a40Var.f().doubleValue());
                str = ((yk1.a) vVar).f139224a.getString(com.pinterest.partnerAnalytics.g.last_updated_analytics, this.f60412f.b(date, pb0.b.STYLE_NORMAL, true).toString());
            }
        }
        ((j) getView()).c0(str);
    }

    public final void q3() {
        zx.n t23;
        xk2.v vVar = this.f60416j;
        ((j) getView()).F1(h.f60400b);
        int i13 = 1;
        try {
            t23 = kh2.j.t2(((xw1.a) vVar.getValue()).f136124b.c(), true);
        } catch (Exception unused) {
            ((xw1.a) vVar.getValue()).f136124b.d();
            t23 = kh2.j.t2(((xw1.a) vVar.getValue()).f136124b.c(), true);
        }
        wy0 f13 = ((b60.d) this.f60414h).f();
        String uid = f13 != null ? f13.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        rx.f params = new rx.f(uid, t23.f142983a, t23.f142984b, t23.f142988f, t23.f142985c, t23.f142986d, Boolean.valueOf(t23.f142987e), this.f60408b, t23.f142992j, this.f60409c ? 30 : null, t23.f142993k, t23.f142989g, t23.f142990h, t23.f142991i, t23.f142996n, t23.f142997o);
        params.f110170m = this.f60409c ? 30 : null;
        String name = this.f60410d.name();
        Intrinsics.checkNotNullParameter(name, "<set-?>");
        params.f110166i = name;
        String name2 = this.f60410d.name();
        Intrinsics.checkNotNullParameter(name2, "<set-?>");
        params.f110167j = name2;
        px.c cVar = (px.c) this.f60413g;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        xj2.c o13 = pk2.f.k(((b0) new qx.a(cVar.f101547b, 4).b(params).buildRequest()).r(tk2.e.f118017c), "observeOn(...)").o(new ru1.d(14, new k(this, 0)), new ru1.d(15, new k(this, i13)));
        this.f60417k = o13;
        Intrinsics.checkNotNullExpressionValue(o13, "also(...)");
        addDisposable(o13);
    }

    public final void r3() {
        s3();
        q3();
    }

    public final void s3() {
        boolean n13 = dn.c.n(((xw1.a) this.f60416j.getValue()).f136124b.c());
        List list = f60405l;
        if (n13) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            arrayList.addAll(f60406m);
            list = arrayList;
        }
        ((j) getView()).h1(list);
    }

    public final void t3(boolean z13) {
        if (this.f60409c != z13) {
            this.f60409c = z13;
            d0 pinalytics = getPinalytics();
            f1 f1Var = f1.TAP;
            g0 g0Var = g0.ANALYTICS_PIN_TABLE;
            u0 u0Var = u0.ANALYTICS_RECENT_PINS_FILTER;
            HashMap hashMap = new HashMap();
            hashMap.put("analytics_previous_value", String.valueOf(!z13));
            hashMap.put("analytics_next_value", String.valueOf(z13));
            pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            q3();
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        j view = (j) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        view.L2(this);
        s3();
        q3();
    }
}
