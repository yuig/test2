package wo2;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q extends i0 {

    /* renamed from: f, reason: collision with root package name */
    public i0 f130721f;

    public q(i0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f130721f = delegate;
    }

    @Override // wo2.i0
    public final i0 a() {
        return this.f130721f.a();
    }

    @Override // wo2.i0
    public final i0 b() {
        return this.f130721f.b();
    }

    @Override // wo2.i0
    public final long c() {
        return this.f130721f.c();
    }

    @Override // wo2.i0
    public final i0 d(long j13) {
        return this.f130721f.d(j13);
    }

    @Override // wo2.i0
    public final boolean e() {
        return this.f130721f.e();
    }

    @Override // wo2.i0
    public final void f() {
        this.f130721f.f();
    }

    @Override // wo2.i0
    public final i0 g(long j13, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f130721f.g(j13, unit);
    }

    @Override // wo2.i0
    public final long h() {
        return this.f130721f.h();
    }
}
