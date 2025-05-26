package kh2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class k1 extends kotlin.jvm.internal.p implements kl2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k1 f79583a = new k1();

    public k1() {
        super(10, s0.class, "createEssentialServiceModule", "createEssentialServiceModule(Lio/embrace/android/embracesdk/internal/injection/InitModule;Lio/embrace/android/embracesdk/internal/injection/ConfigModule;Lio/embrace/android/embracesdk/internal/injection/OpenTelemetryModule;Lio/embrace/android/embracesdk/internal/injection/CoreModule;Lio/embrace/android/embracesdk/internal/injection/WorkerThreadModule;Lio/embrace/android/embracesdk/internal/injection/SystemServiceModule;Lio/embrace/android/embracesdk/internal/injection/AndroidServicesModule;Lio/embrace/android/embracesdk/internal/injection/StorageModule;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lio/embrace/android/embracesdk/internal/injection/EssentialServiceModule;", 1);
    }

    @Override // kl2.a
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        b1 initModule = (b1) obj;
        k configModule = (k) obj2;
        q2 openTelemetryModule = (q2) obj3;
        o coreModule = (o) obj4;
        l3 workerThreadModule = (l3) obj5;
        h3 systemServiceModule = (h3) obj6;
        a androidServicesModule = (a) obj7;
        d3 storageModule = (d3) obj8;
        Function0 lifecycleOwnerProvider = (Function0) obj9;
        Function0 networkConnectivityServiceProvider = (Function0) obj10;
        Intrinsics.checkNotNullParameter(initModule, "p0");
        Intrinsics.checkNotNullParameter(configModule, "p1");
        Intrinsics.checkNotNullParameter(openTelemetryModule, "p2");
        Intrinsics.checkNotNullParameter(coreModule, "p3");
        Intrinsics.checkNotNullParameter(workerThreadModule, "p4");
        Intrinsics.checkNotNullParameter(systemServiceModule, "p5");
        Intrinsics.checkNotNullParameter(androidServicesModule, "p6");
        Intrinsics.checkNotNullParameter(storageModule, "p7");
        Intrinsics.checkNotNullParameter(lifecycleOwnerProvider, "p8");
        Intrinsics.checkNotNullParameter(networkConnectivityServiceProvider, "p9");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(configModule, "configModule");
        Intrinsics.checkNotNullParameter(openTelemetryModule, "openTelemetryModule");
        Intrinsics.checkNotNullParameter(coreModule, "coreModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        Intrinsics.checkNotNullParameter(systemServiceModule, "systemServiceModule");
        Intrinsics.checkNotNullParameter(androidServicesModule, "androidServicesModule");
        Intrinsics.checkNotNullParameter(storageModule, "storageModule");
        Intrinsics.checkNotNullParameter(lifecycleOwnerProvider, "lifecycleOwnerProvider");
        Intrinsics.checkNotNullParameter(networkConnectivityServiceProvider, "networkConnectivityServiceProvider");
        return new r0(initModule, configModule, openTelemetryModule, coreModule, workerThreadModule, systemServiceModule, androidServicesModule, storageModule, lifecycleOwnerProvider, networkConnectivityServiceProvider);
    }
}
