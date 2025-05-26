package dh1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nr0.m;
import so.n6;
import uj2.q;
import wk1.i;
import wk1.n;
import x02.x2;

/* loaded from: classes5.dex */
public final class f extends n {

    /* renamed from: a, reason: collision with root package name */
    public final ch1.d f55007a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(wk1.c params, int i13, boolean z13, yk1.a viewResources, uk1.d presenterPinalytics, q networkStateStream, x2 userRepository, m dynamicGridViewBinderDelegateFactory, w eventManager) {
        super(params);
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        qa2.n nVar = params.f130131b;
        this.f55007a = new ch1.d(i13, z13, viewResources, presenterPinalytics, networkStateStream, ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics, nVar.f103320a, nVar, params.f130137h), userRepository, eventManager);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        com.pinterest.framework.multisection.datasource.pagedlist.f fVar = new com.pinterest.framework.multisection.datasource.pagedlist.f(this.f55007a, 14);
        fVar.g(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_FOOTER);
        ((i) dataSources).b(fVar);
    }

    @Override // wk1.q, yk1.b
    public final void onActivate() {
        p3();
        if (getDataSourceProvider().a() <= 1) {
            super.loadData();
        }
    }

    @Override // wk1.q
    public final boolean shouldLoadDataOnBind() {
        return false;
    }
}
