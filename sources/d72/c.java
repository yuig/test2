package d72;

import a.cb;
import f72.l;
import kg.t;
import kotlin.jvm.internal.Intrinsics;
import no2.g;
import org.jetbrains.annotations.NotNull;
import qo2.y0;

@g
/* loaded from: classes4.dex */
public final class c<T> {

    @NotNull
    public static final b Companion = new b();

    /* renamed from: g, reason: collision with root package name */
    public static final y0 f53910g;

    /* renamed from: a, reason: collision with root package name */
    public final String f53911a;

    /* renamed from: b, reason: collision with root package name */
    public final int f53912b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f53913c;

    /* renamed from: d, reason: collision with root package name */
    public final String f53914d;

    /* renamed from: e, reason: collision with root package name */
    public final String f53915e;

    /* renamed from: f, reason: collision with root package name */
    public final l f53916f;

    static {
        y0 y0Var = new y0("com.pinterest.shuffles.data.entity.PinterestResponseEntity", null, 6);
        y0Var.k("status", false);
        y0Var.k("code", false);
        y0Var.k("data", false);
        y0Var.k("message", false);
        y0Var.k("bookmark", true);
        y0Var.k("price_filters", true);
        f53910g = y0Var;
    }

    public /* synthetic */ c(int i13, String str, int i14, Object obj, String str2, String str3, l lVar) {
        if (15 != (i13 & 15)) {
            t.b1(i13, 15, f53910g);
            throw null;
        }
        this.f53911a = str;
        this.f53912b = i14;
        this.f53913c = obj;
        this.f53914d = str2;
        if ((i13 & 16) == 0) {
            this.f53915e = null;
        } else {
            this.f53915e = str3;
        }
        if ((i13 & 32) == 0) {
            this.f53916f = null;
        } else {
            this.f53916f = lVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f53911a, cVar.f53911a) && this.f53912b == cVar.f53912b && Intrinsics.d(this.f53913c, cVar.f53913c) && Intrinsics.d(this.f53914d, cVar.f53914d) && Intrinsics.d(this.f53915e, cVar.f53915e) && Intrinsics.d(this.f53916f, cVar.f53916f);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f53912b, this.f53911a.hashCode() * 31, 31);
        Object obj = this.f53913c;
        int d2 = cb.d(this.f53914d, (b13 + (obj == null ? 0 : obj.hashCode())) * 31, 31);
        String str = this.f53915e;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        l lVar = this.f53916f;
        return hashCode + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        return "PinterestResponseEntity(status=" + this.f53911a + ", code=" + this.f53912b + ", data=" + this.f53913c + ", message=" + this.f53914d + ", bookmark=" + this.f53915e + ", price_filters=" + this.f53916f + ")";
    }
}
