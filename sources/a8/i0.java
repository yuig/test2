package a8;

import a.a4;
import android.os.Handler;
import java.io.Closeable;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import pk.v2;

/* loaded from: classes3.dex */
public final class i0 implements Closeable {

    /* renamed from: g */
    public static final Charset f1362g = StandardCharsets.UTF_8;

    /* renamed from: a */
    public final e0 f1363a;

    /* renamed from: b */
    public final l8.w f1364b = new l8.w("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* renamed from: c */
    public final Map f1365c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    public h0 f1366d;

    /* renamed from: e */
    public Socket f1367e;

    /* renamed from: f */
    public volatile boolean f1368f;

    public i0(m mVar) {
        this.f1363a = mVar;
    }

    public final void a(Socket socket) {
        this.f1367e = socket;
        this.f1366d = new h0(this, socket.getOutputStream());
        this.f1364b.g(new g0(this, socket.getInputStream()), new d0(this), 0);
    }

    public final void c(v2 v2Var) {
        bf.b.w(this.f1366d);
        h0 h0Var = this.f1366d;
        h0Var.getClass();
        ((Handler) h0Var.f1353d).post(new a4(h0Var, z.a.n(j0.f1378h).l(v2Var).getBytes(f1362g), v2Var, 25));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1368f) {
            return;
        }
        try {
            h0 h0Var = this.f1366d;
            if (h0Var != null) {
                h0Var.close();
            }
            this.f1364b.f(null);
            Socket socket = this.f1367e;
            if (socket != null) {
                socket.close();
            }
            this.f1368f = true;
        } catch (Throwable th3) {
            this.f1368f = true;
            throw th3;
        }
    }
}
