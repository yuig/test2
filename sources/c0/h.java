package c0;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Size f24242a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f24243b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.camera.core.impl.j0 f24244c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24245d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24246e;

    public h(Size size, Rect rect, androidx.camera.core.impl.j0 j0Var, int i13, boolean z13) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f24242a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.f24243b = rect;
        this.f24244c = j0Var;
        this.f24245d = i13;
        this.f24246e = z13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f24242a.equals(hVar.f24242a) && this.f24243b.equals(hVar.f24243b)) {
            androidx.camera.core.impl.j0 j0Var = hVar.f24244c;
            androidx.camera.core.impl.j0 j0Var2 = this.f24244c;
            if (j0Var2 != null ? j0Var2.equals(j0Var) : j0Var == null) {
                if (this.f24245d == hVar.f24245d && this.f24246e == hVar.f24246e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f24242a.hashCode() ^ 1000003) * 1000003) ^ this.f24243b.hashCode()) * 1000003;
        androidx.camera.core.impl.j0 j0Var = this.f24244c;
        return ((((hashCode ^ (j0Var == null ? 0 : j0Var.hashCode())) * 1000003) ^ this.f24245d) * 1000003) ^ (this.f24246e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CameraInputInfo{inputSize=");
        sb3.append(this.f24242a);
        sb3.append(", inputCropRect=");
        sb3.append(this.f24243b);
        sb3.append(", cameraInternal=");
        sb3.append(this.f24244c);
        sb3.append(", rotationDegrees=");
        sb3.append(this.f24245d);
        sb3.append(", mirroring=");
        return a.a.r(sb3, this.f24246e, "}");
    }
}
