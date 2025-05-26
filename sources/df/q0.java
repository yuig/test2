package df;

import java.io.BufferedInputStream;
import java.net.HttpURLConnection;

/* loaded from: classes3.dex */
public final class q0 extends BufferedInputStream {

    /* renamed from: a, reason: collision with root package name */
    public HttpURLConnection f54833a;

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        j1.N(this.f54833a);
    }
}
