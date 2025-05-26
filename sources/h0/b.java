package h0;

import c0.t1;
import v.e3;

/* loaded from: classes2.dex */
public final class b implements t1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f66371a;

    /* renamed from: b, reason: collision with root package name */
    public final float f66372b;

    /* renamed from: c, reason: collision with root package name */
    public final float f66373c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66374d;

    public b(float f13, float f14, float f15, float f16) {
        this.f66371a = f13;
        this.f66372b = f14;
        this.f66373c = f15;
        this.f66374d = f16;
    }

    public static b c(e3 e3Var) {
        return new b(e3Var.f123440a, e3Var.f123441b, e3Var.f123442c, e3Var.f123443d);
    }

    @Override // c0.t1
    public final float a() {
        return this.f66374d;
    }

    @Override // c0.t1
    public final float b() {
        return this.f66371a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.floatToIntBits(this.f66371a) == Float.floatToIntBits(bVar.f66371a) && Float.floatToIntBits(this.f66372b) == Float.floatToIntBits(bVar.f66372b) && Float.floatToIntBits(this.f66373c) == Float.floatToIntBits(bVar.f66373c) && Float.floatToIntBits(this.f66374d) == Float.floatToIntBits(bVar.f66374d);
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f66371a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f66372b)) * 1000003) ^ Float.floatToIntBits(this.f66373c)) * 1000003) ^ Float.floatToIntBits(this.f66374d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImmutableZoomState{zoomRatio=");
        sb3.append(this.f66371a);
        sb3.append(", maxZoomRatio=");
        sb3.append(this.f66372b);
        sb3.append(", minZoomRatio=");
        sb3.append(this.f66373c);
        sb3.append(", linearZoom=");
        return d7.g.i(sb3, this.f66374d, "}");
    }
}
