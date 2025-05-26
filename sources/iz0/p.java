package iz0;

import com.pinterest.api.model.cb0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final cb0 f73929a;

    public p(cb0 cb0Var) {
        this.f73929a = cb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        pVar.getClass();
        return Intrinsics.d(null, null) && Intrinsics.d(this.f73929a, pVar.f73929a);
    }

    public final int hashCode() {
        cb0 cb0Var = this.f73929a;
        if (cb0Var == null) {
            return 0;
        }
        return cb0Var.hashCode();
    }

    public final String toString() {
        return "PearQuizResultHeaderDisplayState(quiz=null, quizOutput=" + this.f73929a + ")";
    }
}
