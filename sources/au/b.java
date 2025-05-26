package au;

import ck2.i;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import xj2.c;
import xt.f;
import yk1.n;

/* loaded from: classes3.dex */
public final class b extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final f f20466a;

    /* renamed from: b, reason: collision with root package name */
    public f30 f20467b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f showcaseManager) {
        super(0);
        Intrinsics.checkNotNullParameter(showcaseManager, "showcaseManager");
        this.f20466a = showcaseManager;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        zu.f view = (zu.f) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        c F = this.f20466a.f135875r.F(new zt.b(3, new wt.c(view, 2)), new zt.b(4, a.f20464k), i.f27923c, i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    @Override // yk1.b
    public final void onUnbind() {
        clearDisposables();
        super.onUnbind();
    }
}
