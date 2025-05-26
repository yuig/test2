package zt0;

import android.content.Context;
import au0.d;
import com.pinterest.api.model.zv0;
import com.pinterest.feature.settings.notifications.y0;
import dl1.l;
import dl1.t;
import hk2.h;
import java.util.ArrayList;
import java.util.List;
import jk2.e0;
import jk2.j1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import ou0.k;
import sq0.p;
import tk2.e;
import uj2.b0;
import uj2.q;
import uk2.f;
import wb1.n;
import we1.f2;
import x02.x2;
import xk1.c;
import xv.g;

/* loaded from: classes5.dex */
public final class b extends c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f142765k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Object f142766l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f142767m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String localDataId, t localDataRepository, du0.b presenterPinalytics, d editListener, d navigationListener, k saveChangeListener, d recentStylesProvider) {
        super(null);
        Intrinsics.checkNotNullParameter(localDataId, "localDataId");
        Intrinsics.checkNotNullParameter(localDataRepository, "localDataRepository");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(editListener, "editListener");
        Intrinsics.checkNotNullParameter(navigationListener, "navigationListener");
        Intrinsics.checkNotNullParameter(saveChangeListener, "saveChangeListener");
        Intrinsics.checkNotNullParameter(recentStylesProvider, "recentStylesProvider");
        this.f142766l = localDataId;
        this.f142767m = localDataRepository;
        o(4, new bu0.a(presenterPinalytics, editListener, navigationListener, recentStylesProvider, saveChangeListener));
    }

    @Override // xk1.c, vq0.e, qr0.d
    public final List d() {
        ArrayList arrayList = this.f135191h;
        switch (this.f142765k) {
        }
        return CollectionsKt.F0(arrayList);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        switch (this.f142765k) {
            case 0:
                return 4;
            case 1:
                return ((n) d().get(i13)).f129039e;
            default:
                Object item = getItem(i13);
                zv0 zv0Var = item instanceof zv0 ? (zv0) item : null;
                return com.pinterest.feature.todaytab.tab.view.n.a((zv0Var != null ? zv0Var.L() : 0).intValue());
        }
    }

    @Override // xk1.c
    public final q k() {
        int i13 = this.f142765k;
        Object obj = this.f142767m;
        Object obj2 = this.f142766l;
        switch (i13) {
            case 0:
                j1 j1Var = new j1(((l) ((t) obj)).S((String) obj2), new wr0.l(17, a.f142764i), 0);
                Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
                return j1Var;
            case 1:
                q j13 = new h(new e0(((x2) obj2).d0().Q("me")), new t81.a(22, new y0(this, 12)), 1).j();
                Intrinsics.checkNotNullExpressionValue(j13, "toObservable(...)");
                return j13;
            default:
                j1 j1Var2 = new j1(((b0) ((js0.c) obj).b(new bh1.b((String) obj2)).buildRequest()).r(e.f118017c).u(), new ic1.a(20, bh1.a.f22805i), 0);
                Intrinsics.checkNotNullExpressionValue(j1Var2, "map(...)");
                return j1Var2;
        }
    }

    @Override // xk1.c
    public final void u(List itemsToSet) {
        switch (this.f142765k) {
            case 2:
                Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
                int size = d().size();
                int size2 = itemsToSet.size();
                super.u(itemsToSet);
                if (size == 0 && size2 == 0) {
                    q K1 = K1();
                    f fVar = K1 instanceof f ? (f) K1 : null;
                    if (fVar != null) {
                        fVar.c(new p(0, 0));
                        break;
                    }
                }
                break;
            default:
                super.u(itemsToSet);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String articleId, uk1.d presenterPinalytics, q networkStateStream, x2 userRepository, w20.a todayTabService, w eventManager) {
        super(null);
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(todayTabService, "todayTabService");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f142766l = articleId;
        this.f142767m = new js0.c(todayTabService);
        c(com.pinterest.feature.todaytab.tab.view.n.f48737a, new g(eventManager, presenterPinalytics, userRepository, networkStateStream));
        o(-2, new f2(16));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x2 userRepository, Context context) {
        super(null);
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f142766l = userRepository;
        this.f142767m = context;
        o(17, new wb1.p(this, 0));
        o(22, new wb1.p(this, 1));
    }
}
