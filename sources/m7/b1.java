package m7;

import java.util.Objects;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final g8.e0 f86100a;

    /* renamed from: b, reason: collision with root package name */
    public final long f86101b;

    /* renamed from: c, reason: collision with root package name */
    public final long f86102c;

    /* renamed from: d, reason: collision with root package name */
    public final long f86103d;

    /* renamed from: e, reason: collision with root package name */
    public final long f86104e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f86105f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f86106g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f86107h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f86108i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f86109j;

    public b1(g8.e0 e0Var, long j13, long j14, long j15, long j16, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        boolean z18 = false;
        bf.b.i(!z17 || z15);
        bf.b.i(!z16 || z15);
        if (!z14 || (!z15 && !z16 && !z17)) {
            z18 = true;
        }
        bf.b.i(z18);
        this.f86100a = e0Var;
        this.f86101b = j13;
        this.f86102c = j14;
        this.f86103d = j15;
        this.f86104e = j16;
        this.f86105f = z13;
        this.f86106g = z14;
        this.f86107h = z15;
        this.f86108i = z16;
        this.f86109j = z17;
    }

    public final b1 a(long j13) {
        if (j13 == this.f86102c) {
            return this;
        }
        return new b1(this.f86100a, this.f86101b, j13, this.f86103d, this.f86104e, this.f86105f, this.f86106g, this.f86107h, this.f86108i, this.f86109j);
    }

    public final b1 b(long j13) {
        if (j13 == this.f86101b) {
            return this;
        }
        return new b1(this.f86100a, j13, this.f86102c, this.f86103d, this.f86104e, this.f86105f, this.f86106g, this.f86107h, this.f86108i, this.f86109j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f86101b == b1Var.f86101b && this.f86102c == b1Var.f86102c && this.f86103d == b1Var.f86103d && this.f86104e == b1Var.f86104e && this.f86105f == b1Var.f86105f && this.f86106g == b1Var.f86106g && this.f86107h == b1Var.f86107h && this.f86108i == b1Var.f86108i && this.f86109j == b1Var.f86109j && Objects.equals(this.f86100a, b1Var.f86100a);
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f86100a.hashCode() + 527) * 31) + ((int) this.f86101b)) * 31) + ((int) this.f86102c)) * 31) + ((int) this.f86103d)) * 31) + ((int) this.f86104e)) * 31) + (this.f86105f ? 1 : 0)) * 31) + (this.f86106g ? 1 : 0)) * 31) + (this.f86107h ? 1 : 0)) * 31) + (this.f86108i ? 1 : 0)) * 31) + (this.f86109j ? 1 : 0);
    }
}
