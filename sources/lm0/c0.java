package lm0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f83849a;

    /* renamed from: b, reason: collision with root package name */
    public final wa2.m f83850b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83851c;

    /* renamed from: d, reason: collision with root package name */
    public final int f83852d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f83853e;

    /* renamed from: f, reason: collision with root package name */
    public final String f83854f;

    public c0(f30 pin, wa2.m featureConfig, int i13, int i14, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        this.f83849a = pin;
        this.f83850b = featureConfig;
        this.f83851c = i13;
        this.f83852d = i14;
        this.f83853e = z13;
        String id3 = pin.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f83854f = id3;
    }

    public static c0 b(c0 c0Var, wa2.m mVar, int i13, boolean z13, int i14) {
        f30 pin = c0Var.f83849a;
        if ((i14 & 2) != 0) {
            mVar = c0Var.f83850b;
        }
        wa2.m featureConfig = mVar;
        if ((i14 & 4) != 0) {
            i13 = c0Var.f83851c;
        }
        int i15 = i13;
        int i16 = c0Var.f83852d;
        if ((i14 & 16) != 0) {
            z13 = c0Var.f83853e;
        }
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        return new c0(pin, featureConfig, i15, i16, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f83849a, c0Var.f83849a) && Intrinsics.d(this.f83850b, c0Var.f83850b) && this.f83851c == c0Var.f83851c && this.f83852d == c0Var.f83852d && this.f83853e == c0Var.f83853e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83853e) + ep.b.b(this.f83852d, ep.b.b(this.f83851c, (this.f83850b.hashCode() + (this.f83849a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AllSavesPinItem(pin=");
        sb3.append(this.f83849a);
        sb3.append(", featureConfig=");
        sb3.append(this.f83850b);
        sb3.append(", viewType=");
        sb3.append(this.f83851c);
        sb3.append(", position=");
        sb3.append(this.f83852d);
        sb3.append(", selected=");
        return a.a.r(sb3, this.f83853e, ")");
    }
}
