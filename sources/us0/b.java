package us0;

import com.pinterest.feature.home.tuner.presenter.InterestTopicFollowedFilter;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import m60.w;
import wk1.i;
import wk1.q;
import wr0.y;

/* loaded from: classes5.dex */
public final class b extends q {

    /* renamed from: a, reason: collision with root package name */
    public final y f123079a;

    /* renamed from: b, reason: collision with root package name */
    public final y f123080b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(uk1.d pinalytics, uj2.q networkStateStream, w eventManager, g0 pageSizeProvider, boolean z13) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        this.f123079a = new y(getPresenterPinalytics(), networkStateStream, pageSizeProvider, z13 ? "users/me/interests/?limit=100&blend_type=nux" : "users/me/interests/favorited");
        this.f123080b = new y(getPresenterPinalytics(), networkStateStream, pageSizeProvider, "users/me/interests/?limit=100&blend_type=nux", new InterestTopicFollowedFilter());
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        xk1.e eVar = new xk1.e();
        eVar.u(2);
        i iVar = (i) dataSources;
        iVar.b(eVar);
        iVar.b(this.f123079a);
        iVar.b(this.f123080b);
    }
}
