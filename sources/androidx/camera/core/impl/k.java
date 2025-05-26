package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: f, reason: collision with root package name */
    public static final Range f16892f = new Range(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final Size f16893a;

    /* renamed from: b, reason: collision with root package name */
    public final c0.z f16894b;

    /* renamed from: c, reason: collision with root package name */
    public final Range f16895c;

    /* renamed from: d, reason: collision with root package name */
    public final v0 f16896d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16897e;

    public k(Size size, c0.z zVar, Range range, v0 v0Var, boolean z13) {
        this.f16893a = size;
        this.f16894b = zVar;
        this.f16895c = range;
        this.f16896d = v0Var;
        this.f16897e = z13;
    }

    public final j a() {
        return new j(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f16893a.equals(kVar.f16893a) && this.f16894b.equals(kVar.f16894b) && this.f16895c.equals(kVar.f16895c)) {
            v0 v0Var = kVar.f16896d;
            v0 v0Var2 = this.f16896d;
            if (v0Var2 != null ? v0Var2.equals(v0Var) : v0Var == null) {
                if (this.f16897e == kVar.f16897e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.f16893a.hashCode() ^ 1000003) * 1000003) ^ this.f16894b.hashCode()) * 1000003) ^ this.f16895c.hashCode()) * 1000003;
        v0 v0Var = this.f16896d;
        return ((hashCode ^ (v0Var == null ? 0 : v0Var.hashCode())) * 1000003) ^ (this.f16897e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StreamSpec{resolution=");
        sb3.append(this.f16893a);
        sb3.append(", dynamicRange=");
        sb3.append(this.f16894b);
        sb3.append(", expectedFrameRateRange=");
        sb3.append(this.f16895c);
        sb3.append(", implementationOptions=");
        sb3.append(this.f16896d);
        sb3.append(", zslDisabled=");
        return a.a.r(sb3, this.f16897e, "}");
    }
}
