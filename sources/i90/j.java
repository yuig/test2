package i90;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f71786a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71787b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f71788c;

    public j(String str, String pinId, boolean z13) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f71786a = str;
        this.f71787b = pinId;
        this.f71788c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f71786a, jVar.f71786a) && Intrinsics.d(this.f71787b, jVar.f71787b) && this.f71788c == jVar.f71788c;
    }

    public final int hashCode() {
        String str = this.f71786a;
        return Boolean.hashCode(this.f71788c) + cb.d(this.f71787b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RelatedFeedRequestArgs(assetId=");
        sb3.append(this.f71786a);
        sb3.append(", pinId=");
        sb3.append(this.f71787b);
        sb3.append(", isCollageAd=");
        return a.a.r(sb3, this.f71788c, ")");
    }
}
