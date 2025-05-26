package ic0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f72062a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f72063b;

    public a(String str, Integer num) {
        this.f72062a = str;
        this.f72063b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f72062a, aVar.f72062a) && Intrinsics.d(this.f72063b, aVar.f72063b);
    }

    public final int hashCode() {
        String str = this.f72062a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f72063b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "PinImageIndicatorModel(indicatorImageUrl=" + this.f72062a + ", indicatorIconRes=" + this.f72063b + ")";
    }
}
