package lk2;

import dk2.h;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class c implements h {

    /* renamed from: i, reason: collision with root package name */
    public static final int f83657i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j, reason: collision with root package name */
    public static final Object f83658j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f83659a;

    /* renamed from: b, reason: collision with root package name */
    public final int f83660b;

    /* renamed from: c, reason: collision with root package name */
    public long f83661c;

    /* renamed from: d, reason: collision with root package name */
    public final int f83662d;

    /* renamed from: e, reason: collision with root package name */
    public AtomicReferenceArray f83663e;

    /* renamed from: f, reason: collision with root package name */
    public final int f83664f;

    /* renamed from: g, reason: collision with root package name */
    public AtomicReferenceArray f83665g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicLong f83666h;

    public c(int i13) {
        AtomicLong atomicLong = new AtomicLong();
        this.f83659a = atomicLong;
        this.f83666h = new AtomicLong();
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i13) - 1));
        int i14 = numberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(numberOfLeadingZeros + 1);
        this.f83663e = atomicReferenceArray;
        this.f83662d = i14;
        this.f83660b = Math.min(numberOfLeadingZeros / 4, f83657i);
        this.f83665g = atomicReferenceArray;
        this.f83664f = i14;
        this.f83661c = numberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    public final Object a(AtomicReferenceArray atomicReferenceArray, long j13, int i13) {
        this.f83665g = atomicReferenceArray;
        int i14 = i13 & ((int) j13);
        Object obj = atomicReferenceArray.get(i14);
        if (obj != null) {
            atomicReferenceArray.lazySet(i14, null);
            this.f83666h.lazySet(j13 + 1);
        }
        return obj;
    }

    public final void b(AtomicReferenceArray atomicReferenceArray, long j13, int i13, Object obj, long j14) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f83663e = atomicReferenceArray2;
        this.f83661c = (j14 + j13) - 1;
        atomicReferenceArray2.lazySet(i13, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i13, f83658j);
        this.f83659a.lazySet(j13 + 1);
    }

    @Override // dk2.i
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return this.f83659a.get() == this.f83666h.get();
    }

    @Override // dk2.i
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f83663e;
        AtomicLong atomicLong = this.f83659a;
        long j13 = atomicLong.get();
        int i13 = this.f83662d;
        int i14 = ((int) j13) & i13;
        if (j13 < this.f83661c) {
            atomicReferenceArray.lazySet(i14, obj);
            atomicLong.lazySet(j13 + 1);
            return true;
        }
        long j14 = this.f83660b + j13;
        if (atomicReferenceArray.get(((int) j14) & i13) == null) {
            this.f83661c = j14 - 1;
            atomicReferenceArray.lazySet(i14, obj);
            atomicLong.lazySet(j13 + 1);
            return true;
        }
        long j15 = 1 + j13;
        if (atomicReferenceArray.get(((int) j15) & i13) != null) {
            b(atomicReferenceArray, j13, i14, obj, i13);
            return true;
        }
        atomicReferenceArray.lazySet(i14, obj);
        atomicLong.lazySet(j15);
        return true;
    }

    @Override // dk2.i
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f83665g;
        AtomicLong atomicLong = this.f83666h;
        long j13 = atomicLong.get();
        int i13 = this.f83664f;
        int i14 = ((int) j13) & i13;
        Object obj = atomicReferenceArray.get(i14);
        boolean z13 = obj == f83658j;
        if (obj != null && !z13) {
            atomicReferenceArray.lazySet(i14, null);
            atomicLong.lazySet(j13 + 1);
            return obj;
        }
        if (!z13) {
            return null;
        }
        int i15 = i13 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i15);
        atomicReferenceArray.lazySet(i15, null);
        return a(atomicReferenceArray2, j13, i13);
    }
}
