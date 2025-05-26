package x52;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class e implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f133845a;

    public e(n nVar) {
        this.f133845a = nVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull s event) {
        Intrinsics.checkNotNullParameter(event, "event");
        n nVar = this.f133845a;
        nVar.f133893c.j(this);
        Function0 function0 = nVar.f133901k;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
