package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class x1 extends kotlin.jvm.internal.p implements kl2.o {

    /* renamed from: a, reason: collision with root package name */
    public static final x1 f79736a = new x1();

    public x1() {
        super(6, n.class, "createConfigModule", "createConfigModule(Lio/embrace/android/embracesdk/internal/injection/InitModule;Lio/embrace/android/embracesdk/internal/injection/CoreModule;Lio/embrace/android/embracesdk/internal/injection/OpenTelemetryModule;Lio/embrace/android/embracesdk/internal/injection/WorkerThreadModule;Lio/embrace/android/embracesdk/internal/injection/AndroidServicesModule;Lio/embrace/android/embracesdk/internal/payload/AppFramework;)Lio/embrace/android/embracesdk/internal/injection/ConfigModule;", 1);
    }

    @Override // kl2.o
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        b1 initModule = (b1) obj;
        o coreModule = (o) obj2;
        q2 openTelemetryModule = (q2) obj3;
        l3 workerThreadModule = (l3) obj4;
        a androidServicesModule = (a) obj5;
        th2.g framework = (th2.g) obj6;
        Intrinsics.checkNotNullParameter(initModule, "p0");
        Intrinsics.checkNotNullParameter(coreModule, "p1");
        Intrinsics.checkNotNullParameter(openTelemetryModule, "p2");
        Intrinsics.checkNotNullParameter(workerThreadModule, "p3");
        Intrinsics.checkNotNullParameter(androidServicesModule, "p4");
        Intrinsics.checkNotNullParameter(framework, "p5");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(coreModule, "coreModule");
        Intrinsics.checkNotNullParameter(openTelemetryModule, "openTelemetryModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        Intrinsics.checkNotNullParameter(androidServicesModule, "androidServicesModule");
        Intrinsics.checkNotNullParameter(framework, "framework");
        return new m(initModule, coreModule, openTelemetryModule, workerThreadModule, androidServicesModule, framework);
    }
}
