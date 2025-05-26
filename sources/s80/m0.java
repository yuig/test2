package s80;

import com.pinterest.collagesCoreLibrary.model.CutoutPickerOrigin;
import com.pinterest.shuffles.core.ui.model.CutoutModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final CutoutModel f111670a;

    /* renamed from: b, reason: collision with root package name */
    public final sa0.d0 f111671b;

    /* renamed from: c, reason: collision with root package name */
    public final CutoutPickerOrigin f111672c;

    public m0(CutoutModel cutout, sa0.d0 d0Var, CutoutPickerOrigin origin) {
        Intrinsics.checkNotNullParameter(cutout, "cutout");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f111670a = cutout;
        this.f111671b = d0Var;
        this.f111672c = origin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.d(this.f111670a, m0Var.f111670a) && this.f111671b == m0Var.f111671b && this.f111672c == m0Var.f111672c;
    }

    public final int hashCode() {
        int hashCode = this.f111670a.hashCode() * 31;
        sa0.d0 d0Var = this.f111671b;
        return this.f111672c.hashCode() + ((hashCode + (d0Var == null ? 0 : d0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "CutoutAdded(cutout=" + this.f111670a + ", localImageSource=" + this.f111671b + ", origin=" + this.f111672c + ")";
    }
}
