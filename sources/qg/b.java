package qg;

import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f103805a;

    /* renamed from: b, reason: collision with root package name */
    public final long f103806b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f103807c;

    public b(long j13, long j14, Set set) {
        this.f103805a = j13;
        this.f103806b = j14;
        this.f103807c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f103805a == bVar.f103805a && this.f103806b == bVar.f103806b && this.f103807c.equals(bVar.f103807c);
    }

    public final int hashCode() {
        long j13 = this.f103805a;
        int i13 = (((int) (j13 ^ (j13 >>> 32))) ^ 1000003) * 1000003;
        long j14 = this.f103806b;
        return ((i13 ^ ((int) ((j14 >>> 32) ^ j14))) * 1000003) ^ this.f103807c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f103805a + ", maxAllowedDelay=" + this.f103806b + ", flags=" + this.f103807c + "}";
    }
}
