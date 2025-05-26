package h8;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class b implements q {

    /* renamed from: a, reason: collision with root package name */
    public final long f68002a;

    /* renamed from: b, reason: collision with root package name */
    public final long f68003b;

    /* renamed from: c, reason: collision with root package name */
    public long f68004c;

    public b(long j13, long j14) {
        this.f68002a = j13;
        this.f68003b = j14;
        this.f68004c = j13 - 1;
    }

    public final void a() {
        long j13 = this.f68004c;
        if (j13 < this.f68002a || j13 > this.f68003b) {
            throw new NoSuchElementException();
        }
    }

    @Override // h8.q
    public final boolean next() {
        long j13 = this.f68004c + 1;
        this.f68004c = j13;
        return !(j13 > this.f68003b);
    }
}
