package e10;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f implements xp2.b {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f56775a;

    /* renamed from: b, reason: collision with root package name */
    public d f56776b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f56777c;

    /* renamed from: d, reason: collision with root package name */
    public volatile xp2.c f56778d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f56779e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f56780f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f56781g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f56782h;

    public f(g gVar, xp2.b actual) {
        Intrinsics.checkNotNullParameter(actual, "actual");
        this.f56782h = gVar;
        this.f56775a = actual;
        this.f56776b = d.Paused;
        this.f56777c = new AtomicInteger(0);
        this.f56779e = new AtomicLong();
        this.f56780f = new AtomicReference();
        this.f56781g = new AtomicReference();
    }

    @Override // xp2.b
    public final void a() {
        synchronized (this.f56775a) {
            this.f56775a.a();
            Unit unit = Unit.f80348a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r3 > 0) goto L18;
     */
    @Override // xp2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r9) {
        /*
            r8 = this;
            e10.d r0 = r8.f56776b
            e10.d r1 = e10.d.Paused
            r2 = 0
            if (r0 != r1) goto L20
            java.util.concurrent.atomic.AtomicLong r0 = r8.f56779e
            long r3 = java.lang.System.nanoTime()
            r0.set(r3)
            java.util.concurrent.atomic.AtomicReference r0 = r8.f56781g
            e10.e r3 = new e10.e
            e10.g r4 = r8.f56782h
            r3.<init>(r2, r4, r8)
            r0.getAndUpdate(r3)
            e10.d r0 = e10.d.Active
            r8.f56776b = r0
        L20:
            java.util.concurrent.atomic.AtomicInteger r0 = r8.f56777c
            int r0 = r0.decrementAndGet()
            if (r0 != 0) goto L3e
            xp2.c r0 = r8.f56778d
            kotlin.jvm.internal.Intrinsics.f(r0)
            e10.g r3 = r8.f56782h
            int r3 = r3.f56785c
            long r3 = (long) r3
            r0.request(r3)
            java.util.concurrent.atomic.AtomicInteger r0 = r8.f56777c
            e10.g r3 = r8.f56782h
            int r3 = r3.f56785c
            r0.addAndGet(r3)
        L3e:
            java.util.concurrent.atomic.AtomicReference r0 = r8.f56780f
            java.lang.Object r0 = r0.get()
            java.util.List r0 = (java.util.List) r0
            r0.add(r9)
            xp2.b r9 = r8.f56775a
            e10.g r0 = r8.f56782h
            monitor-enter(r9)
            int r0 = r0.f56785c     // Catch: java.lang.Throwable -> Laf
            java.util.concurrent.atomic.AtomicReference r3 = r8.f56780f     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> Laf
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> Laf
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Laf
            if (r3 != r0) goto L5f
            goto L7f
        L5f:
            e10.d r0 = r8.f56776b     // Catch: java.lang.Throwable -> Laf
            if (r0 == r1) goto Lb1
            long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Laf
            java.util.concurrent.atomic.AtomicLong r4 = r8.f56779e     // Catch: java.lang.Throwable -> Laf
            long r4 = r4.get()     // Catch: java.lang.Throwable -> Laf
            long r0 = r0 - r4
            e10.g r4 = r8.f56782h     // Catch: java.lang.Throwable -> Laf
            java.util.concurrent.TimeUnit r5 = r4.f56784b     // Catch: java.lang.Throwable -> Laf
            int r4 = r4.f56783a     // Catch: java.lang.Throwable -> Laf
            long r6 = (long) r4     // Catch: java.lang.Throwable -> Laf
            long r4 = r5.toNanos(r6)     // Catch: java.lang.Throwable -> Laf
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto Lb1
            if (r3 <= 0) goto Lb1
        L7f:
            java.util.concurrent.atomic.AtomicReference r0 = r8.f56780f     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Laf
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Laf
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch: java.lang.Throwable -> Laf
            xp2.b r1 = r8.f56775a     // Catch: java.lang.Throwable -> Laf
            r1.c(r0)     // Catch: java.lang.Throwable -> Laf
            java.util.concurrent.atomic.AtomicReference r0 = r8.f56780f     // Catch: java.lang.Throwable -> Laf
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Laf
            r1.<init>()     // Catch: java.lang.Throwable -> Laf
            r0.set(r1)     // Catch: java.lang.Throwable -> Laf
            java.util.concurrent.atomic.AtomicLong r0 = r8.f56779e     // Catch: java.lang.Throwable -> Laf
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Laf
            r0.set(r3)     // Catch: java.lang.Throwable -> Laf
            java.util.concurrent.atomic.AtomicReference r0 = r8.f56781g     // Catch: java.lang.Throwable -> Laf
            e10.e r1 = new e10.e     // Catch: java.lang.Throwable -> Laf
            e10.g r3 = r8.f56782h     // Catch: java.lang.Throwable -> Laf
            r1.<init>(r2, r3, r8)     // Catch: java.lang.Throwable -> Laf
            r0.getAndUpdate(r1)     // Catch: java.lang.Throwable -> Laf
            goto Lb1
        Laf:
            r0 = move-exception
            goto Lb5
        Lb1:
            kotlin.Unit r0 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r9)
            return
        Lb5:
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e10.f.c(java.lang.Object):void");
    }

    @Override // xp2.b
    public final void d(xp2.c s13) {
        Intrinsics.checkNotNullParameter(s13, "s");
        this.f56778d = s13;
        this.f56780f.set(new ArrayList());
        s13.request(this.f56782h.f56785c);
        this.f56777c.addAndGet(this.f56782h.f56785c);
    }

    @Override // xp2.b
    public final void onError(Throwable t13) {
        Intrinsics.checkNotNullParameter(t13, "t");
        synchronized (this.f56775a) {
            this.f56775a.onError(t13);
            Unit unit = Unit.f80348a;
        }
    }
}
