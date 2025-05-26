package df;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f54808a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f54809b;

    public n0(Uri uri, Object tag) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f54808a = uri;
        this.f54809b = tag;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return n0Var.f54808a == this.f54808a && n0Var.f54809b == this.f54809b;
    }

    public final int hashCode() {
        return this.f54809b.hashCode() + ((this.f54808a.hashCode() + 1073) * 37);
    }
}
