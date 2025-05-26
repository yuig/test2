package sb1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements r {

    /* renamed from: a, reason: collision with root package name */
    public final String f112263a;

    public n(String modelId) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        this.f112263a = modelId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f112263a, ((n) obj).f112263a);
    }

    public final int hashCode() {
        return this.f112263a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadUserSideEffectRequest(modelId="), this.f112263a, ")");
    }
}
