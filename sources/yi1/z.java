package yi1;

/* loaded from: classes2.dex */
public final class z implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f139170a;

    /* renamed from: b, reason: collision with root package name */
    public final int f139171b;

    /* renamed from: c, reason: collision with root package name */
    public final long f139172c;

    public z(int i13, int i14, long j13) {
        this.f139170a = i13;
        this.f139171b = i14;
        this.f139172c = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f139170a == zVar.f139170a && this.f139171b == zVar.f139171b && this.f139172c == zVar.f139172c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f139172c) + ep.b.b(this.f139171b, Integer.hashCode(this.f139170a) * 31, 31);
    }

    public final long j() {
        return this.f139172c;
    }

    public final int k() {
        return this.f139170a;
    }

    public final int l() {
        return this.f139171b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnUserInput(xPosition=");
        sb3.append(this.f139170a);
        sb3.append(", yPosition=");
        sb3.append(this.f139171b);
        sb3.append(", timestamp=");
        return a.a.o(sb3, this.f139172c, ")");
    }
}
