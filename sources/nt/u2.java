package nt;

/* loaded from: classes3.dex */
public final class u2 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f92193a;

    public u2(int i13) {
        this.f92193a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u2) && this.f92193a == ((u2) obj).f92193a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92193a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("SubmitErrorDisplayState(errorMessage="), this.f92193a, ")");
    }
}
