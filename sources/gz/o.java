package gz;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes3.dex */
public final class o implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f66352a;

    public o(String str) {
        this.f66352a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f66352a, ((o) obj).f66352a);
    }

    public final int hashCode() {
        String str = this.f66352a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("AnketQuestionVMState(questionId="), this.f66352a, ")");
    }
}
