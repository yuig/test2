package wo2;

import ao2.m0;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y implements l {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f130749a;

    /* renamed from: b, reason: collision with root package name */
    public final j f130750b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f130751c;

    public y(e0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f130749a = source;
        this.f130750b = new j();
    }

    @Override // wo2.l
    public final String B0() {
        return Z(Long.MAX_VALUE);
    }

    @Override // wo2.l
    public final String C1(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        e0 e0Var = this.f130749a;
        j jVar = this.f130750b;
        jVar.i2(e0Var);
        return jVar.C1(charset);
    }

    @Override // wo2.l
    public final long L0(m targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (!(!this.f130751c)) {
            throw new IllegalStateException("closed".toString());
        }
        long j13 = 0;
        while (true) {
            j jVar = this.f130750b;
            long w13 = jVar.w(j13, targetBytes);
            if (w13 != -1) {
                return w13;
            }
            long j14 = jVar.f130711b;
            if (this.f130749a.read(jVar, 8192L) == -1) {
                return -1L;
            }
            j13 = Math.max(j13, j14);
        }
    }

    @Override // wo2.l
    public final void N0(long j13) {
        if (!request(j13)) {
            throw new EOFException();
        }
    }

    @Override // wo2.l
    public final boolean P0(long j13, m bytes) {
        int i13;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int b13 = bytes.b();
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!(!this.f130751c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (b13 >= 0 && bytes.b() >= b13) {
            for (0; i13 < b13; i13 + 1) {
                long j14 = i13;
                i13 = (request(1 + j14) && this.f130750b.k(j14) == bytes.e(i13)) ? i13 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    @Override // wo2.l
    public final void R(j sink, long j13) {
        j jVar = this.f130750b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            N0(j13);
            jVar.R(sink, j13);
        } catch (EOFException e13) {
            sink.i2(jVar);
            throw e13;
        }
    }

    @Override // wo2.l
    public final String Z(long j13) {
        if (j13 < 0) {
            throw new IllegalArgumentException(a.a.g("limit < 0: ", j13).toString());
        }
        long j14 = j13 == Long.MAX_VALUE ? Long.MAX_VALUE : j13 + 1;
        long c13 = c((byte) 10, 0L, j14);
        j jVar = this.f130750b;
        if (c13 != -1) {
            return xo2.a.b(jVar, c13);
        }
        if (j14 < Long.MAX_VALUE && request(j14) && jVar.k(j14 - 1) == 13 && request(1 + j14) && jVar.k(j14) == 10) {
            return xo2.a.b(jVar, j14);
        }
        j jVar2 = new j();
        jVar.h(0L, Math.min(32, jVar.f130711b), jVar2);
        throw new EOFException("\\n not found: limit=" + Math.min(jVar.f130711b, j13) + " content=" + jVar2.a1(jVar2.f130711b).c() + (char) 8230);
    }

    public final long a() {
        return c((byte) 0, 0L, Long.MAX_VALUE);
    }

    @Override // wo2.l
    public final m a1(long j13) {
        N0(j13);
        return this.f130750b.a1(j13);
    }

    public final long c(byte b13, long j13, long j14) {
        if (!(!this.f130751c)) {
            throw new IllegalStateException("closed".toString());
        }
        long j15 = 0;
        if (0 > j14) {
            throw new IllegalArgumentException(a.a.g("fromIndex=0 toIndex=", j14).toString());
        }
        while (j15 < j14) {
            long m13 = this.f130750b.m(b13, j15, j14);
            if (m13 != -1) {
                return m13;
            }
            j jVar = this.f130750b;
            long j16 = jVar.f130711b;
            if (j16 >= j14 || this.f130749a.read(jVar, 8192L) == -1) {
                return -1L;
            }
            j15 = Math.max(j15, j16);
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f130751c) {
            return;
        }
        this.f130751c = true;
        this.f130749a.close();
        this.f130750b.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r1 = new java.lang.StringBuilder("Expected a digit or '-' but was 0x");
        r2 = java.lang.Integer.toString(r8, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "toString(...)");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long d() {
        /*
            r11 = this;
            r0 = 1
            r11.N0(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r11.request(r6)
            wo2.j r9 = r11.f130750b
            if (r8 == 0) goto L50
            byte r8 = r9.k(r4)
            r10 = 48
            if (r8 < r10) goto L1e
            r10 = 57
            if (r8 <= r10) goto L27
        L1e:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L29
            r5 = 45
            if (r8 == r5) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r4 == 0) goto L2c
            goto L50
        L2c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            r1.<init>(r2)
            r2 = 16
            int r2 = kotlin.text.CharsKt.checkRadix(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L50:
            long r0 = r9.J()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wo2.y.d():long");
    }

    public final short e() {
        N0(2L);
        return this.f130750b.K();
    }

    @Override // wo2.l
    public final long f0(c0 sink) {
        j jVar;
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j13 = 0;
        while (true) {
            e0 e0Var = this.f130749a;
            jVar = this.f130750b;
            if (e0Var.read(jVar, 8192L) == -1) {
                break;
            }
            long g13 = jVar.g();
            if (g13 > 0) {
                j13 += g13;
                sink.write(jVar, g13);
            }
        }
        long j14 = jVar.f130711b;
        if (j14 <= 0) {
            return j13;
        }
        long j15 = j13 + j14;
        sink.write(jVar, j14);
        return j15;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f130751c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        return -1;
     */
    @Override // wo2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j0(wo2.v r8) {
        /*
            r7 = this;
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r7.f130751c
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L36
        Lb:
            wo2.j r0 = r7.f130750b
            int r2 = xo2.a.c(r0, r8, r1)
            r3 = -2
            r4 = -1
            if (r2 == r3) goto L26
            if (r2 == r4) goto L24
            wo2.m[] r8 = r8.f130738b
            r8 = r8[r2]
            int r8 = r8.b()
            long r3 = (long) r8
            r0.skip(r3)
            goto L35
        L24:
            r2 = r4
            goto L35
        L26:
            wo2.e0 r2 = r7.f130749a
            r5 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.read(r0, r5)
            r5 = -1
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto Lb
            goto L24
        L35:
            return r2
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wo2.y.j0(wo2.v):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
        r2 = java.lang.Integer.toString(r2, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "toString(...)");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // wo2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long j2() {
        /*
            r6 = this;
            r0 = 1
            r6.N0(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.request(r2)
            wo2.j r3 = r6.f130750b
            if (r2 == 0) goto L58
            long r4 = (long) r0
            byte r2 = r3.k(r4)
            r4 = 48
            if (r2 < r4) goto L1e
            r4 = 57
            if (r2 <= r4) goto L2f
        L1e:
            r4 = 97
            if (r2 < r4) goto L26
            r4 = 102(0x66, float:1.43E-43)
            if (r2 <= r4) goto L2f
        L26:
            r4 = 65
            if (r2 < r4) goto L31
            r4 = 70
            if (r2 <= r4) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L58
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r3)
            r3 = 16
            int r3 = kotlin.text.CharsKt.checkRadix(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L58:
            long r0 = r3.j2()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wo2.y.j2():long");
    }

    @Override // wo2.l
    public final h k2() {
        return new h(this, 1);
    }

    @Override // wo2.l, wo2.k
    public final j l() {
        return this.f130750b;
    }

    @Override // wo2.l
    public final byte[] m1() {
        e0 e0Var = this.f130749a;
        j jVar = this.f130750b;
        jVar.i2(e0Var);
        return jVar.A(jVar.f130711b);
    }

    @Override // wo2.l
    public final boolean o1() {
        if (!(!this.f130751c)) {
            throw new IllegalStateException("closed".toString());
        }
        j jVar = this.f130750b;
        return jVar.o1() && this.f130749a.read(jVar, 8192L) == -1;
    }

    @Override // wo2.l
    public final y peek() {
        return m0.i(new w(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        j jVar = this.f130750b;
        if (jVar.f130711b == 0 && this.f130749a.read(jVar, 8192L) == -1) {
            return -1;
        }
        return jVar.read(sink);
    }

    @Override // wo2.l
    public final byte readByte() {
        N0(1L);
        return this.f130750b.readByte();
    }

    @Override // wo2.l
    public final void readFully(byte[] sink) {
        j jVar = this.f130750b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            N0(sink.length);
            jVar.readFully(sink);
        } catch (EOFException e13) {
            int i13 = 0;
            while (true) {
                long j13 = jVar.f130711b;
                if (j13 <= 0) {
                    throw e13;
                }
                int read = jVar.read(sink, i13, (int) j13);
                if (read == -1) {
                    throw new AssertionError();
                }
                i13 += read;
            }
        }
    }

    @Override // wo2.l
    public final int readInt() {
        N0(4L);
        return this.f130750b.readInt();
    }

    @Override // wo2.l
    public final long readLong() {
        N0(8L);
        return this.f130750b.readLong();
    }

    @Override // wo2.l
    public final short readShort() {
        N0(2L);
        return this.f130750b.readShort();
    }

    @Override // wo2.l
    public final boolean request(long j13) {
        j jVar;
        if (j13 < 0) {
            throw new IllegalArgumentException(a.a.g("byteCount < 0: ", j13).toString());
        }
        if (!(!this.f130751c)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            jVar = this.f130750b;
            if (jVar.f130711b >= j13) {
                return true;
            }
        } while (this.f130749a.read(jVar, 8192L) != -1);
        return false;
    }

    @Override // wo2.l
    public final void skip(long j13) {
        if (!(!this.f130751c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j13 > 0) {
            j jVar = this.f130750b;
            if (jVar.f130711b == 0 && this.f130749a.read(jVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j13, jVar.f130711b);
            jVar.skip(min);
            j13 -= min;
        }
    }

    @Override // wo2.e0
    public final i0 timeout() {
        return this.f130749a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f130749a + ')';
    }

    @Override // wo2.e0
    public final long read(j sink, long j13) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j13 >= 0) {
            if (!this.f130751c) {
                j jVar = this.f130750b;
                if (jVar.f130711b == 0 && this.f130749a.read(jVar, 8192L) == -1) {
                    return -1L;
                }
                return jVar.read(sink, Math.min(j13, jVar.f130711b));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(a.a.g("byteCount < 0: ", j13).toString());
    }
}
