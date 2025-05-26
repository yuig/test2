package q72;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f102823a;

    /* renamed from: b, reason: collision with root package name */
    public final String f102824b;

    /* renamed from: c, reason: collision with root package name */
    public final String f102825c;

    /* renamed from: d, reason: collision with root package name */
    public final String f102826d;

    /* renamed from: e, reason: collision with root package name */
    public final String f102827e;

    /* renamed from: f, reason: collision with root package name */
    public final String f102828f;

    /* renamed from: g, reason: collision with root package name */
    public final String f102829g;

    /* renamed from: h, reason: collision with root package name */
    public final int f102830h;

    /* renamed from: i, reason: collision with root package name */
    public final String f102831i;

    /* renamed from: j, reason: collision with root package name */
    public final String f102832j;

    /* renamed from: k, reason: collision with root package name */
    public final String f102833k;

    /* renamed from: l, reason: collision with root package name */
    public final int f102834l;

    /* renamed from: m, reason: collision with root package name */
    public final String f102835m;

    public d(String currency, String displayPrice, String type, String str, String displayActivePrice, String activePrice, String str2, int i13, String str3, String str4, String price, int i14, String itemId) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(displayActivePrice, "displayActivePrice");
        Intrinsics.checkNotNullParameter(activePrice, "activePrice");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f102823a = currency;
        this.f102824b = displayPrice;
        this.f102825c = type;
        this.f102826d = str;
        this.f102827e = displayActivePrice;
        this.f102828f = activePrice;
        this.f102829g = str2;
        this.f102830h = i13;
        this.f102831i = str3;
        this.f102832j = str4;
        this.f102833k = price;
        this.f102834l = i14;
        this.f102835m = itemId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f102823a, dVar.f102823a) && Intrinsics.d(this.f102824b, dVar.f102824b) && Intrinsics.d(this.f102825c, dVar.f102825c) && Intrinsics.d(this.f102826d, dVar.f102826d) && Intrinsics.d(this.f102827e, dVar.f102827e) && Intrinsics.d(this.f102828f, dVar.f102828f) && Intrinsics.d(this.f102829g, dVar.f102829g) && this.f102830h == dVar.f102830h && Intrinsics.d(this.f102831i, dVar.f102831i) && Intrinsics.d(this.f102832j, dVar.f102832j) && Intrinsics.d(this.f102833k, dVar.f102833k) && this.f102834l == dVar.f102834l && Intrinsics.d(this.f102835m, dVar.f102835m);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f102825c, cb.d(this.f102824b, this.f102823a.hashCode() * 31, 31), 31);
        String str = this.f102826d;
        int d13 = cb.d(this.f102828f, cb.d(this.f102827e, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.f102829g;
        int b13 = ep.b.b(this.f102830h, (d13 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f102831i;
        int hashCode = (b13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f102832j;
        return this.f102835m.hashCode() + ep.b.b(this.f102834l, cb.d(this.f102833k, (hashCode + (str4 != null ? str4.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProductPinData(currency=");
        sb3.append(this.f102823a);
        sb3.append(", displayPrice=");
        sb3.append(this.f102824b);
        sb3.append(", type=");
        sb3.append(this.f102825c);
        sb3.append(", displaySalePrice=");
        sb3.append(this.f102826d);
        sb3.append(", displayActivePrice=");
        sb3.append(this.f102827e);
        sb3.append(", activePrice=");
        sb3.append(this.f102828f);
        sb3.append(", swatchImage=");
        sb3.append(this.f102829g);
        sb3.append(", maxQuantity=");
        sb3.append(this.f102830h);
        sb3.append(", discountPercent=");
        sb3.append(this.f102831i);
        sb3.append(", salePrice=");
        sb3.append(this.f102832j);
        sb3.append(", price=");
        sb3.append(this.f102833k);
        sb3.append(", availability=");
        sb3.append(this.f102834l);
        sb3.append(", itemId=");
        return a.a.p(sb3, this.f102835m, ")");
    }
}
