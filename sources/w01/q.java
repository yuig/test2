package w01;

import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import h32.c1;
import h32.f1;
import h32.v0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class q implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public long f127096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinCloseupPresenter f127097b;

    public q(PinCloseupPresenter pinCloseupPresenter) {
        this.f127097b = pinCloseupPresenter;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull a11.x event) {
        String str;
        String str2;
        c82.a aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.f367a != null) {
            PinCloseupPresenter pinCloseupPresenter = this.f127097b;
            str = pinCloseupPresenter.pinUid;
            if (str.length() > 0) {
                str2 = pinCloseupPresenter.pinUid;
                if (Intrinsics.d(str2, event.f368b)) {
                    m60.u.f85943a.i(event);
                    pinCloseupPresenter.spamParams = event.f367a;
                    i01.t access$getView = PinCloseupPresenter.access$getView(pinCloseupPresenter);
                    aVar = pinCloseupPresenter.spamParams;
                    ((PinCloseupFragment) access$getView).K9(aVar);
                }
            }
        }
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.g event) {
        String str;
        i01.e eVar;
        String str2;
        c1 collectionEventData;
        Intrinsics.checkNotNullParameter(event, "event");
        String str3 = event.f84691i;
        PinCloseupPresenter pinCloseupPresenter = this.f127097b;
        str = pinCloseupPresenter.pinUid;
        if (Intrinsics.d(str3, str)) {
            m60.u.f85943a.i(event);
            long j13 = this.f127096a;
            long j14 = event.f84692j;
            long j15 = j14 - j13;
            eVar = pinCloseupPresenter.closeupNavigationMetadata;
            if (Intrinsics.d(eVar.e(), "shop_the_look_module")) {
                nx.d0 pinalytics = pinCloseupPresenter.getPinalytics();
                f1 f1Var = f1.COLLECTION_ITEM_CLICKTHROUGH_END;
                str2 = pinCloseupPresenter.pinUid;
                collectionEventData = pinCloseupPresenter.getCollectionEventData();
                v0 v0Var = new v0();
                v0Var.C = Long.valueOf(j14 - this.f127096a);
                pinalytics.H(f1Var, str2, collectionEventData, null, v0Var, false);
            }
            pinCloseupPresenter.saveToPreferenceIfLongClickthrough(j15);
        }
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.h event) {
        String str;
        i01.e eVar;
        String str2;
        c1 collectionEventData;
        Intrinsics.checkNotNullParameter(event, "event");
        String str3 = event.f84693i;
        PinCloseupPresenter pinCloseupPresenter = this.f127097b;
        str = pinCloseupPresenter.pinUid;
        if (Intrinsics.d(str3, str)) {
            m60.u.f85943a.i(event);
            long j13 = event.f84694j;
            this.f127096a = j13;
            eVar = pinCloseupPresenter.closeupNavigationMetadata;
            if (Intrinsics.d(eVar.e(), "shop_the_look_module")) {
                this.f127096a = j13;
                nx.d0 pinalytics = pinCloseupPresenter.getPinalytics();
                f1 f1Var = f1.COLLECTION_ITEM_CLICKTHROUGH;
                str2 = pinCloseupPresenter.pinUid;
                collectionEventData = pinCloseupPresenter.getCollectionEventData();
                pinalytics.u(f1Var, str2, collectionEventData, null, false);
            }
        }
    }
}
