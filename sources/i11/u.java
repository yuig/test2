package i11;

import h32.d4;
import jk2.e0;
import kotlin.jvm.internal.Intrinsics;
import lh0.z2;
import m60.w;
import x02.i2;
import x02.x0;
import x02.y;
import y01.p1;
import yk1.v;

/* loaded from: classes5.dex */
public final class u extends m {

    /* renamed from: l0, reason: collision with root package name */
    public final dl1.t f71055l0;

    /* renamed from: m0, reason: collision with root package name */
    public final ag1.b f71056m0;

    /* renamed from: n0, reason: collision with root package name */
    public final tb0.h f71057n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str, d4 viewType, boolean z13, String storyPinCreationEntryType, dl1.t storyPinRepository, ag1.b ideaPinComposeDataManager, tb0.h crashReporting, y boardFeedRepository, i2 pinRepository, x0 boardRepository, b60.b activeUserManager, uk1.d presenterPinalytics, uj2.q networkStateStream, w eventManager, v viewResources, z2 experiments, i92.k toastUtils, rg0.s experiences, zf0.f educationHelper, f21.e repinToProfileHelper, com.pinterest.feature.pin.r repinAnimationUtil, String str2) {
        super(boardFeedRepository, pinRepository, boardRepository, activeUserManager, presenterPinalytics, networkStateStream, eventManager, viewResources, experiments, toastUtils, experiences, educationHelper, repinToProfileHelper, repinAnimationUtil, str, viewType, Boolean.valueOf(z13), storyPinCreationEntryType, false, str2, false, false, 96);
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(storyPinCreationEntryType, "storyPinCreationEntryType");
        Intrinsics.checkNotNullParameter(storyPinRepository, "storyPinRepository");
        Intrinsics.checkNotNullParameter(ideaPinComposeDataManager, "ideaPinComposeDataManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
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
        this.f71055l0 = storyPinRepository;
        this.f71056m0 = ideaPinComposeDataManager;
        this.f71057n0 = crashReporting;
    }

    @Override // i11.m
    public final void U3(h11.d data) {
        Intrinsics.checkNotNullParameter(data, "data");
        e0 M = ((dl1.l) this.f71055l0).M(this.f71056m0.d());
        hk2.b bVar = new hk2.b(new c(9, new ky0.b(23, data, this)), new c(10, new p1(this, 5)), ck2.i.f27923c);
        M.f(bVar);
        Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
        addDisposable(bVar);
        if (isBound()) {
            ((l11.j) ((f11.d) getView())).dismiss();
        }
    }

    @Override // i11.m
    public final boolean Z3() {
        return false;
    }
}
