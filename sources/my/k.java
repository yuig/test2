package my;

import ey.b2;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends b implements b2 {

    /* renamed from: e, reason: collision with root package name */
    public final s92.l f88487e;

    /* renamed from: f, reason: collision with root package name */
    public final d4 f88488f;

    /* renamed from: g, reason: collision with root package name */
    public final a4 f88489g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(s92.i pwtAction, s92.l pwtCause, d4 viewType, a4 a4Var) {
        super(pwtAction, 1);
        Intrinsics.checkNotNullParameter(pwtAction, "pwtAction");
        Intrinsics.checkNotNullParameter(pwtCause, "pwtCause");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f88487e = pwtCause;
        this.f88488f = viewType;
        this.f88489g = a4Var;
    }
}
