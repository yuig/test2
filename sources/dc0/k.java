package dc0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final List f54325a;

    /* renamed from: b, reason: collision with root package name */
    public final sl1.h f54326b;

    public k(ArrayList avatars, sl1.h size) {
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f54325a = avatars;
        this.f54326b = size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f54325a, kVar.f54325a) && this.f54326b == kVar.f54326b;
    }

    public final int hashCode() {
        return this.f54326b.hashCode() + (this.f54325a.hashCode() * 31);
    }

    public final String toString() {
        return "CollaboratorDisplayData(avatars=" + this.f54325a + ", size=" + this.f54326b + ")";
    }
}
