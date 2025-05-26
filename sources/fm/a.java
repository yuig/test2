package fm;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f62550a;

    /* renamed from: b, reason: collision with root package name */
    public final String f62551b;

    /* renamed from: c, reason: collision with root package name */
    public final String f62552c;

    /* renamed from: d, reason: collision with root package name */
    public final b f62553d;

    /* renamed from: e, reason: collision with root package name */
    public final d f62554e;

    public a(String str, String str2, String str3, b bVar, d dVar) {
        this.f62550a = str;
        this.f62551b = str2;
        this.f62552c = str3;
        this.f62553d = bVar;
        this.f62554e = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f62550a;
        if (str != null ? str.equals(aVar.f62550a) : aVar.f62550a == null) {
            String str2 = this.f62551b;
            if (str2 != null ? str2.equals(aVar.f62551b) : aVar.f62551b == null) {
                String str3 = this.f62552c;
                if (str3 != null ? str3.equals(aVar.f62552c) : aVar.f62552c == null) {
                    b bVar = this.f62553d;
                    if (bVar != null ? bVar.equals(aVar.f62553d) : aVar.f62553d == null) {
                        d dVar = this.f62554e;
                        if (dVar == null) {
                            if (aVar.f62554e == null) {
                                return true;
                            }
                        } else if (dVar.equals(aVar.f62554e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f62550a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f62551b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f62552c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f62553d;
        int hashCode4 = (hashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        d dVar = this.f62554e;
        return (dVar != null ? dVar.hashCode() : 0) ^ hashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f62550a + ", fid=" + this.f62551b + ", refreshToken=" + this.f62552c + ", authToken=" + this.f62553d + ", responseCode=" + this.f62554e + "}";
    }
}
