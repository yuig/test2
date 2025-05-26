package sq0;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f114985a;

    public d(e eVar) {
        this.f114985a = eVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f114985a.f114991z0 = event.f84686a;
    }
}
