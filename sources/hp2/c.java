package hp2;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* loaded from: classes4.dex */
public final class c extends UploadDataProvider {

    /* renamed from: g, reason: collision with root package name */
    public volatile FileChannel f69891g;

    /* renamed from: h, reason: collision with root package name */
    public final b f69892h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f69893i = new Object();

    public c(b bVar) {
        this.f69892h = bVar;
    }

    public final FileChannel c() {
        if (this.f69891g == null) {
            synchronized (this.f69893i) {
                try {
                    if (this.f69891g == null) {
                        this.f69891g = this.f69892h.b();
                    }
                } finally {
                }
            }
        }
        return this.f69891g;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileChannel fileChannel = this.f69891g;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return c().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        FileChannel c13 = c();
        int i13 = 0;
        while (i13 == 0) {
            int read = c13.read(byteBuffer);
            if (read == -1) {
                break;
            } else {
                i13 += read;
            }
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        c().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
