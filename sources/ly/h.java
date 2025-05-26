package ly;

import ey.b2;
import ey.o0;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import s92.l;

/* loaded from: classes.dex */
public final class h extends o0 implements b2 {

    /* renamed from: d, reason: collision with root package name */
    public final l f85102d;

    /* renamed from: e, reason: collision with root package name */
    public final d4 f85103e;

    /* renamed from: f, reason: collision with root package name */
    public final a4 f85104f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l pwtCause, d4 viewType, a4 a4Var) {
        super(7, 0);
        Intrinsics.checkNotNullParameter(pwtCause, "pwtCause");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f85102d = pwtCause;
        this.f85103e = viewType;
        this.f85104f = a4Var;
    }
}
