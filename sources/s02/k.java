package s02;

import com.pinterest.api.model.mj;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes4.dex */
public final class k implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f110322a;

    /* renamed from: b, reason: collision with root package name */
    public final mj f110323b;

    public k(String uid, mj mjVar) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f110322a = uid;
        this.f110323b = mjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f110322a, kVar.f110322a) && Intrinsics.d(this.f110323b, kVar.f110323b);
    }

    public final int hashCode() {
        int hashCode = this.f110322a.hashCode() * 31;
        mj mjVar = this.f110323b;
        return hashCode + (mjVar == null ? 0 : mjVar.hashCode());
    }

    public final String toString() {
        return "RVCSectionItemVMState(uid=" + this.f110322a + ", data=" + this.f110323b + ")";
    }
}
