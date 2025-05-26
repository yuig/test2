package ps0;

import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import i32.y0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f101266a;

    public g0(r0 r0Var) {
        this.f101266a = r0Var;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.w imageOnlyGridEvent) {
        Intrinsics.checkNotNullParameter(imageOnlyGridEvent, "imageOnlyGridEvent");
        r0 r0Var = this.f101266a;
        r0Var.getClass();
        Intrinsics.checkNotNullParameter(imageOnlyGridEvent, "imageOnlyGridEvent");
        r0Var.Q3(imageOnlyGridEvent);
        e W3 = r0Var.W3();
        if (W3 != null) {
            HomeFeedFragment homeFeedFragment = (HomeFeedFragment) W3;
            wa2.i iVar = homeFeedFragment.W8().f103320a;
            if (iVar.f128797t) {
                return;
            }
            iVar.f128797t = true;
            iVar.D = true;
            iVar.F = true;
            yq0.z zVar = (yq0.z) homeFeedFragment.f139732f0;
            if (zVar != null) {
                zVar.h();
            }
        }
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull rg0.r placementStateChangedEvent) {
        Intrinsics.checkNotNullParameter(placementStateChangedEvent, "placementStateChangedEvent");
        r0 r0Var = this.f101266a;
        r0Var.getClass();
        Intrinsics.checkNotNullParameter(placementStateChangedEvent, "placementStateChangedEvent");
        y0 y0Var = placementStateChangedEvent.f108085a;
        y0 y0Var2 = y0.ANDROID_HOME_FEED_TAKEOVER;
        if (y0Var == y0Var2) {
            r0Var.Q3(placementStateChangedEvent);
            e W3 = r0Var.W3();
            if (W3 != null) {
                ((HomeFeedFragment) W3).r9(y0Var2);
            }
            r0Var.a4();
            return;
        }
        if (y0Var == y0.ANDROID_GLOBAL_NAG && r0Var.a4()) {
            r0Var.Q3(placementStateChangedEvent);
        }
    }
}
