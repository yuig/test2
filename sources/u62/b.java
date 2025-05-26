package u62;

import a.cb;
import android.net.Uri;
import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends ve.h {

    /* renamed from: b, reason: collision with root package name */
    public final Uri f120825b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120826c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f120827d;

    public b(Uri imageUri, String pinId, Size size) {
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f120825b = imageUri;
        this.f120826c = pinId;
        this.f120827d = size;
    }

    @Override // ve.h
    public final Size B() {
        return this.f120827d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f120825b, bVar.f120825b) && Intrinsics.d(this.f120826c, bVar.f120826c) && Intrinsics.d(this.f120827d, bVar.f120827d);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f120826c, this.f120825b.hashCode() * 31, 31);
        Size size = this.f120827d;
        return d2 + (size == null ? 0 : size.hashCode());
    }

    @Override // ve.h
    public final Uri s() {
        return this.f120825b;
    }

    public final String toString() {
        return "SearchedPin(imageUri=" + this.f120825b + ", pinId=" + kh2.d.i1(this.f120826c) + ", size=" + this.f120827d + ")";
    }
}
