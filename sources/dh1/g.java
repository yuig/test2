package dh1;

import com.pinterest.api.model.f30;
import com.pinterest.feature.todaytab.tab.view.TodayTabVideoView;
import com.pinterest.feature.todaytab.tab.view.r;
import h32.g0;
import h32.z1;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import nx.d1;
import uj2.q;
import yk1.n;

/* loaded from: classes5.dex */
public final class g extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final pb0.a f55008a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f55009b;

    /* renamed from: c, reason: collision with root package name */
    public final ur.a f55010c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f55011d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f55012e;

    /* renamed from: f, reason: collision with root package name */
    public z1 f55013f;

    /* renamed from: g, reason: collision with root package name */
    public f30 f55014g;

    /* renamed from: h, reason: collision with root package name */
    public int f55015h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(uk1.e presenterPinalyticsFactory, q networkStateStream, pb0.a clock, d1 trackingParamAttacher, ur.a adsCoreDependencies, g0 g0Var, HashMap hashMap) {
        super(((uk1.a) presenterPinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        this.f55008a = clock;
        this.f55009b = trackingParamAttacher;
        this.f55010c = adsCoreDependencies;
        this.f55011d = g0Var;
        this.f55012e = hashMap;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        r view = (r) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((TodayTabVideoView) view).f48690e = this;
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        r view = (r) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((TodayTabVideoView) view).f48690e = this;
    }
}
