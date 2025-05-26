package cp1;

import gg0.o0;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class f implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f52997a;

    public f(p pVar) {
        this.f52997a = pVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull o0 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        m92.d toastContainer = this.f52997a.getToastContainer();
        if (toastContainer != null) {
            toastContainer.k(e13.f64955a, e13.f64956b);
        }
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull i92.i e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        we0.a aVar = e13.f71931a;
        p pVar = this.f52997a;
        pVar.showToast(aVar);
        pVar.getEventManager().i(e13);
    }
}
