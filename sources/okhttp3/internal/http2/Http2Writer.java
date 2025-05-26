package okhttp3.internal.http2;

import a.a;
import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import wo2.j;
import wo2.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Http2Writer implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f96163g;

    /* renamed from: a, reason: collision with root package name */
    public final k f96164a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f96165b;

    /* renamed from: c, reason: collision with root package name */
    public final j f96166c;

    /* renamed from: d, reason: collision with root package name */
    public int f96167d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f96168e;

    /* renamed from: f, reason: collision with root package name */
    public final Hpack.Writer f96169f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Writer$Companion;", "", "()V", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    static {
        new Companion(0);
        f96163g = Logger.getLogger(Http2.class.getName());
    }

    public Http2Writer(k sink, boolean z13) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f96164a = sink;
        this.f96165b = z13;
        j jVar = new j();
        this.f96166c = jVar;
        this.f96167d = 16384;
        this.f96169f = new Hpack.Writer(jVar);
    }

    public final synchronized void a(Settings peerSettings) {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.f96168e) {
                throw new IOException("closed");
            }
            int i13 = this.f96167d;
            int i14 = peerSettings.f96179a;
            if ((i14 & 32) != 0) {
                i13 = peerSettings.f96180b[5];
            }
            this.f96167d = i13;
            if (((i14 & 2) != 0 ? peerSettings.f96180b[1] : -1) != -1) {
                Hpack.Writer writer = this.f96169f;
                int i15 = (i14 & 2) != 0 ? peerSettings.f96180b[1] : -1;
                writer.getClass();
                int min = Math.min(i15, 16384);
                int i16 = writer.f96037e;
                if (i16 != min) {
                    if (min < i16) {
                        writer.f96035c = Math.min(writer.f96035c, min);
                    }
                    writer.f96036d = true;
                    writer.f96037e = min;
                    writer.a();
                }
            }
            d(0, 0, 4, 1);
            this.f96164a.flush();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void c(boolean z13, int i13, j jVar, int i14) {
        if (this.f96168e) {
            throw new IOException("closed");
        }
        d(i13, i14, 0, z13 ? 1 : 0);
        if (i14 > 0) {
            Intrinsics.f(jVar);
            this.f96164a.write(jVar, i14);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f96168e = true;
        this.f96164a.close();
    }

    public final void d(int i13, int i14, int i15, int i16) {
        Level level = Level.FINE;
        Logger logger = f96163g;
        if (logger.isLoggable(level)) {
            Http2.f96042a.getClass();
            logger.fine(Http2.b(false, i13, i14, i15, i16));
        }
        if (i14 > this.f96167d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f96167d + ": " + i14).toString());
        }
        if ((Integer.MIN_VALUE & i13) != 0) {
            throw new IllegalArgumentException(a.d("reserved bit set: ", i13).toString());
        }
        byte[] bArr = Util.f95757a;
        k kVar = this.f96164a;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        kVar.p1((i14 >>> 16) & 255);
        kVar.p1((i14 >>> 8) & 255);
        kVar.p1(i14 & 255);
        kVar.p1(i15 & 255);
        kVar.p1(i16 & 255);
        kVar.I(i13 & Integer.MAX_VALUE);
    }

    public final synchronized void e(int i13, ErrorCode errorCode, byte[] debugData) {
        try {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            if (this.f96168e) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            d(0, debugData.length + 8, 7, 0);
            this.f96164a.I(i13);
            this.f96164a.I(errorCode.getHttpCode());
            if (!(debugData.length == 0)) {
                this.f96164a.I0(debugData);
            }
            this.f96164a.flush();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void f(int i13, int i14, boolean z13) {
        if (this.f96168e) {
            throw new IOException("closed");
        }
        d(0, 8, 6, z13 ? 1 : 0);
        this.f96164a.I(i13);
        this.f96164a.I(i14);
        this.f96164a.flush();
    }

    public final synchronized void flush() {
        if (this.f96168e) {
            throw new IOException("closed");
        }
        this.f96164a.flush();
    }

    public final synchronized void g(int i13, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f96168e) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        d(i13, 4, 3, 0);
        this.f96164a.I(errorCode.getHttpCode());
        this.f96164a.flush();
    }

    public final synchronized void h(int i13, long j13) {
        if (this.f96168e) {
            throw new IOException("closed");
        }
        if (j13 == 0 || j13 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j13).toString());
        }
        d(i13, 4, 8, 0);
        this.f96164a.I((int) j13);
        this.f96164a.flush();
    }

    public final void k(int i13, long j13) {
        while (j13 > 0) {
            long min = Math.min(this.f96167d, j13);
            j13 -= min;
            d(i13, (int) min, 9, j13 == 0 ? 4 : 0);
            this.f96164a.write(this.f96166c, min);
        }
    }
}
