package ho2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f69775e = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_next$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f69776f = AtomicLongFieldUpdater.newUpdater(o.class, "_state$volatile");

    /* renamed from: g */
    public static final fi.b f69777g = new fi.b("REMOVE_FROZEN", 4);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a */
    public final int f69778a;

    /* renamed from: b */
    public final boolean f69779b;

    /* renamed from: c */
    public final int f69780c;

    /* renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f69781d;

    public o(int i13, boolean z13) {
        this.f69778a = i13;
        this.f69779b = z13;
        int i14 = i13 - 1;
        this.f69780c = i14;
        this.f69781d = new AtomicReferenceArray(i13);
        if (i14 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i13 & i14) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r14) {
        /*
            r13 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = ho2.o.f69776f
            long r3 = r0.get(r13)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            r2 = 1
            if (r1 == 0) goto L19
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r3
            int r14 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r14 == 0) goto L18
            r2 = 2
        L18:
            return r2
        L19:
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r1 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r9 = 30
            long r5 = r5 >> r9
            int r10 = (int) r5
            int r5 = r10 + 2
            int r11 = r13.f69780c
            r5 = r5 & r11
            r6 = r1 & r11
            if (r5 != r6) goto L32
            return r2
        L32:
            boolean r5 = r13.f69779b
            r6 = 1073741823(0x3fffffff, float:1.9999999)
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r13.f69781d
            if (r5 != 0) goto L51
            r5 = r10 & r11
            java.lang.Object r5 = r12.get(r5)
            if (r5 == 0) goto L51
            r0 = 1024(0x400, float:1.435E-42)
            int r3 = r13.f69778a
            if (r3 < r0) goto L50
            int r10 = r10 - r1
            r0 = r10 & r6
            int r1 = r3 >> 1
            if (r0 <= r1) goto L0
        L50:
            return r2
        L51:
            int r1 = r10 + 1
            r1 = r1 & r6
            r5 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r5 = r5 & r3
            long r1 = (long) r1
            long r1 = r1 << r9
            long r5 = r5 | r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = ho2.o.f69776f
            r2 = r13
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L0
            r1 = r10 & r11
            r12.set(r1, r14)
            r1 = r13
        L6c:
            long r2 = r0.get(r1)
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r2 = r2 & r4
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto L81
            ho2.o r1 = r1.e()
            ho2.o r1 = r1.c(r10, r14)
            if (r1 != 0) goto L6c
        L81:
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ho2.o.a(java.lang.Object):int");
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j13;
        do {
            atomicLongFieldUpdater = f69776f;
            j13 = atomicLongFieldUpdater.get(this);
            if ((j13 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j13) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j13, 2305843009213693952L | j13));
        return true;
    }

    public final o c(int i13, Object obj) {
        AtomicReferenceArray atomicReferenceArray = this.f69781d;
        int i14 = this.f69780c;
        Object obj2 = atomicReferenceArray.get(i13 & i14);
        if (!(obj2 instanceof n) || ((n) obj2).f69774a != i13) {
            return null;
        }
        atomicReferenceArray.set(i13 & i14, obj);
        return this;
    }

    public final boolean d() {
        long j13 = f69776f.get(this);
        return ((int) (1073741823 & j13)) == ((int) ((j13 & 1152921503533105152L) >> 30));
    }

    public final o e() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j13;
        while (true) {
            atomicLongFieldUpdater = f69776f;
            j13 = atomicLongFieldUpdater.get(this);
            if ((j13 & 1152921504606846976L) != 0) {
                break;
            }
            long j14 = j13 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j13, j14)) {
                j13 = j14;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f69775e;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            if (oVar != null) {
                return oVar;
            }
            o oVar2 = new o(this.f69778a * 2, this.f69779b);
            int i13 = (int) (1073741823 & j13);
            int i14 = (int) ((1152921503533105152L & j13) >> 30);
            while (true) {
                int i15 = this.f69780c;
                int i16 = i13 & i15;
                if (i16 != (i15 & i14)) {
                    Object obj = this.f69781d.get(i16);
                    if (obj == null) {
                        obj = new n(i13);
                    }
                    oVar2.f69781d.set(oVar2.f69780c & i13, obj);
                    i13++;
                }
            }
            atomicLongFieldUpdater.set(oVar2, (-1152921504606846977L) & j13);
            d7.g.w(atomicReferenceFieldUpdater, this, oVar2);
        }
    }

    public final Object f() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f69776f;
            long j13 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j13) != 0) {
                return f69777g;
            }
            int i13 = (int) (1073741823 & j13);
            int i14 = this.f69780c;
            int i15 = i13 & i14;
            if ((((int) ((1152921503533105152L & j13) >> 30)) & i14) == i15) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f69781d;
            Object obj = atomicReferenceArray.get(i15);
            boolean z13 = this.f69779b;
            if (obj == null) {
                if (z13) {
                    return null;
                }
            } else {
                if (obj instanceof n) {
                    return null;
                }
                int i16 = (i13 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j13, ((-1073741824) & j13) | i16)) {
                    atomicReferenceArray.set(i15, null);
                    return obj;
                }
                if (z13) {
                    o oVar = this;
                    do {
                        oVar = oVar.g(i16);
                    } while (oVar != null);
                    return obj;
                }
            }
        }
    }

    public final o g(int i13) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j13;
        int i14;
        do {
            atomicLongFieldUpdater = f69776f;
            j13 = atomicLongFieldUpdater.get(this);
            i14 = (int) (1073741823 & j13);
            if ((1152921504606846976L & j13) != 0) {
                return e();
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j13, ((-1073741824) & j13) | i13));
        this.f69781d.set(this.f69780c & i14, null);
        return null;
    }
}
