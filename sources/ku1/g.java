package ku1;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import lb2.n;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class g implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f80900a;

    public g(j jVar) {
        this.f80900a = jVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull t00.a authFailureEvent) {
        Intrinsics.checkNotNullParameter(authFailureEvent, "authFailureEvent");
        j jVar = this.f80900a;
        jVar.f80905c.j(this);
        mr1.a aVar = jVar.f80908f;
        Activity activity = jVar.f80903a;
        Intrinsics.f(activity);
        ((n) aVar).d(activity, "authentication_failed", authFailureEvent.f115662a);
    }
}
