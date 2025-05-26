package y31;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f136771a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f136772b;

    public a(wy0 wy0Var, boolean z13) {
        this.f136771a = wy0Var;
        this.f136772b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f136771a, aVar.f136771a) && this.f136772b == aVar.f136772b;
    }

    public final int hashCode() {
        wy0 wy0Var = this.f136771a;
        return Boolean.hashCode(this.f136772b) + ((wy0Var == null ? 0 : wy0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "AvatarState(user=" + this.f136771a + ", isOwnProfile=" + this.f136772b + ")";
    }
}
