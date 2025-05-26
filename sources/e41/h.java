package e41;

import a41.u;
import android.content.res.Resources;
import c71.l;
import com.pinterest.framework.multisection.datasource.pagedlist.s;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import g41.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import kp.n;
import m60.g0;
import so.d2;
import sq0.c0;
import u40.h0;
import wk1.i;
import wk1.q;
import y01.p1;

/* loaded from: classes5.dex */
public final class h extends q {

    /* renamed from: a, reason: collision with root package name */
    public final String f57195a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57196b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f57197c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f57198d;

    /* renamed from: e, reason: collision with root package name */
    public final oc.c f57199e;

    /* renamed from: f, reason: collision with root package name */
    public final se2.a f57200f;

    /* renamed from: g, reason: collision with root package name */
    public final s f57201g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String entityId, String nodeId, boolean z13, uk1.d presenterPinalytics, p1 moreOptionsAction, uj2.q networkStateStream, g0 pageSizeProvider, d2 graphQLLegoUserRepPresenterFactory, oc.c apolloClient, se2.a removeFollowerHandler) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(moreOptionsAction, "moreOptionsAction");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(graphQLLegoUserRepPresenterFactory, "graphQLLegoUserRepPresenterFactory");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(removeFollowerHandler, "removeFollowerHandler");
        this.f57195a = entityId;
        this.f57196b = nodeId;
        this.f57197c = z13;
        this.f57198d = moreOptionsAction;
        this.f57199e = apolloClient;
        this.f57200f = removeFollowerHandler;
        n nVar = new n(1);
        s sVar = new s(apolloClient, new ex.d(1, 16), g.f57192j, new e(this, 0), new e(this, 1), pageSizeProvider, new gi2.b(), nVar, 7808);
        sVar.o(1, new rk1.g(g.f57193k, presenterPinalytics, (l) null, graphQLLegoUserRepPresenterFactory, new b(this, 1), new e(this, 2), 60));
        this.f57201g = sVar;
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        if (this.f57197c) {
            xk1.e eVar = new xk1.e();
            eVar.u(2);
            ((i) dataSources).b(eVar);
        }
        ((i) dataSources).b(this.f57201g);
    }

    @Override // wk1.q, yk1.p
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public final void r3(c41.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        oc.a c13 = this.f57199e.c(new h0(this.f57196b));
        d7.b.E(c13, vc.f.CacheOnly);
        xj2.c F = j.b(d7.b.H0(c13)).F(new u(11, new d(this, 2)), new u(12, new d(this, 3)), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void u3(int i13) {
        fo1.a i73;
        m mVar = (m) ((c41.b) getView());
        mVar.getClass();
        if (com.bumptech.glide.d.G(mVar, "com.pinterest.EXTRAS_KEY_SHOW_TOOLBAR", false) && (i73 = mVar.i7()) != null) {
            Resources resources = mVar.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            ((GestaltToolbarImpl) i73).c0(kh2.g0.q(i13, resources), fm1.c.VISIBLE);
        }
        g41.g gVar = mVar.C0;
        if (gVar != null) {
            gVar.a(i13);
        }
    }
}
