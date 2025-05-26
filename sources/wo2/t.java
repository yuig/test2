package wo2;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final l f130732a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f130733b;

    /* renamed from: c, reason: collision with root package name */
    public int f130734c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f130735d;

    public t(y source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f130732a = source;
        this.f130733b = inflater;
    }

    public final long a(j sink, long j13) {
        Inflater inflater = this.f130733b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j13 < 0) {
            throw new IllegalArgumentException(a.a.g("byteCount < 0: ", j13).toString());
        }
        if (!(!this.f130735d)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j13 == 0) {
            return 0L;
        }
        try {
            z Q = sink.Q(1);
            int min = (int) Math.min(j13, 8192 - Q.f130754c);
            boolean needsInput = inflater.needsInput();
            l lVar = this.f130732a;
            if (needsInput && !lVar.o1()) {
                z zVar = lVar.l().f130710a;
                Intrinsics.f(zVar);
                int i13 = zVar.f130754c;
                int i14 = zVar.f130753b;
                int i15 = i13 - i14;
                this.f130734c = i15;
                inflater.setInput(zVar.f130752a, i14, i15);
            }
            int inflate = inflater.inflate(Q.f130752a, Q.f130754c, min);
            int i16 = this.f130734c;
            if (i16 != 0) {
                int remaining = i16 - inflater.getRemaining();
                this.f130734c -= remaining;
                lVar.skip(remaining);
            }
            if (inflate > 0) {
                Q.f130754c += inflate;
                long j14 = inflate;
                sink.f130711b += j14;
                return j14;
            }
            if (Q.f130753b == Q.f130754c) {
                sink.f130710a = Q.a();
                a0.a(Q);
            }
            return 0L;
        } catch (DataFormatException e13) {
            throw new IOException(e13);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f130735d) {
            return;
        }
        this.f130733b.end();
        this.f130735d = true;
        this.f130732a.close();
    }

    @Override // wo2.e0
    public final long read(j sink, long j13) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long a13 = a(sink, j13);
            if (a13 > 0) {
                return a13;
            }
            Inflater inflater = this.f130733b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f130732a.o1());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // wo2.e0
    public final i0 timeout() {
        return this.f130732a.timeout();
    }
}
