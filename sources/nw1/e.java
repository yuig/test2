package nw1;

import android.content.Context;
import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;
import lh0.m2;
import m60.w;
import mw1.m;
import ow1.j;
import so.v0;
import uj2.q;
import yk1.v;
import yq1.u1;
import zx.n;

/* loaded from: classes4.dex */
public final class e extends j {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f92370s = 0;

    /* renamed from: p, reason: collision with root package name */
    public final b60.b f92371p;

    /* renamed from: q, reason: collision with root package name */
    public final px.a f92372q;

    /* renamed from: r, reason: collision with root package name */
    public final lw1.a f92373r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b60.b activeUserManager, px.c analyticsRepository, lw1.a analyticsAutoPollingChecker, v viewResources, q networkStateStream, w eventManager, m2 experiments, xw1.b filterViewAdapterFactory, uk1.d presenterPinalytics, ww1.c currentMetricType, m currentSplitType, Context context) {
        super(viewResources, networkStateStream, eventManager, experiments, ((v0) filterViewAdapterFactory).a(), presenterPinalytics, currentMetricType, currentSplitType, context);
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        Intrinsics.checkNotNullParameter(analyticsAutoPollingChecker, "analyticsAutoPollingChecker");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(filterViewAdapterFactory, "filterViewAdapterFactory");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(currentMetricType, "currentMetricType");
        Intrinsics.checkNotNullParameter(currentSplitType, "currentSplitType");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f92371p = activeUserManager;
        this.f92372q = analyticsRepository;
        this.f92373r = analyticsAutoPollingChecker;
    }

    @Override // yk1.b
    public final void onActivate() {
        this.f92373r.d(this);
    }

    @Override // yk1.b
    public final void onDeactivate() {
        this.f92373r.e();
    }

    @Override // ow1.j
    public final void p3() {
        n t23;
        yx.d dVar = this.f97962c;
        try {
            t23 = kh2.j.t2(dVar.c().c(), true);
        } catch (Exception unused) {
            dVar.c().d();
            t23 = kh2.j.t2(dVar.c().c(), true);
        }
        wy0 f13 = ((b60.d) this.f92371p).f();
        String uid = f13 != null ? f13.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        rx.b bVar = new rx.b(uid, t23.f142983a, t23.f142984b, t23.f142988f, t23.f142985c, t23.f142986d, Boolean.valueOf(t23.f142987e), this.f97963d.name(), t23.f142992j, Boolean.valueOf(t23.f142994l), Boolean.valueOf(t23.f142995m), Boolean.valueOf(t23.f142993k), t23.f142989g, t23.f142991i, t23.f142990h, t23.f142996n, t23.f142997o);
        String str = this.f97964e.f88442a;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        bVar.f110136m = str;
        addDisposable(((px.c) this.f92372q).a(bVar).o(new ru1.d(2, new u1(this, 26)), new ru1.d(3, d.f92369i)));
    }
}
