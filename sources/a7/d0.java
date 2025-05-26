package a7;

import a.cb;
import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f969a;

    /* renamed from: b, reason: collision with root package name */
    public final String f970b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f971c;

    /* renamed from: d, reason: collision with root package name */
    public final List f972d;

    /* renamed from: e, reason: collision with root package name */
    public final String f973e;

    /* renamed from: f, reason: collision with root package name */
    public final pk.c1 f974f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f975g;

    /* renamed from: h, reason: collision with root package name */
    public final long f976h;

    static {
        cb.s(0, 1, 2, 3, 4);
        d7.n0.Q(5);
        d7.n0.Q(6);
        d7.n0.Q(7);
    }

    public d0(Uri uri, String str, a0 a0Var, List list, String str2, pk.c1 c1Var, Object obj, long j13) {
        this.f969a = uri;
        this.f970b = o0.r(str);
        this.f971c = a0Var;
        this.f972d = list;
        this.f973e = str2;
        this.f974f = c1Var;
        pk.x0 n13 = pk.c1.n();
        for (int i13 = 0; i13 < c1Var.size(); i13++) {
            n13.g(g0.a(((h0) c1Var.get(i13)).a()));
        }
        n13.i();
        this.f975g = obj;
        this.f976h = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f969a.equals(d0Var.f969a) && Objects.equals(this.f970b, d0Var.f970b) && Objects.equals(this.f971c, d0Var.f971c) && this.f972d.equals(d0Var.f972d) && Objects.equals(this.f973e, d0Var.f973e) && this.f974f.equals(d0Var.f974f) && Objects.equals(this.f975g, d0Var.f975g) && this.f976h == d0Var.f976h;
    }

    public final int hashCode() {
        int hashCode = this.f969a.hashCode() * 31;
        String str = this.f970b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        a0 a0Var = this.f971c;
        int hashCode3 = (this.f972d.hashCode() + ((hashCode2 + (a0Var == null ? 0 : a0Var.hashCode())) * 961)) * 31;
        String str2 = this.f973e;
        int hashCode4 = (this.f974f.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        return (int) (((hashCode4 + (this.f975g != null ? r2.hashCode() : 0)) * 31) + this.f976h);
    }
}
