package b11;

import android.content.Context;
import android.widget.RelativeLayout;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import i32.y0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class v implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinCloseupFragment f21088a;

    public v(PinCloseupFragment pinCloseupFragment) {
        this.f21088a = pinCloseupFragment;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.c0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.f100055b) {
            PinCloseupFragment pinCloseupFragment = this.f21088a;
            se2.a aVar = pinCloseupFragment.f47005l1;
            if (aVar == null) {
                Intrinsics.r("pinReactionUtils");
                throw null;
            }
            d21.a aVar2 = (d21.a) ((bf2.b) aVar).get();
            RelativeLayout relativeLayout = pinCloseupFragment.F2;
            if (relativeLayout == null) {
                Intrinsics.r("reactionAnimationOverlay");
                throw null;
            }
            Context w93 = pinCloseupFragment.w9();
            aVar2.getClass();
            d21.a.a(event.f100054a, relativeLayout, w93);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.j0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f100074b;
        PinCloseupFragment pinCloseupFragment = this.f21088a;
        i01.b bVar = pinCloseupFragment.f47011n2;
        if (Intrinsics.d(str, bVar != null ? bVar.getPinUid() : null)) {
            if (event.f100073a == y32.f.CLOSEUP.getValue()) {
                ur0.g.g(y0.ANDROID_PIN_CLOSEUP_AFTER_SHARE, pinCloseupFragment, null);
            }
        }
    }
}
