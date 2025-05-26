package xs;

import com.pinterest.api.model.b1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x implements y {

    /* renamed from: a, reason: collision with root package name */
    public final long f135763a;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f135764b;

    /* renamed from: c, reason: collision with root package name */
    public final int f135765c;

    public x(long j13, b1 cartingData, int i13) {
        Intrinsics.checkNotNullParameter(cartingData, "cartingData");
        this.f135763a = j13;
        this.f135764b = cartingData;
        this.f135765c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f135763a == xVar.f135763a && Intrinsics.d(this.f135764b, xVar.f135764b) && this.f135765c == xVar.f135765c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f135765c) + ((this.f135764b.hashCode() + (Long.hashCode(this.f135763a) * 31)) * 31);
    }

    public final String toString() {
        return "RetailerItemClicked(timeStamp=" + this.f135763a + ", cartingData=" + this.f135764b + ", retailerClickIndex=" + this.f135765c + ")";
    }
}
