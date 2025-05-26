package so;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r8 f114054a;

    public p5(r8 r8Var) {
        this.f114054a = r8Var;
    }

    public final zl0.a a(nj0.a data, hk0.m sourceModelType, x22.c referrerType, wk1.c parameters) {
        r8 r8Var = this.f114054a;
        s8 s8Var = r8Var.f114091b;
        oa oaVar = r8Var.f114090a;
        x02.x0 boardRepository = (x02.x0) oaVar.f113765k3.get();
        x02.z0 boardSectionRepository = (x02.z0) oaVar.B3.get();
        x02.i2 pinRepository = (x02.i2) oaVar.F3.get();
        i92.k toastUtils = (i92.k) oaVar.f113921t1.get();
        rg0.s experiences = (rg0.s) oaVar.Q5.get();
        g4.u videoUtil = or.a.f97245a;
        Intrinsics.checkNotNullExpressionValue(videoUtil, "getInstance(...)");
        s8 s8Var2 = r8Var.f114091b;
        yk1.v viewResources = (yk1.v) s8Var2.C.get();
        com.pinterest.feature.pin.j pinAction = (com.pinterest.feature.pin.j) s8Var2.E.get();
        nx.d1 trackingParamAttacher = (nx.d1) oaVar.f113730i2.get();
        m60.g0 pageSizeProvider = (m60.g0) oaVar.f113590a4.get();
        nr0.m dynamicGridViewBinderDelegateFactory = (nr0.m) s8Var2.f114506u.get();
        lh0.t boardMoreIdeasLibraryExperiments = s8.e(s8Var2);
        com.pinterest.feature.pin.r repinAnimationUtil = s8Var2.k6();
        m60.w eventManager = (m60.w) oaVar.f113885r0.get();
        nx.b0 pinAuxHelper = (nx.b0) oaVar.R8.get();
        g70.h boardNavigator = s8Var2.e5();
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(sourceModelType, "sourceModelType");
        Intrinsics.checkNotNullParameter(referrerType, "referrerType");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(boardSectionRepository, "boardSectionRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(videoUtil, "videoUtil");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(pinAction, "pinAction");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(boardMoreIdeasLibraryExperiments, "boardMoreIdeasLibraryExperiments");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        zl0.a aVar = new zl0.a(data, sourceModelType, referrerType, parameters, true, true, false, null, boardRepository, boardSectionRepository, pinRepository, toastUtils, experiences, viewResources, pinAction, trackingParamAttacher, pageSizeProvider, dynamicGridViewBinderDelegateFactory, boardMoreIdeasLibraryExperiments, repinAnimationUtil, eventManager, pinAuxHelper, boardNavigator);
        oa oaVar2 = s8Var.f114255d;
        aVar.f100274j = (lh0.n1) oaVar2.E0.get();
        s8Var.x5();
        oaVar2.I2();
        return aVar;
    }
}
