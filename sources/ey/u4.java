package ey;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class u4 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f60588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f60589b;

    public u4(boolean z13, w4 w4Var) {
        this.f60588a = z13;
        this.f60589b = w4Var;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull w event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.f60606a) {
            return;
        }
        boolean z13 = this.f60588a;
        w4 w4Var = this.f60589b;
        if (!z13) {
            d0.a(w4Var, false);
            return;
        }
        if (event.f60607b == s92.o.COMPLETE) {
            d0.a(w4Var, false);
            return;
        }
        LinkedHashSet linkedHashSet = d0.f60468a;
        b0 tag = w4Var.f60451b;
        Intrinsics.checkNotNullParameter(tag, "tag");
        LinkedHashSet linkedHashSet2 = d0.f60468a;
        if (linkedHashSet2.contains(tag)) {
            linkedHashSet2.remove(tag);
        }
        Intrinsics.checkNotNullParameter(tag, "tag");
        c0 c0Var = (c0) d0.f60469b.get(tag);
        m60.u.f85943a.j(c0Var != null ? c0Var.a() : null);
        d0.d(tag);
    }
}
