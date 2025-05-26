package jx1;

import com.pinterest.api.model.xr;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final xr f77686a;

    /* renamed from: b, reason: collision with root package name */
    public final xr f77687b;

    public i(xr xrVar, xr xrVar2) {
        this.f77686a = xrVar;
        this.f77687b = xrVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f77686a, iVar.f77686a) && Intrinsics.d(this.f77687b, iVar.f77687b);
    }

    public final int hashCode() {
        xr xrVar = this.f77686a;
        int hashCode = (xrVar == null ? 0 : xrVar.hashCode()) * 31;
        xr xrVar2 = this.f77687b;
        return hashCode + (xrVar2 != null ? xrVar2.hashCode() : 0);
    }

    public final String toString() {
        return "OnDataPreProcessed(total=" + this.f77686a + ", engaged=" + this.f77687b + ")";
    }
}
