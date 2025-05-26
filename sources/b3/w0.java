package b3;

/* loaded from: classes2.dex */
public final class w0 {

    /* renamed from: d, reason: collision with root package name */
    public static final w0 f21393d = new w0();

    /* renamed from: a, reason: collision with root package name */
    public final long f21394a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21395b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21396c;

    public /* synthetic */ w0() {
        this(androidx.compose.ui.graphics.a.d(4278190080L), 0L, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return w.c(this.f21394a, w0Var.f21394a) && a3.c.b(this.f21395b, w0Var.f21395b) && this.f21396c == w0Var.f21396c;
    }

    public final int hashCode() {
        int i13 = w.f21391o;
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Float.hashCode(this.f21396c) + a.a.c(this.f21395b, Long.hashCode(this.f21394a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Shadow(color=");
        jq.b.t(this.f21394a, sb3, ", offset=");
        sb3.append((Object) a3.c.j(this.f21395b));
        sb3.append(", blurRadius=");
        return d7.g.h(sb3, this.f21396c, ')');
    }

    public w0(long j13, long j14, float f13) {
        this.f21394a = j13;
        this.f21395b = j14;
        this.f21396c = f13;
    }
}
