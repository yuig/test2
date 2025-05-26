package v02;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class e implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f123786a;

    public e(j jVar) {
        this.f123786a = jVar;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull l02.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f123786a.D5();
    }
}
