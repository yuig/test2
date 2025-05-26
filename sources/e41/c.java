package e41;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import oa2.p;
import wk1.i;
import wk1.q;

/* loaded from: classes5.dex */
public final class c extends q {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f57185a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String userId, uk1.d presenterPinalytics, h0 h0Var, uj2.q networkStateStream, g0 pageSizeProvider, p legoUserRepPresenterFactory) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        this.f57185a = h0Var == null ? pk1.h.a(userId, pageSizeProvider, presenterPinalytics, legoUserRepPresenterFactory, true, new b(this, 0), null, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) : h0Var;
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f57185a);
    }
}
