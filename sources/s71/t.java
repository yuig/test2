package s71;

import a.cb;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends tb.f {

    /* renamed from: h, reason: collision with root package name */
    public final f30 f111408h;

    /* renamed from: i, reason: collision with root package name */
    public final String f111409i;

    /* renamed from: j, reason: collision with root package name */
    public final String f111410j;

    /* renamed from: k, reason: collision with root package name */
    public final String f111411k;

    /* renamed from: l, reason: collision with root package name */
    public final String f111412l;

    /* renamed from: m, reason: collision with root package name */
    public final String f111413m;

    public t(f30 pin, String pinId, String imageUrl, String price, String str, String merchantName) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        this.f111408h = pin;
        this.f111409i = pinId;
        this.f111410j = imageUrl;
        this.f111411k = price;
        this.f111412l = str;
        this.f111413m = merchantName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f111408h, tVar.f111408h) && Intrinsics.d(this.f111409i, tVar.f111409i) && Intrinsics.d(this.f111410j, tVar.f111410j) && Intrinsics.d(this.f111411k, tVar.f111411k) && Intrinsics.d(this.f111412l, tVar.f111412l) && Intrinsics.d(this.f111413m, tVar.f111413m);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f111411k, cb.d(this.f111410j, cb.d(this.f111409i, this.f111408h.hashCode() * 31, 31), 31), 31);
        String str = this.f111412l;
        return this.f111413m.hashCode() + ((d2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProductInfoViewModel(pin=");
        sb3.append(this.f111408h);
        sb3.append(", pinId=");
        sb3.append(this.f111409i);
        sb3.append(", imageUrl=");
        sb3.append(this.f111410j);
        sb3.append(", price=");
        sb3.append(this.f111411k);
        sb3.append(", pinDominantColor=");
        sb3.append(this.f111412l);
        sb3.append(", merchantName=");
        return a.a.p(sb3, this.f111413m, ")");
    }
}
