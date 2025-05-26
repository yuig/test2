package kp2;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* loaded from: classes4.dex */
public final class b extends h {

    /* renamed from: d, reason: collision with root package name */
    public final j f80585d;

    /* renamed from: e, reason: collision with root package name */
    public final ByteBuffer f80586e;

    /* renamed from: f, reason: collision with root package name */
    public final hp2.a f80587f = new hp2.a(this);

    /* renamed from: g, reason: collision with root package name */
    public boolean f80588g;

    public b(e eVar, int i13, j jVar) {
        eVar.getClass();
        if (i13 <= 0) {
            throw new IllegalArgumentException("chunkLength should be greater than 0");
        }
        this.f80586e = ByteBuffer.allocate(i13);
        this.f80585d = jVar;
    }

    @Override // kp2.h
    public final void c() {
    }

    @Override // kp2.h, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f80617b = true;
        if (this.f80588g) {
            return;
        }
        this.f80588g = true;
    }

    @Override // kp2.h
    public final UploadDataProvider d() {
        return this.f80587f;
    }

    @Override // kp2.h
    public final void e() {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i13, int i14) {
        a();
        if (bArr.length - i13 < i14 || i13 < 0 || i14 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i15 = i14;
        while (i15 > 0) {
            ByteBuffer byteBuffer = this.f80586e;
            int min = Math.min(i15, byteBuffer.remaining());
            byteBuffer.put(bArr, (i13 + i14) - i15, min);
            i15 -= min;
            if (!byteBuffer.hasRemaining()) {
                a();
                this.f80585d.a(0);
                IOException iOException = this.f80616a;
                if (iOException != null) {
                    throw iOException;
                }
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i13) {
        ByteBuffer byteBuffer = this.f80586e;
        if (!byteBuffer.hasRemaining()) {
            a();
            this.f80585d.a(0);
            IOException iOException = this.f80616a;
            if (iOException != null) {
                throw iOException;
            }
        }
        byteBuffer.put((byte) i13);
    }
}
