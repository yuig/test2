package tu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s implements t {

    /* renamed from: a, reason: collision with root package name */
    public final w f119308a;

    /* renamed from: b, reason: collision with root package name */
    public final String f119309b;

    public s(u adsWebBrowserPinData, String str) {
        Intrinsics.checkNotNullParameter(adsWebBrowserPinData, "adsWebBrowserPinData");
        this.f119308a = adsWebBrowserPinData;
        this.f119309b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f119308a, sVar.f119308a) && Intrinsics.d(this.f119309b, sVar.f119309b);
    }

    public final int hashCode() {
        int hashCode = this.f119308a.hashCode() * 31;
        String str = this.f119309b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PinLoaded(adsWebBrowserPinData=" + this.f119308a + ", firstPageUrl=" + this.f119309b + ")";
    }
}
