package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class eg implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final ff f132360a;

    public eg(ff ffVar) {
        this.f132360a = ffVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg) && Intrinsics.d(this.f132360a, ((eg) obj).f132360a);
    }

    public final int hashCode() {
        ff ffVar = this.f132360a;
        if (ffVar == null) {
            return 0;
        }
        return ffVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.f132360a + ")";
    }
}
