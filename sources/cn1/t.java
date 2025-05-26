package cn1;

/* loaded from: classes5.dex */
public final class t extends v {

    /* renamed from: b, reason: collision with root package name */
    public final int f28236b;

    public t(int i13) {
        super(i13);
        this.f28236b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f28236b == ((t) obj).f28236b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28236b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f28236b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("TrailingIconAnimationInterrupted(id="), this.f28236b, ")");
    }
}
