package cy1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f53440a;

    /* renamed from: b, reason: collision with root package name */
    public final String f53441b;

    /* renamed from: c, reason: collision with root package name */
    public final String f53442c;

    /* renamed from: d, reason: collision with root package name */
    public final int f53443d;

    /* renamed from: e, reason: collision with root package name */
    public final int f53444e;

    public d(f30 f30Var, String str, String str2, int i13, int i14) {
        this.f53440a = f30Var;
        this.f53441b = str;
        this.f53442c = str2;
        this.f53443d = i13;
        this.f53444e = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f53440a, dVar.f53440a) && Intrinsics.d(this.f53441b, dVar.f53441b) && Intrinsics.d(this.f53442c, dVar.f53442c) && this.f53443d == dVar.f53443d && this.f53444e == dVar.f53444e;
    }

    public final int hashCode() {
        f30 f30Var = this.f53440a;
        int hashCode = (f30Var == null ? 0 : f30Var.hashCode()) * 31;
        String str = this.f53441b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f53442c;
        return Integer.hashCode(this.f53444e) + ep.b.b(this.f53443d, (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinViewData(pin=");
        sb3.append(this.f53440a);
        sb3.append(", pinImageUrl=");
        sb3.append(this.f53441b);
        sb3.append(", title=");
        sb3.append(this.f53442c);
        sb3.append(", comments=");
        sb3.append(this.f53443d);
        sb3.append(", reactions=");
        return a.a.n(sb3, this.f53444e, ")");
    }
}
