package v90;

import com.pinterest.shuffles.core.ui.model.MaskModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final MaskModel f124955a;

    public q0(MaskModel maskModel) {
        this.f124955a = maskModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && Intrinsics.d(this.f124955a, ((q0) obj).f124955a);
    }

    public final int hashCode() {
        MaskModel maskModel = this.f124955a;
        if (maskModel == null) {
            return 0;
        }
        return maskModel.hashCode();
    }

    public final String toString() {
        return "CreateCutoutModelForComposer(model=" + this.f124955a + ")";
    }
}
