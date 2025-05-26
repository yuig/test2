package ta0;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f116884a;

    /* renamed from: b, reason: collision with root package name */
    public final String f116885b;

    public i(Bitmap updatedBitmap, String collageId) {
        Intrinsics.checkNotNullParameter(updatedBitmap, "updatedBitmap");
        Intrinsics.checkNotNullParameter(collageId, "collageId");
        this.f116884a = updatedBitmap;
        this.f116885b = collageId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f116884a, iVar.f116884a) && Intrinsics.d(this.f116885b, iVar.f116885b);
    }

    public final int hashCode() {
        return this.f116885b.hashCode() + (this.f116884a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowAddedToCollageToast(updatedBitmap=" + this.f116884a + ", collageId=" + this.f116885b + ")";
    }
}
