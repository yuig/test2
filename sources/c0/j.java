package c0;

import android.view.Surface;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f24266a;

    /* renamed from: b, reason: collision with root package name */
    public final Surface f24267b;

    public j(int i13, Surface surface) {
        this.f24266a = i13;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f24267b = surface;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f24266a == jVar.f24266a && this.f24267b.equals(jVar.f24267b);
    }

    public final int hashCode() {
        return ((this.f24266a ^ 1000003) * 1000003) ^ this.f24267b.hashCode();
    }

    public final String toString() {
        return "Result{resultCode=" + this.f24266a + ", surface=" + this.f24267b + "}";
    }
}
