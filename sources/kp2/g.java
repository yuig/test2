package kp2;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class g extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final e f80612a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f80613b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f80614c;

    /* renamed from: d, reason: collision with root package name */
    public IOException f80615d;

    public g(e eVar) {
        this.f80612a = eVar;
    }

    public final void a() {
        if (this.f80613b) {
            IOException iOException = this.f80615d;
            if (iOException != null) {
                throw iOException;
            }
            return;
        }
        if (c()) {
            return;
        }
        if (this.f80614c == null) {
            this.f80614c = ByteBuffer.allocateDirect(32768);
        }
        ByteBuffer byteBuffer = this.f80614c;
        e eVar = this.f80612a;
        eVar.f80597c.read(byteBuffer);
        eVar.f80596b.a(eVar.getReadTimeout());
        IOException iOException2 = this.f80615d;
        if (iOException2 != null) {
            throw iOException2;
        }
        ByteBuffer byteBuffer2 = this.f80614c;
        if (byteBuffer2 != null) {
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        if (!this.f80613b) {
            if (c()) {
                return this.f80614c.remaining();
            }
            return 0;
        }
        IOException iOException = this.f80615d;
        if (iOException == null) {
            return 0;
        }
        throw iOException;
    }

    public final boolean c() {
        ByteBuffer byteBuffer = this.f80614c;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        if (i13 < 0 || i14 < 0 || i13 + i14 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i14 == 0) {
            return 0;
        }
        a();
        if (!c()) {
            return -1;
        }
        int min = Math.min(this.f80614c.limit() - this.f80614c.position(), i14);
        this.f80614c.get(bArr, i13, min);
        return min;
    }

    @Override // java.io.InputStream
    public final int read() {
        a();
        if (c()) {
            return this.f80614c.get() & 255;
        }
        return -1;
    }
}
