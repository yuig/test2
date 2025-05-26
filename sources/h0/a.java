package h0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f66369a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.camera.core.impl.g f66370b;

    public a(String str, androidx.camera.core.impl.g gVar) {
        if (str == null) {
            throw new NullPointerException("Null cameraIdString");
        }
        this.f66369a = str;
        if (gVar == null) {
            throw new NullPointerException("Null cameraConfigId");
        }
        this.f66370b = gVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f66369a.equals(aVar.f66369a) && this.f66370b.equals(aVar.f66370b);
    }

    public final int hashCode() {
        return ((this.f66369a.hashCode() ^ 1000003) * 1000003) ^ this.f66370b.hashCode();
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.f66369a + ", cameraConfigId=" + this.f66370b + "}";
    }
}
