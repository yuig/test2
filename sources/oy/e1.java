package oy;

/* loaded from: classes3.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f98034a;

    /* renamed from: b, reason: collision with root package name */
    public final long f98035b;

    /* renamed from: c, reason: collision with root package name */
    public final long f98036c;

    /* renamed from: d, reason: collision with root package name */
    public final long f98037d;

    /* renamed from: e, reason: collision with root package name */
    public final long f98038e;

    public /* synthetic */ e1(boolean z13, long j13, long j14, long j15, long j16, int i13) {
        this(z13, (i13 & 2) != 0 ? 0L : j13, (i13 & 4) != 0 ? 0L : j14, (i13 & 8) != 0 ? 0L : j15, (i13 & 16) != 0 ? 0L : j16);
    }

    public static e1 a(e1 e1Var, long j13, long j14) {
        return new e1(false, e1Var.f98035b, e1Var.f98036c, j13, j14);
    }

    public final long b() {
        return this.f98038e;
    }

    public final long c() {
        return this.f98037d;
    }

    public final long d() {
        return this.f98036c;
    }

    public final long e() {
        return this.f98035b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return this.f98034a == e1Var.f98034a && this.f98035b == e1Var.f98035b && this.f98036c == e1Var.f98036c && this.f98037d == e1Var.f98037d && this.f98038e == e1Var.f98038e;
    }

    public final boolean f() {
        return this.f98034a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f98038e) + a.a.c(this.f98037d, a.a.c(this.f98036c, a.a.c(this.f98035b, Boolean.hashCode(this.f98034a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MediaDetails(isImage=");
        sb3.append(this.f98034a);
        sb3.append(", rawSize=");
        sb3.append(this.f98035b);
        sb3.append(", rawDuration=");
        sb3.append(this.f98036c);
        sb3.append(", exportedSize=");
        sb3.append(this.f98037d);
        sb3.append(", exportedDuration=");
        return a.a.o(sb3, this.f98038e, ")");
    }

    public e1(boolean z13, long j13, long j14, long j15, long j16) {
        this.f98034a = z13;
        this.f98035b = j13;
        this.f98036c = j14;
        this.f98037d = j15;
        this.f98038e = j16;
    }
}
