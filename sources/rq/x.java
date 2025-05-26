package rq;

import android.app.Activity;
import android.content.Context;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes3.dex */
public final class x implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f109641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f109642b;

    public x(Context context, b0 b0Var) {
        this.f109641a = context;
        this.f109642b = b0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(dg0.f fVar) {
        String str;
        Activity k03 = bs1.c.k0(this.f109641a);
        b0 b0Var = this.f109642b;
        if (b0Var.f109108c == null) {
            Intrinsics.r("educationHelper");
            throw null;
        }
        Intrinsics.g(k03, "null cannot be cast to non-null type com.pinterest.activity.task.activity.MainActivity");
        com.pinterest.framework.screens.a b13 = zf0.f.b((MainActivity) k03);
        mq.j0 j0Var = b13 instanceof mq.j0 ? (mq.j0) b13 : null;
        if (j0Var != null) {
            String pinId = j0Var.getPinId();
            f30 pin = b0Var.getPin();
            if (Intrinsics.d(pinId, pin != null ? pin.getUid() : null)) {
                String str2 = b0Var.f109114i;
                if (str2 == null) {
                    f30 pin2 = b0Var.getPin();
                    String D = pin2 != null ? com.bumptech.glide.c.D(pin2) : null;
                    if (D == null) {
                        return;
                    } else {
                        str = D;
                    }
                } else {
                    str = str2;
                }
                PinCloseupBaseModule.handleWebsiteClicked$default(b0Var, str, null, null, 6, null);
            }
        }
    }
}
