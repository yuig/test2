package ps0;

import i32.y0;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import t3.s1;

/* loaded from: classes.dex */
public final class d0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f101250a;

    public d0(r0 r0Var) {
        this.f101250a = r0Var;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull x70.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f134109a;
        if (str == null) {
            return;
        }
        r0 r0Var = this.f101250a;
        if (Intrinsics.d(str, r0Var.V)) {
            r0Var.V = null;
            Boolean bool = event.f134110b;
            r0Var.addDisposable(nl.b.s(s1.f(((dh0.d) r0Var.I).g(y0.ANDROID_HOME_FEED_AFTER_CLICKTHROUGH, z0.h(new Pair(rg0.o.CONTEXT_PIN_ID.getValue(), str), new Pair(rg0.o.IS_PROMOTED.getValue(), String.valueOf(bool != null ? bool.booleanValue() : false))), new tg0.c(false, false)).H(tk2.e.f118017c), "observeOn(...)"), new c0(r0Var, 1), null, null, 6));
        }
    }
}
