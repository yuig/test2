package wc2;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import ni1.y2;

/* loaded from: classes4.dex */
public final class q implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f129147a;

    /* renamed from: b, reason: collision with root package name */
    public final int f129148b;

    /* renamed from: c, reason: collision with root package name */
    public final y2 f129149c;

    public q(String str, int i13, y2 pinRepVmState) {
        Intrinsics.checkNotNullParameter(pinRepVmState, "pinRepVmState");
        this.f129147a = str;
        this.f129148b = i13;
        this.f129149c = pinRepVmState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f129147a, qVar.f129147a) && this.f129148b == qVar.f129148b && Intrinsics.d(this.f129149c, qVar.f129149c);
    }

    public final int hashCode() {
        String str = this.f129147a;
        return this.f129149c.hashCode() + ep.b.b(this.f129148b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "WebviewPinVMState(payload=" + this.f129147a + ", adWidth=" + this.f129148b + ", pinRepVmState=" + this.f129149c + ")";
    }
}
