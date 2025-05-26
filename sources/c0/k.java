package c0;

import android.graphics.Matrix;
import android.graphics.Rect;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f24271a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24272b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24273c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24274d;

    /* renamed from: e, reason: collision with root package name */
    public final Matrix f24275e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24276f;

    public k(Rect rect, int i13, int i14, boolean z13, Matrix matrix, boolean z14) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f24271a = rect;
        this.f24272b = i13;
        this.f24273c = i14;
        this.f24274d = z13;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f24275e = matrix;
        this.f24276f = z14;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f24271a.equals(kVar.f24271a) && this.f24272b == kVar.f24272b && this.f24273c == kVar.f24273c && this.f24274d == kVar.f24274d && this.f24275e.equals(kVar.f24275e) && this.f24276f == kVar.f24276f;
    }

    public final int hashCode() {
        return ((((((((((this.f24271a.hashCode() ^ 1000003) * 1000003) ^ this.f24272b) * 1000003) ^ this.f24273c) * 1000003) ^ (this.f24274d ? 1231 : 1237)) * 1000003) ^ this.f24275e.hashCode()) * 1000003) ^ (this.f24276f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TransformationInfo{getCropRect=");
        sb3.append(this.f24271a);
        sb3.append(", getRotationDegrees=");
        sb3.append(this.f24272b);
        sb3.append(", getTargetRotation=");
        sb3.append(this.f24273c);
        sb3.append(", hasCameraTransform=");
        sb3.append(this.f24274d);
        sb3.append(", getSensorToBufferTransform=");
        sb3.append(this.f24275e);
        sb3.append(", isMirroring=");
        return a.a.r(sb3, this.f24276f, "}");
    }
}
