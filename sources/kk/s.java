package kk;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f79896a;

    /* renamed from: b, reason: collision with root package name */
    public final long f79897b;

    public s(int i13, long j13) {
        this.f79896a = i13;
        this.f79897b = j13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f79896a == sVar.f79896a && this.f79897b == sVar.f79897b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = this.f79896a ^ 1000003;
        long j13 = this.f79897b;
        return (i13 * 1000003) ^ ((int) ((j13 >>> 32) ^ j13));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f79896a + ", eventTimestamp=" + this.f79897b + "}";
    }
}
