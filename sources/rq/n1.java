package rq;

import com.pinterest.activity.pin.view.modules.PinCloseupLegoActionButtonModule;
import com.pinterest.feature.sharesheet.view.AnimatedSendShareButton;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class n1 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinCloseupLegoActionButtonModule f109396a;

    public n1(PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule) {
        this.f109396a = pinCloseupLegoActionButtonModule;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull cb2.a0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule = this.f109396a;
        AnimatedSendShareButton animatedSendShareButton = pinCloseupLegoActionButtonModule.f35027r;
        if (animatedSendShareButton != null) {
            if (animatedSendShareButton == null) {
                Intrinsics.r("sendIconButton");
                throw null;
            }
            animatedSendShareButton.T();
        }
        AnimatedSendShareButton animatedSendShareButton2 = pinCloseupLegoActionButtonModule.f35028s;
        if (animatedSendShareButton2 != null) {
            animatedSendShareButton2.T();
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull fd1.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule = this.f109396a;
        AnimatedSendShareButton animatedSendShareButton = pinCloseupLegoActionButtonModule.f35027r;
        if (animatedSendShareButton != null) {
            if (animatedSendShareButton == null) {
                Intrinsics.r("sendIconButton");
                throw null;
            }
            animatedSendShareButton.T();
        }
        AnimatedSendShareButton animatedSendShareButton2 = pinCloseupLegoActionButtonModule.f35028s;
        if (animatedSendShareButton2 != null) {
            animatedSendShareButton2.T();
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull x70.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule = this.f109396a;
        AnimatedSendShareButton animatedSendShareButton = pinCloseupLegoActionButtonModule.f35027r;
        if (animatedSendShareButton != null) {
            if (animatedSendShareButton == null) {
                Intrinsics.r("sendIconButton");
                throw null;
            }
            animatedSendShareButton.T();
        }
        AnimatedSendShareButton animatedSendShareButton2 = pinCloseupLegoActionButtonModule.f35028s;
        if (animatedSendShareButton2 != null) {
            animatedSendShareButton2.T();
        }
    }
}
