package so;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r8 f113519a;

    public k7(r8 r8Var) {
        this.f113519a = r8Var;
    }

    public final com.pinterest.creatorHub.feature.creatorpathways.j a() {
        r8 r8Var = this.f113519a;
        uk1.e presenterPinalyticsFactory = (uk1.e) r8Var.f114090a.f113702ga.get();
        uj2.q networkStateStream = (uj2.q) r8Var.f114090a.f113947u9.get();
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        return new com.pinterest.creatorHub.feature.creatorpathways.j(((uk1.a) presenterPinalyticsFactory).g(), networkStateStream);
    }
}
