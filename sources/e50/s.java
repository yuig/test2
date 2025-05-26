package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements n50.a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f57413a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f57414b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f57415c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f57416d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f57417e;

    public s(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.f57413a = num;
        this.f57414b = num2;
        this.f57415c = num3;
        this.f57416d = num4;
        this.f57417e = num5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f57413a, sVar.f57413a) && Intrinsics.d(this.f57414b, sVar.f57414b) && Intrinsics.d(this.f57415c, sVar.f57415c) && Intrinsics.d(this.f57416d, sVar.f57416d) && Intrinsics.d(this.f57417e, sVar.f57417e);
    }

    public final int hashCode() {
        Integer num = this.f57413a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f57414b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f57415c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f57416d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f57417e;
        return hashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HeaderDisplay(textAlignment=");
        sb3.append(this.f57413a);
        sb3.append(", topCornerRadius=");
        sb3.append(this.f57414b);
        sb3.append(", headerSize=");
        sb3.append(this.f57415c);
        sb3.append(", subtitleAlignment=");
        sb3.append(this.f57416d);
        sb3.append(", subtitleStyle=");
        return a.c.i(sb3, this.f57417e, ")");
    }
}
