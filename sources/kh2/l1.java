package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class l1 extends kotlin.jvm.internal.p implements kl2.r {

    /* renamed from: a, reason: collision with root package name */
    public static final l1 f79598a = new l1();

    public l1() {
        super(9, a1.class, "createFeatureModule", "createFeatureModule(Lio/embrace/android/embracesdk/internal/arch/EmbraceFeatureRegistry;Lio/embrace/android/embracesdk/internal/injection/CoreModule;Lio/embrace/android/embracesdk/internal/injection/InitModule;Lio/embrace/android/embracesdk/internal/injection/OpenTelemetryModule;Lio/embrace/android/embracesdk/internal/injection/WorkerThreadModule;Lio/embrace/android/embracesdk/internal/injection/SystemServiceModule;Lio/embrace/android/embracesdk/internal/injection/AndroidServicesModule;Lio/embrace/android/embracesdk/internal/arch/destination/LogWriter;Lio/embrace/android/embracesdk/internal/config/ConfigService;)Lio/embrace/android/embracesdk/internal/injection/FeatureModule;", 1);
    }

    @Override // kl2.r
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        tf2.c featureRegistry = (tf2.c) obj;
        o coreModule = (o) obj2;
        b1 initModule = (b1) obj3;
        q2 otelModule = (q2) obj4;
        l3 workerThreadModule = (l3) obj5;
        h3 systemServiceModule = (h3) obj6;
        a androidServicesModule = (a) obj7;
        vf2.b logWriter = (vf2.b) obj8;
        sg2.a configService = (sg2.a) obj9;
        Intrinsics.checkNotNullParameter(featureRegistry, "p0");
        Intrinsics.checkNotNullParameter(coreModule, "p1");
        Intrinsics.checkNotNullParameter(initModule, "p2");
        Intrinsics.checkNotNullParameter(otelModule, "p3");
        Intrinsics.checkNotNullParameter(workerThreadModule, "p4");
        Intrinsics.checkNotNullParameter(systemServiceModule, "p5");
        Intrinsics.checkNotNullParameter(androidServicesModule, "p6");
        Intrinsics.checkNotNullParameter(logWriter, "p7");
        Intrinsics.checkNotNullParameter(configService, "p8");
        Intrinsics.checkNotNullParameter(featureRegistry, "featureRegistry");
        Intrinsics.checkNotNullParameter(coreModule, "coreModule");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(otelModule, "otelModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        Intrinsics.checkNotNullParameter(systemServiceModule, "systemServiceModule");
        Intrinsics.checkNotNullParameter(androidServicesModule, "androidServicesModule");
        Intrinsics.checkNotNullParameter(logWriter, "logWriter");
        Intrinsics.checkNotNullParameter(configService, "configService");
        return new z0(featureRegistry, coreModule, initModule, otelModule, workerThreadModule, systemServiceModule, androidServicesModule, logWriter, configService);
    }
}
