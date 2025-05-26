package x02;

import a.cb;

/* loaded from: classes4.dex */
public final class k2 extends dl1.m {

    /* renamed from: c, reason: collision with root package name */
    public final j22.c f131431c;

    /* renamed from: d, reason: collision with root package name */
    public final j22.a f131432d;

    /* renamed from: e, reason: collision with root package name */
    public final String f131433e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f131434f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f131435g;

    /* renamed from: h, reason: collision with root package name */
    public final j22.l f131436h;

    public k2(j22.c cVar, j22.a aVar, String str, boolean z13, boolean z14, j22.l lVar) {
        this.f55251a = false;
        this.f131431c = cVar;
        this.f131432d = aVar;
        this.f131433e = str;
        this.f131434f = z13;
        this.f131435g = z14;
        this.f131436h = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k2.class != obj.getClass()) {
            return false;
        }
        k2 k2Var = (k2) obj;
        if (this.f131434f == k2Var.f131434f && this.f131435g == k2Var.f131435g && this.f131431c == k2Var.f131431c) {
            return this.f131432d == k2Var.f131432d && this.f131433e.equals(k2Var.f131433e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f131431c.hashCode() * 31;
        j22.a aVar = this.f131432d;
        return ((cb.d(this.f131433e, (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31, 31) + (this.f131434f ? 1 : 0)) * 31) + (this.f131435g ? 1 : 0);
    }
}
