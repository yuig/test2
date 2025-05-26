package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b2 extends kotlin.jvm.internal.p implements kl2.l {

    /* renamed from: a, reason: collision with root package name */
    public static final b2 f79439a = new b2();

    public b2() {
        super(3, g3.class, "createStorageModuleSupplier", "createStorageModuleSupplier(Lio/embrace/android/embracesdk/internal/injection/InitModule;Lio/embrace/android/embracesdk/internal/injection/CoreModule;Lio/embrace/android/embracesdk/internal/injection/WorkerThreadModule;)Lio/embrace/android/embracesdk/internal/injection/StorageModule;", 1);
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b1 initModule = (b1) obj;
        o coreModule = (o) obj2;
        l3 workerThreadModule = (l3) obj3;
        Intrinsics.checkNotNullParameter(initModule, "p0");
        Intrinsics.checkNotNullParameter(coreModule, "p1");
        Intrinsics.checkNotNullParameter(workerThreadModule, "p2");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(coreModule, "coreModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        return new f3(initModule, coreModule, workerThreadModule);
    }
}
