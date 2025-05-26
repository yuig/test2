package wo2;

import a.cb;
import ao2.m0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes2.dex */
public final class j implements l, k, Cloneable, ByteChannel {

    /* renamed from: a */
    public z f130710a;

    /* renamed from: b */
    public long f130711b;

    public final byte[] A(long j13) {
        if (j13 < 0 || j13 > 2147483647L) {
            throw new IllegalArgumentException(a.a.g("byteCount: ", j13).toString());
        }
        if (this.f130711b < j13) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j13];
        readFully(bArr);
        return bArr;
    }

    @Override // wo2.l
    public final String B0() {
        return Z(Long.MAX_VALUE);
    }

    @Override // wo2.l
    public final String C1(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return L(this.f130711b, charset);
    }

    @Override // wo2.k
    public final /* bridge */ /* synthetic */ k E1(byte[] bArr, int i13, int i14) {
        W(bArr, i13, i14);
        return this;
    }

    @Override // wo2.k
    public final /* bridge */ /* synthetic */ k F1(long j13) {
        d0(j13);
        return this;
    }

    @Override // wo2.k
    public final /* bridge */ /* synthetic */ k I(int i13) {
        g0(i13);
        return this;
    }

    @Override // wo2.k
    public final /* bridge */ /* synthetic */ k I0(byte[] bArr) {
        U(bArr);
        return this;
    }

    @Override // wo2.k
    public final /* bridge */ /* synthetic */ k I1(int i13, int i14, String str) {
        q0(i13, i14, str);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        r1 = new wo2.j();
        r1.b0(r8);
        r1.a0(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r2 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: ".concat(r1.M()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long J() {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wo2.j.J():long");
    }

    public final short K() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    public final String L(long j13, Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j13 < 0 || j13 > 2147483647L) {
            throw new IllegalArgumentException(a.a.g("byteCount: ", j13).toString());
        }
        if (this.f130711b < j13) {
            throw new EOFException();
        }
        if (j13 == 0) {
            return "";
        }
        z zVar = this.f130710a;
        Intrinsics.f(zVar);
        int i13 = zVar.f130753b;
        if (i13 + j13 > zVar.f130754c) {
            return new String(A(j13), charset);
        }
        int i14 = (int) j13;
        String str = new String(zVar.f130752a, i13, i14, charset);
        int i15 = zVar.f130753b + i14;
        zVar.f130753b = i15;
        this.f130711b -= j13;
        if (i15 == zVar.f130754c) {
            this.f130710a = zVar.a();
            a0.a(zVar);
        }
        return str;
    }

    @Override // wo2.l
    public final long L0(m targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return w(0L, targetBytes);
    }

    public final String M() {
        return L(this.f130711b, Charsets.UTF_8);
    }

    @Override // wo2.l
    public final void N0(long j13) {
        if (this.f130711b < j13) {
            throw new EOFException();
        }
    }

    public final int O() {
        int i13;
        int i14;
        int i15;
        if (this.f130711b == 0) {
            throw new EOFException();
        }
        byte k13 = k(0L);
        if ((k13 & 128) == 0) {
            i13 = k13 & Byte.MAX_VALUE;
            i15 = 0;
            i14 = 1;
        } else if ((k13 & 224) == 192) {
            i13 = k13 & 31;
            i14 = 2;
            i15 = 128;
        } else if ((k13 & 240) == 224) {
            i13 = k13 & 15;
            i14 = 3;
            i15 = 2048;
        } else {
            if ((k13 & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i13 = k13 & 7;
            i14 = 4;
            i15 = 65536;
        }
        long j13 = i14;
        if (this.f130711b < j13) {
            StringBuilder s13 = a.a.s("size < ", i14, ": ");
            s13.append(this.f130711b);
            s13.append(" (to read code point prefixed 0x");
            s13.append(b.d(k13));
            s13.append(')');
            throw new EOFException(s13.toString());
        }
        for (int i16 = 1; i16 < i14; i16++) {
            long j14 = i16;
            byte k14 = k(j14);
            if ((k14 & 192) != 128) {
                skip(j14);
                return 65533;
            }
            i13 = (i13 << 6) | (k14 & 63);
        }
        skip(j13);
        if (i13 > 1114111) {
            return 65533;
        }
        if ((55296 > i13 || i13 >= 57344) && i13 >= i15) {
            return i13;
        }
        return 65533;
    }

    @Override // wo2.k
    public final /* bridge */ /* synthetic */ k O0(long j13) {
        b0(j13);
        return this;
    }

    public final m P(int i13) {
        if (i13 == 0) {
            return m.f130712d;
        }
        b.b(this.f130711b, 0L, i13);
        z zVar = this.f130710a;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            Intrinsics.f(zVar);
            int i17 = zVar.f130754c;
            int i18 = zVar.f130753b;
            if (i17 == i18) {
                throw new AssertionError("s.limit == s.pos");
            }
            i15 += i17 - i18;
            i16++;
            zVar = zVar.f130757f;
        }
        byte[][] bArr = new byte[i16][];
        int[] iArr = new int[i16 * 2];
        z zVar2 = this.f130710a;
        int i19 = 0;
        while (i14 < i13) {
            Intrinsics.f(zVar2);
            bArr[i19] = zVar2.f130752a;
            i14 += zVar2.f130754c - zVar2.f130753b;
            iArr[i19] = Math.min(i14, i13);
            iArr[i19 + i16] = zVar2.f130753b;
            zVar2.f130755d = true;
            i19++;
            zVar2 = zVar2.f130757f;
        }
        return new b0(bArr, iArr);
    }

    @Override // wo2.l
    public final boolean P0(long j13, m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int b13 = bytes.b();
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j13 < 0 || b13 < 0 || this.f130711b - j13 < b13 || bytes.b() < b13) {
            return false;
        }
        for (int i13 = 0; i13 < b13; i13++) {
            if (k(i13 + j13) != bytes.e(i13)) {
                return false;
            }
        }
        return true;
    }

    public final z Q(int i13) {
        if (i13 < 1 || i13 > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        z zVar = this.f130710a;
        if (zVar == null) {
            z b13 = a0.b();
            this.f130710a = b13;
            b13.f130758g = b13;
            b13.f130757f = b13;
            return b13;
        }
        z zVar2 = zVar.f130758g;
        Intrinsics.f(zVar2);
        if (zVar2.f130754c + i13 <= 8192 && zVar2.f130756e) {
            return zVar2;
        }
        z b14 = a0.b();
        zVar2.b(b14);
        return b14;
    }

    @Override // wo2.l
    public final void R(j sink, long j13) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j14 = this.f130711b;
        if (j14 >= j13) {
            sink.write(this, j13);
        } else {
            sink.write(this, j14);
            throw new EOFException();
        }
    }

    public final void S(m byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.k(this, byteString.b());
    }

    public final void U(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        W(source, 0, source.length);
    }

    @Override // wo2.k
    public final k V() {
        return this;
    }

    public final void W(byte[] source, int i13, int i14) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j13 = i14;
        b.b(source.length, i13, j13);
        int i15 = i14 + i13;
        while (i13 < i15) {
            z Q = Q(1);
            int min = Math.min(i15 - i13, 8192 - Q.f130754c);
            int i16 = i13 + min;
            kotlin.collections.z.f(Q.f130754c, i13, i16, source, Q.f130752a);
            Q.f130754c += min;
            i13 = i16;
        }
        this.f130711b += j13;
    }

    @Override // wo2.l
    public final String Z(long j13) {
        if (j13 < 0) {
            throw new IllegalArgumentException(a.a.g("limit < 0: ", j13).toString());
        }
        long j14 = j13 != Long.MAX_VALUE ? j13 + 1 : Long.MAX_VALUE;
        long m13 = m((byte) 10, 0L, j14);
        if (m13 != -1) {
            return xo2.a.b(this, m13);
        }
        if (j14 < this.f130711b && k(j14 - 1) == 13 && k(j14) == 10) {
            return xo2.a.b(this, j14);
        }
        j jVar = new j();
        h(0L, Math.min(32, this.f130711b), jVar);
        throw new EOFException("\\n not found: limit=" + Math.min(this.f130711b, j13) + " content=" + jVar.a1(jVar.f130711b).c() + (char) 8230);
    }

    public final void a() {
        skip(this.f130711b);
    }

    public final void a0(int i13) {
        z Q = Q(1);
        int i14 = Q.f130754c;
        Q.f130754c = i14 + 1;
        Q.f130752a[i14] = (byte) i13;
        this.f130711b++;
    }

    @Override // wo2.l
    public final m a1(long j13) {
        if (j13 < 0 || j13 > 2147483647L) {
            throw new IllegalArgumentException(a.a.g("byteCount: ", j13).toString());
        }
        if (this.f130711b < j13) {
            throw new EOFException();
        }
        if (j13 < 4096) {
            return new m(A(j13));
        }
        m P = P((int) j13);
        skip(j13);
        return P;
    }

    public final void b0(long j13) {
        boolean z13;
        byte[] bArr;
        if (j13 == 0) {
            a0(48);
            return;
        }
        int i13 = 1;
        if (j13 < 0) {
            j13 = -j13;
            if (j13 < 0) {
                r0("-9223372036854775808");
                return;
            }
            z13 = true;
        } else {
            z13 = false;
        }
        if (j13 >= 100000000) {
            i13 = j13 < 1000000000000L ? j13 < 10000000000L ? j13 < 1000000000 ? 9 : 10 : j13 < 100000000000L ? 11 : 12 : j13 < 1000000000000000L ? j13 < 10000000000000L ? 13 : j13 < 100000000000000L ? 14 : 15 : j13 < 100000000000000000L ? j13 < 10000000000000000L ? 16 : 17 : j13 < 1000000000000000000L ? 18 : 19;
        } else if (j13 >= 10000) {
            i13 = j13 < 1000000 ? j13 < 100000 ? 5 : 6 : j13 < 10000000 ? 7 : 8;
        } else if (j13 >= 100) {
            i13 = j13 < 1000 ? 3 : 4;
        } else if (j13 >= 10) {
            i13 = 2;
        }
        if (z13) {
            i13++;
        }
        z Q = Q(i13);
        int i14 = Q.f130754c + i13;
        while (true) {
            bArr = Q.f130752a;
            if (j13 == 0) {
                break;
            }
            long j14 = 10;
            i14--;
            bArr[i14] = xo2.a.f135634a[(int) (j13 % j14)];
            j13 /= j14;
        }
        if (z13) {
            bArr[i14 - 1] = 45;
        }
        Q.f130754c += i13;
        this.f130711b += i13;
    }

    /* renamed from: c */
    public final j clone() {
        j jVar = new j();
        if (this.f130711b != 0) {
            z zVar = this.f130710a;
            Intrinsics.f(zVar);
            z c13 = zVar.c();
            jVar.f130710a = c13;
            c13.f130758g = c13;
            c13.f130757f = c13;
            for (z zVar2 = zVar.f130757f; zVar2 != zVar; zVar2 = zVar2.f130757f) {
                z zVar3 = c13.f130758g;
                Intrinsics.f(zVar3);
                Intrinsics.f(zVar2);
                zVar3.b(zVar2.c());
            }
            jVar.f130711b = this.f130711b;
        }
        return jVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, wo2.c0
    public final void close() {
    }

    public final void d0(long j13) {
        if (j13 == 0) {
            a0(48);
            return;
        }
        long j14 = (j13 >>> 1) | j13;
        long j15 = j14 | (j14 >>> 2);
        long j16 = j15 | (j15 >>> 4);
        long j17 = j16 | (j16 >>> 8);
        long j18 = j17 | (j17 >>> 16);
        long j19 = j18 | (j18 >>> 32);
        long j23 = j19 - ((j19 >>> 1) & 6148914691236517205L);
        long j24 = ((j23 >>> 2) & 3689348814741910323L) + (j23 & 3689348814741910323L);
        long j25 = ((j24 >>> 4) + j24) & 1085102592571150095L;
        long j26 = j25 + (j25 >>> 8);
        long j27 = j26 + (j26 >>> 16);
        int i13 = (int) ((((j27 & 63) + ((j27 >>> 32) & 63)) + 3) / 4);
        z Q = Q(i13);
        int i14 = Q.f130754c;
        for (int i15 = (i14 + i13) - 1; i15 >= i14; i15--) {
            Q.f130752a[i15] = xo2.a.f135634a[(int) (15 & j13)];
            j13 >>>= 4;
        }
        Q.f130754c += i13;
        this.f130711b += i13;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                long j13 = this.f130711b;
                j jVar = (j) obj;
                if (j13 == jVar.f130711b) {
                    if (j13 != 0) {
                        z zVar = this.f130710a;
                        Intrinsics.f(zVar);
                        z zVar2 = jVar.f130710a;
                        Intrinsics.f(zVar2);
                        int i13 = zVar.f130753b;
                        int i14 = zVar2.f130753b;
                        long j14 = 0;
                        while (j14 < this.f130711b) {
                            long min = Math.min(zVar.f130754c - i13, zVar2.f130754c - i14);
                            long j15 = 0;
                            while (j15 < min) {
                                int i15 = i13 + 1;
                                byte b13 = zVar.f130752a[i13];
                                int i16 = i14 + 1;
                                if (b13 == zVar2.f130752a[i14]) {
                                    j15++;
                                    i14 = i16;
                                    i13 = i15;
                                }
                            }
                            if (i13 == zVar.f130754c) {
                                z zVar3 = zVar.f130757f;
                                Intrinsics.f(zVar3);
                                i13 = zVar3.f130753b;
                                zVar = zVar3;
                            }
                            if (i14 == zVar2.f130754c) {
                                zVar2 = zVar2.f130757f;
                                Intrinsics.f(zVar2);
                                i14 = zVar2.f130753b;
                            }
                            j14 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // wo2.l
    public final long f0(c0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j13 = this.f130711b;
        if (j13 > 0) {
            sink.write(this, j13);
        }
        return j13;
    }

    @Override // wo2.k, wo2.c0, java.io.Flushable
    public final void flush() {
    }

    public final long g() {
        long j13 = this.f130711b;
        if (j13 == 0) {
            return 0L;
        }
        z zVar = this.f130710a;
        Intrinsics.f(zVar);
        z zVar2 = zVar.f130758g;
        Intrinsics.f(zVar2);
        if (zVar2.f130754c < 8192 && zVar2.f130756e) {
            j13 -= r3 - zVar2.f130753b;
        }
        return j13;
    }

    public final void g0(int i13) {
        z Q = Q(4);
        int i14 = Q.f130754c;
        byte[] bArr = Q.f130752a;
        bArr[i14] = (byte) ((i13 >>> 24) & 255);
        bArr[i14 + 1] = (byte) ((i13 >>> 16) & 255);
        bArr[i14 + 2] = (byte) ((i13 >>> 8) & 255);
        bArr[i14 + 3] = (byte) (i13 & 255);
        Q.f130754c = i14 + 4;
        this.f130711b += 4;
    }

    @Override // wo2.k
    public final /* bridge */ /* synthetic */ k g1(int i13) {
        m0(i13);
        return this;
    }

    public final void h(long j13, long j14, j out) {
        Intrinsics.checkNotNullParameter(out, "out");
        b.b(this.f130711b, j13, j14);
        if (j14 == 0) {
            return;
        }
        out.f130711b += j14;
        z zVar = this.f130710a;
        while (true) {
            Intrinsics.f(zVar);
            long j15 = zVar.f130754c - zVar.f130753b;
            if (j13 < j15) {
                break;
            }
            j13 -= j15;
            zVar = zVar.f130757f;
        }
        while (j14 > 0) {
            Intrinsics.f(zVar);
            z c13 = zVar.c();
            int i13 = c13.f130753b + ((int) j13);
            c13.f130753b = i13;
            c13.f130754c = Math.min(i13 + ((int) j14), c13.f130754c);
            z zVar2 = out.f130710a;
            if (zVar2 == null) {
                c13.f130758g = c13;
                c13.f130757f = c13;
                out.f130710a = c13;
            } else {
                z zVar3 = zVar2.f130758g;
                Intrinsics.f(zVar3);
                zVar3.b(c13);
            }
            j14 -= c13.f130754c - c13.f130753b;
            zVar = zVar.f130757f;
            j13 = 0;
        }
    }

    public final int hashCode() {
        z zVar = this.f130710a;
        if (zVar == null) {
            return 0;
        }
        int i13 = 1;
        do {
            int i14 = zVar.f130754c;
            for (int i15 = zVar.f130753b; i15 < i14; i15++) {
                i13 = (i13 * 31) + zVar.f130752a[i15];
            }
            zVar = zVar.f130757f;
            Intrinsics.f(zVar);
        } while (zVar != this.f130710a);
        return i13;
    }

    public final void i0(long j13) {
        z Q = Q(8);
        int i13 = Q.f130754c;
        byte[] bArr = Q.f130752a;
        bArr[i13] = (byte) ((j13 >>> 56) & 255);
        bArr[i13 + 1] = (byte) ((j13 >>> 48) & 255);
        bArr[i13 + 2] = (byte) ((j13 >>> 40) & 255);
        bArr[i13 + 3] = (byte) ((j13 >>> 32) & 255);
        bArr[i13 + 4] = (byte) ((j13 >>> 24) & 255);
        bArr[i13 + 5] = (byte) ((j13 >>> 16) & 255);
        bArr[i13 + 6] = (byte) ((j13 >>> 8) & 255);
        bArr[i13 + 7] = (byte) (j13 & 255);
        Q.f130754c = i13 + 8;
        this.f130711b += 8;
    }

    @Override // wo2.k
    public final long i2(e0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j13 = 0;
        while (true) {
            long read = source.read(this, 8192L);
            if (read == -1) {
                return j13;
            }
            j13 += read;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // wo2.l
    public final int j0(v options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int c13 = xo2.a.c(this, options, false);
        if (c13 == -1) {
            return -1;
        }
        skip(options.f130738b[c13].b());
        return c13;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d A[EDGE_INSN: B:40:0x008d->B:37:0x008d BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    @Override // wo2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long j2() {
        /*
            r13 = this;
            long r0 = r13.f130711b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L94
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            wo2.z r6 = r13.f130710a
            kotlin.jvm.internal.Intrinsics.f(r6)
            int r7 = r6.f130753b
            int r8 = r6.f130754c
        L14:
            if (r7 >= r8) goto L79
            byte[] r9 = r6.f130752a
            r9 = r9[r7]
            r10 = 48
            if (r9 < r10) goto L25
            r10 = 57
            if (r9 > r10) goto L25
            int r10 = r9 + (-48)
            goto L3a
        L25:
            r10 = 97
            if (r9 < r10) goto L30
            r10 = 102(0x66, float:1.43E-43)
            if (r9 > r10) goto L30
            int r10 = r9 + (-87)
            goto L3a
        L30:
            r10 = 65
            if (r9 < r10) goto L65
            r10 = 70
            if (r9 > r10) goto L65
            int r10 = r9 + (-55)
        L3a:
            r11 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r11 = r11 & r4
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 != 0) goto L4a
            r9 = 4
            long r4 = r4 << r9
            long r9 = (long) r10
            long r4 = r4 | r9
            int r7 = r7 + 1
            int r0 = r0 + 1
            goto L14
        L4a:
            wo2.j r0 = new wo2.j
            r0.<init>()
            r0.d0(r4)
            r0.a0(r9)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.M()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L65:
            if (r0 == 0) goto L69
            r1 = 1
            goto L79
        L69:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = wo2.b.d(r9)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L79:
            if (r7 != r8) goto L85
            wo2.z r7 = r6.a()
            r13.f130710a = r7
            wo2.a0.a(r6)
            goto L87
        L85:
            r6.f130753b = r7
        L87:
            if (r1 != 0) goto L8d
            wo2.z r6 = r13.f130710a
            if (r6 != 0) goto Lb
        L8d:
            long r1 = r13.f130711b
            long r6 = (long) r0
            long r1 = r1 - r6
            r13.f130711b = r1
            return r4
        L94:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wo2.j.j2():long");
    }

    public final byte k(long j13) {
        b.b(this.f130711b, j13, 1L);
        z zVar = this.f130710a;
        if (zVar == null) {
            Intrinsics.f(null);
            throw null;
        }
        long j14 = this.f130711b;
        if (j14 - j13 < j13) {
            while (j14 > j13) {
                zVar = zVar.f130758g;
                Intrinsics.f(zVar);
                j14 -= zVar.f130754c - zVar.f130753b;
            }
            return zVar.f130752a[(int) ((zVar.f130753b + j13) - j14)];
        }
        long j15 = 0;
        while (true) {
            int i13 = zVar.f130754c;
            int i14 = zVar.f130753b;
            long j16 = (i13 - i14) + j15;
            if (j16 > j13) {
                return zVar.f130752a[(int) ((i14 + j13) - j15)];
            }
            zVar = zVar.f130757f;
            Intrinsics.f(zVar);
            j15 = j16;
        }
    }

    @Override // wo2.l
    public final h k2() {
        return new h(this, 0);
    }

    @Override // wo2.l, wo2.k
    public final j l() {
        return this;
    }

    @Override // wo2.k
    public final /* bridge */ /* synthetic */ k l0(String str) {
        r0(str);
        return this;
    }

    public final long m(byte b13, long j13, long j14) {
        z zVar;
        long j15 = 0;
        if (0 > j13 || j13 > j14) {
            StringBuilder sb3 = new StringBuilder("size=");
            sb3.append(this.f130711b);
            cb.v(sb3, " fromIndex=", j13, " toIndex=");
            sb3.append(j14);
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        long j16 = this.f130711b;
        if (j14 > j16) {
            j14 = j16;
        }
        if (j13 == j14 || (zVar = this.f130710a) == null) {
            return -1L;
        }
        if (j16 - j13 < j13) {
            while (j16 > j13) {
                zVar = zVar.f130758g;
                Intrinsics.f(zVar);
                j16 -= zVar.f130754c - zVar.f130753b;
            }
            while (j16 < j14) {
                int min = (int) Math.min(zVar.f130754c, (zVar.f130753b + j14) - j16);
                for (int i13 = (int) ((zVar.f130753b + j13) - j16); i13 < min; i13++) {
                    if (zVar.f130752a[i13] == b13) {
                        return (i13 - zVar.f130753b) + j16;
                    }
                }
                j16 += zVar.f130754c - zVar.f130753b;
                zVar = zVar.f130757f;
                Intrinsics.f(zVar);
                j13 = j16;
            }
            return -1L;
        }
        while (true) {
            long j17 = (zVar.f130754c - zVar.f130753b) + j15;
            if (j17 > j13) {
                break;
            }
            zVar = zVar.f130757f;
            Intrinsics.f(zVar);
            j15 = j17;
        }
        while (j15 < j14) {
            int min2 = (int) Math.min(zVar.f130754c, (zVar.f130753b + j14) - j15);
            for (int i14 = (int) ((zVar.f130753b + j13) - j15); i14 < min2; i14++) {
                if (zVar.f130752a[i14] == b13) {
                    return (i14 - zVar.f130753b) + j15;
                }
            }
            j15 += zVar.f130754c - zVar.f130753b;
            zVar = zVar.f130757f;
            Intrinsics.f(zVar);
            j13 = j15;
        }
        return -1L;
    }

    public final void m0(int i13) {
        z Q = Q(2);
        int i14 = Q.f130754c;
        byte[] bArr = Q.f130752a;
        bArr[i14] = (byte) ((i13 >>> 8) & 255);
        bArr[i14 + 1] = (byte) (i13 & 255);
        Q.f130754c = i14 + 2;
        this.f130711b += 2;
    }

    @Override // wo2.l
    public final byte[] m1() {
        return A(this.f130711b);
    }

    @Override // wo2.k
    public final k n() {
        return this;
    }

    public final void n0(String string, int i13, int i14, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.d("beginIndex < 0: ", i13).toString());
        }
        if (i14 < i13) {
            throw new IllegalArgumentException(a.a.f("endIndex < beginIndex: ", i14, " < ", i13).toString());
        }
        if (i14 > string.length()) {
            StringBuilder s13 = a.a.s("endIndex > string.length: ", i14, " > ");
            s13.append(string.length());
            throw new IllegalArgumentException(s13.toString().toString());
        }
        if (Intrinsics.d(charset, Charsets.UTF_8)) {
            q0(i13, i14, string);
            return;
        }
        String substring = string.substring(i13, i14);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        byte[] bytes = substring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        W(bytes, 0, bytes.length);
    }

    public final long o(long j13, m bytes) {
        long j14 = j13;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.b() <= 0) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j15 = 0;
        if (j14 < 0) {
            throw new IllegalArgumentException(a.a.g("fromIndex < 0: ", j14).toString());
        }
        z zVar = this.f130710a;
        if (zVar != null) {
            long j16 = this.f130711b;
            if (j16 - j14 < j14) {
                while (j16 > j14) {
                    zVar = zVar.f130758g;
                    Intrinsics.f(zVar);
                    j16 -= zVar.f130754c - zVar.f130753b;
                }
                byte[] d2 = bytes.d();
                byte b13 = d2[0];
                int b14 = bytes.b();
                long j17 = (this.f130711b - b14) + 1;
                while (j16 < j17) {
                    int min = (int) Math.min(zVar.f130754c, (zVar.f130753b + j17) - j16);
                    for (int i13 = (int) ((zVar.f130753b + j14) - j16); i13 < min; i13++) {
                        if (zVar.f130752a[i13] == b13 && xo2.a.a(zVar, i13 + 1, d2, b14)) {
                            return (i13 - zVar.f130753b) + j16;
                        }
                    }
                    j16 += zVar.f130754c - zVar.f130753b;
                    zVar = zVar.f130757f;
                    Intrinsics.f(zVar);
                    j14 = j16;
                }
            } else {
                while (true) {
                    long j18 = (zVar.f130754c - zVar.f130753b) + j15;
                    if (j18 > j14) {
                        break;
                    }
                    zVar = zVar.f130757f;
                    Intrinsics.f(zVar);
                    j15 = j18;
                }
                byte[] d13 = bytes.d();
                byte b15 = d13[0];
                int b16 = bytes.b();
                long j19 = (this.f130711b - b16) + 1;
                while (j15 < j19) {
                    int min2 = (int) Math.min(zVar.f130754c, (zVar.f130753b + j19) - j15);
                    for (int i14 = (int) ((zVar.f130753b + j14) - j15); i14 < min2; i14++) {
                        if (zVar.f130752a[i14] == b15 && xo2.a.a(zVar, i14 + 1, d13, b16)) {
                            return (i14 - zVar.f130753b) + j15;
                        }
                    }
                    j15 += zVar.f130754c - zVar.f130753b;
                    zVar = zVar.f130757f;
                    Intrinsics.f(zVar);
                    j14 = j15;
                }
            }
        }
        return -1L;
    }

    @Override // wo2.l
    public final boolean o1() {
        return this.f130711b == 0;
    }

    @Override // wo2.k
    public final /* bridge */ /* synthetic */ k p1(int i13) {
        a0(i13);
        return this;
    }

    @Override // wo2.l
    public final y peek() {
        return m0.i(new w(this));
    }

    public final long q(m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return o(0L, bytes);
    }

    public final void q0(int i13, int i14, String string) {
        char charAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.d("beginIndex < 0: ", i13).toString());
        }
        if (i14 < i13) {
            throw new IllegalArgumentException(a.a.f("endIndex < beginIndex: ", i14, " < ", i13).toString());
        }
        if (i14 > string.length()) {
            StringBuilder s13 = a.a.s("endIndex > string.length: ", i14, " > ");
            s13.append(string.length());
            throw new IllegalArgumentException(s13.toString().toString());
        }
        while (i13 < i14) {
            char charAt2 = string.charAt(i13);
            if (charAt2 < 128) {
                z Q = Q(1);
                int i15 = Q.f130754c - i13;
                int min = Math.min(i14, 8192 - i15);
                int i16 = i13 + 1;
                byte[] bArr = Q.f130752a;
                bArr[i13 + i15] = (byte) charAt2;
                while (true) {
                    i13 = i16;
                    if (i13 >= min || (charAt = string.charAt(i13)) >= 128) {
                        break;
                    }
                    i16 = i13 + 1;
                    bArr[i13 + i15] = (byte) charAt;
                }
                int i17 = Q.f130754c;
                int i18 = (i15 + i13) - i17;
                Q.f130754c = i17 + i18;
                this.f130711b += i18;
            } else {
                if (charAt2 < 2048) {
                    z Q2 = Q(2);
                    int i19 = Q2.f130754c;
                    byte b13 = (byte) ((charAt2 >> 6) | RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
                    byte[] bArr2 = Q2.f130752a;
                    bArr2[i19] = b13;
                    bArr2[i19 + 1] = (byte) ((charAt2 & '?') | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                    Q2.f130754c = i19 + 2;
                    this.f130711b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    z Q3 = Q(3);
                    int i23 = Q3.f130754c;
                    byte b14 = (byte) ((charAt2 >> '\f') | RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL);
                    byte[] bArr3 = Q3.f130752a;
                    bArr3[i23] = b14;
                    bArr3[i23 + 1] = (byte) ((63 & (charAt2 >> 6)) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                    bArr3[i23 + 2] = (byte) ((charAt2 & '?') | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                    Q3.f130754c = i23 + 3;
                    this.f130711b += 3;
                } else {
                    int i24 = i13 + 1;
                    char charAt3 = i24 < i14 ? string.charAt(i24) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        a0(63);
                        i13 = i24;
                    } else {
                        int i25 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        z Q4 = Q(4);
                        int i26 = Q4.f130754c;
                        byte b15 = (byte) ((i25 >> 18) | RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM);
                        byte[] bArr4 = Q4.f130752a;
                        bArr4[i26] = b15;
                        bArr4[i26 + 1] = (byte) (((i25 >> 12) & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                        bArr4[i26 + 2] = (byte) (((i25 >> 6) & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                        bArr4[i26 + 3] = (byte) ((i25 & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                        Q4.f130754c = i26 + 4;
                        this.f130711b += 4;
                        i13 += 2;
                    }
                }
                i13++;
            }
        }
    }

    public final void r0(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        q0(0, string.length(), string);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        z zVar = this.f130710a;
        if (zVar == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), zVar.f130754c - zVar.f130753b);
        sink.put(zVar.f130752a, zVar.f130753b, min);
        int i13 = zVar.f130753b + min;
        zVar.f130753b = i13;
        this.f130711b -= min;
        if (i13 == zVar.f130754c) {
            this.f130710a = zVar.a();
            a0.a(zVar);
        }
        return min;
    }

    @Override // wo2.l
    public final byte readByte() {
        if (this.f130711b == 0) {
            throw new EOFException();
        }
        z zVar = this.f130710a;
        Intrinsics.f(zVar);
        int i13 = zVar.f130753b;
        int i14 = zVar.f130754c;
        int i15 = i13 + 1;
        byte b13 = zVar.f130752a[i13];
        this.f130711b--;
        if (i15 == i14) {
            this.f130710a = zVar.a();
            a0.a(zVar);
        } else {
            zVar.f130753b = i15;
        }
        return b13;
    }

    @Override // wo2.l
    public final void readFully(byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i13 = 0;
        while (i13 < sink.length) {
            int read = read(sink, i13, sink.length - i13);
            if (read == -1) {
                throw new EOFException();
            }
            i13 += read;
        }
    }

    @Override // wo2.l
    public final int readInt() {
        if (this.f130711b < 4) {
            throw new EOFException();
        }
        z zVar = this.f130710a;
        Intrinsics.f(zVar);
        int i13 = zVar.f130753b;
        int i14 = zVar.f130754c;
        if (i14 - i13 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = zVar.f130752a;
        int i15 = i13 + 3;
        int i16 = ((bArr[i13 + 1] & 255) << 16) | ((bArr[i13] & 255) << 24) | ((bArr[i13 + 2] & 255) << 8);
        int i17 = i13 + 4;
        int i18 = i16 | (bArr[i15] & 255);
        this.f130711b -= 4;
        if (i17 == i14) {
            this.f130710a = zVar.a();
            a0.a(zVar);
        } else {
            zVar.f130753b = i17;
        }
        return i18;
    }

    @Override // wo2.l
    public final long readLong() {
        if (this.f130711b < 8) {
            throw new EOFException();
        }
        z zVar = this.f130710a;
        Intrinsics.f(zVar);
        int i13 = zVar.f130753b;
        int i14 = zVar.f130754c;
        if (i14 - i13 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = zVar.f130752a;
        int i15 = i13 + 7;
        long j13 = ((bArr[i13 + 3] & 255) << 32) | ((bArr[i13] & 255) << 56) | ((bArr[i13 + 1] & 255) << 48) | ((bArr[i13 + 2] & 255) << 40) | ((bArr[i13 + 4] & 255) << 24) | ((bArr[i13 + 5] & 255) << 16) | ((bArr[i13 + 6] & 255) << 8);
        int i16 = i13 + 8;
        long j14 = j13 | (bArr[i15] & 255);
        this.f130711b -= 8;
        if (i16 == i14) {
            this.f130710a = zVar.a();
            a0.a(zVar);
        } else {
            zVar.f130753b = i16;
        }
        return j14;
    }

    @Override // wo2.l
    public final short readShort() {
        if (this.f130711b < 2) {
            throw new EOFException();
        }
        z zVar = this.f130710a;
        Intrinsics.f(zVar);
        int i13 = zVar.f130753b;
        int i14 = zVar.f130754c;
        if (i14 - i13 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i15 = i13 + 1;
        byte[] bArr = zVar.f130752a;
        int i16 = (bArr[i13] & 255) << 8;
        int i17 = i13 + 2;
        int i18 = (bArr[i15] & 255) | i16;
        this.f130711b -= 2;
        if (i17 == i14) {
            this.f130710a = zVar.a();
            a0.a(zVar);
        } else {
            zVar.f130753b = i17;
        }
        return (short) i18;
    }

    @Override // wo2.l
    public final boolean request(long j13) {
        return this.f130711b >= j13;
    }

    public final void s0(int i13) {
        if (i13 < 128) {
            a0(i13);
            return;
        }
        if (i13 < 2048) {
            z Q = Q(2);
            int i14 = Q.f130754c;
            byte b13 = (byte) ((i13 >> 6) | RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
            byte[] bArr = Q.f130752a;
            bArr[i14] = b13;
            bArr[i14 + 1] = (byte) ((i13 & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            Q.f130754c = i14 + 2;
            this.f130711b += 2;
            return;
        }
        if (55296 <= i13 && i13 < 57344) {
            a0(63);
            return;
        }
        if (i13 < 65536) {
            z Q2 = Q(3);
            int i15 = Q2.f130754c;
            byte b14 = (byte) ((i13 >> 12) | RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL);
            byte[] bArr2 = Q2.f130752a;
            bArr2[i15] = b14;
            bArr2[i15 + 1] = (byte) (((i13 >> 6) & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            bArr2[i15 + 2] = (byte) ((i13 & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            Q2.f130754c = i15 + 3;
            this.f130711b += 3;
            return;
        }
        if (i13 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(b.e(i13)));
        }
        z Q3 = Q(4);
        int i16 = Q3.f130754c;
        byte b15 = (byte) ((i13 >> 18) | RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM);
        byte[] bArr3 = Q3.f130752a;
        bArr3[i16] = b15;
        bArr3[i16 + 1] = (byte) (((i13 >> 12) & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        bArr3[i16 + 2] = (byte) (((i13 >> 6) & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        bArr3[i16 + 3] = (byte) ((i13 & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        Q3.f130754c = i16 + 4;
        this.f130711b += 4;
    }

    @Override // wo2.l
    public final void skip(long j13) {
        while (j13 > 0) {
            z zVar = this.f130710a;
            if (zVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j13, zVar.f130754c - zVar.f130753b);
            long j14 = min;
            this.f130711b -= j14;
            j13 -= j14;
            int i13 = zVar.f130753b + min;
            zVar.f130753b = i13;
            if (i13 == zVar.f130754c) {
                this.f130710a = zVar.a();
                a0.a(zVar);
            }
        }
    }

    @Override // wo2.k
    public final /* bridge */ /* synthetic */ k t1(m mVar) {
        S(mVar);
        return this;
    }

    @Override // wo2.e0
    public final i0 timeout() {
        return i0.f130705e;
    }

    public final String toString() {
        long j13 = this.f130711b;
        if (j13 <= 2147483647L) {
            return P((int) j13).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f130711b).toString());
    }

    public final long w(long j13, m targetBytes) {
        int i13;
        int i14;
        int i15;
        int i16;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j14 = 0;
        if (j13 < 0) {
            throw new IllegalArgumentException(a.a.g("fromIndex < 0: ", j13).toString());
        }
        z zVar = this.f130710a;
        if (zVar == null) {
            return -1L;
        }
        long j15 = this.f130711b;
        if (j15 - j13 < j13) {
            while (j15 > j13) {
                zVar = zVar.f130758g;
                Intrinsics.f(zVar);
                j15 -= zVar.f130754c - zVar.f130753b;
            }
            byte[] bArr = targetBytes.f130713a;
            if (bArr.length == 2) {
                byte b13 = bArr[0];
                byte b14 = bArr[1];
                while (j15 < this.f130711b) {
                    i15 = (int) ((zVar.f130753b + j13) - j15);
                    int i17 = zVar.f130754c;
                    while (i15 < i17) {
                        byte b15 = zVar.f130752a[i15];
                        if (b15 == b13 || b15 == b14) {
                            i16 = zVar.f130753b;
                        } else {
                            i15++;
                        }
                    }
                    j15 += zVar.f130754c - zVar.f130753b;
                    zVar = zVar.f130757f;
                    Intrinsics.f(zVar);
                    j13 = j15;
                }
                return -1L;
            }
            while (j15 < this.f130711b) {
                i15 = (int) ((zVar.f130753b + j13) - j15);
                int i18 = zVar.f130754c;
                while (i15 < i18) {
                    byte b16 = zVar.f130752a[i15];
                    for (byte b17 : bArr) {
                        if (b16 == b17) {
                            i16 = zVar.f130753b;
                        }
                    }
                    i15++;
                }
                j15 += zVar.f130754c - zVar.f130753b;
                zVar = zVar.f130757f;
                Intrinsics.f(zVar);
                j13 = j15;
            }
            return -1L;
            return (i15 - i16) + j15;
        }
        while (true) {
            long j16 = (zVar.f130754c - zVar.f130753b) + j14;
            if (j16 > j13) {
                break;
            }
            zVar = zVar.f130757f;
            Intrinsics.f(zVar);
            j14 = j16;
        }
        byte[] bArr2 = targetBytes.f130713a;
        if (bArr2.length == 2) {
            byte b18 = bArr2[0];
            byte b19 = bArr2[1];
            while (j14 < this.f130711b) {
                i13 = (int) ((zVar.f130753b + j13) - j14);
                int i19 = zVar.f130754c;
                while (i13 < i19) {
                    byte b23 = zVar.f130752a[i13];
                    if (b23 == b18 || b23 == b19) {
                        i14 = zVar.f130753b;
                    } else {
                        i13++;
                    }
                }
                j14 += zVar.f130754c - zVar.f130753b;
                zVar = zVar.f130757f;
                Intrinsics.f(zVar);
                j13 = j14;
            }
            return -1L;
        }
        while (j14 < this.f130711b) {
            i13 = (int) ((zVar.f130753b + j13) - j14);
            int i23 = zVar.f130754c;
            while (i13 < i23) {
                byte b24 = zVar.f130752a[i13];
                for (byte b25 : bArr2) {
                    if (b24 == b25) {
                        i14 = zVar.f130753b;
                    }
                }
                i13++;
            }
            j14 += zVar.f130754c - zVar.f130753b;
            zVar = zVar.f130757f;
            Intrinsics.f(zVar);
            j13 = j14;
        }
        return -1L;
        return (i13 - i14) + j14;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i13 = remaining;
        while (i13 > 0) {
            z Q = Q(1);
            int min = Math.min(i13, 8192 - Q.f130754c);
            source.get(Q.f130752a, Q.f130754c, min);
            i13 -= min;
            Q.f130754c += min;
        }
        this.f130711b += remaining;
        return remaining;
    }

    public final g z(g unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        byte[] bArr = xo2.a.f135634a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        if (unsafeCursor == b.f130670a) {
            unsafeCursor = new g();
        }
        if (unsafeCursor.f130689a != null) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursor.f130689a = this;
        unsafeCursor.f130690b = true;
        return unsafeCursor;
    }

    @Override // wo2.c0
    public final void write(j source, long j13) {
        z b13;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != this) {
            b.b(source.f130711b, 0L, j13);
            while (j13 > 0) {
                z zVar = source.f130710a;
                Intrinsics.f(zVar);
                int i13 = zVar.f130754c;
                z zVar2 = source.f130710a;
                Intrinsics.f(zVar2);
                long j14 = i13 - zVar2.f130753b;
                int i14 = 0;
                if (j13 < j14) {
                    z zVar3 = this.f130710a;
                    z zVar4 = zVar3 != null ? zVar3.f130758g : null;
                    if (zVar4 != null && zVar4.f130756e) {
                        if ((zVar4.f130754c + j13) - (zVar4.f130755d ? 0 : zVar4.f130753b) <= 8192) {
                            z zVar5 = source.f130710a;
                            Intrinsics.f(zVar5);
                            zVar5.d(zVar4, (int) j13);
                            source.f130711b -= j13;
                            this.f130711b += j13;
                            return;
                        }
                    }
                    z zVar6 = source.f130710a;
                    Intrinsics.f(zVar6);
                    int i15 = (int) j13;
                    if (i15 > 0 && i15 <= zVar6.f130754c - zVar6.f130753b) {
                        if (i15 >= 1024) {
                            b13 = zVar6.c();
                        } else {
                            b13 = a0.b();
                            int i16 = zVar6.f130753b;
                            kotlin.collections.z.j(zVar6.f130752a, b13.f130752a, i16, i16 + i15, 2);
                        }
                        b13.f130754c = b13.f130753b + i15;
                        zVar6.f130753b += i15;
                        z zVar7 = zVar6.f130758g;
                        Intrinsics.f(zVar7);
                        zVar7.b(b13);
                        source.f130710a = b13;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                z zVar8 = source.f130710a;
                Intrinsics.f(zVar8);
                long j15 = zVar8.f130754c - zVar8.f130753b;
                source.f130710a = zVar8.a();
                z zVar9 = this.f130710a;
                if (zVar9 == null) {
                    this.f130710a = zVar8;
                    zVar8.f130758g = zVar8;
                    zVar8.f130757f = zVar8;
                } else {
                    z zVar10 = zVar9.f130758g;
                    Intrinsics.f(zVar10);
                    zVar10.b(zVar8);
                    z zVar11 = zVar8.f130758g;
                    if (zVar11 != zVar8) {
                        Intrinsics.f(zVar11);
                        if (zVar11.f130756e) {
                            int i17 = zVar8.f130754c - zVar8.f130753b;
                            z zVar12 = zVar8.f130758g;
                            Intrinsics.f(zVar12);
                            int i18 = 8192 - zVar12.f130754c;
                            z zVar13 = zVar8.f130758g;
                            Intrinsics.f(zVar13);
                            if (!zVar13.f130755d) {
                                z zVar14 = zVar8.f130758g;
                                Intrinsics.f(zVar14);
                                i14 = zVar14.f130753b;
                            }
                            if (i17 <= i18 + i14) {
                                z zVar15 = zVar8.f130758g;
                                Intrinsics.f(zVar15);
                                zVar8.d(zVar15, i17);
                                zVar8.a();
                                a0.a(zVar8);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                source.f130711b -= j15;
                this.f130711b += j15;
                j13 -= j15;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public final int read(byte[] sink, int i13, int i14) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        b.b(sink.length, i13, i14);
        z zVar = this.f130710a;
        if (zVar == null) {
            return -1;
        }
        int min = Math.min(i14, zVar.f130754c - zVar.f130753b);
        int i15 = zVar.f130753b;
        kotlin.collections.z.f(i13, i15, i15 + min, zVar.f130752a, sink);
        int i16 = zVar.f130753b + min;
        zVar.f130753b = i16;
        this.f130711b -= min;
        if (i16 == zVar.f130754c) {
            this.f130710a = zVar.a();
            a0.a(zVar);
        }
        return min;
    }

    @Override // wo2.e0
    public final long read(j sink, long j13) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j13 >= 0) {
            long j14 = this.f130711b;
            if (j14 == 0) {
                return -1L;
            }
            if (j13 > j14) {
                j13 = j14;
            }
            sink.write(this, j13);
            return j13;
        }
        throw new IllegalArgumentException(a.a.g("byteCount < 0: ", j13).toString());
    }
}
