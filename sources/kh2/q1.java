package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class q1 extends kotlin.jvm.internal.p implements kl2.q {

    /* renamed from: a, reason: collision with root package name */
    public static final q1 f79661a = new q1();

    public q1() {
        super(8, j1.class, "createLogModule", "createLogModule(Lio/embrace/android/embracesdk/internal/injection/InitModule;Lio/embrace/android/embracesdk/internal/injection/OpenTelemetryModule;Lio/embrace/android/embracesdk/internal/injection/AndroidServicesModule;Lio/embrace/android/embracesdk/internal/injection/EssentialServiceModule;Lio/embrace/android/embracesdk/internal/injection/ConfigModule;Lio/embrace/android/embracesdk/internal/injection/DeliveryModule;Lio/embrace/android/embracesdk/internal/injection/WorkerThreadModule;Lio/embrace/android/embracesdk/internal/injection/PayloadSourceModule;)Lio/embrace/android/embracesdk/internal/injection/LogModule;", 1);
    }

    @Override // kl2.q
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        b1 initModule = (b1) obj;
        q2 openTelemetryModule = (q2) obj2;
        a androidServicesModule = (a) obj3;
        o0 essentialServiceModule = (o0) obj4;
        k configModule = (k) obj5;
        h0 deliveryModule = (h0) obj6;
        l3 workerThreadModule = (l3) obj7;
        v2 payloadSourceModule = (v2) obj8;
        Intrinsics.checkNotNullParameter(initModule, "p0");
        Intrinsics.checkNotNullParameter(openTelemetryModule, "p1");
        Intrinsics.checkNotNullParameter(androidServicesModule, "p2");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "p3");
        Intrinsics.checkNotNullParameter(configModule, "p4");
        Intrinsics.checkNotNullParameter(deliveryModule, "p5");
        Intrinsics.checkNotNullParameter(workerThreadModule, "p6");
        Intrinsics.checkNotNullParameter(payloadSourceModule, "p7");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(openTelemetryModule, "openTelemetryModule");
        Intrinsics.checkNotNullParameter(androidServicesModule, "androidServicesModule");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "essentialServiceModule");
        Intrinsics.checkNotNullParameter(configModule, "configModule");
        Intrinsics.checkNotNullParameter(deliveryModule, "deliveryModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        Intrinsics.checkNotNullParameter(payloadSourceModule, "payloadSourceModule");
        return new i1(initModule, openTelemetryModule, androidServicesModule, essentialServiceModule, configModule, deliveryModule, workerThreadModule, payloadSourceModule);
    }
}
