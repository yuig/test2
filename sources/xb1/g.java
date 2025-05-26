package xb1;

import dl1.s;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;
import wb1.b0;

/* loaded from: classes5.dex */
public final class g implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f134516a;

    public g(j jVar) {
        this.f134516a = jVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        for (s sVar : CollectionsKt.F0(this.f134516a.f134531g.f135191h)) {
            if (sVar instanceof b0) {
                b0 b0Var = (b0) sVar;
                if (b0Var.f129007g != event.f134499a.getValue()) {
                    b0Var.f129007g = event.f134499a.getValue();
                }
            }
        }
    }
}
