package ni1;

/* loaded from: classes5.dex */
public final class m1 implements z1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f90740a;

    public m1(int i13) {
        this.f90740a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1) && this.f90740a == ((m1) obj).f90740a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90740a);
    }

    public final int j() {
        return this.f90740a;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("OnPinChipIndexEvent(chipIndex="), this.f90740a, ")");
    }
}
