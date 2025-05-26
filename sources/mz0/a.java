package mz0;

import com.pinterest.feature.pin.j;
import com.pinterest.feature.pin.r;
import g4.u;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lz0.b;
import lz0.c;
import m60.g0;
import m60.w;
import nr0.l;
import nr0.m;
import nx.b0;
import nx.d1;
import pj0.e;
import qa2.n;
import qz.f0;
import so.l1;
import so.n6;
import so.oa;
import so.r8;
import so.s8;
import uk1.d;
import wk1.i;
import x02.i2;
import x02.x0;

/* loaded from: classes5.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final String f88539a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f88540b;

    /* renamed from: c, reason: collision with root package name */
    public final b f88541c;

    /* renamed from: d, reason: collision with root package name */
    public final c f88542d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String insightId, String boardId, boolean z13, wk1.c params, i2 pinRepository, x0 boardRepository, s20.a pearService, m dynamicGridViewBinderDelegateFactory, l1 pearRelatedPinsPagedListFactory) {
        super(params, pinRepository);
        Intrinsics.checkNotNullParameter(insightId, "insightId");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(pearService, "pearService");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(pearRelatedPinsPagedListFactory, "pearRelatedPinsPagedListFactory");
        this.f88539a = boardId;
        this.f88540b = boardRepository;
        this.f88541c = new b(insightId, pearService);
        d presenterPinalytics = getPresenterPinalytics();
        n gridFeatureConfig = params.f130131b;
        d presenterPinalytics2 = getPresenterPinalytics();
        n nVar = params.f130131b;
        l viewBinderDelegate = ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics2, nVar.f103320a, nVar, params.f130137h);
        r8 r8Var = pearRelatedPinsPagedListFactory.f113529a;
        g0 pageSizeProvider = (g0) r8Var.f114090a.f113590a4.get();
        oa oaVar = r8Var.f114090a;
        i2 pinRepository2 = (i2) oaVar.F3.get();
        u videoUtil = or.a.f97245a;
        Intrinsics.checkNotNullExpressionValue(videoUtil, "getInstance(...)");
        s8 s8Var = r8Var.f114091b;
        j pinAction = (j) s8Var.E.get();
        d1 trackingParamAttacher = (d1) oaVar.f113730i2.get();
        r repinAnimationUtil = s8Var.k6();
        w eventManager = (w) oaVar.f113885r0.get();
        b0 pinAuxHelper = (b0) oaVar.R8.get();
        Intrinsics.checkNotNullParameter(insightId, "insightId");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(gridFeatureConfig, "gridFeatureConfig");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(pinRepository2, "pinRepository");
        Intrinsics.checkNotNullParameter(videoUtil, "videoUtil");
        Intrinsics.checkNotNullParameter(pinAction, "pinAction");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        c cVar = new c(boardId, a.a.p(new StringBuilder("insights/"), insightId, "/feed/"), z13, pinRepository2, presenterPinalytics, pinAction, trackingParamAttacher, gridFeatureConfig, viewBinderDelegate, repinAnimationUtil, eventManager, null, pinAuxHelper, 40960);
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.BOARD_NEW_IDEAS));
        f0Var.e("page_size", pageSizeProvider.d());
        cVar.f49121k = f0Var;
        int[] iArr = mj0.j.f87276a;
        mj0.j.a(cVar, gridFeatureConfig.f103320a, cVar, z13, null, null, 48);
        this.f88542d = cVar;
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        i iVar = (i) dataSources;
        iVar.b(this.f88541c);
        iVar.b(this.f88542d);
    }

    @Override // wk1.n, yk1.b
    public final void onDeactivate() {
        super.onDeactivate();
        if (u3().T.f95379p) {
            u3().T.f95379p = false;
            x0 x0Var = this.f88540b;
            x0Var.getClass();
            String boardId = this.f88539a;
            Intrinsics.checkNotNullParameter(boardId, "boardId");
            x0Var.P.c(new Pair(boardId, null));
        }
    }

    public final pj0.d u3() {
        return this.f88542d;
    }
}
