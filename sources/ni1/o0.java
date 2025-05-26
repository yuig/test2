package ni1;

/* loaded from: classes2.dex */
public final class o0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f90759a;

    public o0(int i13) {
        this.f90759a = i13;
    }

    public final int a() {
        return this.f90759a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && this.f90759a == ((o0) obj).f90759a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90759a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Override(background="), this.f90759a, ")");
    }
}
