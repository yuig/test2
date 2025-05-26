package eu;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f60160a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60161b;

    public y(int i13, f30 f30Var) {
        this.f60160a = f30Var;
        this.f60161b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f60160a, yVar.f60160a) && this.f60161b == yVar.f60161b;
    }

    public final int hashCode() {
        f30 f30Var = this.f60160a;
        return Integer.hashCode(this.f60161b) + ((f30Var == null ? 0 : f30Var.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdateCurrentlyViewedProductEvent(product=" + this.f60160a + ", position=" + this.f60161b + ")";
    }
}
