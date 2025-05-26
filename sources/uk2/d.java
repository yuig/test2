package uk2;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import lb.l0;

/* loaded from: classes2.dex */
public final class d extends p {

    /* renamed from: g, reason: collision with root package name */
    public static final Object[] f122399g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final c[] f122400h = new c[0];

    /* renamed from: i, reason: collision with root package name */
    public static final c[] f122401i = new c[0];

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f122402a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f122403b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f122404c;

    /* renamed from: d, reason: collision with root package name */
    public final Lock f122405d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f122406e;

    /* renamed from: f, reason: collision with root package name */
    public long f122407f;

    public d() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f122404c = reentrantReadWriteLock.readLock();
        this.f122405d = reentrantReadWriteLock.writeLock();
        this.f122403b = new AtomicReference(f122400h);
        this.f122402a = new AtomicReference();
        this.f122406e = new AtomicReference();
    }

    public static d R(Object obj) {
        d dVar = new d();
        AtomicReference atomicReference = dVar.f122402a;
        ck2.i.b(obj, "defaultValue is null");
        atomicReference.lazySet(obj);
        return dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0093, code lost:
    
        r7.u(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // uj2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(uj2.v r7) {
        /*
            r6 = this;
            uk2.c r0 = new uk2.c
            r0.<init>(r7, r6)
            r7.b(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference r1 = r6.f122403b
            java.lang.Object r2 = r1.get()
            uk2.c[] r2 = (uk2.c[]) r2
            uk2.c[] r3 = uk2.d.f122401i
            if (r2 != r3) goto L2a
            java.util.concurrent.atomic.AtomicReference r0 = r6.f122406e
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            pk2.g r1 = pk2.h.f100547a
            if (r0 != r1) goto L25
            r7.a()
            goto L99
        L25:
            r7.onError(r0)
            goto L99
        L2a:
            int r3 = r2.length
            int r4 = r3 + 1
            uk2.c[] r4 = new uk2.c[r4]
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r4, r5, r3)
            r4[r3] = r0
        L35:
            boolean r3 = r1.compareAndSet(r2, r4)
            if (r3 == 0) goto L9c
            boolean r7 = r0.f122397g
            if (r7 == 0) goto L43
            r6.T(r0)
            goto L99
        L43:
            boolean r7 = r0.f122397g
            if (r7 == 0) goto L48
            goto L99
        L48:
            monitor-enter(r0)
            boolean r7 = r0.f122397g     // Catch: java.lang.Throwable -> L4f
            if (r7 == 0) goto L51
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            goto L99
        L4f:
            r7 = move-exception
            goto L9a
        L51:
            boolean r7 = r0.f122393c     // Catch: java.lang.Throwable -> L4f
            if (r7 == 0) goto L57
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            goto L99
        L57:
            uk2.d r7 = r0.f122392b     // Catch: java.lang.Throwable -> L4f
            java.util.concurrent.locks.Lock r1 = r7.f122404c     // Catch: java.lang.Throwable -> L4f
            r1.lock()     // Catch: java.lang.Throwable -> L4f
            long r2 = r7.f122407f     // Catch: java.lang.Throwable -> L4f
            r0.f122398h = r2     // Catch: java.lang.Throwable -> L4f
            java.util.concurrent.atomic.AtomicReference r7 = r7.f122402a     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> L4f
            r1.unlock()     // Catch: java.lang.Throwable -> L4f
            r1 = 1
            if (r7 == 0) goto L70
            r2 = r1
            goto L71
        L70:
            r2 = r5
        L71:
            r0.f122394d = r2     // Catch: java.lang.Throwable -> L4f
            r0.f122393c = r1     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            if (r7 == 0) goto L99
            boolean r7 = r0.test(r7)
            if (r7 == 0) goto L7f
            goto L99
        L7f:
            boolean r7 = r0.f122397g
            if (r7 == 0) goto L84
            goto L99
        L84:
            monitor-enter(r0)
            g.i r7 = r0.f122395e     // Catch: java.lang.Throwable -> L8d
            if (r7 != 0) goto L8f
            r0.f122394d = r5     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8d
            goto L99
        L8d:
            r7 = move-exception
            goto L97
        L8f:
            r1 = 0
            r0.f122395e = r1     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8d
            r7.u(r0)
            goto L7f
        L97:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8d
            throw r7
        L99:
            return
        L9a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r7
        L9c:
            java.lang.Object r3 = r1.get()
            if (r3 == r2) goto L35
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: uk2.d.G(uj2.v):void");
    }

    @Override // uk2.p
    public final boolean Q() {
        return ((c[]) this.f122403b.get()).length != 0;
    }

    public final Object S() {
        Object obj = this.f122402a.get();
        if (pk2.l.isComplete(obj) || pk2.l.isError(obj)) {
            return null;
        }
        return pk2.l.getValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(c cVar) {
        c[] cVarArr;
        while (true) {
            AtomicReference atomicReference = this.f122403b;
            c[] cVarArr2 = (c[]) atomicReference.get();
            int length = cVarArr2.length;
            if (length == 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                } else if (cVarArr2[i13] == cVar) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0) {
                return;
            }
            if (length == 1) {
                cVarArr = f122400h;
            } else {
                c[] cVarArr3 = new c[length - 1];
                System.arraycopy(cVarArr2, 0, cVarArr3, 0, i13);
                System.arraycopy(cVarArr2, i13 + 1, cVarArr3, i13, (length - i13) - 1);
                cVarArr = cVarArr3;
            }
            while (!atomicReference.compareAndSet(cVarArr2, cVarArr)) {
                if (atomicReference.get() != cVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // uj2.v
    public final void a() {
        if (pk2.f.t(this.f122406e, pk2.h.f100547a)) {
            Object complete = pk2.l.complete();
            AtomicReference atomicReference = this.f122403b;
            c[] cVarArr = f122401i;
            c[] cVarArr2 = (c[]) atomicReference.getAndSet(cVarArr);
            if (cVarArr2 != cVarArr) {
                Lock lock = this.f122405d;
                lock.lock();
                this.f122407f++;
                this.f122402a.lazySet(complete);
                lock.unlock();
            }
            for (c cVar : cVarArr2) {
                cVar.a(this.f122407f, complete);
            }
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (this.f122406e.get() != null) {
            cVar.dispose();
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        ck2.i.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f122406e.get() != null) {
            return;
        }
        Object next = pk2.l.next(obj);
        Lock lock = this.f122405d;
        lock.lock();
        this.f122407f++;
        this.f122402a.lazySet(next);
        lock.unlock();
        for (c cVar : (c[]) this.f122403b.get()) {
            cVar.a(this.f122407f, next);
        }
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        ck2.i.b(th3, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!pk2.f.r(this.f122406e, th3)) {
            l0.R0(th3);
            return;
        }
        Object error = pk2.l.error(th3);
        AtomicReference atomicReference = this.f122403b;
        c[] cVarArr = f122401i;
        c[] cVarArr2 = (c[]) atomicReference.getAndSet(cVarArr);
        if (cVarArr2 != cVarArr) {
            Lock lock = this.f122405d;
            lock.lock();
            this.f122407f++;
            this.f122402a.lazySet(error);
            lock.unlock();
        }
        for (c cVar : cVarArr2) {
            cVar.a(this.f122407f, error);
        }
    }
}
