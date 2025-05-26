package qc;

import kotlin.jvm.internal.Intrinsics;
import wo2.c0;
import wo2.i0;

/* loaded from: classes3.dex */
public final class a implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f103425a;

    /* renamed from: b, reason: collision with root package name */
    public long f103426b;

    public a(wo2.f delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f103425a = delegate;
    }

    @Override // wo2.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f103425a.close();
    }

    @Override // wo2.c0, java.io.Flushable
    public final void flush() {
        this.f103425a.flush();
    }

    @Override // wo2.c0
    public final i0 timeout() {
        return this.f103425a.timeout();
    }

    @Override // wo2.c0
    public final void write(wo2.j source, long j13) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f103425a.write(source, j13);
        this.f103426b += j13;
    }
}
