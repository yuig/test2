package ni1;

/* loaded from: classes2.dex */
public final class m0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f90739a;

    public m0(int i13) {
        this.f90739a = i13;
    }

    public final int a() {
        return this.f90739a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && this.f90739a == ((m0) obj).f90739a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90739a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("MaybeOverrideParent(background="), this.f90739a, ")");
    }
}
