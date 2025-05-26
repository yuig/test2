package mo2;

import ao2.m;
import ao2.v2;
import ho2.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import lb.l0;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f87815c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f87816d = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f87817e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f87818f = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f87819g = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f87820a;

    /* renamed from: b, reason: collision with root package name */
    public final co2.b f87821b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h(int i13, int i14) {
        this.f87820a = i13;
        if (i13 <= 0) {
            throw new IllegalArgumentException(a.a.d("Semaphore should have at least 1 permit, but had ", i13).toString());
        }
        if (i14 < 0 || i14 > i13) {
            throw new IllegalArgumentException(a.a.d("The number of acquired permits should be in 0..", i13).toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i13 - i14;
        this.f87821b = new co2.b(this, 2);
    }

    public final boolean a(v2 v2Var) {
        Object a13;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f87817e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f87818f.getAndIncrement(this);
        f fVar = f.f87813a;
        long j13 = andIncrement / j.f87827f;
        loop0: while (true) {
            a13 = ho2.a.a(kVar, j13, fVar);
            if (!l0.F0(a13)) {
                v y03 = l0.y0(a13);
                while (true) {
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f69789c >= y03.f69789c) {
                        break loop0;
                    }
                    if (!y03.l()) {
                        break;
                    }
                    if (a.c.A(atomicReferenceFieldUpdater, this, vVar, y03)) {
                        if (vVar.h()) {
                            vVar.g();
                        }
                    } else if (y03.h()) {
                        y03.g();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) l0.y0(a13);
        int i13 = (int) (andIncrement % j.f87827f);
        AtomicReferenceArray atomicReferenceArray = kVar2.f87828e;
        if (jq.b.A(atomicReferenceArray, i13, v2Var)) {
            v2Var.a(kVar2, i13);
            return true;
        }
        if (!jq.b.z(atomicReferenceArray, i13, j.f87823b, j.f87824c)) {
            return false;
        }
        ((m) v2Var).n(Unit.f80348a, this.f87821b);
        return true;
    }

    public final void b() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i13;
        int i14;
        do {
            atomicIntegerFieldUpdater = f87819g;
            i13 = atomicIntegerFieldUpdater.get(this);
            i14 = this.f87820a;
            if (i13 <= i14) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i13, i14));
    }

    public final void c() {
        do {
            int andIncrement = f87819g.getAndIncrement(this);
            int i13 = this.f87820a;
            if (andIncrement >= i13) {
                b();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i13).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!d());
    }

    public final boolean d() {
        Object a13;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f87815c;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f87816d.getAndIncrement(this);
        long j13 = andIncrement / j.f87827f;
        g gVar = g.f87814a;
        loop0: while (true) {
            a13 = ho2.a.a(kVar, j13, gVar);
            if (l0.F0(a13)) {
                break;
            }
            v y03 = l0.y0(a13);
            while (true) {
                v vVar = (v) atomicReferenceFieldUpdater.get(this);
                if (vVar.f69789c >= y03.f69789c) {
                    break loop0;
                }
                if (!y03.l()) {
                    break;
                }
                if (a.c.A(atomicReferenceFieldUpdater, this, vVar, y03)) {
                    if (vVar.h()) {
                        vVar.g();
                    }
                } else if (y03.h()) {
                    y03.g();
                }
            }
        }
        k kVar2 = (k) l0.y0(a13);
        kVar2.a();
        if (kVar2.f69789c > j13) {
            return false;
        }
        int i13 = (int) (andIncrement % j.f87827f);
        fi.b bVar = j.f87823b;
        AtomicReferenceArray atomicReferenceArray = kVar2.f87828e;
        Object andSet = atomicReferenceArray.getAndSet(i13, bVar);
        if (andSet == null) {
            int i14 = j.f87822a;
            for (int i15 = 0; i15 < i14; i15++) {
                if (atomicReferenceArray.get(i13) == j.f87824c) {
                    return true;
                }
            }
            return !jq.b.z(atomicReferenceArray, i13, j.f87823b, j.f87825d);
        }
        if (andSet == j.f87826e) {
            return false;
        }
        if (andSet instanceof m) {
            m mVar = (m) andSet;
            fi.b j14 = mVar.j(Unit.f80348a, this.f87821b);
            if (j14 == null) {
                return false;
            }
            mVar.x(j14);
            return true;
        }
        if (andSet instanceof lo2.i) {
            return ((lo2.h) ((lo2.i) andSet)).i(this, Unit.f80348a);
        }
        throw new IllegalStateException(("unexpected: " + andSet).toString());
    }
}
