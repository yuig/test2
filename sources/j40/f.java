package j40;

import kotlin.jvm.internal.Intrinsics;
import pc.i0;

/* loaded from: classes5.dex */
public final class f implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f74602a;

    public f(d dVar) {
        this.f74602a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f74602a, ((f) obj).f74602a);
    }

    public final int hashCode() {
        d dVar = this.f74602a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    public final String toString() {
        return "Data(v3OrientationSignalsMutation=" + this.f74602a + ")";
    }
}
