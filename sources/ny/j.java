package ny;

import ey.u1;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends u1 {

    /* renamed from: c, reason: collision with root package name */
    public final s92.o f92529c;

    /* renamed from: d, reason: collision with root package name */
    public final d4 f92530d;

    /* renamed from: e, reason: collision with root package name */
    public final a4 f92531e;

    /* renamed from: f, reason: collision with root package name */
    public final long f92532f;

    public j(s92.o pwtResult, d4 viewType, a4 viewParameterType, long j13) {
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(viewParameterType, "viewParameterType");
        this.f92529c = pwtResult;
        this.f92530d = viewType;
        this.f92531e = viewParameterType;
        this.f92532f = j13;
    }

    @Override // ey.u1
    public final String e() {
        return v.f92539a;
    }

    public final long l() {
        return this.f92532f;
    }

    public final s92.o m() {
        return this.f92529c;
    }

    public final a4 n() {
        return this.f92531e;
    }

    public final d4 o() {
        return this.f92530d;
    }
}
