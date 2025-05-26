package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final vb0.i f67009e = new vb0.i(2);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f67010a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f67011b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f67012c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f67013d;

    public g(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f67010a = num;
        this.f67011b = num2;
        this.f67012c = num3;
        this.f67013d = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f67010a, gVar.f67010a) && Intrinsics.d(this.f67011b, gVar.f67011b) && Intrinsics.d(this.f67012c, gVar.f67012c) && Intrinsics.d(this.f67013d, gVar.f67013d);
    }

    public final int hashCode() {
        Integer num = this.f67010a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f67011b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f67012c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f67013d;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return "AdFormatsModularizationEventData(adsCreativeType=" + this.f67010a + ", adsCloseupType=" + this.f67011b + ", adsDestinationType=" + this.f67012c + ", adsMediaType=" + this.f67013d + ")";
    }
}
