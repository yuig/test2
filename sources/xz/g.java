package xz;

import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import pq2.l;
import t00.m;

/* loaded from: classes.dex */
public interface g extends l {
    int d();

    void f(Throwable th3, m mVar, Request request);

    Exception g(Throwable th3, pq2.i iVar);

    long h();

    m i();

    long j();

    boolean k();

    AtomicInteger m();

    default void n(pq2.i call) {
        Intrinsics.checkNotNullParameter(call, "call");
        new Timer().schedule(new f(this, call), h());
    }

    default boolean o(Throwable t13) {
        boolean b13;
        Intrinsics.checkNotNullParameter(t13, "t");
        if (k() && m().incrementAndGet() <= d()) {
            b13 = og0.b.b(null, t13);
            if (b13) {
                return true;
            }
        }
        return false;
    }

    void p(long j13);

    float q();

    default Throwable r(Throwable t13, pq2.i call) {
        Intrinsics.checkNotNullParameter(t13, "t");
        Intrinsics.checkNotNullParameter(call, "call");
        Exception g13 = g(t13, call);
        m i13 = i();
        Request d2 = call.d();
        Intrinsics.checkNotNullExpressionValue(d2, "request(...)");
        f(g13, i13, d2);
        return g13;
    }
}
