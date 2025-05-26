package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class t1 extends kotlin.jvm.internal.p implements kl2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final t1 f79706a = new t1();

    public t1() {
        super(10, c3.class, "createSessionOrchestrationModule", "createSessionOrchestrationModule(Lio/embrace/android/embracesdk/internal/injection/InitModule;Lio/embrace/android/embracesdk/internal/injection/OpenTelemetryModule;Lio/embrace/android/embracesdk/internal/injection/AndroidServicesModule;Lio/embrace/android/embracesdk/internal/injection/EssentialServiceModule;Lio/embrace/android/embracesdk/internal/injection/ConfigModule;Lio/embrace/android/embracesdk/internal/injection/DeliveryModule;Lio/embrace/android/embracesdk/internal/injection/DataSourceModule;Lio/embrace/android/embracesdk/internal/injection/PayloadSourceModule;Lio/embrace/android/embracesdk/internal/capture/startup/StartupService;Lio/embrace/android/embracesdk/internal/injection/LogModule;)Lio/embrace/android/embracesdk/internal/injection/SessionOrchestrationModule;", 1);
    }

    @Override // kl2.a
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        b1 initModule = (b1) obj;
        q2 openTelemetryModule = (q2) obj2;
        a androidServicesModule = (a) obj3;
        o0 essentialServiceModule = (o0) obj4;
        k configModule = (k) obj5;
        h0 deliveryModule = (h0) obj6;
        d0 dataSourceModule = (d0) obj7;
        v2 payloadSourceModule = (v2) obj8;
        jg2.d startupService = (jg2.d) obj9;
        h1 logModule = (h1) obj10;
        Intrinsics.checkNotNullParameter(initModule, "p0");
        Intrinsics.checkNotNullParameter(openTelemetryModule, "p1");
        Intrinsics.checkNotNullParameter(androidServicesModule, "p2");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "p3");
        Intrinsics.checkNotNullParameter(configModule, "p4");
        Intrinsics.checkNotNullParameter(deliveryModule, "p5");
        Intrinsics.checkNotNullParameter(dataSourceModule, "p6");
        Intrinsics.checkNotNullParameter(payloadSourceModule, "p7");
        Intrinsics.checkNotNullParameter(startupService, "p8");
        Intrinsics.checkNotNullParameter(logModule, "p9");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(openTelemetryModule, "openTelemetryModule");
        Intrinsics.checkNotNullParameter(androidServicesModule, "androidServicesModule");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "essentialServiceModule");
        Intrinsics.checkNotNullParameter(configModule, "configModule");
        Intrinsics.checkNotNullParameter(deliveryModule, "deliveryModule");
        Intrinsics.checkNotNullParameter(dataSourceModule, "dataSourceModule");
        Intrinsics.checkNotNullParameter(payloadSourceModule, "payloadSourceModule");
        Intrinsics.checkNotNullParameter(startupService, "startupService");
        Intrinsics.checkNotNullParameter(logModule, "logModule");
        return new b3(initModule, openTelemetryModule, androidServicesModule, essentialServiceModule, configModule, deliveryModule, dataSourceModule, payloadSourceModule, startupService, logModule);
    }
}
