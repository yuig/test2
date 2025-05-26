package vo;

import com.pinterest.activity.ExperimentsReloaderActivity;
import kotlin.jvm.internal.Intrinsics;
import lh0.b1;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExperimentsReloaderActivity f126354a;

    public b(ExperimentsReloaderActivity experimentsReloaderActivity) {
        this.f126354a = experimentsReloaderActivity;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull b1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (ff0.j.f62104b) {
            return;
        }
        ExperimentsReloaderActivity.q(this.f126354a);
    }
}
