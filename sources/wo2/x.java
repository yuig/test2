package wo2;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x implements k {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f130746a;

    /* renamed from: b, reason: collision with root package name */
    public final j f130747b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f130748c;

    public x(c0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f130746a = sink;
        this.f130747b = new j();
    }

    @Override // wo2.k
    public final k E1(byte[] source, int i13, int i14) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.f130748c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f130747b.W(source, i13, i14);
        V();
        return this;
    }

    @Override // wo2.k
    public final k F1(long j13) {
        if (!(!this.f130748c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f130747b.d0(j13);
        V();
        return this;
    }

    @Override // wo2.k
    public final k I(int i13) {
        if (!(!this.f130748c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f130747b.g0(i13);
        V();
        return this;
    }

    @Override // wo2.k
    public final k I0(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.f130748c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f130747b.U(source);
        V();
        return this;
    }

    @Override // wo2.k
    public final k I1(int i13, int i14, String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (!(!this.f130748c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f130747b.q0(i13, i14, string);
        V();
        return this;
    }

    @Override // wo2.k
    public final k O0(long j13) {
        if (!(!this.f130748c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f130747b.b0(j13);
        V();
        return this;
    }

    @Override // wo2.k
    public final k V() {
        if (!(!this.f130748c)) {
            throw new IllegalStateException("closed".toString());
        }
        j jVar = this.f130747b;
        long g13 = jVar.g();
        if (g13 > 0) {
            this.f130746a.write(jVar, g13);
        }
        return this;
    }

    public final void a(int i13) {
        if (!(!this.f130748c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f130747b.g0(b.c(i13));
        V();
    }

    @Override // wo2.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c0 c0Var = this.f130746a;
        if (this.f130748c) {
            return;
        }
        try {
            j jVar = this.f130747b;
            long j13 = jVar.f130711b;
            if (j13 > 0) {
                c0Var.write(jVar, j13);
            }
            th = null;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            c0Var.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f130748c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // wo2.k, wo2.c0, java.io.Flushable
    public final void flush() {
        if (!(!this.f130748c)) {
            throw new IllegalStateException("closed".toString());
        }
        j jVar = this.f130747b;
        long j13 = jVar.f130711b;
        c0 c0Var = this.f130746a;
        if (j13 > 0) {
            c0Var.write(jVar, j13);
        }
        c0Var.flush();
    }

    @Override // wo2.k
    public final k g1(int i13) {
        if (!(!this.f130748c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f130747b.m0(i13);
        V();
        return this;
    }

    @Override // wo2.k
    public final long i2(e0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j13 = 0;
        while (true) {
            long read = source.read(this.f130747b, 8192L);
            if (read == -1) {
                return j13;
            }
            j13 += read;
            V();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f130748c;
    }

    @Override // wo2.k
    public final j l() {
        return this.f130747b;
    }

    @Override // wo2.k
    public final k l0(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (!(!this.f130748c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f130747b.r0(string);
        V();
        return this;
    }

    @Override // wo2.k
    public final k n() {
        if (!(!this.f130748c)) {
            throw new IllegalStateException("closed".toString());
        }
        j jVar = this.f130747b;
        long j13 = jVar.f130711b;
        if (j13 > 0) {
            this.f130746a.write(jVar, j13);
        }
        return this;
    }

    @Override // wo2.k
    public final k p1(int i13) {
        if (!(!this.f130748c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f130747b.a0(i13);
        V();
        return this;
    }

    @Override // wo2.k
    public final k t1(m byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!(!this.f130748c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f130747b.S(byteString);
        V();
        return this;
    }

    @Override // wo2.c0
    public final i0 timeout() {
        return this.f130746a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f130746a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.f130748c)) {
            throw new IllegalStateException("closed".toString());
        }
        int write = this.f130747b.write(source);
        V();
        return write;
    }

    @Override // wo2.c0
    public final void write(j source, long j13) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f130748c) {
            this.f130747b.write(source, j13);
            V();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
}
