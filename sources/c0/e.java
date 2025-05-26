package c0;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final t f24224a;

    /* renamed from: b, reason: collision with root package name */
    public final f f24225b;

    public e(t tVar, f fVar) {
        if (tVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f24224a = tVar;
        this.f24225b = fVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f24224a.equals(eVar.f24224a)) {
            f fVar = eVar.f24225b;
            f fVar2 = this.f24225b;
            if (fVar2 == null) {
                if (fVar == null) {
                    return true;
                }
            } else if (fVar2.equals(fVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f24224a.hashCode() ^ 1000003) * 1000003;
        f fVar = this.f24225b;
        return hashCode ^ (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        return "CameraState{type=" + this.f24224a + ", error=" + this.f24225b + "}";
    }
}
