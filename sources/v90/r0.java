package v90;

import com.pinterest.shuffles.core.ui.model.MaskModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f124957a;

    /* renamed from: b, reason: collision with root package name */
    public final MaskModel f124958b;

    public r0(String pinId, MaskModel maskModel) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f124957a = pinId;
        this.f124958b = maskModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.d(this.f124957a, r0Var.f124957a) && Intrinsics.d(this.f124958b, r0Var.f124958b);
    }

    public final int hashCode() {
        int hashCode = this.f124957a.hashCode() * 31;
        MaskModel maskModel = this.f124958b;
        return hashCode + (maskModel == null ? 0 : maskModel.hashCode());
    }

    public final String toString() {
        return "CreateCutoutModelForSave(pinId=" + this.f124957a + ", model=" + this.f124958b + ")";
    }
}
