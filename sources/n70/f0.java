package n70;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f89609a;

    /* renamed from: b, reason: collision with root package name */
    public final String f89610b;

    public f0(f30 pin, String str) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f89609a = pin;
        this.f89610b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.f89609a, f0Var.f89609a) && Intrinsics.d(this.f89610b, f0Var.f89610b);
    }

    public final int hashCode() {
        int hashCode = this.f89609a.hashCode() * 31;
        String str = this.f89610b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SavePin(pin=" + this.f89609a + ", boardId=" + this.f89610b + ")";
    }
}
