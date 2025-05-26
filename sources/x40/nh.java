package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class nh {

    /* renamed from: a, reason: collision with root package name */
    public final mh f132900a;

    public nh(mh mhVar) {
        this.f132900a = mhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nh) && Intrinsics.d(this.f132900a, ((nh) obj).f132900a);
    }

    public final int hashCode() {
        mh mhVar = this.f132900a;
        if (mhVar == null) {
            return 0;
        }
        return mhVar.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.f132900a + ")";
    }
}
