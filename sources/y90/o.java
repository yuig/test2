package y90;

import com.pinterest.shuffles.core.ui.model.MaskModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    public final MaskModel f138213a;

    public o(MaskModel maskModel) {
        this.f138213a = maskModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f138213a, ((o) obj).f138213a);
    }

    public final int hashCode() {
        MaskModel maskModel = this.f138213a;
        if (maskModel == null) {
            return 0;
        }
        return maskModel.hashCode();
    }

    public final String toString() {
        return "MaskChanged(mask=" + this.f138213a + ")";
    }
}
