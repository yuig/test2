package kh2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class m1 extends kotlin.jvm.internal.p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final m1 f79616a = new m1();

    public m1() {
        super(2, g0.class, "createDataSourceModule", "createDataSourceModule(Lio/embrace/android/embracesdk/internal/injection/InitModule;Lio/embrace/android/embracesdk/internal/injection/WorkerThreadModule;)Lio/embrace/android/embracesdk/internal/injection/DataSourceModule;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b1 initModule = (b1) obj;
        l3 workerThreadModule = (l3) obj2;
        Intrinsics.checkNotNullParameter(initModule, "p0");
        Intrinsics.checkNotNullParameter(workerThreadModule, "p1");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(workerThreadModule, "workerThreadModule");
        return new f0(initModule, workerThreadModule);
    }
}
