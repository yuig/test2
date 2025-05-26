package iz0;

import com.pinterest.api.model.kb0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final kb0 f73935a;

    public u(kb0 kb0Var) {
        this.f73935a = kb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f73935a, ((u) obj).f73935a);
    }

    public final int hashCode() {
        kb0 kb0Var = this.f73935a;
        if (kb0Var == null) {
            return 0;
        }
        return kb0Var.hashCode();
    }

    public final String toString() {
        return "PearQuizResultSectionDisplayState(section=" + this.f73935a + ")";
    }
}
