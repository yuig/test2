package u0;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f119774a;

    /* renamed from: b, reason: collision with root package name */
    public final long f119775b;

    public j(int i13, long j13) {
        this.f119774a = i13;
        this.f119775b = j13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f119774a == jVar.f119774a && this.f119775b == jVar.f119775b;
    }

    public final int hashCode() {
        int i13 = (this.f119774a ^ 1000003) * 1000003;
        long j13 = this.f119775b;
        return i13 ^ ((int) ((j13 >>> 32) ^ j13));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PacketInfo{sizeInBytes=");
        sb3.append(this.f119774a);
        sb3.append(", timestampNs=");
        return a.a.o(sb3, this.f119775b, "}");
    }
}
