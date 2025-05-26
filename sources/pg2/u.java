package pg2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import qa2.v;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public AtomicInteger f100150a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f100151b;

    public final void a(ki2.a worker, Long l13, v retryMethod) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(retryMethod, "retryMethod");
        worker.a(new p4.a(11, retryMethod), l13 != null ? l13.longValue() : (long) Math.pow(3.0d, this.f100150a.get()), TimeUnit.SECONDS);
    }
}
