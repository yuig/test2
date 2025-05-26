package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class si {

    /* renamed from: a, reason: collision with root package name */
    public final String f133278a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f133279b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133280c;

    /* renamed from: d, reason: collision with root package name */
    public final String f133281d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f133282e;

    public si(String str, String str2, String str3, Integer num, Integer num2) {
        this.f133278a = str;
        this.f133279b = num;
        this.f133280c = str2;
        this.f133281d = str3;
        this.f133282e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si)) {
            return false;
        }
        si siVar = (si) obj;
        return Intrinsics.d(this.f133278a, siVar.f133278a) && Intrinsics.d(this.f133279b, siVar.f133279b) && Intrinsics.d(this.f133280c, siVar.f133280c) && Intrinsics.d(this.f133281d, siVar.f133281d) && Intrinsics.d(this.f133282e, siVar.f133282e);
    }

    public final int hashCode() {
        String str = this.f133278a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f133279b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f133280c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133281d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f133282e;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RecentPinImage(dominantColor=");
        sb3.append(this.f133278a);
        sb3.append(", height=");
        sb3.append(this.f133279b);
        sb3.append(", type=");
        sb3.append(this.f133280c);
        sb3.append(", url=");
        sb3.append(this.f133281d);
        sb3.append(", width=");
        return a.c.i(sb3, this.f133282e, ")");
    }
}
