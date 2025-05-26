package so;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r8 f113448a;

    public h8(r8 r8Var) {
        this.f113448a = r8Var;
    }

    public final uu0.d a(uk1.d presenterPinalytics) {
        r8 r8Var = this.f113448a;
        x02.x2 userRepository = (x02.x2) r8Var.f114090a.f113800m3.get();
        uj2.q networkStateStream = (uj2.q) r8Var.f114090a.f113947u9.get();
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        return new uu0.d(presenterPinalytics, networkStateStream);
    }
}
