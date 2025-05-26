package eu;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f60159a;

    public x(f30 f30Var) {
        this.f60159a = f30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f60159a, ((x) obj).f60159a);
    }

    public final int hashCode() {
        f30 f30Var = this.f60159a;
        if (f30Var == null) {
            return 0;
        }
        return f30Var.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("ProductWebPageClosedEvent(product="), this.f60159a, ")");
    }
}
