package s90;

import com.pinterest.shuffles.core.ui.model.MaskModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final MaskModel f112044a;

    public y0(MaskModel maskModel) {
        this.f112044a = maskModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && Intrinsics.d(this.f112044a, ((y0) obj).f112044a);
    }

    public final int hashCode() {
        MaskModel maskModel = this.f112044a;
        if (maskModel == null) {
            return 0;
        }
        return maskModel.hashCode();
    }

    public final String toString() {
        return "UpdateMask(mask=" + this.f112044a + ")";
    }
}
