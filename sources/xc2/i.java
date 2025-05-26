package xc2;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f134554a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f134555b;

    public i(Bitmap bitmap, String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f134554a = id3;
        this.f134555b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f134554a, iVar.f134554a) && Intrinsics.d(this.f134555b, iVar.f134555b);
    }

    public final int hashCode() {
        return this.f134555b.hashCode() + (this.f134554a.hashCode() * 31);
    }

    public final String toString() {
        return "WidgetPinModel(id=" + this.f134554a + ", bitmap=" + this.f134555b + ")";
    }
}
