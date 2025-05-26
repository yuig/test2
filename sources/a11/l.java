package a11;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class l implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f316b;

    public l(j0 j0Var, n nVar) {
        this.f315a = j0Var;
        this.f316b = nVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Object obj = this.f315a.f80434a;
        if (obj == null) {
            Intrinsics.r("urlInfoDisposable");
            throw null;
        }
        ((xj2.c) obj).dispose();
        this.f316b.f321b.j(this);
    }
}
