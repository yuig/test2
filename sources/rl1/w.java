package rl1;

/* loaded from: classes2.dex */
public final class w extends y {

    /* renamed from: b, reason: collision with root package name */
    public final int f108664b;

    public w(int i13) {
        super(i13);
        this.f108664b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.f108664b == ((w) obj).f108664b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108664b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f108664b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ImageSet(id="), this.f108664b, ")");
    }
}
