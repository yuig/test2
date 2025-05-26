package c0;

import android.graphics.Matrix;
import androidx.camera.core.impl.u2;

/* loaded from: classes2.dex */
public final class g implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final u2 f24235a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24236b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24237c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f24238d;

    public g(u2 u2Var, long j13, int i13, Matrix matrix) {
        if (u2Var == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f24235a = u2Var;
        this.f24236b = j13;
        this.f24237c = i13;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f24238d = matrix;
    }

    @Override // c0.j0
    public final void c(e0.n nVar) {
        nVar.d(this.f24237c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f24235a.equals(gVar.f24235a) && this.f24236b == gVar.f24236b && this.f24237c == gVar.f24237c && this.f24238d.equals(gVar.f24238d);
    }

    @Override // c0.j0
    public final u2 f() {
        return this.f24235a;
    }

    @Override // c0.j0
    public final long h() {
        return this.f24236b;
    }

    public final int hashCode() {
        int hashCode = (this.f24235a.hashCode() ^ 1000003) * 1000003;
        long j13 = this.f24236b;
        return ((((hashCode ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003) ^ this.f24237c) * 1000003) ^ this.f24238d.hashCode();
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f24235a + ", timestamp=" + this.f24236b + ", rotationDegrees=" + this.f24237c + ", sensorToBufferTransformMatrix=" + this.f24238d + "}";
    }
}
