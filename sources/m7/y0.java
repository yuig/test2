package m7;

import java.util.Objects;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f86486a;

    /* renamed from: b, reason: collision with root package name */
    public final float f86487b;

    /* renamed from: c, reason: collision with root package name */
    public final long f86488c;

    public y0(x0 x0Var) {
        this.f86486a = x0Var.f86477a;
        this.f86487b = x0Var.f86478b;
        this.f86488c = x0Var.f86479c;
    }

    public final boolean a(long j13) {
        long j14 = this.f86488c;
        return (j14 == -9223372036854775807L || j13 == -9223372036854775807L || j14 < j13) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f86486a == y0Var.f86486a && this.f86487b == y0Var.f86487b && this.f86488c == y0Var.f86488c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f86486a), Float.valueOf(this.f86487b), Long.valueOf(this.f86488c));
    }
}
