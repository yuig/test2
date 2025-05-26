package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class n1 extends kotlin.jvm.internal.p implements kl2.o {

    /* renamed from: a, reason: collision with root package name */
    public static final n1 f79627a = new n1();

    public n1() {
        super(6, b0.class, "createDataCaptureServiceModule", "createDataCaptureServiceModule(Lio/embrace/android/embracesdk/internal/injection/InitModule;Lio/embrace/android/embracesdk/internal/injection/OpenTelemetryModule;Lio/embrace/android/embracesdk/internal/config/ConfigService;Lio/embrace/android/embracesdk/internal/injection/WorkerThreadModule;Lio/embrace/android/embracesdk/internal/utils/VersionChecker;Lio/embrace/android/embracesdk/internal/injection/FeatureModule;)Lio/embrace/android/embracesdk/internal/injection/DataCaptureServiceModule;", 1);
    }

    @Override // kl2.o
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        b1 initModule = (b1) obj;
        q2 openTelemetryModule = (q2) obj2;
        sg2.a configService = (sg2.a) obj3;
        l3 workerThreadModule = (l3) obj4;
        ii2.d versionChecker = (ii2.d) obj5;
        t0 featureModule = (t0) obj6;
        Intrinsics.checkNotNullParameter(initModule, "p0");
        Intrinsics.checkNotNullParameter(openTelemetryModule, "p1");
        Intrinsics.checkNotNullParameter(configService, "p2");
        Intrinsics.checkNotNullParameter(workerThreadModule, "p3");
        Intrinsics.checkNotNullParameter(versionChecker, "p4");
        Intrinsics.checkNotNullParameter(featureModule, "p5");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(openTelemetryModule, "openTelemetryModule");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        Intrinsics.checkNotNullParameter(versionChecker, "versionChecker");
        Intrinsics.checkNotNullParameter(featureModule, "featureModule");
        return new a0(initModule, openTelemetryModule, configService, workerThreadModule, versionChecker, featureModule);
    }
}
