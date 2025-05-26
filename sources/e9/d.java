package e9;

import a7.m0;

/* loaded from: classes3.dex */
public final class d implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f57907a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57908b;

    public d(int i13, float f13) {
        this.f57907a = f13;
        this.f57908b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f57907a == dVar.f57907a && this.f57908b == dVar.f57908b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f57907a).hashCode() + 527) * 31) + this.f57908b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f57907a + ", svcTemporalLayerCount=" + this.f57908b;
    }
}
