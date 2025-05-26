package eu;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f60156a;

    public v(f30 f30Var) {
        this.f60156a = f30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f60156a, ((v) obj).f60156a);
    }

    public final int hashCode() {
        f30 f30Var = this.f60156a;
        if (f30Var == null) {
            return 0;
        }
        return f30Var.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("ProductImpressionEndEvent(product="), this.f60156a, ")");
    }
}
