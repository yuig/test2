package n21;

import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;

/* loaded from: classes2.dex */
public final class h implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f89009a;

    public h(i iVar) {
        this.f89009a = iVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.d(event.f84689i, this.f89009a.f89010c.getUid());
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(l21.a aVar) {
        i iVar = this.f89009a;
        if (Intrinsics.d(iVar.f89010c.getUid(), aVar != null ? aVar.f81474a : null)) {
            int a13 = iVar.f89015h.a(iVar.f89010c);
            ((l21.e) iVar.getView()).jumpToCarouselItem(a13);
            iVar.G3(a13, false);
            iVar.f89020m = a13;
        }
    }
}
