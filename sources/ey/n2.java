package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f60537a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60538b;

    /* renamed from: c, reason: collision with root package name */
    public final h32.d4 f60539c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f60540d;

    /* renamed from: e, reason: collision with root package name */
    public final int f60541e;

    /* renamed from: f, reason: collision with root package name */
    public final int f60542f;

    public n2(String url, int i13, h32.d4 viewType, boolean z13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f60537a = url;
        this.f60538b = i13;
        this.f60539c = viewType;
        this.f60540d = z13;
        this.f60541e = i14;
        this.f60542f = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return Intrinsics.d(this.f60537a, n2Var.f60537a) && this.f60538b == n2Var.f60538b && this.f60539c == n2Var.f60539c && this.f60540d == n2Var.f60540d && this.f60541e == n2Var.f60541e && this.f60542f == n2Var.f60542f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f60542f) + ep.b.b(this.f60541e, ep.b.e(this.f60540d, (this.f60539c.hashCode() + ep.b.b(this.f60538b, this.f60537a.hashCode() * 31, 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinCellImageLoadStartEventParameters(url=");
        sb3.append(this.f60537a);
        sb3.append(", pinGridPosition=");
        sb3.append(this.f60538b);
        sb3.append(", viewType=");
        sb3.append(this.f60539c);
        sb3.append(", isCollagesCutout=");
        sb3.append(this.f60540d);
        sb3.append(", targetWidth=");
        sb3.append(this.f60541e);
        sb3.append(", targetHeight=");
        return a.a.n(sb3, this.f60542f, ")");
    }
}
