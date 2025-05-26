package okhttp3.internal.connection;

import a.a;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RealConnectionPool {

    /* renamed from: a, reason: collision with root package name */
    public final int f95942a;

    /* renamed from: b, reason: collision with root package name */
    public final long f95943b;

    /* renamed from: c, reason: collision with root package name */
    public final TaskQueue f95944c;

    /* renamed from: d, reason: collision with root package name */
    public final RealConnectionPool$cleanupTask$1 f95945d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentLinkedQueue f95946e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    static {
        new Companion(0);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner, int i13, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f95942a = i13;
        this.f95943b = timeUnit.toNanos(5L);
        this.f95944c = taskRunner.f();
        final String p13 = a.p(new StringBuilder(), Util.f95763g, " ConnectionPool");
        this.f95945d = new Task(p13) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long b() {
                RealConnectionPool realConnectionPool = RealConnectionPool.this;
                long nanoTime = System.nanoTime();
                Iterator it = realConnectionPool.f95946e.iterator();
                int i14 = 0;
                long j13 = Long.MIN_VALUE;
                RealConnection realConnection = null;
                int i15 = 0;
                while (it.hasNext()) {
                    RealConnection connection = (RealConnection) it.next();
                    Intrinsics.checkNotNullExpressionValue(connection, "connection");
                    synchronized (connection) {
                        if (realConnectionPool.b(connection, nanoTime) > 0) {
                            i15++;
                        } else {
                            i14++;
                            long j14 = nanoTime - connection.f95935q;
                            if (j14 > j13) {
                                realConnection = connection;
                                j13 = j14;
                            }
                            Unit unit = Unit.f80348a;
                        }
                    }
                }
                long j15 = realConnectionPool.f95943b;
                if (j13 < j15 && i14 <= realConnectionPool.f95942a) {
                    if (i14 > 0) {
                        return j15 - j13;
                    }
                    if (i15 > 0) {
                        return j15;
                    }
                    return -1L;
                }
                Intrinsics.f(realConnection);
                synchronized (realConnection) {
                    if (!realConnection.f95934p.isEmpty()) {
                        return 0L;
                    }
                    if (realConnection.f95935q + j13 != nanoTime) {
                        return 0L;
                    }
                    realConnection.f95928j = true;
                    realConnectionPool.f95946e.remove(realConnection);
                    Socket socket = realConnection.f95922d;
                    Intrinsics.f(socket);
                    Util.d(socket);
                    if (!realConnectionPool.f95946e.isEmpty()) {
                        return 0L;
                    }
                    realConnectionPool.f95944c.a();
                    return 0L;
                }
            }
        };
        this.f95946e = new ConcurrentLinkedQueue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0026, code lost:
    
        if (r1.f95925g != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(okhttp3.Address r4, okhttp3.internal.connection.RealCall r5, java.util.ArrayList r6, boolean r7) {
        /*
            r3 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.f95946e
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealConnection r1 = (okhttp3.internal.connection.RealConnection) r1
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            monitor-enter(r1)
            if (r7 == 0) goto L28
            okhttp3.internal.http2.Http2Connection r2 = r1.f95925g     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L36
        L28:
            boolean r2 = r1.h(r4, r6)     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L36
            r5.b(r1)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)
            r4 = 1
            return r4
        L34:
            r4 = move-exception
            goto L3a
        L36:
            kotlin.Unit r2 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)
            goto L10
        L3a:
            monitor-exit(r1)
            throw r4
        L3c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnectionPool.a(okhttp3.Address, okhttp3.internal.connection.RealCall, java.util.ArrayList, boolean):boolean");
    }

    public final int b(RealConnection realConnection, long j13) {
        byte[] bArr = Util.f95757a;
        ArrayList arrayList = realConnection.f95934p;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i13);
            if (reference.get() != null) {
                i13++;
            } else {
                String str = "A connection to " + realConnection.f95920b.f95754a.f95488i + " was leaked. Did you forget to close a response body?";
                Platform.f96214a.getClass();
                Platform.f96215b.k(((RealCall.CallReference) reference).getF95918a(), str);
                arrayList.remove(i13);
                realConnection.f95928j = true;
                if (arrayList.isEmpty()) {
                    realConnection.f95935q = j13 - this.f95943b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
