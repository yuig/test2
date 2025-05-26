package kh2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class v1 extends kotlin.jvm.internal.p implements kl2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final v1 f79725a = new v1();

    public v1() {
        super(11, u2.class, "createPayloadSourceModule", "createPayloadSourceModule(Lio/embrace/android/embracesdk/internal/injection/InitModule;Lio/embrace/android/embracesdk/internal/injection/CoreModule;Lio/embrace/android/embracesdk/internal/injection/WorkerThreadModule;Lio/embrace/android/embracesdk/internal/injection/SystemServiceModule;Lio/embrace/android/embracesdk/internal/injection/AndroidServicesModule;Lio/embrace/android/embracesdk/internal/injection/EssentialServiceModule;Lio/embrace/android/embracesdk/internal/injection/ConfigModule;Lkotlin/jvm/functions/Function0;Lio/embrace/android/embracesdk/internal/injection/OpenTelemetryModule;Lkotlin/jvm/functions/Function0;Lio/embrace/android/embracesdk/internal/injection/DeliveryModule;)Lio/embrace/android/embracesdk/internal/injection/PayloadSourceModule;", 1);
    }

    @Override // kl2.b
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        b1 initModule = (b1) obj;
        o coreModule = (o) obj2;
        l3 workerThreadModule = (l3) obj3;
        h3 systemServiceModule = (h3) obj4;
        a androidServicesModule = (a) obj5;
        o0 essentialServiceModule = (o0) obj6;
        k configModule = (k) obj7;
        Function0 nativeSymbolsProvider = (Function0) obj8;
        q2 otelModule = (q2) obj9;
        Function0 otelPayloadMapperProvider = (Function0) obj10;
        h0 deliveryModule = (h0) obj11;
        Intrinsics.checkNotNullParameter(initModule, "p0");
        Intrinsics.checkNotNullParameter(coreModule, "p1");
        Intrinsics.checkNotNullParameter(workerThreadModule, "p2");
        Intrinsics.checkNotNullParameter(systemServiceModule, "p3");
        Intrinsics.checkNotNullParameter(androidServicesModule, "p4");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "p5");
        Intrinsics.checkNotNullParameter(configModule, "p6");
        Intrinsics.checkNotNullParameter(nativeSymbolsProvider, "p7");
        Intrinsics.checkNotNullParameter(otelModule, "p8");
        Intrinsics.checkNotNullParameter(otelPayloadMapperProvider, "p9");
        Intrinsics.checkNotNullParameter(deliveryModule, "p10");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(coreModule, "coreModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        Intrinsics.checkNotNullParameter(systemServiceModule, "systemServiceModule");
        Intrinsics.checkNotNullParameter(androidServicesModule, "androidServicesModule");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "essentialServiceModule");
        Intrinsics.checkNotNullParameter(configModule, "configModule");
        Intrinsics.checkNotNullParameter(nativeSymbolsProvider, "nativeSymbolsProvider");
        Intrinsics.checkNotNullParameter(otelModule, "otelModule");
        Intrinsics.checkNotNullParameter(otelPayloadMapperProvider, "otelPayloadMapperProvider");
        Intrinsics.checkNotNullParameter(deliveryModule, "deliveryModule");
        return new y2(initModule, coreModule, workerThreadModule, systemServiceModule, androidServicesModule, essentialServiceModule, configModule, nativeSymbolsProvider, otelModule, otelPayloadMapperProvider, deliveryModule);
    }
}
