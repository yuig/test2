package so;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r8 f114203a;

    public s2(r8 r8Var) {
        this.f114203a = r8Var;
    }

    public final i11.t a(String str, h32.d4 viewType, boolean z13) {
        r8 r8Var = this.f114203a;
        s8 s8Var = r8Var.f114091b;
        oa oaVar = r8Var.f114090a;
        x02.y boardFeedRepository = (x02.y) oaVar.f113660e4.get();
        x02.i2 pinRepository = (x02.i2) oaVar.F3.get();
        x02.x0 boardRepository = (x02.x0) oaVar.f113765k3.get();
        b60.b activeUserManager = (b60.b) oaVar.f113850p0.get();
        uk1.d presenterPinalytics = oaVar.i2();
        uj2.q networkStateStream = (uj2.q) oaVar.f113947u9.get();
        m60.w eventManager = (m60.w) oaVar.f113885r0.get();
        s8 s8Var2 = r8Var.f114091b;
        yk1.v viewResources = (yk1.v) s8Var2.C.get();
        lh0.z2 experiments = s8Var2.l6();
        i92.k toastUtils = (i92.k) oaVar.f113921t1.get();
        rg0.s experiences = (rg0.s) oaVar.Q5.get();
        zf0.f educationHelper = (zf0.f) oaVar.f113723hd.get();
        f21.e repinToProfileHelper = (f21.e) s8Var2.D.get();
        com.pinterest.feature.pin.r repinAnimationUtil = s8Var2.k6();
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(boardFeedRepository, "boardFeedRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(educationHelper, "educationHelper");
        Intrinsics.checkNotNullParameter(repinToProfileHelper, "repinToProfileHelper");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        i11.t tVar = new i11.t(boardFeedRepository, pinRepository, boardRepository, activeUserManager, presenterPinalytics, networkStateStream, eventManager, viewResources, experiments, toastUtils, experiences, educationHelper, repinToProfileHelper, repinAnimationUtil, str, viewType, Boolean.FALSE, null, false, null, z13, false, 96);
        tVar.f71000f0 = (my1.a) s8Var.f114255d.f113671ef.get();
        tVar.f71002g0 = s8Var.p6();
        tVar.f71004h0 = s8Var.o6();
        return tVar;
    }
}
