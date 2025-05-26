package nk;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f91081a;

    /* renamed from: b, reason: collision with root package name */
    public final long f91082b;

    public j(int i13, long j13) {
        this.f91081a = i13;
        this.f91082b = j13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f91081a == jVar.f91081a && this.f91082b == jVar.f91082b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j13 = this.f91082b;
        return ((int) ((j13 >>> 32) ^ j13)) ^ ((this.f91081a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EventRecord{eventType=");
        sb3.append(this.f91081a);
        sb3.append(", eventTimestamp=");
        return a.a.o(sb3, this.f91082b, "}");
    }
}
