package d12;

import ey.w;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import m60.u;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;

/* loaded from: classes2.dex */
public final class d implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uk2.d f53626a;

    public d(uk2.d dVar) {
        this.f53626a = dVar;
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull w event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!event.f60606a) {
            this.f53626a.c(Boolean.TRUE);
        }
        u.f85943a.j(this);
    }
}
