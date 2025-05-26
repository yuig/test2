package l8;

import d7.d0;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82079a;

    /* renamed from: b, reason: collision with root package name */
    public int f82080b;

    /* renamed from: c, reason: collision with root package name */
    public long f82081c;

    public /* synthetic */ q(int i13, long j13, int i14) {
        this.f82079a = i14;
        this.f82080b = i13;
        this.f82081c = j13;
    }

    public static q b(String str, int i13, int i14) {
        if (i13 >= i14) {
            return null;
        }
        long j13 = 0;
        int i15 = i13;
        while (i15 < i14) {
            char charAt = str.charAt(i15);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            j13 = (j13 * 10) + (charAt - '0');
            if (j13 > 2147483647L) {
                return null;
            }
            i15++;
        }
        if (i15 == i13) {
            return null;
        }
        return new q(j13, i15);
    }

    public static q c(q8.t tVar, d0 d0Var) {
        tVar.s(d0Var.f53806a, 0, 8);
        d0Var.K(0);
        return new q(d0Var.k(), d0Var.p(), 2);
    }

    public final void a(q qVar) {
        long j13 = this.f82081c;
        long j14 = j13 >>> 32;
        long j15 = j13 & 4294967295L;
        long j16 = qVar.f82081c;
        long j17 = j16 >>> 32;
        long j18 = j16 & 4294967295L;
        long j19 = j14 * j17;
        long j23 = j17 * j15;
        long j24 = j14 * j18;
        long j25 = j19 + (j24 >>> 32) + (j23 >>> 32) + ((((((j15 * j18) >>> 32) + (j24 & 4294967295L)) + (4294967295L & j23)) + 2147483648L) >>> 32);
        this.f82080b = qVar.f82080b + 64 + this.f82080b;
        this.f82081c = j25;
    }

    public final String toString() {
        switch (this.f82079a) {
            case 3:
                StringBuilder sb3 = new StringBuilder("[DiyFp f:");
                sb3.append(this.f82081c);
                sb3.append(", e:");
                return a.a.n(sb3, this.f82080b, "]");
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i13, long j13, Object obj) {
        this(i13, j13, 1);
        this.f82079a = 1;
    }

    public q(long j13, int i13) {
        this.f82079a = 4;
        this.f82081c = j13;
        this.f82080b = i13;
    }

    public q() {
        this.f82079a = 3;
        this.f82081c = 0L;
        this.f82080b = 0;
    }

    public q(int i13, long j13) {
        this.f82079a = 0;
        bf.b.i(j13 >= 0);
        this.f82080b = i13;
        this.f82081c = j13;
    }
}
