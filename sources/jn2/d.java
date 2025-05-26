package jn2;

import kotlin.jvm.internal.Intrinsics;
import pn2.b0;
import pn2.h0;

/* loaded from: classes2.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final am2.g f77128a;

    public d(dm2.b classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        this.f77128a = classDescriptor;
    }

    public final boolean equals(Object obj) {
        d dVar = obj instanceof d ? (d) obj : null;
        return Intrinsics.d(this.f77128a, dVar != null ? dVar.f77128a : null);
    }

    @Override // jn2.f
    public final b0 getType() {
        h0 j13 = this.f77128a.j();
        Intrinsics.checkNotNullExpressionValue(j13, "getDefaultType(...)");
        return j13;
    }

    public final int hashCode() {
        return this.f77128a.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Class{");
        h0 j13 = this.f77128a.j();
        Intrinsics.checkNotNullExpressionValue(j13, "getDefaultType(...)");
        sb3.append(j13);
        sb3.append('}');
        return sb3.toString();
    }
}
