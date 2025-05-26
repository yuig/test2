package ed1;

import android.content.ClipboardManager;
import com.pinterest.activity.sendapin.model.SendableObject;
import h32.f1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class c0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f58556a;

    public c0(f0 f0Var) {
        this.f58556a = f0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dr.i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.f56181c) {
            return;
        }
        f0 f0Var = this.f58556a;
        int i13 = b0.f58537a[f0Var.f58582c.ordinal()];
        if (i13 == 1) {
            kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
            String d2 = f0Var.f58583d.d();
            Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
            xj2.c F = f0Var.f58603x.L(d2).I(1L).F(new g(20, new m(f0Var2, event, f0Var, 1)), new g(21, c.f58553y), ck2.i.f27923c, ck2.i.f27924d);
            Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
            f0Var.addDisposable(F);
        } else if (i13 != 2) {
            f0.p3(f0Var, event);
        } else {
            f0.p3(f0Var, event);
        }
        event.f56181c = true;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull e82.q event) {
        Intrinsics.checkNotNullParameter(event, "event");
        f0 f0Var = this.f58556a;
        ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener = (ClipboardManager.OnPrimaryClipChangedListener) f0Var.L.getValue();
        if (onPrimaryClipChangedListener != null) {
            f0Var.K = event.f57891a;
            ClipboardManager clipboardManager = ((gs1.d) f0Var.D).f66080a;
            if (clipboardManager != null) {
                clipboardManager.addPrimaryClipChangedListener(onPrimaryClipChangedListener);
            }
            f0Var.q3(true);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull e82.r event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f58556a.q3(false);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ((cd1.f) this.f58556a.getView()).d6(event.f58533a);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull i91.e event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.getClass();
        this.f58556a.f58579J = true;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc0.s event) {
        Intrinsics.checkNotNullParameter(event, "event");
        f0 f0Var = this.f58556a;
        if (f0Var.f58583d.e() && event.f75438c == jc0.r.BTN_DONE) {
            i91.b bVar = f0Var.f58590k;
            String str = bVar.f71798a ? bVar.f71799b : null;
            f1 f1Var = f1.DISMISS;
            SendableObject sendableObject = f0Var.f58583d;
            String d2 = sendableObject.d();
            Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
            f0Var.f58581b.U(kh2.b0.l0(d2, null), f1Var, null, null, kh2.b0.v0(sendableObject, str), false);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.z event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ((cd1.f) this.f58556a.getView()).F2(event);
    }
}
