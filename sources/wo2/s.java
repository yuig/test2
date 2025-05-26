package wo2;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class s implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public byte f130727a;

    /* renamed from: b, reason: collision with root package name */
    public final y f130728b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f130729c;

    /* renamed from: d, reason: collision with root package name */
    public final t f130730d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f130731e;

    public s(e0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        y yVar = new y(source);
        this.f130728b = yVar;
        Inflater inflater = new Inflater(true);
        this.f130729c = inflater;
        this.f130730d = new t(yVar, inflater);
        this.f130731e = new CRC32();
    }

    public static void a(int i13, int i14, String str) {
        if (i14 == i13) {
            return;
        }
        StringBuilder D = ep.b.D(str, ": actual 0x");
        D.append(StringsKt.Q(b.e(i14), 8));
        D.append(" != expected 0x");
        D.append(StringsKt.Q(b.e(i13), 8));
        throw new IOException(D.toString());
    }

    public final void c(long j13, long j14, j jVar) {
        z zVar = jVar.f130710a;
        Intrinsics.f(zVar);
        while (true) {
            int i13 = zVar.f130754c;
            int i14 = zVar.f130753b;
            if (j13 < i13 - i14) {
                break;
            }
            j13 -= i13 - i14;
            zVar = zVar.f130757f;
            Intrinsics.f(zVar);
        }
        while (j14 > 0) {
            int min = (int) Math.min(zVar.f130754c - r5, j14);
            this.f130731e.update(zVar.f130752a, (int) (zVar.f130753b + j13), min);
            j14 -= min;
            zVar = zVar.f130757f;
            Intrinsics.f(zVar);
            j13 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f130730d.close();
    }

    @Override // wo2.e0
    public final long read(j sink, long j13) {
        long j14;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j13 < 0) {
            throw new IllegalArgumentException(a.a.g("byteCount < 0: ", j13).toString());
        }
        if (j13 == 0) {
            return 0L;
        }
        byte b13 = this.f130727a;
        CRC32 crc32 = this.f130731e;
        y yVar = this.f130728b;
        if (b13 == 0) {
            yVar.N0(10L);
            j jVar = yVar.f130750b;
            byte k13 = jVar.k(3L);
            boolean z13 = ((k13 >> 1) & 1) == 1;
            if (z13) {
                c(0L, 10L, yVar.f130750b);
            }
            a(8075, yVar.readShort(), "ID1ID2");
            yVar.skip(8L);
            if (((k13 >> 2) & 1) == 1) {
                yVar.N0(2L);
                if (z13) {
                    c(0L, 2L, yVar.f130750b);
                }
                long K = jVar.K() & 65535;
                yVar.N0(K);
                if (z13) {
                    c(0L, K, yVar.f130750b);
                    j14 = K;
                } else {
                    j14 = K;
                }
                yVar.skip(j14);
            }
            if (((k13 >> 3) & 1) == 1) {
                long a13 = yVar.a();
                if (a13 == -1) {
                    throw new EOFException();
                }
                if (z13) {
                    c(0L, a13 + 1, yVar.f130750b);
                }
                yVar.skip(a13 + 1);
            }
            if (((k13 >> 4) & 1) == 1) {
                long a14 = yVar.a();
                if (a14 == -1) {
                    throw new EOFException();
                }
                if (z13) {
                    c(0L, a14 + 1, yVar.f130750b);
                }
                yVar.skip(a14 + 1);
            }
            if (z13) {
                a(yVar.e(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f130727a = (byte) 1;
        }
        if (this.f130727a == 1) {
            long j15 = sink.f130711b;
            long read = this.f130730d.read(sink, j13);
            if (read != -1) {
                c(j15, read, sink);
                return read;
            }
            this.f130727a = (byte) 2;
        }
        if (this.f130727a == 2) {
            yVar.N0(4L);
            j jVar2 = yVar.f130750b;
            a(b.c(jVar2.readInt()), (int) crc32.getValue(), "CRC");
            yVar.N0(4L);
            a(b.c(jVar2.readInt()), (int) this.f130729c.getBytesWritten(), "ISIZE");
            this.f130727a = (byte) 3;
            if (!yVar.o1()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // wo2.e0
    public final i0 timeout() {
        return this.f130728b.f130749a.timeout();
    }
}
