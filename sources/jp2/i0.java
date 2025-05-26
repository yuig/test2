package jp2;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* loaded from: classes2.dex */
public final class i0 extends UploadDataProvider {

    /* renamed from: g, reason: collision with root package name */
    public final UploadDataProvider f77335g;

    public i0(UploadDataProvider uploadDataProvider) {
        this.f77335g = uploadDataProvider;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f77335g.close();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.f77335g.getLength();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        this.f77335g.read(uploadDataSink, byteBuffer);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.f77335g.rewind(uploadDataSink);
    }
}
