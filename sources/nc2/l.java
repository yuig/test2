package nc2;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f90409a;

    /* renamed from: b, reason: collision with root package name */
    public long f90410b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f90411c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f90412d;

    public /* synthetic */ l(boolean z13, long j13, int i13) {
        this((i13 & 2) != 0 ? 0L : j13, (i13 & 1) != 0 ? false : z13, true, false);
    }

    public final boolean a() {
        return this.f90409a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f90409a == lVar.f90409a && this.f90410b == lVar.f90410b && this.f90411c == lVar.f90411c && this.f90412d == lVar.f90412d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90412d) + ep.b.e(this.f90411c, a.a.c(this.f90410b, Boolean.hashCode(this.f90409a) * 31, 31), 31);
    }

    public final String toString() {
        return "VideoState(paused=" + this.f90409a + ", position=" + this.f90410b + ", autoplayEnabled=" + this.f90411c + ", looping=" + this.f90412d + ")";
    }

    public l(long j13, boolean z13, boolean z14, boolean z15) {
        this.f90409a = z13;
        this.f90410b = j13;
        this.f90411c = z14;
        this.f90412d = z15;
    }
}
