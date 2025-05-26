package pb1;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements s {

    /* renamed from: a, reason: collision with root package name */
    public final Map f99474a;

    public o(Map params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f99474a = params;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f99474a, ((o) obj).f99474a);
    }

    public final int hashCode() {
        return this.f99474a.hashCode();
    }

    public final String toString() {
        return "SubmitResetPasswordWithPasscodeSideEffectRequest(params=" + this.f99474a + ")";
    }
}
