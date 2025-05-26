package ba1;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class s implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f22397a;

    public s(y yVar) {
        this.f22397a = yVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull e82.z event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i13 = y.M0;
        kh2.j.x2(this.f22397a.b9(), m.f22383a);
    }
}
