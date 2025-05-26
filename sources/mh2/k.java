package mh2;

import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.LogPayload;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes4.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final ki2.a f87183a;

    /* renamed from: b, reason: collision with root package name */
    public final og2.a f87184b;

    /* renamed from: c, reason: collision with root package name */
    public final n f87185c;

    /* renamed from: d, reason: collision with root package name */
    public final di2.b f87186d;

    /* renamed from: e, reason: collision with root package name */
    public final eh2.a f87187e;

    /* renamed from: f, reason: collision with root package name */
    public volatile AtomicLong f87188f;

    /* renamed from: g, reason: collision with root package name */
    public volatile AtomicLong f87189g;

    /* renamed from: h, reason: collision with root package name */
    public volatile ScheduledFuture f87190h;

    public k(ki2.a worker, og2.a clock, n sink, di2.b bVar, eh2.a logEnvelopeSource) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(logEnvelopeSource, "logEnvelopeSource");
        this.f87183a = worker;
        this.f87184b = clock;
        this.f87185c = sink;
        this.f87186d = bVar;
        this.f87187e = logEnvelopeSource;
        this.f87188f = new AtomicLong(0L);
        this.f87189g = new AtomicLong(0L);
    }

    public final void a(boolean z13) {
        List i13;
        di2.b bVar;
        ScheduledFuture scheduledFuture = this.f87190h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f87190h = null;
        this.f87189g.set(0L);
        eh2.a aVar = this.f87187e;
        n nVar = ((eh2.c) aVar.f58951c).f58953a;
        synchronized (nVar.f87196d) {
            i13 = kg.n.i(Math.min(nVar.f87193a.size(), 50), nVar.f87193a);
            nVar.f87193a.removeAll(CollectionsKt.J0(i13));
        }
        Envelope a13 = aVar.a(new LogPayload(i13));
        List list = ((LogPayload) a13.f73112e).f73188a;
        if (list == null || list.isEmpty() || (bVar = this.f87186d) == null) {
            return;
        }
        bVar.f(a13, !z13);
    }

    public final synchronized boolean b() {
        long now = this.f87184b.now();
        if (CollectionsKt.F0(this.f87185c.f87193a).size() < 50 && now - this.f87188f.get() < CameraPreview.AUTOFOCUS_INTERVAL_MILLIS) {
            long j13 = this.f87189g.get();
            if (j13 == 0 || now - j13 < 5000) {
                return false;
            }
        }
        a(false);
        return true;
    }

    @Override // cg2.e
    public final void w(String crashId) {
        Intrinsics.checkNotNullParameter(crashId, "crashId");
        a(true);
    }
}
