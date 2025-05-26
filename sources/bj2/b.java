package bj2;

/* loaded from: classes4.dex */
public final class b extends h {

    /* renamed from: a, reason: collision with root package name */
    public final mj2.a f22972a;

    /* renamed from: b, reason: collision with root package name */
    public final zi2.a f22973b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22974c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22975d;

    /* renamed from: e, reason: collision with root package name */
    public final ui2.l f22976e;

    /* renamed from: f, reason: collision with root package name */
    public final si2.g f22977f;

    /* renamed from: g, reason: collision with root package name */
    public final String f22978g;

    /* renamed from: h, reason: collision with root package name */
    public final qi2.d f22979h;

    /* renamed from: i, reason: collision with root package name */
    public final int f22980i;

    /* renamed from: j, reason: collision with root package name */
    public final qi2.e f22981j;

    public b(int i13, long j13, long j14, qi2.a aVar, qi2.e eVar, si2.g gVar, ui2.l lVar, zi2.a aVar2, mj2.a aVar3, String str) {
        if (aVar3 == null) {
            throw new NullPointerException("Null resource");
        }
        this.f22972a = aVar3;
        if (aVar2 == null) {
            throw new NullPointerException("Null instrumentationScopeInfo");
        }
        this.f22973b = aVar2;
        this.f22974c = j13;
        this.f22975d = j14;
        if (lVar == null) {
            throw new NullPointerException("Null spanContext");
        }
        this.f22976e = lVar;
        if (gVar == null) {
            throw new NullPointerException("Null severity");
        }
        this.f22977f = gVar;
        this.f22978g = str;
        if (aVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f22979h = aVar;
        this.f22980i = i13;
        this.f22981j = eVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f22972a.equals(((b) hVar).f22972a)) {
            b bVar = (b) hVar;
            if (this.f22973b.equals(bVar.f22973b) && this.f22974c == bVar.f22974c && this.f22975d == bVar.f22975d && this.f22976e.equals(bVar.f22976e) && this.f22977f.equals(bVar.f22977f)) {
                String str = bVar.f22978g;
                String str2 = this.f22978g;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f22979h.equals(bVar.f22979h) && this.f22980i == bVar.f22980i) {
                        qi2.e eVar = bVar.f22981j;
                        qi2.e eVar2 = this.f22981j;
                        if (eVar2 == null) {
                            if (eVar == null) {
                                return true;
                            }
                        } else if (eVar2.equals(eVar)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f22972a.hashCode() ^ 1000003) * 1000003) ^ this.f22973b.hashCode()) * 1000003;
        long j13 = this.f22974c;
        int i13 = (hashCode ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        long j14 = this.f22975d;
        int hashCode2 = (((((i13 ^ ((int) (j14 ^ (j14 >>> 32)))) * 1000003) ^ this.f22976e.hashCode()) * 1000003) ^ this.f22977f.hashCode()) * 1000003;
        String str = this.f22978g;
        int hashCode3 = (((((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f22979h.hashCode()) * 1000003) ^ this.f22980i) * 1000003;
        qi2.e eVar = this.f22981j;
        return hashCode3 ^ (eVar != null ? eVar.f104007a.hashCode() : 0);
    }

    public final String toString() {
        return "SdkLogRecordData{resource=" + this.f22972a + ", instrumentationScopeInfo=" + this.f22973b + ", timestampEpochNanos=" + this.f22974c + ", observedTimestampEpochNanos=" + this.f22975d + ", spanContext=" + this.f22976e + ", severity=" + this.f22977f + ", severityText=" + this.f22978g + ", attributes=" + this.f22979h + ", totalAttributeCount=" + this.f22980i + ", bodyValue=" + this.f22981j + "}";
    }
}
