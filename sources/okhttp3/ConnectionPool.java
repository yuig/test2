package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/ConnectionPool;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ConnectionPool {

    /* renamed from: a, reason: collision with root package name */
    public final RealConnectionPool f95570a;

    public ConnectionPool(int i13, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        RealConnectionPool delegate = new RealConnectionPool(TaskRunner.f95853i, i13, timeUnit);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f95570a = delegate;
    }

    public final int a() {
        return this.f95570a.f95946e.size();
    }

    public ConnectionPool() {
        this(5, TimeUnit.MINUTES);
    }
}
