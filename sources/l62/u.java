package l62;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u extends w {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f81691a;

    public u(Throwable e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f81691a = e13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f81691a, ((u) obj).f81691a);
    }

    public final int hashCode() {
        return this.f81691a.hashCode();
    }

    public final String toString() {
        return pk2.f.h(new StringBuilder("RendererFailed(e="), this.f81691a, ")");
    }
}
