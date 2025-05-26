package w01;

import kotlin.jvm.internal.Intrinsics;
import rq.x2;

/* loaded from: classes5.dex */
public final class z extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final m60.w f127136a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(m60.w eventManager) {
        super(0);
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f127136a = eventManager;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        x2 view = (x2) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        view.f109647c = this;
    }
}
