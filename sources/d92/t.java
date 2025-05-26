package d92;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t implements z {

    /* renamed from: a, reason: collision with root package name */
    public final String f54189a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54190b;

    /* renamed from: c, reason: collision with root package name */
    public final String f54191c;

    /* renamed from: d, reason: collision with root package name */
    public final String f54192d;

    public t(String adDestinationUrl, String destinationType, String shoppingIntegrationType, String promotedName) {
        Intrinsics.checkNotNullParameter(adDestinationUrl, "adDestinationUrl");
        Intrinsics.checkNotNullParameter(destinationType, "destinationType");
        Intrinsics.checkNotNullParameter(shoppingIntegrationType, "shoppingIntegrationType");
        Intrinsics.checkNotNullParameter(promotedName, "promotedName");
        this.f54189a = adDestinationUrl;
        this.f54190b = destinationType;
        this.f54191c = shoppingIntegrationType;
        this.f54192d = promotedName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f54189a, tVar.f54189a) && Intrinsics.d(this.f54190b, tVar.f54190b) && Intrinsics.d(this.f54191c, tVar.f54191c) && Intrinsics.d(this.f54192d, tVar.f54192d);
    }

    public final int hashCode() {
        return this.f54192d.hashCode() + cb.d(this.f54191c, cb.d(this.f54190b, this.f54189a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnInitializeSuccess(adDestinationUrl=");
        sb3.append(this.f54189a);
        sb3.append(", destinationType=");
        sb3.append(this.f54190b);
        sb3.append(", shoppingIntegrationType=");
        sb3.append(this.f54191c);
        sb3.append(", promotedName=");
        return a.a.p(sb3, this.f54192d, ")");
    }
}
