package ps0;

import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import i32.y0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class m0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f101283a;

    public m0(r0 r0Var) {
        this.f101283a = r0Var;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull iv1.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        e eVar = (e) this.f101283a.getViewIfBound();
        if (eVar != null) {
            ((HomeFeedFragment) eVar).r9(y0.ANDROID_HOME_FEED_AFTER_SAVE_TO_PROFILE_ON_PREVIOUS_SCREEN);
        }
    }
}
