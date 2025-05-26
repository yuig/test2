package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class p1 extends kotlin.jvm.internal.p implements kl2.l {

    /* renamed from: a, reason: collision with root package name */
    public static final p1 f79640a = new p1();

    public p1() {
        super(3, j.class, "createAnrModule", "createAnrModule(Lio/embrace/android/embracesdk/internal/injection/InitModule;Lio/embrace/android/embracesdk/internal/config/ConfigService;Lio/embrace/android/embracesdk/internal/injection/WorkerThreadModule;)Lio/embrace/android/embracesdk/internal/injection/AnrModule;", 1);
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b1 initModule = (b1) obj;
        sg2.a configService = (sg2.a) obj2;
        l3 workerModule = (l3) obj3;
        Intrinsics.checkNotNullParameter(initModule, "p0");
        Intrinsics.checkNotNullParameter(configService, "p1");
        Intrinsics.checkNotNullParameter(workerModule, "p2");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(workerModule, "workerModule");
        return new i(initModule, configService, workerModule);
    }
}
