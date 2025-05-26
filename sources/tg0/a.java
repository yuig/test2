package tg0;

import df.j1;
import java.util.HashMap;
import nm.u;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f117573a;

    /* renamed from: b, reason: collision with root package name */
    public final String f117574b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f117575c;

    public a(String str, String str2, HashMap hashMap) {
        this.f117573a = "GET";
        this.f117574b = "";
        new HashMap();
        this.f117573a = str;
        this.f117574b = str2;
        this.f117575c = hashMap;
    }

    public final vd0.c a() {
        HashMap hashMap = this.f117575c;
        try {
            vd0.c cVar = new vd0.c();
            cVar.t("method", this.f117573a);
            cVar.t("uri", this.f117574b);
            if (hashMap.size() > 0) {
                cVar.f125623a.r("params", (u) vd0.c.f125622b.o(hashMap));
            }
            return cVar;
        } catch (Exception unused) {
            return new vd0.c();
        }
    }

    public final String toString() {
        return j1.W("%s:%s", this.f117573a, this.f117574b);
    }
}
