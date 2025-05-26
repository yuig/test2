package e9;

import d7.n0;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f57903a;

    /* renamed from: b, reason: collision with root package name */
    public final long f57904b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57905c;

    public b(int i13, long j13, long j14) {
        bf.b.i(j13 < j14);
        this.f57903a = j13;
        this.f57904b = j14;
        this.f57905c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f57903a == bVar.f57903a && this.f57904b == bVar.f57904b && this.f57905c == bVar.f57905c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f57903a), Long.valueOf(this.f57904b), Integer.valueOf(this.f57905c));
    }

    public final String toString() {
        int i13 = n0.f53866a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f57903a + ", endTimeMs=" + this.f57904b + ", speedDivisor=" + this.f57905c;
    }
}
