package bd;

import kotlin.jvm.internal.Intrinsics;
import wo2.e0;
import wo2.i0;

/* loaded from: classes3.dex */
public final class k implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f22709a;

    public k(l lVar) {
        this.f22709a = lVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        l lVar = this.f22709a;
        if (Intrinsics.d(lVar.f22716g, this)) {
            lVar.f22716g = null;
        }
    }

    @Override // wo2.e0
    public final long read(wo2.j sink, long j13) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j13 < 0) {
            throw new IllegalArgumentException(a.a.g("byteCount < 0: ", j13).toString());
        }
        l lVar = this.f22709a;
        if (!Intrinsics.d(lVar.f22716g, this)) {
            throw new IllegalStateException("closed".toString());
        }
        long a13 = lVar.a(j13);
        if (a13 == 0) {
            return -1L;
        }
        return lVar.f22710a.read(sink, a13);
    }

    @Override // wo2.e0
    public final i0 timeout() {
        return this.f22709a.f22710a.timeout();
    }
}
