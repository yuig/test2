package lk2;

import dk2.h;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class b extends AtomicReferenceArray implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final Integer f83651f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: a, reason: collision with root package name */
    public final int f83652a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f83653b;

    /* renamed from: c, reason: collision with root package name */
    public long f83654c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f83655d;

    /* renamed from: e, reason: collision with root package name */
    public final int f83656e;

    public b(int i13) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i13 - 1)));
        this.f83652a = length() - 1;
        this.f83653b = new AtomicLong();
        this.f83655d = new AtomicLong();
        this.f83656e = Math.min(i13 / 4, f83651f.intValue());
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
        return this.f83653b.get() == this.f83655d.get();
    }

    @Override // dk2.i
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f83653b;
        long j13 = atomicLong.get();
        int i13 = this.f83652a;
        int i14 = ((int) j13) & i13;
        if (j13 >= this.f83654c) {
            long j14 = this.f83656e + j13;
            if (get(i13 & ((int) j14)) == null) {
                this.f83654c = j14;
            } else if (get(i14) != null) {
                return false;
            }
        }
        lazySet(i14, obj);
        atomicLong.lazySet(j13 + 1);
        return true;
    }

    @Override // dk2.i
    public final Object poll() {
        AtomicLong atomicLong = this.f83655d;
        long j13 = atomicLong.get();
        int i13 = ((int) j13) & this.f83652a;
        Object obj = get(i13);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j13 + 1);
        lazySet(i13, null);
        return obj;
    }
}
