package bk1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f1 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f23220a;

    public f1(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f23220a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && Intrinsics.d(this.f23220a, ((f1) obj).f23220a);
    }

    public final int hashCode() {
        return this.f23220a.hashCode();
    }

    public final f30 j() {
        return this.f23220a;
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("DlAdCloseupUnPauseVideo(pin="), this.f23220a, ")");
    }
}
