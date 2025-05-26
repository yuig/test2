package qr1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f104978a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f104979b;

    /* renamed from: c, reason: collision with root package name */
    public final m f104980c;

    public c(wy0 user, boolean z13, m authority) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(authority, "authority");
        this.f104978a = user;
        this.f104979b = z13;
        this.f104980c = authority;
    }

    public final boolean a() {
        return this.f104979b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f104978a, cVar.f104978a) && this.f104979b == cVar.f104979b && Intrinsics.d(this.f104980c, cVar.f104980c);
    }

    public final int hashCode() {
        return this.f104980c.hashCode() + ep.b.e(this.f104979b, this.f104978a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AuthUser(user=" + this.f104978a + ", isNewUser=" + this.f104979b + ", authority=" + this.f104980c + ")";
    }
}
