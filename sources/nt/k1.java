package nt;

/* loaded from: classes3.dex */
public final class k1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f92082a;

    public k1(int i13) {
        this.f92082a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1) && this.f92082a == ((k1) obj).f92082a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92082a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("CustomCheckboxList(id="), this.f92082a, ")");
    }
}
