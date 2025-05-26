package r72;

import a.cb;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f106613a;

    /* renamed from: b, reason: collision with root package name */
    public final int f106614b;

    /* renamed from: c, reason: collision with root package name */
    public final int f106615c;

    /* renamed from: d, reason: collision with root package name */
    public final String f106616d;

    /* renamed from: e, reason: collision with root package name */
    public final w1 f106617e;

    /* renamed from: f, reason: collision with root package name */
    public final x0 f106618f;

    public p1(Uri uri, int i13, int i14, String imageId, w1 source, x0 x0Var) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f106613a = uri;
        this.f106614b = i13;
        this.f106615c = i14;
        this.f106616d = imageId;
        this.f106617e = source;
        this.f106618f = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        if (!Intrinsics.d(this.f106613a, p1Var.f106613a) || this.f106614b != p1Var.f106614b || this.f106615c != p1Var.f106615c) {
            return false;
        }
        int i13 = c1.f106451a;
        return Intrinsics.d(this.f106616d, p1Var.f106616d) && this.f106617e == p1Var.f106617e && Intrinsics.d(this.f106618f, p1Var.f106618f);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f106615c, ep.b.b(this.f106614b, this.f106613a.hashCode() * 31, 31), 31);
        int i13 = c1.f106451a;
        int hashCode = (this.f106617e.hashCode() + cb.d(this.f106616d, b13, 31)) * 31;
        x0 x0Var = this.f106618f;
        return hashCode + (x0Var == null ? 0 : x0Var.hashCode());
    }

    public final String toString() {
        int i13 = c1.f106451a;
        String p13 = a.a.p(new StringBuilder("ItemImageId(value="), this.f106616d, ")");
        StringBuilder sb3 = new StringBuilder("ShuffleCutoutImage(uri=");
        sb3.append(this.f106613a);
        sb3.append(", width=");
        sb3.append(this.f106614b);
        sb3.append(", height=");
        a.a.A(sb3, this.f106615c, ", imageId=", p13, ", source=");
        sb3.append(this.f106617e);
        sb3.append(", cutoutImage=");
        sb3.append(this.f106618f);
        sb3.append(")");
        return sb3.toString();
    }
}
