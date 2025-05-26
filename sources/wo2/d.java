package wo2;

import ao2.m0;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130676a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f130677b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f130678c;

    public d(InputStream input, i0 timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f130677b = input;
        this.f130678c = timeout;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i13 = this.f130676a;
        Object obj = this.f130677b;
        switch (i13) {
            case 0:
                e eVar = (e) obj;
                e0 e0Var = (e0) this.f130678c;
                eVar.j();
                try {
                    e0Var.close();
                    Unit unit = Unit.f80348a;
                    if (eVar.k()) {
                        throw eVar.l(null);
                    }
                    return;
                } catch (IOException e13) {
                    if (!eVar.k()) {
                        throw e13;
                    }
                    throw eVar.l(e13);
                } finally {
                    eVar.k();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // wo2.e0
    public final long read(j sink, long j13) {
        int i13 = this.f130676a;
        Object obj = this.f130677b;
        Object obj2 = this.f130678c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                e eVar = (e) obj;
                e0 e0Var = (e0) obj2;
                eVar.j();
                try {
                    long read = e0Var.read(sink, j13);
                    if (eVar.k()) {
                        throw eVar.l(null);
                    }
                    return read;
                } catch (IOException e13) {
                    if (eVar.k()) {
                        throw eVar.l(e13);
                    }
                    throw e13;
                } finally {
                    eVar.k();
                }
            default:
                Intrinsics.checkNotNullParameter(sink, "sink");
                if (j13 == 0) {
                    return 0L;
                }
                if (j13 < 0) {
                    throw new IllegalArgumentException(a.a.g("byteCount < 0: ", j13).toString());
                }
                try {
                    ((i0) obj2).f();
                    z Q = sink.Q(1);
                    int read2 = ((InputStream) obj).read(Q.f130752a, Q.f130754c, (int) Math.min(j13, 8192 - Q.f130754c));
                    if (read2 == -1) {
                        if (Q.f130753b == Q.f130754c) {
                            sink.f130710a = Q.a();
                            a0.a(Q);
                        }
                        return -1L;
                    }
                    Q.f130754c += read2;
                    long j14 = read2;
                    sink.f130711b += j14;
                    return j14;
                } catch (AssertionError e14) {
                    if (m0.T(e14)) {
                        throw new IOException(e14);
                    }
                    throw e14;
                }
        }
    }

    @Override // wo2.e0
    public final i0 timeout() {
        switch (this.f130676a) {
            case 0:
                return (e) this.f130677b;
            default:
                return (i0) this.f130678c;
        }
    }

    public final String toString() {
        switch (this.f130676a) {
            case 0:
                return "AsyncTimeout.source(" + ((e0) this.f130678c) + ')';
            default:
                return "source(" + ((InputStream) this.f130677b) + ')';
        }
    }

    public d(d0 d0Var, d dVar) {
        this.f130677b = d0Var;
        this.f130678c = dVar;
    }
}
