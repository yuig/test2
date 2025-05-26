package iz0;

import com.pinterest.api.model.kb0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements t {

    /* renamed from: a, reason: collision with root package name */
    public final kb0 f73934a;

    public s(kb0 kb0Var) {
        this.f73934a = kb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f73934a, ((s) obj).f73934a);
    }

    public final int hashCode() {
        kb0 kb0Var = this.f73934a;
        if (kb0Var == null) {
            return 0;
        }
        return kb0Var.hashCode();
    }

    public final String toString() {
        return "QuizResultSection(section=" + this.f73934a + ")";
    }
}
