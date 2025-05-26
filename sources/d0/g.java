package d0;

import androidx.camera.core.ImageCaptureException;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f53512a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageCaptureException f53513b;

    public g(int i13, ImageCaptureException imageCaptureException) {
        this.f53512a = i13;
        this.f53513b = imageCaptureException;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f53512a == gVar.f53512a && this.f53513b.equals(gVar.f53513b);
    }

    public final int hashCode() {
        return ((this.f53512a ^ 1000003) * 1000003) ^ this.f53513b.hashCode();
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.f53512a + ", imageCaptureException=" + this.f53513b + "}";
    }
}
