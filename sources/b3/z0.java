package b3;

/* loaded from: classes.dex */
public final class z0 extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f21414a;

    public z0(long j13) {
        this.f21414a = j13;
    }

    @Override // b3.s
    public final void a(float f13, long j13, i iVar) {
        iVar.c(1.0f);
        long j14 = this.f21414a;
        if (f13 != 1.0f) {
            j14 = w.b(j14, w.d(j14) * f13);
        }
        iVar.e(j14);
        if (iVar.f21327c != null) {
            iVar.i(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z0) {
            return w.c(this.f21414a, ((z0) obj).f21414a);
        }
        return false;
    }

    public final int hashCode() {
        int i13 = w.f21391o;
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Long.hashCode(this.f21414a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) w.i(this.f21414a)) + ')';
    }
}
