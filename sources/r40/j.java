package r40;

import kotlin.jvm.internal.Intrinsics;
import pc.i0;

/* loaded from: classes5.dex */
public final class j implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f106169a;

    public j(d dVar) {
        this.f106169a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f106169a, ((j) obj).f106169a);
    }

    public final int hashCode() {
        d dVar = this.f106169a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    public final String toString() {
        return "Data(v3DeleteAddressBookMutation=" + this.f106169a + ")";
    }
}
