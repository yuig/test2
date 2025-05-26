package c0;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f24250a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f24251b;

    public i(l0.t tVar) {
        this.f24251b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f24250a == iVar.f24250a && this.f24251b.equals(iVar.f24251b);
    }

    public final int hashCode() {
        return ((this.f24250a ^ 1000003) * 1000003) ^ this.f24251b.hashCode();
    }

    public final String toString() {
        return "Event{eventCode=" + this.f24250a + ", surfaceOutput=" + this.f24251b + "}";
    }
}
