package aa1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.k0;

/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f1642a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f1643b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f1644c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f1645d;

    public c0(k0 title, k0 subtitle, k0 confirmButtonText, k0 cancelButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(confirmButtonText, "confirmButtonText");
        Intrinsics.checkNotNullParameter(cancelButtonText, "cancelButtonText");
        this.f1642a = title;
        this.f1643b = subtitle;
        this.f1644c = confirmButtonText;
        this.f1645d = cancelButtonText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f1642a, c0Var.f1642a) && Intrinsics.d(this.f1643b, c0Var.f1643b) && Intrinsics.d(this.f1644c, c0Var.f1644c) && Intrinsics.d(this.f1645d, c0Var.f1645d);
    }

    public final int hashCode() {
        return this.f1645d.hashCode() + ep.b.d(this.f1644c, ep.b.d(this.f1643b, this.f1642a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ModalDisplayState(title=");
        sb3.append(this.f1642a);
        sb3.append(", subtitle=");
        sb3.append(this.f1643b);
        sb3.append(", confirmButtonText=");
        sb3.append(this.f1644c);
        sb3.append(", cancelButtonText=");
        return jq.b.k(sb3, this.f1645d, ")");
    }
}
