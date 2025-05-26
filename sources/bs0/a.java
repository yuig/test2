package bs0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f23845a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23846b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23847c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23848d;

    public a(f30 pin, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f23845a = pin;
        this.f23846b = str;
        this.f23847c = str2;
        this.f23848d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f23845a, aVar.f23845a) && Intrinsics.d(this.f23846b, aVar.f23846b) && Intrinsics.d(this.f23847c, aVar.f23847c) && Intrinsics.d(this.f23848d, aVar.f23848d);
    }

    public final int hashCode() {
        int hashCode = this.f23845a.hashCode() * 31;
        String str = this.f23846b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23847c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f23848d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HideParams(pin=");
        sb3.append(this.f23845a);
        sb3.append(", query=");
        sb3.append(this.f23846b);
        sb3.append(", clientTrackingParam=");
        sb3.append(this.f23847c);
        sb3.append(", pinNavigationSource=");
        return a.a.p(sb3, this.f23848d, ")");
    }
}
