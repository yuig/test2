package gr0;

import com.pinterest.api.model.yc0;
import kotlin.jvm.internal.Intrinsics;
import ni0.f;
import qx.c;
import sq0.e0;
import tb0.h;
import uj2.q;
import uk1.e;
import vq0.d;
import yk1.j;

/* loaded from: classes5.dex */
public final class b extends d {

    /* renamed from: c, reason: collision with root package name */
    public final String f65989c;

    /* renamed from: d, reason: collision with root package name */
    public final c f65990d;

    /* renamed from: e, reason: collision with root package name */
    public final dr0.a f65991e;

    /* renamed from: f, reason: collision with root package name */
    public final h f65992f;

    /* renamed from: g, reason: collision with root package name */
    public yc0 f65993g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String aggregatePinUid, c interactor, dr0.a nextPageInteractor, h crashReporting, q networkStateStream, j mvpBinder, e presenterPinalyticsFactory, g70.h boardNavigator) {
        super(((uk1.a) presenterPinalyticsFactory).d(aggregatePinUid), networkStateStream);
        Intrinsics.checkNotNullParameter(aggregatePinUid, "aggregatePinUid");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(nextPageInteractor, "nextPageInteractor");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f65989c = aggregatePinUid;
        this.f65990d = interactor;
        this.f65991e = nextPageInteractor;
        this.f65992f = crashReporting;
        this.f126436a.j(43, new f(mvpBinder, boardNavigator));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return getItem(i13) != null ? 43 : -2;
    }

    @Override // vq0.g
    public final void loadData() {
        super.loadData();
        String str = this.f65989c;
        if (str.length() == 0) {
            vb0.j.f125466a.S(false, "SavedBoardsPresenter called without a valid aggregatePinUid", new Object[0]);
            return;
        }
        v3();
        clearDisposables();
        addDisposable(this.f65990d.prepare(str).execute((ak2.e) new a(this, 2), (ak2.e) new a(this, 3)));
    }

    @Override // vq0.g, sq0.w
    public final void loadMoreData() {
        yc0 yc0Var = this.f65993g;
        clearDisposables();
        addDisposable(this.f65991e.prepare(yc0Var).execute((ak2.e) new a(this, 0), (ak2.e) new a(this, 1)));
    }

    @Override // vq0.g
    public final e0 p3() {
        return this;
    }
}
