package q0;

import androidx.lifecycle.z;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final z f101745a;

    /* renamed from: b, reason: collision with root package name */
    public final h0.a f101746b;

    public a(z zVar, h0.a aVar) {
        if (zVar == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f101745a = zVar;
        if (aVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f101746b = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f101745a.equals(aVar.f101745a) && this.f101746b.equals(aVar.f101746b);
    }

    public final int hashCode() {
        return ((this.f101745a.hashCode() ^ 1000003) * 1000003) ^ this.f101746b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.f101745a + ", cameraId=" + this.f101746b + "}";
    }
}
