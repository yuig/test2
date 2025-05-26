package wd;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class g0 extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f129170a;

    public g0(ByteBuffer byteBuffer) {
        this.f129170a = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f129170a.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j13, byte[] bArr, int i13, int i14) {
        ByteBuffer byteBuffer = this.f129170a;
        if (j13 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j13);
        int min = Math.min(i14, byteBuffer.remaining());
        byteBuffer.get(bArr, i13, min);
        return min;
    }
}
