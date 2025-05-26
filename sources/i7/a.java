package i7;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* loaded from: classes3.dex */
public final class a extends UploadDataProvider {

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f71636g;

    /* renamed from: h, reason: collision with root package name */
    public int f71637h;

    public a(byte[] bArr) {
        this.f71636g = bArr;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.f71636g.length;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        byte[] bArr = this.f71636g;
        int min = Math.min(remaining, bArr.length - this.f71637h);
        byteBuffer.put(bArr, this.f71637h, min);
        this.f71637h += min;
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.f71637h = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
