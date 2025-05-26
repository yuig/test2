package kh2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class z1 extends kotlin.jvm.internal.p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final z1 f79778a = new z1();

    public z1() {
        super(2, d.class, "createAndroidServicesModule", "createAndroidServicesModule(Lio/embrace/android/embracesdk/internal/injection/InitModule;Lio/embrace/android/embracesdk/internal/injection/CoreModule;)Lio/embrace/android/embracesdk/internal/injection/AndroidServicesModule;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b1 initModule = (b1) obj;
        o coreModule = (o) obj2;
        Intrinsics.checkNotNullParameter(initModule, "p0");
        Intrinsics.checkNotNullParameter(coreModule, "p1");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(coreModule, "coreModule");
        return new c(initModule, coreModule);
    }
}
