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
public final class s extends m {

    /* renamed from: l0, reason: collision with root package name */
    public final String f71053l0;

    /* renamed from: m0, reason: collision with root package name */
    public final boolean f71054m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String pinId, d4 viewType, String str, boolean z13, uk1.d pinalytics, y feedRepository, i2 pinRepository, x0 boardRepository, b60.b activeUserManager, uj2.q networkStateStream, w eventManager, v viewResources, z2 experiments, i92.k toastUtils, rg0.s experiences, zf0.f educationHelper, f21.e repinToProfileHelper, com.pinterest.feature.pin.r repinAnimationUtil) {
        super(feedRepository, pinRepository, boardRepository, activeUserManager, pinalytics, networkStateStream, eventManager, viewResources, experiments, toastUtils, experiences, educationHelper, repinToProfileHelper, repinAnimationUtil, pinId, viewType, null, null, false, null, false, z13, 64);
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(feedRepository, "feedRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(educationHelper, "educationHelper");
        Intrinsics.checkNotNullParameter(repinToProfileHelper, "repinToProfileHelper");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        this.f71053l0 = str;
        this.f71054m0 = z13;
        this.O = false;
    }

    @Override // i11.m
    public final void T3() {
        if (this.f71053l0 != null) {
            this.f71001g.f(new org.chromium.net.y());
        }
        if (isBound()) {
            l11.j jVar = (l11.j) ((f11.d) getView());
            jVar.K1 = true;
            jVar.dismiss();
        }
    }

    @Override // i11.m
    public final void U3(h11.d data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String str = data.f66457a;
        if (str != null && str.length() != 0) {
            String str2 = this.f71053l0;
            w wVar = this.f71001g;
            String str3 = data.f66458b;
            if (str2 != null) {
                wVar.f(new kp1.b(str3, str));
            } else {
                wVar.f(new f11.i(str, str3));
            }
        }
        if (isBound()) {
            l11.j jVar = (l11.j) ((f11.d) getView());
            jVar.K1 = true;
            jVar.dismiss();
        }
    }

    @Override // i11.m
    public final boolean Z3() {
        return this.f71054m0 && this.f71053l0 != null;
    }
}
