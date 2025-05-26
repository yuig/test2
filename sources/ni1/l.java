package ni1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f90734a;

    public l(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f90734a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f90734a, ((l) obj).f90734a);
    }

    public final int hashCode() {
        return this.f90734a.hashCode();
    }

    public final f30 j() {
        return this.f90734a;
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("InlineSaveButtonTapped(pin="), this.f90734a, ")");
    }
}
