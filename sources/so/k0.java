package so;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r8 f113512a;

    public k0(r8 r8Var) {
        this.f113512a = r8Var;
    }

    public final zq1.j0 a(uk1.d pinalytics, uj2.q networkStateStream) {
        s8 s8Var = this.f113512a.f114091b;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        zq1.j0 j0Var = new zq1.j0(pinalytics, networkStateStream);
        j0Var.f142701a = (rr1.g) s8Var.f114321h6.get();
        return j0Var;
    }
}
