package ze1;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f141802a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f141803b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f141804c;

    public a(boolean z13, boolean z14, boolean z15) {
        this.f141802a = z13;
        this.f141803b = z14;
        this.f141804c = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f141802a == aVar.f141802a && this.f141803b == aVar.f141803b && this.f141804c == aVar.f141804c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f141804c) + ep.b.e(this.f141803b, Boolean.hashCode(this.f141802a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProductMetadataViewSpec(showProductPrice=");
        sb3.append(this.f141802a);
        sb3.append(", showProductTitle=");
        sb3.append(this.f141803b);
        sb3.append(", showMerchantName=");
        return a.a.r(sb3, this.f141804c, ")");
    }
}
