package x3;

import a.cb;
import h3.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final f f131599a;

    /* renamed from: b, reason: collision with root package name */
    public final int f131600b;

    public b(f fVar, int i13) {
        this.f131599a = fVar;
        this.f131600b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f131599a, bVar.f131599a) && this.f131600b == bVar.f131600b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f131600b) + (this.f131599a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageVectorEntry(imageVector=");
        sb3.append(this.f131599a);
        sb3.append(", configFlags=");
        return cb.l(sb3, this.f131600b, ')');
    }
}
