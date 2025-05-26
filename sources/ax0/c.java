package ax0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final zy.a f20602a;

    public c(zy.a eventParams) {
        Intrinsics.checkNotNullParameter(eventParams, "eventParams");
        this.f20602a = eventParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f20602a, ((c) obj).f20602a);
    }

    public final int hashCode() {
        return this.f20602a.hashCode();
    }

    public final String toString() {
        return "ScenePinPinalyticsSideEffect(eventParams=" + this.f20602a + ")";
    }
}
