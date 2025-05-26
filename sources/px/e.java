package px;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f101551a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f101552b;

    /* renamed from: c, reason: collision with root package name */
    public final Double f101553c;

    public e(f type, Integer num, Double d2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f101551a = type;
        this.f101552b = num;
        this.f101553c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f101551a == eVar.f101551a && Intrinsics.d(this.f101552b, eVar.f101552b) && Intrinsics.d(this.f101553c, eVar.f101553c);
    }

    public final int hashCode() {
        int hashCode = this.f101551a.hashCode() * 31;
        Integer num = this.f101552b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d2 = this.f101553c;
        return hashCode2 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        return "PinMetric(type=" + this.f101551a + ", value=" + this.f101552b + ", percentage=" + this.f101553c + ")";
    }
}
