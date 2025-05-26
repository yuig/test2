package jx1;

import com.pinterest.api.model.xr;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final xr f77679a;

    /* renamed from: b, reason: collision with root package name */
    public final xr f77680b;

    public c(xr xrVar, xr xrVar2) {
        this.f77679a = xrVar;
        this.f77680b = xrVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f77679a, cVar.f77679a) && Intrinsics.d(this.f77680b, cVar.f77680b);
    }

    public final int hashCode() {
        xr xrVar = this.f77679a;
        int hashCode = (xrVar == null ? 0 : xrVar.hashCode()) * 31;
        xr xrVar2 = this.f77680b;
        return hashCode + (xrVar2 != null ? xrVar2.hashCode() : 0);
    }

    public final String toString() {
        return "PreProcessedData(total=" + this.f77679a + ", engaged=" + this.f77680b + ")";
    }
}
