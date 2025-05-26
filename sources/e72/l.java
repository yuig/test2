package e72;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* renamed from: a, reason: collision with root package name */
    public final String f57664a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57665b;

    /* renamed from: c, reason: collision with root package name */
    public final String f57666c;

    /* renamed from: d, reason: collision with root package name */
    public final String f57667d;

    /* renamed from: e, reason: collision with root package name */
    public final String f57668e;

    /* renamed from: f, reason: collision with root package name */
    public final String f57669f;

    /* renamed from: g, reason: collision with root package name */
    public final String f57670g;

    /* renamed from: h, reason: collision with root package name */
    public final int f57671h;

    /* renamed from: i, reason: collision with root package name */
    public final int f57672i;

    /* renamed from: j, reason: collision with root package name */
    public final String f57673j;

    /* renamed from: k, reason: collision with root package name */
    public final String f57674k;

    /* renamed from: l, reason: collision with root package name */
    public final String f57675l;

    /* renamed from: m, reason: collision with root package name */
    public final int f57676m;

    /* renamed from: n, reason: collision with root package name */
    public final String f57677n;

    public l(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i14, int i15, String str8, String str9, String str10, int i16, String str11) {
        if (16383 != (i13 & 16383)) {
            kg.t.b1(i13, 16383, j.f57663b);
            throw null;
        }
        this.f57664a = str;
        this.f57665b = str2;
        this.f57666c = str3;
        this.f57667d = str4;
        this.f57668e = str5;
        this.f57669f = str6;
        this.f57670g = str7;
        this.f57671h = i14;
        this.f57672i = i15;
        this.f57673j = str8;
        this.f57674k = str9;
        this.f57675l = str10;
        this.f57676m = i16;
        this.f57677n = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f57664a, lVar.f57664a) && Intrinsics.d(this.f57665b, lVar.f57665b) && Intrinsics.d(this.f57666c, lVar.f57666c) && Intrinsics.d(this.f57667d, lVar.f57667d) && Intrinsics.d(this.f57668e, lVar.f57668e) && Intrinsics.d(this.f57669f, lVar.f57669f) && Intrinsics.d(this.f57670g, lVar.f57670g) && this.f57671h == lVar.f57671h && this.f57672i == lVar.f57672i && Intrinsics.d(this.f57673j, lVar.f57673j) && Intrinsics.d(this.f57674k, lVar.f57674k) && Intrinsics.d(this.f57675l, lVar.f57675l) && this.f57676m == lVar.f57676m && Intrinsics.d(this.f57677n, lVar.f57677n);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f57666c, cb.d(this.f57665b, this.f57664a.hashCode() * 31, 31), 31);
        String str = this.f57667d;
        int d13 = cb.d(this.f57669f, cb.d(this.f57668e, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.f57670g;
        int b13 = ep.b.b(this.f57672i, ep.b.b(this.f57671h, (d13 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        String str3 = this.f57673j;
        int hashCode = (b13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f57674k;
        return this.f57677n.hashCode() + ep.b.b(this.f57676m, cb.d(this.f57675l, (hashCode + (str4 != null ? str4.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProductDataEntity(currency=");
        sb3.append(this.f57664a);
        sb3.append(", display_price=");
        sb3.append(this.f57665b);
        sb3.append(", type=");
        sb3.append(this.f57666c);
        sb3.append(", display_sale_price=");
        sb3.append(this.f57667d);
        sb3.append(", display_active_price=");
        sb3.append(this.f57668e);
        sb3.append(", active_price=");
        sb3.append(this.f57669f);
        sb3.append(", swatch_image=");
        sb3.append(this.f57670g);
        sb3.append(", max_quantity=");
        sb3.append(this.f57671h);
        sb3.append(", additional_images_length=");
        sb3.append(this.f57672i);
        sb3.append(", discount_percent=");
        sb3.append(this.f57673j);
        sb3.append(", sale_price=");
        sb3.append(this.f57674k);
        sb3.append(", price=");
        sb3.append(this.f57675l);
        sb3.append(", availability=");
        sb3.append(this.f57676m);
        sb3.append(", item_id=");
        return a.a.p(sb3, this.f57677n, ")");
    }
}
