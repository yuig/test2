package ru1;

import com.pinterest.navigation.view.lego.LegoFloatingBottomNavBar;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class t implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegoFloatingBottomNavBar f110082a;

    public t(LegoFloatingBottomNavBar legoFloatingBottomNavBar) {
        this.f110082a = legoFloatingBottomNavBar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull fv1.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        LegoFloatingBottomNavBar.t(this.f110082a);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull r70.l showBadgeOnTabEvent) {
        Intrinsics.checkNotNullParameter(showBadgeOnTabEvent, "showBadgeOnTabEvent");
        int i13 = LegoFloatingBottomNavBar.N;
        LegoFloatingBottomNavBar legoFloatingBottomNavBar = this.f110082a;
        legoFloatingBottomNavBar.getClass();
        int i14 = legoFloatingBottomNavBar.i((u70.a) showBadgeOnTabEvent.f92902b);
        if (legoFloatingBottomNavBar.E(i14)) {
            ((i) ((y) legoFloatingBottomNavBar.f49958f.get(i14))).m(showBadgeOnTabEvent.f106396c);
        }
    }
}
