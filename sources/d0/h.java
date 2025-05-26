package d0;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import c0.e0;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f53514a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f53515b;

    /* renamed from: c, reason: collision with root package name */
    public final fp0.b f53516c;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f53517d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f53518e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f53519f;

    /* renamed from: g, reason: collision with root package name */
    public final int f53520g;

    /* renamed from: h, reason: collision with root package name */
    public final int f53521h;

    /* renamed from: i, reason: collision with root package name */
    public final int f53522i;

    /* renamed from: j, reason: collision with root package name */
    public final List f53523j;

    public h(Executor executor, fp0.b bVar, e0 e0Var, Rect rect, Matrix matrix, int i13, int i14, int i15, List list) {
        this.f53514a = ((CaptureFailedRetryQuirk) i0.a.f70646a.b(CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f53515b = executor;
        this.f53516c = bVar;
        this.f53517d = e0Var;
        this.f53518e = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f53519f = matrix;
        this.f53520g = i13;
        this.f53521h = i14;
        this.f53522i = i15;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f53523j = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f53515b.equals(hVar.f53515b)) {
            fp0.b bVar = hVar.f53516c;
            fp0.b bVar2 = this.f53516c;
            if (bVar2 != null ? bVar2.equals(bVar) : bVar == null) {
                e0 e0Var = hVar.f53517d;
                e0 e0Var2 = this.f53517d;
                if (e0Var2 != null ? e0Var2.equals(e0Var) : e0Var == null) {
                    if (this.f53518e.equals(hVar.f53518e) && this.f53519f.equals(hVar.f53519f) && this.f53520g == hVar.f53520g && this.f53521h == hVar.f53521h && this.f53522i == hVar.f53522i && this.f53523j.equals(hVar.f53523j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f53515b.hashCode() ^ 1000003) * (-721379959);
        fp0.b bVar = this.f53516c;
        int hashCode2 = (hashCode ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        e0 e0Var = this.f53517d;
        return ((((((((((((hashCode2 ^ (e0Var != null ? e0Var.hashCode() : 0)) * 1000003) ^ this.f53518e.hashCode()) * 1000003) ^ this.f53519f.hashCode()) * 1000003) ^ this.f53520g) * 1000003) ^ this.f53521h) * 1000003) ^ this.f53522i) * 1000003) ^ this.f53523j.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TakePictureRequest{appExecutor=");
        sb3.append(this.f53515b);
        sb3.append(", inMemoryCallback=null, onDiskCallback=");
        sb3.append(this.f53516c);
        sb3.append(", outputFileOptions=");
        sb3.append(this.f53517d);
        sb3.append(", cropRect=");
        sb3.append(this.f53518e);
        sb3.append(", sensorToBufferTransform=");
        sb3.append(this.f53519f);
        sb3.append(", rotationDegrees=");
        sb3.append(this.f53520g);
        sb3.append(", jpegQuality=");
        sb3.append(this.f53521h);
        sb3.append(", captureMode=");
        sb3.append(this.f53522i);
        sb3.append(", sessionConfigCameraCaptureCallbacks=");
        return a.c.j(sb3, this.f53523j, "}");
    }
}
