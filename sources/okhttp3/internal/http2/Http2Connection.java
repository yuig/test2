package okhttp3.internal.http2;

import a.a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.PushObserver;
import okhttp3.internal.platform.Platform;
import wo2.j;
import wo2.k;
import wo2.l;
import wo2.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "Builder", "Companion", "Listener", "ReaderRunnable", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Http2Connection implements Closeable {
    public static final Companion B = new Companion(0);
    public static final Settings C;
    public final LinkedHashSet A;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f96047a;

    /* renamed from: b, reason: collision with root package name */
    public final Listener f96048b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f96049c;

    /* renamed from: d, reason: collision with root package name */
    public final String f96050d;

    /* renamed from: e, reason: collision with root package name */
    public int f96051e;

    /* renamed from: f, reason: collision with root package name */
    public int f96052f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f96053g;

    /* renamed from: h, reason: collision with root package name */
    public final TaskRunner f96054h;

    /* renamed from: i, reason: collision with root package name */
    public final TaskQueue f96055i;

    /* renamed from: j, reason: collision with root package name */
    public final TaskQueue f96056j;

    /* renamed from: k, reason: collision with root package name */
    public final TaskQueue f96057k;

    /* renamed from: l, reason: collision with root package name */
    public final PushObserver f96058l;

    /* renamed from: m, reason: collision with root package name */
    public long f96059m;

    /* renamed from: n, reason: collision with root package name */
    public long f96060n;

    /* renamed from: o, reason: collision with root package name */
    public long f96061o;

    /* renamed from: p, reason: collision with root package name */
    public long f96062p;

    /* renamed from: q, reason: collision with root package name */
    public long f96063q;

    /* renamed from: r, reason: collision with root package name */
    public final Settings f96064r;

    /* renamed from: s, reason: collision with root package name */
    public Settings f96065s;

    /* renamed from: t, reason: collision with root package name */
    public long f96066t;

    /* renamed from: u, reason: collision with root package name */
    public long f96067u;

    /* renamed from: v, reason: collision with root package name */
    public long f96068v;

    /* renamed from: w, reason: collision with root package name */
    public long f96069w;

    /* renamed from: x, reason: collision with root package name */
    public final Socket f96070x;

    /* renamed from: y, reason: collision with root package name */
    public final Http2Writer f96071y;

    /* renamed from: z, reason: collision with root package name */
    public final ReaderRunnable f96072z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f96105a;

        /* renamed from: b, reason: collision with root package name */
        public final TaskRunner f96106b;

        /* renamed from: c, reason: collision with root package name */
        public Socket f96107c;

        /* renamed from: d, reason: collision with root package name */
        public String f96108d;

        /* renamed from: e, reason: collision with root package name */
        public l f96109e;

        /* renamed from: f, reason: collision with root package name */
        public k f96110f;

        /* renamed from: g, reason: collision with root package name */
        public Listener f96111g;

        /* renamed from: h, reason: collision with root package name */
        public final PushObserver f96112h;

        /* renamed from: i, reason: collision with root package name */
        public int f96113i;

        public Builder(TaskRunner taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.f96105a = true;
            this.f96106b = taskRunner;
            this.f96111g = Listener.f96114a;
            this.f96112h = PushObserver.f96177a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "", "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static abstract class Listener {

        /* renamed from: a, reason: collision with root package name */
        public static final Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 f96114a;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener$Companion;", "", "()V", "REFUSE_INCOMING_STREAMS", "Lokhttp3/internal/http2/Http2Connection$Listener;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(int i13) {
                this();
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1] */
        static {
            new Companion(0);
            f96114a = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
                @Override // okhttp3.internal.http2.Http2Connection.Listener
                public final void b(Http2Stream stream) {
                    Intrinsics.checkNotNullParameter(stream, "stream");
                    stream.c(ErrorCode.REFUSED_STREAM, null);
                }
            };
        }

        public void a(Http2Connection connection, Settings settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void b(Http2Stream http2Stream);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
    public final class ReaderRunnable implements Http2Reader.Handler, Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final Http2Reader f96115a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Http2Connection f96116b;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f96116b = http2Connection;
            this.f96115a = reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void b(int i13, long j13) {
            if (i13 == 0) {
                Http2Connection http2Connection = this.f96116b;
                synchronized (http2Connection) {
                    http2Connection.f96069w += j13;
                    http2Connection.notifyAll();
                    Unit unit = Unit.f80348a;
                }
                return;
            }
            Http2Stream d2 = this.f96116b.d(i13);
            if (d2 != null) {
                synchronized (d2) {
                    d2.f96143f += j13;
                    if (j13 > 0) {
                        d2.notifyAll();
                    }
                    Unit unit2 = Unit.f80348a;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void e(final Settings settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            Http2Connection http2Connection = this.f96116b;
            TaskQueue taskQueue = http2Connection.f96055i;
            final String p13 = a.p(new StringBuilder(), http2Connection.f96050d, " applyAndAckSettings");
            taskQueue.d(new Task(p13) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f96081f = false;

                @Override // okhttp3.internal.concurrent.Task
                public final long b() {
                    long a13;
                    int i13;
                    Http2Stream[] http2StreamArr;
                    Http2Connection.ReaderRunnable readerRunnable = this;
                    boolean z13 = this.f96081f;
                    Settings settings2 = settings;
                    readerRunnable.getClass();
                    Intrinsics.checkNotNullParameter(settings2, "settings");
                    final j0 j0Var = new j0();
                    final Http2Connection http2Connection2 = readerRunnable.f96116b;
                    synchronized (http2Connection2.f96071y) {
                        synchronized (http2Connection2) {
                            try {
                                Settings settings3 = http2Connection2.f96065s;
                                if (!z13) {
                                    Settings settings4 = new Settings();
                                    settings4.b(settings3);
                                    settings4.b(settings2);
                                    settings2 = settings4;
                                }
                                j0Var.f80434a = settings2;
                                a13 = settings2.a() - settings3.a();
                                if (a13 != 0 && !http2Connection2.f96049c.isEmpty()) {
                                    http2StreamArr = (Http2Stream[]) http2Connection2.f96049c.values().toArray(new Http2Stream[0]);
                                    Settings settings5 = (Settings) j0Var.f80434a;
                                    Intrinsics.checkNotNullParameter(settings5, "<set-?>");
                                    http2Connection2.f96065s = settings5;
                                    http2Connection2.f96057k.d(new Task(http2Connection2.f96050d + " onSettings") { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                                        @Override // okhttp3.internal.concurrent.Task
                                        public final long b() {
                                            Http2Connection http2Connection3 = http2Connection2;
                                            http2Connection3.f96048b.a(http2Connection3, (Settings) j0Var.f80434a);
                                            return -1L;
                                        }
                                    }, 0L);
                                    Unit unit = Unit.f80348a;
                                }
                                http2StreamArr = null;
                                Settings settings52 = (Settings) j0Var.f80434a;
                                Intrinsics.checkNotNullParameter(settings52, "<set-?>");
                                http2Connection2.f96065s = settings52;
                                http2Connection2.f96057k.d(new Task(http2Connection2.f96050d + " onSettings") { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                                    @Override // okhttp3.internal.concurrent.Task
                                    public final long b() {
                                        Http2Connection http2Connection3 = http2Connection2;
                                        http2Connection3.f96048b.a(http2Connection3, (Settings) j0Var.f80434a);
                                        return -1L;
                                    }
                                }, 0L);
                                Unit unit2 = Unit.f80348a;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        try {
                            http2Connection2.f96071y.a((Settings) j0Var.f80434a);
                        } catch (IOException e13) {
                            Http2Connection.a(http2Connection2, e13);
                        }
                        Unit unit3 = Unit.f80348a;
                    }
                    if (http2StreamArr == null) {
                        return -1L;
                    }
                    for (Http2Stream http2Stream : http2StreamArr) {
                        synchronized (http2Stream) {
                            http2Stream.f96143f += a13;
                            if (a13 > 0) {
                                http2Stream.notifyAll();
                            }
                            Unit unit4 = Unit.f80348a;
                        }
                    }
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void f(final int i13, final List requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            final Http2Connection http2Connection = this.f96116b;
            http2Connection.getClass();
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            synchronized (http2Connection) {
                if (http2Connection.A.contains(Integer.valueOf(i13))) {
                    http2Connection.k(i13, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                http2Connection.A.add(Integer.valueOf(i13));
                TaskQueue taskQueue = http2Connection.f96056j;
                final String str = http2Connection.f96050d + '[' + i13 + "] onRequest";
                taskQueue.d(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long b() {
                        PushObserver pushObserver = http2Connection.f96058l;
                        List requestHeaders2 = requestHeaders;
                        ((PushObserver.Companion.PushObserverCancel) pushObserver).getClass();
                        Intrinsics.checkNotNullParameter(requestHeaders2, "requestHeaders");
                        try {
                            http2Connection.f96071y.g(i13, ErrorCode.CANCEL);
                            synchronized (http2Connection) {
                                http2Connection.A.remove(Integer.valueOf(i13));
                            }
                            return -1L;
                        } catch (IOException unused) {
                            return -1L;
                        }
                    }
                }, 0L);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void h(final int i13, final int i14, l source, final boolean z13) {
            boolean z14;
            boolean z15;
            Intrinsics.checkNotNullParameter(source, "source");
            this.f96116b.getClass();
            if (i13 != 0 && (i13 & 1) == 0) {
                final Http2Connection http2Connection = this.f96116b;
                http2Connection.getClass();
                Intrinsics.checkNotNullParameter(source, "source");
                final j jVar = new j();
                long j13 = i14;
                source.N0(j13);
                source.read(jVar, j13);
                final String str = http2Connection.f96050d + '[' + i13 + "] onData";
                http2Connection.f96056j.d(new Task(str, http2Connection, i13, jVar, i14, z13) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ Http2Connection f96083e;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ int f96084f;

                    /* renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ j f96085g;

                    /* renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ int f96086h;

                    @Override // okhttp3.internal.concurrent.Task
                    public final long b() {
                        try {
                            PushObserver pushObserver = this.f96083e.f96058l;
                            j source2 = this.f96085g;
                            int i15 = this.f96086h;
                            ((PushObserver.Companion.PushObserverCancel) pushObserver).getClass();
                            Intrinsics.checkNotNullParameter(source2, "source");
                            source2.skip(i15);
                            this.f96083e.f96071y.g(this.f96084f, ErrorCode.CANCEL);
                            synchronized (this.f96083e) {
                                this.f96083e.A.remove(Integer.valueOf(this.f96084f));
                            }
                            return -1L;
                        } catch (IOException unused) {
                            return -1L;
                        }
                    }
                }, 0L);
                return;
            }
            Http2Stream d2 = this.f96116b.d(i13);
            if (d2 == null) {
                this.f96116b.k(i13, ErrorCode.PROTOCOL_ERROR);
                long j14 = i14;
                this.f96116b.g(j14);
                source.skip(j14);
                return;
            }
            Intrinsics.checkNotNullParameter(source, "source");
            byte[] bArr = Util.f95757a;
            Http2Stream.FramingSource framingSource = d2.f96146i;
            long j15 = i14;
            framingSource.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            long j16 = j15;
            while (true) {
                if (j16 <= 0) {
                    byte[] bArr2 = Util.f95757a;
                    Http2Stream.this.f96139b.g(j15);
                    break;
                }
                synchronized (Http2Stream.this) {
                    z14 = framingSource.f96157b;
                    z15 = framingSource.f96159d.f130711b + j16 > framingSource.f96156a;
                    Unit unit = Unit.f80348a;
                }
                if (z15) {
                    source.skip(j16);
                    Http2Stream.this.e(ErrorCode.FLOW_CONTROL_ERROR);
                    break;
                }
                if (z14) {
                    source.skip(j16);
                    break;
                }
                long read = source.read(framingSource.f96158c, j16);
                if (read == -1) {
                    throw new EOFException();
                }
                j16 -= read;
                Http2Stream http2Stream = Http2Stream.this;
                synchronized (http2Stream) {
                    try {
                        if (framingSource.f96160e) {
                            framingSource.f96158c.a();
                        } else {
                            j jVar2 = framingSource.f96159d;
                            boolean z16 = jVar2.f130711b == 0;
                            jVar2.i2(framingSource.f96158c);
                            if (z16) {
                                http2Stream.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
            if (z13) {
                d2.j(Util.f95758b, true);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void i(int i13, ErrorCode errorCode, m debugData) {
            int i14;
            Object[] array;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.b();
            Http2Connection http2Connection = this.f96116b;
            synchronized (http2Connection) {
                array = http2Connection.f96049c.values().toArray(new Http2Stream[0]);
                http2Connection.f96053g = true;
                Unit unit = Unit.f80348a;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.f96138a > i13 && http2Stream.h()) {
                    http2Stream.k(ErrorCode.REFUSED_STREAM);
                    this.f96116b.e(http2Stream.f96138a);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ErrorCode errorCode;
            Http2Connection http2Connection = this.f96116b;
            Http2Reader http2Reader = this.f96115a;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e13 = null;
            try {
                try {
                    http2Reader.c(this);
                    while (http2Reader.a(false, this)) {
                    }
                    errorCode = ErrorCode.NO_ERROR;
                } catch (IOException e14) {
                    e13 = e14;
                    errorCode = errorCode2;
                } catch (Throwable th3) {
                    th = th3;
                    errorCode = errorCode2;
                    http2Connection.c(errorCode, errorCode2, e13);
                    Util.c(http2Reader);
                    throw th;
                }
                try {
                    errorCode2 = ErrorCode.CANCEL;
                    http2Connection.c(errorCode, errorCode2, null);
                } catch (IOException e15) {
                    e13 = e15;
                    errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.c(errorCode2, errorCode2, e13);
                    Util.c(http2Reader);
                    return Unit.f80348a;
                }
                Util.c(http2Reader);
                return Unit.f80348a;
            } catch (Throwable th4) {
                th = th4;
                http2Connection.c(errorCode, errorCode2, e13);
                Util.c(http2Reader);
                throw th;
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void j(final int i13, final int i14, boolean z13) {
            if (!z13) {
                TaskQueue taskQueue = this.f96116b.f96055i;
                final String p13 = a.p(new StringBuilder(), this.f96116b.f96050d, " ping");
                final Http2Connection http2Connection = this.f96116b;
                taskQueue.d(new Task(p13) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long b() {
                        int i15 = i13;
                        int i16 = i14;
                        Http2Connection http2Connection2 = http2Connection;
                        http2Connection2.getClass();
                        try {
                            http2Connection2.f96071y.f(i15, i16, true);
                            return -1L;
                        } catch (IOException e13) {
                            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                            http2Connection2.c(errorCode, errorCode, e13);
                            return -1L;
                        }
                    }
                }, 0L);
                return;
            }
            Http2Connection http2Connection2 = this.f96116b;
            synchronized (http2Connection2) {
                try {
                    if (i13 == 1) {
                        http2Connection2.f96060n++;
                    } else if (i13 != 2) {
                        if (i13 == 3) {
                            http2Connection2.notifyAll();
                        }
                        Unit unit = Unit.f80348a;
                    } else {
                        http2Connection2.f96062p++;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void l(final int i13, final ErrorCode errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            final Http2Connection http2Connection = this.f96116b;
            http2Connection.getClass();
            if (i13 == 0 || (i13 & 1) != 0) {
                Http2Stream e13 = http2Connection.e(i13);
                if (e13 != null) {
                    e13.k(errorCode);
                    return;
                }
                return;
            }
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            final String str = http2Connection.f96050d + '[' + i13 + "] onReset";
            http2Connection.f96056j.d(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public final long b() {
                    PushObserver pushObserver = http2Connection.f96058l;
                    ErrorCode errorCode2 = errorCode;
                    ((PushObserver.Companion.PushObserverCancel) pushObserver).getClass();
                    Intrinsics.checkNotNullParameter(errorCode2, "errorCode");
                    synchronized (http2Connection) {
                        http2Connection.A.remove(Integer.valueOf(i13));
                        Unit unit = Unit.f80348a;
                    }
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void n(final int i13, final List requestHeaders, final boolean z13) {
            Intrinsics.checkNotNullParameter(requestHeaders, "headerBlock");
            this.f96116b.getClass();
            if (i13 != 0 && (i13 & 1) == 0) {
                final Http2Connection http2Connection = this.f96116b;
                http2Connection.getClass();
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                final String str = http2Connection.f96050d + '[' + i13 + "] onHeaders";
                http2Connection.f96056j.d(new Task(str, http2Connection, i13, requestHeaders, z13) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ Http2Connection f96087e;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ int f96088f;

                    /* renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ List f96089g;

                    @Override // okhttp3.internal.concurrent.Task
                    public final long b() {
                        PushObserver pushObserver = this.f96087e.f96058l;
                        List responseHeaders = this.f96089g;
                        ((PushObserver.Companion.PushObserverCancel) pushObserver).getClass();
                        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                        try {
                            this.f96087e.f96071y.g(this.f96088f, ErrorCode.CANCEL);
                            synchronized (this.f96087e) {
                                this.f96087e.A.remove(Integer.valueOf(this.f96088f));
                            }
                            return -1L;
                        } catch (IOException unused) {
                            return -1L;
                        }
                    }
                }, 0L);
                return;
            }
            final Http2Connection http2Connection2 = this.f96116b;
            synchronized (http2Connection2) {
                Http2Stream d2 = http2Connection2.d(i13);
                if (d2 != null) {
                    Unit unit = Unit.f80348a;
                    d2.j(Util.x(requestHeaders), z13);
                    return;
                }
                if (http2Connection2.f96053g) {
                    return;
                }
                if (i13 <= http2Connection2.f96051e) {
                    return;
                }
                if (i13 % 2 == http2Connection2.f96052f % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(i13, http2Connection2, false, z13, Util.x(requestHeaders));
                http2Connection2.f96051e = i13;
                http2Connection2.f96049c.put(Integer.valueOf(i13), http2Stream);
                TaskQueue f13 = http2Connection2.f96054h.f();
                final String str2 = http2Connection2.f96050d + '[' + i13 + "] onStream";
                f13.d(new Task(str2) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long b() {
                        try {
                            http2Connection2.f96048b.b(http2Stream);
                            return -1L;
                        } catch (IOException e13) {
                            Platform.f96214a.getClass();
                            Platform platform = Platform.f96215b;
                            String str3 = "Http2Connection.Listener failure for " + http2Connection2.f96050d;
                            platform.getClass();
                            Platform.i(4, str3, e13);
                            try {
                                http2Stream.c(ErrorCode.PROTOCOL_ERROR, e13);
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }
                }, 0L);
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.c(7, 65535);
        settings.c(5, 16384);
        C = settings;
    }

    public Http2Connection(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean z13 = builder.f96105a;
        this.f96047a = z13;
        this.f96048b = builder.f96111g;
        this.f96049c = new LinkedHashMap();
        String str = builder.f96108d;
        if (str == null) {
            Intrinsics.r("connectionName");
            throw null;
        }
        this.f96050d = str;
        boolean z14 = builder.f96105a;
        this.f96052f = z14 ? 3 : 2;
        TaskRunner taskRunner = builder.f96106b;
        this.f96054h = taskRunner;
        TaskQueue f13 = taskRunner.f();
        this.f96055i = f13;
        this.f96056j = taskRunner.f();
        this.f96057k = taskRunner.f();
        this.f96058l = builder.f96112h;
        Settings settings = new Settings();
        if (z14) {
            settings.c(7, 16777216);
        }
        this.f96064r = settings;
        this.f96065s = C;
        this.f96069w = r3.a();
        Socket socket = builder.f96107c;
        if (socket == null) {
            Intrinsics.r("socket");
            throw null;
        }
        this.f96070x = socket;
        k kVar = builder.f96110f;
        if (kVar == null) {
            Intrinsics.r("sink");
            throw null;
        }
        this.f96071y = new Http2Writer(kVar, z13);
        l lVar = builder.f96109e;
        if (lVar == null) {
            Intrinsics.r("source");
            throw null;
        }
        this.f96072z = new ReaderRunnable(this, new Http2Reader(lVar, z13));
        this.A = new LinkedHashSet();
        int i13 = builder.f96113i;
        if (i13 != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(i13);
            final String concat = str.concat(" ping");
            f13.d(new Task(concat) { // from class: okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                @Override // okhttp3.internal.concurrent.Task
                public final long b() {
                    Http2Connection http2Connection;
                    boolean z15;
                    synchronized (this) {
                        http2Connection = this;
                        long j13 = http2Connection.f96060n;
                        long j14 = http2Connection.f96059m;
                        if (j13 < j14) {
                            z15 = true;
                        } else {
                            http2Connection.f96059m = j14 + 1;
                            z15 = false;
                        }
                    }
                    if (z15) {
                        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                        http2Connection.c(errorCode, errorCode, null);
                        return -1L;
                    }
                    try {
                        http2Connection.f96071y.f(1, 0, false);
                    } catch (IOException e13) {
                        ErrorCode errorCode2 = ErrorCode.PROTOCOL_ERROR;
                        http2Connection.c(errorCode2, errorCode2, e13);
                    }
                    return nanos;
                }
            }, nanos);
        }
    }

    public static final void a(Http2Connection http2Connection, IOException iOException) {
        http2Connection.getClass();
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        http2Connection.c(errorCode, errorCode, iOException);
    }

    public final void c(ErrorCode connectionCode, ErrorCode streamCode, IOException iOException) {
        int i13;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        byte[] bArr = Util.f95757a;
        try {
            f(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (!this.f96049c.isEmpty()) {
                    objArr = this.f96049c.values().toArray(new Http2Stream[0]);
                    this.f96049c.clear();
                } else {
                    objArr = null;
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) objArr;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.c(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f96071y.close();
        } catch (IOException unused3) {
        }
        try {
            this.f96070x.close();
        } catch (IOException unused4) {
        }
        this.f96055i.g();
        this.f96056j.g();
        this.f96057k.g();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final synchronized Http2Stream d(int i13) {
        return (Http2Stream) this.f96049c.get(Integer.valueOf(i13));
    }

    public final synchronized Http2Stream e(int i13) {
        Http2Stream http2Stream;
        http2Stream = (Http2Stream) this.f96049c.remove(Integer.valueOf(i13));
        notifyAll();
        return http2Stream;
    }

    public final void f(ErrorCode statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f96071y) {
            synchronized (this) {
                if (this.f96053g) {
                    return;
                }
                this.f96053g = true;
                int i13 = this.f96051e;
                Unit unit = Unit.f80348a;
                this.f96071y.e(i13, statusCode, Util.f95757a);
            }
        }
    }

    public final void flush() {
        this.f96071y.flush();
    }

    public final synchronized void g(long j13) {
        long j14 = this.f96066t + j13;
        this.f96066t = j14;
        long j15 = j14 - this.f96067u;
        if (j15 >= this.f96064r.a() / 2) {
            m(0, j15);
            this.f96067u += j15;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f96071y.f96167d);
        r6 = r2;
        r8.f96068v += r6;
        r4 = kotlin.Unit.f80348a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r9, boolean r10, wo2.j r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.Http2Writer r12 = r8.f96071y
            r12.c(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6b
            monitor-enter(r8)
        L12:
            long r4 = r8.f96068v     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5c
            long r6 = r8.f96069w     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5c
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L35
            java.util.LinkedHashMap r2 = r8.f96049c     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5c
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5c
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5c
            goto L12
        L2a:
            r9 = move-exception
            goto L69
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5c
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5c
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5c
        L35:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            okhttp3.internal.http2.Http2Writer r4 = r8.f96071y     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f96167d     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f96068v     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f96068v = r4     // Catch: java.lang.Throwable -> L2a
            kotlin.Unit r4 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.f96071y
            if (r10 == 0) goto L57
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L57
            r5 = 1
            goto L58
        L57:
            r5 = r3
        L58:
            r4.c(r5, r9, r11, r2)
            goto Ld
        L5c:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L69:
            monitor-exit(r8)
            throw r9
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.h(int, boolean, wo2.j, long):void");
    }

    public final void k(final int i13, final ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        final String str = this.f96050d + '[' + i13 + "] writeSynReset";
        this.f96055i.d(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public final long b() {
                Http2Connection http2Connection = this;
                try {
                    int i14 = i13;
                    ErrorCode statusCode = errorCode;
                    http2Connection.getClass();
                    Intrinsics.checkNotNullParameter(statusCode, "statusCode");
                    http2Connection.f96071y.g(i14, statusCode);
                    return -1L;
                } catch (IOException e13) {
                    Http2Connection.a(http2Connection, e13);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void m(final int i13, final long j13) {
        final String str = this.f96050d + '[' + i13 + "] windowUpdate";
        this.f96055i.d(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public final long b() {
                Http2Connection http2Connection = this;
                try {
                    http2Connection.f96071y.h(i13, j13);
                    return -1L;
                } catch (IOException e13) {
                    Http2Connection.Companion companion = Http2Connection.B;
                    http2Connection.getClass();
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.c(errorCode, errorCode, e13);
                    return -1L;
                }
            }
        }, 0L);
    }
}
