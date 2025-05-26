package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b2 {

    /* renamed from: d, reason: collision with root package name */
    public static final c50.c1 f66882d = new c50.c1(15);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f66883a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f66884b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f66885c;

    public b2(Integer num, Integer num2, Long l13) {
        this.f66883a = num;
        this.f66884b = num2;
        this.f66885c = l13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return Intrinsics.d(this.f66883a, b2Var.f66883a) && Intrinsics.d(this.f66884b, b2Var.f66884b) && Intrinsics.d(this.f66885c, b2Var.f66885c);
    }

    public final int hashCode() {
        Integer num = this.f66883a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f66884b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l13 = this.f66885c;
        return hashCode2 + (l13 != null ? l13.hashCode() : 0);
    }

    public final String toString() {
        return "PinImpressionClickEvent(xPosition=" + this.f66883a + ", yPosition=" + this.f66884b + ", time=" + this.f66885c + ")";
    }
}
