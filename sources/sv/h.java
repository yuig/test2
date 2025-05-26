package sv;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.pi0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f115293a;

    /* renamed from: b, reason: collision with root package name */
    public final pi0 f115294b;

    /* renamed from: c, reason: collision with root package name */
    public final f30 f115295c;

    public h(String str, pi0 cutout, f30 f30Var) {
        Intrinsics.checkNotNullParameter(cutout, "cutout");
        this.f115293a = str;
        this.f115294b = cutout;
        this.f115295c = f30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f115293a, hVar.f115293a) && Intrinsics.d(this.f115294b, hVar.f115294b) && Intrinsics.d(this.f115295c, hVar.f115295c);
    }

    public final int hashCode() {
        String str = this.f115293a;
        int hashCode = (this.f115294b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        f30 f30Var = this.f115295c;
        return hashCode + (f30Var != null ? f30Var.hashCode() : 0);
    }

    public final String toString() {
        return "CutoutWithPinInfo(id=" + this.f115293a + ", cutout=" + this.f115294b + ", pinInfo=" + this.f115295c + ")";
    }
}
