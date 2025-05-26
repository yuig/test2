package y70;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.o0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final at1.d f137987a;

    /* renamed from: b, reason: collision with root package name */
    public final bz.i f137988b;

    /* renamed from: c, reason: collision with root package name */
    public final w f137989c;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f137990d;

    /* renamed from: e, reason: collision with root package name */
    public final tb0.h f137991e;

    /* renamed from: f, reason: collision with root package name */
    public final pb0.a f137992f;

    /* renamed from: g, reason: collision with root package name */
    public long f137993g;

    /* renamed from: h, reason: collision with root package name */
    public final uk2.d f137994h;

    public e(at1.d application, bz.i timeSpentLoggingManager, w eventManager, o0 pinalyticsManager, tb0.h crashReporting, pb0.a clock) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(timeSpentLoggingManager, "timeSpentLoggingManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f137987a = application;
        this.f137988b = timeSpentLoggingManager;
        this.f137989c = eventManager;
        this.f137990d = pinalyticsManager;
        this.f137991e = crashReporting;
        this.f137992f = clock;
        uk2.d dVar = new uk2.d();
        dVar.l(3L, TimeUnit.SECONDS, tk2.e.f118016b).F(new mc.h(27, new d(this, 0)), new mc.h(28, new d(this, 1)), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(dVar, "also(...)");
        this.f137994h = dVar;
    }
}
