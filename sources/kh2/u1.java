package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class u1 extends kotlin.jvm.internal.p implements kl2.n {

    /* renamed from: a, reason: collision with root package name */
    public static final u1 f79714a = new u1();

    public u1() {
        super(5, w.class, "createCrashModule", "createCrashModule(Lio/embrace/android/embracesdk/internal/injection/InitModule;Lio/embrace/android/embracesdk/internal/injection/StorageModule;Lio/embrace/android/embracesdk/internal/injection/EssentialServiceModule;Lio/embrace/android/embracesdk/internal/injection/ConfigModule;Lio/embrace/android/embracesdk/internal/injection/AndroidServicesModule;)Lio/embrace/android/embracesdk/internal/injection/CrashModule;", 1);
    }

    @Override // kl2.n
    public final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b1 initModule = (b1) obj;
        d3 storageModule = (d3) obj2;
        o0 essentialServiceModule = (o0) obj3;
        k configModule = (k) obj4;
        a androidServicesModule = (a) obj5;
        Intrinsics.checkNotNullParameter(initModule, "p0");
        Intrinsics.checkNotNullParameter(storageModule, "p1");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "p2");
        Intrinsics.checkNotNullParameter(configModule, "p3");
        Intrinsics.checkNotNullParameter(androidServicesModule, "p4");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(storageModule, "storageModule");
        Intrinsics.checkNotNullParameter(essentialServiceModule, "essentialServiceModule");
        Intrinsics.checkNotNullParameter(configModule, "configModule");
        Intrinsics.checkNotNullParameter(androidServicesModule, "androidServicesModule");
        return new v(initModule, storageModule, essentialServiceModule, configModule, androidServicesModule);
    }
}
