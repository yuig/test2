package u62;

import android.net.Uri;
import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends ve.h {

    /* renamed from: b, reason: collision with root package name */
    public final Uri f120823b;

    /* renamed from: c, reason: collision with root package name */
    public final Size f120824c;

    public a(Uri imageUri, Size size) {
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        this.f120823b = imageUri;
        this.f120824c = size;
    }

    @Override // ve.h
    public final Size B() {
        return this.f120824c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f120823b, aVar.f120823b) && Intrinsics.d(this.f120824c, aVar.f120824c);
    }

    public final int hashCode() {
        int hashCode = this.f120823b.hashCode() * 31;
        Size size = this.f120824c;
        return hashCode + (size == null ? 0 : size.hashCode());
    }

    @Override // ve.h
    public final Uri s() {
        return this.f120823b;
    }

    public final String toString() {
        return "RawImage(imageUri=" + this.f120823b + ", size=" + this.f120824c + ")";
    }
}
