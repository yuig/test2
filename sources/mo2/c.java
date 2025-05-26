package mo2;

import ao2.m0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class c extends h implements a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f87811h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c(boolean z13) {
        super(1, z13 ? 1 : 0);
        this.owner$volatile = z13 ? null : d.f87812a;
    }

    public final int e(Object obj) {
        while (Math.max(h.f87819g.get(this), 0) == 0) {
            Object obj2 = f87811h.get(this);
            if (obj2 != d.f87812a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    public final Object f(Object obj, bl2.c cVar) {
        Object g13;
        return (!h(obj) && (g13 = g(obj, cVar)) == cl2.a.COROUTINE_SUSPENDED) ? g13 : Unit.f80348a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0019, code lost:
    
        r1.n(kotlin.Unit.f80348a, r3.f87821b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.Object r4, bl2.c r5) {
        /*
            r3 = this;
            bl2.c r0 = cl2.h.b(r5)
            ao2.o r0 = lb.l0.x0(r0)
            mo2.b r1 = new mo2.b     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r3, r0, r4)     // Catch: java.lang.Throwable -> L3a
        Ld:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = mo2.h.f87819g     // Catch: java.lang.Throwable -> L3a
            int r4 = r4.getAndDecrement(r3)     // Catch: java.lang.Throwable -> L3a
            int r2 = r3.f87820a     // Catch: java.lang.Throwable -> L3a
            if (r4 > r2) goto Ld
            if (r4 <= 0) goto L21
            kotlin.Unit r4 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L3a
            co2.b r2 = r3.f87821b     // Catch: java.lang.Throwable -> L3a
            r1.n(r4, r2)     // Catch: java.lang.Throwable -> L3a
            goto L27
        L21:
            boolean r4 = r3.a(r1)     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto Ld
        L27:
            java.lang.Object r4 = r0.u()
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            if (r4 != r0) goto L34
            java.lang.String r1 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
        L34:
            if (r4 != r0) goto L37
            return r4
        L37:
            kotlin.Unit r4 = kotlin.Unit.f80348a
            return r4
        L3a:
            r4 = move-exception
            r0.C()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mo2.c.g(java.lang.Object, bl2.c):java.lang.Object");
    }

    public final boolean h(Object obj) {
        char c13;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f87819g;
            int i13 = atomicIntegerFieldUpdater.get(this);
            if (i13 > this.f87820a) {
                b();
            } else if (i13 <= 0) {
                if (obj == null) {
                    break;
                }
                int e13 = e(obj);
                if (e13 == 1) {
                    c13 = 2;
                    break;
                }
                if (e13 == 2) {
                    break;
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i13, i13 - 1)) {
                f87811h.set(this, obj);
                c13 = 0;
                break;
            }
        }
        c13 = 1;
        if (c13 == 0) {
            return true;
        }
        if (c13 == 1) {
            return false;
        }
        if (c13 != 2) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final void i(Object obj) {
        while (Math.max(h.f87819g.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f87811h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            fi.b bVar = d.f87812a;
            if (obj2 != bVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, bVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    c();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Mutex@");
        sb3.append(m0.y(this));
        sb3.append("[isLocked=");
        sb3.append(Math.max(h.f87819g.get(this), 0) == 0);
        sb3.append(",owner=");
        sb3.append(f87811h.get(this));
        sb3.append(']');
        return sb3.toString();
    }
}
