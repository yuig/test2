package zb0;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f141550a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f141551b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f141552c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f141553d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f141554e;

    public a(i0 title, i0 subtitle, i0 confirmButtonText, i0 cancelButtonText, boolean z13) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(confirmButtonText, "confirmButtonText");
        Intrinsics.checkNotNullParameter(cancelButtonText, "cancelButtonText");
        this.f141550a = title;
        this.f141551b = subtitle;
        this.f141552c = confirmButtonText;
        this.f141553d = cancelButtonText;
        this.f141554e = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f141550a, aVar.f141550a) && Intrinsics.d(this.f141551b, aVar.f141551b) && Intrinsics.d(this.f141552c, aVar.f141552c) && Intrinsics.d(this.f141553d, aVar.f141553d) && this.f141554e == aVar.f141554e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f141554e) + ep.b.d(this.f141553d, ep.b.d(this.f141552c, ep.b.d(this.f141551b, this.f141550a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AlertConfig(title=");
        sb3.append(this.f141550a);
        sb3.append(", subtitle=");
        sb3.append(this.f141551b);
        sb3.append(", confirmButtonText=");
        sb3.append(this.f141552c);
        sb3.append(", cancelButtonText=");
        sb3.append(this.f141553d);
        sb3.append(", dismissable=");
        return a.a.r(sb3, this.f141554e, ")");
    }
}
