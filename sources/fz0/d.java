package fz0;

import com.pinterest.api.model.ia0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final ia0 f63120a;

    public d(ia0 ia0Var) {
        this.f63120a = ia0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f63120a, ((d) obj).f63120a);
    }

    public final int hashCode() {
        ia0 ia0Var = this.f63120a;
        if (ia0Var == null) {
            return 0;
        }
        return ia0Var.hashCode();
    }

    public final String toString() {
        return "QuizLoaded(quiz=" + this.f63120a + ")";
    }
}
