package lw1;

import ey1.c;
import kotlin.jvm.internal.Intrinsics;
import so.u0;
import yx.b;
import zx.f;

/* loaded from: classes4.dex */
public final class a extends c {

    /* renamed from: c, reason: collision with root package name */
    public final yx.c f85058c;

    public a(b filterRepositoryFactory) {
        Intrinsics.checkNotNullParameter(filterRepositoryFactory, "filterRepositoryFactory");
        this.f85058c = ((u0) filterRepositoryFactory).a(zx.a.FILTER_OVERVIEW, false);
    }

    @Override // ey1.c
    public final long a() {
        return this.f85058c.c().f142973a.f142969a == f.HOURS_24 ? 30L : 120L;
    }

    @Override // ey1.c
    public final boolean b() {
        return this.f85058c.c().f142973a.f142969a == f.HOURS_24;
    }
}
