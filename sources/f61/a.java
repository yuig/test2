package f61;

import a11.e;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import s71.s;
import uj2.q;
import x81.n;
import yk1.p;
import yk1.r;

/* loaded from: classes5.dex */
public final class a extends p {

    /* renamed from: a, reason: collision with root package name */
    public final e f61209a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n pinalytics, q networkStateStream, a11.n clickthroughHelper) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(clickthroughHelper, "clickthroughHelper");
        this.f61209a = clickthroughHelper;
    }

    @Override // yk1.p
    public final void bindPinalytics(r rVar) {
        s view = (s) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        s view = (s) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((g61.e) view).f63731a = this;
    }

    public final void p3(f30 f30Var) {
        String s53 = f30Var.s5();
        if (s53 == null) {
            return;
        }
        e.c(this.f61209a, s53, f30Var, false, 0, 0, null, false, false, null, null, null, false, false, null, false, false, false, 131068);
    }

    @Override // yk1.p
    public final void unbindPinalytics() {
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        s view = (s) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((g61.e) view).f63731a = this;
    }
}
