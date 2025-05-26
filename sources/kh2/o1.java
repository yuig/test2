package kh2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class o1 extends kotlin.jvm.internal.p implements kl2.c {

    /* renamed from: a, reason: collision with root package name */
    public static final o1 f79630a = new o1();

    public o1() {
        super(13, m0.class, "createDeliveryModule", "createDeliveryModule(Lio/embrace/android/embracesdk/internal/injection/ConfigModule;Lio/embrace/android/embracesdk/internal/injection/InitModule;Lio/embrace/android/embracesdk/internal/injection/OpenTelemetryModule;Lio/embrace/android/embracesdk/internal/injection/WorkerThreadModule;Lio/embrace/android/embracesdk/internal/injection/CoreModule;Lio/embrace/android/embracesdk/internal/injection/StorageModule;Lio/embrace/android/embracesdk/internal/injection/EssentialServiceModule;Lio/embrace/android/embracesdk/internal/injection/AndroidServicesModule;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lio/embrace/android/embracesdk/internal/delivery/debug/DeliveryTracer;)Lio/embrace/android/embracesdk/internal/injection/DeliveryModule;", 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kl2.c
    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Integer num, Integer num2) {
        k configModule = (k) obj;
        b1 initModule = (b1) obj2;
        q2 otelModule = (q2) obj3;
        l3 workerThreadModule = (l3) obj4;
        o coreModule = (o) obj5;
        d3 storageModule = (d3) obj6;
        o0 essentialServiceModule = (o0) obj7;
        a androidServicesModule = (a) obj8;
        Function0 function0 = (Function0) obj11;
        jq.b.v(num2);
        Intrinsics.checkNotNullParameter(configModule, "p0");
        Intrinsics.checkNotNullParameter(initModule, "p1");
        Intrinsics.checkNotNullParameter(otelModule, "p2");
        Intrinsics.checkNotNullParameter(workerThreadModule, "p3");
        Intrinsics.checkNotNullParameter(coreModule, "p4");
        Intrinsics.checkNotNullParameter(storageModule, "p5");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "p6");
        Intrinsics.checkNotNullParameter(androidServicesModule, "p7");
        Intrinsics.checkNotNullParameter(configModule, "configModule");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(otelModule, "otelModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        Intrinsics.checkNotNullParameter(coreModule, "coreModule");
        Intrinsics.checkNotNullParameter(storageModule, "storageModule");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "essentialServiceModule");
        Intrinsics.checkNotNullParameter(androidServicesModule, "androidServicesModule");
        return new l0(configModule, initModule, otelModule, workerThreadModule, coreModule, storageModule, essentialServiceModule, androidServicesModule, function0, (Function0) obj9, (Function0) obj10, (Function0) num);
    }
}
