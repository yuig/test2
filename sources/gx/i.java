package gx;

import com.pinterest.api.model.h2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f66254a;

    /* renamed from: b, reason: collision with root package name */
    public final h2 f66255b;

    public i(String pinId, h2 h2Var) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f66254a = pinId;
        this.f66255b = h2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f66254a, iVar.f66254a) && Intrinsics.d(this.f66255b, iVar.f66255b);
    }

    public final int hashCode() {
        int hashCode = this.f66254a.hashCode() * 31;
        h2 h2Var = this.f66255b;
        return hashCode + (h2Var == null ? 0 : h2Var.hashCode());
    }

    public final String toString() {
        return "NavigateToFlashLightSideEffect(pinId=" + this.f66254a + ", category=" + this.f66255b + ")";
    }
}
