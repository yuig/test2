package bk1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final wa2.m f23361a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23362b;

    /* renamed from: c, reason: collision with root package name */
    public final f30 f23363c;

    public v(f30 f30Var, wa2.m pinFeatureConfig, boolean z13) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        this.f23361a = pinFeatureConfig;
        this.f23362b = z13;
        this.f23363c = f30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f23361a, vVar.f23361a) && this.f23362b == vVar.f23362b && Intrinsics.d(this.f23363c, vVar.f23363c);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f23362b, this.f23361a.hashCode() * 31, 31);
        f30 f30Var = this.f23363c;
        return e13 + (f30Var == null ? 0 : f30Var.hashCode());
    }

    public final String toString() {
        return "OnBindFeatureConfig(pinFeatureConfig=" + this.f23361a + ", hasPinChips=" + this.f23362b + ", firstPinChip=" + this.f23363c + ")";
    }
}
