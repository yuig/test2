package s90;

import com.pinterest.shuffles.core.ui.model.CutoutModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x0 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final CutoutModel f112041a;

    /* renamed from: b, reason: collision with root package name */
    public final sa0.b0 f112042b;

    public x0(CutoutModel cutoutModel, sa0.b0 cutoutSource) {
        Intrinsics.checkNotNullParameter(cutoutModel, "cutoutModel");
        Intrinsics.checkNotNullParameter(cutoutSource, "cutoutSource");
        this.f112041a = cutoutModel;
        this.f112042b = cutoutSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.d(this.f112041a, x0Var.f112041a) && Intrinsics.d(this.f112042b, x0Var.f112042b);
    }

    public final int hashCode() {
        return this.f112042b.hashCode() + (this.f112041a.hashCode() * 31);
    }

    public final String toString() {
        return "AddToComposer(cutoutModel=" + this.f112041a + ", cutoutSource=" + this.f112042b + ")";
    }
}
