package eu;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f60153a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f60154b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f60155c;

    public u(f30 f30Var, boolean z13, boolean z14) {
        this.f60153a = f30Var;
        this.f60154b = z13;
        this.f60155c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f60153a, uVar.f60153a) && this.f60154b == uVar.f60154b && this.f60155c == uVar.f60155c;
    }

    public final int hashCode() {
        f30 f30Var = this.f60153a;
        return Boolean.hashCode(this.f60155c) + ep.b.e(this.f60154b, (f30Var == null ? 0 : f30Var.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProductClickedEvent(product=");
        sb3.append(this.f60153a);
        sb3.append(", parentPinIsMdlAd=");
        sb3.append(this.f60154b);
        sb3.append(", isHeroImage=");
        return a.a.r(sb3, this.f60155c, ")");
    }
}
