package t22;

import c50.t4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final t4 f115823d = new t4(6);

    /* renamed from: a, reason: collision with root package name */
    public final Long f115824a;

    /* renamed from: b, reason: collision with root package name */
    public final String f115825b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f115826c;

    public a(Long l13, String str, Long l14) {
        this.f115824a = l13;
        this.f115825b = str;
        this.f115826c = l14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f115824a, aVar.f115824a) && Intrinsics.d(this.f115825b, aVar.f115825b) && Intrinsics.d(this.f115826c, aVar.f115826c);
    }

    public final int hashCode() {
        Long l13 = this.f115824a;
        int hashCode = (l13 == null ? 0 : l13.hashCode()) * 31;
        String str = this.f115825b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.f115826c;
        return hashCode2 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        return "CollageEventData(cutoutItemPinId=" + this.f115824a + ", pinIdStr=" + this.f115825b + ", pinId=" + this.f115826c + ")";
    }
}
