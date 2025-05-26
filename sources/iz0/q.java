package iz0;

import com.pinterest.api.model.cb0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements t {

    /* renamed from: a, reason: collision with root package name */
    public final cb0 f73930a;

    public q(cb0 cb0Var) {
        this.f73930a = cb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f73930a, ((q) obj).f73930a);
    }

    public final int hashCode() {
        cb0 cb0Var = this.f73930a;
        if (cb0Var == null) {
            return 0;
        }
        return cb0Var.hashCode();
    }

    public final String toString() {
        return "QuizResultHeaderV2(quizOutput=" + this.f73930a + ")";
    }
}
