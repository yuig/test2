package v90;

import com.pinterest.shuffles.core.ui.model.CutoutModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements u {

    /* renamed from: a, reason: collision with root package name */
    public final CutoutModel f124903a;

    public i(CutoutModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f124903a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f124903a, ((i) obj).f124903a);
    }

    public final int hashCode() {
        return this.f124903a.hashCode();
    }

    public final String toString() {
        return "CutoutModelCreatedForComposer(model=" + this.f124903a + ")";
    }
}
