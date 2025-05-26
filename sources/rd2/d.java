package rd2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ae2.f f107520a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.widget.a f107521b;

    public d(ae2.f texture, androidx.appcompat.widget.a uniformHandle) {
        Intrinsics.checkNotNullParameter(texture, "texture");
        Intrinsics.checkNotNullParameter(uniformHandle, "uniformHandle");
        this.f107520a = texture;
        this.f107521b = uniformHandle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f107520a, dVar.f107520a) && Intrinsics.d(this.f107521b, dVar.f107521b);
    }

    public final int hashCode() {
        return this.f107521b.hashCode() + (this.f107520a.hashCode() * 31);
    }

    public final String toString() {
        return "TextureBinding(texture=" + this.f107520a + ", uniformHandle=" + this.f107521b + ')';
    }
}
