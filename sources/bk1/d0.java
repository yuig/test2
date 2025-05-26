package bk1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f23205a;

    public d0(f30 pinToOpen) {
        Intrinsics.checkNotNullParameter(pinToOpen, "pinToOpen");
        this.f23205a = pinToOpen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.d(this.f23205a, ((d0) obj).f23205a);
    }

    public final int hashCode() {
        return this.f23205a.hashCode();
    }

    public final f30 j() {
        return this.f23205a;
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("OpenOneTapEvent(pinToOpen="), this.f23205a, ")");
    }
}
