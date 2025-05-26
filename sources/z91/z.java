package z91;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.k0;

/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f141413a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f141414b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f141415c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f141416d;

    public z(k0 title, k0 subtitle, k0 confirmButtonText, k0 cancelButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(confirmButtonText, "confirmButtonText");
        Intrinsics.checkNotNullParameter(cancelButtonText, "cancelButtonText");
        this.f141413a = title;
        this.f141414b = subtitle;
        this.f141415c = confirmButtonText;
        this.f141416d = cancelButtonText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.f141413a, zVar.f141413a) && Intrinsics.d(this.f141414b, zVar.f141414b) && Intrinsics.d(this.f141415c, zVar.f141415c) && Intrinsics.d(this.f141416d, zVar.f141416d);
    }

    public final int hashCode() {
        return this.f141416d.hashCode() + ep.b.d(this.f141415c, ep.b.d(this.f141414b, this.f141413a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ModalDisplayState(title=");
        sb3.append(this.f141413a);
        sb3.append(", subtitle=");
        sb3.append(this.f141414b);
        sb3.append(", confirmButtonText=");
        sb3.append(this.f141415c);
        sb3.append(", cancelButtonText=");
        return jq.b.k(sb3, this.f141416d, ")");
    }
}
