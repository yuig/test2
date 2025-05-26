package xs;

import com.pinterest.api.model.b1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f135738a;

    /* renamed from: b, reason: collision with root package name */
    public final int f135739b;

    public j(b1 cartingData, int i13) {
        Intrinsics.checkNotNullParameter(cartingData, "cartingData");
        this.f135738a = cartingData;
        this.f135739b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f135738a, jVar.f135738a) && this.f135739b == jVar.f135739b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f135739b) + (this.f135738a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowRetailerClickedLink(cartingData=" + this.f135738a + ", retailerPosition=" + this.f135739b + ")";
    }
}
