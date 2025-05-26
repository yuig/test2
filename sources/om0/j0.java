package om0;

/* loaded from: classes5.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f96524a;

    /* renamed from: b, reason: collision with root package name */
    public final float f96525b;

    public j0(float f13, float f14) {
        this.f96524a = f13;
        this.f96525b = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return n4.e.a(this.f96524a, j0Var.f96524a) && n4.e.a(this.f96525b, j0Var.f96525b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f96525b) + (Float.hashCode(this.f96524a) * 31);
    }

    public final String toString() {
        return a.a.m("PreviewImagePairStyle(spacing=", n4.e.b(this.f96524a), ", cornerRadius=", n4.e.b(this.f96525b), ")");
    }
}
