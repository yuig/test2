package g7;

import java.io.InputStream;

/* loaded from: classes3.dex */
public final class g extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final f f63771a;

    /* renamed from: b, reason: collision with root package name */
    public final i f63772b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f63774d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f63775e = false;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f63773c = new byte[1];

    public g(f fVar, i iVar) {
        this.f63771a = fVar;
        this.f63772b = iVar;
    }

    public final void a() {
        if (this.f63774d) {
            return;
        }
        this.f63771a.d(this.f63772b);
        this.f63774d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f63775e) {
            return;
        }
        this.f63771a.close();
        this.f63775e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f63773c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        bf.b.t(!this.f63775e);
        a();
        int read = this.f63771a.read(bArr, i13, i14);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
