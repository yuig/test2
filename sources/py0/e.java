package py0;

import ao2.j0;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.w0;
import kotlin.collections.r0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import lh0.j2;
import nx.b0;
import nx.d1;
import nx.o0;
import u50.r;
import x02.i2;
import zy.d0;
import zy.e0;

/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f101737a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f101738b;

    public e(qy0.b nuxSharedStateRepository, i2 pinRepository, d1 trackingParamAttacher, b0 pinAuxHelper, d0 pinalyticsSEP, o0 pinalyticsManager, j2 experiments) {
        Intrinsics.checkNotNullParameter(nuxSharedStateRepository, "nuxSharedStateRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f101737a = pinalyticsSEP;
        this.f101738b = pinalyticsManager;
    }

    @Override // l82.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(j0 scope, c request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (!(request instanceof b)) {
            if (request instanceof a) {
                String str = ((a) request).f101733a;
                return;
            }
            return;
        }
        b bVar = (b) request;
        f30 pin = bVar.f101734a;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pin, "pin");
        f1 f1Var = f1.TIMED_PAIR_END;
        String uid = pin.getUid();
        z0.d();
        Boolean bool = Boolean.FALSE;
        r0 d2 = z0.d();
        zn2.a aVar = zn2.b.f142311b;
        this.f101737a.e(scope, new e0(new zy.a(new i0(d4.PIN, bVar.f101735b, null, g0.PIN_CLOSEUP_BODY, null, null), f1Var, uid, null, null, new w0(null, null, null, null, d2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, bool, null, null, Long.valueOf(zn2.b.f(dl2.b.P2(10, zn2.d.SECONDS))), null, null, null, null, null, null, null, null), false, false, RecyclerViewTypes.VIEW_TYPE_MESSAGES_HEADER)), d.f101736a);
        this.f101738b.c();
    }
}
