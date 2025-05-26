package lt;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes3.dex */
public final class k implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f84751a;

    /* renamed from: b, reason: collision with root package name */
    public final bj.f f84752b;

    /* renamed from: c, reason: collision with root package name */
    public final f30 f84753c;

    public k(String pinId, bj.f fVar, f30 f30Var) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f84751a = pinId;
        this.f84752b = fVar;
        this.f84753c = f30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f84751a, kVar.f84751a) && Intrinsics.d(this.f84752b, kVar.f84752b) && Intrinsics.d(this.f84753c, kVar.f84753c);
    }

    public final int hashCode() {
        int hashCode = this.f84751a.hashCode() * 31;
        bj.f fVar = this.f84752b;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        f30 f30Var = this.f84753c;
        return hashCode2 + (f30Var != null ? f30Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdsGmaCloseupVMState(pinId=" + this.f84751a + ", nativeAd=" + this.f84752b + ", pin=" + this.f84753c + ")";
    }
}
