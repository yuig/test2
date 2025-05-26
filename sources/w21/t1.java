package w21;

import com.pinterest.api.model.i50;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t1 implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f127821a;

    /* renamed from: b, reason: collision with root package name */
    public final i50 f127822b;

    /* renamed from: c, reason: collision with root package name */
    public final String f127823c;

    public t1(int i13, i50 answer, String errorMsg) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        this.f127821a = i13;
        this.f127822b = answer;
        this.f127823c = errorMsg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return this.f127821a == t1Var.f127821a && Intrinsics.d(this.f127822b, t1Var.f127822b) && Intrinsics.d(this.f127823c, t1Var.f127823c);
    }

    public final int hashCode() {
        return this.f127823c.hashCode() + ((this.f127822b.hashCode() + (Integer.hashCode(this.f127821a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SaveAnswer(phase=");
        sb3.append(this.f127821a);
        sb3.append(", answer=");
        sb3.append(this.f127822b);
        sb3.append(", errorMsg=");
        return a.a.p(sb3, this.f127823c, ")");
    }
}
