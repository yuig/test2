package eq0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f59920a;

    /* renamed from: b, reason: collision with root package name */
    public String f59921b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f59922c;

    /* renamed from: d, reason: collision with root package name */
    public final String f59923d;

    /* renamed from: e, reason: collision with root package name */
    public final String f59924e;

    public n(String str, String anchorMessageId, String str2, String str3, boolean z13) {
        Intrinsics.checkNotNullParameter(anchorMessageId, "anchorMessageId");
        this.f59920a = str;
        this.f59921b = anchorMessageId;
        this.f59922c = z13;
        this.f59923d = str2;
        this.f59924e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f59920a, nVar.f59920a) && Intrinsics.d(this.f59921b, nVar.f59921b) && this.f59922c == nVar.f59922c && Intrinsics.d(this.f59923d, nVar.f59923d) && Intrinsics.d(this.f59924e, nVar.f59924e);
    }

    public final int hashCode() {
        String str = this.f59920a;
        int e13 = ep.b.e(this.f59922c, cb.d(this.f59921b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f59923d;
        int hashCode = (e13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59924e;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f59921b;
        StringBuilder sb3 = new StringBuilder("ThreadInfo(threadId=");
        a.a.B(sb3, this.f59920a, ", anchorMessageId=", str, ", shouldCreateThread=");
        sb3.append(this.f59922c);
        sb3.append(", newAnchorText=");
        sb3.append(this.f59923d);
        sb3.append(", newAnchorPinUid=");
        return a.a.p(sb3, this.f59924e, ")");
    }
}
