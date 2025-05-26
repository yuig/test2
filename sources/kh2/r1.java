package kh2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class r1 extends kotlin.jvm.internal.p implements kl2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final r1 f79681a = new r1();

    public r1() {
        super(11, m2.class, "createNativeCoreModule", "createNativeCoreModule(Lio/embrace/android/embracesdk/internal/injection/InitModule;Lio/embrace/android/embracesdk/internal/injection/CoreModule;Lio/embrace/android/embracesdk/internal/injection/PayloadSourceModule;Lio/embrace/android/embracesdk/internal/injection/WorkerThreadModule;Lio/embrace/android/embracesdk/internal/injection/ConfigModule;Lio/embrace/android/embracesdk/internal/injection/StorageModule;Lio/embrace/android/embracesdk/internal/injection/EssentialServiceModule;Lio/embrace/android/embracesdk/internal/injection/OpenTelemetryModule;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lio/embrace/android/embracesdk/internal/injection/NativeCoreModule;", 1);
    }

    @Override // kl2.b
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        b1 initModule = (b1) obj;
        o coreModule = (o) obj2;
        v2 payloadSourceModule = (v2) obj3;
        l3 workerThreadModule = (l3) obj4;
        k configModule = (k) obj5;
        d3 storageModule = (d3) obj6;
        o0 essentialServiceModule = (o0) obj7;
        q2 otelModule = (q2) obj8;
        Function0 delegateProvider = (Function0) obj9;
        Function0 sharedObjectLoaderProvider = (Function0) obj10;
        Function0 symbolServiceProvider = (Function0) obj11;
        Intrinsics.checkNotNullParameter(initModule, "p0");
        Intrinsics.checkNotNullParameter(coreModule, "p1");
        Intrinsics.checkNotNullParameter(payloadSourceModule, "p2");
        Intrinsics.checkNotNullParameter(workerThreadModule, "p3");
        Intrinsics.checkNotNullParameter(configModule, "p4");
        Intrinsics.checkNotNullParameter(storageModule, "p5");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "p6");
        Intrinsics.checkNotNullParameter(otelModule, "p7");
        Intrinsics.checkNotNullParameter(delegateProvider, "p8");
        Intrinsics.checkNotNullParameter(sharedObjectLoaderProvider, "p9");
        Intrinsics.checkNotNullParameter(symbolServiceProvider, "p10");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(coreModule, "coreModule");
        Intrinsics.checkNotNullParameter(payloadSourceModule, "payloadSourceModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        Intrinsics.checkNotNullParameter(configModule, "configModule");
        Intrinsics.checkNotNullParameter(storageModule, "storageModule");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "essentialServiceModule");
        Intrinsics.checkNotNullParameter(otelModule, "otelModule");
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
        Intrinsics.checkNotNullParameter(sharedObjectLoaderProvider, "sharedObjectLoaderProvider");
        Intrinsics.checkNotNullParameter(symbolServiceProvider, "symbolServiceProvider");
        return new l2(initModule, coreModule, payloadSourceModule, workerThreadModule, configModule, storageModule, essentialServiceModule, otelModule, delegateProvider, sharedObjectLoaderProvider, symbolServiceProvider);
    }
}
