package rq;

import android.app.Activity;
import android.content.Context;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p3 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f109478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r3 f109479b;

    public p3(Context context, r3 r3Var) {
        this.f109478a = context;
        this.f109479b = r3Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ss.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f109479b.n(event.f115126a);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(dg0.f fVar) {
        Activity k03 = bs1.c.k0(this.f109478a);
        r3 r3Var = this.f109479b;
        if (r3Var.f109510c != null) {
            Intrinsics.g(k03, "null cannot be cast to non-null type com.pinterest.activity.task.activity.MainActivity");
            com.pinterest.framework.screens.a b13 = zf0.f.b((MainActivity) k03);
            mq.j0 j0Var = b13 instanceof mq.j0 ? (mq.j0) b13 : null;
            if (j0Var != null) {
                String pinId = j0Var.getPinId();
                f30 pin = r3Var.getPin();
                if (Intrinsics.d(pinId, pin != null ? pin.getUid() : null)) {
                    r3Var.j();
                    return;
                }
                return;
            }
            return;
        }
        Intrinsics.r("educationHelper");
        throw null;
    }
}
