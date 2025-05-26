package rq;

import com.pinterest.activity.pin.view.modules.PinCloseupVideoModule;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s4 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinCloseupVideoModule f109545a;

    public s4(PinCloseupVideoModule pinCloseupVideoModule) {
        this.f109545a = pinCloseupVideoModule;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dc2.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f109545a.hasUserManuallyToggledMuteState = true;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dc2.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f109545a.hasUserManuallyToggledMuteState = true;
    }
}
