package lr0;

import androidx.recyclerview.widget.b2;
import com.pinterest.api.model.Feed;
import kotlin.jvm.internal.Intrinsics;
import oa2.p;
import pk.a0;
import sq0.c0;
import sq0.e0;
import uj2.q;
import uk1.d;
import uq0.h;
import vq0.e;
import vq0.g;
import x02.u2;
import yk1.i;
import yk1.r;

/* loaded from: classes5.dex */
public final class b extends g implements e {

    /* renamed from: b, reason: collision with root package name */
    public final h f84575b;

    /* renamed from: c, reason: collision with root package name */
    public Feed f84576c;

    /* renamed from: d, reason: collision with root package name */
    public a f84577d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84578e;

    /* renamed from: f, reason: collision with root package name */
    public final int f84579f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String feedId, int i13, d pinalytics, u2 userFeedRepository, q networkStateStream, p legoUserRepPresenterFactory) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(feedId, "feedId");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(userFeedRepository, "userFeedRepository");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        this.f84575b = userFeedRepository;
        this.f84578e = feedId;
        this.f84579f = i13;
        this.f126436a.j(0, new rk1.g(pinalytics, legoUserRepPresenterFactory));
    }

    @Override // sq0.e0
    public final int a() {
        Feed feed = this.f84576c;
        if (feed != null) {
            return feed.n();
        }
        return 0;
    }

    @Override // yk1.p
    public final void bindPinalytics(r rVar) {
        c0 c0Var = (c0) rVar;
        getPresenterPinalytics().c(c0Var.getF87513d1(), c0Var.getF98673x0(), null);
    }

    @Override // vq0.e, nr0.a
    public final Object getItem(int i13) {
        Feed feed = this.f84576c;
        if (feed == null || i13 >= feed.n()) {
            return null;
        }
        return this.f84576c.k(i13);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 0;
    }

    @Override // vq0.g
    public final void loadData() {
        super.loadData();
        String[] strArr = {this.f84578e};
        a aVar = this.f84577d;
        if (aVar != null) {
            aVar.dispose();
            this.f84577d = null;
        }
        this.f84577d = new a(this, false);
        this.f84575b.f(strArr, this.f84579f).d(this.f84577d);
    }

    @Override // vq0.g, sq0.w
    public final void loadMoreData() {
        if (this.f84576c != null) {
            a aVar = this.f84577d;
            if (aVar != null) {
                aVar.dispose();
                this.f84577d = null;
            }
            this.f84577d = new a(this, true);
            this.f84575b.h(this.f84579f, this.f84576c).d(this.f84577d);
        }
    }

    @Override // vq0.g, yk1.p, yk1.b
    public final void onUnbind() {
        a aVar = this.f84577d;
        if (aVar != null) {
            aVar.dispose();
            this.f84577d = null;
        }
        super.onUnbind();
    }

    @Override // vq0.g
    public final e0 p3() {
        return this;
    }

    @Override // vq0.g
    public final void s3(boolean z13) {
        super.s3(z13);
        c0 c0Var = (c0) getView();
        Feed feed = this.f84576c;
        c0Var.setShowPaginationSpinner((feed == null || a0.x0(feed.s())) ? false : true);
    }

    @Override // vq0.g
    public final boolean t3() {
        Feed feed = this.f84576c;
        if (feed == null || feed.n() <= 0) {
            return true;
        }
        this.f84576c.B();
        this.f84576c = this.f84576c;
        c0 c0Var = (c0) getView();
        i iVar = i.LOADED;
        c0Var.setLoadState(iVar);
        ((b2) getAdapter()).h();
        ((c0) getView()).setLoadState(iVar);
        return false;
    }

    @Override // yk1.p
    public final void unbindPinalytics() {
        getPresenterPinalytics().k();
    }
}
