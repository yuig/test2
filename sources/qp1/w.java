package qp1;

import a.cb;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f104849a;

    /* renamed from: b, reason: collision with root package name */
    public final String f104850b;

    /* renamed from: c, reason: collision with root package name */
    public final String f104851c;

    /* renamed from: d, reason: collision with root package name */
    public final String f104852d;

    /* renamed from: e, reason: collision with root package name */
    public final f30 f104853e;

    public w(String adDestinationUrl, String destinationType, String shoppingIntegrationType, String promotedName, f30 pin) {
        Intrinsics.checkNotNullParameter(adDestinationUrl, "adDestinationUrl");
        Intrinsics.checkNotNullParameter(destinationType, "destinationType");
        Intrinsics.checkNotNullParameter(shoppingIntegrationType, "shoppingIntegrationType");
        Intrinsics.checkNotNullParameter(promotedName, "promotedName");
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f104849a = adDestinationUrl;
        this.f104850b = destinationType;
        this.f104851c = shoppingIntegrationType;
        this.f104852d = promotedName;
        this.f104853e = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f104849a, wVar.f104849a) && Intrinsics.d(this.f104850b, wVar.f104850b) && Intrinsics.d(this.f104851c, wVar.f104851c) && Intrinsics.d(this.f104852d, wVar.f104852d) && Intrinsics.d(this.f104853e, wVar.f104853e);
    }

    public final int hashCode() {
        return this.f104853e.hashCode() + cb.d(this.f104852d, cb.d(this.f104851c, cb.d(this.f104850b, this.f104849a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnInitializeSuccess(adDestinationUrl=");
        sb3.append(this.f104849a);
        sb3.append(", destinationType=");
        sb3.append(this.f104850b);
        sb3.append(", shoppingIntegrationType=");
        sb3.append(this.f104851c);
        sb3.append(", promotedName=");
        sb3.append(this.f104852d);
        sb3.append(", pin=");
        return jq.b.e(sb3, this.f104853e, ")");
    }
}
