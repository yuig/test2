package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mf {

    /* renamed from: a, reason: collision with root package name */
    public final lf f132827a;

    public mf(lf lfVar) {
        this.f132827a = lfVar;
    }

    public final lf a() {
        return this.f132827a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mf) && Intrinsics.d(this.f132827a, ((mf) obj).f132827a);
    }

    public final int hashCode() {
        lf lfVar = this.f132827a;
        if (lfVar == null) {
            return 0;
        }
        return lfVar.hashCode();
    }

    public final String toString() {
        return "LinkDomain(officialUser=" + this.f132827a + ")";
    }
}
