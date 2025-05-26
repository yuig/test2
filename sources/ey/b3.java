package ey;

import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b3 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c3 f60443a;

    public b3(c3 c3Var) {
        this.f60443a = c3Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f60443a.a(e13);
    }
}
