package kp2;

import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* loaded from: classes4.dex */
public final class a extends h {

    /* renamed from: d, reason: collision with root package name */
    public final int f80581d;

    /* renamed from: e, reason: collision with root package name */
    public final hp2.a f80582e = new hp2.a(this);

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f80583f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f80584g;

    public a(e eVar) {
        eVar.getClass();
        this.f80581d = -1;
        this.f80583f = ByteBuffer.allocate(16384);
    }

    @Override // kp2.h
    public final void c() {
    }

    @Override // kp2.h
    public final UploadDataProvider d() {
        return this.f80582e;
    }

    @Override // kp2.h
    public final void e() {
        this.f80584g = true;
        if (this.f80583f.position() < this.f80581d) {
            throw new ProtocolException("Content received is less than Content-Length");
        }
    }

    public final void f(int i13) {
        int i14 = this.f80581d;
        if (i14 != -1 && this.f80583f.position() + i13 > i14) {
            throw new ProtocolException(a.a.e("exceeded content-length limit of ", i14, " bytes"));
        }
        if (this.f80584g) {
            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for writing after connect");
        }
        if (i14 == -1 && this.f80583f.limit() - this.f80583f.position() <= i13) {
            ByteBuffer allocate = ByteBuffer.allocate(Math.max(this.f80583f.capacity() * 2, this.f80583f.capacity() + i13));
            allocate.put(this.f80583f);
            this.f80583f = allocate;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i13) {
        a();
        f(1);
        this.f80583f.put((byte) i13);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i13, int i14) {
        a();
        f(i14);
        this.f80583f.put(bArr, i13, i14);
    }

    public a(e eVar, long j13) {
        if (eVar == null) {
            throw new NullPointerException("Argument connection cannot be null.");
        }
        if (j13 > 2147483647L) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        }
        if (j13 >= 0) {
            int i13 = (int) j13;
            this.f80581d = i13;
            this.f80583f = ByteBuffer.allocate(i13);
            return;
        }
        throw new IllegalArgumentException("Content length < 0.");
    }
}
