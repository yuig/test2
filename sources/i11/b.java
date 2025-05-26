package i11;

import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import lh0.z2;
import m60.w;
import x02.i2;
import x02.x0;
import x02.y;
import yk1.v;

/* loaded from: classes5.dex */
public final class b extends m {

    /* renamed from: l0, reason: collision with root package name */
    public final g70.h f70963l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d4 viewType, y boardFeedRepository, i2 pinRepository, x0 boardRepository, b60.b activeUserManager, uk1.d presenterPinalytics, uj2.q networkStateStream, w eventManager, v viewResources, z2 experiments, i92.k toastUtils, rg0.s experiences, zf0.f educationHelper, f21.e repinToProfileHelper, com.pinterest.feature.pin.r repinAnimationUtil, g70.h boardNavigator) {
        super(boardFeedRepository, pinRepository, boardRepository, activeUserManager, presenterPinalytics, networkStateStream, eventManager, viewResources, experiments, toastUtils, experiences, educationHelper, repinToProfileHelper, repinAnimationUtil, null, viewType, Boolean.FALSE, null, false, null, false, false, 96);
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(boardFeedRepository, "boardFeedRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(educationHelper, "educationHelper");
        Intrinsics.checkNotNullParameter(repinToProfileHelper, "repinToProfileHelper");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f70963l0 = boardNavigator;
    }

    @Override // i11.m
    public final String H3(int i13) {
        if (i13 != 0) {
            return null;
        }
        return ((yk1.a) this.f71003h).f139224a.getString(e02.e.your_boards);
    }

    @Override // i11.m
    public final void U3(h11.d data) {
        String str;
        Intrinsics.checkNotNullParameter(data, "data");
        if (!data.f66462f && (str = data.f66457a) != null) {
            g70.h.g(this.f70963l0, str, null, a.f70955j, 2);
        }
        this.f71001g.d(new q70.a());
        if (isBound()) {
            l11.j jVar = (l11.j) ((f11.d) getView());
            jVar.K1 = true;
            jVar.dismiss();
        }
    }

    @Override // i11.m
    public final boolean X3() {
        return false;
    }

    @Override // i11.m
    public final boolean Y3() {
        return false;
    }

    @Override // i11.m
    public final boolean Z3() {
        return false;
    }
}
