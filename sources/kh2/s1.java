package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class s1 extends kotlin.jvm.internal.p implements kl2.p {

    /* renamed from: a, reason: collision with root package name */
    public static final s1 f79685a = new s1();

    public s1() {
        super(7, p2.class, "createNativeFeatureModule", "createNativeFeatureModule(Lio/embrace/android/embracesdk/internal/injection/InitModule;Lio/embrace/android/embracesdk/internal/injection/EssentialServiceModule;Lio/embrace/android/embracesdk/internal/injection/ConfigModule;Lio/embrace/android/embracesdk/internal/injection/PayloadSourceModule;Lio/embrace/android/embracesdk/internal/injection/AndroidServicesModule;Lio/embrace/android/embracesdk/internal/injection/WorkerThreadModule;Lio/embrace/android/embracesdk/internal/injection/NativeCoreModule;)Lio/embrace/android/embracesdk/internal/injection/NativeFeatureModule;", 1);
    }

    @Override // kl2.p
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        b1 initModule = (b1) obj;
        o0 essentialServiceModule = (o0) obj2;
        k configModule = (k) obj3;
        v2 payloadSourceModule = (v2) obj4;
        a androidServicesModule = (a) obj5;
        l3 workerThreadModule = (l3) obj6;
        k2 nativeCoreModule = (k2) obj7;
        Intrinsics.checkNotNullParameter(initModule, "p0");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "p1");
        Intrinsics.checkNotNullParameter(configModule, "p2");
        Intrinsics.checkNotNullParameter(payloadSourceModule, "p3");
        Intrinsics.checkNotNullParameter(androidServicesModule, "p4");
        Intrinsics.checkNotNullParameter(workerThreadModule, "p5");
        Intrinsics.checkNotNullParameter(nativeCoreModule, "p6");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "essentialServiceModule");
        Intrinsics.checkNotNullParameter(configModule, "configModule");
        Intrinsics.checkNotNullParameter(payloadSourceModule, "payloadSourceModule");
        Intrinsics.checkNotNullParameter(androidServicesModule, "androidServicesModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        Intrinsics.checkNotNullParameter(nativeCoreModule, "nativeCoreModule");
        return new o2(initModule, essentialServiceModule, configModule, payloadSourceModule, androidServicesModule, workerThreadModule, nativeCoreModule);
    }
}
