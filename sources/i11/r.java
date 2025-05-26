package i11;

import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.m3;
import h32.d4;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import lh0.z2;
import m60.w;
import x02.i2;
import x02.x0;
import x02.y;
import y01.p1;
import yk1.v;

/* loaded from: classes5.dex */
public final class r extends m {

    /* renamed from: l0, reason: collision with root package name */
    public final String f71048l0;

    /* renamed from: m0, reason: collision with root package name */
    public final String f71049m0;

    /* renamed from: n0, reason: collision with root package name */
    public final String f71050n0;

    /* renamed from: o0, reason: collision with root package name */
    public final ArrayList f71051o0;

    /* renamed from: p0, reason: collision with root package name */
    public final int f71052p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(d4 viewType, String pinClusterId, String deselectedPinIdsString, String suggestedBoardName, ArrayList clusterPinTypes, int i13, y boardFeedRepository, i2 pinRepository, x0 boardRepository, b60.b activeUserManager, uk1.d presenterPinalytics, uj2.q networkStateStream, w eventManager, v viewResources, z2 experiments, i92.k toastUtils, rg0.s experiences, zf0.f educationHelper, f21.e repinToProfileHelper, com.pinterest.feature.pin.r repinAnimationUtil) {
        super(boardFeedRepository, pinRepository, boardRepository, activeUserManager, presenterPinalytics, networkStateStream, eventManager, viewResources, experiments, toastUtils, experiences, educationHelper, repinToProfileHelper, repinAnimationUtil, null, viewType, Boolean.FALSE, null, true, null, false, false, 96);
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(pinClusterId, "pinClusterId");
        Intrinsics.checkNotNullParameter(deselectedPinIdsString, "deselectedPinIdsString");
        Intrinsics.checkNotNullParameter(suggestedBoardName, "suggestedBoardName");
        Intrinsics.checkNotNullParameter(clusterPinTypes, "clusterPinTypes");
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
        this.f71048l0 = pinClusterId;
        this.f71049m0 = deselectedPinIdsString;
        this.f71050n0 = suggestedBoardName;
        this.f71051o0 = clusterPinTypes;
        this.f71052p0 = i13;
    }

    @Override // i11.m
    public final void M3(String str, String boardName, String str2) {
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        if (str != null) {
            d4(str, boardName);
        }
    }

    @Override // i11.m, f11.c
    public final void U0() {
        f11.d dVar = (f11.d) getViewIfBound();
        if (dVar == null) {
            return;
        }
        this.N.m(null, this.S, this.R, null);
        l11.j jVar = (l11.j) dVar;
        ig1.b.K0(jVar.J1, jVar.getView(), false, jVar.requireContext());
        String boardName = jVar.H1;
        if (boardName.length() == 0) {
            boardName = this.f71050n0;
        }
        d4 viewType = jVar.getF75509a1();
        String pinClusterId = this.f71048l0;
        Intrinsics.checkNotNullParameter(pinClusterId, "pinClusterId");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        String deselectedPinIdsString = this.f71049m0;
        Intrinsics.checkNotNullParameter(deselectedPinIdsString, "deselectedPinIdsString");
        ArrayList<Integer> clusterPinTypes = this.f71051o0;
        Intrinsics.checkNotNullParameter(clusterPinTypes, "clusterPinTypes");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        NavigationImpl w13 = Navigation.w1(m3.g());
        w13.m0("com.pinterest.EXTRA_CLUSTER_ID", pinClusterId);
        w13.Y1("is_from_auto_organize", true);
        w13.m0("com.pinterest.EXTRA_BOARD_NAME", boardName);
        w13.m0("com.pinterest.EXTRA_AUTO_ORGANIZE_VIEW_TYPE", viewType.name());
        w13.m0("com.pinterest.EXTRA_DESELECTED_PIN_IDS_LIST", deselectedPinIdsString);
        w13.f49942d.putIntegerArrayList("cluster_pin_types", clusterPinTypes);
        jVar.M1(w13);
    }

    @Override // i11.m
    public final void U3(h11.d data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String str = data.f66457a;
        if (str != null) {
            d4(str, data.f66458b);
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

    public final void d4(String str, String str2) {
        addDisposable(c0.d.o(this.f70995d, this.f71048l0, str, this.f71049m0).i(new xo.c((Object) this, (Object) str, str2, 14), new c(8, new p1(this, 4))));
    }
}
