package io2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import xk2.q;
import xk2.s;

/* loaded from: classes2.dex */
public final class f extends ao2.a implements xp2.c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f73330f = AtomicLongFieldUpdater.newUpdater(f.class, "requested$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f73331g = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "producer$volatile");
    private volatile boolean cancellationRequested;

    /* renamed from: d, reason: collision with root package name */
    public final do2.i f73332d;

    /* renamed from: e, reason: collision with root package name */
    public final xp2.b f73333e;
    private volatile /* synthetic */ Object producer$volatile;
    private volatile /* synthetic */ long requested$volatile;

    public f(do2.i iVar, xp2.b bVar, CoroutineContext coroutineContext) {
        super(coroutineContext, false, true);
        this.f73332d = iVar;
        this.f73333e = bVar;
        this.producer$volatile = new c(this.f20108c, this);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:20|21))(4:22|23|(1:25)(1:28)|(1:27))|12|13|14|15))|43|6|7|(0)(0)|12|13|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        kh2.j1.l0(r4.f20108c, r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g0(io2.f r4, bl2.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof io2.e
            if (r0 == 0) goto L16
            r0 = r5
            io2.e r0 = (io2.e) r0
            int r1 = r0.f73329u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f73329u = r1
            goto L1b
        L16:
            io2.e r0 = new io2.e
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f73327s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f73329u
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            io2.f r4 = r0.f73326r
            ue.c.H(r5)     // Catch: java.lang.Throwable -> L2c
            goto L51
        L2c:
            r5 = move-exception
            goto L60
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            ue.c.H(r5)
            r0.f73326r = r4     // Catch: java.lang.Throwable -> L2c
            r0.f73329u = r3     // Catch: java.lang.Throwable -> L2c
            t3.t4 r5 = new t3.t4     // Catch: java.lang.Throwable -> L2c
            r2 = 3
            r5.<init>(r4, r2)     // Catch: java.lang.Throwable -> L2c
            do2.i r2 = r4.f73332d     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r5 = r2.collect(r5, r0)     // Catch: java.lang.Throwable -> L2c
            if (r5 != r1) goto L4c
            goto L4e
        L4c:
            kotlin.Unit r5 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L2c
        L4e:
            if (r5 != r1) goto L51
            goto L81
        L51:
            xp2.b r5 = r4.f73333e     // Catch: java.lang.Throwable -> L57
            r5.a()     // Catch: java.lang.Throwable -> L57
            goto L5d
        L57:
            r5 = move-exception
            kotlin.coroutines.CoroutineContext r4 = r4.f20108c
            kh2.j1.l0(r4, r5)
        L5d:
            kotlin.Unit r1 = kotlin.Unit.f80348a
            goto L81
        L60:
            boolean r0 = r4.cancellationRequested
            if (r0 == 0) goto L70
            boolean r0 = r4.isActive()
            if (r0 != 0) goto L70
            java.util.concurrent.CancellationException r0 = r4.getCancellationException()
            if (r5 == r0) goto L7f
        L70:
            xp2.b r0 = r4.f73333e     // Catch: java.lang.Throwable -> L76
            r0.onError(r5)     // Catch: java.lang.Throwable -> L76
            goto L7f
        L76:
            r0 = move-exception
            xk2.f.a(r5, r0)
            kotlin.coroutines.CoroutineContext r4 = r4.f20108c
            kh2.j1.l0(r4, r5)
        L7f:
            kotlin.Unit r1 = kotlin.Unit.f80348a
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io2.f.g0(io2.f, bl2.c):java.lang.Object");
    }

    @Override // ao2.a2, ao2.o1
    public final void cancel() {
        this.cancellationRequested = true;
        cancel((CancellationException) null);
    }

    @Override // xp2.c
    public final void request(long j13) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j14;
        long j15;
        bl2.c cVar;
        if (j13 <= 0) {
            return;
        }
        do {
            atomicLongFieldUpdater = f73330f;
            j14 = atomicLongFieldUpdater.get(this);
            j15 = j14 + j13;
            if (j15 <= 0) {
                j15 = Long.MAX_VALUE;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j14, j15));
        if (j14 <= 0) {
            do {
                cVar = (bl2.c) f73331g.getAndSet(this, null);
            } while (cVar == null);
            q qVar = s.f135225b;
            cVar.resumeWith(Unit.f80348a);
        }
    }
}
