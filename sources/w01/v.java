package w01;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import rq.p2;

/* loaded from: classes5.dex */
public final class v implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f127117a;

    public v(x xVar) {
        this.f127117a = xVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        x xVar = this.f127117a;
        f30 f30Var = xVar.f127120a;
        if (Intrinsics.d(f30Var != null ? b40.g(f30Var) : null, event.f100061b)) {
            f30 f30Var2 = xVar.f127120a;
            if (f30Var2 == null || !Intrinsics.d(f30Var2.Q3(), Boolean.TRUE)) {
                rp0.d dVar = event.f100060a;
                xVar.f127132m = dVar;
                f30 f30Var3 = xVar.f127120a;
                if (f30Var3 == null || !xVar.isBound()) {
                    return;
                }
                ((p2) ((i01.w) xVar.getView())).i(f30Var3, dVar);
                xVar.s3();
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        x xVar = this.f127117a;
        f30 f30Var = xVar.f127120a;
        if (Intrinsics.d(f30Var != null ? b40.g(f30Var) : null, event.f100063a)) {
            f30 f30Var2 = xVar.f127120a;
            if (f30Var2 == null || !Intrinsics.d(f30Var2.Q3(), Boolean.TRUE)) {
                xVar.r3();
            }
        }
    }
}
