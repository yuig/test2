package ab2;

import com.pinterest.api.model.f30;
import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import com.pinterest.video.core.view.PinterestVideoView;
import ek1.a2;
import kotlin.jvm.internal.Intrinsics;
import m60.s0;
import m60.t;
import ni1.m2;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class j implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinVideoGridCell f1753a;

    public j(PinVideoGridCell pinVideoGridCell) {
        this.f1753a = pinVideoGridCell;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.c event) {
        f30 f30Var;
        f30 f30Var2;
        f30 f30Var3;
        f30 f30Var4;
        f30 f30Var5;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z13 = event instanceof ls1.a;
        PinVideoGridCell pinVideoGridCell = this.f1753a;
        if (!z13) {
            if (event instanceof ls1.b) {
                f30Var = pinVideoGridCell.pin;
                if (f30Var == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                if (Intrinsics.d(f30Var.getUid(), event.a())) {
                    pinVideoGridCell.maybeResetVideoFlavor();
                    PinterestVideoView videoView = pinVideoGridCell.getVideoView();
                    f30Var2 = pinVideoGridCell.pin;
                    if (f30Var2 == null) {
                        Intrinsics.r("pin");
                        throw null;
                    }
                    String uid = f30Var2.getUid();
                    videoView.getClass();
                    nc2.h hVar = nc2.h.f90405a;
                    if (uid != null) {
                        com.bumptech.glide.d.E0(uid, new m2(true, 6));
                    }
                    pinVideoGridCell.getVideoView().play();
                    return;
                }
                return;
            }
            return;
        }
        f30Var3 = pinVideoGridCell.pin;
        if (f30Var3 == null) {
            Intrinsics.r("pin");
            throw null;
        }
        if (Intrinsics.d(f30Var3.getUid(), event.a())) {
            pinVideoGridCell.cachedVideoViewFlavor = pinVideoGridCell.getVideoView().K;
            pinVideoGridCell.getVideoView().j(0L, false);
            PinterestVideoView videoView2 = pinVideoGridCell.getVideoView();
            f30Var4 = pinVideoGridCell.pin;
            if (f30Var4 == null) {
                Intrinsics.r("pin");
                throw null;
            }
            String uid2 = f30Var4.getUid();
            videoView2.getClass();
            nc2.h hVar2 = nc2.h.f90405a;
            if (uid2 != null) {
                com.bumptech.glide.d.E0(uid2, new a2(0L, 3));
            }
            PinterestVideoView videoView3 = pinVideoGridCell.getVideoView();
            f30Var5 = pinVideoGridCell.pin;
            if (f30Var5 == null) {
                Intrinsics.r("pin");
                throw null;
            }
            String uid3 = f30Var5.getUid();
            videoView3.getClass();
            if (uid3 != null) {
                com.bumptech.glide.d.E0(uid3, new m2(false, 6));
            }
            oc2.i.a(pinVideoGridCell.getVideoView());
            pinVideoGridCell.getVideoView().g0(nc2.j.DISABLE_AUTOPLAY);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.o event) {
        f30 f30Var;
        Intrinsics.checkNotNullParameter(event, "event");
        PinVideoGridCell pinVideoGridCell = this.f1753a;
        f30Var = pinVideoGridCell.pin;
        if (f30Var != null) {
            if (Intrinsics.d(f30Var.getUid(), event.f84702a) && event.f84706e) {
                int i13 = i.f1752a[event.f84705d.ordinal()];
                if (i13 == 1) {
                    pinVideoGridCell.showPinReactionSuccess(s0.grid_reaction_light_bulb);
                    return;
                } else {
                    if (i13 != 2) {
                        return;
                    }
                    pinVideoGridCell.showPinReactionSuccess(s0.grid_reaction_heart);
                    return;
                }
            }
            return;
        }
        Intrinsics.r("pin");
        throw null;
    }
}
