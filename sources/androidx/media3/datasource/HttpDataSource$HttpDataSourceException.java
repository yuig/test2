package androidx.media3.datasource;

import com.bumptech.glide.c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* renamed from: c, reason: collision with root package name */
    public final int f18779c;

    public HttpDataSource$HttpDataSourceException(int i13) {
        super(a(i13, 1));
        this.f18779c = 1;
    }

    public static int a(int i13, int i14) {
        if (i13 == 2000 && i14 == 1) {
            return 2001;
        }
        return i13;
    }

    public static HttpDataSource$HttpDataSourceException b(IOException iOException, int i13) {
        String message = iOException.getMessage();
        int i14 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !c.q1(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i14 == 2007 ? new HttpDataSource$CleartextNotPermittedException(iOException) : new HttpDataSource$HttpDataSourceException(iOException, i14, i13);
    }

    public HttpDataSource$HttpDataSourceException(String str, int i13) {
        super(str, a(i13, 1));
        this.f18779c = 1;
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, int i13, int i14) {
        super(a(i13, i14), iOException);
        this.f18779c = i14;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, int i13) {
        super(a(i13, 1), str, iOException);
        this.f18779c = 1;
    }
}
