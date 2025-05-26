package c71;

import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.results.view.g0;
import jk2.h0;
import kh2.k3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.g3;
import sq0.e0;

/* loaded from: classes5.dex */
public final class a0 extends vq0.d {

    /* renamed from: c, reason: collision with root package name */
    public final x02.y f26721c;

    /* renamed from: d, reason: collision with root package name */
    public final g70.h f26722d;

    /* renamed from: e, reason: collision with root package name */
    public String f26723e;

    /* renamed from: f, reason: collision with root package name */
    public Function0 f26724f;

    /* renamed from: g, reason: collision with root package name */
    public final a0 f26725g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(uk1.d pinalytics, uj2.q networkStateStream, x02.y boardFeedRepository, b60.b activeUserManager, pb0.d fuzzyDateFormatter, g3 experiments, g70.h boardNavigator) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(boardFeedRepository, "boardFeedRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f26721c = boardFeedRepository;
        this.f26722d = boardNavigator;
        this.f26724f = g.f26768o;
        wy0 f13 = ((b60.d) activeUserManager).f();
        Intrinsics.checkNotNullParameter(experiments, "<this>");
        this.f126436a.j(43, new yo0.a(new j41.i(this, 15), f.f26761k, f13, fuzzyDateFormatter, new ka2.c(getPinalytics(), (gx0.b) null, 6), experiments.c() ? ka2.a.f78935q : new ka2.a(null, false, false, null, true, false, true, true, null, false, false, false, false, false, 57135), RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL));
        this.f26725g = this;
    }

    @Override // vq0.g
    /* renamed from: D3, reason: merged with bridge method [inline-methods] */
    public final void r3(h61.d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        if (((Boolean) this.f26724f.invoke()).booleanValue()) {
            k3.R1(((g0) view).f47794h, false);
        }
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 43;
    }

    @Override // vq0.g
    public final void loadData() {
        super.loadData();
        String query = this.f26723e;
        if (query != null && this.f126435b.size() <= 0) {
            clearDisposables();
            uk2.f fVar = m22.a.f85712a;
            x02.y yVar = this.f26721c;
            Intrinsics.checkNotNullParameter(yVar, "<this>");
            Intrinsics.checkNotNullParameter(query, "query");
            uj2.t e13 = query.length() == 0 ? h0.f76488a : yVar.e(new x02.w(5, query));
            ek0.c cVar = new ek0.c(3, this, query);
            e13.d(cVar);
            Intrinsics.checkNotNullExpressionValue(cVar, "subscribeWith(...)");
            addDisposable(cVar);
        }
    }

    @Override // vq0.g
    public final e0 p3() {
        return this.f26725g;
    }
}
