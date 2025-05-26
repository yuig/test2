package o82;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f93648a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93649b;

    /* renamed from: c, reason: collision with root package name */
    public final zy.n0 f93650c;

    public k3(zy.n0 context, String id3, String trackingParam) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(trackingParam, "trackingParam");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f93648a = id3;
        this.f93649b = trackingParam;
        this.f93650c = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return Intrinsics.d(this.f93648a, k3Var.f93648a) && Intrinsics.d(this.f93649b, k3Var.f93649b) && Intrinsics.d(this.f93650c, k3Var.f93650c);
    }

    public final int hashCode() {
        return this.f93650c.hashCode() + cb.d(this.f93649b, this.f93648a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TrackingParam(id=" + this.f93648a + ", trackingParam=" + this.f93649b + ", context=" + this.f93650c + ")";
    }
}
