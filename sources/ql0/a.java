package ql0;

import b60.d;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import gd0.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l61.g;
import m60.g0;
import nx.d0;
import oa2.p;
import pk1.c;
import pl0.b;
import r41.k;
import uk1.e;
import wk1.i;
import wk1.q;

/* loaded from: classes5.dex */
public final class a extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104068a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f104069b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String pinId, g0 pageSizeProvider, e presenterPinalyticsFactory, uj2.q networkStateStream) {
        super(((uk1.a) presenterPinalyticsFactory).g(), networkStateStream);
        k profileNavigator = k.f106176a;
        this.f104068a = 0;
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(profileNavigator, "profileNavigator");
        d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        this.f104069b = new b(pinId, pageSizeProvider, d0Var);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        int i13 = this.f104068a;
        Object obj = this.f104069b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(dataSources, "dataSources");
                ((i) dataSources).b((h0) obj);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(dataSources, "dataSources");
                ((i) dataSources).b((c) obj);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(dataSources, "dataSources");
                ((i) dataSources).b((r51.a) obj);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(dataSources, "dataSources");
                ((i) dataSources).b((g) obj);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(dataSources, "dataSources");
                ((i) dataSources).b(new ja1.e(1, ((d) ((b60.b) obj)).f()));
                break;
            default:
                Intrinsics.checkNotNullParameter(dataSources, "dataSources");
                h hVar = new h();
                List items = (List) obj;
                Intrinsics.checkNotNullParameter(items, "items");
                hVar.k(items);
                ((i) dataSources).b(hVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String userId, uk1.d presenterPinalytics, uj2.q networkStateStream, g0 pageSizeProvider, p legoUserRepPresenterFactory) {
        super(presenterPinalytics, networkStateStream);
        this.f104068a = 1;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        this.f104069b = pk1.h.a(userId, pageSizeProvider, presenterPinalytics, legoUserRepPresenterFactory, false, null, new us0.a(presenterPinalytics, 0), RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ArrayList actionSheetItems, uk1.d pinalytics, uj2.q networkStateStream) {
        super(pinalytics, networkStateStream);
        this.f104068a = 5;
        Intrinsics.checkNotNullParameter(actionSheetItems, "actionSheetItems");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f104069b = actionSheetItems;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(uk1.d pinalytics, uj2.q networkStateStream) {
        super(pinalytics, networkStateStream);
        this.f104068a = 3;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f104069b = new g(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(uk1.d pinalytics, uj2.q networkStateStream, a12.d aggregatedCommentService, String unifiedCommentModelType, String unifiedCommentUid, List prefetchedReportReasons) {
        super(pinalytics, networkStateStream);
        this.f104068a = 2;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(aggregatedCommentService, "aggregatedCommentService");
        Intrinsics.checkNotNullParameter(unifiedCommentModelType, "unifiedCommentModelType");
        Intrinsics.checkNotNullParameter(unifiedCommentUid, "unifiedCommentUid");
        Intrinsics.checkNotNullParameter(prefetchedReportReasons, "prefetchedReportReasons");
        this.f104069b = new r51.a(aggregatedCommentService, unifiedCommentModelType, unifiedCommentUid, prefetchedReportReasons);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(uk1.d pinalytics, uj2.q networkStateStream, b60.b activeUserManager) {
        super(pinalytics, networkStateStream);
        this.f104068a = 4;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f104069b = activeUserManager;
    }
}
