package y90;

import com.pinterest.shuffles.core.ui.model.MaskModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final MaskModel f138198a;

    public k0(MaskModel maskModel) {
        this.f138198a = maskModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && Intrinsics.d(this.f138198a, ((k0) obj).f138198a);
    }

    public final int hashCode() {
        MaskModel maskModel = this.f138198a;
        if (maskModel == null) {
            return 0;
        }
        return maskModel.hashCode();
    }

    public final String toString() {
        return "UpdateMask(mask=" + this.f138198a + ")";
    }
}
