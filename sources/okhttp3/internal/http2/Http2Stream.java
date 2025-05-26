package okhttp3.internal.http2;

import a.a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import wo2.c0;
import wo2.e;
import wo2.e0;
import wo2.i0;
import wo2.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Http2Stream {

    /* renamed from: a, reason: collision with root package name */
    public final int f96138a;

    /* renamed from: b, reason: collision with root package name */
    public final Http2Connection f96139b;

    /* renamed from: c, reason: collision with root package name */
    public long f96140c;

    /* renamed from: d, reason: collision with root package name */
    public long f96141d;

    /* renamed from: e, reason: collision with root package name */
    public long f96142e;

    /* renamed from: f, reason: collision with root package name */
    public long f96143f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f96144g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f96145h;

    /* renamed from: i, reason: collision with root package name */
    public final FramingSource f96146i;

    /* renamed from: j, reason: collision with root package name */
    public final FramingSink f96147j;

    /* renamed from: k, reason: collision with root package name */
    public final StreamTimeout f96148k;

    /* renamed from: l, reason: collision with root package name */
    public final StreamTimeout f96149l;

    /* renamed from: m, reason: collision with root package name */
    public ErrorCode f96150m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f96151n;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$Companion;", "", "()V", "EMIT_BUFFER_SIZE", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lwo2/c0;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public final class FramingSink implements c0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f96152a;

        /* renamed from: b, reason: collision with root package name */
        public final j f96153b = new j();

        /* renamed from: c, reason: collision with root package name */
        public boolean f96154c;

        public FramingSink(boolean z13) {
            this.f96152a = z13;
        }

        public final void a(boolean z13) {
            long min;
            boolean z14;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                try {
                    http2Stream.f96149l.j();
                    while (http2Stream.f96142e >= http2Stream.f96143f && !this.f96152a && !this.f96154c) {
                        try {
                            synchronized (http2Stream) {
                                ErrorCode errorCode = http2Stream.f96150m;
                                if (errorCode != null) {
                                    break;
                                } else {
                                    http2Stream.m();
                                }
                            }
                        } catch (Throwable th3) {
                            http2Stream.f96149l.n();
                            throw th3;
                        }
                    }
                    http2Stream.f96149l.n();
                    http2Stream.b();
                    min = Math.min(http2Stream.f96143f - http2Stream.f96142e, this.f96153b.f130711b);
                    http2Stream.f96142e += min;
                    z14 = z13 && min == this.f96153b.f130711b;
                    Unit unit = Unit.f80348a;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            Http2Stream.this.f96149l.j();
            try {
                Http2Stream http2Stream2 = Http2Stream.this;
                http2Stream2.f96139b.h(http2Stream2.f96138a, z14, this.f96153b, min);
            } finally {
                Http2Stream.this.f96149l.n();
            }
        }

        @Override // wo2.c0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean z13;
            Http2Stream http2Stream = Http2Stream.this;
            byte[] bArr = Util.f95757a;
            synchronized (http2Stream) {
                if (this.f96154c) {
                    return;
                }
                synchronized (http2Stream) {
                    z13 = http2Stream.f96150m == null;
                    Unit unit = Unit.f80348a;
                }
                Http2Stream http2Stream2 = Http2Stream.this;
                if (!http2Stream2.f96147j.f96152a) {
                    if (this.f96153b.f130711b > 0) {
                        while (this.f96153b.f130711b > 0) {
                            a(true);
                        }
                    } else if (z13) {
                        http2Stream2.f96139b.h(http2Stream2.f96138a, true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.f96154c = true;
                    Unit unit2 = Unit.f80348a;
                }
                Http2Stream.this.f96139b.flush();
                Http2Stream.this.a();
            }
        }

        @Override // wo2.c0, java.io.Flushable
        public final void flush() {
            Http2Stream http2Stream = Http2Stream.this;
            byte[] bArr = Util.f95757a;
            synchronized (http2Stream) {
                http2Stream.b();
                Unit unit = Unit.f80348a;
            }
            while (this.f96153b.f130711b > 0) {
                a(false);
                Http2Stream.this.f96139b.flush();
            }
        }

        @Override // wo2.c0
        public final i0 timeout() {
            return Http2Stream.this.f96149l;
        }

        @Override // wo2.c0
        public final void write(j source, long j13) {
            Intrinsics.checkNotNullParameter(source, "source");
            byte[] bArr = Util.f95757a;
            j jVar = this.f96153b;
            jVar.write(source, j13);
            while (jVar.f130711b >= 16384) {
                a(false);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lwo2/e0;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public final class FramingSource implements e0 {

        /* renamed from: a, reason: collision with root package name */
        public final long f96156a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f96157b;

        /* renamed from: c, reason: collision with root package name */
        public final j f96158c = new j();

        /* renamed from: d, reason: collision with root package name */
        public final j f96159d = new j();

        /* renamed from: e, reason: collision with root package name */
        public boolean f96160e;

        public FramingSource(long j13, boolean z13) {
            this.f96156a = j13;
            this.f96157b = z13;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j13;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.f96160e = true;
                j jVar = this.f96159d;
                j13 = jVar.f130711b;
                jVar.a();
                http2Stream.notifyAll();
                Unit unit = Unit.f80348a;
            }
            if (j13 > 0) {
                byte[] bArr = Util.f95757a;
                Http2Stream.this.f96139b.g(j13);
            }
            Http2Stream.this.a();
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0090 A[LOOP:0: B:3:0x0011->B:41:0x0090, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[SYNTHETIC] */
        @Override // wo2.e0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long read(wo2.j r16, long r17) {
            /*
                Method dump skipped, instructions count: 196
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSource.read(wo2.j, long):long");
        }

        @Override // wo2.e0
        public final i0 timeout() {
            return Http2Stream.this.f96148k;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lwo2/e;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public final class StreamTimeout extends e {
        public StreamTimeout() {
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
            Http2Stream.this.e(ErrorCode.CANCEL);
            final Http2Connection http2Connection = Http2Stream.this.f96139b;
            synchronized (http2Connection) {
                long j13 = http2Connection.f96062p;
                long j14 = http2Connection.f96061o;
                if (j13 < j14) {
                    return;
                }
                http2Connection.f96061o = j14 + 1;
                http2Connection.f96063q = System.nanoTime() + 1000000000;
                Unit unit = Unit.f80348a;
                TaskQueue taskQueue = http2Connection.f96055i;
                final String p13 = a.p(new StringBuilder(), http2Connection.f96050d, " ping");
                taskQueue.d(new Task(p13) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long b() {
                        Http2Connection http2Connection2 = http2Connection;
                        http2Connection2.getClass();
                        try {
                            http2Connection2.f96071y.f(2, 0, false);
                            return -1L;
                        } catch (IOException e13) {
                            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                            http2Connection2.c(errorCode, errorCode, e13);
                            return -1L;
                        }
                    }
                }, 0L);
            }
        }

        public final void n() {
            if (k()) {
                throw l(null);
            }
        }
    }

    static {
        new Companion(0);
    }

    public Http2Stream(int i13, Http2Connection connection, boolean z13, boolean z14, Headers headers) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f96138a = i13;
        this.f96139b = connection;
        this.f96143f = connection.f96065s.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f96144g = arrayDeque;
        this.f96146i = new FramingSource(connection.f96064r.a(), z14);
        this.f96147j = new FramingSink(z13);
        this.f96148k = new StreamTimeout();
        this.f96149l = new StreamTimeout();
        if (headers == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!h())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(headers);
        }
    }

    public final void a() {
        boolean z13;
        boolean i13;
        byte[] bArr = Util.f95757a;
        synchronized (this) {
            try {
                FramingSource framingSource = this.f96146i;
                if (!framingSource.f96157b && framingSource.f96160e) {
                    FramingSink framingSink = this.f96147j;
                    if (framingSink.f96152a || framingSink.f96154c) {
                        z13 = true;
                        i13 = i();
                        Unit unit = Unit.f80348a;
                    }
                }
                z13 = false;
                i13 = i();
                Unit unit2 = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z13) {
            c(ErrorCode.CANCEL, null);
        } else {
            if (i13) {
                return;
            }
            this.f96139b.e(this.f96138a);
        }
    }

    public final void b() {
        FramingSink framingSink = this.f96147j;
        if (framingSink.f96154c) {
            throw new IOException("stream closed");
        }
        if (framingSink.f96152a) {
            throw new IOException("stream finished");
        }
        if (this.f96150m != null) {
            IOException iOException = this.f96151n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f96150m;
            Intrinsics.f(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void c(ErrorCode statusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(statusCode, "rstStatusCode");
        if (d(statusCode, iOException)) {
            Http2Connection http2Connection = this.f96139b;
            http2Connection.getClass();
            Intrinsics.checkNotNullParameter(statusCode, "statusCode");
            http2Connection.f96071y.g(this.f96138a, statusCode);
        }
    }

    public final boolean d(ErrorCode errorCode, IOException iOException) {
        byte[] bArr = Util.f95757a;
        synchronized (this) {
            if (this.f96150m != null) {
                return false;
            }
            this.f96150m = errorCode;
            this.f96151n = iOException;
            notifyAll();
            if (this.f96146i.f96157b && this.f96147j.f96152a) {
                return false;
            }
            Unit unit = Unit.f80348a;
            this.f96139b.e(this.f96138a);
            return true;
        }
    }

    public final void e(ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (d(errorCode, null)) {
            this.f96139b.k(this.f96138a, errorCode);
        }
    }

    /* renamed from: f, reason: from getter */
    public final IOException getF96151n() {
        return this.f96151n;
    }

    public final FramingSink g() {
        synchronized (this) {
            try {
                if (!this.f96145h && !h()) {
                    throw new IllegalStateException("reply before requesting the sink".toString());
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return this.f96147j;
    }

    public final boolean h() {
        return this.f96139b.f96047a == ((this.f96138a & 1) == 1);
    }

    public final synchronized boolean i() {
        if (this.f96150m != null) {
            return false;
        }
        FramingSource framingSource = this.f96146i;
        if (framingSource.f96157b || framingSource.f96160e) {
            FramingSink framingSink = this.f96147j;
            if (framingSink.f96152a || framingSink.f96154c) {
                if (this.f96145h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x0021, B:11:0x0025, B:19:0x0018), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(okhttp3.Headers r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte[] r0 = okhttp3.internal.Util.f95757a
            monitor-enter(r2)
            boolean r0 = r2.f96145h     // Catch: java.lang.Throwable -> L16
            r1 = 1
            if (r0 == 0) goto L18
            if (r4 != 0) goto L10
            goto L18
        L10:
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.f96146i     // Catch: java.lang.Throwable -> L16
            r3.getClass()     // Catch: java.lang.Throwable -> L16
            goto L1f
        L16:
            r3 = move-exception
            goto L39
        L18:
            r2.f96145h = r1     // Catch: java.lang.Throwable -> L16
            java.util.ArrayDeque r0 = r2.f96144g     // Catch: java.lang.Throwable -> L16
            r0.add(r3)     // Catch: java.lang.Throwable -> L16
        L1f:
            if (r4 == 0) goto L25
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.f96146i     // Catch: java.lang.Throwable -> L16
            r3.f96157b = r1     // Catch: java.lang.Throwable -> L16
        L25:
            boolean r3 = r2.i()     // Catch: java.lang.Throwable -> L16
            r2.notifyAll()     // Catch: java.lang.Throwable -> L16
            kotlin.Unit r4 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            if (r3 != 0) goto L38
            okhttp3.internal.http2.Http2Connection r3 = r2.f96139b
            int r4 = r2.f96138a
            r3.e(r4)
        L38:
            return
        L39:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.j(okhttp3.Headers, boolean):void");
    }

    public final synchronized void k(ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f96150m == null) {
            this.f96150m = errorCode;
            notifyAll();
        }
    }

    public final void l(long j13) {
        this.f96141d = j13;
    }

    public final void m() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
