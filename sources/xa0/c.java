package xa0;

import com.pinterest.api.model.fi0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final fi0 f134396a;

    /* renamed from: b, reason: collision with root package name */
    public final int f134397b;

    public c(fi0 collage, int i13) {
        Intrinsics.checkNotNullParameter(collage, "collage");
        this.f134396a = collage;
        this.f134397b = i13;
    }

    public final fi0 b() {
        return this.f134396a;
    }

    public final int d() {
        return this.f134397b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f134396a, cVar.f134396a) && this.f134397b == cVar.f134397b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f134397b) + (this.f134396a.hashCode() * 31);
    }

    public final String toString() {
        return "DraftCollage(collage=" + this.f134396a + ", position=" + this.f134397b + ")";
    }
}
