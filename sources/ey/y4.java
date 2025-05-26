package ey;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class y4 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w4 f60632a;

    public y4(w4 w4Var) {
        this.f60632a = w4Var;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ny.s event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.f92538a) {
            return;
        }
        LinkedHashSet linkedHashSet = d0.f60468a;
        d0.a(this.f60632a, false);
    }
}
