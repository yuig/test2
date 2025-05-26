package kh2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class y1 extends kotlin.jvm.internal.p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final y1 f79749a = new y1();

    public y1() {
        super(2, k3.class, "createSystemServiceModule", "createSystemServiceModule(Lio/embrace/android/embracesdk/internal/injection/CoreModule;Lio/embrace/android/embracesdk/internal/utils/VersionChecker;)Lio/embrace/android/embracesdk/internal/injection/SystemServiceModule;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        o coreModule = (o) obj;
        ii2.d versionChecker = (ii2.d) obj2;
        Intrinsics.checkNotNullParameter(coreModule, "p0");
        Intrinsics.checkNotNullParameter(versionChecker, "p1");
        Intrinsics.checkNotNullParameter(coreModule, "coreModule");
        Intrinsics.checkNotNullParameter(versionChecker, "versionChecker");
        return new j3(coreModule, versionChecker);
    }
}
