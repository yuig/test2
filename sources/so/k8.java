package so;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r8 f113520a;

    public k8(r8 r8Var) {
        this.f113520a = r8Var;
    }

    public final android.support.v4.media.a a(nx.d0 pinalytics) {
        r8 r8Var = this.f113520a;
        m60.w eventManager = (m60.w) r8Var.f114090a.f113885r0.get();
        s8 s8Var = r8Var.f114091b;
        androidx.appcompat.app.n context = s8Var.a5();
        a02.e.D4(context);
        oa oaVar = r8Var.f114090a;
        h22.f storyPinService = (h22.f) oaVar.P7.get();
        i92.k toastUtils = (i92.k) oaVar.f113921t1.get();
        x02.i2 pinRepository = (x02.i2) oaVar.F3.get();
        b60.b activeUserManager = (b60.b) oaVar.f113850p0.get();
        ku1.j navigationManager = (ku1.j) s8Var.f114402n.get();
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(storyPinService, "storyPinService");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        android.support.v4.media.a aVar = new android.support.v4.media.a();
        aVar.f15837a = eventManager;
        aVar.f15838b = context;
        aVar.f15839c = pinalytics;
        aVar.f15840d = storyPinService;
        aVar.f15841e = toastUtils;
        aVar.f15842f = pinRepository;
        aVar.f15843g = activeUserManager;
        aVar.f15844h = navigationManager;
        return aVar;
    }
}
