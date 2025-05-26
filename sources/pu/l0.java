package pu;

/* loaded from: classes3.dex */
public final class l0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f101362a;

    public l0(int i13) {
        this.f101362a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && this.f101362a == ((l0) obj).f101362a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f101362a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("JumpToIndex(index="), this.f101362a, ")");
    }
}
