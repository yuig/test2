package wo2;

import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final x f130722a;

    /* renamed from: b, reason: collision with root package name */
    public final Deflater f130723b;

    /* renamed from: c, reason: collision with root package name */
    public final n f130724c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f130725d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f130726e;

    public r(c0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        x xVar = new x(sink);
        this.f130722a = xVar;
        Deflater deflater = new Deflater(-1, true);
        this.f130723b = deflater;
        this.f130724c = new n(xVar, deflater);
        this.f130726e = new CRC32();
        j jVar = xVar.f130747b;
        jVar.m0(8075);
        jVar.a0(8);
        jVar.a0(0);
        jVar.g0(0);
        jVar.a0(0);
        jVar.a0(0);
    }

    @Override // wo2.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.f130723b;
        x xVar = this.f130722a;
        if (this.f130725d) {
            return;
        }
        try {
            n nVar = this.f130724c;
            nVar.f130717b.finish();
            nVar.a(false);
            xVar.a((int) this.f130726e.getValue());
            xVar.a((int) deflater.getBytesRead());
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
            xVar.close();
        } catch (Throwable th5) {
            if (th == null) {
                th = th5;
            }
        }
        this.f130725d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // wo2.c0, java.io.Flushable
    public final void flush() {
        this.f130724c.flush();
    }

    @Override // wo2.c0
    public final i0 timeout() {
        return this.f130722a.f130746a.timeout();
    }

    @Override // wo2.c0
    public final void write(j source, long j13) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (j13 < 0) {
            throw new IllegalArgumentException(a.a.g("byteCount < 0: ", j13).toString());
        }
        if (j13 == 0) {
            return;
        }
        z zVar = source.f130710a;
        Intrinsics.f(zVar);
        long j14 = j13;
        while (j14 > 0) {
            int min = (int) Math.min(j14, zVar.f130754c - zVar.f130753b);
            this.f130726e.update(zVar.f130752a, zVar.f130753b, min);
            j14 -= min;
            zVar = zVar.f130757f;
            Intrinsics.f(zVar);
        }
        this.f130724c.write(source, j13);
    }
}
