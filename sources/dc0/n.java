package dc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f54332a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f54333b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f54334c;

    /* renamed from: d, reason: collision with root package name */
    public final String f54335d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f54336e;

    public n(String id3, Integer num, Integer num2, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f54332a = id3;
        this.f54333b = num;
        this.f54334c = num2;
        this.f54335d = str;
        this.f54336e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f54332a, nVar.f54332a) && Intrinsics.d(this.f54333b, nVar.f54333b) && Intrinsics.d(this.f54334c, nVar.f54334c) && Intrinsics.d(this.f54335d, nVar.f54335d) && Intrinsics.d(this.f54336e, nVar.f54336e);
    }

    public final int hashCode() {
        int hashCode = this.f54332a.hashCode() * 31;
        Integer num = this.f54333b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f54334c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f54335d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f54336e;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LegoBoardRepAnalyticsData(id=");
        sb3.append(this.f54332a);
        sb3.append(", pinCount=");
        sb3.append(this.f54333b);
        sb3.append(", position=");
        sb3.append(this.f54334c);
        sb3.append(", trackingParams=");
        sb3.append(this.f54335d);
        sb3.append(", isViewed=");
        return a.c.h(sb3, this.f54336e, ")");
    }
}
