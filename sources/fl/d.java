package fl;

import java.util.Objects;

/* loaded from: classes.dex */
public final class d extends n {

    /* renamed from: a, reason: collision with root package name */
    public final int f62509a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62510b;

    /* renamed from: c, reason: collision with root package name */
    public final c f62511c;

    public d(int i13, int i14, c cVar) {
        this.f62509a = i13;
        this.f62510b = i14;
        this.f62511c = cVar;
    }

    @Override // uk.q
    public final boolean a() {
        return this.f62511c != c.f62507e;
    }

    public final int b() {
        c cVar = c.f62507e;
        int i13 = this.f62510b;
        c cVar2 = this.f62511c;
        if (cVar2 == cVar) {
            return i13;
        }
        if (cVar2 != c.f62504b && cVar2 != c.f62505c && cVar2 != c.f62506d) {
            throw new IllegalStateException("Unknown variant");
        }
        return i13 + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f62509a == this.f62509a && dVar.b() == b() && dVar.f62511c == this.f62511c;
    }

    public final int hashCode() {
        return Objects.hash(d.class, Integer.valueOf(this.f62509a), Integer.valueOf(this.f62510b), this.f62511c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb3.append(this.f62511c);
        sb3.append(", ");
        sb3.append(this.f62510b);
        sb3.append("-byte tags, and ");
        return a.a.n(sb3, this.f62509a, "-byte key)");
    }
}
