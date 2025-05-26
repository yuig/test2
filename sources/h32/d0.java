package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: b */
    public static final kp.n f66942b = new kp.n(10);

    /* renamed from: a */
    public final b3 f66943a;

    public d0(b3 b3Var) {
        this.f66943a = b3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        d0Var.getClass();
        return Intrinsics.d(null, null) && this.f66943a == d0Var.f66943a && Intrinsics.d(null, null);
    }

    public final int hashCode() {
        b3 b3Var = this.f66943a;
        return (b3Var == null ? 0 : b3Var.hashCode()) * 29791;
    }

    public final String toString() {
        return "ComponentData(stub=null, toastType=" + this.f66943a + ", nagType=null, educationType=null, digestStoryType=null)";
    }
}
