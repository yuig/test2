package fm;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f62555a;

    /* renamed from: b, reason: collision with root package name */
    public final long f62556b;

    /* renamed from: c, reason: collision with root package name */
    public final f f62557c;

    public b(String str, long j13, f fVar) {
        this.f62555a = str;
        this.f62556b = j13;
        this.f62557c = fVar;
    }

    public static x92.b a() {
        x92.b bVar = new x92.b(21);
        bVar.f134366c = 0L;
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f62555a;
        if (str != null ? str.equals(bVar.f62555a) : bVar.f62555a == null) {
            if (this.f62556b == bVar.f62556b) {
                f fVar = bVar.f62557c;
                f fVar2 = this.f62557c;
                if (fVar2 == null) {
                    if (fVar == null) {
                        return true;
                    }
                } else if (fVar2.equals(fVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f62555a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j13 = this.f62556b;
        int i13 = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003;
        f fVar = this.f62557c;
        return (fVar != null ? fVar.hashCode() : 0) ^ i13;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f62555a + ", tokenExpirationTimestamp=" + this.f62556b + ", responseCode=" + this.f62557c + "}";
    }
}
