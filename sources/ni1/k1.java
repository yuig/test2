package ni1;

/* loaded from: classes2.dex */
public final class k1 implements z1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f90731a;

    public k1(int i13) {
        this.f90731a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1) && this.f90731a == ((k1) obj).f90731a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90731a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("OnItemDragEnd(newAdapterPosition="), this.f90731a, ")");
    }
}
