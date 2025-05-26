package a11;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import lh0.n1;
import nx.d0;
import nx.d1;
import so.ea;
import so.na;
import so.oa;
import x02.x0;
import x02.x2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final m60.w f263a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f264b;

    /* renamed from: c, reason: collision with root package name */
    public final j80.b f265c;

    /* renamed from: d, reason: collision with root package name */
    public final c82.d f266d;

    /* renamed from: e, reason: collision with root package name */
    public final lu1.b f267e;

    /* renamed from: f, reason: collision with root package name */
    public final ea f268f;

    /* renamed from: g, reason: collision with root package name */
    public final y f269g;

    /* renamed from: h, reason: collision with root package name */
    public final n1 f270h;

    /* renamed from: i, reason: collision with root package name */
    public final x2 f271i;

    /* renamed from: j, reason: collision with root package name */
    public final x0 f272j;

    /* renamed from: k, reason: collision with root package name */
    public final bs.b f273k;

    /* renamed from: l, reason: collision with root package name */
    public final es.a f274l;

    /* renamed from: m, reason: collision with root package name */
    public final nx.b0 f275m;

    /* renamed from: n, reason: collision with root package name */
    public final es.h f276n;

    public d(m60.w eventManager, d1 trackingParamAttacher, j80.b carouselUtil, c82.d siteApi, lu1.b baseActivityHelper, ea clickthroughLoggingInteractorFactory, y urlInfoHelper, n1 experiments, x2 userRepository, x0 boardRepository, bs.b adsHandshakeQuarantine, es.a adFormats, nx.b0 pinAuxHelper, es.h adsCommonDisplay) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
        Intrinsics.checkNotNullParameter(siteApi, "siteApi");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        Intrinsics.checkNotNullParameter(clickthroughLoggingInteractorFactory, "clickthroughLoggingInteractorFactory");
        Intrinsics.checkNotNullParameter(urlInfoHelper, "urlInfoHelper");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(adsHandshakeQuarantine, "adsHandshakeQuarantine");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f263a = eventManager;
        this.f264b = trackingParamAttacher;
        this.f265c = carouselUtil;
        this.f266d = siteApi;
        this.f267e = baseActivityHelper;
        this.f268f = clickthroughLoggingInteractorFactory;
        this.f269g = urlInfoHelper;
        this.f270h = experiments;
        this.f271i = userRepository;
        this.f272j = boardRepository;
        this.f273k = adsHandshakeQuarantine;
        this.f274l = adFormats;
        this.f275m = pinAuxHelper;
        this.f276n = adsCommonDisplay;
    }

    public final n a(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        WeakReference weakReference = new WeakReference(pinalytics);
        na naVar = this.f268f.f113405a;
        b20.c cVar = new b20.c((nx.b0) naVar.f113568a.R8.get());
        oa oaVar = naVar.f113568a;
        return new n(weakReference, this.f263a, new s01.c(weakReference, cVar, (d1) oaVar.f113730i2.get(), (ro1.c) oaVar.f113666ea.get(), (j80.b) oaVar.O6.get(), (c82.d) oaVar.f113648da.get(), (n1) oaVar.E0.get(), (ur.a) oaVar.Kb.get()), this.f264b, this.f265c, new nu1.a(this.f267e), this.f266d, this.f269g, this.f270h, this.f271i, this.f272j, this.f273k, this.f274l, this.f275m, this.f276n);
    }
}
