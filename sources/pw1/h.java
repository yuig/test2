package pw1;

import android.content.Context;
import com.pinterest.api.model.vh;
import et1.r0;
import gw1.i;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import lh0.m2;
import m60.w;
import mw1.m;
import ow1.j;
import so.x0;
import uj2.q;
import x02.i2;
import xk2.v;

/* loaded from: classes4.dex */
public final class h extends j {

    /* renamed from: x, reason: collision with root package name */
    public static final SimpleDateFormat f101533x = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: p, reason: collision with root package name */
    public final px.a f101534p;

    /* renamed from: q, reason: collision with root package name */
    public final cy1.b f101535q;

    /* renamed from: r, reason: collision with root package name */
    public final i2 f101536r;

    /* renamed from: s, reason: collision with root package name */
    public final gw1.h f101537s;

    /* renamed from: t, reason: collision with root package name */
    public final String f101538t;

    /* renamed from: u, reason: collision with root package name */
    public final cy1.c f101539u;

    /* renamed from: v, reason: collision with root package name */
    public final v f101540v;

    /* renamed from: w, reason: collision with root package name */
    public vh f101541w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(px.c analyticsRepository, cy1.b pinStatsAutoPollingChecker, i2 pinRepository, yk1.v viewResources, q networkStateStream, w eventManager, m2 experiments, x0 filterViewAdapterFactory, yx.b filterRepositoryFactory, gw1.h productTagAdapterFactory, b60.b activeUserManager, uk1.d presenterPinalytics, ww1.c currentMetricType, m currentSplitType, String pinId, cy1.c pinType, Context context) {
        super(viewResources, networkStateStream, eventManager, experiments, filterViewAdapterFactory.a(false), presenterPinalytics, currentMetricType, currentSplitType, context);
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        Intrinsics.checkNotNullParameter(pinStatsAutoPollingChecker, "pinStatsAutoPollingChecker");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(filterViewAdapterFactory, "filterViewAdapterFactory");
        Intrinsics.checkNotNullParameter(filterRepositoryFactory, "filterRepositoryFactory");
        Intrinsics.checkNotNullParameter(productTagAdapterFactory, "productTagAdapterFactory");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(currentMetricType, "currentMetricType");
        Intrinsics.checkNotNullParameter(currentSplitType, "currentSplitType");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(pinType, "pinType");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f101534p = analyticsRepository;
        this.f101535q = pinStatsAutoPollingChecker;
        this.f101536r = pinRepository;
        this.f101537s = productTagAdapterFactory;
        this.f101538t = pinId;
        this.f101539u = pinType;
        this.f101540v = xk2.m.b(new r0(4, filterRepositoryFactory, activeUserManager));
    }

    public final void G3(vh productTagData) {
        Intrinsics.checkNotNullParameter(productTagData, "productTagData");
        Date date = new Date(this.f97962c.c().c().f142973a.f142971c);
        Intrinsics.checkNotNullParameter(productTagData, "productTagData");
        addDisposable(((px.c) this.f101534p).e(ph.a.Y(kh2.j.t2(((yx.c) this.f101540v.getValue()).c(), true), this.f101538t, ph.a.u(productTagData, this.f97963d), this.f97963d)).o(new ru1.d(8, new i(2, this, date)), new ru1.d(9, new f(this, 2))));
    }

    @Override // yk1.b
    public final void onActivate() {
        this.f101535q.d(this);
    }

    @Override // yk1.b
    public final void onDeactivate() {
        this.f101535q.e();
    }

    @Override // ow1.j
    public final void p3() {
        i2 i2Var = this.f101536r;
        String str = this.f101538t;
        addDisposable(i2Var.P(str).s().o(new ru1.d(10, new f(this, 0)), new ru1.d(11, g.f101530j)));
        if (this.f97963d.isProductTagMetric()) {
            vh vhVar = this.f101541w;
            if (vhVar != null) {
                G3(vhVar);
                return;
            }
            xj2.c o13 = ((px.c) this.f101534p).f(str).o(new ru1.d(6, new f(this, 3)), new ru1.d(7, new f(this, 4)));
            addDisposable(o13);
            Intrinsics.checkNotNullExpressionValue(o13, "also(...)");
        }
    }
}
