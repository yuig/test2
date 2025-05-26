package of2;

import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements b, yh2.b, bi2.g, e {

    /* renamed from: a, reason: collision with root package name */
    public final sg2.a f94430a;

    /* renamed from: b, reason: collision with root package name */
    public final ki2.a f94431b;

    /* renamed from: c, reason: collision with root package name */
    public final og2.a f94432c;

    /* renamed from: d, reason: collision with root package name */
    public final pf2.f f94433d;

    /* renamed from: e, reason: collision with root package name */
    public final Thread f94434e;

    /* renamed from: f, reason: collision with root package name */
    public final d f94435f;

    /* renamed from: g, reason: collision with root package name */
    public final lh2.b f94436g;

    /* renamed from: h, reason: collision with root package name */
    public final pf2.d f94437h;

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f94438i;

    public h(sg2.a configService, Looper looper, lh2.b logger, pf2.d livenessCheckScheduler, ki2.a anrMonitorWorker, pf2.f state, og2.a clock) {
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(looper, "looper");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(livenessCheckScheduler, "livenessCheckScheduler");
        Intrinsics.checkNotNullParameter(anrMonitorWorker, "anrMonitorWorker");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f94430a = configService;
        this.f94431b = anrMonitorWorker;
        this.f94432c = clock;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f94438i = copyOnWriteArrayList;
        Thread thread = looper.getThread();
        Intrinsics.checkNotNullExpressionValue(thread, "looper.thread");
        this.f94434e = thread;
        this.f94436g = logger;
        this.f94433d = state;
        this.f94437h = livenessCheckScheduler;
        d dVar = new d(configService, clock, thread, anrMonitorWorker);
        this.f94435f = dVar;
        copyOnWriteArrayList.add(dVar);
        livenessCheckScheduler.f100023e.f100014c = this;
    }

    @Override // of2.e
    public final void a(Thread thread, long j13) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        Iterator it = this.f94438i.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(thread, j13);
        }
    }

    @Override // yh2.b
    public final void c() {
        this.f94435f.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // bi2.g
    public final void e(long j13, boolean z13) {
        this.f94431b.b(new f(this, 1));
    }

    @Override // of2.e
    public final void g(Thread thread, long j13) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        if (((sg2.b) this.f94430a).f112881f.c()) {
            Iterator it = this.f94438i.iterator();
            while (it.hasNext()) {
                ((e) it.next()).g(this.f94434e, j13);
            }
        }
    }

    @Override // of2.e
    public final void h(Thread thread, long j13) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        Iterator it = this.f94438i.iterator();
        while (it.hasNext()) {
            ((e) it.next()).h(thread, j13);
        }
    }

    @Override // bi2.g
    public final void o(long j13) {
        this.f94431b.b(new f(this, 0));
    }

    @Override // cg2.e
    public final void w(String crashId) {
        Intrinsics.checkNotNullParameter(crashId, "crashId");
        this.f94431b.b(new f(this, 2));
    }
}
