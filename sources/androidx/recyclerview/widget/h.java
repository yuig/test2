package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public long f19432a = 0;

    /* renamed from: b, reason: collision with root package name */
    public h f19433b;

    public final void a(int i13) {
        if (i13 < 64) {
            this.f19432a &= ~(1 << i13);
            return;
        }
        h hVar = this.f19433b;
        if (hVar != null) {
            hVar.a(i13 - 64);
        }
    }

    public final int b(int i13) {
        h hVar = this.f19433b;
        if (hVar == null) {
            return i13 >= 64 ? Long.bitCount(this.f19432a) : Long.bitCount(this.f19432a & ((1 << i13) - 1));
        }
        if (i13 < 64) {
            return Long.bitCount(this.f19432a & ((1 << i13) - 1));
        }
        return Long.bitCount(this.f19432a) + hVar.b(i13 - 64);
    }

    public final void c() {
        if (this.f19433b == null) {
            this.f19433b = new h();
        }
    }

    public final boolean d(int i13) {
        if (i13 < 64) {
            return (this.f19432a & (1 << i13)) != 0;
        }
        c();
        return this.f19433b.d(i13 - 64);
    }

    public final void e(int i13, boolean z13) {
        if (i13 >= 64) {
            c();
            this.f19433b.e(i13 - 64, z13);
            return;
        }
        long j13 = this.f19432a;
        boolean z14 = (Long.MIN_VALUE & j13) != 0;
        long j14 = (1 << i13) - 1;
        this.f19432a = ((j13 & (~j14)) << 1) | (j13 & j14);
        if (z13) {
            h(i13);
        } else {
            a(i13);
        }
        if (z14 || this.f19433b != null) {
            c();
            this.f19433b.e(0, z14);
        }
    }

    public final boolean f(int i13) {
        if (i13 >= 64) {
            c();
            return this.f19433b.f(i13 - 64);
        }
        long j13 = 1 << i13;
        long j14 = this.f19432a;
        boolean z13 = (j14 & j13) != 0;
        long j15 = j14 & (~j13);
        this.f19432a = j15;
        long j16 = j13 - 1;
        this.f19432a = (j15 & j16) | Long.rotateRight((~j16) & j15, 1);
        h hVar = this.f19433b;
        if (hVar != null) {
            if (hVar.d(0)) {
                h(63);
            }
            this.f19433b.f(0);
        }
        return z13;
    }

    public final void g() {
        this.f19432a = 0L;
        h hVar = this.f19433b;
        if (hVar != null) {
            hVar.g();
        }
    }

    public final void h(int i13) {
        if (i13 < 64) {
            this.f19432a |= 1 << i13;
        } else {
            c();
            this.f19433b.h(i13 - 64);
        }
    }

    public final String toString() {
        if (this.f19433b == null) {
            return Long.toBinaryString(this.f19432a);
        }
        return this.f19433b.toString() + "xx" + Long.toBinaryString(this.f19432a);
    }
}
