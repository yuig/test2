package er0;

import com.pinterest.api.model.f30;
import cr0.k;
import java.util.List;
import kh2.p2;
import kotlin.jvm.internal.Intrinsics;
import lh0.a0;
import m60.w;
import uj2.q;
import uk1.e;

/* loaded from: classes5.dex */
public final class d extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f59967e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final b60.b f59968f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b60.b activeUserManager, w eventManager, a0 experiments, uk1.d presenterPinalytics, q networkStateStream, List viewTypes) {
        super(activeUserManager, eventManager, experiments, presenterPinalytics, networkStateStream, viewTypes);
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(viewTypes, "viewTypes");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f59968f = activeUserManager;
    }

    public final boolean t3() {
        int i13 = this.f59967e;
        b60.b bVar = this.f59968f;
        switch (i13) {
            case 0:
                f30 f30Var = this.f59965d;
                if (f30Var != null) {
                    return p2.Z0(f30Var, ((b60.d) bVar).f(), a.DEFAULT);
                }
                Intrinsics.r("pin");
                throw null;
            default:
                f30 f30Var2 = this.f59965d;
                if (f30Var2 != null) {
                    return p2.Z0(f30Var2, ((b60.d) bVar).f(), a.VIDEO);
                }
                Intrinsics.r("pin");
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a0 experiments, e presenterPinalyticsFactory, q networkStateStream, w eventManager, k viewTypes, b60.b activeUserManager) {
        super(activeUserManager, eventManager, experiments, ((uk1.a) presenterPinalyticsFactory).g(), networkStateStream, viewTypes);
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(viewTypes, "viewTypes");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f59968f = activeUserManager;
    }
}
