package l0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.z;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f81194a;

    /* renamed from: b, reason: collision with root package name */
    public final e0.h f81195b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81196c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f81197d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f81198e;

    /* renamed from: f, reason: collision with root package name */
    public final int f81199f;

    /* renamed from: g, reason: collision with root package name */
    public final Matrix f81200g;

    /* renamed from: h, reason: collision with root package name */
    public final z f81201h;

    public b(Object obj, e0.h hVar, int i13, Size size, Rect rect, int i14, Matrix matrix, z zVar) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.f81194a = obj;
        this.f81195b = hVar;
        this.f81196c = i13;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f81197d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f81198e = rect;
        this.f81199f = i14;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f81200g = matrix;
        if (zVar == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f81201h = zVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f81194a.equals(bVar.f81194a)) {
            e0.h hVar = bVar.f81195b;
            e0.h hVar2 = this.f81195b;
            if (hVar2 != null ? hVar2.equals(hVar) : hVar == null) {
                if (this.f81196c == bVar.f81196c && this.f81197d.equals(bVar.f81197d) && this.f81198e.equals(bVar.f81198e) && this.f81199f == bVar.f81199f && this.f81200g.equals(bVar.f81200g) && this.f81201h.equals(bVar.f81201h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f81194a.hashCode() ^ 1000003) * 1000003;
        e0.h hVar = this.f81195b;
        return ((((((((((((hashCode ^ (hVar == null ? 0 : hVar.hashCode())) * 1000003) ^ this.f81196c) * 1000003) ^ this.f81197d.hashCode()) * 1000003) ^ this.f81198e.hashCode()) * 1000003) ^ this.f81199f) * 1000003) ^ this.f81200g.hashCode()) * 1000003) ^ this.f81201h.hashCode();
    }

    public final String toString() {
        return "Packet{data=" + this.f81194a + ", exif=" + this.f81195b + ", format=" + this.f81196c + ", size=" + this.f81197d + ", cropRect=" + this.f81198e + ", rotationDegrees=" + this.f81199f + ", sensorToBufferTransform=" + this.f81200g + ", cameraCaptureResult=" + this.f81201h + "}";
    }
}
