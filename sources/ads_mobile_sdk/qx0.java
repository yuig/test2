package ads_mobile_sdk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qx0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10301a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10302b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10303c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10304d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10305e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10306f;

    /* renamed from: g, reason: collision with root package name */
    public final wi.d f10307g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10308h;

    public qx0(String text, List icons, int i13, int i14, int i15, long j13, wi.d attributionInfoPlacement, boolean z13) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(attributionInfoPlacement, "attributionInfoPlacement");
        this.f10301a = text;
        this.f10302b = icons;
        this.f10303c = i13;
        this.f10304d = i14;
        this.f10305e = i15;
        this.f10306f = j13;
        this.f10307g = attributionInfoPlacement;
        this.f10308h = z13;
    }

    public final long a() {
        return this.f10306f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx0)) {
            return false;
        }
        qx0 qx0Var = (qx0) obj;
        return Intrinsics.d(this.f10301a, qx0Var.f10301a) && Intrinsics.d(this.f10302b, qx0Var.f10302b) && this.f10303c == qx0Var.f10303c && this.f10304d == qx0Var.f10304d && this.f10305e == qx0Var.f10305e && zn2.b.d(this.f10306f, qx0Var.f10306f) && this.f10307g == qx0Var.f10307g && this.f10308h == qx0Var.f10308h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int f13 = kh2.n3.f(this.f10305e, kh2.n3.f(this.f10304d, kh2.n3.f(this.f10303c, gh0.b.p(this.f10301a.hashCode() * 31, this.f10302b))));
        long j13 = this.f10306f;
        zn2.a aVar = zn2.b.f142311b;
        int hashCode = (this.f10307g.hashCode() + a.a.c(j13, f13, 31)) * 31;
        boolean z13 = this.f10308h;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        return hashCode + i13;
    }

    public final String toString() {
        String str = this.f10301a;
        List list = this.f10302b;
        int i13 = this.f10303c;
        int i14 = this.f10304d;
        int i15 = this.f10305e;
        String o13 = zn2.b.o(this.f10306f);
        wi.d dVar = this.f10307g;
        boolean z13 = this.f10308h;
        StringBuilder sb3 = new StringBuilder("InternalAttributionInfo(text=");
        sb3.append(str);
        sb3.append(", icons=");
        sb3.append(list);
        sb3.append(", backgroundColor=");
        a.a.z(sb3, i13, ", textColor=", i14, ", textSize=");
        a.a.A(sb3, i15, ", animationInterval=", o13, ", attributionInfoPlacement=");
        sb3.append(dVar);
        sb3.append(", allowPubRendering=");
        sb3.append(z13);
        sb3.append(")");
        return sb3.toString();
    }
}
