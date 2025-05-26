package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 implements x {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79418i;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f79419a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f79420b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f79421c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f79422d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f79423e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f79424f;

    /* renamed from: g, reason: collision with root package name */
    public final c0 f79425g;

    /* renamed from: h, reason: collision with root package name */
    public final c0 f79426h;

    static {
        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0(a0.class, "webviewService", "getWebviewService()Lio/embrace/android/embracesdk/internal/capture/webview/WebViewService;", 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f79418i = new rl2.u[]{l0Var.g(d0Var), a.c.l(a0.class, "activityBreadcrumbTracker", "getActivityBreadcrumbTracker()Lio/embrace/android/embracesdk/internal/capture/crumbs/ActivityBreadcrumbTracker;", 0, l0Var), a.c.l(a0.class, "pushNotificationService", "getPushNotificationService()Lio/embrace/android/embracesdk/internal/capture/crumbs/PushNotificationCaptureService;", 0, l0Var), a.c.l(a0.class, "startupService", "getStartupService()Lio/embrace/android/embracesdk/internal/capture/startup/StartupService;", 0, l0Var), a.c.l(a0.class, "appStartupDataCollector", "getAppStartupDataCollector()Lio/embrace/android/embracesdk/internal/capture/startup/AppStartupDataCollector;", 0, l0Var), a.c.l(a0.class, "startupTracker", "getStartupTracker()Lio/embrace/android/embracesdk/internal/capture/startup/StartupTracker;", 0, l0Var), a.c.l(a0.class, "uiLoadDataListener", "getUiLoadDataListener()Lio/embrace/android/embracesdk/internal/capture/activity/UiLoadDataListener;", 0, l0Var), a.c.l(a0.class, "activityLoadEventEmitter", "getActivityLoadEventEmitter()Lio/embrace/android/embracesdk/internal/session/lifecycle/ActivityLifecycleListener;", 0, l0Var)};
    }

    public a0(b1 initModule, q2 openTelemetryModule, sg2.a configService, l3 workerThreadModule, ii2.d versionChecker, t0 featureModule) {
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(openTelemetryModule, "openTelemetryModule");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        Intrinsics.checkNotNullParameter(versionChecker, "versionChecker");
        Intrinsics.checkNotNullParameter(featureModule, "featureModule");
        jg2.h hVar = new jg2.h(configService, initModule, featureModule, 8);
        g1 g1Var = g1.LAZY;
        this.f79419a = new c0(g1Var, hVar);
        this.f79420b = new c0(g1Var, new fe2.a(11, configService, featureModule));
        this.f79421c = new c0(g1Var, new y(featureModule, 1));
        this.f79422d = new c0(g1Var, new z(openTelemetryModule, 0));
        this.f79423e = new c0(g1Var, new q4.h(openTelemetryModule, workerThreadModule, versionChecker, initModule, this, 15));
        this.f79424f = new c0(g1Var, new jg2.h(this, versionChecker, initModule, 6));
        this.f79425g = new c0(g1Var, new jg2.h(configService, openTelemetryModule, versionChecker, 7));
        this.f79426h = new c0(g1Var, new q4.h(this, versionChecker, initModule, configService, openTelemetryModule, 14));
    }
}
