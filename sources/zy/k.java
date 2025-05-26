package zy;

import kotlin.jvm.internal.Intrinsics;
import nx.y0;

/* loaded from: classes3.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f143084a;

    /* renamed from: b, reason: collision with root package name */
    public final String f143085b;

    public k(y0 impressionWrapper, String str) {
        Intrinsics.checkNotNullParameter(impressionWrapper, "impressionWrapper");
        this.f143084a = impressionWrapper;
        this.f143085b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f143084a, kVar.f143084a) && Intrinsics.d(this.f143085b, kVar.f143085b);
    }

    public final int hashCode() {
        int hashCode = this.f143084a.hashCode() * 31;
        String str = this.f143085b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "EndImpression(impressionWrapper=" + this.f143084a + ", id=" + this.f143085b + ")";
    }
}
