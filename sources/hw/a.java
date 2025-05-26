package hw;

import fw.d;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import lh0.g1;
import nx.d0;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final pb0.a f70463a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f70464b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f70465c;

    /* renamed from: d, reason: collision with root package name */
    public final q f70466d;

    /* renamed from: e, reason: collision with root package name */
    public final zr.b f70467e;

    /* renamed from: f, reason: collision with root package name */
    public final jw.b f70468f;

    /* renamed from: g, reason: collision with root package name */
    public final d f70469g;

    public a(pb0.a clock, d0 pinalytics, g1 experimentsManager, q prefsManagerPersisted, zr.b adsSystemUtils, jw.b powerscoreExperimentManager, d adsGmaLogger) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(experimentsManager, "experimentsManager");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(adsSystemUtils, "adsSystemUtils");
        Intrinsics.checkNotNullParameter(powerscoreExperimentManager, "powerscoreExperimentManager");
        Intrinsics.checkNotNullParameter(adsGmaLogger, "adsGmaLogger");
        this.f70463a = clock;
        this.f70464b = pinalytics;
        this.f70465c = experimentsManager;
        this.f70466d = prefsManagerPersisted;
        this.f70467e = adsSystemUtils;
        this.f70468f = powerscoreExperimentManager;
        this.f70469g = adsGmaLogger;
        b bVar = b.NONE;
    }

    public final void a(b sdkState) {
        Intrinsics.checkNotNullParameter(sdkState, "sdkState");
    }
}
