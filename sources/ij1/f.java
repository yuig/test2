package ij1;

import kotlin.jvm.internal.Intrinsics;
import u50.b0;

/* loaded from: classes5.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final u50.n f72348a;

    public f(b0 offsetDimen) {
        Intrinsics.checkNotNullParameter(offsetDimen, "offsetDimen");
        this.f72348a = offsetDimen;
    }

    public final u50.n a() {
        return this.f72348a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f72348a, ((f) obj).f72348a);
    }

    public final int hashCode() {
        return this.f72348a.hashCode();
    }

    public final String toString() {
        return "TextMinusOffset(offsetDimen=" + this.f72348a + ")";
    }
}
