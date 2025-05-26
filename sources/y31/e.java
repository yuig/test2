package y31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f136784a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f136785b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f136786c;

    public e(Integer num, Integer num2, Integer num3) {
        this.f136784a = num;
        this.f136785b = num2;
        this.f136786c = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f136784a, eVar.f136784a) && Intrinsics.d(this.f136785b, eVar.f136785b) && Intrinsics.d(this.f136786c, eVar.f136786c);
    }

    public final int hashCode() {
        Integer num = this.f136784a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f136785b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f136786c;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StatisticsState(followers=");
        sb3.append(this.f136784a);
        sb3.append(", following=");
        sb3.append(this.f136785b);
        sb3.append(", views=");
        return a.c.i(sb3, this.f136786c, ")");
    }
}
