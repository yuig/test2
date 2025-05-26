package wo2;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final k f130716a;

    /* renamed from: b, reason: collision with root package name */
    public final Deflater f130717b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f130718c;

    public n(x sink, Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f130716a = sink;
        this.f130717b = deflater;
    }

    public final void a(boolean z13) {
        z Q;
        int deflate;
        k kVar = this.f130716a;
        j l13 = kVar.l();
        while (true) {
            Q = l13.Q(1);
            Deflater deflater = this.f130717b;
            byte[] bArr = Q.f130752a;
            if (z13) {
                try {
                    int i13 = Q.f130754c;
                    deflate = deflater.deflate(bArr, i13, 8192 - i13, 2);
                } catch (NullPointerException e13) {
                    throw new IOException("Deflater already closed", e13);
                }
            } else {
                int i14 = Q.f130754c;
                deflate = deflater.deflate(bArr, i14, 8192 - i14);
            }
            if (deflate > 0) {
                Q.f130754c += deflate;
                l13.f130711b += deflate;
                kVar.V();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (Q.f130753b == Q.f130754c) {
            l13.f130710a = Q.a();
            a0.a(Q);
        }
    }

    @Override // wo2.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.f130717b;
        if (this.f130718c) {
            return;
        }
        try {
            deflater.finish();
            a(false);
            th = null;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            deflater.end();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        try {
            this.f130716a.close();
        } catch (Throwable th5) {
            if (th == null) {
                th = th5;
            }
        }
        this.f130718c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // wo2.c0, java.io.Flushable
    public final void flush() {
        a(true);
        this.f130716a.flush();
    }

    @Override // wo2.c0
    public final i0 timeout() {
        return this.f130716a.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f130716a + ')';
    }

    @Override // wo2.c0
    public final void write(j source, long j13) {
        Intrinsics.checkNotNullParameter(source, "source");
        b.b(source.f130711b, 0L, j13);
        while (j13 > 0) {
            z zVar = source.f130710a;
            Intrinsics.f(zVar);
            int min = (int) Math.min(j13, zVar.f130754c - zVar.f130753b);
            this.f130717b.setInput(zVar.f130752a, zVar.f130753b, min);
            a(false);
            long j14 = min;
            source.f130711b -= j14;
            int i13 = zVar.f130753b + min;
            zVar.f130753b = i13;
            if (i13 == zVar.f130754c) {
                source.f130710a = zVar.a();
                a0.a(zVar);
            }
            j13 -= j14;
        }
    }
}
