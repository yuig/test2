package kh2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z0 implements t0 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79764n;

    /* renamed from: a, reason: collision with root package name */
    public final tf2.c f79765a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f79766b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f79767c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f79768d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f79769e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f79770f;

    /* renamed from: g, reason: collision with root package name */
    public final c0 f79771g;

    /* renamed from: h, reason: collision with root package name */
    public final c0 f79772h;

    /* renamed from: i, reason: collision with root package name */
    public final c0 f79773i;

    /* renamed from: j, reason: collision with root package name */
    public final c0 f79774j;

    /* renamed from: k, reason: collision with root package name */
    public final c0 f79775k;

    /* renamed from: l, reason: collision with root package name */
    public final c0 f79776l;

    /* renamed from: m, reason: collision with root package name */
    public final c0 f79777m;

    static {
        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0(z0.class, "memoryWarningDataSource", "getMemoryWarningDataSource()Lio/embrace/android/embracesdk/internal/arch/datasource/DataSourceState;", 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f79764n = new rl2.u[]{l0Var.g(d0Var), a.c.l(z0.class, "breadcrumbDataSource", "getBreadcrumbDataSource()Lio/embrace/android/embracesdk/internal/arch/datasource/DataSourceState;", 0, l0Var), a.c.l(z0.class, "viewDataSource", "getViewDataSource()Lio/embrace/android/embracesdk/internal/arch/datasource/DataSourceState;", 0, l0Var), a.c.l(z0.class, "pushNotificationDataSource", "getPushNotificationDataSource()Lio/embrace/android/embracesdk/internal/arch/datasource/DataSourceState;", 0, l0Var), a.c.l(z0.class, "tapDataSource", "getTapDataSource()Lio/embrace/android/embracesdk/internal/arch/datasource/DataSourceState;", 0, l0Var), a.c.l(z0.class, "webViewUrlDataSource", "getWebViewUrlDataSource()Lio/embrace/android/embracesdk/internal/arch/datasource/DataSourceState;", 0, l0Var), a.c.l(z0.class, "rnActionDataSource", "getRnActionDataSource()Lio/embrace/android/embracesdk/internal/arch/datasource/DataSourceState;", 0, l0Var), a.c.l(z0.class, "webViewDataSource", "getWebViewDataSource()Lio/embrace/android/embracesdk/internal/arch/datasource/DataSourceState;", 0, l0Var), a.c.l(z0.class, "lowPowerDataSource", "getLowPowerDataSource()Lio/embrace/android/embracesdk/internal/arch/datasource/DataSourceState;", 0, l0Var), a.c.l(z0.class, "thermalService", "getThermalService()Lio/embrace/android/embracesdk/internal/capture/thermalstate/ThermalStateDataSource;", 0, l0Var), a.c.l(z0.class, "thermalStateDataSource", "getThermalStateDataSource()Lio/embrace/android/embracesdk/internal/arch/datasource/DataSourceState;", 0, l0Var), a.c.l(z0.class, "aeiService", "getAeiService()Lio/embrace/android/embracesdk/internal/capture/aei/AeiDataSourceImpl;", 0, l0Var), a.c.l(z0.class, "applicationExitInfoDataSource", "getApplicationExitInfoDataSource()Lio/embrace/android/embracesdk/internal/arch/datasource/DataSourceState;", 0, l0Var), a.c.l(z0.class, "internalErrorDataSource", "getInternalErrorDataSource()Lio/embrace/android/embracesdk/internal/arch/datasource/DataSourceState;", 0, l0Var), a.c.l(z0.class, "networkStatusDataSource", "getNetworkStatusDataSource()Lio/embrace/android/embracesdk/internal/arch/datasource/DataSourceState;", 0, l0Var)};
    }

    public z0(tf2.c featureRegistry, o coreModule, b1 initModule, q2 otelModule, l3 workerThreadModule, h3 systemServiceModule, a androidServicesModule, vf2.b logWriter, sg2.a configService) {
        Intrinsics.checkNotNullParameter(featureRegistry, "featureRegistry");
        Intrinsics.checkNotNullParameter(coreModule, "coreModule");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(otelModule, "otelModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        Intrinsics.checkNotNullParameter(systemServiceModule, "systemServiceModule");
        Intrinsics.checkNotNullParameter(androidServicesModule, "androidServicesModule");
        Intrinsics.checkNotNullParameter(logWriter, "logWriter");
        Intrinsics.checkNotNullParameter(configService, "configService");
        this.f79765a = featureRegistry;
        j1.v0 v0Var = new j1.v0(coreModule, initModule, otelModule, configService, 26);
        g1 g1Var = g1.LAZY;
        this.f79766b = new c0(g1Var, v0Var);
        int i13 = 1;
        this.f79767c = a(new x0(configService, otelModule, initModule, i13));
        this.f79768d = a(new x0(configService, initModule, otelModule, 10));
        this.f79769e = a(new x0(configService, initModule, otelModule, 4));
        this.f79770f = a(new x0(configService, otelModule, initModule, 8));
        this.f79771g = a(new x0(configService, otelModule, initModule, 14));
        this.f79772h = a(new x0(configService, otelModule, initModule, 6));
        this.f79773i = a(new x0(configService, otelModule, initModule, 12));
        a(new rr.c1(coreModule, workerThreadModule, initModule, otelModule, systemServiceModule, configService, 2));
        this.f79774j = new c0(g1Var, new j1.v0(otelModule, initModule, workerThreadModule, systemServiceModule, 27));
        a(new w0(this, configService, i13));
        this.f79775k = new c0(g1Var, new rr.c1(systemServiceModule, workerThreadModule, configService, androidServicesModule, logWriter, initModule, 1));
        a(new w0(this, configService, 0));
        this.f79776l = a(new jg2.h(logWriter, initModule, configService, 13));
        this.f79777m = a(new x0(initModule, otelModule, configService));
    }

    public final c0 a(Function0 function0) {
        return new c0(function0, this.f79765a);
    }
}
