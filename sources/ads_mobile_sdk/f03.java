package ads_mobile_sdk;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f03 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup.LayoutParams f4997a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4998b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f4999c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f5000d;

    public f03(ViewGroup.LayoutParams layoutParams, int i13, ViewGroup parent, Context originalContext) {
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(originalContext, "originalContext");
        this.f4997a = layoutParams;
        this.f4998b = i13;
        this.f4999c = parent;
        this.f5000d = originalContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f03)) {
            return false;
        }
        f03 f03Var = (f03) obj;
        return Intrinsics.d(this.f4997a, f03Var.f4997a) && this.f4998b == f03Var.f4998b && Intrinsics.d(this.f4999c, f03Var.f4999c) && Intrinsics.d(this.f5000d, f03Var.f5000d);
    }

    public final int hashCode() {
        return this.f5000d.hashCode() + ((this.f4999c.hashCode() + kh2.n3.f(this.f4998b, this.f4997a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WebViewParentLayoutInfo(layoutParams=" + this.f4997a + ", index=" + this.f4998b + ", parent=" + this.f4999c + ", originalContext=" + this.f5000d + ")";
    }
}
