package n60;

import kotlin.jvm.internal.Intrinsics;
import nt.c2;
import nx.d0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f89312a;

    /* renamed from: b, reason: collision with root package name */
    public final vy.m f89313b;

    /* renamed from: c, reason: collision with root package name */
    public final at1.a f89314c;

    /* renamed from: d, reason: collision with root package name */
    public final at1.d f89315d;

    /* renamed from: e, reason: collision with root package name */
    public final uj2.q f89316e;

    /* renamed from: f, reason: collision with root package name */
    public final y70.g f89317f;

    /* renamed from: g, reason: collision with root package name */
    public final tb0.h f89318g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f89319h;

    /* renamed from: i, reason: collision with root package name */
    public final tb.l f89320i;

    public v(b60.b activeUserManager, vy.m analyticsApi, at1.a hasFirebaseInstance, at1.d application, jk2.v backgroundState, y70.g chromeSessionManager, tb0.h crashReporting, d0 topLevelPinalytics, tb.l telemetryPreferences) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(hasFirebaseInstance, "hasFirebaseInstance");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(backgroundState, "backgroundState");
        Intrinsics.checkNotNullParameter(chromeSessionManager, "chromeSessionManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(topLevelPinalytics, "topLevelPinalytics");
        Intrinsics.checkNotNullParameter(telemetryPreferences, "telemetryPreferences");
        this.f89312a = activeUserManager;
        this.f89313b = analyticsApi;
        this.f89314c = hasFirebaseInstance;
        this.f89315d = application;
        this.f89316e = backgroundState;
        this.f89317f = chromeSessionManager;
        this.f89318g = crashReporting;
        this.f89319h = topLevelPinalytics;
        this.f89320i = telemetryPreferences;
    }

    public final c2 a() {
        return new c2(this, 5);
    }
}
