package xs;

import com.pinterest.api.model.b1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f135740a;

    public k(b1 b1Var) {
        this.f135740a = b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f135740a, ((k) obj).f135740a);
    }

    public final int hashCode() {
        b1 b1Var = this.f135740a;
        if (b1Var == null) {
            return 0;
        }
        return b1Var.hashCode();
    }

    public final String toString() {
        return "ShowRetailersScreen(adsCartingData=" + this.f135740a + ")";
    }
}
