package b3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 extends m0 {

    /* renamed from: a, reason: collision with root package name */
    public final a3.d f21338a;

    public k0(a3.d dVar) {
        this.f21338a = dVar;
    }

    @Override // b3.m0
    public final a3.d a() {
        return this.f21338a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k0) {
            return Intrinsics.d(this.f21338a, ((k0) obj).f21338a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21338a.hashCode();
    }
}
