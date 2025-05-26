package pp1;

import l82.i0;

/* loaded from: classes5.dex */
public final class v implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f100948a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f100949b;

    public /* synthetic */ v(int i13) {
        this((i13 & 1) != 0, false);
    }

    public static v b(v vVar, boolean z13) {
        boolean z14 = vVar.f100948a;
        vVar.getClass();
        return new v(z14, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f100948a == vVar.f100948a && this.f100949b == vVar.f100949b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100949b) + (Boolean.hashCode(this.f100948a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HandshakeBottomSheetVMState(isInExperiment=");
        sb3.append(this.f100948a);
        sb3.append(", isVisible=");
        return a.a.r(sb3, this.f100949b, ")");
    }

    public v(boolean z13, boolean z14) {
        this.f100948a = z13;
        this.f100949b = z14;
    }
}
