package x81;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class d0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f134189a;

    public d0(f0 f0Var) {
        this.f134189a = f0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull lq.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        o0 o0Var = this.f134189a.f134196b1;
        if (o0Var != null) {
            f30 f30Var = o0Var.f134283s;
            String uid = f30Var != null ? f30Var.getUid() : null;
            if (uid == null) {
                uid = "";
            }
            xj2.c F = o0Var.f134277m.C(uid).F(new h0(0, new l0(o0Var, 2)), new h0(1, c0.f134177q), ck2.i.f27923c, ck2.i.f27924d);
            Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
            o0Var.addDisposable(F);
        }
    }
}
