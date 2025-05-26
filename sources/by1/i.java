package by1;

import ao2.j0;
import ao2.v0;
import ay1.w;
import ay1.x;
import com.pinterest.api.model.f30;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import u50.r;
import x02.i2;
import xk2.m;
import xk2.v;
import zy.d0;

/* loaded from: classes4.dex */
public final class i implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final wx1.c f24153a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f24154b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f24155c;

    /* renamed from: d, reason: collision with root package name */
    public final i2 f24156d;

    /* renamed from: e, reason: collision with root package name */
    public final px.a f24157e;

    /* renamed from: f, reason: collision with root package name */
    public final jw1.c f24158f;

    /* renamed from: g, reason: collision with root package name */
    public Date f24159g;

    /* renamed from: h, reason: collision with root package name */
    public f30 f24160h;

    /* renamed from: i, reason: collision with root package name */
    public List f24161i;

    /* renamed from: j, reason: collision with root package name */
    public final v f24162j;

    /* renamed from: k, reason: collision with root package name */
    public final v f24163k;

    public i(d0 pinalyticsSEP, b60.b activeUserManager, i2 pinRepository, px.c analyticsRepository, jw1.c typePinnersAdapterFactory, wx1.c pinStatsMetricsAdapterFactory) {
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        Intrinsics.checkNotNullParameter(typePinnersAdapterFactory, "typePinnersAdapterFactory");
        Intrinsics.checkNotNullParameter(pinStatsMetricsAdapterFactory, "pinStatsMetricsAdapterFactory");
        Intrinsics.checkNotNullParameter(pinStatsMetricsAdapterFactory, "pinStatsMetricsAdapterFactory");
        this.f24153a = pinStatsMetricsAdapterFactory;
        this.f24154b = pinalyticsSEP;
        this.f24155c = activeUserManager;
        this.f24156d = pinRepository;
        this.f24157e = analyticsRepository;
        this.f24158f = typePinnersAdapterFactory;
        new ArrayList();
        this.f24162j = m.b(new yv1.i(this, 9));
        this.f24163k = m.b(h.f24152i);
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, r eventIntake) {
        x request = (x) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof ay1.r) {
            String str = ((ay1.r) request).f20684a;
            ko2.f fVar = v0.f20219a;
            j.z(scope, ko2.e.f80326c, null, new e(this, str, eventIntake, null), 2);
        } else if (Intrinsics.d(request, w.f20688a)) {
            ko2.f fVar2 = v0.f20219a;
            j.z(scope, ko2.e.f80326c, null, new e(this, null, eventIntake, null), 2);
        }
    }
}
