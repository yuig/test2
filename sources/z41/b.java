package z41;

import com.pinterest.framework.multisection.datasource.pagedlist.f;
import h32.u0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import m60.w;
import nr0.e;
import nr0.m;
import r70.j;
import so.n6;
import wa2.i;
import wk1.c;
import wk1.n;
import x41.d;

/* loaded from: classes5.dex */
public final class b extends n implements d {

    /* renamed from: a, reason: collision with root package name */
    public final x41.a f140844a;

    /* renamed from: b, reason: collision with root package name */
    public final w f140845b;

    /* renamed from: c, reason: collision with root package name */
    public final y41.a f140846c;

    /* renamed from: d, reason: collision with root package name */
    public final i f140847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x41.a recentPinActionType, w eventManager, g0 pageSizeProvider, c gridParams, m dynamicGridViewBinderDelegateFactory) {
        super(gridParams);
        String str;
        Intrinsics.checkNotNullParameter(recentPinActionType, "recentPinActionType");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(gridParams, "gridParams");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        this.f140844a = recentPinActionType;
        this.f140845b = eventManager;
        int i13 = a.f140843a[recentPinActionType.ordinal()];
        if (i13 == 1) {
            str = "users/me/pins/";
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "users/me/recent/engaged/pins/";
        }
        uk1.d presenterPinalytics = getPresenterPinalytics();
        qa2.n nVar = gridParams.f130131b;
        this.f140846c = new y41.a(recentPinActionType, str, ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics, nVar.f103320a, nVar, gridParams.f130137h), pageSizeProvider);
        this.f140847d = gridParams.f130131b.f103320a;
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        f fVar = new f(this.f140846c, 14);
        fVar.g(743292);
        ((wk1.i) dataSources).b(fVar);
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(x41.c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((e) view);
        a51.d dVar = (a51.d) view;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        dVar.R0 = this;
        i iVar = this.f140847d;
        iVar.f128803w = false;
        if (this.f140844a == x41.a.RECENTLY_SAVED) {
            iVar.f128804x = true;
            iVar.f128805y = false;
        }
    }

    public final void v3() {
        getPinalytics().X(u0.SEARCH_BUTTON);
        u70.a aVar = u70.a.SEARCH;
        this.f140845b.d(new j(aVar, aVar.ordinal()));
    }
}
