package fd0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f61844a;

    /* renamed from: b, reason: collision with root package name */
    public final d f61845b;

    public e(String display, d mode) {
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f61844a = display;
        this.f61845b = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f61844a, eVar.f61844a) && this.f61845b == eVar.f61845b;
    }

    public final int hashCode() {
        return this.f61845b.hashCode() + (this.f61844a.hashCode() * 31);
    }

    public final String toString() {
        return "DeltaState(display=" + this.f61844a + ", mode=" + this.f61845b + ")";
    }
}
