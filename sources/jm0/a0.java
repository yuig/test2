package jm0;

import android.app.Application;
import ao2.j0;
import com.pinterest.boardAutoCollages.k0;
import com.pinterest.boardAutoCollages.l0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h90.g0;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lm0.c1;
import lm0.x0;
import lm0.y0;
import o82.i0;
import o82.j3;
import o82.s0;
import o82.t1;
import um0.n0;
import um0.u0;
import um0.w0;
import x02.i2;
import x02.z0;
import zy.d0;

/* loaded from: classes5.dex */
public final class a0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final e12.d f76946c;

    /* renamed from: d, reason: collision with root package name */
    public final mm0.c f76947d;

    /* renamed from: e, reason: collision with root package name */
    public final pm0.o f76948e;

    /* renamed from: f, reason: collision with root package name */
    public final p70.e f76949f;

    /* renamed from: g, reason: collision with root package name */
    public final n0 f76950g;

    /* renamed from: h, reason: collision with root package name */
    public final w60.d f76951h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f76952i;

    /* renamed from: j, reason: collision with root package name */
    public final g01.a f76953j;

    /* renamed from: k, reason: collision with root package name */
    public final l82.y f76954k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(e12.d boardService, i2 pinRepository, z0 sectionRepository, mm0.c allSavesSEP, pm0.o boardLoadSEP, p70.e boardToolsSEP, n0 organizeSEP, w60.d navigationSEP, d0 pinalyticsSEP, qb0.a numberFormatter, Application application, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(boardService, "boardService");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(sectionRepository, "sectionRepository");
        Intrinsics.checkNotNullParameter(allSavesSEP, "allSavesSEP");
        Intrinsics.checkNotNullParameter(boardLoadSEP, "boardLoadSEP");
        Intrinsics.checkNotNullParameter(boardToolsSEP, "boardToolsSEP");
        Intrinsics.checkNotNullParameter(organizeSEP, "organizeSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(numberFormatter, "numberFormatter");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f76946c = boardService;
        this.f76947d = allSavesSEP;
        this.f76948e = boardLoadSEP;
        this.f76949f = boardToolsSEP;
        this.f76950g = organizeSEP;
        this.f76951h = navigationSEP;
        this.f76952i = pinalyticsSEP;
        kv0.p pVar = new kv0.p(4);
        kv0.p.b(pVar, new g0(1000, 3), new ns.n0(20), new j3(e0.b(lm0.b0.f83846a)), false, t1.a(), null, null, null, lm0.e0.OrganizeBoundary.getId(), null, 744);
        k0 k0Var = new k0(6);
        ns.n0 n0Var = new ns.n0(21);
        km0.g gVar = new km0.g(boardService);
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        kv0.p.b(pVar, k0Var, n0Var, new s0(gVar), false, new l0(4), new km0.m(sectionRepository), null, null, lm0.e0.BoardSections.getId(), null, 712);
        k0 k0Var2 = new k0(7);
        ns.n0 n0Var2 = new ns.n0(22);
        km0.d dVar = new km0.d(boardService);
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        kv0.p.b(pVar, k0Var2, n0Var2, new s0(dVar), false, t1.b(), new km0.j(pinRepository), null, null, lm0.e0.BoardPins.getId(), null, 712);
        kv0.p.b(pVar, new g0(1003, 3), new ns.n0(23), new j3(e0.b(lm0.c.f83848a)), true, t1.a(), null, null, null, lm0.e0.EmptyState.getId(), null, 736);
        g01.a d2 = pVar.d();
        this.f76953j = d2;
        l82.a0 a0Var = new l82.a0(scope);
        z stateTransformer = new z(new lt.j(8), new u0(new lt.j(9)), (i0) d2.f63224a, new lt.j(2), new om0.p(numberFormatter));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f76954k = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f76954k.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f76954k.e();
    }

    public final void h(String boardId, String boardSessionId, wa2.m pinFeatureConfig, String storyRequestParams, List organizeTools, h32.i0 loggingContext, String str) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardSessionId, "boardSessionId");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(storyRequestParams, "storyRequestParams");
        Intrinsics.checkNotNullParameter(organizeTools, "organizeTools");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        zy.l0 l0Var = new zy.l0(loggingContext, str);
        zy.l0 b13 = zy.l0.b(l0Var, h32.i0.a(loggingContext, null, null, h32.g0.TOOLBAR, null, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL));
        sk0.y yVar = new sk0.y(boardId, boardSessionId, null, b13, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL);
        w0 w0Var = new w0(new tk0.i0(organizeTools, boardId, null, false, b13, 508), l0Var, 11);
        sk0.d dVar = lm0.d0.f83856a;
        c1 pinFilter = lm0.a0.f83842a;
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardSessionId, "boardSessionId");
        Intrinsics.checkNotNullParameter(storyRequestParams, "storyRequestParams");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(pinFilter, "pinFilter");
        int i13 = 3;
        l82.y.i(this.f76954k, new x0(boardId, null, boardSessionId, storyRequestParams, pinFeatureConfig, y0.f83920b, yVar, w0Var, new o82.j0(f0.j(new o82.i2((Object) null, i13), new o82.i2(new km0.e(boardId, boardSessionId, 71), 2), new o82.i2(new km0.a(boardId, boardSessionId, storyRequestParams, pinFeatureConfig, pinFilter, 1001, false), 2), new o82.i2((Object) null, i13))), l0Var), false, new kl0.t(this, 7), 2);
    }
}
