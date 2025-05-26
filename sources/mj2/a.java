package mj2;

import g72.c0;
import java.util.Objects;
import java.util.logging.Logger;
import qi2.c;
import qi2.d;
import ri2.e;
import t3.s1;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f87279c = Logger.getLogger(a.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final a f87280d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f87281e;

    /* renamed from: a, reason: collision with root package name */
    public final String f87282a;

    /* renamed from: b, reason: collision with root package name */
    public final d f87283b;

    static {
        c cVar = c.STRING;
        e a13 = e.a(cVar, "service.name");
        e a14 = e.a(cVar, "telemetry.sdk.language");
        e a15 = e.a(cVar, "telemetry.sdk.name");
        e a16 = e.a(cVar, "telemetry.sdk.version");
        qi2.a aVar = qi2.a.f104005d;
        f87280d = a(aVar, null);
        if (!a13.f108404b.isEmpty()) {
            aVar = new qi2.a(new Object[]{a13, "unknown_service:java"});
        }
        a a17 = a(aVar, null);
        qi2.b bVar = new qi2.b();
        bVar.b(a15, "opentelemetry");
        bVar.b(a14, "java");
        bVar.b(a16, "1.46.0");
        f87281e = a17.b(a(bVar.a(), null));
    }

    public a(qi2.a aVar, String str) {
        this.f87282a = str;
        if (aVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f87283b = aVar;
    }

    public static a a(qi2.a aVar, String str) {
        Objects.requireNonNull(aVar, "attributes");
        aVar.forEach(new b());
        return new a(aVar, str);
    }

    public final a b(a aVar) {
        if (aVar == f87280d) {
            return this;
        }
        qi2.b bVar = new qi2.b();
        int i13 = 1;
        d dVar = this.f87283b;
        if (dVar != null) {
            dVar.forEach(new c0(bVar, i13));
        }
        d dVar2 = aVar.f87283b;
        if (dVar2 != null) {
            dVar2.forEach(new c0(bVar, i13));
        }
        String str = this.f87282a;
        String str2 = aVar.f87282a;
        if (str2 == null) {
            return a(bVar.a(), str);
        }
        if (str == null) {
            return a(bVar.a(), str2);
        }
        if (str2.equals(str)) {
            return a(bVar.a(), str);
        }
        f87279c.info(s1.c("Attempting to merge Resources with different schemaUrls. The resulting Resource will have no schemaUrl assigned. Schema 1: ", str, " Schema 2: ", str2));
        return a(bVar.a(), null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f87282a;
        if (str != null ? str.equals(aVar.f87282a) : aVar.f87282a == null) {
            if (this.f87283b.equals(aVar.f87283b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f87282a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f87283b.hashCode();
    }

    public final String toString() {
        return "Resource{schemaUrl=" + this.f87282a + ", attributes=" + this.f87283b + "}";
    }
}
