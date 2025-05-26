package kp2;

import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* loaded from: classes4.dex */
public final class c extends h {

    /* renamed from: d, reason: collision with root package name */
    public final j f80589d;

    /* renamed from: e, reason: collision with root package name */
    public final long f80590e;

    /* renamed from: f, reason: collision with root package name */
    public final ByteBuffer f80591f;

    /* renamed from: g, reason: collision with root package name */
    public final hp2.a f80592g = new hp2.a(this);

    /* renamed from: h, reason: collision with root package name */
    public long f80593h;

    public c(e eVar, long j13, j jVar) {
        eVar.getClass();
        if (j13 < 0) {
            throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
        }
        this.f80590e = j13;
        this.f80591f = ByteBuffer.allocate((int) Math.min(j13, 16384));
        this.f80589d = jVar;
        this.f80593h = 0L;
    }

    @Override // kp2.h
    public final void c() {
        if (this.f80593h < this.f80590e) {
            throw new ProtocolException("Content received is less than Content-Length.");
        }
    }

    @Override // kp2.h
    public final UploadDataProvider d() {
        return this.f80592g;
    }

    @Override // kp2.h
    public final void e() {
    }

    public final void f(int i13) {
        long j13 = this.f80593h + i13;
        long j14 = this.f80590e;
        if (j13 <= j14) {
            return;
        }
        throw new ProtocolException("expected " + (j14 - this.f80593h) + " bytes but received " + i13);
    }

    @Override // java.io.OutputStream
    public final void write(int i13) {
        a();
        f(1);
        ByteBuffer byteBuffer = this.f80591f;
        boolean hasRemaining = byteBuffer.hasRemaining();
        j jVar = this.f80589d;
        if (!hasRemaining) {
            a();
            jVar.a(0);
            IOException iOException = this.f80616a;
            if (iOException != null) {
                throw iOException;
            }
        }
        byteBuffer.put((byte) i13);
        long j13 = this.f80593h + 1;
        this.f80593h = j13;
        if (j13 == this.f80590e) {
            a();
            jVar.a(0);
            IOException iOException2 = this.f80616a;
            if (iOException2 != null) {
                throw iOException2;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i13, int i14) {
        a();
        if (bArr.length - i13 >= i14 && i13 >= 0 && i14 >= 0) {
            f(i14);
            int i15 = i14;
            while (true) {
                j jVar = this.f80589d;
                ByteBuffer byteBuffer = this.f80591f;
                if (i15 > 0) {
                    if (!byteBuffer.hasRemaining()) {
                        a();
                        jVar.a(0);
                        IOException iOException = this.f80616a;
                        if (iOException != null) {
                            throw iOException;
                        }
                    }
                    int min = Math.min(i15, byteBuffer.remaining());
                    byteBuffer.put(bArr, (i13 + i14) - i15, min);
                    i15 -= min;
                } else {
                    long j13 = this.f80593h + i14;
                    this.f80593h = j13;
                    if (j13 == this.f80590e) {
                        a();
                        jVar.a(0);
                        IOException iOException2 = this.f80616a;
                        if (iOException2 != null) {
                            throw iOException2;
                        }
                        return;
                    }
                    return;
                }
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
