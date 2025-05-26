package okhttp3.internal.http2;

import a.a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import ql2.s;
import wo2.e0;
import wo2.i0;
import wo2.j;
import wo2.l;
import wo2.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "Companion", "ContinuationSource", "Handler", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Http2Reader implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f96126e = new Companion(0);

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f96127f;

    /* renamed from: a, reason: collision with root package name */
    public final l f96128a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f96129b;

    /* renamed from: c, reason: collision with root package name */
    public final ContinuationSource f96130c;

    /* renamed from: d, reason: collision with root package name */
    public final Hpack.Reader f96131d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        public static int a(int i13, int i14, int i15) {
            if ((i14 & 8) != 0) {
                i13--;
            }
            if (i15 <= i13) {
                return i13 - i15;
            }
            throw new IOException(a.f("PROTOCOL_ERROR padding ", i15, " > remaining length ", i13));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lwo2/e0;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class ContinuationSource implements e0 {

        /* renamed from: a, reason: collision with root package name */
        public final l f96132a;

        /* renamed from: b, reason: collision with root package name */
        public int f96133b;

        /* renamed from: c, reason: collision with root package name */
        public int f96134c;

        /* renamed from: d, reason: collision with root package name */
        public int f96135d;

        /* renamed from: e, reason: collision with root package name */
        public int f96136e;

        /* renamed from: f, reason: collision with root package name */
        public int f96137f;

        public ContinuationSource(l source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f96132a = source;
        }

        public final void a() {
            int i13 = this.f96135d;
            l lVar = this.f96132a;
            int u13 = Util.u(lVar);
            this.f96136e = u13;
            this.f96133b = u13;
            int readByte = lVar.readByte() & 255;
            this.f96134c = lVar.readByte() & 255;
            Http2Reader.f96126e.getClass();
            Logger logger = Http2Reader.f96127f;
            if (logger.isLoggable(Level.FINE)) {
                Http2 http2 = Http2.f96042a;
                int i14 = this.f96135d;
                int i15 = this.f96133b;
                int i16 = this.f96134c;
                http2.getClass();
                logger.fine(Http2.b(true, i14, i15, readByte, i16));
            }
            int readInt = lVar.readInt() & Integer.MAX_VALUE;
            this.f96135d = readInt;
            if (readByte == 9) {
                if (readInt != i13) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(readByte + " != TYPE_CONTINUATION");
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // wo2.e0
        public final long read(j sink, long j13) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            while (true) {
                int i13 = this.f96136e;
                l lVar = this.f96132a;
                if (i13 != 0) {
                    long read = lVar.read(sink, Math.min(j13, i13));
                    if (read == -1) {
                        return -1L;
                    }
                    this.f96136e -= (int) read;
                    return read;
                }
                lVar.skip(this.f96137f);
                this.f96137f = 0;
                if ((this.f96134c & 4) != 0) {
                    return -1L;
                }
                a();
            }
        }

        @Override // wo2.e0
        public final i0 timeout() {
            return this.f96132a.timeout();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Handler;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
    public interface Handler {
        void b(int i13, long j13);

        void e(Settings settings);

        void f(int i13, List list);

        void h(int i13, int i14, l lVar, boolean z13);

        void i(int i13, ErrorCode errorCode, m mVar);

        void j(int i13, int i14, boolean z13);

        void l(int i13, ErrorCode errorCode);

        void n(int i13, List list, boolean z13);
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        f96127f = logger;
    }

    public Http2Reader(l source, boolean z13) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f96128a = source;
        this.f96129b = z13;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.f96130c = continuationSource;
        this.f96131d = new Hpack.Reader(continuationSource);
    }

    public final boolean a(boolean z13, Handler handler) {
        int readByte;
        int readInt;
        l lVar = this.f96128a;
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            lVar.N0(9L);
            int u13 = Util.u(lVar);
            if (u13 > 16384) {
                throw new IOException(a.d("FRAME_SIZE_ERROR: ", u13));
            }
            int readByte2 = lVar.readByte() & 255;
            byte readByte3 = lVar.readByte();
            int i13 = readByte3 & 255;
            int readInt2 = lVar.readInt() & Integer.MAX_VALUE;
            Level level = Level.FINE;
            Logger logger = f96127f;
            if (logger.isLoggable(level)) {
                Http2.f96042a.getClass();
                logger.fine(Http2.b(true, readInt2, u13, readByte2, i13));
            }
            if (z13 && readByte2 != 4) {
                StringBuilder sb3 = new StringBuilder("Expected a SETTINGS frame but was ");
                Http2.f96042a.getClass();
                sb3.append(Http2.a(readByte2));
                throw new IOException(sb3.toString());
            }
            Companion companion = f96126e;
            switch (readByte2) {
                case 0:
                    if (readInt2 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z14 = (readByte3 & 1) != 0;
                    if ((readByte3 & 32) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    readByte = (readByte3 & 8) != 0 ? lVar.readByte() & 255 : 0;
                    companion.getClass();
                    handler.h(readInt2, Companion.a(u13, i13, readByte), lVar, z14);
                    lVar.skip(readByte);
                    return true;
                case 1:
                    if (readInt2 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z15 = (readByte3 & 1) != 0;
                    readByte = (readByte3 & 8) != 0 ? lVar.readByte() & 255 : 0;
                    if ((readByte3 & 32) != 0) {
                        g(handler, readInt2);
                        u13 -= 5;
                    }
                    companion.getClass();
                    handler.n(readInt2, e(Companion.a(u13, i13, readByte), readByte, i13, readInt2), z15);
                    return true;
                case 2:
                    h(handler, u13, readInt2);
                    return true;
                case 3:
                    m(handler, u13, readInt2);
                    return true;
                case 4:
                    if (readInt2 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((readByte3 & 1) != 0) {
                        if (u13 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        handler.getClass();
                    } else {
                        if (u13 % 6 != 0) {
                            throw new IOException(a.d("TYPE_SETTINGS length % 6 != 0: ", u13));
                        }
                        Settings settings = new Settings();
                        kotlin.ranges.a p13 = s.p(s.q(0, u13), 6);
                        int i14 = p13.f80453a;
                        int i15 = p13.f80454b;
                        int i16 = p13.f80455c;
                        if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
                            while (true) {
                                short readShort = lVar.readShort();
                                byte[] bArr = Util.f95757a;
                                int i17 = readShort & 65535;
                                readInt = lVar.readInt();
                                if (i17 != 2) {
                                    if (i17 == 3) {
                                        i17 = 4;
                                    } else if (i17 != 4) {
                                        if (i17 == 5 && (readInt < 16384 || readInt > 16777215)) {
                                        }
                                    } else {
                                        if (readInt < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i17 = 7;
                                    }
                                } else if (readInt != 0 && readInt != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                settings.c(i17, readInt);
                                if (i14 != i15) {
                                    i14 += i16;
                                }
                            }
                            throw new IOException(a.d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", readInt));
                        }
                        handler.e(settings);
                    }
                    return true;
                case 5:
                    k(handler, u13, i13, readInt2);
                    return true;
                case 6:
                    f(handler, u13, i13, readInt2);
                    return true;
                case 7:
                    d(handler, u13, readInt2);
                    return true;
                case 8:
                    if (u13 != 4) {
                        throw new IOException(a.d("TYPE_WINDOW_UPDATE length !=4: ", u13));
                    }
                    long readInt3 = lVar.readInt() & 2147483647L;
                    if (readInt3 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    handler.b(readInt2, readInt3);
                    return true;
                default:
                    lVar.skip(u13);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void c(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.f96129b) {
            if (!a(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        m mVar = Http2.f96043b;
        m a13 = this.f96128a.a1(mVar.f130713a.length);
        Level level = Level.FINE;
        Logger logger = f96127f;
        if (logger.isLoggable(level)) {
            logger.fine(Util.i("<< CONNECTION " + a13.c(), new Object[0]));
        }
        if (!Intrinsics.d(mVar, a13)) {
            throw new IOException("Expected a connection header but was ".concat(a13.j()));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f96128a.close();
    }

    public final void d(Handler handler, int i13, int i14) {
        ErrorCode errorCode;
        if (i13 < 8) {
            throw new IOException(a.d("TYPE_GOAWAY length < 8: ", i13));
        }
        if (i14 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        l lVar = this.f96128a;
        int readInt = lVar.readInt();
        int readInt2 = lVar.readInt();
        int i15 = i13 - 8;
        ErrorCode.INSTANCE.getClass();
        ErrorCode[] values = ErrorCode.values();
        int length = values.length;
        int i16 = 0;
        while (true) {
            if (i16 >= length) {
                errorCode = null;
                break;
            }
            errorCode = values[i16];
            if (errorCode.getHttpCode() == readInt2) {
                break;
            } else {
                i16++;
            }
        }
        if (errorCode == null) {
            throw new IOException(a.d("TYPE_GOAWAY unexpected error code: ", readInt2));
        }
        m mVar = m.f130712d;
        if (i15 > 0) {
            mVar = lVar.a1(i15);
        }
        handler.i(readInt, errorCode, mVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00db, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r4.f96026b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List e(int r4, int r5, int r6, int r7) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Reader.e(int, int, int, int):java.util.List");
    }

    public final void f(Handler handler, int i13, int i14, int i15) {
        if (i13 != 8) {
            throw new IOException(a.d("TYPE_PING length != 8: ", i13));
        }
        if (i15 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        l lVar = this.f96128a;
        handler.j(lVar.readInt(), lVar.readInt(), (i14 & 1) != 0);
    }

    public final void g(Handler handler, int i13) {
        l lVar = this.f96128a;
        lVar.readInt();
        lVar.readByte();
        byte[] bArr = Util.f95757a;
        handler.getClass();
    }

    public final void h(Handler handler, int i13, int i14) {
        if (i13 != 5) {
            throw new IOException(a.e("TYPE_PRIORITY length: ", i13, " != 5"));
        }
        if (i14 == 0) {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        g(handler, i14);
    }

    public final void k(Handler handler, int i13, int i14, int i15) {
        int i16;
        if (i15 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int i17 = i14 & 8;
        l lVar = this.f96128a;
        if (i17 != 0) {
            byte readByte = lVar.readByte();
            byte[] bArr = Util.f95757a;
            i16 = readByte & 255;
        } else {
            i16 = 0;
        }
        int readInt = lVar.readInt() & Integer.MAX_VALUE;
        f96126e.getClass();
        handler.f(readInt, e(Companion.a(i13 - 4, i14, i16), i16, i14, i15));
    }

    public final void m(Handler handler, int i13, int i14) {
        ErrorCode errorCode;
        if (i13 != 4) {
            throw new IOException(a.e("TYPE_RST_STREAM length: ", i13, " != 4"));
        }
        if (i14 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int readInt = this.f96128a.readInt();
        ErrorCode.INSTANCE.getClass();
        ErrorCode[] values = ErrorCode.values();
        int length = values.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                errorCode = null;
                break;
            }
            errorCode = values[i15];
            if (errorCode.getHttpCode() == readInt) {
                break;
            } else {
                i15++;
            }
        }
        if (errorCode == null) {
            throw new IOException(a.d("TYPE_RST_STREAM unexpected error code: ", readInt));
        }
        handler.l(i14, errorCode);
    }
}
