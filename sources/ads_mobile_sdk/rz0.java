package ads_mobile_sdk;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rz0 {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f10867a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f10868b;

    /* renamed from: c, reason: collision with root package name */
    public final double f10869c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10870d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10871e;

    public rz0(Drawable drawable, Uri uri, double d2, int i13, int i14) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f10867a = drawable;
        this.f10868b = uri;
        this.f10869c = d2;
        this.f10870d = i13;
        this.f10871e = i14;
    }

    public final wi.p a() {
        return new wi.p(this.f10867a, this.f10868b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz0)) {
            return false;
        }
        rz0 rz0Var = (rz0) obj;
        return Intrinsics.d(this.f10867a, rz0Var.f10867a) && Intrinsics.d(this.f10868b, rz0Var.f10868b) && Double.compare(this.f10869c, rz0Var.f10869c) == 0 && this.f10870d == rz0Var.f10870d && this.f10871e == rz0Var.f10871e;
    }

    public final int hashCode() {
        Drawable drawable = this.f10867a;
        int hashCode = drawable == null ? 0 : drawable.hashCode();
        return Integer.hashCode(this.f10871e) + kh2.n3.f(this.f10870d, a.c.a(this.f10869c, (this.f10868b.hashCode() + (hashCode * 31)) * 31, 31));
    }

    public final String toString() {
        return "InternalNativeAdImage(drawable=" + this.f10867a + ", uri=" + this.f10868b + ", scale=" + this.f10869c + ", width=" + this.f10870d + ", height=" + this.f10871e + ")";
    }
}
