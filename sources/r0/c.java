package r0;

/* loaded from: classes2.dex */
public final class c extends o {

    /* renamed from: b, reason: collision with root package name */
    public final r f105494b;

    /* renamed from: c, reason: collision with root package name */
    public final int f105495c;

    public c(h hVar, int i13) {
        if (hVar == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.f105494b = hVar;
        this.f105495c = i13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        c cVar = (c) ((o) obj);
        return this.f105494b.equals(cVar.f105494b) && this.f105495c == cVar.f105495c;
    }

    public final int hashCode() {
        return ((this.f105494b.hashCode() ^ 1000003) * 1000003) ^ this.f105495c;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb3.append(this.f105494b);
        sb3.append(", fallbackRule=");
        return a.a.n(sb3, this.f105495c, "}");
    }
}
