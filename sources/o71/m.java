package o71;

import kotlin.jvm.internal.Intrinsics;
import lh0.j3;
import x02.l2;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f93333a;

    /* renamed from: b, reason: collision with root package name */
    public final uk1.d f93334b;

    /* renamed from: c, reason: collision with root package name */
    public final hl1.a f93335c;

    /* renamed from: d, reason: collision with root package name */
    public final z61.b f93336d;

    /* renamed from: e, reason: collision with root package name */
    public final uj2.q f93337e;

    /* renamed from: f, reason: collision with root package name */
    public final m60.w f93338f;

    /* renamed from: g, reason: collision with root package name */
    public final ip1.b f93339g;

    /* renamed from: h, reason: collision with root package name */
    public final l2 f93340h;

    /* renamed from: i, reason: collision with root package name */
    public final gp1.l f93341i;

    /* renamed from: j, reason: collision with root package name */
    public final j22.b f93342j;

    /* renamed from: k, reason: collision with root package name */
    public final vy.m f93343k;

    /* renamed from: l, reason: collision with root package name */
    public final hf0.c f93344l;

    /* renamed from: m, reason: collision with root package name */
    public final tb0.h f93345m;

    /* renamed from: n, reason: collision with root package name */
    public final j3 f93346n;

    /* renamed from: o, reason: collision with root package name */
    public final xk2.k f93347o;

    /* renamed from: p, reason: collision with root package name */
    public final xk2.k f93348p;

    public m(String initialQuery, uk1.d pinalytics, org.chromium.net.y viewActivity, z61.b pwtManager, uj2.q networkStateStream, m60.w eventManager, ip1.b prefetchManager, l2 typeaheadRepository, gp1.l typeaheadDownloadUtils, j22.b searchService, vy.m analyticsApi, hf0.c deviceInfoProvider, yk1.v viewResources, tb0.h crashReporter, j3 typeaheadExperiments) {
        x92.c typeaheadLocal = x92.c.f134368a;
        Intrinsics.checkNotNullParameter(initialQuery, "initialQuery");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(viewActivity, "viewActivity");
        Intrinsics.checkNotNullParameter(pwtManager, "pwtManager");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(prefetchManager, "prefetchManager");
        Intrinsics.checkNotNullParameter(typeaheadRepository, "typeaheadRepository");
        Intrinsics.checkNotNullParameter(typeaheadLocal, "typeaheadLocal");
        Intrinsics.checkNotNullParameter(typeaheadDownloadUtils, "typeaheadDownloadUtils");
        Intrinsics.checkNotNullParameter(searchService, "searchService");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        Intrinsics.checkNotNullParameter(typeaheadExperiments, "typeaheadExperiments");
        this.f93333a = initialQuery;
        this.f93334b = pinalytics;
        this.f93335c = viewActivity;
        this.f93336d = pwtManager;
        this.f93337e = networkStateStream;
        this.f93338f = eventManager;
        this.f93339g = prefetchManager;
        this.f93340h = typeaheadRepository;
        this.f93341i = typeaheadDownloadUtils;
        this.f93342j = searchService;
        this.f93343k = analyticsApi;
        this.f93344l = deviceInfoProvider;
        this.f93345m = crashReporter;
        this.f93346n = typeaheadExperiments;
        xk2.n nVar = xk2.n.NONE;
        this.f93347o = xk2.m.a(nVar, new l(this, 1));
        this.f93348p = xk2.m.a(nVar, new l(this, 0));
    }
}
