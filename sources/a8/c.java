package a8;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Objects;
import pk.h1;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f1298a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1299b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1300c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1301d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1302e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1303f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1304g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1305h;

    /* renamed from: i, reason: collision with root package name */
    public final h1 f1306i;

    /* renamed from: j, reason: collision with root package name */
    public final b f1307j;

    public c(a aVar, h1 h1Var, b bVar) {
        this.f1298a = aVar.f1273a;
        this.f1299b = aVar.f1274b;
        this.f1300c = (String) aVar.f1277e;
        this.f1301d = aVar.f1275c;
        this.f1303f = (String) aVar.f1278f;
        this.f1304g = (String) aVar.f1279g;
        this.f1302e = aVar.f1276d;
        this.f1305h = (String) aVar.f1280h;
        this.f1306i = h1Var;
        this.f1307j = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1298a.equals(cVar.f1298a) && this.f1299b == cVar.f1299b && this.f1300c.equals(cVar.f1300c) && this.f1301d == cVar.f1301d && this.f1302e == cVar.f1302e) {
            h1 h1Var = this.f1306i;
            h1Var.getClass();
            if (bf.b.M(cVar.f1306i, h1Var) && this.f1307j.equals(cVar.f1307j) && Objects.equals(this.f1303f, cVar.f1303f) && Objects.equals(this.f1304g, cVar.f1304g) && Objects.equals(this.f1305h, cVar.f1305h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f1307j.hashCode() + ((this.f1306i.hashCode() + ((((cb.d(this.f1300c, (cb.d(this.f1298a, RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER, 31) + this.f1299b) * 31, 31) + this.f1301d) * 31) + this.f1302e) * 31)) * 31)) * 31;
        String str = this.f1303f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1304g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1305h;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
