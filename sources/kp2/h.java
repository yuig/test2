package kp2;

import java.io.IOException;
import java.io.OutputStream;
import org.chromium.net.UploadDataProvider;

/* loaded from: classes4.dex */
public abstract class h extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public IOException f80616a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f80617b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f80618c;

    public final void a() {
        if (!this.f80618c) {
            if (this.f80617b) {
                throw new IOException("Stream has been closed.");
            }
        } else {
            IOException iOException = this.f80616a;
            if (iOException != null) {
                throw iOException;
            }
            throw new IOException("Writing after request completed.");
        }
    }

    public abstract void c();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f80617b = true;
    }

    public abstract UploadDataProvider d();

    public abstract void e();
}
