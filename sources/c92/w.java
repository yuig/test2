package c92;

import l82.i0;

/* loaded from: classes4.dex */
public final class w implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27031a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27032b;

    public /* synthetic */ w(int i13) {
        this((i13 & 1) != 0, false);
    }

    public static w b(w wVar, boolean z13) {
        boolean z14 = wVar.f27031a;
        wVar.getClass();
        return new w(z14, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f27031a == wVar.f27031a && this.f27032b == wVar.f27032b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27032b) + (Boolean.hashCode(this.f27031a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TargetHandshakeBottomSheetVMState(isInExperiment=");
        sb3.append(this.f27031a);
        sb3.append(", isVisible=");
        return a.a.r(sb3, this.f27032b, ")");
    }

    public w(boolean z13, boolean z14) {
        this.f27031a = z13;
        this.f27032b = z14;
    }
}
