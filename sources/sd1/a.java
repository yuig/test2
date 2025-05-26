package sd1;

import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import id1.g;
import id1.h;
import if1.b;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import lh0.f4;
import nr0.m;
import oa2.p;
import uk1.e;
import uk2.f;
import wt1.c0;
import wt1.d0;
import x02.x2;
import xk2.v;
import yk1.n;
import ze1.d;

/* loaded from: classes5.dex */
public final class a extends g {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f112310j = 1;

    /* renamed from: k, reason: collision with root package name */
    public final e f112311k;

    /* renamed from: l, reason: collision with root package name */
    public final v f112312l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f112313m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f112314n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f112315o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h presenterParams, m dynamicGridViewBinderDelegateFactory, String userId, String str, f feedLoadedSubject, e presenterPinalyticsFactory, x2 userRepository, p legoUserRepPresenterFactory) {
        super(presenterParams, dynamicGridViewBinderDelegateFactory, legoUserRepPresenterFactory);
        Intrinsics.checkNotNullParameter(presenterParams, "presenterParams");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(feedLoadedSubject, "feedLoadedSubject");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        this.f112313m = userId;
        this.f112314n = str;
        this.f112315o = feedLoadedSubject;
        this.f112311k = presenterPinalyticsFactory;
        this.f112312l = xk2.m.b(new p91.v(16, this, userRepository));
    }

    @Override // wk1.q
    public final void onStateUpdated(c0 state, d0 remoteList) {
        switch (this.f112310j) {
            case 1:
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(remoteList, "remoteList");
                super.onStateUpdated(state, remoteList);
                boolean z13 = v3().f49127q.size() == 0;
                if (isBound() && (state instanceof wt1.p)) {
                    n view = getView();
                    Intrinsics.g(view, "null cannot be cast to non-null type com.pinterest.feature.shopping.wishlist.WishlistContract.WishlistFeedView");
                    PinterestEmptyStateLayout pinterestEmptyStateLayout = ((b) ((ff1.a) view)).f139733g0;
                    if (pinterestEmptyStateLayout != null) {
                        pinterestEmptyStateLayout.f(z13);
                    }
                    ((f) this.f112315o).c(Boolean.valueOf(!z13));
                    break;
                }
                break;
            default:
                super.onStateUpdated(state, remoteList);
                break;
        }
    }

    @Override // id1.g
    public final hd1.b v3() {
        int i13 = this.f112310j;
        v vVar = this.f112312l;
        switch (i13) {
        }
        return (hd1.b) vVar.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h params, d navigationExtraContext, m dynamicGridViewBinderDelegateFactory, e presenterPinalyticsFactory, f4 experiments, p legoUserRepPresenterFactory, r prefsManagerUser) {
        super(params, dynamicGridViewBinderDelegateFactory, legoUserRepPresenterFactory);
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(navigationExtraContext, "navigationExtraContext");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f112313m = navigationExtraContext;
        this.f112311k = presenterPinalyticsFactory;
        this.f112314n = experiments;
        this.f112315o = prefsManagerUser;
        this.f112312l = xk2.m.b(new h81.b(this, 25));
    }
}
