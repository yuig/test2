package ta0;

import a.cb;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f116849a;

    /* renamed from: b, reason: collision with root package name */
    public final String f116850b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f116851c;

    public b(Bitmap updatedBitmap, String collageId, boolean z13) {
        Intrinsics.checkNotNullParameter(updatedBitmap, "updatedBitmap");
        Intrinsics.checkNotNullParameter(collageId, "collageId");
        this.f116849a = updatedBitmap;
        this.f116850b = collageId;
        this.f116851c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f116849a, bVar.f116849a) && Intrinsics.d(this.f116850b, bVar.f116850b) && this.f116851c == bVar.f116851c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116851c) + cb.d(this.f116850b, this.f116849a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AddToCollageFinished(updatedBitmap=");
        sb3.append(this.f116849a);
        sb3.append(", collageId=");
        sb3.append(this.f116850b);
        sb3.append(", isNewCollage=");
        return a.a.r(sb3, this.f116851c, ")");
    }
}
