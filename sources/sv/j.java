package sv;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j implements o {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f115303a;

    public j(f30 f30Var) {
        this.f115303a = f30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f115303a, ((j) obj).f115303a);
    }

    public final int hashCode() {
        f30 f30Var = this.f115303a;
        if (f30Var == null) {
            return 0;
        }
        return f30Var.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("CollagePinLoaded(collagePin="), this.f115303a, ")");
    }
}
