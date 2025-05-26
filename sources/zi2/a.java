package zi2;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f142031e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f142032a;

    /* renamed from: b, reason: collision with root package name */
    public final String f142033b;

    /* renamed from: c, reason: collision with root package name */
    public final String f142034c;

    /* renamed from: d, reason: collision with root package name */
    public final qi2.d f142035d;

    static {
        a(qi2.a.f104005d, "", null, null);
    }

    public a(qi2.d dVar, String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f142032a = str;
        this.f142033b = str2;
        this.f142034c = str3;
        if (dVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f142035d = dVar;
    }

    public static a a(qi2.d dVar, String str, String str2, String str3) {
        Objects.requireNonNull(str, "name");
        Objects.requireNonNull(dVar, "attributes");
        return new a(dVar, str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f142032a.equals(aVar.f142032a)) {
            String str = aVar.f142033b;
            String str2 = this.f142033b;
            if (str2 != null ? str2.equals(str) : str == null) {
                String str3 = aVar.f142034c;
                String str4 = this.f142034c;
                if (str4 != null ? str4.equals(str3) : str3 == null) {
                    if (this.f142035d.equals(aVar.f142035d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f142032a.hashCode() ^ 1000003) * 1000003;
        String str = this.f142033b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f142034c;
        return ((hashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.f142035d.hashCode();
    }

    public final String toString() {
        return "InstrumentationScopeInfo{name=" + this.f142032a + ", version=" + this.f142033b + ", schemaUrl=" + this.f142034c + ", attributes=" + this.f142035d + "}";
    }
}
