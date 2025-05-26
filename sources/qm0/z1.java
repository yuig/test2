package qm0;

import a.cb;
import android.app.Application;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import o82.j3;

/* loaded from: classes5.dex */
public final class z1 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final sm0.h f104372c;

    /* renamed from: d, reason: collision with root package name */
    public final p70.e f104373d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.d0 f104374e;

    /* renamed from: f, reason: collision with root package name */
    public final w60.d f104375f;

    /* renamed from: g, reason: collision with root package name */
    public final zb0.i f104376g;

    /* renamed from: h, reason: collision with root package name */
    public final k92.l f104377h;

    /* renamed from: i, reason: collision with root package name */
    public final g01.a f104378i;

    /* renamed from: j, reason: collision with root package name */
    public final l82.y f104379j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(tm0.i displayStateMapper, sm0.h boardLandingSEP, p70.e boardToolsSEP, zy.d0 pinalyticsSEP, w60.d navigatorSEP, zb0.i alertSEP, k92.l toastSEP, e12.d boardService, x02.x0 boardRepository, Application application, ao2.j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(displayStateMapper, "displayStateMapper");
        Intrinsics.checkNotNullParameter(boardLandingSEP, "boardLandingSEP");
        Intrinsics.checkNotNullParameter(boardToolsSEP, "boardToolsSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(navigatorSEP, "navigatorSEP");
        Intrinsics.checkNotNullParameter(alertSEP, "alertSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(boardService, "boardService");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f104372c = boardLandingSEP;
        this.f104373d = boardToolsSEP;
        this.f104374e = pinalyticsSEP;
        this.f104375f = navigatorSEP;
        this.f104376g = alertSEP;
        this.f104377h = toastSEP;
        kv0.p pVar = new kv0.p(4);
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        int i13 = 8;
        kv0.p.b(pVar, new com.pinterest.boardAutoCollages.k0(i13), new ns.n0(24), new o82.h(new androidx.appcompat.widget.q(boardRepository, 0)), false, o82.t1.a(), null, null, null, u0.BoardHeader.getId(), null, 744);
        Intrinsics.checkNotNullParameter(boardService, "boardService");
        kv0.p.b(pVar, new com.pinterest.boardAutoCollages.k0(9), new ns.n0(25), new o82.h(new androidx.appcompat.widget.q(boardService, 1)), false, o82.t1.a(), null, null, null, u0.SavedContentPreview.getId(), null, 744);
        int i14 = y60.e.board_more_ideas_section_header;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        kv0.p.b(pVar, new h90.g0(1002, 4), new ns.n0(26), new j3(kotlin.collections.e0.b(new m2(new u50.k0(i14, new ArrayList(0))))), false, o82.t1.a(), null, null, null, u0.MoreIdeasHeader.getId(), null, 744);
        sm0.l lVar = new sm0.l(boardService);
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        kv0.p.b(pVar, new com.pinterest.boardAutoCollages.k0(10), new ns.n0(27), new o82.s0(lVar), false, o82.t1.b(), null, null, null, u0.MoreIdeas.getId(), null, 744);
        g01.a d2 = pVar.d();
        this.f104378i = d2;
        l82.a0 a0Var = new l82.a0(scope);
        x1 stateTransformer = new x1((o82.i0) d2.f63224a, new lt.j(2), new lt.j(i13), displayStateMapper);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f104379j = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f104379j.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f104379j.e();
    }

    public final void h(String boardId, String boardSessionId, wa2.m pinFeatureConfig, h32.i0 loggingContext, String str) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardSessionId, "boardSessionId");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        zy.l0 l0Var = new zy.l0(loggingContext, str);
        int i13 = 2;
        l82.y.i(this.f104379j, new y1(boardId, null, cb.g("toString(...)"), pinFeatureConfig, new o82.j0(kotlin.collections.f0.j(new o82.i2(new sm0.e(boardId), i13), new o82.i2(new sm0.o(boardId), i13), new o82.i2((Object) null, 3), new o82.i2(new sm0.j(boardId, pinFeatureConfig), i13))), new sk0.y(boardId, boardSessionId, null, zy.l0.b(l0Var, h32.i0.a(loggingContext, null, null, h32.g0.TOOLBAR, null, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL)), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL), i91.b.f71797d, false, false, l0Var), false, new kl0.t(this, 14), 2);
    }
}
