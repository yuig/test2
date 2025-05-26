package em;

import pd.s;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f59570h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f59571a;

    /* renamed from: b, reason: collision with root package name */
    public final c f59572b;

    /* renamed from: c, reason: collision with root package name */
    public final String f59573c;

    /* renamed from: d, reason: collision with root package name */
    public final String f59574d;

    /* renamed from: e, reason: collision with root package name */
    public final long f59575e;

    /* renamed from: f, reason: collision with root package name */
    public final long f59576f;

    /* renamed from: g, reason: collision with root package name */
    public final String f59577g;

    static {
        s sVar = new s();
        sVar.f99752f = 0L;
        sVar.k(c.ATTEMPT_MIGRATION);
        sVar.f99751e = 0L;
        sVar.g();
    }

    public a(String str, c cVar, String str2, String str3, long j13, long j14, String str4) {
        this.f59571a = str;
        this.f59572b = cVar;
        this.f59573c = str2;
        this.f59574d = str3;
        this.f59575e = j13;
        this.f59576f = j14;
        this.f59577g = str4;
    }

    public final s a() {
        s sVar = new s();
        sVar.f99747a = this.f59571a;
        sVar.f99748b = this.f59572b;
        sVar.f99749c = this.f59573c;
        sVar.f99750d = this.f59574d;
        sVar.f99751e = Long.valueOf(this.f59575e);
        sVar.f99752f = Long.valueOf(this.f59576f);
        sVar.f99753g = this.f59577g;
        return sVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f59571a;
        if (str != null ? str.equals(aVar.f59571a) : aVar.f59571a == null) {
            if (this.f59572b.equals(aVar.f59572b)) {
                String str2 = aVar.f59573c;
                String str3 = this.f59573c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = aVar.f59574d;
                    String str5 = this.f59574d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.f59575e == aVar.f59575e && this.f59576f == aVar.f59576f) {
                            String str6 = aVar.f59577g;
                            String str7 = this.f59577g;
                            if (str7 == null) {
                                if (str6 == null) {
                                    return true;
                                }
                            } else if (str7.equals(str6)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f59571a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f59572b.hashCode()) * 1000003;
        String str2 = this.f59573c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f59574d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j13 = this.f59575e;
        int i13 = (hashCode3 ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        long j14 = this.f59576f;
        int i14 = (i13 ^ ((int) (j14 ^ (j14 >>> 32)))) * 1000003;
        String str4 = this.f59577g;
        return (str4 != null ? str4.hashCode() : 0) ^ i14;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb3.append(this.f59571a);
        sb3.append(", registrationStatus=");
        sb3.append(this.f59572b);
        sb3.append(", authToken=");
        sb3.append(this.f59573c);
        sb3.append(", refreshToken=");
        sb3.append(this.f59574d);
        sb3.append(", expiresInSecs=");
        sb3.append(this.f59575e);
        sb3.append(", tokenCreationEpochInSecs=");
        sb3.append(this.f59576f);
        sb3.append(", fisError=");
        return a.a.p(sb3, this.f59577g, "}");
    }
}
