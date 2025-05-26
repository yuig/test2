package wo2;

import ao2.m0;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d0 extends e {

    /* renamed from: n, reason: collision with root package name */
    public final Socket f130679n;

    public d0(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f130679n = socket;
    }

    @Override // wo2.e
    public final IOException l(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // wo2.e
    public final void m() {
        Socket socket = this.f130679n;
        try {
            socket.close();
        } catch (AssertionError e13) {
            if (!m0.T(e13)) {
                throw e13;
            }
            u.f130736a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e13);
        } catch (Exception e14) {
            u.f130736a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e14);
        }
    }
}
