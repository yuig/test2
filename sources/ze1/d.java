package ze1;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f141810a;

    /* renamed from: b, reason: collision with root package name */
    public final String f141811b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f141812c;

    /* renamed from: d, reason: collision with root package name */
    public final String f141813d;

    /* renamed from: e, reason: collision with root package name */
    public final c f141814e;

    /* renamed from: f, reason: collision with root package name */
    public final String f141815f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f141816g;

    /* renamed from: h, reason: collision with root package name */
    public final String f141817h;

    public /* synthetic */ d(String str, String str2, boolean z13, String str3, String str4, String str5, int i13) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? "" : str3, new c((String) null, 3), (i13 & 32) != 0 ? "module_source_closeup" : str4, false, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f141810a, dVar.f141810a) && Intrinsics.d(this.f141811b, dVar.f141811b) && this.f141812c == dVar.f141812c && Intrinsics.d(this.f141813d, dVar.f141813d) && Intrinsics.d(this.f141814e, dVar.f141814e) && Intrinsics.d(this.f141815f, dVar.f141815f) && this.f141816g == dVar.f141816g && Intrinsics.d(this.f141817h, dVar.f141817h);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f141816g, cb.d(this.f141815f, (this.f141814e.hashCode() + cb.d(this.f141813d, ep.b.e(this.f141812c, cb.d(this.f141811b, this.f141810a.hashCode() * 31, 31), 31), 31)) * 31, 31), 31);
        String str = this.f141817h;
        return e13 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShoppingNavigationExtraContext(brandImageUrl=");
        sb3.append(this.f141810a);
        sb3.append(", brandName=");
        sb3.append(this.f141811b);
        sb3.append(", brandVerification=");
        sb3.append(this.f141812c);
        sb3.append(", brandUserId=");
        sb3.append(this.f141813d);
        sb3.append(", apiParams=");
        sb3.append(this.f141814e);
        sb3.append(", moduleSource=");
        sb3.append(this.f141815f);
        sb3.append(", merchantVerification=");
        sb3.append(this.f141816g);
        sb3.append(", shopSource=");
        return a.a.p(sb3, this.f141817h, ")");
    }

    public d(String brandImageUrl, String brandName, boolean z13, String brandUserId, c apiParams, String moduleSource, boolean z14, String str) {
        Intrinsics.checkNotNullParameter(brandImageUrl, "brandImageUrl");
        Intrinsics.checkNotNullParameter(brandName, "brandName");
        Intrinsics.checkNotNullParameter(brandUserId, "brandUserId");
        Intrinsics.checkNotNullParameter(apiParams, "apiParams");
        Intrinsics.checkNotNullParameter(moduleSource, "moduleSource");
        this.f141810a = brandImageUrl;
        this.f141811b = brandName;
        this.f141812c = z13;
        this.f141813d = brandUserId;
        this.f141814e = apiParams;
        this.f141815f = moduleSource;
        this.f141816g = z14;
        this.f141817h = str;
    }
}
