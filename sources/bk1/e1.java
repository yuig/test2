package bk1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e1 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f23214a;

    public e1(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f23214a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1) && Intrinsics.d(this.f23214a, ((e1) obj).f23214a);
    }

    public final int hashCode() {
        return this.f23214a.hashCode();
    }

    public final f30 j() {
        return this.f23214a;
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("DlAdCloseupPauseFirstFrameVideo(pin="), this.f23214a, ")");
    }
}
