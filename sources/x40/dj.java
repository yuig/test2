package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dj implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final ji f132293a;

    public dj(ji jiVar) {
        this.f132293a = jiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dj) && Intrinsics.d(this.f132293a, ((dj) obj).f132293a);
    }

    public final int hashCode() {
        ji jiVar = this.f132293a;
        if (jiVar == null) {
            return 0;
        }
        return jiVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.f132293a + ")";
    }
}
