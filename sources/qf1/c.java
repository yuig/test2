package qf1;

import com.pinterest.api.model.qk0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends rl2.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f103645a;

    /* renamed from: b, reason: collision with root package name */
    public final qk0 f103646b;

    public c(String id3, qk0 qk0Var) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f103645a = id3;
        this.f103646b = qk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f103645a, cVar.f103645a) && Intrinsics.d(this.f103646b, cVar.f103646b);
    }

    public final int hashCode() {
        int hashCode = this.f103645a.hashCode() * 31;
        qk0 qk0Var = this.f103646b;
        return hashCode + (qk0Var == null ? 0 : qk0Var.hashCode());
    }

    public final String toString() {
        return "ProductsListTap(id=" + this.f103645a + ", basics=" + this.f103646b + ")";
    }
}
