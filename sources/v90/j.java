package v90;

import com.pinterest.shuffles.core.ui.model.CutoutModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements u {

    /* renamed from: a, reason: collision with root package name */
    public final CutoutModel f124920a;

    /* renamed from: b, reason: collision with root package name */
    public final String f124921b;

    public j(CutoutModel model, String pinId) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f124920a = model;
        this.f124921b = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f124920a, jVar.f124920a) && Intrinsics.d(this.f124921b, jVar.f124921b);
    }

    public final int hashCode() {
        return this.f124921b.hashCode() + (this.f124920a.hashCode() * 31);
    }

    public final String toString() {
        return "CutoutModelCreatedForSave(model=" + this.f124920a + ", pinId=" + this.f124921b + ")";
    }
}
