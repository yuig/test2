package cp1;

import ey.s1;
import ey.t1;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class l implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f53006a;

    public l(p pVar) {
        this.f53006a = pVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull t1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.getClass();
        s1.b(this.f53006a);
    }
}
