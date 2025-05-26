package cp1;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final c5.a f52992a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f52993b;

    /* renamed from: c, reason: collision with root package name */
    public final String f52994c;

    public c(c5.a callback, Set permissionIds, String feature) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(permissionIds, "permissionIds");
        Intrinsics.checkNotNullParameter(feature, "feature");
        this.f52992a = callback;
        this.f52993b = permissionIds;
        this.f52994c = feature;
    }

    public final String a() {
        return this.f52994c;
    }

    public final Set b() {
        return this.f52993b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f52992a, cVar.f52992a) && Intrinsics.d(this.f52993b, cVar.f52993b) && Intrinsics.d(this.f52994c, cVar.f52994c);
    }

    public final int hashCode() {
        return this.f52994c.hashCode() + ((this.f52993b.hashCode() + (this.f52992a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CurrentPermissionsRequest(callback=");
        sb3.append(this.f52992a);
        sb3.append(", permissionIds=");
        sb3.append(this.f52993b);
        sb3.append(", feature=");
        return a.a.p(sb3, this.f52994c, ")");
    }
}
