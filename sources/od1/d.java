package od1;

import com.pinterest.api.model.g00;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final g00 f94119a;

    public d(g00 g00Var) {
        this.f94119a = g00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f94119a, ((d) obj).f94119a);
    }

    public final int hashCode() {
        g00 g00Var = this.f94119a;
        if (g00Var == null) {
            return 0;
        }
        return g00Var.hashCode();
    }

    public final String toString() {
        return "OneBarModuleSelectionChanged(module=" + this.f94119a + ")";
    }
}
