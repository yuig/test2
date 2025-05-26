package zw1;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import so.v0;
import uj2.q;
import xk2.m;
import xk2.v;
import yk1.r;
import yk1.t;

/* loaded from: classes4.dex */
public final class i extends t implements ey1.a {

    /* renamed from: a, reason: collision with root package name */
    public final px.a f142959a;

    /* renamed from: b, reason: collision with root package name */
    public final w f142960b;

    /* renamed from: c, reason: collision with root package name */
    public final lw1.a f142961c;

    /* renamed from: d, reason: collision with root package name */
    public final yw1.e f142962d;

    /* renamed from: e, reason: collision with root package name */
    public final b60.b f142963e;

    /* renamed from: f, reason: collision with root package name */
    public final xw1.a f142964f;

    /* renamed from: g, reason: collision with root package name */
    public final g f142965g;

    /* renamed from: h, reason: collision with root package name */
    public final v f142966h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, uk1.d presenterPinalytics, q networkStateStream, px.c analyticsRepository, w eventManager, lw1.a analyticsAutoPollingChecker, yw1.e toplineMetricsAdapterFactory, xw1.b filterViewAdapterForOverviewFactory, b60.b activeUserManager) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(analyticsAutoPollingChecker, "analyticsAutoPollingChecker");
        Intrinsics.checkNotNullParameter(toplineMetricsAdapterFactory, "toplineMetricsAdapterFactory");
        Intrinsics.checkNotNullParameter(filterViewAdapterForOverviewFactory, "filterViewAdapterForOverviewFactory");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f142959a = analyticsRepository;
        this.f142960b = eventManager;
        this.f142961c = analyticsAutoPollingChecker;
        this.f142962d = toplineMetricsAdapterFactory;
        this.f142963e = activeUserManager;
        this.f142964f = ((v0) filterViewAdapterForOverviewFactory).a();
        this.f142965g = new g(this, 0);
        this.f142966h = m.b(new b(this, 1));
    }

    @Override // ey1.a
    public final void c1() {
        q3();
    }

    @Override // yk1.b
    public final void onActivate() {
        this.f142961c.d(this);
    }

    @Override // yk1.b
    public final void onDeactivate() {
        this.f142961c.e();
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        g gVar = this.f142965g;
        w wVar = this.f142960b;
        synchronized (wVar.f85945b) {
            wVar.f85945b.remove(gVar);
        }
        super.onUnbind();
    }

    public final void p3() {
        this.f142964f.f136124b.d();
    }

    public final void q3() {
        xj2.c F = ((yw1.c) this.f142966h.getValue()).a().F(new ru1.d(12, new a(this, 1)), new ru1.d(13, h.f142958i), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    @Override // yk1.p
    public final void r3(f view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "overviewListener");
        ((c) view).f142949p0 = this;
        this.f142960b.a(this.f142965g);
        q3();
    }
}
