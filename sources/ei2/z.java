package ei2;

import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xf2.c0;

/* loaded from: classes4.dex */
public final class z implements v {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f59059a = new ConcurrentLinkedQueue();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f59060b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f59061c = new AtomicReference(null);

    @Override // nf2.j
    public final void a(long j13) {
    }

    @Override // ei2.v
    public final Object b(String name, oi2.a autoTerminationMode, oi2.b bVar, c0 type, boolean z13, boolean z14, Map attributes, List events, Function0 code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(code, "code");
        return code.invoke();
    }

    @Override // ei2.v
    public final q c(c0 type, oi2.a autoTerminationMode, oi2.b bVar, String name, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(type, "type");
        return null;
    }

    @Override // ei2.v
    public final q d(e embraceSpanBuilder) {
        Intrinsics.checkNotNullParameter(embraceSpanBuilder, "embraceSpanBuilder");
        return null;
    }

    @Override // nf2.j
    public final boolean e() {
        return true;
    }

    @Override // ei2.v
    public final oi2.b f(String spanId) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        return null;
    }

    @Override // ei2.v
    public final boolean g(String name, long j13, long j14, oi2.a autoTerminationMode, oi2.b bVar, c0 type, boolean z13, boolean z14, Map attributes, List events, ErrorCode errorCode) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(events, "events");
        v vVar = (v) this.f59061c.get();
        if (vVar != null) {
            return vVar.g(name, j13, j14, autoTerminationMode, bVar, type, z13, z14, attributes, events, errorCode);
        }
        if (this.f59060b.getAndIncrement() >= 1000) {
            return false;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue2 = this.f59059a;
        synchronized (concurrentLinkedQueue2) {
            try {
                concurrentLinkedQueue = concurrentLinkedQueue2;
                try {
                    this.f59059a.add(new y(name, j13, j14, autoTerminationMode, bVar, type, z13, z14, attributes, events, errorCode));
                    return true;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                concurrentLinkedQueue = concurrentLinkedQueue2;
            }
        }
    }

    @Override // ei2.v
    public final q h(String str, oi2.a aVar, oi2.b bVar, Long l13, c0 c0Var, boolean z13, boolean z14) {
        return kg.p.b0(this, str, aVar, bVar, l13, c0Var, z13, z14);
    }

    public final void i(w delegateSpanService) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Intrinsics.checkNotNullParameter(delegateSpanService, "delegateSpanService");
        ConcurrentLinkedQueue concurrentLinkedQueue2 = this.f59059a;
        synchronized (concurrentLinkedQueue2) {
            try {
                this.f59061c.set(delegateSpanService);
                while (true) {
                    y yVar = (y) this.f59059a.poll();
                    if (yVar != null) {
                        Intrinsics.checkNotNullExpressionValue(yVar, "poll()");
                        concurrentLinkedQueue = concurrentLinkedQueue2;
                        try {
                            delegateSpanService.g(yVar.f59048a, yVar.f59049b, yVar.f59050c, yVar.f59051d, yVar.f59052e, yVar.f59053f, yVar.f59054g, yVar.f59055h, yVar.f59056i, yVar.f59057j, yVar.f59058k);
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    } else {
                        concurrentLinkedQueue = concurrentLinkedQueue2;
                    }
                    if (!(!this.f59059a.isEmpty())) {
                        Unit unit = Unit.f80348a;
                        return;
                    }
                    concurrentLinkedQueue2 = concurrentLinkedQueue;
                }
            } catch (Throwable th4) {
                th = th4;
                concurrentLinkedQueue = concurrentLinkedQueue2;
            }
        }
    }
}
