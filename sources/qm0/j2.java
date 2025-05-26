package qm0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j2 implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f104288a;

    /* renamed from: b, reason: collision with root package name */
    public final wa2.m f104289b;

    /* renamed from: c, reason: collision with root package name */
    public final int f104290c;

    /* renamed from: d, reason: collision with root package name */
    public final String f104291d;

    public j2(int i13, f30 pin, wa2.m featureConfig) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        this.f104288a = pin;
        this.f104289b = featureConfig;
        this.f104290c = i13;
        String id3 = pin.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f104291d = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return Intrinsics.d(this.f104288a, j2Var.f104288a) && Intrinsics.d(this.f104289b, j2Var.f104289b) && this.f104290c == j2Var.f104290c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f104290c) + ((this.f104289b.hashCode() + (this.f104288a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RecommendedPin(pin=");
        sb3.append(this.f104288a);
        sb3.append(", featureConfig=");
        sb3.append(this.f104289b);
        sb3.append(", position=");
        return a.a.n(sb3, this.f104290c, ")");
    }
}
