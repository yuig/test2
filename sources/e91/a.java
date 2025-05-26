package e91;

import b01.c;
import c91.f;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import uk1.d;
import yk1.b;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends b implements rj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final nu1.a f57912a;

    /* renamed from: b, reason: collision with root package name */
    public final d f57913b;

    /* renamed from: c, reason: collision with root package name */
    public final f f57914c;

    /* renamed from: d, reason: collision with root package name */
    public String f57915d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f onDemandModuleController, d presenterPinalytics, nu1.a inAppNavigator) {
        super(0);
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(onDemandModuleController, "onDemandModuleController");
        this.f57912a = inAppNavigator;
        this.f57913b = presenterPinalytics;
        this.f57914c = onDemandModuleController;
    }

    @Override // rj0.b
    public final void b() {
        String str = this.f57915d;
        if (str != null) {
            this.f57913b.f122379a.X(u0.VIRTUAL_TRY_ON_ICON);
            this.f57914c.a(new c(28, this, str), null, c91.a.f26973a);
        }
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        rj0.a view = (rj0.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        view.A(this);
    }
}
